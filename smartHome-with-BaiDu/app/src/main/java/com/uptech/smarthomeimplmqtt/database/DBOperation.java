package com.uptech.smarthomeimplmqtt.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.uptech.smarthomeimplmqtt.sensorInfo.SensorInfo;
import com.uptech.smarthomeimplmqtt.utils.Const;

import java.util.ArrayList;
import java.util.List;

/**
 * **********************************************
 * @fileName:    DBOperation.java
 * **********************************************
 * @descriprion 数据库操作
 * @author       up-tech@jianghj
 * @email:       huijun2014@sina.cn
 * @time         2018-07-16 14:29
 * @version     1.0
 * 
 *************************************************/
public class DBOperation {
    private DBHelper dbOpenHelper;
    private static final String TAG = "DBOperation";
    private SQLiteDatabase mDb;
    private static DBOperation instance = null;

    public static DBOperation getInstance(Context context)
    {
        if(instance == null)
        {
            synchronized (DBHelper.class){
                if(instance == null)
                {
                    instance = new DBOperation(context);
                }
            }
        }
        return instance;
    }

    private DBOperation(Context context)
    {
        dbOpenHelper = new DBHelper(context);
    }

    public synchronized void insertData(SensorInfo info)
    {
        SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
        db.execSQL("insert into "+ Const.SENSOR_TABLE +"(_id,sensorID, data_one, data_two,data_three) values(?,?,?,?,?)",
                new Object[]{info.get_id(),info.getSensorID(),info.getData_one(), info.getData_two(),info.getData_three()});
    }

    public synchronized List<SensorInfo> queryData(String itemName,String itemvalue,int count)
    {
        List<SensorInfo> infos = new ArrayList<>();
        SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
        StringBuffer sb = new StringBuffer("select * from ");
        sb.append(Const.SENSOR_TABLE);
        sb.append(" where ");
        sb.append(itemName);
        sb.append("=");
        sb.append(itemvalue);
        sb.append(" order by ");
        sb.append(Const.ID_TEXT);
        sb.append(" desc limit ");
        sb.append(count);

//        Log.e(TAG, "queryData: " + sb.toString() );
        Cursor cursor = db.rawQuery(sb.toString(),null);
        if(cursor.moveToFirst()){
            do{
                SensorInfo info = new SensorInfo();
                info.set_id(cursor.getString(cursor.getColumnIndex(Const.ID_TEXT)));
                info.setSensorID(cursor.getInt(cursor.getColumnIndex(Const.SENSORID_TEXT)));
                info.setData_one(cursor.getString(cursor.getColumnIndex(Const.DAT_ONE_TEXT)));
                info.setData_two(cursor.getString(cursor.getColumnIndex(Const.DAT_TWO_TEXT)));
                info.setData_three(cursor.getString(cursor.getColumnIndex(Const.DAT_THREE_TEXT)));
                infos.add(info);
            }while(cursor.moveToNext());
        }
        cursor.close();
        return  infos;
    }
    public long insert(ContentValues values)
    {
        mDb = dbOpenHelper.getWritableDatabase();
        return mDb.insert(Const.SENSOR_TABLE,null,values);
    }

    public void deleteAll()
    {
        mDb = dbOpenHelper.getWritableDatabase();
        mDb.delete(Const.SENSOR_TABLE,null,null);
    }

    public void closeDB()
    {
        mDb.close();
    }
    /**
     * get count of recorders
     * @return recorder count
     */
    public long getCount(){
        mDb = dbOpenHelper.getReadableDatabase();
        Cursor cursor = mDb.rawQuery("select count(*) from "+ Const.SENSOR_TABLE, null);
        cursor.moveToFirst();
        long result = cursor.getLong(0);
        cursor.close();
        return result;
    }
}

package com.uptech.smarthomeimplmqtt.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.uptech.smarthomeimplmqtt.utils.Const;

/**
 * **********************************************
 * @fileName:    DBHelper.java
 * **********************************************
 * @descriprion DBHelper
 * @author       up-tech@jianghj
 * @email:       huijun2014@sina.cn
 * @time         2018-07-16 10:29
 * @version     1.0
 *
 *************************************************/
public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "smarthome.db";
    private static final int VERSION = 1;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try
        {
            db.execSQL("CREATE TABLE "+ Const.SENSOR_TABLE+"(" +
                    Const.ID_TEXT + " VARCHAR(15) primary key,"+
                    Const.SENSORID_TEXT  +" integer," +
                    Const.DAT_ONE_TEXT + " VARCHAR(10),"+
                    Const.DAT_TWO_TEXT + " varchar(10)," +
                    Const.DAT_THREE_TEXT + " varchar(10))");

            db.execSQL("create trigger delete_till insert on "+ Const.SENSOR_TABLE + " when (select count(*) from "+ Const.SENSOR_TABLE + ")>5000" +
                     "  begin delete from  "+ Const.SENSOR_TABLE + "  where " + Const.ID_TEXT +
                    " in ( select " + Const.ID_TEXT + " from  " + Const.SENSOR_TABLE + " order by " + Const.ID_TEXT + " limit (select count(*) - 4000 from " +
                    Const.SENSOR_TABLE+" )); end;");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Const.SENSOR_TABLE);
        onCreate(db);
    }
}

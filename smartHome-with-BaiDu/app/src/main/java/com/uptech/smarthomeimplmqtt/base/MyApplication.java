package com.uptech.smarthomeimplmqtt.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Camera;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.multidex.MultiDexApplication;
import android.util.Log;
import android.widget.Toast;

import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;
import com.uptech.smarthomeimplmqtt.utils.Const;
import com.uptech.smarthomeimplmqtt.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
/**
 * **********************************************
 * @fileName:    MyApplication.java
 * **********************************************
 * @descriprion 自定义Application
 * @author       up-tech@jianghj
 * @email:       huijun2014@sina.cn
 * @time         2018-08-02 10:56
 * @version     1.0
 * 
 *************************************************/
public class MyApplication extends MultiDexApplication{
    private Activity mactivity;
    private static MyApplication instance;
    private static Toast toast;
    private SharedPreferences settings;
    private String camera_IpStr;
    private String camera_UserName;
    private String camera_Paswd;
    private int camera_Port;
    private List<DeviceBean> deviceBeanList;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        settings = PreferenceManager.getDefaultSharedPreferences(this);
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {
                mactivity = activity;
            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

    //Application 的回掉方法
    public static final MyApplication getInstance() {
        return instance;
    }


    @Override
    public void onTerminate() {
        //程序终止的时候执行
        Log.d(TAG, "EpcApplication-----------onTerminate程序终止的时候执行");
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        //低内存的时候执行
        Log.d(TAG, "EpcApplication-----------onLowMemory低内存的时候执行");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        // 程序在内存清理的时候执行
        Log.d(TAG, "EpcApplication-----------onTrimMemory 程序在内存清理的时候执行");
        super.onTrimMemory(level);
    }

    public int[] getIntArray(int rsid)
    {
        return getResources().getIntArray(rsid);
    }

    public String[] getStringArray(int rsid)
    {
        return getResources().getStringArray(rsid);
    }

    public void showToast(String msg) {
        if(mactivity == null)
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(mactivity, msg, Toast.LENGTH_SHORT).show();
    }

    public SharedPreferences getSettings() {
        return settings;
    }
    public static void showToast(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }
    public Activity getActivity() {
        return mactivity;
    }
    public String getCamera_IpStr() {
        if(camera_IpStr == null)
            camera_IpStr = settings.getString("camera_IpStr","192.168.12.133");
        return camera_IpStr;
    }

    public void setCamera_IpStr(String camera_IpStr) {
        this.camera_IpStr = camera_IpStr;
        SharedPreferences.Editor editor =settings.edit();
        editor.putString("camera_IpStr",camera_IpStr);
        editor.commit();
    }

    public String getCamera_UserName() {
        if(camera_UserName == null)
            camera_UserName = settings.getString("camera_UserName","please input user name");
        return camera_UserName;
    }

    public void setCamera_UserName(String camera_UserName) {
        this.camera_UserName = camera_UserName;
        SharedPreferences.Editor editor =settings.edit();
        editor.putString("camera_UserName",camera_UserName);
        editor.commit();
    }

    public String getCamera_Paswd() {
        if(camera_Paswd == null || camera_Paswd.length() < 6)
            camera_Paswd = settings.getString("camera_Paswd","");
        return camera_Paswd;
    }

    public void setCamera_Paswd(String camera_Paswd) {
        SharedPreferences.Editor editor =settings.edit();
        editor.putString("camera_Paswd",camera_Paswd);
        editor.commit();
        this.camera_Paswd = camera_Paswd;
    }

    public int getCamera_Port() {
        if(camera_Port == 0)
        {
            camera_Port = settings.getInt("camera_Port",0);
        }
        return camera_Port;
    }

    public void setCamera_Port(int camera_Port) {
        SharedPreferences.Editor editor =settings.edit();
        editor.putInt("camera_Port",camera_Port);
        editor.commit();
        this.camera_Port = camera_Port;
    }

    public List<DeviceBean> getDeviceBeanList() {
        if(deviceBeanList == null)
        {
            deviceBeanList = ( List<DeviceBean> ) Utils.readObjectFromFile(getActivity(), Const.FILE_All_NAME);
            if(deviceBeanList == null)
                deviceBeanList = new ArrayList<>();
        }
        return deviceBeanList;
    }
}

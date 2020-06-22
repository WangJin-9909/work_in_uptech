package com.example.wangjin.serial;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private Context mContext;
    private App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mApp = this;
    }
}

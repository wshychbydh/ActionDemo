package com.app.demo.action;

import android.app.Application;

import com.plugin.monitor.MonitorSdk;


/**
 * Created by cool on 2018/3/26.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MonitorSdk.init(this, BuildConfig.DEBUG);
    }
}

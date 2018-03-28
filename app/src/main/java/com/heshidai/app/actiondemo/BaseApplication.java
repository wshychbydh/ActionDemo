package com.heshidai.app.actiondemo;

import android.app.Application;

import com.heshidai.plugin.monitor.MonitorSdk;
import com.heshidai.plugin.monitor.lifecycle.impl.ActivityLifecycleImpl;
import com.heshidai.plugin.monitor.util.LogUtils;

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

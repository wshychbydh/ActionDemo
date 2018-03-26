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
        //如果需要开启日志打印，默认未开启
        LogUtils.setDebugAble(true);
        MonitorSdk.init(this);
        registerActivityLifecycleCallbacks(new ActivityLifecycleImpl());
    }
}

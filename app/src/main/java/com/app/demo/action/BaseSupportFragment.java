package com.app.demo.action;


import com.plugin.monitor.lifecycle.impl.MonitorSupportFragment;

/**
 * Created by cool on 2018/3/26.
 */

public class BaseSupportFragment extends MonitorSupportFragment {
    @Override
    public boolean isNeedMonitor() {
        //如果强制返回true或false，则会强制添加（忽略Activity是否被过滤）
        return super.isNeedMonitor();
    }
}

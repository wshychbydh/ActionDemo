package com.heshidai.app.actiondemo;

import com.heshidai.plugin.monitor.lifecycle.impl.MonitorSupportFragment;


/**
 * Created by cool on 2018/3/26.
 */

public class BaseSupportFragment extends MonitorSupportFragment {
    /**
     * 标识该Fragment是否需要作为轨迹,默认为true
     */
    @Override
    public boolean isNeedMonitor() {
        return true;
    }
}

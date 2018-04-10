package com.app.demo.action;


import com.plugin.monitor.lifecycle.impl.MonitorFragment;

/**
 * Created by cool on 2018/3/26.
 */

public class BaseFragment extends MonitorFragment {

    //通常情况下，无需重写该方法，由Activity是否作为轨迹来决定
    @Override
    public boolean isNeedMonitor() {
        return super.isNeedMonitor();
    }
}

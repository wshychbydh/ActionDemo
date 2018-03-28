package com.heshidai.app.actiondemo;

import com.heshidai.plugin.monitor.MonitorSdk;

/**
 * Created by cool on 2018/3/26.
 */

public class XxLogin {

    /**
     * 为了让轨迹能够和具体的用户关联在一起，需要在用户登陆成功时调用（如果用户已登陆，请额外选择一个用于判断登陆状态的时机调用）
     */
    public void loginOrSomeElse() {
        MonitorSdk.savePhone("用户手机号");
    }
}

package com.app.demo.inject;

import android.view.View;

import com.plugin.inject.Ignore;


/**
 * Created by cool on 2018/4/2.
 */

public class InjectTest1 implements View.OnClickListener {

    public void onClick(View v, View v2) {
        //这里不会注入代码
    }

    private void onClick(String str) {
        //这里不会注入代码
    }

    private void onClick(String str, Object obj) {
        //这里不会注入代码
    }

    @Ignore
    @Override
    public void onClick(View v) {
        //这里不会注入代码
    }
}

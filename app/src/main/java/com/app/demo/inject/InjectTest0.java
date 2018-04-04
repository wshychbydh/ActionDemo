package com.app.demo.inject;

import android.view.View;

/**
 * Created by cool on 2018/3/30.
 */

public abstract class InjectTest0 implements View.OnClickListener {

    public void onClick(View value) {
        //这里不会注入代码
    }
}

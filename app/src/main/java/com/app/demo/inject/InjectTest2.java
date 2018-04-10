package com.app.demo.inject;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by cool on 2018/3/30.
 */

public class InjectTest2 extends Activity{

    private void onClick(View v) {
        //这里不会注入代码，因为该类没有实现View.onClickListener
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //build文件中设置 INJECT_TOUCH_EVENT = true 的情况下
        //这里会注入代码
        return super.onTouchEvent(event);
    }

    private void method() {
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里将被注入代码
            }
        };
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //这里将被注入代码
        }
    };
}

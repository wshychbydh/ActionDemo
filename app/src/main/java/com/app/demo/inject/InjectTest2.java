package com.app.demo.inject;

import android.view.View;

/**
 * Created by cool on 2018/3/30.
 */

public class InjectTest2 {

    private void onClick(View v) {
        //这里不会注入代码
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

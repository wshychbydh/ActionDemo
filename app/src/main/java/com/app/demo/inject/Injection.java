package com.app.demo.inject;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.plugin.monitor.util.Monitor;


/**
 * Created by cool on 2018/4/2.
 */

public class Injection {
    /**
     * 默认必须添加
     */
    public static void onClick(View v) {
        Monitor.onClick(v);
    }

    /**
     * 可选
     */
    public static void onTouch(View v, MotionEvent event) {
        Monitor.onTouch(v, event);
    }

    /**
     * 可选
     */
    public static void onTouchEvent(View v, MotionEvent event) {
        Monitor.onTouchEvent(v, event);
    }

    /**
     * 可选
     */
    public static void onTouchEvent(Activity activity, MotionEvent event) {
        Monitor.onTouchEvent(activity, event);
    }

    /**
     * 可选
     */
    public static void onLongClick(View v) {
        Monitor.onLongClick(v);
    }

    /**
     * 可选
     */
    public static void onCheckedChanged(RadioGroup group, int checkedId) {
        Monitor.onCheckedChanged(group, checkedId);
    }

    /**
     * 可选
     */
    public static void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Monitor.onCheckedChanged(buttonView, isChecked);
    }
}

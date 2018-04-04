package com.app.demo.inject;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.plugin.monitor.util.Monitor;


/**
 * Created by cool on 2018/4/2.
 */

public class Injection {

    public static void onViewClick(View v) {
        Monitor.onViewClick(v);
    }

    public static void onTouch(View v, MotionEvent event) {
        Monitor.onViewTouch(v, event);
    }

    public static void onViewLongClick(View v) {
        Monitor.onViewLongClick(v);
    }

    public static void onCheckChanged(RadioGroup group, int checkedId) {
        Monitor.onCheckChanged(group, checkedId);
    }

    public static void onCheckChanged(CompoundButton buttonView, boolean isChecked) {
        Monitor.onCheckChanged(buttonView, isChecked);
    }
}

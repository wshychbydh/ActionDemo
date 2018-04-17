package com.app.demo.action;

import android.app.Activity;

import com.plugin.monitor.annotation.Ignore;


/**
 * Created by cool on 2018/4/10.
 */

@Ignore
public class XxActivity extends Activity {
    //如果Activity被过滤，则该Activity上所有加载的页面都会被过滤(强制)
}

package com.app.demo.inject;

import android.view.View;

import com.plugin.inject.Ignore;

/**
 * Created by cool on 2018/4/8.
 */
@Ignore(false)
public class InjectTest3 extends InjectTest0 {

    @Override
    public void onClick(View value) {
        //默认这里不会注入代码,因为该类未实现View.OnClickListener，
        // 但是该类上面添加了Ignore(false)，所以此处会注入代码
        super.onClick(value);
    }
}

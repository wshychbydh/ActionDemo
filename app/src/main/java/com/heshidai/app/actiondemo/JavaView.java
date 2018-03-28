package com.heshidai.app.actiondemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.heshidai.plugin.monitor.lifecycle.impl.ViewLifecycleImpl;


/**
 * Created by cool on 2018/3/26.
 */

public class JavaView extends View {

    private ViewLifecycleImpl mImpl = new ViewLifecycleImpl();

    public JavaView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mImpl.onAttached(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mImpl.onDetached();
    }

    @Override
    protected void onVisibilityChanged(@NonNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        mImpl.onVisibilityChanged(visibility);
    }
}

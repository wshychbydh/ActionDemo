package com.heshidai.app.actiondemo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.heshidai.plugin.monitor.lifecycle.ViewLifecycle

/**
 * Created by cool on 2018/3/26.
 */
class KotlinView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), ViewLifecycle {
    override var visible: Int = View.VISIBLE

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        super.onAttached()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        super.onDetached()
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
        super<ViewLifecycle>.onVisibilityChanged(this)
    }
}
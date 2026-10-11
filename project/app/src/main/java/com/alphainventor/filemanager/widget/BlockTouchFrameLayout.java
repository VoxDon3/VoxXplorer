/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ax.u3.b;

public class BlockTouchFrameLayout
extends FrameLayout {
    public BlockTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isClickable() {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        b.g("Set click listener on block touch view");
        super.setOnClickListener(onClickListener);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;

public class NoChildScrollViewPager
extends ViewPager {
    private int l0;
    private float m0;

    public NoChildScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U(context);
    }

    void U(Context context) {
        this.l0 = ViewConfiguration.get((Context)context).getScaledTouchSlop();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f8;
        boolean bl;
        block4: {
            block5: {
                try {
                    bl = super.onInterceptTouchEvent(motionEvent);
                    f8 = motionEvent.getX();
                    int n8 = motionEvent.getActionMasked();
                    if (n8 == 0) break block4;
                    if (n8 != 2) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    return false;
                }
                if (!(Math.abs(f8 - this.m0) > (float)this.l0)) break block5;
                return true;
            }
            return bl;
        }
        this.m0 = f8;
        return bl;
    }
}


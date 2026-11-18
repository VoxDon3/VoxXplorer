package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class NoChildScrollViewPager extends ViewPager {
    private int l0;
    private float m0;

    public NoChildScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        U(context);
    }

    void U(Context context) {
        this.l0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            float x = motionEvent.getX();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.m0 = x;
                return onInterceptTouchEvent;
            }
            if (actionMasked == 2 && Math.abs(x - this.m0) > this.l0) {
                return true;
            }
            return onInterceptTouchEvent;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}

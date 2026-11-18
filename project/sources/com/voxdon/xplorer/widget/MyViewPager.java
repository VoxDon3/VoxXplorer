package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class MyViewPager extends ViewPager {
    private boolean l0;

    public MyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l0 = true;
    }

    public void U(boolean z) {
        this.l0 = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean p(KeyEvent keyEvent) {
        if (this.l0) {
            return super.p(keyEvent);
        }
        return false;
    }
}

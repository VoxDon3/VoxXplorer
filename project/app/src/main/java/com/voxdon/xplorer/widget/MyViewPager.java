/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.viewpager.widget.ViewPager;

public class MyViewPager
extends ViewPager {
    private boolean l0 = true;

    public MyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void U(boolean bl) {
        this.l0 = bl;
    }

    @Override
    public boolean p(KeyEvent keyEvent) {
        if (this.l0) {
            return super.p(keyEvent);
        }
        return false;
    }
}


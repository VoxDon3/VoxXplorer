/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ax.F6.w;
import ax.k6.c;
import ax.k6.e;
import ax.k6.m;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.b;

public final class f
extends b {
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.e);
    }

    public f(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, CircularProgressIndicator.q);
    }

    public f(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        int n10 = context.getResources().getDimensionPixelSize(ax.k6.e.q0);
        int n11 = context.getResources().getDimensionPixelSize(ax.k6.e.p0);
        attributeSet = w.i(context, attributeSet, ax.k6.m.t1, n8, n9, new int[0]);
        this.o = attributeSet.getInt(ax.k6.m.u1, 0);
        this.p = Math.max(ax.K6.c.c(context, (TypedArray)attributeSet, ax.k6.m.y1, n10), this.a * 2);
        this.q = ax.K6.c.c(context, (TypedArray)attributeSet, ax.k6.m.x1, n11);
        this.r = attributeSet.getInt(ax.k6.m.w1, 0);
        this.s = attributeSet.getBoolean(ax.k6.m.v1, true);
        attributeSet.recycle();
        this.h();
    }
}


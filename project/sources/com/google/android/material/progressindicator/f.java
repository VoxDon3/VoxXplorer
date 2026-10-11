package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ax.F6.w;
import ax.k6.C2402c;
import ax.k6.C2404e;

/* loaded from: classes3.dex */
public final class f extends b {
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.e);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.q);
    }

    public f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C2404e.q0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C2404e.p0);
        TypedArray i3 = w.i(context, attributeSet, ax.k6.m.t1, i, i2, new int[0]);
        this.o = i3.getInt(ax.k6.m.u1, 0);
        this.p = Math.max(ax.K6.c.c(context, i3, ax.k6.m.y1, dimensionPixelSize), this.a * 2);
        this.q = ax.K6.c.c(context, i3, ax.k6.m.x1, dimensionPixelSize2);
        this.r = i3.getInt(ax.k6.m.w1, 0);
        this.s = i3.getBoolean(ax.k6.m.v1, true);
        i3.recycle();
        h();
    }
}

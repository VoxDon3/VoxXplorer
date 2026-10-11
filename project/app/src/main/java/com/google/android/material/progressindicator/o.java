/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import ax.F6.w;
import ax.k6.c;
import ax.k6.m;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.progressindicator.b;

public final class o
extends b {
    public int o;
    public int p;
    boolean q;
    public int r;
    public Integer s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.q);
    }

    public o(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, LinearProgressIndicator.q);
    }

    public o(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        int[] nArray = ax.k6.m.X1;
        n9 = ax.k6.c.q;
        n8 = LinearProgressIndicator.q;
        boolean bl = false;
        attributeSet = ax.F6.w.i(context, attributeSet, nArray, n9, n8, new int[0]);
        this.o = attributeSet.getInt(ax.k6.m.Y1, 1);
        this.p = attributeSet.getInt(ax.k6.m.Z1, 0);
        this.r = Math.min(attributeSet.getDimensionPixelSize(ax.k6.m.c2, 0), this.a);
        n8 = ax.k6.m.b2;
        if (attributeSet.hasValue(n8)) {
            this.s = attributeSet.getDimensionPixelSize(n8, 0);
        }
        if ((context = attributeSet.peekValue(ax.k6.m.a2)) != null) {
            n8 = context.type;
            if (n8 == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize((int)context.data, (DisplayMetrics)attributeSet.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (n8 == 6) {
                this.u = Math.min(context.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        attributeSet.recycle();
        this.h();
        if (this.p == 1) {
            bl = true;
        }
        this.q = bl;
    }

    @Override
    public boolean g() {
        return super.g() && this.i() == this.a();
    }

    @Override
    void h() {
        super.h();
        if (this.r >= 0) {
            if (this.o == 0) {
                if (this.a() <= 0 && (!this.w || this.i() <= 0) || this.i != 0) {
                    if (this.e.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                } else {
                    throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }

    public int i() {
        if (!this.w) {
            return this.a();
        }
        if (this.v) {
            return (int)((float)this.a * this.u);
        }
        return this.t;
    }
}


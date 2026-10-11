package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import ax.F6.w;
import ax.k6.C2402c;

/* loaded from: classes3.dex */
public final class o extends b {
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
        this(context, attributeSet, C2402c.q);
    }

    @Override // com.google.android.material.progressindicator.b
    public boolean g() {
        return super.g() && i() == a();
    }

    @Override // com.google.android.material.progressindicator.b
    void h() {
        super.h();
        if (this.r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.o == 0) {
            if ((a() > 0 || (this.w && i() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public int i() {
        return !this.w ? a() : this.v ? (int) (this.a * this.u) : this.t;
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.q);
    }

    public o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray i3 = w.i(context, attributeSet, ax.k6.m.X1, C2402c.q, LinearProgressIndicator.q, new int[0]);
        this.o = i3.getInt(ax.k6.m.Y1, 1);
        this.p = i3.getInt(ax.k6.m.Z1, 0);
        this.r = Math.min(i3.getDimensionPixelSize(ax.k6.m.c2, 0), this.a);
        int i4 = ax.k6.m.b2;
        if (i3.hasValue(i4)) {
            this.s = Integer.valueOf(i3.getDimensionPixelSize(i4, 0));
        }
        TypedValue peekValue = i3.peekValue(ax.k6.m.a2);
        if (peekValue != null) {
            int i5 = peekValue.type;
            if (i5 == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, i3.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (i5 == 6) {
                this.u = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        i3.recycle();
        h();
        this.q = this.p == 1;
    }
}

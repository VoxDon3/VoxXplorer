package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import ax.F6.w;
import ax.k6.C2404e;
import ax.m.C2506a;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public abstract class b {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e = new int[0];
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;

    protected b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C2404e.r0);
        TypedArray i3 = w.i(context, attributeSet, ax.k6.m.J, i, i2, new int[0]);
        this.a = ax.K6.c.c(context, i3, ax.k6.m.T, dimensionPixelSize);
        TypedValue peekValue = i3.peekValue(ax.k6.m.S);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, i3.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i4 == 6) {
                this.c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = i3.getInt(ax.k6.m.P, 0);
        this.h = i3.getInt(ax.k6.m.K, 0);
        this.i = i3.getDimensionPixelSize(ax.k6.m.N, 0);
        int abs = Math.abs(i3.getDimensionPixelSize(ax.k6.m.W, 0));
        this.j = Math.abs(i3.getDimensionPixelSize(ax.k6.m.X, abs));
        this.k = Math.abs(i3.getDimensionPixelSize(ax.k6.m.Y, abs));
        this.l = Math.abs(i3.getDimensionPixelSize(ax.k6.m.U, 0));
        this.m = i3.getDimensionPixelSize(ax.k6.m.V, 0);
        this.n = i3.getFloat(ax.k6.m.L, 1.0f);
        e(context, i3);
        f(context, i3);
        i3.recycle();
    }

    private void e(Context context, TypedArray typedArray) {
        int i = ax.k6.m.M;
        if (!typedArray.hasValue(i)) {
            this.e = new int[]{C3555a.b(context, C2506a.z, -1)};
            return;
        }
        if (typedArray.peekValue(i).type != 1) {
            this.e = new int[]{typedArray.getColor(i, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
        this.e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void f(Context context, TypedArray typedArray) {
        int i = ax.k6.m.R;
        if (typedArray.hasValue(i)) {
            this.f = typedArray.getColor(i, -1);
            return;
        }
        this.f = this.e[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f = C3555a.a(this.f, (int) (f * 255.0f));
    }

    public int a() {
        return this.d ? (int) (this.a * this.c) : this.b;
    }

    public boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.h != 0;
    }

    public boolean d() {
        return this.g != 0;
    }

    public boolean g() {
        return this.d && this.c == 0.5f;
    }

    void h() {
        if (this.i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

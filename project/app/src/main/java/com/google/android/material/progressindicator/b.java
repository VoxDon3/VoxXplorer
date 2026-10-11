/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import ax.F6.w;
import ax.K6.c;
import ax.k6.e;
import ax.k6.m;
import ax.z6.a;

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

    protected b(Context context, AttributeSet attributeSet, int n8, int n9) {
        int n10 = context.getResources().getDimensionPixelSize(ax.k6.e.r0);
        attributeSet = w.i(context, attributeSet, ax.k6.m.J, n8, n9, new int[0]);
        this.a = ax.K6.c.c(context, (TypedArray)attributeSet, ax.k6.m.T, n10);
        TypedValue typedValue = attributeSet.peekValue(ax.k6.m.S);
        if (typedValue != null) {
            n8 = typedValue.type;
            if (n8 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize((int)typedValue.data, (DisplayMetrics)attributeSet.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (n8 == 6) {
                this.c = Math.min(typedValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = attributeSet.getInt(ax.k6.m.P, 0);
        this.h = attributeSet.getInt(ax.k6.m.K, 0);
        this.i = attributeSet.getDimensionPixelSize(ax.k6.m.N, 0);
        n8 = Math.abs(attributeSet.getDimensionPixelSize(ax.k6.m.W, 0));
        this.j = Math.abs(attributeSet.getDimensionPixelSize(ax.k6.m.X, n8));
        this.k = Math.abs(attributeSet.getDimensionPixelSize(ax.k6.m.Y, n8));
        this.l = Math.abs(attributeSet.getDimensionPixelSize(ax.k6.m.U, 0));
        this.m = attributeSet.getDimensionPixelSize(ax.k6.m.V, 0);
        this.n = attributeSet.getFloat(ax.k6.m.L, 1.0f);
        this.e(context, (TypedArray)attributeSet);
        this.f(context, (TypedArray)attributeSet);
        attributeSet.recycle();
    }

    private void e(Context object, TypedArray typedArray) {
        int n8 = ax.k6.m.M;
        if (!typedArray.hasValue(n8)) {
            this.e = new int[]{ax.z6.a.b(object, ax.m.a.z, -1)};
            return;
        }
        if (typedArray.peekValue((int)n8).type != 1) {
            this.e = new int[]{typedArray.getColor(n8, -1)};
            return;
        }
        object = object.getResources().getIntArray(typedArray.getResourceId(n8, -1));
        this.e = (int[])object;
        if (((Context)object).length != 0) {
            return;
        }
        throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
    }

    private void f(Context context, TypedArray typedArray) {
        int n8 = ax.k6.m.R;
        if (typedArray.hasValue(n8)) {
            this.f = typedArray.getColor(n8, -1);
            return;
        }
        this.f = this.e[0];
        context = context.getTheme().obtainStyledAttributes(new int[]{0x1010033});
        float f8 = context.getFloat(0, 0.2f);
        context.recycle();
        n8 = (int)(f8 * 255.0f);
        this.f = ax.z6.a.a(this.f, n8);
    }

    public int a() {
        if (this.d) {
            return (int)((float)this.a * this.c);
        }
        return this.b;
    }

    public boolean b(boolean bl) {
        return this.l > 0 && (!bl && this.k > 0 || bl && this.j > 0);
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
        if (this.i >= 0) {
            return;
        }
        throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
    }
}


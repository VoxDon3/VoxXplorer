/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import ax.F6.w;
import ax.O6.h;
import ax.Q.b;
import ax.V6.a;
import ax.k6.c;
import ax.k6.e;
import ax.k6.l;
import ax.k6.m;

public class MaterialDivider
extends View {
    private static final int f = l.D;
    private final h a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.z);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int n8) {
        int n9 = f;
        super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
        context = this.getContext();
        this.a = new h();
        attributeSet = w.i(context, attributeSet, m.L3, n8, n9, new int[0]);
        this.b = attributeSet.getDimensionPixelSize(m.P3, this.getResources().getDimensionPixelSize(ax.k6.e.F));
        this.d = attributeSet.getDimensionPixelOffset(m.O3, 0);
        this.e = attributeSet.getDimensionPixelOffset(m.N3, 0);
        this.setDividerColor(ax.K6.c.a(context, (TypedArray)attributeSet, m.M3).getDefaultColor());
        attributeSet.recycle();
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.e;
    }

    public int getDividerInsetStart() {
        return this.d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    protected void onDraw(Canvas canvas) {
        int n8;
        super.onDraw(canvas);
        int n9 = this.getLayoutDirection();
        int n10 = 1;
        if (n9 != 1) {
            n10 = 0;
        }
        n9 = n10 != 0 ? this.e : this.d;
        if (n10 != 0) {
            n8 = this.getWidth();
            n10 = this.d;
        } else {
            n8 = this.getWidth();
            n10 = this.e;
        }
        this.a.setBounds(n9, 0, n8 - n10, this.getBottom() - this.getTop());
        this.a.draw(canvas);
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        n8 = View.MeasureSpec.getMode((int)n9);
        n9 = this.getMeasuredHeight();
        if (n8 != Integer.MIN_VALUE && n8 != 0) {
            return;
        }
        int n10 = this.b;
        n8 = n9;
        if (n10 > 0) {
            n8 = n9;
            if (n9 != n10) {
                n8 = n10;
            }
        }
        this.setMeasuredDimension(this.getMeasuredWidth(), n8);
    }

    public void setDividerColor(int n8) {
        if (this.c != n8) {
            this.c = n8;
            this.a.g0(ColorStateList.valueOf((int)n8));
            this.invalidate();
        }
    }

    public void setDividerColorResource(int n8) {
        this.setDividerColor(ax.Q.b.c(this.getContext(), n8));
    }

    public void setDividerInsetEnd(int n8) {
        this.e = n8;
    }

    public void setDividerInsetEndResource(int n8) {
        this.setDividerInsetEnd(this.getContext().getResources().getDimensionPixelOffset(n8));
    }

    public void setDividerInsetStart(int n8) {
        this.d = n8;
    }

    public void setDividerInsetStartResource(int n8) {
        this.setDividerInsetStart(this.getContext().getResources().getDimensionPixelOffset(n8));
    }

    public void setDividerThickness(int n8) {
        if (this.b != n8) {
            this.b = n8;
            this.requestLayout();
        }
    }

    public void setDividerThicknessResource(int n8) {
        this.setDividerThickness(this.getContext().getResources().getDimensionPixelSize(n8));
    }
}


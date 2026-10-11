/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import ax.K6.c;
import ax.O6.h;
import ax.O6.l;
import ax.b0.g;
import ax.k6.m;

final class b {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final l f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int n8, l l8, Rect rect) {
        g.d(rect.left);
        g.d(rect.top);
        g.d(rect.right);
        g.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = n8;
        this.f = l8;
    }

    static b a(Context object, int n8) {
        boolean bl = n8 != 0;
        g.b(bl, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArray = object.obtainStyledAttributes(n8, m.n3);
        Rect rect = new Rect(typedArray.getDimensionPixelOffset(m.o3, 0), typedArray.getDimensionPixelOffset(m.q3, 0), typedArray.getDimensionPixelOffset(m.p3, 0), typedArray.getDimensionPixelOffset(m.r3, 0));
        ColorStateList colorStateList = ax.K6.c.a(object, typedArray, m.s3);
        ColorStateList colorStateList2 = ax.K6.c.a(object, typedArray, m.x3);
        ColorStateList colorStateList3 = ax.K6.c.a(object, typedArray, m.v3);
        n8 = typedArray.getDimensionPixelSize(m.w3, 0);
        object = l.b(object, typedArray.getResourceId(m.t3, 0), typedArray.getResourceId(m.u3, 0)).m();
        typedArray.recycle();
        return new b(colorStateList, colorStateList2, colorStateList3, n8, (l)object, rect);
    }

    int b() {
        return this.a.bottom;
    }

    int c() {
        return this.a.top;
    }

    void d(TextView textView) {
        this.e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        h h8 = new h();
        h h9 = new h();
        h8.setShapeAppearanceModel(this.f);
        h9.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        h8.g0(colorStateList);
        h8.n0(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        colorStateList2 = new RippleDrawable(this.b.withAlpha(30), (Drawable)h8, (Drawable)h9);
        colorStateList = this.a;
        textView.setBackground((Drawable)new InsetDrawable((Drawable)colorStateList2, colorStateList.left, colorStateList.top, colorStateList.right, colorStateList.bottom));
    }
}


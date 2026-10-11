/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import ax.k6.m;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.j;

final class c {
    final b a;
    final b b;
    final b c;
    final b d;
    final b e;
    final b f;
    final b g;
    final Paint h;

    c(Context context) {
        TypedArray typedArray = context.obtainStyledAttributes(ax.K6.b.f(context, ax.k6.c.w, j.class.getCanonicalName()), m.d3);
        this.a = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.h3, 0));
        this.g = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.f3, 0));
        this.b = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.g3, 0));
        this.c = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.i3, 0));
        ColorStateList colorStateList = ax.K6.c.a(context, typedArray, m.j3);
        this.d = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.l3, 0));
        this.e = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.k3, 0));
        this.f = com.google.android.material.datepicker.b.a(context, typedArray.getResourceId(m.m3, 0));
        context = new Paint();
        this.h = context;
        context.setColor(colorStateList.getDefaultColor());
        typedArray.recycle();
    }
}


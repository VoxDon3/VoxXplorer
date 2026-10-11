package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import ax.k6.C2402c;

/* loaded from: classes3.dex */
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ax.K6.b.f(context, C2402c.w, j.class.getCanonicalName()), ax.k6.m.d3);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.h3, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.f3, 0));
        this.b = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.g3, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.i3, 0));
        ColorStateList a = ax.K6.c.a(context, obtainStyledAttributes, ax.k6.m.j3);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.l3, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.k3, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(ax.k6.m.m3, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

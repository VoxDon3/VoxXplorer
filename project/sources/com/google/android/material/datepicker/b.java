package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import ax.b0.C1446g;

/* loaded from: classes3.dex */
final class b {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final ax.O6.l f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ax.O6.l lVar, Rect rect) {
        C1446g.d(rect.left);
        C1446g.d(rect.top);
        C1446g.d(rect.right);
        C1446g.d(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = lVar;
    }

    static b a(Context context, int i) {
        C1446g.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ax.k6.m.n3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(ax.k6.m.o3, 0), obtainStyledAttributes.getDimensionPixelOffset(ax.k6.m.q3, 0), obtainStyledAttributes.getDimensionPixelOffset(ax.k6.m.p3, 0), obtainStyledAttributes.getDimensionPixelOffset(ax.k6.m.r3, 0));
        ColorStateList a = ax.K6.c.a(context, obtainStyledAttributes, ax.k6.m.s3);
        ColorStateList a2 = ax.K6.c.a(context, obtainStyledAttributes, ax.k6.m.x3);
        ColorStateList a3 = ax.K6.c.a(context, obtainStyledAttributes, ax.k6.m.v3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ax.k6.m.w3, 0);
        ax.O6.l m = ax.O6.l.b(context, obtainStyledAttributes.getResourceId(ax.k6.m.t3, 0), obtainStyledAttributes.getResourceId(ax.k6.m.u3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    int b() {
        return this.a.bottom;
    }

    int c() {
        return this.a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        ax.O6.h hVar = new ax.O6.h();
        ax.O6.h hVar2 = new ax.O6.h();
        hVar.setShapeAppearanceModel(this.f);
        hVar2.setShapeAppearanceModel(this.f);
        if (colorStateList == null) {
            colorStateList = this.c;
        }
        hVar.g0(colorStateList);
        hVar.n0(this.e, this.d);
        if (colorStateList2 == null) {
            colorStateList2 = this.b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), hVar, hVar2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}

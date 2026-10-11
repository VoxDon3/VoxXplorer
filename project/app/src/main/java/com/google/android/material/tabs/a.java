/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;

class a
extends c {
    a() {
    }

    private static float e(float f8) {
        return (float)(1.0 - Math.cos((double)f8 * Math.PI / 2.0));
    }

    private static float f(float f8) {
        return (float)Math.sin((double)f8 * Math.PI / 2.0);
    }

    @Override
    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        float f9;
        view = c.a(tabLayout, view);
        tabLayout = c.a(tabLayout, view2);
        if (view.left < ((RectF)tabLayout).left) {
            f9 = a.e(f8);
            float f10 = a.f(f8);
            f8 = f9;
            f9 = f10;
        } else {
            float f11 = a.f(f8);
            f9 = a.e(f8);
            f8 = f11;
        }
        drawable.setBounds(ax.l6.a.c((int)view.left, (int)((RectF)tabLayout).left, f8), drawable.getBounds().top, ax.l6.a.c((int)view.right, (int)((RectF)tabLayout).right, f9), drawable.getBounds().bottom);
    }
}


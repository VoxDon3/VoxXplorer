/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ax.l6.a;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;

class b
extends c {
    b() {
    }

    @Override
    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        float f9 = f8 - 0.5f;
        float f10 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
        if (f10 >= 0) {
            view = view2;
        }
        tabLayout = c.a(tabLayout, view);
        f8 = f10 < 0 ? a.b(1.0f, 0.0f, 0.0f, 0.5f, f8) : a.b(0.0f, 1.0f, 0.5f, 1.0f, f8);
        drawable.setBounds((int)((RectF)tabLayout).left, drawable.getBounds().top, (int)((RectF)tabLayout).right, drawable.getBounds().bottom);
        drawable.setAlpha((int)(f8 * 255.0f));
    }
}


package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ax.l6.C2472a;

/* loaded from: classes3.dex */
class b extends c {
    b() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF a = c.a(tabLayout, view);
        float b = f < 0.5f ? C2472a.b(1.0f, 0.0f, 0.0f, 0.5f, f) : C2472a.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}

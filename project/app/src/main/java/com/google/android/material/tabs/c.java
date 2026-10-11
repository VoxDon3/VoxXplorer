/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ax.F6.z;
import ax.l6.a;
import com.google.android.material.tabs.TabLayout;

class c {
    c() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.E() && view instanceof TabLayout.i) {
            return c.b((TabLayout.i)view, 24);
        }
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }

    static RectF b(TabLayout.i i8, int n8) {
        int n9 = i8.getContentWidth();
        int n10 = i8.getContentHeight();
        int n11 = (int)z.c(i8.getContext(), n8);
        n8 = n9;
        if (n9 < n11) {
            n8 = n11;
        }
        n11 = (i8.getLeft() + i8.getRight()) / 2;
        n9 = (i8.getTop() + i8.getBottom()) / 2;
        int n12 = n11 / 2;
        return new RectF((float)(n11 - (n8 /= 2)), (float)(n9 - (n10 /= 2)), (float)(n8 + n11), (float)(n9 + n12));
    }

    void c(TabLayout tabLayout, View view, Drawable drawable) {
        tabLayout = c.a(tabLayout, view);
        drawable.setBounds((int)((RectF)tabLayout).left, drawable.getBounds().top, (int)((RectF)tabLayout).right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        view = c.a(tabLayout, view);
        tabLayout = c.a(tabLayout, view2);
        drawable.setBounds(a.c((int)view.left, (int)((RectF)tabLayout).left, f8), drawable.getBounds().top, a.c((int)view.right, (int)((RectF)tabLayout).right, f8), drawable.getBounds().bottom);
    }
}


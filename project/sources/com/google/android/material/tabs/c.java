package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import ax.F6.z;
import ax.l6.C2472a;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
class c {
    c() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.E() || !(view instanceof TabLayout.i)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.i) view, 24);
    }

    static RectF b(TabLayout.i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int c = (int) z.c(iVar.getContext(), i);
        if (contentWidth < c) {
            contentWidth = c;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(C2472a.c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C2472a.c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}

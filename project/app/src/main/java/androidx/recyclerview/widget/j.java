/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.d0;
import ax.h2.c;
import ax.j2.a;

class j
implements a {
    static final a a = new j();

    j() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int n8 = recyclerView.getChildCount();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < n8; ++i8) {
            float f9;
            View view2 = recyclerView.getChildAt(i8);
            if (view2 == view) {
                f9 = f8;
            } else {
                float f10 = d0.v(view2);
                f9 = f8;
                if (f10 > f8) {
                    f9 = f10;
                }
            }
            f8 = f9;
        }
        return f8;
    }

    @Override
    public void a(View view) {
        int n8 = c.a;
        Object object = view.getTag(n8);
        if (object instanceof Float) {
            d0.r0(view, ((Float)object).floatValue());
        }
        view.setTag(n8, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override
    public void b(View view) {
    }

    @Override
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f8, float f9, int n8, boolean bl) {
    }

    @Override
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f8, float f9, int n8, boolean bl) {
        if (bl && view.getTag(n8 = c.a) == null) {
            float f10 = d0.v(view);
            d0.r0(view, j.e(recyclerView, view) + 1.0f);
            view.setTag(n8, (Object)Float.valueOf(f10));
        }
        view.setTranslationX(f8);
        view.setTranslationY(f9);
    }
}


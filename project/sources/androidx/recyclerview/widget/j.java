package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import ax.c0.C1760d0;
import ax.h2.C2145c;
import ax.j2.InterfaceC2308a;

/* loaded from: classes.dex */
class j implements InterfaceC2308a {
    static final InterfaceC2308a a = new j();

    j() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float v = C1760d0.v(childAt);
                if (v > f) {
                    f = v;
                }
            }
        }
        return f;
    }

    @Override // ax.j2.InterfaceC2308a
    public void a(View view) {
        int i = C2145c.a;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C1760d0.r0(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // ax.j2.InterfaceC2308a
    public void b(View view) {
    }

    @Override // ax.j2.InterfaceC2308a
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // ax.j2.InterfaceC2308a
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C2145c.a;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C1760d0.v(view));
                C1760d0.r0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

class r {
    static int a(RecyclerView.B b8, o o8, View view, View view2, RecyclerView.p p8, boolean bl) {
        if (p8.P() != 0 && b8.b() != 0 && view != null && view2 != null) {
            if (!bl) {
                return Math.abs(p8.m0(view) - p8.m0(view2)) + 1;
            }
            int n8 = o8.d(view2);
            int n9 = o8.g(view);
            return Math.min(o8.n(), n8 - n9);
        }
        return 0;
    }

    static int b(RecyclerView.B b8, o o8, View view, View view2, RecyclerView.p p8, boolean bl, boolean bl2) {
        if (p8.P() != 0 && b8.b() != 0 && view != null && view2 != null) {
            int n8 = Math.min(p8.m0(view), p8.m0(view2));
            int n9 = Math.max(p8.m0(view), p8.m0(view2));
            n8 = bl2 ? Math.max(0, b8.b() - n9 - 1) : Math.max(0, n8);
            if (!bl) {
                return n8;
            }
            int n10 = Math.abs(o8.d(view2) - o8.g(view));
            n9 = Math.abs(p8.m0(view) - p8.m0(view2));
            float f8 = (float)n10 / (float)(n9 + 1);
            return Math.round((float)n8 * f8 + (float)(o8.m() - o8.g(view)));
        }
        return 0;
    }

    static int c(RecyclerView.B b8, o o8, View view, View view2, RecyclerView.p p8, boolean bl) {
        if (p8.P() != 0 && b8.b() != 0 && view != null && view2 != null) {
            if (!bl) {
                return b8.b();
            }
            int n8 = o8.d(view2);
            int n9 = o8.g(view);
            int n10 = Math.abs(p8.m0(view) - p8.m0(view2));
            return (int)((float)(n8 - n9) / (float)(n10 + 1) * (float)b8.b());
        }
        return 0;
    }
}


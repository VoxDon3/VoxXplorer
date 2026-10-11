package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class r {
    static int a(RecyclerView.B b, o oVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.P() == 0 || b.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.m0(view) - pVar.m0(view2)) + 1;
        }
        return Math.min(oVar.n(), oVar.d(view2) - oVar.g(view));
    }

    static int b(RecyclerView.B b, o oVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.P() == 0 || b.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (b.b() - Math.max(pVar.m0(view), pVar.m0(view2))) - 1) : Math.max(0, Math.min(pVar.m0(view), pVar.m0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(oVar.d(view2) - oVar.g(view)) / (Math.abs(pVar.m0(view) - pVar.m0(view2)) + 1))) + (oVar.m() - oVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.B b, o oVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.P() == 0 || b.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b.b();
        }
        return (int) (((oVar.d(view2) - oVar.g(view)) / (Math.abs(pVar.m0(view) - pVar.m0(view2)) + 1)) * b.b());
    }
}

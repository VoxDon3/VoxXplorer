package ax.c0;

import android.view.ViewGroup;

/* renamed from: ax.c0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770i0 {

    /* renamed from: ax.c0.i0$a */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static int a(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static boolean b(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.ViewGroup;

public final class i0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static boolean b(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }

    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean bl) {
            viewGroup.setTransitionGroup(bl);
        }
    }
}


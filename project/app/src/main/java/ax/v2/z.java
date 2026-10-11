/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

class z {
    private static boolean a = true;

    @SuppressLint(value={"NewApi"})
    private static void a(ViewGroup viewGroup, boolean bl) {
        if (a) {
            try {
                ax.v2.z$a.b(viewGroup, bl);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean bl) {
        if (Build.VERSION.SDK_INT >= 29) {
            ax.v2.z$a.b(viewGroup, bl);
            return;
        }
        z.a(viewGroup, bl);
    }

    static class a {
        static int a(ViewGroup viewGroup, int n8) {
            return viewGroup.getChildDrawingOrder(n8);
        }

        static void b(ViewGroup viewGroup, boolean bl) {
            viewGroup.suppressLayout(bl);
        }
    }
}


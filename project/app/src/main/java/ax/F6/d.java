/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import ax.c0.r0;
import ax.z6.a;

public class d {
    public static void a(Window window, boolean bl, Integer n8, Integer n9) {
        Integer n10;
        Integer n11;
        int n12;
        int n13;
        block7: {
            block6: {
                n13 = 0;
                n12 = n8 != null && n8 != 0 ? 0 : 1;
                if (n9 == null || n9 == 0) {
                    n13 = 1;
                }
                if (n12 != 0) break block6;
                n11 = n8;
                n10 = n9;
                if (n13 == 0) break block7;
            }
            int n14 = a.b(window.getContext(), 0x1010031, -16777216);
            if (n12 != 0) {
                n8 = n14;
            }
            n11 = n8;
            n10 = n9;
            if (n13 != 0) {
                n10 = n14;
                n11 = n8;
            }
        }
        r0.b(window, bl ^ true);
        n12 = d.c(window.getContext(), bl);
        n13 = d.b(window.getContext(), bl);
        window.setStatusBarColor(n12);
        window.setNavigationBarColor(n13);
        d.f(window, d.d(n12, a.i(n11)));
        d.e(window, d.d(n13, a.i(n10)));
    }

    private static int b(Context context, boolean bl) {
        if (bl && Build.VERSION.SDK_INT < 27) {
            return ax.T.a.k(a.b(context, 16843858, -16777216), 128);
        }
        if (bl) {
            return 0;
        }
        return a.b(context, 16843858, -16777216);
    }

    private static int c(Context context, boolean bl) {
        if (bl && Build.VERSION.SDK_INT < 23) {
            return ax.T.a.k(a.b(context, 16843857, -16777216), 128);
        }
        if (bl) {
            return 0;
        }
        return a.b(context, 16843857, -16777216);
    }

    private static boolean d(int n8, boolean bl) {
        return a.i(n8) || n8 == 0 && bl;
        {
        }
    }

    public static void e(Window window, boolean bl) {
        r0.a(window, window.getDecorView()).c(bl);
    }

    public static void f(Window window, boolean bl) {
        r0.a(window, window.getDecorView()).d(bl);
    }
}


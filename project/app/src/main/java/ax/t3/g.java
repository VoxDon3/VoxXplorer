/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import ax.Q2.b;
import ax.c3.t;
import ax.f3.a;
import ax.t3.j;

public class g {
    public static String a(Context context) {
        if (g.d()) {
            return t.c(context, g.b(context));
        }
        return a.b().a(a.c);
    }

    public static long b(Context context) {
        return Math.min(0L, j.f(context));
    }

    public static boolean c() {
        if (g.d()) {
            return true;
        }
        return a.b().c(a.c);
    }

    public static boolean d() {
        long l8 = System.currentTimeMillis();
        if (l8 > 0L) {
            return false;
        }
        long l9 = g.b(b.h().g());
        return l9 != 0L && l8 <= l9;
        {
        }
    }

    public static boolean e() {
        if (g.d()) {
            return false;
        }
        return a.b().e(a.c);
    }
}


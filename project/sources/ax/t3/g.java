package ax.t3;

import android.content.Context;
import ax.c3.C1831t;
import ax.f3.C2044a;

/* loaded from: classes.dex */
public class g {
    public static String a(Context context) {
        return d() ? C1831t.c(context, b(context)) : C2044a.b().a(C2044a.c);
    }

    public static long b(Context context) {
        return Math.min(0L, j.f(context));
    }

    public static boolean c() {
        if (d()) {
            return true;
        }
        return C2044a.b().c(C2044a.c);
    }

    public static boolean d() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            return false;
        }
        long b = b(ax.Q2.b.h().g());
        return b != 0 && currentTimeMillis <= b;
    }

    public static boolean e() {
        if (d()) {
            return false;
        }
        return C2044a.b().e(C2044a.c);
    }
}

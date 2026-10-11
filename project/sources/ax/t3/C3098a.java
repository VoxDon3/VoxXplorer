package ax.t3;

import android.content.Context;
import java.util.Random;

/* renamed from: ax.t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3098a {
    private static Boolean a;

    public static long a() {
        if (g.c()) {
            return Long.MAX_VALUE;
        }
        return c.n().g();
    }

    public static int b() {
        if (g.c() || c()) {
            return 0;
        }
        return c.n().s();
    }

    public static boolean c() {
        return k.p() <= System.currentTimeMillis() && System.currentTimeMillis() - k.p() <= 82800000;
    }

    public static boolean d() {
        int e = c.n().e();
        if (e == 2) {
            return false;
        }
        if (e == 3) {
            return new Random().nextInt(100) < c.n().d();
        }
        return true;
    }

    public static boolean e() {
        int k = c.n().k();
        if (k == 2) {
            return false;
        }
        if (k == 3) {
            return new Random().nextBoolean();
        }
        return true;
    }

    public static void f(Context context) {
        k.G();
    }

    public static boolean g() {
        if (g.c() || c()) {
            return false;
        }
        return c.n().u();
    }

    public static boolean h(Context context) {
        if (!ax.S2.a.c() || g.c() || c() || context == null) {
            return false;
        }
        return c.n().v();
    }

    public static boolean i() {
        if (g.c()) {
            return false;
        }
        c();
        return false;
    }

    public static boolean j() {
        if (a == null) {
            a = Boolean.valueOf(c.n().w());
        }
        return a.booleanValue();
    }

    public static boolean k(Context context) {
        if (g.c() || c() || context == null || !j.e(context)) {
            return false;
        }
        return c.n().y();
    }

    public static boolean l() {
        if (g.c() || c()) {
            return false;
        }
        return c.n().A();
    }
}

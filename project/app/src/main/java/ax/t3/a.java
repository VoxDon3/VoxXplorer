/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import ax.t3.c;
import ax.t3.g;
import ax.t3.j;
import ax.t3.k;
import java.util.Random;

public class a {
    private static Boolean a;

    public static long a() {
        if (g.c()) {
            return Long.MAX_VALUE;
        }
        return c.n().g();
    }

    public static int b() {
        if (g.c()) {
            return 0;
        }
        if (ax.t3.a.c()) {
            return 0;
        }
        return c.n().s();
    }

    public static boolean c() {
        if (k.p() > System.currentTimeMillis()) {
            return false;
        }
        return System.currentTimeMillis() - k.p() <= 82800000L;
    }

    public static boolean d() {
        int n8 = c.n().e();
        if (n8 == 2) {
            return false;
        }
        if (n8 == 3) {
            n8 = c.n().d();
            return new Random().nextInt(100) < n8;
        }
        return true;
    }

    public static boolean e() {
        int n8 = c.n().k();
        if (n8 == 2) {
            return false;
        }
        if (n8 == 3) {
            return new Random().nextBoolean();
        }
        return true;
    }

    public static void f(Context context) {
        k.G();
    }

    public static boolean g() {
        if (g.c()) {
            return false;
        }
        if (ax.t3.a.c()) {
            return false;
        }
        return c.n().u();
    }

    public static boolean h(Context context) {
        if (!ax.S2.a.c()) {
            return false;
        }
        if (g.c()) {
            return false;
        }
        if (ax.t3.a.c()) {
            return false;
        }
        if (context == null) {
            return false;
        }
        return c.n().v();
    }

    public static boolean i() {
        if (g.c()) {
            return false;
        }
        ax.t3.a.c();
        return false;
    }

    public static boolean j() {
        if (a == null) {
            a = c.n().w();
        }
        return a;
    }

    public static boolean k(Context context) {
        if (g.c()) {
            return false;
        }
        if (ax.t3.a.c()) {
            return false;
        }
        if (context == null) {
            return false;
        }
        if (!j.e(context)) {
            return false;
        }
        return c.n().y();
    }

    public static boolean l() {
        if (g.c()) {
            return false;
        }
        if (ax.t3.a.c()) {
            return false;
        }
        return c.n().A();
    }
}


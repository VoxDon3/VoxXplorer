package ax.u3;

import okhttp3.HttpUrl;

/* renamed from: ax.u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3184b {
    public static void a(boolean z) {
        if (z) {
            f();
        }
    }

    public static void b(Object obj) {
        c(obj != null);
    }

    public static void c(boolean z) {
        if (z) {
            return;
        }
        f();
    }

    public static void f() {
        g(null);
    }

    public static void g(String str) {
        String str2 = str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        ax.Ha.c.h().f().b("ASSERT NOT REACHABLE").j().g("msg:" + str2).h();
        ax.Q2.d.b(new Exception("ASSERT NOT REACHABLE :" + str));
    }

    public static void h(String str, Throwable th) {
        String str2 = str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        ax.Ha.c.h().f().b("ASSERT NOT REACHABLE THROW").l(th).g("msg:" + str2).h();
        ax.Q2.d.b(new Exception("ASSERT NOT REACHABLE THROW :" + str + ":" + th.getMessage(), th));
    }

    public static void d(boolean z) {
    }

    public static void e(String str) {
    }
}

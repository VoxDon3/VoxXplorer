/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import ax.Ha.c;
import ax.Q2.d;

public class b {
    public static void a(boolean bl) {
        if (bl) {
            b.f();
        }
    }

    public static void b(Object object) {
        boolean bl = object != null;
        b.c(bl);
    }

    public static void c(boolean bl) {
        if (!bl) {
            b.f();
        }
    }

    public static void d(boolean bl) {
    }

    public static void e(String string) {
    }

    public static void f() {
        b.g(null);
    }

    public static void g(String string) {
        CharSequence charSequence = string != null ? string : "";
        ax.Ha.b b8 = c.h().f().b("ASSERT NOT REACHABLE").j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("msg:");
        stringBuilder.append((String)charSequence);
        b8.g(stringBuilder.toString()).h();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ASSERT NOT REACHABLE :");
        ((StringBuilder)charSequence).append(string);
        d.b(new Exception(((StringBuilder)charSequence).toString()));
    }

    public static void h(String string, Throwable throwable) {
        CharSequence charSequence = string != null ? string : "";
        ax.Ha.b b8 = c.h().f().b("ASSERT NOT REACHABLE THROW").l(throwable);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("msg:");
        stringBuilder.append((String)charSequence);
        b8.g(stringBuilder.toString()).h();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("ASSERT NOT REACHABLE THROW :");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(":");
        ((StringBuilder)charSequence).append(throwable.getMessage());
        d.b(new Exception(((StringBuilder)charSequence).toString(), throwable));
    }
}


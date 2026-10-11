/*
 * Decompiled with CFR 0.152.
 */
package ax.d8;

import ax.d8.a;
import ax.d8.c;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    public static d a = d.a().a();

    public static a a() {
        return new a.b().h(0L).g(c.a.q).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        return this.g() == c.a.f0;
    }

    public boolean j() {
        return this.g() == c.a.c0 || this.g() == c.a.q;
        {
        }
    }

    public boolean k() {
        return this.g() == c.a.e0;
    }

    public boolean l() {
        return this.g() == c.a.d0;
    }

    public boolean m() {
        return this.g() == c.a.q;
    }

    public abstract a n();

    public d o(String string, long l8, long l9) {
        return this.n().b(string).c(l8).h(l9).a();
    }

    public d p() {
        return this.n().b(null).a();
    }

    public d q(String string) {
        return this.n().e(string).g(c.a.f0).a();
    }

    public d r() {
        return this.n().g(c.a.c0).a();
    }

    public d s(String string, String string2, long l8, String string3, long l9) {
        return this.n().d(string).g(c.a.e0).b(string3).f(string2).c(l9).h(l8).a();
    }

    public d t(String string) {
        return this.n().d(string).g(c.a.d0).a();
    }

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(String var1);

        public abstract a c(long var1);

        public abstract a d(String var1);

        public abstract a e(String var1);

        public abstract a f(String var1);

        public abstract a g(c.a var1);

        public abstract a h(long var1);
    }
}


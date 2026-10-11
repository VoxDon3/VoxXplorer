/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.j;
import ax.o5.p;
import ax.o5.q;
import ax.o5.w;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class t {
    private static a a() {
        return new j.b();
    }

    public static a k(String string) {
        return t.a().i(string);
    }

    public static a l(byte[] byArray) {
        return t.a().h(byArray);
    }

    public abstract p b();

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract q f();

    public abstract w g();

    public abstract byte[] h();

    public abstract String i();

    public abstract long j();

    @AutoValue.Builder
    public static abstract class a {
        public abstract t a();

        public abstract a b(p var1);

        public abstract a c(Integer var1);

        public abstract a d(long var1);

        public abstract a e(long var1);

        public abstract a f(q var1);

        public abstract a g(w var1);

        abstract a h(byte[] var1);

        abstract a i(String var1);

        public abstract a j(long var1);
    }
}


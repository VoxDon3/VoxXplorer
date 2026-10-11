/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.b;
import ax.n5.c;
import ax.n5.g;
import ax.p5.c;
import ax.p5.p;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class o {
    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract b b();

    abstract c<?> c();

    public byte[] d() {
        return this.e().apply(this.c().c());
    }

    abstract g<?, byte[]> e();

    public abstract p f();

    public abstract String g();

    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        abstract a b(b var1);

        abstract a c(c<?> var1);

        abstract a d(g<?, byte[]> var1);

        public abstract a e(p var1);

        public abstract a f(String var1);
    }
}


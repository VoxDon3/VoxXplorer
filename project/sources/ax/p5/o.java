package ax.p5;

import ax.n5.AbstractC2581c;
import ax.n5.C2580b;
import ax.p5.c;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
abstract class o {

    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        abstract a b(C2580b c2580b);

        abstract a c(AbstractC2581c<?> abstractC2581c);

        abstract a d(ax.n5.g<?, byte[]> gVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract C2580b b();

    abstract AbstractC2581c<?> c();

    public byte[] d() {
        return e().apply(c().c());
    }

    abstract ax.n5.g<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}

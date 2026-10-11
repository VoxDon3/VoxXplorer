/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.p5.b;
import ax.p5.h;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class i {
    public static a a() {
        return new b.b().f(new HashMap<String, String>());
    }

    public final String b(String string) {
        String string2;
        string = string2 = this.c().get(string);
        if (string2 == null) {
            string = "";
        }
        return string;
    }

    protected abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public final int i(String string) {
        string = this.c().get(string);
        if (string == null) {
            return 0;
        }
        return Integer.valueOf(string);
    }

    public final long j(String string) {
        string = this.c().get(string);
        if (string == null) {
            return 0L;
        }
        return Long.valueOf(string);
    }

    public final Map<String, String> k() {
        return java.util.DesugarCollections.unmodifiableMap(this.c());
    }

    public abstract Integer l();

    public abstract String m();

    public abstract String n();

    public abstract long o();

    public a p() {
        return new b.b().n(this.n()).g(this.d()).l(this.l()).m(this.m()).j(this.g()).k(this.h()).h(this.e()).i(this.f()).o(this.o()).f(new HashMap<String, String>(this.c()));
    }

    @AutoValue.Builder
    public static abstract class a {
        public final a a(String string, int n8) {
            this.e().put(string, String.valueOf(n8));
            return this;
        }

        public final a b(String string, long l8) {
            this.e().put(string, String.valueOf(l8));
            return this;
        }

        public final a c(String string, String string2) {
            this.e().put(string, string2);
            return this;
        }

        public abstract i d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> var1);

        public abstract a g(Integer var1);

        public abstract a h(h var1);

        public abstract a i(long var1);

        public abstract a j(byte[] var1);

        public abstract a k(byte[] var1);

        public abstract a l(Integer var1);

        public abstract a m(String var1);

        public abstract a n(String var1);

        public abstract a o(long var1);
    }
}


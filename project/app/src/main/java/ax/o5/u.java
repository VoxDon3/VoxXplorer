/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.k;
import ax.o5.o;
import ax.o5.t;
import ax.o5.x;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class u {
    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List<t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();

    @AutoValue.Builder
    public static abstract class a {
        public abstract u a();

        public abstract a b(o var1);

        public abstract a c(List<t> var1);

        abstract a d(Integer var1);

        abstract a e(String var1);

        public abstract a f(x var1);

        public abstract a g(long var1);

        public abstract a h(long var1);

        public a i(int n8) {
            return this.d(n8);
        }

        public a j(String string) {
            return this.e(string);
        }
    }
}


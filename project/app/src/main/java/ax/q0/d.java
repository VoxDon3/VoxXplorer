/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Gb.l;
import ax.tb.F;
import java.util.Map;

public abstract class d {
    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> var1);

    public final ax.q0.a c() {
        return new ax.q0.a(F.r(this.a()), false);
    }

    public final d d() {
        return new ax.q0.a(F.r(this.a()), true);
    }

    public static final class a<T> {
        private final String a;

        public a(String string) {
            l.f(string, "name");
            this.a = string;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object instanceof a) {
                return l.a(this.a, ((a)object).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    public static final class b<T> {
        private final a<T> a;
        private final T b;

        public final a<T> a() {
            return this.a;
        }

        public final T b() {
            return this.b;
        }
    }
}


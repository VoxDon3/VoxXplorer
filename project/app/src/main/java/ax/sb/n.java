/*
 * Decompiled with CFR 0.152.
 */
package ax.sb;

import ax.Gb.g;
import ax.Gb.l;
import java.io.Serializable;

public final class n<T>
implements Serializable {
    public static final a q = new a(null);

    public static <T> Object a(Object object) {
        return object;
    }

    public static final Throwable b(Object object) {
        if (object instanceof b) {
            return ((b)object).q;
        }
        return null;
    }

    public static final boolean c(Object object) {
        return object instanceof b;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements Serializable {
        public final Throwable q;

        public b(Throwable throwable) {
            l.f(throwable, "exception");
            this.q = throwable;
        }

        public boolean equals(Object object) {
            return object instanceof b && l.a(this.q, ((b)object).q);
        }

        public int hashCode() {
            return this.q.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failure(");
            stringBuilder.append(this.q);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}


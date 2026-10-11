/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.p4.s;
import ax.v4.c;
import java.io.IOException;

final class b<T> {
    private final T a;
    private s b;

    public b(T t8, s s8) {
        if (t8 != null) {
            this.a = t8;
            this.b = s8;
            return;
        }
        throw new NullPointerException("error");
    }

    public T a() {
        return this.a;
    }

    public s b() {
        return this.b;
    }

    static final class a<T>
    extends c<b<T>> {
        private c<T> b;

        public a(c<T> c8) {
            this.b = c8;
        }

        public b<T> p(j j8) throws IOException, i {
            c.h(j8);
            Object t8 = null;
            Object object = null;
            while (j8.j() == m.p0) {
                String string = j8.g();
                j8.H();
                if ("error".equals(string)) {
                    t8 = this.b.a(j8);
                    continue;
                }
                if ("user_message".equals(string)) {
                    object = s.c.a(j8);
                    continue;
                }
                c.o(j8);
            }
            if (t8 != null) {
                object = new b<Object>(t8, (s)object);
                c.e(j8);
                return object;
            }
            throw new i(j8, "Required field \"error\" missing.");
        }

        public void q(b<T> b8, g g8) throws IOException, f {
            throw new UnsupportedOperationException("Error wrapper serialization not supported.");
        }
    }
}


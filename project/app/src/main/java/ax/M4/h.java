/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.M4.g;
import ax.T4.f;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class h {
    protected final long a;
    protected final g b;

    public h(long l8, g g8) {
        this.a = l8;
        if (g8 != null) {
            this.b = g8;
            return;
        }
        throw new IllegalArgumentException("Required value for 'allocation' is null");
    }

    public g a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return ax.M4.h$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Object object2 = (h)object;
            if (this.a == ((h)object2).a && ((object = this.b) == (object2 = ((h)object2).b) || ((g)object).equals(object2))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.M4.h$a.b.j(this, false);
    }

    static class a
    extends e<h> {
        public static final a b = new a();

        a() {
        }

        public h u(j j8, boolean bl) throws IOException, i {
            Object object;
            Comparable<StringBuilder> comparable = null;
            if (!bl) {
                c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = null;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("used".equals(string)) {
                        comparable = d.i().a(j8);
                        continue;
                    }
                    if ("allocation".equals(string)) {
                        object = g.b.b.s(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (comparable != null) {
                    if (object != null) {
                        object = new h((Long)comparable, (g)object);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(object, ((h)object).c());
                        return object;
                    }
                    throw new i(j8, "Required field \"allocation\" missing.");
                }
                throw new i(j8, "Required field \"used\" missing.");
            }
            comparable = new StringBuilder();
            comparable.append("No subtype found that matches tag: \"");
            comparable.append((String)object);
            comparable.append("\"");
            throw new i(j8, comparable.toString());
        }

        public void v(h h8, ax.T4.g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("used");
            d.i().k(h8.a, g8);
            g8.o("allocation");
            g.b.b.t(h8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


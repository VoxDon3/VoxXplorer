/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class c0 {
    protected final boolean a;

    public c0() {
        this(false);
    }

    public c0(boolean bl) {
        this.a = bl;
    }

    public String a() {
        return ax.G4.c0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (c0)object;
            if (this.a == ((c0)object).a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return ax.G4.c0$a.b.j(this, false);
    }

    static class a
    extends e<c0> {
        public static final a b = new a();

        a() {
        }

        public c0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = Boolean.FALSE;
                while (j8.j() == m.p0) {
                    String string = j8.g();
                    j8.H();
                    if ("include_highlights".equals(string)) {
                        object = d.a().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                object = new c0((Boolean)object);
                if (!bl) {
                    c.e(j8);
                }
                ax.v4.b.a(object, ((c0)object).a());
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(c0 c02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("include_highlights");
            d.a().k(c02.a, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


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

public class D {
    protected final double a;
    protected final double b;

    public D(double d8, double d9) {
        this.a = d8;
        this.b = d9;
    }

    public String a() {
        return ax.G4.D$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (D)object;
            if (this.a == ((D)object).a && this.b == ((D)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.D$a.b.j(this, false);
    }

    static class a
    extends e<D> {
        public static final a b = new a();

        a() {
        }

        public D u(j j8, boolean bl) throws IOException, i {
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
                    if ("latitude".equals(string)) {
                        comparable = d.b().a(j8);
                        continue;
                    }
                    if ("longitude".equals(string)) {
                        object = d.b().a(j8);
                        continue;
                    }
                    c.o(j8);
                }
                if (comparable != null) {
                    if (object != null) {
                        object = new D((Double)comparable, (Double)object);
                        if (!bl) {
                            c.e(j8);
                        }
                        ax.v4.b.a(object, ((D)object).a());
                        return object;
                    }
                    throw new i(j8, "Required field \"longitude\" missing.");
                }
                throw new i(j8, "Required field \"latitude\" missing.");
            }
            comparable = new StringBuilder();
            comparable.append("No subtype found that matches tag: \"");
            comparable.append((String)object);
            comparable.append("\"");
            throw new i(j8, comparable.toString());
        }

        public void v(D d8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("latitude");
            d.b().k(d8.a, g8);
            g8.o("longitude");
            d.b().k(d8.b, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


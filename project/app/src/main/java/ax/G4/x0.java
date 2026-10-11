/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.B0;
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

class x0 {
    protected final B0 a;
    protected final boolean b;
    protected final String c;

    public x0(B0 b02) {
        this(b02, false, null);
    }

    public x0(B0 b02, boolean bl, String string) {
        if (b02 != null) {
            this.a = b02;
            this.b = bl;
            if (string != null) {
                if (string.length() >= 64) {
                    if (string.length() > 64) {
                        throw new IllegalArgumentException("String 'contentHash' is longer than 64");
                    }
                } else {
                    throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
                }
            }
            this.c = string;
            return;
        }
        throw new IllegalArgumentException("Required value for 'cursor' is null");
    }

    public String a() {
        return ax.G4.x0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (x0)object;
            B0 b02 = this.a;
            Object object2 = ((x0)object).a;
            if ((b02 == object2 || b02.equals(object2)) && this.b == ((x0)object).b && ((object2 = this.c) == (object = ((x0)object).c) || object2 != null && ((String)object2).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.x0$a.b.j(this, false);
    }

    static class a
    extends e<x0> {
        public static final a b = new a();

        a() {
        }

        public x0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            B0 b02 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                object = Boolean.FALSE;
                String string = null;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("cursor".equals(string2)) {
                        b02 = (B0)B0.a.b.a(j8);
                        continue;
                    }
                    if ("close".equals(string2)) {
                        object = d.a().a(j8);
                        continue;
                    }
                    if ("content_hash".equals(string2)) {
                        string = d.d(d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (b02 != null) {
                    object = new x0(b02, (Boolean)object, string);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((x0)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"cursor\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(x0 x02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("cursor");
            B0.a.b.k(x02.a, g8);
            g8.o("close");
            d.a().k(x02.b, g8);
            if (x02.c != null) {
                g8.o("content_hash");
                d.d(d.f()).k(x02.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


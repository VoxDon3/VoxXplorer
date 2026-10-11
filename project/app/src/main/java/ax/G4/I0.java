/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.N0;
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

class I0 {
    protected final boolean a;
    protected final N0 b;
    protected final String c;

    public I0() {
        this(false, null, null);
    }

    public I0(boolean bl, N0 n02, String string) {
        this.a = bl;
        this.b = n02;
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
    }

    public String a() {
        return ax.G4.I0$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Object object2;
            N0 n02;
            object = (I0)object;
            if (this.a == ((I0)object).a && ((n02 = this.b) == (object2 = ((I0)object).b) || n02 != null && ((Object)((Object)n02)).equals(object2)) && ((object2 = this.c) == (object = ((I0)object).c) || object2 != null && ((String)object2).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return ax.G4.I0$a.b.j(this, false);
    }

    static class a
    extends e<I0> {
        public static final a b = new a();

        a() {
        }

        public I0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            N0 n02 = null;
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
                    if ("close".equals(string2)) {
                        object = d.a().a(j8);
                        continue;
                    }
                    if ("session_type".equals(string2)) {
                        n02 = d.d(N0.b.b).a(j8);
                        continue;
                    }
                    if ("content_hash".equals(string2)) {
                        string = d.d(d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                object = new I0((Boolean)object, n02, string);
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((I0)object).a());
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(I0 i02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("close");
            d.a().k(i02.a, g8);
            if (i02.b != null) {
                g8.o("session_type");
                d.d(N0.b.b).k(i02.b, g8);
            }
            if (i02.c != null) {
                g8.o("content_hash");
                d.d(d.f()).k(i02.c, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


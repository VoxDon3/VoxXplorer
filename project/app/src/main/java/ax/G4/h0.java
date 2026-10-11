/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.c0;
import ax.G4.f0;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

class h0 {
    protected final String a;
    protected final f0 b;
    protected final c0 c;
    protected final Boolean d;

    public h0(String string, f0 f02, c0 c02, Boolean bl) {
        if (string != null) {
            if (string.length() <= 1000) {
                this.a = string;
                this.b = f02;
                this.c = c02;
                this.d = bl;
                return;
            }
            throw new IllegalArgumentException("String 'query' is longer than 1000");
        }
        throw new IllegalArgumentException("Required value for 'query' is null");
    }

    public static a a(String string) {
        return new a(string);
    }

    public String b() {
        return ax.G4.h0$b.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (h0)object;
            Object object2 = this.a;
            Object object3 = ((h0)object).a;
            return (object2 == object3 || ((String)object2).equals(object3)) && ((object3 = this.b) == (object2 = ((h0)object).b) || object3 != null && ((f0)object3).equals(object2)) && ((object3 = this.c) == (object2 = ((h0)object).c) || object3 != null && ((c0)object3).equals(object2)) && ((object2 = this.d) == (object = ((h0)object).d) || object2 != null && ((Boolean)object2).equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return ax.G4.h0$b.b.j(this, false);
    }

    public static class a {
        protected final String a;
        protected f0 b;
        protected c0 c;
        protected Boolean d;

        protected a(String string) {
            if (string != null) {
                if (string.length() <= 1000) {
                    this.a = string;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    return;
                }
                throw new IllegalArgumentException("String 'query' is longer than 1000");
            }
            throw new IllegalArgumentException("Required value for 'query' is null");
        }

        public h0 a() {
            return new h0(this.a, this.b, this.c, this.d);
        }

        public a b(f0 f02) {
            this.b = f02;
            return this;
        }
    }

    static class b
    extends e<h0> {
        public static final b b = new b();

        b() {
        }

        public h0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            String string = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                f0 f02 = null;
                c0 c02 = null;
                object = c02;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("query".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("options".equals(string2)) {
                        f02 = ax.v4.d.e(f0.b.b).a(j8);
                        continue;
                    }
                    if ("match_field_options".equals(string2)) {
                        c02 = ax.v4.d.e(c0.a.b).a(j8);
                        continue;
                    }
                    if ("include_highlights".equals(string2)) {
                        object = ax.v4.d.d(ax.v4.d.a()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new h0(string, f02, c02, (Boolean)object);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((h0)object).b());
                    return object;
                }
                throw new i(j8, "Required field \"query\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(h0 h02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("query");
            ax.v4.d.f().k(h02.a, g8);
            if (h02.b != null) {
                g8.o("options");
                ax.v4.d.e(f0.b.b).k(h02.b, g8);
            }
            if (h02.c != null) {
                g8.o("match_field_options");
                ax.v4.d.e(c0.a.b).k(h02.c, g8);
            }
            if (h02.d != null) {
                g8.o("include_highlights");
                ax.v4.d.d(ax.v4.d.a()).k(h02.d, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


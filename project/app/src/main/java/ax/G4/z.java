/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.g;
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
import java.util.regex.Pattern;

class z {
    protected final String a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    protected final g e;

    public z(String string) {
        this(string, false, false, false, null);
    }

    public z(String string, boolean bl, boolean bl2, boolean bl3, g g8) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", string)) {
                this.a = string;
                this.b = bl;
                this.c = bl2;
                this.d = bl3;
                this.e = g8;
                return;
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public String a() {
        return ax.G4.z$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (z)object;
            Object object2 = this.a;
            String string = ((z)object).a;
            if ((object2 == string || ((String)object2).equals(string)) && this.b == ((z)object).b && this.c == ((z)object).c && this.d == ((z)object).d && ((object2 = this.e) == (object = ((z)object).e) || object2 != null && ((g)object2).equals(object))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return ax.G4.z$a.b.j(this, false);
    }

    static class a
    extends e<z> {
        public static final a b = new a();

        a() {
        }

        public z u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Boolean bl2 = Boolean.FALSE;
                String string = null;
                g g8 = null;
                Object object2 = object = bl2;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("path".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("include_media_info".equals(string2)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_deleted".equals(string2)) {
                        object = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_has_explicit_shared_members".equals(string2)) {
                        object2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_property_groups".equals(string2)) {
                        g8 = ax.v4.d.d(g.b.b).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new z(string, bl2, (Boolean)object, (Boolean)object2, g8);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((z)object).a());
                    return object;
                }
                throw new i(j8, "Required field \"path\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(z z8, ax.T4.g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            ax.v4.d.f().k(z8.a, g8);
            g8.o("include_media_info");
            ax.v4.d.a().k(z8.b, g8);
            g8.o("include_deleted");
            ax.v4.d.a().k(z8.c, g8);
            g8.o("include_has_explicit_shared_members");
            ax.v4.d.a().k(z8.d, g8);
            if (z8.e != null) {
                g8.o("include_property_groups");
                ax.v4.d.d(g.b.b).k(z8.e, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


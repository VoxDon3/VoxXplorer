/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.g;
import ax.G4.k0;
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

class F {
    protected final String a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;
    protected final boolean f;
    protected final Long g;
    protected final k0 h;
    protected final g i;
    protected final boolean j;

    public F(String string) {
        this(string, false, false, false, false, true, null, null, null, true);
    }

    public F(String string, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, Long l8, k0 k02, g g8, boolean bl6) {
        if (string != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", string)) {
                this.a = string;
                this.b = bl;
                this.c = bl2;
                this.d = bl3;
                this.e = bl4;
                this.f = bl5;
                if (l8 != null) {
                    if (l8 >= 1L) {
                        if (l8 > 2000L) {
                            throw new IllegalArgumentException("Number 'limit' is larger than 2000L");
                        }
                    } else {
                        throw new IllegalArgumentException("Number 'limit' is smaller than 1L");
                    }
                }
                this.g = l8;
                this.h = k02;
                this.i = g8;
                this.j = bl6;
                return;
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public String a() {
        return ax.G4.F$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (F)object;
            Object object2 = this.a;
            Object object3 = ((F)object).a;
            if ((object2 == object3 || ((String)object2).equals(object3)) && this.b == ((F)object).b && this.c == ((F)object).c && this.d == ((F)object).d && this.e == ((F)object).e && this.f == ((F)object).f && ((object2 = this.g) == (object3 = ((F)object).g) || object2 != null && ((Long)object2).equals(object3)) && ((object3 = this.h) == (object2 = ((F)object).h) || object3 != null && ((k0)object3).equals(object2)) && ((object3 = this.i) == (object2 = ((F)object).i) || object3 != null && ((g)object3).equals(object2)) && this.j == ((F)object).j) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    public String toString() {
        return ax.G4.F$a.b.j(this, false);
    }

    static class a
    extends e<F> {
        public static final a b = new a();

        a() {
        }

        public F u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Object object2;
                Boolean bl2 = Boolean.FALSE;
                Boolean bl3 = Boolean.TRUE;
                String string = null;
                Long l8 = null;
                Object object3 = object2 = l8;
                Object object4 = object = bl2;
                Boolean bl4 = bl3;
                Object object5 = object4;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("path".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("recursive".equals(string2)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_media_info".equals(string2)) {
                        object = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_deleted".equals(string2)) {
                        object5 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_has_explicit_shared_members".equals(string2)) {
                        object4 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("include_mounted_folders".equals(string2)) {
                        bl3 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("limit".equals(string2)) {
                        l8 = ax.v4.d.d(ax.v4.d.h()).a(j8);
                        continue;
                    }
                    if ("shared_link".equals(string2)) {
                        object2 = ax.v4.d.e(k0.a.b).a(j8);
                        continue;
                    }
                    if ("include_property_groups".equals(string2)) {
                        object3 = ax.v4.d.d(g.b.b).a(j8);
                        continue;
                    }
                    if ("include_non_downloadable_files".equals(string2)) {
                        bl4 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new F(string, bl2, (Boolean)object, (Boolean)object5, (Boolean)object4, bl3, l8, (k0)object2, (g)object3, bl4);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((F)object).a());
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

        public void v(F f8, ax.T4.g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            ax.v4.d.f().k(f8.a, g8);
            g8.o("recursive");
            ax.v4.d.a().k(f8.b, g8);
            g8.o("include_media_info");
            ax.v4.d.a().k(f8.c, g8);
            g8.o("include_deleted");
            ax.v4.d.a().k(f8.d, g8);
            g8.o("include_has_explicit_shared_members");
            ax.v4.d.a().k(f8.e, g8);
            g8.o("include_mounted_folders");
            ax.v4.d.a().k(f8.f, g8);
            if (f8.g != null) {
                g8.o("limit");
                ax.v4.d.d(ax.v4.d.h()).k(f8.g, g8);
            }
            if (f8.h != null) {
                g8.o("shared_link");
                ax.v4.d.e(k0.a.b).k(f8.h, g8);
            }
            if (f8.i != null) {
                g8.o("include_property_groups");
                ax.v4.d.d(g.b.b).k(f8.i, g8);
            }
            g8.o("include_non_downloadable_files");
            ax.v4.d.a().k(f8.j, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


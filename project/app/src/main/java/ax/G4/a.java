/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.e;
import ax.G4.T0;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.w4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class a {
    protected final String a;
    protected final T0 b;
    protected final boolean c;
    protected final Date d;
    protected final boolean e;
    protected final List<e> f;
    protected final boolean g;

    public a(String object, T0 t02, boolean bl, Date date, boolean bl2, List<e> list, boolean bl3) {
        if (object != null) {
            if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", (CharSequence)object)) {
                this.a = object;
                if (t02 != null) {
                    this.b = t02;
                    this.c = bl;
                    this.d = ax.w4.d.b(date);
                    this.e = bl2;
                    if (list != null) {
                        object = list.iterator();
                        while (object.hasNext()) {
                            if ((e)object.next() != null) continue;
                            throw new IllegalArgumentException("An item in list 'propertyGroups' is null");
                        }
                    }
                    this.f = list;
                    this.g = bl3;
                    return;
                }
                throw new IllegalArgumentException("Required value for 'mode' is null");
            }
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        throw new IllegalArgumentException("Required value for 'path' is null");
    }

    public static a a(String string) {
        return new a(string);
    }

    public String b() {
        return ax.G4.a$b.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (a)object;
            Object object2 = this.a;
            Object object3 = ((a)object).a;
            if ((object2 == object3 || ((String)object2).equals(object3)) && ((object3 = this.b) == (object2 = ((a)object).b) || ((T0)object3).equals(object2)) && this.c == ((a)object).c && ((object3 = this.d) == (object2 = ((a)object).d) || object3 != null && ((Date)object3).equals(object2)) && this.e == ((a)object).e && ((object2 = this.f) == (object3 = ((a)object).f) || object2 != null && object2.equals(object3)) && this.g == ((a)object).g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public String toString() {
        return ax.G4.a$b.b.j(this, false);
    }

    public static class a {
        protected final String a;
        protected T0 b;
        protected boolean c;
        protected Date d;
        protected boolean e;
        protected List<e> f;
        protected boolean g;

        protected a(String string) {
            if (string != null) {
                if (Pattern.matches("(/(.|[\\r\\n])*)|(ns:[0-9]+(/.*)?)|(id:.*)", string)) {
                    this.a = string;
                    this.b = T0.c;
                    this.c = false;
                    this.d = null;
                    this.e = false;
                    this.f = null;
                    this.g = false;
                    return;
                }
                throw new IllegalArgumentException("String 'path' does not match pattern");
            }
            throw new IllegalArgumentException("Required value for 'path' is null");
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public a b(Boolean bl) {
            if (bl != null) {
                this.c = bl;
                return this;
            }
            this.c = false;
            return this;
        }

        public a c(Date date) {
            this.d = ax.w4.d.b(date);
            return this;
        }

        public a d(T0 t02) {
            if (t02 != null) {
                this.b = t02;
                return this;
            }
            this.b = T0.c;
            return this;
        }
    }

    static class b
    extends ax.v4.e<a> {
        public static final b b = new b();

        b() {
        }

        public a u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                T0 t02 = T0.c;
                Boolean bl2 = Boolean.FALSE;
                String string = null;
                Date date = null;
                Object object2 = date;
                Object object3 = object = bl2;
                while (j8.j() == m.p0) {
                    String string2 = j8.g();
                    j8.H();
                    if ("path".equals(string2)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("mode".equals(string2)) {
                        t02 = T0.b.b.s(j8);
                        continue;
                    }
                    if ("autorename".equals(string2)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("client_modified".equals(string2)) {
                        date = ax.v4.d.d(ax.v4.d.g()).a(j8);
                        continue;
                    }
                    if ("mute".equals(string2)) {
                        object = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("property_groups".equals(string2)) {
                        object2 = ax.v4.d.d(ax.v4.d.c(e.a.b)).a(j8);
                        continue;
                    }
                    if ("strict_conflict".equals(string2)) {
                        object3 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new a(string, t02, bl2, date, (Boolean)object, (List<e>)object2, (Boolean)object3);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((a)object).b());
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

        public void v(a a8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            ax.v4.d.f().k(a8.a, g8);
            g8.o("mode");
            T0.b.b.t(a8.b, g8);
            g8.o("autorename");
            ax.v4.d.a().k(a8.c, g8);
            if (a8.d != null) {
                g8.o("client_modified");
                ax.v4.d.d(ax.v4.d.g()).k(a8.d, g8);
            }
            g8.o("mute");
            ax.v4.d.a().k(a8.e, g8);
            if (a8.f != null) {
                g8.o("property_groups");
                ax.v4.d.d(ax.v4.d.c(e.a.b)).k(a8.f, g8);
            }
            g8.o("strict_conflict");
            ax.v4.d.a().k(a8.g, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


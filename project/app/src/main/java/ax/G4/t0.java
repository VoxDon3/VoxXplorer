/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.E4.e;
import ax.G4.T0;
import ax.G4.a;
import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class t0
extends ax.G4.a {
    protected final String h;

    public t0(String string, T0 t02, boolean bl, Date date, boolean bl2, List<e> list, boolean bl3, String string2) {
        super(string, t02, bl, date, bl2, list, bl3);
        if (string2 != null) {
            if (string2.length() >= 64) {
                if (string2.length() > 64) {
                    throw new IllegalArgumentException("String 'contentHash' is longer than 64");
                }
            } else {
                throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
            }
        }
        this.h = string2;
    }

    public static a c(String string) {
        return new a(string);
    }

    @Override
    public String b() {
        return ax.G4.t0$b.b.j(this, true);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (t0)object;
            Object object2 = this.a;
            Object object3 = ((ax.G4.a)object).a;
            if ((object2 == object3 || ((String)object2).equals(object3)) && ((object3 = this.b) == (object2 = ((ax.G4.a)object).b) || ((T0)object3).equals(object2)) && this.c == ((ax.G4.a)object).c && ((object3 = this.d) == (object2 = ((ax.G4.a)object).d) || object3 != null && ((Date)object3).equals(object2)) && this.e == ((ax.G4.a)object).e && ((object3 = this.f) == (object2 = ((ax.G4.a)object).f) || object3 != null && object3.equals(object2)) && this.g == ((ax.G4.a)object).g && ((object3 = this.h) == (object = ((t0)object).h) || object3 != null && ((String)object3).equals(object))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.h});
        return super.hashCode() * 31 + n8;
    }

    @Override
    public String toString() {
        return ax.G4.t0$b.b.j(this, false);
    }

    public static class a
    extends a.a {
        protected String h = null;

        protected a(String string) {
            super(string);
        }

        public t0 e() {
            return new t0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public a f(Boolean bl) {
            super.b(bl);
            return this;
        }

        public a g(Date date) {
            super.c(date);
            return this;
        }

        public a h(T0 t02) {
            super.d(t02);
            return this;
        }
    }

    static class b
    extends ax.v4.e<t0> {
        public static final b b = new b();

        b() {
        }

        public t0 u(j j8, boolean bl) throws IOException, i {
            Object object;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                Object object2;
                T0 t02 = T0.c;
                Boolean bl2 = Boolean.FALSE;
                String string = null;
                Date date = null;
                Object object3 = object2 = date;
                Object object4 = object = bl2;
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
                        object4 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("content_hash".equals(string2)) {
                        object3 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    object = new t0(string, t02, bl2, date, (Boolean)object, (List<e>)object2, (Boolean)object4, (String)object3);
                    if (!bl) {
                        ax.v4.c.e(j8);
                    }
                    ax.v4.b.a(object, ((t0)object).b());
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

        public void v(t0 t02, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("path");
            ax.v4.d.f().k(t02.a, g8);
            g8.o("mode");
            T0.b.b.t(t02.b, g8);
            g8.o("autorename");
            ax.v4.d.a().k(t02.c, g8);
            if (t02.d != null) {
                g8.o("client_modified");
                ax.v4.d.d(ax.v4.d.g()).k(t02.d, g8);
            }
            g8.o("mute");
            ax.v4.d.a().k(t02.e, g8);
            if (t02.f != null) {
                g8.o("property_groups");
                ax.v4.d.d(ax.v4.d.c(e.a.b)).k(t02.f, g8);
            }
            g8.o("strict_conflict");
            ax.v4.d.a().k(t02.g, g8);
            if (t02.h != null) {
                g8.o("content_hash");
                ax.v4.d.d(ax.v4.d.f()).k(t02.h, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


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
import ax.v4.e;
import ax.w4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class s {
    protected final Boolean a;
    protected final String b;
    protected final String c;
    protected final Date d;

    public s() {
        this(null, null, null, null);
    }

    public s(Boolean bl, String string, String string2, Date date) {
        this.a = bl;
        this.b = string;
        if (string2 != null) {
            if (string2.length() >= 40) {
                if (string2.length() > 40) {
                    throw new IllegalArgumentException("String 'lockholderAccountId' is longer than 40");
                }
            } else {
                throw new IllegalArgumentException("String 'lockholderAccountId' is shorter than 40");
            }
        }
        this.c = string2;
        this.d = ax.w4.d.b(date);
    }

    public String a() {
        return ax.G4.s$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (s)object;
            Object object2 = this.a;
            Object object3 = ((s)object).a;
            return (object2 == object3 || object2 != null && ((Boolean)object2).equals(object3)) && ((object2 = this.b) == (object3 = ((s)object).b) || object2 != null && ((String)object2).equals(object3)) && ((object3 = this.c) == (object2 = ((s)object).c) || object3 != null && ((String)object3).equals(object2)) && ((object3 = this.d) == (object = ((s)object).d) || object3 != null && ((Date)object3).equals(object));
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return ax.G4.s$a.b.j(this, false);
    }

    static class a
    extends e<s> {
        public static final a b = new a();

        a() {
        }

        public s u(j j8, boolean bl) throws IOException, i {
            Object object;
            Boolean bl2 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                String string = null;
                String string2 = null;
                object = string2;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("is_lockholder".equals(string3)) {
                        bl2 = ax.v4.d.d(ax.v4.d.a()).a(j8);
                        continue;
                    }
                    if ("lockholder_name".equals(string3)) {
                        string = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("lockholder_account_id".equals(string3)) {
                        string2 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("created".equals(string3)) {
                        object = ax.v4.d.d(ax.v4.d.g()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                object = new s(bl2, string, string2, (Date)object);
                if (!bl) {
                    ax.v4.c.e(j8);
                }
                ax.v4.b.a(object, ((s)object).a());
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(s s8, g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            if (s8.a != null) {
                g8.o("is_lockholder");
                ax.v4.d.d(ax.v4.d.a()).k(s8.a, g8);
            }
            if (s8.b != null) {
                g8.o("lockholder_name");
                ax.v4.d.d(ax.v4.d.f()).k(s8.b, g8);
            }
            if (s8.c != null) {
                g8.o("lockholder_account_id");
                ax.v4.d.d(ax.v4.d.f()).k(s8.c, g8);
            }
            if (s8.d != null) {
                g8.o("created");
                ax.v4.d.d(ax.v4.d.g()).k(s8.d, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


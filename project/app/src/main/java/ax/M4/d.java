/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.L4.b;
import ax.L4.g;
import ax.M4.i;
import ax.T4.f;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.c;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class d
extends i {
    protected final g c;
    protected final ax.L4.b d;

    public d(String string, String string2, g g8, ax.L4.b b8) {
        super(string, string2);
        if (g8 != null) {
            this.c = g8;
            if (b8 != null) {
                this.d = b8;
                return;
            }
            throw new IllegalArgumentException("Required value for 'officeAddinPolicy' is null");
        }
        throw new IllegalArgumentException("Required value for 'sharingPolicies' is null");
    }

    public String a() {
        return ax.M4.d$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (d)object;
            Object object2 = this.a;
            Object object3 = ((i)object).a;
            return !(object2 != object3 && !((String)object2).equals(object3) || (object2 = this.b) != (object3 = ((i)object).b) && !((String)object2).equals(object3) || (object2 = this.c) != (object3 = ((d)object).c) && !((g)object2).equals(object3) || (object2 = this.d) != (object = ((d)object).d) && !object2.equals(object));
            {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.c, this.d});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.M4.d$a.b.j(this, false);
    }

    static class a
    extends e<d> {
        public static final a b = new a();

        a() {
        }

        public d u(j j8, boolean bl) throws IOException, ax.T4.i {
            Object object;
            String string = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                String string2 = null;
                g g8 = null;
                object = g8;
                while (j8.j() == m.p0) {
                    String string3 = j8.g();
                    j8.H();
                    if ("id".equals(string3)) {
                        string = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("name".equals(string3)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("sharing_policies".equals(string3)) {
                        g8 = (g)g.a.b.a(j8);
                        continue;
                    }
                    if ("office_addin_policy".equals(string3)) {
                        object = b.b.b.s(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (string != null) {
                    if (string2 != null) {
                        if (g8 != null) {
                            if (object != null) {
                                object = new d(string, string2, g8, (ax.L4.b)((Object)object));
                                if (!bl) {
                                    ax.v4.c.e(j8);
                                }
                                ax.v4.b.a(object, ((d)object).a());
                                return object;
                            }
                            throw new ax.T4.i(j8, "Required field \"office_addin_policy\" missing.");
                        }
                        throw new ax.T4.i(j8, "Required field \"sharing_policies\" missing.");
                    }
                    throw new ax.T4.i(j8, "Required field \"name\" missing.");
                }
                throw new ax.T4.i(j8, "Required field \"id\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new ax.T4.i(j8, stringBuilder.toString());
        }

        public void v(d d8, ax.T4.g g8, boolean bl) throws IOException, f {
            if (!bl) {
                g8.o0();
            }
            g8.o("id");
            ax.v4.d.f().k(d8.a, g8);
            g8.o("name");
            ax.v4.d.f().k(d8.b, g8);
            g8.o("sharing_policies");
            g.a.b.k(d8.c, g8);
            g8.o("office_addin_policy");
            b.b.b.t(d8.d, g8);
            if (!bl) {
                g8.m();
            }
        }
    }
}


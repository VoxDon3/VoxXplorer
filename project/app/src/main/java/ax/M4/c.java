/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.C4.c;
import ax.M4.d;
import ax.M4.f;
import ax.N4.a;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.b;
import ax.v4.e;
import java.io.IOException;
import java.util.Arrays;

public class c
extends ax.M4.a {
    protected final String g;
    protected final String h;
    protected final String i;
    protected final d j;
    protected final String k;
    protected final boolean l;
    protected final ax.N4.a m;
    protected final ax.C4.c n;

    public c(String string, f f8, String string2, boolean bl, boolean bl2, String string3, String string4, boolean bl3, ax.N4.a a8, ax.C4.c c8, String string5, String string6, d d8, String string7) {
        super(string, f8, string2, bl, bl2, string5);
        if (string6 != null) {
            if (string6.length() >= 2) {
                if (string6.length() > 2) {
                    throw new IllegalArgumentException("String 'country' is longer than 2");
                }
            } else {
                throw new IllegalArgumentException("String 'country' is shorter than 2");
            }
        }
        this.g = string6;
        if (string3 != null) {
            if (string3.length() >= 2) {
                this.h = string3;
                if (string4 != null) {
                    this.i = string4;
                    this.j = d8;
                    this.k = string7;
                    this.l = bl3;
                    if (a8 != null) {
                        this.m = a8;
                        if (c8 != null) {
                            this.n = c8;
                            return;
                        }
                        throw new IllegalArgumentException("Required value for 'rootInfo' is null");
                    }
                    throw new IllegalArgumentException("Required value for 'accountType' is null");
                }
                throw new IllegalArgumentException("Required value for 'referralLink' is null");
            }
            throw new IllegalArgumentException("String 'locale' is shorter than 2");
        }
        throw new IllegalArgumentException("Required value for 'locale' is null");
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public f c() {
        return this.b;
    }

    public ax.C4.c d() {
        return this.n;
    }

    public String e() {
        return ax.M4.c$a.b.j(this, true);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            object = (c)object;
            Object object2 = this.a;
            Object object3 = ((ax.M4.a)object).a;
            if (!(object2 != object3 && !((String)object2).equals(object3) || (object3 = this.b) != (object2 = ((ax.M4.a)object).b) && !((f)object3).equals(object2) || (object2 = this.c) != (object3 = ((ax.M4.a)object).c) && !((String)object2).equals(object3) || this.d != ((ax.M4.a)object).d || this.f != ((ax.M4.a)object).f || (object2 = this.h) != (object3 = ((c)object).h) && !((String)object2).equals(object3) || (object2 = this.i) != (object3 = ((c)object).i) && !((String)object2).equals(object3) || this.l != ((c)object).l || (object2 = this.m) != (object3 = ((c)object).m) && !object2.equals(object3) || (object3 = this.n) != (object2 = ((c)object).n) && !((ax.C4.c)object3).equals(object2) || (object3 = this.e) != (object2 = ((ax.M4.a)object).e) && (object3 == null || !((String)object3).equals(object2)) || (object3 = this.g) != (object2 = ((c)object).g) && (object3 == null || !((String)object3).equals(object2)) || (object3 = this.j) != (object2 = ((c)object).j) && (object3 == null || !((d)object3).equals(object2)) || (object3 = this.k) != (object = ((c)object).k) && (object3 == null || !((String)object3).equals(object)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = Arrays.hashCode(new Object[]{this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n});
        return super.hashCode() * 31 + n8;
    }

    public String toString() {
        return ax.M4.c$a.b.j(this, false);
    }

    static class a
    extends e<c> {
        public static final a b = new a();

        a() {
        }

        public c u(j j8, boolean bl) throws IOException, i {
            Object object;
            Boolean bl2 = null;
            if (!bl) {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
            } else {
                object = null;
            }
            if (object == null) {
                String string;
                String string2;
                String string3;
                String string4;
                Boolean bl3 = null;
                Boolean bl4 = null;
                Object object2 = object = bl4;
                Object object3 = string4 = (string3 = (string2 = object2));
                Object object4 = object3;
                String string5 = string = object4;
                Object object5 = string5;
                String string6 = object5;
                while (j8.j() == ax.T4.m.p0) {
                    String string7 = j8.g();
                    j8.H();
                    if ("account_id".equals(string7)) {
                        object = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("name".equals(string7)) {
                        object2 = (f)f.a.b.a(j8);
                        continue;
                    }
                    if ("email".equals(string7)) {
                        string2 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("email_verified".equals(string7)) {
                        bl2 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("disabled".equals(string7)) {
                        bl3 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("locale".equals(string7)) {
                        string3 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("referral_link".equals(string7)) {
                        string4 = ax.v4.d.f().a(j8);
                        continue;
                    }
                    if ("is_paired".equals(string7)) {
                        bl4 = ax.v4.d.a().a(j8);
                        continue;
                    }
                    if ("account_type".equals(string7)) {
                        object3 = a.b.b.s(j8);
                        continue;
                    }
                    if ("root_info".equals(string7)) {
                        object4 = (ax.C4.c)c.a.b.a(j8);
                        continue;
                    }
                    if ("profile_photo_url".equals(string7)) {
                        string = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("country".equals(string7)) {
                        string5 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    if ("team".equals(string7)) {
                        object5 = ax.v4.d.e(d.a.b).a(j8);
                        continue;
                    }
                    if ("team_member_id".equals(string7)) {
                        string6 = ax.v4.d.d(ax.v4.d.f()).a(j8);
                        continue;
                    }
                    ax.v4.c.o(j8);
                }
                if (object != null) {
                    if (object2 != null) {
                        if (string2 != null) {
                            if (bl2 != null) {
                                if (bl3 != null) {
                                    if (string3 != null) {
                                        if (string4 != null) {
                                            if (bl4 != null) {
                                                if (object3 != null) {
                                                    if (object4 != null) {
                                                        object = new c((String)object, (f)object2, string2, bl2, bl3, string3, string4, bl4, (ax.N4.a)((Object)object3), (ax.C4.c)object4, string, string5, (d)object5, string6);
                                                        if (!bl) {
                                                            ax.v4.c.e(j8);
                                                        }
                                                        ax.v4.b.a(object, ((c)object).e());
                                                        return object;
                                                    }
                                                    throw new i(j8, "Required field \"root_info\" missing.");
                                                }
                                                throw new i(j8, "Required field \"account_type\" missing.");
                                            }
                                            throw new i(j8, "Required field \"is_paired\" missing.");
                                        }
                                        throw new i(j8, "Required field \"referral_link\" missing.");
                                    }
                                    throw new i(j8, "Required field \"locale\" missing.");
                                }
                                throw new i(j8, "Required field \"disabled\" missing.");
                            }
                            throw new i(j8, "Required field \"email_verified\" missing.");
                        }
                        throw new i(j8, "Required field \"email\" missing.");
                    }
                    throw new i(j8, "Required field \"name\" missing.");
                }
                throw new i(j8, "Required field \"account_id\" missing.");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No subtype found that matches tag: \"");
            stringBuilder.append((String)object);
            stringBuilder.append("\"");
            throw new i(j8, stringBuilder.toString());
        }

        public void v(c c8, g g8, boolean bl) throws IOException, ax.T4.f {
            if (!bl) {
                g8.o0();
            }
            g8.o("account_id");
            ax.v4.d.f().k(c8.a, g8);
            g8.o("name");
            f.a.b.k(c8.b, g8);
            g8.o("email");
            ax.v4.d.f().k(c8.c, g8);
            g8.o("email_verified");
            ax.v4.d.a().k(c8.d, g8);
            g8.o("disabled");
            ax.v4.d.a().k(c8.f, g8);
            g8.o("locale");
            ax.v4.d.f().k(c8.h, g8);
            g8.o("referral_link");
            ax.v4.d.f().k(c8.i, g8);
            g8.o("is_paired");
            ax.v4.d.a().k(c8.l, g8);
            g8.o("account_type");
            a.b.b.t(c8.m, g8);
            g8.o("root_info");
            c.a.b.k(c8.n, g8);
            if (c8.e != null) {
                g8.o("profile_photo_url");
                ax.v4.d.d(ax.v4.d.f()).k(c8.e, g8);
            }
            if (c8.g != null) {
                g8.o("country");
                ax.v4.d.d(ax.v4.d.f()).k(c8.g, g8);
            }
            if (c8.j != null) {
                g8.o("team");
                ax.v4.d.e(d.a.b).k(c8.j, g8);
            }
            if (c8.k != null) {
                g8.o("team_member_id");
                ax.v4.d.d(ax.v4.d.f()).k(c8.k, g8);
            }
            if (!bl) {
                g8.m();
            }
        }
    }
}


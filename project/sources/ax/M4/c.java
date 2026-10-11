package ax.M4;

import ax.C4.c;
import ax.M4.d;
import ax.M4.f;
import ax.N4.a;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c extends ax.M4.a {
    protected final String g;
    protected final String h;
    protected final String i;
    protected final d j;
    protected final String k;
    protected final boolean l;
    protected final ax.N4.a m;
    protected final ax.C4.c n;

    static class a extends ax.v4.e<c> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public c s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Boolean bool = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str2 = null;
            f fVar = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ax.N4.a aVar = null;
            ax.C4.c cVar = null;
            String str6 = null;
            String str7 = null;
            d dVar = null;
            String str8 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("account_id".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("name".equals(g)) {
                    fVar = f.a.b.a(jVar);
                } else if ("email".equals(g)) {
                    str3 = C3277d.f().a(jVar);
                } else if ("email_verified".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("disabled".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("locale".equals(g)) {
                    str4 = C3277d.f().a(jVar);
                } else if ("referral_link".equals(g)) {
                    str5 = C3277d.f().a(jVar);
                } else if ("is_paired".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else if ("account_type".equals(g)) {
                    aVar = a.b.b.a(jVar);
                } else if ("root_info".equals(g)) {
                    cVar = c.a.b.a(jVar);
                } else if ("profile_photo_url".equals(g)) {
                    str6 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("country".equals(g)) {
                    str7 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else if ("team".equals(g)) {
                    dVar = (d) C3277d.e(d.a.b).a(jVar);
                } else if ("team_member_id".equals(g)) {
                    str8 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"account_id\" missing.");
            }
            if (fVar == null) {
                throw new ax.T4.i(jVar, "Required field \"name\" missing.");
            }
            if (str3 == null) {
                throw new ax.T4.i(jVar, "Required field \"email\" missing.");
            }
            if (bool == null) {
                throw new ax.T4.i(jVar, "Required field \"email_verified\" missing.");
            }
            if (bool2 == null) {
                throw new ax.T4.i(jVar, "Required field \"disabled\" missing.");
            }
            if (str4 == null) {
                throw new ax.T4.i(jVar, "Required field \"locale\" missing.");
            }
            if (str5 == null) {
                throw new ax.T4.i(jVar, "Required field \"referral_link\" missing.");
            }
            if (bool3 == null) {
                throw new ax.T4.i(jVar, "Required field \"is_paired\" missing.");
            }
            if (aVar == null) {
                throw new ax.T4.i(jVar, "Required field \"account_type\" missing.");
            }
            if (cVar == null) {
                throw new ax.T4.i(jVar, "Required field \"root_info\" missing.");
            }
            c cVar2 = new c(str2, fVar, str3, bool.booleanValue(), bool2.booleanValue(), str4, str5, bool3.booleanValue(), aVar, cVar, str6, str7, dVar, str8);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(cVar2, cVar2.e());
            return cVar2;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(c cVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("account_id");
            C3277d.f().k(cVar.a, gVar);
            gVar.o("name");
            f.a.b.k(cVar.b, gVar);
            gVar.o("email");
            C3277d.f().k(cVar.c, gVar);
            gVar.o("email_verified");
            C3277d.a().k(Boolean.valueOf(cVar.d), gVar);
            gVar.o("disabled");
            C3277d.a().k(Boolean.valueOf(cVar.f), gVar);
            gVar.o("locale");
            C3277d.f().k(cVar.h, gVar);
            gVar.o("referral_link");
            C3277d.f().k(cVar.i, gVar);
            gVar.o("is_paired");
            C3277d.a().k(Boolean.valueOf(cVar.l), gVar);
            gVar.o("account_type");
            a.b.b.k(cVar.m, gVar);
            gVar.o("root_info");
            c.a.b.k(cVar.n, gVar);
            if (cVar.e != null) {
                gVar.o("profile_photo_url");
                C3277d.d(C3277d.f()).k(cVar.e, gVar);
            }
            if (cVar.g != null) {
                gVar.o("country");
                C3277d.d(C3277d.f()).k(cVar.g, gVar);
            }
            if (cVar.j != null) {
                gVar.o("team");
                C3277d.e(d.a.b).k(cVar.j, gVar);
            }
            if (cVar.k != null) {
                gVar.o("team_member_id");
                C3277d.d(C3277d.f()).k(cVar.k, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public c(String str, f fVar, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, ax.N4.a aVar, ax.C4.c cVar, String str5, String str6, d dVar, String str7) {
        super(str, fVar, str2, z, z2, str5);
        if (str6 != null) {
            if (str6.length() < 2) {
                throw new IllegalArgumentException("String 'country' is shorter than 2");
            }
            if (str6.length() > 2) {
                throw new IllegalArgumentException("String 'country' is longer than 2");
            }
        }
        this.g = str6;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value for 'locale' is null");
        }
        if (str3.length() < 2) {
            throw new IllegalArgumentException("String 'locale' is shorter than 2");
        }
        this.h = str3;
        if (str4 == null) {
            throw new IllegalArgumentException("Required value for 'referralLink' is null");
        }
        this.i = str4;
        this.j = dVar;
        this.k = str7;
        this.l = z3;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value for 'accountType' is null");
        }
        this.m = aVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Required value for 'rootInfo' is null");
        }
        this.n = cVar;
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
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        c cVar;
        String str;
        String str2;
        f fVar;
        f fVar2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ax.N4.a aVar;
        ax.N4.a aVar2;
        ax.C4.c cVar2;
        ax.C4.c cVar3;
        String str9;
        String str10;
        String str11;
        String str12;
        d dVar;
        d dVar2;
        String str13;
        String str14;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (cVar = (c) obj).a) || str.equals(str2)) && (((fVar = this.b) == (fVar2 = cVar.b) || fVar.equals(fVar2)) && (((str3 = this.c) == (str4 = cVar.c) || str3.equals(str4)) && this.d == cVar.d && this.f == cVar.f && (((str5 = this.h) == (str6 = cVar.h) || str5.equals(str6)) && (((str7 = this.i) == (str8 = cVar.i) || str7.equals(str8)) && this.l == cVar.l && (((aVar = this.m) == (aVar2 = cVar.m) || aVar.equals(aVar2)) && (((cVar2 = this.n) == (cVar3 = cVar.n) || cVar2.equals(cVar3)) && (((str9 = this.e) == (str10 = cVar.e) || (str9 != null && str9.equals(str10))) && (((str11 = this.g) == (str12 = cVar.g) || (str11 != null && str11.equals(str12))) && (((dVar = this.j) == (dVar2 = cVar.j) || (dVar != null && dVar.equals(dVar2))) && ((str13 = this.k) == (str14 = cVar.k) || (str13 != null && str13.equals(str14))))))))))));
    }

    @Override // ax.M4.a
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), this.m, this.n});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

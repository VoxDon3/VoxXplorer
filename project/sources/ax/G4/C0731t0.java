package ax.G4;

import ax.E4.e;
import ax.G4.C0693a;
import ax.G4.T0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* renamed from: ax.G4.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0731t0 extends C0693a {
    protected final String h;

    /* renamed from: ax.G4.t0$a */
    public static class a extends C0693a.C0084a {
        protected String h;

        protected a(String str) {
            super(str);
            this.h = null;
        }

        @Override // ax.G4.C0693a.C0084a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0731t0 a() {
            return new C0731t0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        @Override // ax.G4.C0693a.C0084a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(Boolean bool) {
            super.b(bool);
            return this;
        }

        @Override // ax.G4.C0693a.C0084a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(Date date) {
            super.c(date);
            return this;
        }

        @Override // ax.G4.C0693a.C0084a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(T0 t0) {
            super.d(t0);
            return this;
        }
    }

    /* renamed from: ax.G4.t0$b */
    static class b extends ax.v4.e<C0731t0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0731t0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            T0 t0 = T0.c;
            Boolean bool = Boolean.FALSE;
            String str2 = null;
            Date date = null;
            List list = null;
            String str3 = null;
            T0 t02 = t0;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("mode".equals(g)) {
                    t02 = T0.b.b.a(jVar);
                } else if ("autorename".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("client_modified".equals(g)) {
                    date = (Date) C3277d.d(C3277d.g()).a(jVar);
                } else if ("mute".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("property_groups".equals(g)) {
                    list = (List) C3277d.d(C3277d.c(e.a.b)).a(jVar);
                } else if ("strict_conflict".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else if ("content_hash".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0731t0 c0731t0 = new C0731t0(str2, t02, bool.booleanValue(), date, bool2.booleanValue(), list, bool3.booleanValue(), str3);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0731t0, c0731t0.b());
            return c0731t0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0731t0 c0731t0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0731t0.a, gVar);
            gVar.o("mode");
            T0.b.b.k(c0731t0.b, gVar);
            gVar.o("autorename");
            C3277d.a().k(Boolean.valueOf(c0731t0.c), gVar);
            if (c0731t0.d != null) {
                gVar.o("client_modified");
                C3277d.d(C3277d.g()).k(c0731t0.d, gVar);
            }
            gVar.o("mute");
            C3277d.a().k(Boolean.valueOf(c0731t0.e), gVar);
            if (c0731t0.f != null) {
                gVar.o("property_groups");
                C3277d.d(C3277d.c(e.a.b)).k(c0731t0.f, gVar);
            }
            gVar.o("strict_conflict");
            C3277d.a().k(Boolean.valueOf(c0731t0.g), gVar);
            if (c0731t0.h != null) {
                gVar.o("content_hash");
                C3277d.d(C3277d.f()).k(c0731t0.h, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0731t0(String str, T0 t0, boolean z, Date date, boolean z2, List<ax.E4.e> list, boolean z3, String str2) {
        super(str, t0, z, date, z2, list, z3);
        if (str2 != null) {
            if (str2.length() < 64) {
                throw new IllegalArgumentException("String 'contentHash' is shorter than 64");
            }
            if (str2.length() > 64) {
                throw new IllegalArgumentException("String 'contentHash' is longer than 64");
            }
        }
        this.h = str2;
    }

    public static a c(String str) {
        return new a(str);
    }

    @Override // ax.G4.C0693a
    public String b() {
        return b.b.j(this, true);
    }

    @Override // ax.G4.C0693a
    public boolean equals(Object obj) {
        C0731t0 c0731t0;
        String str;
        String str2;
        T0 t0;
        T0 t02;
        Date date;
        Date date2;
        List<ax.E4.e> list;
        List<ax.E4.e> list2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0731t0 = (C0731t0) obj).a) || str.equals(str2)) && (((t0 = this.b) == (t02 = c0731t0.b) || t0.equals(t02)) && this.c == c0731t0.c && (((date = this.d) == (date2 = c0731t0.d) || (date != null && date.equals(date2))) && this.e == c0731t0.e && (((list = this.f) == (list2 = c0731t0.f) || (list != null && list.equals(list2))) && this.g == c0731t0.g && ((str3 = this.h) == (str4 = c0731t0.h) || (str3 != null && str3.equals(str4))))));
    }

    @Override // ax.G4.C0693a
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.h});
    }

    @Override // ax.G4.C0693a
    public String toString() {
        return b.b.j(this, false);
    }
}

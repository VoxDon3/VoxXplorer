package ax.G4;

import ax.E4.g;
import ax.G4.C0714k0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class F {
    protected final String a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    protected final boolean e;
    protected final boolean f;
    protected final Long g;
    protected final C0714k0 h;
    protected final ax.E4.g i;
    protected final boolean j;

    static class a extends ax.v4.e<F> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public F s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            Boolean bool = Boolean.FALSE;
            String str2 = null;
            Long l = null;
            C0714k0 c0714k0 = null;
            ax.E4.g gVar = null;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            Boolean bool4 = Boolean.TRUE;
            Boolean bool5 = bool4;
            Boolean bool6 = bool3;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("recursive".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("include_media_info".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("include_deleted".equals(g)) {
                    bool6 = C3277d.a().a(jVar);
                } else if ("include_has_explicit_shared_members".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else if ("include_mounted_folders".equals(g)) {
                    bool4 = C3277d.a().a(jVar);
                } else if ("limit".equals(g)) {
                    l = (Long) C3277d.d(C3277d.h()).a(jVar);
                } else if ("shared_link".equals(g)) {
                    c0714k0 = (C0714k0) C3277d.e(C0714k0.a.b).a(jVar);
                } else if ("include_property_groups".equals(g)) {
                    gVar = (ax.E4.g) C3277d.d(g.b.b).a(jVar);
                } else if ("include_non_downloadable_files".equals(g)) {
                    bool5 = C3277d.a().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            F f = new F(str2, bool.booleanValue(), bool2.booleanValue(), bool6.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), l, c0714k0, gVar, bool5.booleanValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(f, f.a());
            return f;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(F f, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(f.a, gVar);
            gVar.o("recursive");
            C3277d.a().k(Boolean.valueOf(f.b), gVar);
            gVar.o("include_media_info");
            C3277d.a().k(Boolean.valueOf(f.c), gVar);
            gVar.o("include_deleted");
            C3277d.a().k(Boolean.valueOf(f.d), gVar);
            gVar.o("include_has_explicit_shared_members");
            C3277d.a().k(Boolean.valueOf(f.e), gVar);
            gVar.o("include_mounted_folders");
            C3277d.a().k(Boolean.valueOf(f.f), gVar);
            if (f.g != null) {
                gVar.o("limit");
                C3277d.d(C3277d.h()).k(f.g, gVar);
            }
            if (f.h != null) {
                gVar.o("shared_link");
                C3277d.e(C0714k0.a.b).k(f.h, gVar);
            }
            if (f.i != null) {
                gVar.o("include_property_groups");
                C3277d.d(g.b.b).k(f.i, gVar);
            }
            gVar.o("include_non_downloadable_files");
            C3277d.a().k(Boolean.valueOf(f.j), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public F(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, C0714k0 c0714k0, ax.E4.g gVar, boolean z6) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        if (l != null) {
            if (l.longValue() < 1) {
                throw new IllegalArgumentException("Number 'limit' is smaller than 1L");
            }
            if (l.longValue() > 2000) {
                throw new IllegalArgumentException("Number 'limit' is larger than 2000L");
            }
        }
        this.g = l;
        this.h = c0714k0;
        this.i = gVar;
        this.j = z6;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        F f;
        String str;
        String str2;
        Long l;
        Long l2;
        C0714k0 c0714k0;
        C0714k0 c0714k02;
        ax.E4.g gVar;
        ax.E4.g gVar2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (f = (F) obj).a) || str.equals(str2)) && this.b == f.b && this.c == f.c && this.d == f.d && this.e == f.e && this.f == f.f && (((l = this.g) == (l2 = f.g) || (l != null && l.equals(l2))) && (((c0714k0 = this.h) == (c0714k02 = f.h) || (c0714k0 != null && c0714k0.equals(c0714k02))) && (((gVar = this.i) == (gVar2 = f.i) || (gVar != null && gVar.equals(gVar2))) && this.j == f.j)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j)});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public F(String str) {
        this(str, false, false, false, false, true, null, null, null, true);
    }
}

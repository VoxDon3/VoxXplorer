package ax.G4;

import ax.E4.g;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: ax.G4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0737z {
    protected final String a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    protected final ax.E4.g e;

    /* renamed from: ax.G4.z$a */
    static class a extends ax.v4.e<C0737z> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0737z s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            ax.E4.g gVar = null;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("path".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("include_media_info".equals(g)) {
                    bool = C3277d.a().a(jVar);
                } else if ("include_deleted".equals(g)) {
                    bool2 = C3277d.a().a(jVar);
                } else if ("include_has_explicit_shared_members".equals(g)) {
                    bool3 = C3277d.a().a(jVar);
                } else if ("include_property_groups".equals(g)) {
                    gVar = (ax.E4.g) C3277d.d(g.b.b).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"path\" missing.");
            }
            C0737z c0737z = new C0737z(str2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), gVar);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0737z, c0737z.a());
            return c0737z;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0737z c0737z, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("path");
            C3277d.f().k(c0737z.a, gVar);
            gVar.o("include_media_info");
            C3277d.a().k(Boolean.valueOf(c0737z.b), gVar);
            gVar.o("include_deleted");
            C3277d.a().k(Boolean.valueOf(c0737z.c), gVar);
            gVar.o("include_has_explicit_shared_members");
            C3277d.a().k(Boolean.valueOf(c0737z.d), gVar);
            if (c0737z.e != null) {
                gVar.o("include_property_groups");
                C3277d.d(g.b.b).k(c0737z.e, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0737z(String str, boolean z, boolean z2, boolean z3, ax.E4.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'path' is null");
        }
        if (!Pattern.matches("(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)", str)) {
            throw new IllegalArgumentException("String 'path' does not match pattern");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = gVar;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        C0737z c0737z;
        String str;
        String str2;
        ax.E4.g gVar;
        ax.E4.g gVar2;
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass().equals(getClass()) && ((str = this.a) == (str2 = (c0737z = (C0737z) obj).a) || str.equals(str2)) && this.b == c0737z.b && this.c == c0737z.c && this.d == c0737z.d && ((gVar = this.e) == (gVar2 = c0737z.e) || (gVar != null && gVar.equals(gVar2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.e});
    }

    public String toString() {
        return a.b.j(this, false);
    }

    public C0737z(String str) {
        this(str, false, false, false, null);
    }
}

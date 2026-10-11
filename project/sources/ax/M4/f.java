package ax.M4;

import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f {
    protected final String a;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final String e;

    public static class a extends ax.v4.e<f> {
        public static final a b = new a();

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public f s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("given_name".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("surname".equals(g)) {
                    str3 = C3277d.f().a(jVar);
                } else if ("familiar_name".equals(g)) {
                    str4 = C3277d.f().a(jVar);
                } else if ("display_name".equals(g)) {
                    str5 = C3277d.f().a(jVar);
                } else if ("abbreviated_name".equals(g)) {
                    str6 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"given_name\" missing.");
            }
            if (str3 == null) {
                throw new ax.T4.i(jVar, "Required field \"surname\" missing.");
            }
            if (str4 == null) {
                throw new ax.T4.i(jVar, "Required field \"familiar_name\" missing.");
            }
            if (str5 == null) {
                throw new ax.T4.i(jVar, "Required field \"display_name\" missing.");
            }
            if (str6 == null) {
                throw new ax.T4.i(jVar, "Required field \"abbreviated_name\" missing.");
            }
            f fVar = new f(str2, str3, str4, str5, str6);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(fVar, fVar.b());
            return fVar;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(f fVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("given_name");
            C3277d.f().k(fVar.a, gVar);
            gVar.o("surname");
            C3277d.f().k(fVar.b, gVar);
            gVar.o("familiar_name");
            C3277d.f().k(fVar.c, gVar);
            gVar.o("display_name");
            C3277d.f().k(fVar.d, gVar);
            gVar.o("abbreviated_name");
            C3277d.f().k(fVar.e, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public f(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'givenName' is null");
        }
        this.a = str;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value for 'surname' is null");
        }
        this.b = str2;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value for 'familiarName' is null");
        }
        this.c = str3;
        if (str4 == null) {
            throw new IllegalArgumentException("Required value for 'displayName' is null");
        }
        this.d = str4;
        if (str5 == null) {
            throw new IllegalArgumentException("Required value for 'abbreviatedName' is null");
        }
        this.e = str5;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        f fVar = (f) obj;
        String str9 = this.a;
        String str10 = fVar.a;
        return (str9 == str10 || str9.equals(str10)) && ((str = this.b) == (str2 = fVar.b) || str.equals(str2)) && (((str3 = this.c) == (str4 = fVar.c) || str3.equals(str4)) && (((str5 = this.d) == (str6 = fVar.d) || str5.equals(str6)) && ((str7 = this.e) == (str8 = fVar.e) || str7.equals(str8))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

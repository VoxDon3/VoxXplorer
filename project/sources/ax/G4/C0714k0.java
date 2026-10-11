package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0714k0 {
    protected final String a;
    protected final String b;

    /* renamed from: ax.G4.k0$a */
    static class a extends ax.v4.e<C0714k0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0714k0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            String str3 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("url".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else if ("password".equals(g)) {
                    str3 = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"url\" missing.");
            }
            C0714k0 c0714k0 = new C0714k0(str2, str3);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0714k0, c0714k0.a());
            return c0714k0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0714k0 c0714k0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("url");
            C3277d.f().k(c0714k0.a, gVar);
            if (c0714k0.b != null) {
                gVar.o("password");
                C3277d.d(C3277d.f()).k(c0714k0.b, gVar);
            }
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0714k0(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'url' is null");
        }
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        C0714k0 c0714k0 = (C0714k0) obj;
        String str3 = this.a;
        String str4 = c0714k0.a;
        return (str3 == str4 || str3.equals(str4)) && ((str = this.b) == (str2 = c0714k0.b) || (str != null && str.equals(str2)));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

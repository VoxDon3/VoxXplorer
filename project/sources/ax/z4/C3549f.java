package ax.z4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.z4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3549f {
    protected final String a;

    /* renamed from: ax.z4.f$a */
    public static class a extends ax.v4.e<C3549f> {
        public static final a b = new a();

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C3549f s(j jVar, boolean z) throws IOException, i {
            String str;
            String str2 = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("required_scope".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new i(jVar, "Required field \"required_scope\" missing.");
            }
            C3549f c3549f = new C3549f(str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c3549f, c3549f.a());
            return c3549f;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C3549f c3549f, g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("required_scope");
            C3277d.f().k(c3549f.a, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C3549f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'requiredScope' is null");
        }
        this.a = str;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        String str = this.a;
        String str2 = ((C3549f) obj).a;
        return str == str2 || str.equals(str2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0718m0 {
    protected final String a;

    /* renamed from: ax.G4.m0$a */
    static class a extends ax.v4.e<C0718m0> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0718m0 s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("target".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"target\" missing.");
            }
            C0718m0 c0718m0 = new C0718m0(str2);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0718m0, c0718m0.a());
            return c0718m0;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0718m0 c0718m0, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("target");
            C3277d.f().k(c0718m0.a, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0718m0(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required value for 'target' is null");
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
        String str2 = ((C0718m0) obj).a;
        return str == str2 || str.equals(str2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

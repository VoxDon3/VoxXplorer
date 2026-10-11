package ax.G4;

import ax.G4.P;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Z extends C0732u {
    protected final P a;

    static class a extends ax.v4.e<Z> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Z s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            P p = null;
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
                if ("metadata".equals(g)) {
                    p = P.a.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (p == null) {
                throw new ax.T4.i(jVar, "Required field \"metadata\" missing.");
            }
            Z z2 = new Z(p);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(z2, z2.b());
            return z2;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(Z z, ax.T4.g gVar, boolean z2) throws IOException, ax.T4.f {
            if (!z2) {
                gVar.o0();
            }
            gVar.o("metadata");
            P.a.b.k(z.a, gVar);
            if (z2) {
                return;
            }
            gVar.m();
        }
    }

    public Z(P p) {
        if (p == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.a = p;
    }

    public P a() {
        return this.a;
    }

    public String b() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        P p = this.a;
        P p2 = ((Z) obj).a;
        return p == p2 || p.equals(p2);
    }

    @Override // ax.G4.C0732u
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(new Object[]{this.a});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

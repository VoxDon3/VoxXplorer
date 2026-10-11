package ax.G4;

import ax.G4.P;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0711j extends C0732u {
    protected final P a;

    /* renamed from: ax.G4.j$a */
    static class a extends ax.v4.e<C0711j> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0711j s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
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
            C0711j c0711j = new C0711j(p);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(c0711j, c0711j.a());
            return c0711j;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(C0711j c0711j, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("metadata");
            P.a.b.k(c0711j.a, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public C0711j(P p) {
        if (p == null) {
            throw new IllegalArgumentException("Required value for 'metadata' is null");
        }
        this.a = p;
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
        P p = this.a;
        P p2 = ((C0711j) obj).a;
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

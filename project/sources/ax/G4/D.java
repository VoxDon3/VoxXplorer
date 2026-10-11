package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class D {
    protected final double a;
    protected final double b;

    static class a extends ax.v4.e<D> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public D s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Double d = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            Double d2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("latitude".equals(g)) {
                    d = C3277d.b().a(jVar);
                } else if ("longitude".equals(g)) {
                    d2 = C3277d.b().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (d == null) {
                throw new ax.T4.i(jVar, "Required field \"latitude\" missing.");
            }
            if (d2 == null) {
                throw new ax.T4.i(jVar, "Required field \"longitude\" missing.");
            }
            D d3 = new D(d.doubleValue(), d2.doubleValue());
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(d3, d3.a());
            return d3;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(D d, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("latitude");
            C3277d.b().k(Double.valueOf(d.a), gVar);
            gVar.o("longitude");
            C3277d.b().k(Double.valueOf(d.b), gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public D(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public String a() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            D d = (D) obj;
            if (this.a == d.a && this.b == d.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Double.valueOf(this.b)});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

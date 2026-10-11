package ax.M4;

import ax.M4.g;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3275b;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h {
    protected final long a;
    protected final g b;

    static class a extends ax.v4.e<h> {
        public static final a b = new a();

        a() {
        }

        @Override // ax.v4.e
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public h s(ax.T4.j jVar, boolean z) throws IOException, ax.T4.i {
            String str;
            Long l = null;
            if (z) {
                str = null;
            } else {
                AbstractC3276c.h(jVar);
                str = AbstractC3274a.q(jVar);
            }
            if (str != null) {
                throw new ax.T4.i(jVar, "No subtype found that matches tag: \"" + str + "\"");
            }
            g gVar = null;
            while (jVar.j() == m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("used".equals(g)) {
                    l = C3277d.i().a(jVar);
                } else if ("allocation".equals(g)) {
                    gVar = g.b.b.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (l == null) {
                throw new ax.T4.i(jVar, "Required field \"used\" missing.");
            }
            if (gVar == null) {
                throw new ax.T4.i(jVar, "Required field \"allocation\" missing.");
            }
            h hVar = new h(l.longValue(), gVar);
            if (!z) {
                AbstractC3276c.e(jVar);
            }
            C3275b.a(hVar, hVar.c());
            return hVar;
        }

        @Override // ax.v4.e
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void t(h hVar, ax.T4.g gVar, boolean z) throws IOException, ax.T4.f {
            if (!z) {
                gVar.o0();
            }
            gVar.o("used");
            C3277d.i().k(Long.valueOf(hVar.a), gVar);
            gVar.o("allocation");
            g.b.b.k(hVar.b, gVar);
            if (z) {
                return;
            }
            gVar.m();
        }
    }

    public h(long j, g gVar) {
        this.a = j;
        if (gVar == null) {
            throw new IllegalArgumentException("Required value for 'allocation' is null");
        }
        this.b = gVar;
    }

    public g a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return a.b.j(this, true);
    }

    public boolean equals(Object obj) {
        g gVar;
        g gVar2;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            h hVar = (h) obj;
            if (this.a == hVar.a && ((gVar = this.b) == (gVar2 = hVar.b) || gVar.equals(gVar2))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }

    public String toString() {
        return a.b.j(this, false);
    }
}

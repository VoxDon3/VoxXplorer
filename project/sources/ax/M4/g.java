package ax.M4;

import ax.M4.e;
import ax.M4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {
    public static final g d = new g().j(c.OTHER);
    private c a;
    private e b;
    private j c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.TEAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b extends ax.v4.f<g> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public g a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            if (jVar.j() == m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            g e = "individual".equals(q) ? g.e(e.a.b.s(jVar, true)) : "team".equals(q) ? g.i(j.a.b.s(jVar, true)) : g.d;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return e;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(g gVar, ax.T4.g gVar2) throws IOException, ax.T4.f {
            int i = a.a[gVar.h().ordinal()];
            if (i == 1) {
                gVar2.o0();
                r("individual", gVar2);
                e.a.b.t(gVar.b, gVar2, true);
                gVar2.m();
                return;
            }
            if (i != 2) {
                gVar2.s0("other");
                return;
            }
            gVar2.o0();
            r("team", gVar2);
            j.a.b.t(gVar.c, gVar2, true);
            gVar2.m();
        }
    }

    public enum c {
        INDIVIDUAL,
        TEAM,
        OTHER
    }

    private g() {
    }

    public static g e(e eVar) {
        if (eVar != null) {
            return new g().k(c.INDIVIDUAL, eVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static g i(j jVar) {
        if (jVar != null) {
            return new g().l(c.TEAM, jVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private g j(c cVar) {
        g gVar = new g();
        gVar.a = cVar;
        return gVar;
    }

    private g k(c cVar, e eVar) {
        g gVar = new g();
        gVar.a = cVar;
        gVar.b = eVar;
        return gVar;
    }

    private g l(c cVar, j jVar) {
        g gVar = new g();
        gVar.a = cVar;
        gVar.c = jVar;
        return gVar;
    }

    public e c() {
        if (this.a == c.INDIVIDUAL) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.INDIVIDUAL, but was Tag." + this.a.name());
    }

    public j d() {
        if (this.a == c.TEAM) {
            return this.c;
        }
        throw new IllegalStateException("Invalid tag: required Tag.TEAM, but was Tag." + this.a.name());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        c cVar = this.a;
        if (cVar != gVar.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            e eVar = this.b;
            e eVar2 = gVar.b;
            return eVar == eVar2 || eVar.equals(eVar2);
        }
        if (i != 2) {
            return i == 3;
        }
        j jVar = this.c;
        j jVar2 = gVar.c;
        return jVar == jVar2 || jVar.equals(jVar2);
    }

    public boolean f() {
        return this.a == c.INDIVIDUAL;
    }

    public boolean g() {
        return this.a == c.TEAM;
    }

    public c h() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

package ax.G4;

import ax.G4.P;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q {
    public static final Q c = new Q().f(c.OTHER);
    private c a;
    private P b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.METADATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends ax.v4.f<Q> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public Q a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            Q q2;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
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
            if ("metadata".equals(q)) {
                AbstractC3276c.f("metadata", jVar);
                q2 = Q.d(P.a.b.a(jVar));
            } else {
                q2 = Q.c;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return q2;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(Q q, ax.T4.g gVar) throws IOException, ax.T4.f {
            if (a.a[q.e().ordinal()] != 1) {
                gVar.s0("other");
                return;
            }
            gVar.o0();
            r("metadata", gVar);
            gVar.o("metadata");
            P.a.b.k(q.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        METADATA,
        OTHER
    }

    private Q() {
    }

    public static Q d(P p) {
        if (p != null) {
            return new Q().g(c.METADATA, p);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private Q f(c cVar) {
        Q q = new Q();
        q.a = cVar;
        return q;
    }

    private Q g(c cVar, P p) {
        Q q = new Q();
        q.a = cVar;
        q.b = p;
        return q;
    }

    public P b() {
        if (this.a == c.METADATA) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.METADATA, but was Tag." + this.a.name());
    }

    public boolean c() {
        return this.a == c.METADATA;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof Q)) {
            return false;
        }
        Q q = (Q) obj;
        c cVar = this.a;
        if (cVar != q.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2;
        }
        P p = this.b;
        P p2 = q.b;
        return p == p2 || p.equals(p2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

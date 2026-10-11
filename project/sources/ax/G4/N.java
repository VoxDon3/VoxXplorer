package ax.G4;

import ax.G4.O;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class N {
    public static final N c = new N().d(c.PENDING);
    private c a;
    private O b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.METADATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends ax.v4.f<N> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public N a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            N b2;
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
            if ("pending".equals(q)) {
                b2 = N.c;
            } else {
                if (!"metadata".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                AbstractC3276c.f("metadata", jVar);
                b2 = N.b(O.a.b.a(jVar));
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return b2;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(N n, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[n.c().ordinal()];
            if (i == 1) {
                gVar.s0("pending");
                return;
            }
            if (i != 2) {
                throw new IllegalArgumentException("Unrecognized tag: " + n.c());
            }
            gVar.o0();
            r("metadata", gVar);
            gVar.o("metadata");
            O.a.b.k(n.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        PENDING,
        METADATA
    }

    private N() {
    }

    public static N b(O o) {
        if (o != null) {
            return new N().e(c.METADATA, o);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private N d(c cVar) {
        N n = new N();
        n.a = cVar;
        return n;
    }

    private N e(c cVar, O o) {
        N n = new N();
        n.a = cVar;
        n.b = o;
        return n;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        c cVar = this.a;
        if (cVar != n.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            O o = this.b;
            O o2 = n.b;
            if (o != o2 && !o.equals(o2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

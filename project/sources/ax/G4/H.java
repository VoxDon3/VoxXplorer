package ax.G4;

import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H {
    public static final H c = new H().d(c.RESET);
    public static final H d = new H().d(c.OTHER);
    private c a;
    private M b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b extends ax.v4.f<H> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public H a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            H h;
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
            if ("path".equals(q)) {
                AbstractC3276c.f("path", jVar);
                h = H.b(M.b.b.a(jVar));
            } else {
                h = "reset".equals(q) ? H.c : H.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return h;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(H h, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[h.c().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    gVar.s0("other");
                    return;
                } else {
                    gVar.s0("reset");
                    return;
                }
            }
            gVar.o0();
            r("path", gVar);
            gVar.o("path");
            M.b.b.k(h.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        PATH,
        RESET,
        OTHER
    }

    private H() {
    }

    public static H b(M m) {
        if (m != null) {
            return new H().e(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private H d(c cVar) {
        H h = new H();
        h.a = cVar;
        return h;
    }

    private H e(c cVar, M m) {
        H h = new H();
        h.a = cVar;
        h.b = m;
        return h;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        c cVar = this.a;
        if (cVar != h.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2 || i == 3;
        }
        M m = this.b;
        M m2 = h.b;
        return m == m2 || m.equals(m2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

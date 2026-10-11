package ax.G4;

import ax.E4.b;
import ax.G4.P0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 {
    public static final v0 d = new v0().h(c.PAYLOAD_TOO_LARGE);
    public static final v0 e = new v0().h(c.CONTENT_HASH_MISMATCH);
    public static final v0 f = new v0().h(c.OTHER);
    private c a;
    private P0 b;
    private ax.E4.b c;

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
                a[c.PROPERTIES_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.PAYLOAD_TOO_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.CONTENT_HASH_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static class b extends ax.v4.f<v0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public v0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            v0 v0Var;
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
                v0Var = v0.e(P0.a.b.s(jVar, true));
            } else if ("properties_error".equals(q)) {
                AbstractC3276c.f("properties_error", jVar);
                v0Var = v0.f(b.C0073b.b.a(jVar));
            } else {
                v0Var = "payload_too_large".equals(q) ? v0.d : "content_hash_mismatch".equals(q) ? v0.e : v0.f;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return v0Var;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(v0 v0Var, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[v0Var.g().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("path", gVar);
                P0.a.b.t(v0Var.b, gVar, true);
                gVar.m();
                return;
            }
            if (i == 2) {
                gVar.o0();
                r("properties_error", gVar);
                gVar.o("properties_error");
                b.C0073b.b.k(v0Var.c, gVar);
                gVar.m();
                return;
            }
            if (i == 3) {
                gVar.s0("payload_too_large");
            } else if (i != 4) {
                gVar.s0("other");
            } else {
                gVar.s0("content_hash_mismatch");
            }
        }
    }

    public enum c {
        PATH,
        PROPERTIES_ERROR,
        PAYLOAD_TOO_LARGE,
        CONTENT_HASH_MISMATCH,
        OTHER
    }

    private v0() {
    }

    public static v0 e(P0 p0) {
        if (p0 != null) {
            return new v0().i(c.PATH, p0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static v0 f(ax.E4.b bVar) {
        if (bVar != null) {
            return new v0().j(c.PROPERTIES_ERROR, bVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private v0 h(c cVar) {
        v0 v0Var = new v0();
        v0Var.a = cVar;
        return v0Var;
    }

    private v0 i(c cVar, P0 p0) {
        v0 v0Var = new v0();
        v0Var.a = cVar;
        v0Var.b = p0;
        return v0Var;
    }

    private v0 j(c cVar, ax.E4.b bVar) {
        v0 v0Var = new v0();
        v0Var.a = cVar;
        v0Var.c = bVar;
        return v0Var;
    }

    public P0 c() {
        if (this.a == c.PATH) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.PATH, but was Tag." + this.a.name());
    }

    public boolean d() {
        return this.a == c.PATH;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        c cVar = this.a;
        if (cVar != v0Var.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            P0 p0 = this.b;
            P0 p02 = v0Var.b;
            return p0 == p02 || p0.equals(p02);
        }
        if (i != 2) {
            return i == 3 || i == 4 || i == 5;
        }
        ax.E4.b bVar = this.c;
        ax.E4.b bVar2 = v0Var.c;
        return bVar == bVar2 || bVar.equals(bVar2);
    }

    public c g() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

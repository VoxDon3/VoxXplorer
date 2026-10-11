package ax.G4;

import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721o {
    public static final C0721o c = new C0721o().f(c.UNSUPPORTED_FILE);
    public static final C0721o d = new C0721o().f(c.OTHER);
    private c a;
    private M b;

    /* renamed from: ax.G4.o$a */
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
                a[c.UNSUPPORTED_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.G4.o$b */
    static class b extends ax.v4.f<C0721o> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0721o a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            C0721o c0721o;
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
                c0721o = C0721o.d(M.b.b.a(jVar));
            } else {
                c0721o = "unsupported_file".equals(q) ? C0721o.c : C0721o.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c0721o;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C0721o c0721o, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[c0721o.e().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    gVar.s0("other");
                    return;
                } else {
                    gVar.s0("unsupported_file");
                    return;
                }
            }
            gVar.o0();
            r("path", gVar);
            gVar.o("path");
            M.b.b.k(c0721o.b, gVar);
            gVar.m();
        }
    }

    /* renamed from: ax.G4.o$c */
    public enum c {
        PATH,
        UNSUPPORTED_FILE,
        OTHER
    }

    private C0721o() {
    }

    public static C0721o d(M m) {
        if (m != null) {
            return new C0721o().g(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C0721o f(c cVar) {
        C0721o c0721o = new C0721o();
        c0721o.a = cVar;
        return c0721o;
    }

    private C0721o g(c cVar, M m) {
        C0721o c0721o = new C0721o();
        c0721o.a = cVar;
        c0721o.b = m;
        return c0721o;
    }

    public M b() {
        if (this.a == c.PATH) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.PATH, but was Tag." + this.a.name());
    }

    public boolean c() {
        return this.a == c.PATH;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0721o)) {
            return false;
        }
        C0721o c0721o = (C0721o) obj;
        c cVar = this.a;
        if (cVar != c0721o.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2 || i == 3;
        }
        M m = this.b;
        M m2 = c0721o.b;
        return m == m2 || m.equals(m2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

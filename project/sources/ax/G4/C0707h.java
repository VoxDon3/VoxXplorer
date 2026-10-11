package ax.G4;

import ax.G4.M;
import ax.G4.S0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707h {
    public static final C0707h d = new C0707h().j(c.TOO_MANY_WRITE_OPERATIONS);
    public static final C0707h e = new C0707h().j(c.TOO_MANY_FILES);
    public static final C0707h f = new C0707h().j(c.OTHER);
    private c a;
    private M b;
    private S0 c;

    /* renamed from: ax.G4.h$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.PATH_LOOKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.PATH_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.TOO_MANY_WRITE_OPERATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.TOO_MANY_FILES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: ax.G4.h$b */
    static class b extends ax.v4.f<C0707h> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0707h a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            C0707h c0707h;
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
            if ("path_lookup".equals(q)) {
                AbstractC3276c.f("path_lookup", jVar);
                c0707h = C0707h.g(M.b.b.a(jVar));
            } else if ("path_write".equals(q)) {
                AbstractC3276c.f("path_write", jVar);
                c0707h = C0707h.h(S0.b.b.a(jVar));
            } else {
                c0707h = "too_many_write_operations".equals(q) ? C0707h.d : "too_many_files".equals(q) ? C0707h.e : C0707h.f;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c0707h;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C0707h c0707h, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[c0707h.i().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("path_lookup", gVar);
                gVar.o("path_lookup");
                M.b.b.k(c0707h.b, gVar);
                gVar.m();
                return;
            }
            if (i == 2) {
                gVar.o0();
                r("path_write", gVar);
                gVar.o("path_write");
                S0.b.b.k(c0707h.c, gVar);
                gVar.m();
                return;
            }
            if (i == 3) {
                gVar.s0("too_many_write_operations");
            } else if (i != 4) {
                gVar.s0("other");
            } else {
                gVar.s0("too_many_files");
            }
        }
    }

    /* renamed from: ax.G4.h$c */
    public enum c {
        PATH_LOOKUP,
        PATH_WRITE,
        TOO_MANY_WRITE_OPERATIONS,
        TOO_MANY_FILES,
        OTHER
    }

    private C0707h() {
    }

    public static C0707h g(M m) {
        if (m != null) {
            return new C0707h().k(c.PATH_LOOKUP, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static C0707h h(S0 s0) {
        if (s0 != null) {
            return new C0707h().l(c.PATH_WRITE, s0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C0707h j(c cVar) {
        C0707h c0707h = new C0707h();
        c0707h.a = cVar;
        return c0707h;
    }

    private C0707h k(c cVar, M m) {
        C0707h c0707h = new C0707h();
        c0707h.a = cVar;
        c0707h.b = m;
        return c0707h;
    }

    private C0707h l(c cVar, S0 s0) {
        C0707h c0707h = new C0707h();
        c0707h.a = cVar;
        c0707h.c = s0;
        return c0707h;
    }

    public M c() {
        if (this.a == c.PATH_LOOKUP) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.PATH_LOOKUP, but was Tag." + this.a.name());
    }

    public S0 d() {
        if (this.a == c.PATH_WRITE) {
            return this.c;
        }
        throw new IllegalStateException("Invalid tag: required Tag.PATH_WRITE, but was Tag." + this.a.name());
    }

    public boolean e() {
        return this.a == c.PATH_LOOKUP;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0707h)) {
            return false;
        }
        C0707h c0707h = (C0707h) obj;
        c cVar = this.a;
        if (cVar != c0707h.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            M m = this.b;
            M m2 = c0707h.b;
            return m == m2 || m.equals(m2);
        }
        if (i != 2) {
            return i == 3 || i == 4 || i == 5;
        }
        S0 s0 = this.c;
        S0 s02 = c0707h.c;
        return s0 == s02 || s0.equals(s02);
    }

    public boolean f() {
        return this.a == c.PATH_WRITE;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public c i() {
        return this.a;
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

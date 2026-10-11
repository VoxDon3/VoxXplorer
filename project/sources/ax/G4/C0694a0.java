package ax.G4;

import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694a0 {
    public static final C0694a0 d = new C0694a0().g(c.INTERNAL_ERROR);
    public static final C0694a0 e = new C0694a0().g(c.OTHER);
    private c a;
    private M b;
    private String c;

    /* renamed from: ax.G4.a0$a */
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
                a[c.INVALID_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.INTERNAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ax.G4.a0$b */
    static class b extends ax.v4.f<C0694a0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0694a0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            C0694a0 c0694a0;
            String str;
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
                c0694a0 = C0694a0.e(M.b.b.a(jVar));
            } else if ("invalid_argument".equals(q)) {
                if (jVar.j() != ax.T4.m.END_OBJECT) {
                    AbstractC3276c.f("invalid_argument", jVar);
                    str = (String) C3277d.d(C3277d.f()).a(jVar);
                } else {
                    str = null;
                }
                c0694a0 = str == null ? C0694a0.c() : C0694a0.d(str);
            } else {
                c0694a0 = "internal_error".equals(q) ? C0694a0.d : C0694a0.e;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c0694a0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C0694a0 c0694a0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[c0694a0.f().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("path", gVar);
                gVar.o("path");
                M.b.b.k(c0694a0.b, gVar);
                gVar.m();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    gVar.s0("other");
                    return;
                } else {
                    gVar.s0("internal_error");
                    return;
                }
            }
            gVar.o0();
            r("invalid_argument", gVar);
            gVar.o("invalid_argument");
            C3277d.d(C3277d.f()).k(c0694a0.c, gVar);
            gVar.m();
        }
    }

    /* renamed from: ax.G4.a0$c */
    public enum c {
        PATH,
        INVALID_ARGUMENT,
        INTERNAL_ERROR,
        OTHER
    }

    private C0694a0() {
    }

    public static C0694a0 c() {
        return d(null);
    }

    public static C0694a0 d(String str) {
        return new C0694a0().h(c.INVALID_ARGUMENT, str);
    }

    public static C0694a0 e(M m) {
        if (m != null) {
            return new C0694a0().i(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C0694a0 g(c cVar) {
        C0694a0 c0694a0 = new C0694a0();
        c0694a0.a = cVar;
        return c0694a0;
    }

    private C0694a0 h(c cVar, String str) {
        C0694a0 c0694a0 = new C0694a0();
        c0694a0.a = cVar;
        c0694a0.c = str;
        return c0694a0;
    }

    private C0694a0 i(c cVar, M m) {
        C0694a0 c0694a0 = new C0694a0();
        c0694a0.a = cVar;
        c0694a0.b = m;
        return c0694a0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0694a0)) {
            return false;
        }
        C0694a0 c0694a0 = (C0694a0) obj;
        c cVar = this.a;
        if (cVar != c0694a0.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            M m = this.b;
            M m2 = c0694a0.b;
            return m == m2 || m.equals(m2);
        }
        if (i != 2) {
            return i == 3 || i == 4;
        }
        String str = this.c;
        String str2 = c0694a0.c;
        return str == str2 || (str != null && str.equals(str2));
    }

    public c f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

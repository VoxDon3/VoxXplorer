package ax.G4;

import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722o0 {
    public static final C0722o0 c = new C0722o0().d(c.UNSUPPORTED_EXTENSION);
    public static final C0722o0 d = new C0722o0().d(c.UNSUPPORTED_IMAGE);
    public static final C0722o0 e = new C0722o0().d(c.CONVERSION_ERROR);
    private c a;
    private M b;

    /* renamed from: ax.G4.o0$a */
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
                a[c.UNSUPPORTED_EXTENSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.UNSUPPORTED_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.CONVERSION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ax.G4.o0$b */
    static class b extends ax.v4.f<C0722o0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0722o0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            C0722o0 c0722o0;
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
                c0722o0 = C0722o0.b(M.b.b.a(jVar));
            } else if ("unsupported_extension".equals(q)) {
                c0722o0 = C0722o0.c;
            } else if ("unsupported_image".equals(q)) {
                c0722o0 = C0722o0.d;
            } else {
                if (!"conversion_error".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                c0722o0 = C0722o0.e;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c0722o0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C0722o0 c0722o0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[c0722o0.c().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("path", gVar);
                gVar.o("path");
                M.b.b.k(c0722o0.b, gVar);
                gVar.m();
                return;
            }
            if (i == 2) {
                gVar.s0("unsupported_extension");
                return;
            }
            if (i == 3) {
                gVar.s0("unsupported_image");
            } else {
                if (i == 4) {
                    gVar.s0("conversion_error");
                    return;
                }
                throw new IllegalArgumentException("Unrecognized tag: " + c0722o0.c());
            }
        }
    }

    /* renamed from: ax.G4.o0$c */
    public enum c {
        PATH,
        UNSUPPORTED_EXTENSION,
        UNSUPPORTED_IMAGE,
        CONVERSION_ERROR
    }

    private C0722o0() {
    }

    public static C0722o0 b(M m) {
        if (m != null) {
            return new C0722o0().e(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C0722o0 d(c cVar) {
        C0722o0 c0722o0 = new C0722o0();
        c0722o0.a = cVar;
        return c0722o0;
    }

    private C0722o0 e(c cVar, M m) {
        C0722o0 c0722o0 = new C0722o0();
        c0722o0.a = cVar;
        c0722o0.b = m;
        return c0722o0;
    }

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0722o0)) {
            return false;
        }
        C0722o0 c0722o0 = (C0722o0) obj;
        c cVar = this.a;
        if (cVar != c0722o0.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1) {
            return i == 2 || i == 3 || i == 4;
        }
        M m = this.b;
        M m2 = c0722o0.b;
        return m == m2 || m.equals(m2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

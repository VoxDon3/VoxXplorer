package ax.G4;

import ax.E4.f;
import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J {
    public static final J d = new J().h(c.OTHER);
    private c a;
    private M b;
    private ax.E4.f c;

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
                a[c.TEMPLATE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b extends ax.v4.f<J> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public J a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            J j;
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
                j = J.e(M.b.b.a(jVar));
            } else if ("template_error".equals(q)) {
                AbstractC3276c.f("template_error", jVar);
                j = J.g(f.b.b.a(jVar));
            } else {
                j = J.d;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return j;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(J j, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[j.f().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("path", gVar);
                gVar.o("path");
                M.b.b.k(j.b, gVar);
                gVar.m();
                return;
            }
            if (i != 2) {
                gVar.s0("other");
                return;
            }
            gVar.o0();
            r("template_error", gVar);
            gVar.o("template_error");
            f.b.b.k(j.c, gVar);
            gVar.m();
        }
    }

    public enum c {
        PATH,
        TEMPLATE_ERROR,
        OTHER
    }

    private J() {
    }

    public static J e(M m) {
        if (m != null) {
            return new J().i(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static J g(ax.E4.f fVar) {
        if (fVar != null) {
            return new J().j(c.TEMPLATE_ERROR, fVar);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private J h(c cVar) {
        J j = new J();
        j.a = cVar;
        return j;
    }

    private J i(c cVar, M m) {
        J j = new J();
        j.a = cVar;
        j.b = m;
        return j;
    }

    private J j(c cVar, ax.E4.f fVar) {
        J j = new J();
        j.a = cVar;
        j.c = fVar;
        return j;
    }

    public M c() {
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
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        c cVar = this.a;
        if (cVar != j.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            M m = this.b;
            M m2 = j.b;
            return m == m2 || m.equals(m2);
        }
        if (i != 2) {
            return i == 3;
        }
        ax.E4.f fVar = this.c;
        ax.E4.f fVar2 = j.c;
        return fVar == fVar2 || fVar.equals(fVar2);
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

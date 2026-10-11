package ax.G4;

import ax.G4.M;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A {
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
        }
    }

    static class b extends ax.v4.f<A> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public A a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
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
            if (!"path".equals(q)) {
                throw new ax.T4.i(jVar, "Unknown tag: " + q);
            }
            AbstractC3276c.f("path", jVar);
            A d = A.d(M.b.b.a(jVar));
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return d;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(A a, ax.T4.g gVar) throws IOException, ax.T4.f {
            if (a.a[a.e().ordinal()] != 1) {
                throw new IllegalArgumentException("Unrecognized tag: " + a.e());
            }
            gVar.o0();
            r("path", gVar);
            gVar.o("path");
            M.b.b.k(a.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        PATH
    }

    private A() {
    }

    public static A d(M m) {
        if (m != null) {
            return new A().f(c.PATH, m);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private A f(c cVar, M m) {
        A a2 = new A();
        a2.a = cVar;
        a2.b = m;
        return a2;
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
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a2 = (A) obj;
        c cVar = this.a;
        if (cVar != a2.a || a.a[cVar.ordinal()] != 1) {
            return false;
        }
        M m = this.b;
        M m2 = a2.b;
        return m == m2 || m.equals(m2);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

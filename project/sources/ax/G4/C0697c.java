package ax.G4;

import ax.G4.S0;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ax.G4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697c {
    private EnumC0085c a;
    private S0 b;

    /* renamed from: ax.G4.c$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0085c.values().length];
            a = iArr;
            try {
                iArr[EnumC0085c.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: ax.G4.c$b */
    static class b extends ax.v4.f<C0697c> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0697c a(ax.T4.j jVar) throws IOException, ax.T4.i {
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
            C0697c b2 = C0697c.b(S0.b.b.a(jVar));
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return b2;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(C0697c c0697c, ax.T4.g gVar) throws IOException, ax.T4.f {
            if (a.a[c0697c.c().ordinal()] != 1) {
                throw new IllegalArgumentException("Unrecognized tag: " + c0697c.c());
            }
            gVar.o0();
            r("path", gVar);
            gVar.o("path");
            S0.b.b.k(c0697c.b, gVar);
            gVar.m();
        }
    }

    /* renamed from: ax.G4.c$c, reason: collision with other inner class name */
    public enum EnumC0085c {
        PATH
    }

    private C0697c() {
    }

    public static C0697c b(S0 s0) {
        if (s0 != null) {
            return new C0697c().d(EnumC0085c.PATH, s0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private C0697c d(EnumC0085c enumC0085c, S0 s0) {
        C0697c c0697c = new C0697c();
        c0697c.a = enumC0085c;
        c0697c.b = s0;
        return c0697c;
    }

    public EnumC0085c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0697c)) {
            return false;
        }
        C0697c c0697c = (C0697c) obj;
        EnumC0085c enumC0085c = this.a;
        if (enumC0085c != c0697c.a || a.a[enumC0085c.ordinal()] != 1) {
            return false;
        }
        S0 s0 = this.b;
        S0 s02 = c0697c.b;
        return s0 == s02 || s0.equals(s02);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}

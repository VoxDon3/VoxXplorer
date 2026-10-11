package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1117o extends A implements G {
    static final O c0 = new a(AbstractC1117o.class, 22);
    final byte[] q;

    /* renamed from: ax.Wc.o$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return AbstractC1117o.C(c1127t0.G());
        }
    }

    AbstractC1117o(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        if (z && !E(str)) {
            throw new IllegalArgumentException("'string' contains illegal characters");
        }
        this.q = ax.Nd.j.e(str);
    }

    static AbstractC1117o C(byte[] bArr) {
        return new C1122q0(bArr, false);
    }

    public static AbstractC1117o D(Object obj) {
        if (obj == null || (obj instanceof AbstractC1117o)) {
            return (AbstractC1117o) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof AbstractC1117o) {
                return (AbstractC1117o) g;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (AbstractC1117o) c0.b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static boolean E(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // ax.Wc.G
    public final String h() {
        return ax.Nd.j.b(this.q);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public final int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    final boolean r(A a2) {
        if (a2 instanceof AbstractC1117o) {
            return ax.Nd.a.b(this.q, ((AbstractC1117o) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 22, this.q);
    }

    @Override // ax.Wc.A
    final boolean t() {
        return false;
    }

    public String toString() {
        return h();
    }

    @Override // ax.Wc.A
    final int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    AbstractC1117o(byte[] bArr, boolean z) {
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
    }
}

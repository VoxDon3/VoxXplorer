package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class S extends A implements G {
    static final O c0 = new a(S.class, 26);
    final byte[] q;

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return S.C(c1127t0.G());
        }
    }

    S(byte[] bArr, boolean z) {
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
    }

    static S C(byte[] bArr) {
        return new F0(bArr, false);
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
        if (a2 instanceof S) {
            return ax.Nd.a.b(this.q, ((S) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 26, this.q);
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
}

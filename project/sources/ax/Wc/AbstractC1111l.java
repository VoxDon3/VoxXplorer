package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1111l extends A implements G {
    static final O c0 = new a(AbstractC1111l.class, 27);
    final byte[] q;

    /* renamed from: ax.Wc.l$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return AbstractC1111l.C(c1127t0.G());
        }
    }

    AbstractC1111l(byte[] bArr, boolean z) {
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
    }

    static AbstractC1111l C(byte[] bArr) {
        return new C1116n0(bArr, false);
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
        if (a2 instanceof AbstractC1111l) {
            return ax.Nd.a.b(this.q, ((AbstractC1111l) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 27, this.q);
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

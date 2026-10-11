package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1115n extends A implements G {
    static final O c0 = new a(AbstractC1115n.class, 25);
    final byte[] q;

    /* renamed from: ax.Wc.n$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return AbstractC1115n.C(c1127t0.G());
        }
    }

    AbstractC1115n(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
    }

    static AbstractC1115n C(byte[] bArr) {
        return new C1120p0(bArr, false);
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
        if (a2 instanceof AbstractC1115n) {
            return ax.Nd.a.b(this.q, ((AbstractC1115n) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 25, this.q);
    }

    @Override // ax.Wc.A
    final boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    final int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }
}

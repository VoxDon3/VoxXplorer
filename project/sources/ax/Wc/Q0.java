package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class Q0 extends J {
    Q0(int i, int i2, int i3, InterfaceC1101g interfaceC1101g) {
        super(i, i2, i3, interfaceC1101g);
    }

    @Override // ax.Wc.J
    D O(A a) {
        return new M0(a);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        A B = this.e0.g().B();
        boolean N = N();
        if (z) {
            int i = this.c0;
            if (N || B.t()) {
                i |= 32;
            }
            c1136y.t(true, i, this.d0);
        }
        if (N) {
            c1136y.k(B.w(true));
        }
        B.s(c1136y.e(), N);
    }

    @Override // ax.Wc.A
    boolean t() {
        return N() || this.e0.g().B().t();
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        A B = this.e0.g().B();
        boolean N = N();
        int w = B.w(N);
        if (N) {
            w += C1136y.f(w);
        }
        return w + (z ? C1136y.h(this.d0) : 0);
    }

    public Q0(boolean z, int i, InterfaceC1101g interfaceC1101g) {
        super(z, i, interfaceC1101g);
    }

    @Override // ax.Wc.J, ax.Wc.A
    A B() {
        return this;
    }
}

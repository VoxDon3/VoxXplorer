package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class A0 extends J {
    A0(int i, int i2, int i3, InterfaceC1101g interfaceC1101g) {
        super(i, i2, i3, interfaceC1101g);
    }

    @Override // ax.Wc.J
    D O(A a) {
        return new C1135x0(a);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        A A = this.e0.g().A();
        boolean N = N();
        if (z) {
            int i = this.c0;
            if (N || A.t()) {
                i |= 32;
            }
            c1136y.t(true, i, this.d0);
        }
        if (N) {
            c1136y.k(A.w(true));
        }
        A.s(c1136y.d(), N);
    }

    @Override // ax.Wc.A
    boolean t() {
        return N() || this.e0.g().A().t();
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        A A = this.e0.g().A();
        boolean N = N();
        int w = A.w(N);
        if (N) {
            w += C1136y.f(w);
        }
        return w + (z ? C1136y.h(this.d0) : 0);
    }

    public A0(boolean z, int i, InterfaceC1101g interfaceC1101g) {
        super(z, i, interfaceC1101g);
    }

    @Override // ax.Wc.J, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.J, ax.Wc.A
    A B() {
        return this;
    }
}

package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1098e0 extends J {
    C1098e0(int i, int i2, int i3, InterfaceC1101g interfaceC1101g) {
        super(i, i2, i3, interfaceC1101g);
    }

    @Override // ax.Wc.J
    D O(A a) {
        return new C1090a0(a);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        A g = this.e0.g();
        boolean N = N();
        if (z) {
            int i = this.c0;
            if (N || g.t()) {
                i |= 32;
            }
            c1136y.t(true, i, this.d0);
        }
        if (!N) {
            g.s(c1136y, false);
            return;
        }
        c1136y.i(128);
        g.s(c1136y, true);
        c1136y.i(0);
        c1136y.i(0);
    }

    @Override // ax.Wc.A
    boolean t() {
        return N() || this.e0.g().t();
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        A g = this.e0.g();
        boolean N = N();
        int w = g.w(N);
        if (N) {
            w += 3;
        }
        return w + (z ? C1136y.h(this.d0) : 0);
    }
}

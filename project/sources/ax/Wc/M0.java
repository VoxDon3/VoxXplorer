package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class M0 extends D {
    private int d0;

    public M0() {
        this.d0 = -1;
    }

    private int Q() throws IOException {
        if (this.d0 < 0) {
            int length = this.q.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.q[i2].g().B().w(true);
            }
            this.d0 = i;
        }
        return this.d0;
    }

    @Override // ax.Wc.D
    AbstractC1093c K() {
        return new H0(V.K(C()), false);
    }

    @Override // ax.Wc.D
    AbstractC1109k M() {
        return new J0(this);
    }

    @Override // ax.Wc.D
    AbstractC1132w N() {
        return new C1127t0(Y.I(D()));
    }

    @Override // ax.Wc.D
    E O() {
        return new O0(false, P());
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.s(z, 48);
        L0 e = c1136y.e();
        int length = this.q.length;
        int i = 0;
        if (this.d0 >= 0 || length > 16) {
            c1136y.k(Q());
            while (i < length) {
                e.u(this.q[i].g(), true);
                i++;
            }
            return;
        }
        A[] aArr = new A[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            A B = this.q[i3].g().B();
            aArr[i3] = B;
            i2 += B.w(true);
        }
        this.d0 = i2;
        c1136y.k(i2);
        while (i < length) {
            e.u(aArr[i], true);
            i++;
        }
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return C1136y.g(z, Q());
    }

    public M0(InterfaceC1101g interfaceC1101g) {
        super(interfaceC1101g);
        this.d0 = -1;
    }

    public M0(C1103h c1103h) {
        super(c1103h);
        this.d0 = -1;
    }

    M0(InterfaceC1101g[] interfaceC1101gArr, boolean z) {
        super(interfaceC1101gArr, z);
        this.d0 = -1;
    }

    @Override // ax.Wc.D, ax.Wc.A
    A B() {
        return this;
    }
}

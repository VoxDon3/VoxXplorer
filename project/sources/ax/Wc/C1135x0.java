package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1135x0 extends D {
    private int d0;

    public C1135x0() {
        this.d0 = -1;
    }

    public static C1135x0 Q(D d) {
        return (C1135x0) d.A();
    }

    private int R() throws IOException {
        if (this.d0 < 0) {
            int length = this.q.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.q[i2].g().A().w(true);
            }
            this.d0 = i;
        }
        return this.d0;
    }

    @Override // ax.Wc.D
    AbstractC1093c K() {
        return new C1110k0(V.K(C()), false);
    }

    @Override // ax.Wc.D
    AbstractC1109k M() {
        return new C1112l0(this);
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
        C1131v0 d = c1136y.d();
        int length = this.q.length;
        int i = 0;
        if (this.d0 >= 0 || length > 16) {
            c1136y.k(R());
            while (i < length) {
                this.q[i].g().A().s(d, true);
                i++;
            }
            return;
        }
        A[] aArr = new A[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            A A = this.q[i3].g().A();
            aArr[i3] = A;
            i2 += A.w(true);
        }
        this.d0 = i2;
        c1136y.k(i2);
        while (i < length) {
            aArr[i].s(d, true);
            i++;
        }
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return C1136y.g(z, R());
    }

    public C1135x0(InterfaceC1101g interfaceC1101g) {
        super(interfaceC1101g);
        this.d0 = -1;
    }

    public C1135x0(C1103h c1103h) {
        super(c1103h);
        this.d0 = -1;
    }

    public C1135x0(InterfaceC1101g[] interfaceC1101gArr) {
        super(interfaceC1101gArr);
        this.d0 = -1;
    }

    C1135x0(InterfaceC1101g[] interfaceC1101gArr, boolean z) {
        super(interfaceC1101gArr, z);
        this.d0 = -1;
    }

    @Override // ax.Wc.D, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.D, ax.Wc.A
    A B() {
        return this;
    }
}

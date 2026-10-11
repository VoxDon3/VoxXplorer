package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class O0 extends E {
    private int e0;

    public O0() {
        this.e0 = -1;
    }

    private int M() throws IOException {
        if (this.e0 < 0) {
            int length = this.q.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.q[i2].g().B().w(true);
            }
            this.e0 = i;
        }
        return this.e0;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.s(z, 49);
        L0 e = c1136y.e();
        int length = this.q.length;
        int i = 0;
        if (this.e0 >= 0 || length > 16) {
            c1136y.k(M());
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
        this.e0 = i2;
        c1136y.k(i2);
        while (i < length) {
            e.u(aArr[i], true);
            i++;
        }
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return C1136y.g(z, M());
    }

    public O0(C1103h c1103h) {
        super(c1103h, false);
        this.e0 = -1;
    }

    O0(boolean z, InterfaceC1101g[] interfaceC1101gArr) {
        super(z, interfaceC1101gArr);
        this.e0 = -1;
    }

    @Override // ax.Wc.E, ax.Wc.A
    A B() {
        return this;
    }
}

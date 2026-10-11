package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1137y0 extends E {
    private int e0;

    public C1137y0() {
        this.e0 = -1;
    }

    private static boolean M(boolean z) {
        if (z) {
            return z;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int N() throws IOException {
        if (this.e0 < 0) {
            int length = this.q.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.q[i2].g().A().w(true);
            }
            this.e0 = i;
        }
        return this.e0;
    }

    @Override // ax.Wc.E, ax.Wc.A
    A A() {
        return this.c0 ? this : super.A();
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.s(z, 49);
        C1131v0 d = c1136y.d();
        int length = this.q.length;
        int i = 0;
        if (this.e0 >= 0 || length > 16) {
            c1136y.k(N());
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
        this.e0 = i2;
        c1136y.k(i2);
        while (i < length) {
            aArr[i].s(d, true);
            i++;
        }
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return C1136y.g(z, N());
    }

    public C1137y0(InterfaceC1101g interfaceC1101g) {
        super(interfaceC1101g);
        this.e0 = -1;
    }

    C1137y0(boolean z, InterfaceC1101g[] interfaceC1101gArr) {
        super(M(z), interfaceC1101gArr);
        this.e0 = -1;
    }

    public C1137y0(InterfaceC1101g[] interfaceC1101gArr) {
        super(interfaceC1101gArr, true);
        this.e0 = -1;
    }

    @Override // ax.Wc.E, ax.Wc.A
    A B() {
        return this;
    }
}

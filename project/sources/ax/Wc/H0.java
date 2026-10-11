package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class H0 extends AbstractC1093c {
    H0(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    static void K(C1136y c1136y, boolean z, byte b, byte[] bArr, int i, int i2) throws IOException {
        c1136y.n(z, 3, b, bArr, i, i2);
    }

    static void M(C1136y c1136y, boolean z, byte[] bArr, int i, int i2) throws IOException {
        c1136y.p(z, 3, bArr, i, i2);
    }

    static int N(boolean z, int i) {
        return C1136y.g(z, i);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 3, this.q);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    @Override // ax.Wc.AbstractC1093c, ax.Wc.A
    A B() {
        return this;
    }
}

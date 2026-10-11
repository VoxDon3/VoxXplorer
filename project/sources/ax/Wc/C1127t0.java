package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1127t0 extends AbstractC1132w {
    public C1127t0(InterfaceC1101g interfaceC1101g) throws IOException {
        super(interfaceC1101g.g().q("DER"));
    }

    static void I(C1136y c1136y, boolean z, byte[] bArr, int i, int i2) throws IOException {
        c1136y.p(z, 4, bArr, i, i2);
    }

    static int J(boolean z, int i) {
        return C1136y.g(z, i);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 4, this.q);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    public C1127t0(byte[] bArr) {
        super(bArr);
    }

    @Override // ax.Wc.AbstractC1132w, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.AbstractC1132w, ax.Wc.A
    A B() {
        return this;
    }
}

package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1090a0 extends D {
    public C1090a0() {
    }

    @Override // ax.Wc.D
    AbstractC1093c K() {
        return new V(C());
    }

    @Override // ax.Wc.D
    AbstractC1109k M() {
        return ((D) B()).M();
    }

    @Override // ax.Wc.D
    AbstractC1132w N() {
        return new Y(D());
    }

    @Override // ax.Wc.D
    E O() {
        return new C1094c0(false, P());
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.r(z, 48, this.q);
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        int i = z ? 4 : 3;
        int length = this.q.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.q[i2].g().w(true);
        }
        return i;
    }

    public C1090a0(InterfaceC1101g interfaceC1101g) {
        super(interfaceC1101g);
    }

    public C1090a0(C1103h c1103h) {
        super(c1103h);
    }
}

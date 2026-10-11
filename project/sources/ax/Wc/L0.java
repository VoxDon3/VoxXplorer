package ax.Wc;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class L0 extends C1136y {
    L0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // ax.Wc.C1136y
    void l(InterfaceC1101g[] interfaceC1101gArr) throws IOException {
        for (InterfaceC1101g interfaceC1101g : interfaceC1101gArr) {
            interfaceC1101g.g().B().s(this, true);
        }
    }

    @Override // ax.Wc.C1136y
    void u(A a, boolean z) throws IOException {
        a.B().s(this, z);
    }

    @Override // ax.Wc.C1136y
    void v(A[] aArr) throws IOException {
        for (A a : aArr) {
            a.B().s(this, true);
        }
    }

    @Override // ax.Wc.C1136y
    L0 e() {
        return this;
    }
}

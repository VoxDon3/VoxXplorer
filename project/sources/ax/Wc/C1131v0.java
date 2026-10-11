package ax.Wc;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.Wc.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1131v0 extends L0 {
    C1131v0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // ax.Wc.L0, ax.Wc.C1136y
    void l(InterfaceC1101g[] interfaceC1101gArr) throws IOException {
        for (InterfaceC1101g interfaceC1101g : interfaceC1101gArr) {
            interfaceC1101g.g().A().s(this, true);
        }
    }

    @Override // ax.Wc.L0, ax.Wc.C1136y
    void u(A a, boolean z) throws IOException {
        a.A().s(this, z);
    }

    @Override // ax.Wc.L0, ax.Wc.C1136y
    void v(A[] aArr) throws IOException {
        for (A a : aArr) {
            a.A().s(this, true);
        }
    }

    @Override // ax.Wc.C1136y
    C1131v0 d() {
        return this;
    }
}

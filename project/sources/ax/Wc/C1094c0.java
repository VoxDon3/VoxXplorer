package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1094c0 extends E {
    public C1094c0() {
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.r(z, 49, this.q);
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

    public C1094c0(C1103h c1103h) {
        super(c1103h, false);
    }

    C1094c0(boolean z, InterfaceC1101g[] interfaceC1101gArr) {
        super(z, interfaceC1101gArr);
    }
}

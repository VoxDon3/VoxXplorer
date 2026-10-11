package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1100f0 implements InterfaceC1101g, U0 {
    final int c0;
    final F d0;
    final int q;

    C1100f0(int i, int i2, F f) {
        this.q = i;
        this.c0 = i2;
        this.d0 = f;
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z(e.getMessage());
        }
    }

    public A l() throws IOException {
        return this.d0.c(this.q, this.c0);
    }
}

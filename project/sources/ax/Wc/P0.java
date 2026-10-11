package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class P0 implements InterfaceC1101g, U0 {
    private F q;

    P0(F f) {
        this.q = f;
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z(e.getMessage(), e);
        }
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return K0.b(this.q.h());
    }
}

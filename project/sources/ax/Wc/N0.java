package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class N0 implements InterfaceC1101g, U0 {
    private F q;

    N0(F f) {
        this.q = f;
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return K0.a(this.q.h());
    }
}

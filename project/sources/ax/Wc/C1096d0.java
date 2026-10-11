package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1096d0 implements InterfaceC1101g, U0 {
    private F q;

    C1096d0(F f) {
        this.q = f;
    }

    static C1094c0 a(F f) throws IOException {
        return new C1094c0(f.h());
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
        return a(this.q);
    }
}

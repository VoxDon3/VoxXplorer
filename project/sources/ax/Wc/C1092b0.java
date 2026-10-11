package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1092b0 implements InterfaceC1101g, U0 {
    private F q;

    C1092b0(F f) {
        this.q = f;
    }

    static C1090a0 a(F f) throws IOException {
        return new C1090a0(f.h());
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
        return a(this.q);
    }
}

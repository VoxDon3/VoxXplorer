package ax.Wc;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.Wc.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1129u0 implements InterfaceC1134x {
    private T0 q;

    C1129u0(T0 t0) {
        this.q = t0;
    }

    @Override // ax.Wc.InterfaceC1134x
    public InputStream e() {
        return this.q;
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return new C1127t0(this.q.e());
    }
}

package ax.Wc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class W implements InterfaceC1095d {
    private C1102g0 c0;
    private F q;

    W(F f) {
        this.q = f;
    }

    static V a(F f) throws IOException {
        C1102g0 c1102g0 = new C1102g0(f, false);
        return new V(ax.Pd.a.c(c1102g0), c1102g0.b());
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // ax.Wc.InterfaceC1095d
    public InputStream i() throws IOException {
        C1102g0 c1102g0 = new C1102g0(this.q, false);
        this.c0 = c1102g0;
        return c1102g0;
    }

    @Override // ax.Wc.InterfaceC1095d
    public int k() {
        return this.c0.b();
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return a(this.q);
    }
}

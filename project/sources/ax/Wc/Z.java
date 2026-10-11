package ax.Wc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class Z implements InterfaceC1134x {
    private F q;

    Z(F f) {
        this.q = f;
    }

    static Y a(F f) throws IOException {
        return new Y(ax.Pd.a.c(new C1104h0(f)));
    }

    @Override // ax.Wc.InterfaceC1134x
    public InputStream e() {
        return new C1104h0(this.q);
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
        return a(this.q);
    }
}

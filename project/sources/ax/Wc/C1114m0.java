package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1114m0 implements InterfaceC1101g, U0 {
    private F q;

    public C1114m0(F f) {
        this.q = f;
    }

    static J0 a(F f) throws IOException {
        try {
            return new J0(f.h());
        } catch (IllegalArgumentException e) {
            throw new C1107j(e.getMessage(), e);
        }
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new C1138z("unable to get DER object", e2);
        }
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return a(this.q);
    }
}

package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class i extends ax.Q8.q {
    private int e;
    private ax.Q8.i f;
    byte[] g;
    byte[] h;

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        c2171b.U(2);
        this.e = c2171b.P();
        this.f = ax.Q8.i.a(c2171b);
        int P = c2171b.P();
        int P2 = c2171b.P();
        int P3 = c2171b.P();
        int P4 = c2171b.P();
        c2171b.U(4);
        c2171b.U(4);
        if (P2 > 0) {
            c2171b.T(P);
            this.g = c2171b.G(P2);
        }
        if (P4 > 0) {
            c2171b.T(P3);
            this.h = c2171b.G(P4);
        }
    }

    public byte[] n() {
        return this.h;
    }
}

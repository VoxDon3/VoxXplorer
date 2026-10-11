package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class q extends ax.Q8.q {
    byte[] e;

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        int J = c2171b.J();
        int P = c2171b.P();
        c2171b.T(J);
        this.e = c2171b.G(P);
    }

    public byte[] n() {
        return this.e;
    }
}

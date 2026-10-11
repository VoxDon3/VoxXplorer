package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class s extends ax.Q8.q {
    private int e;
    private byte[] f;

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        byte z = c2171b.z();
        c2171b.U(1);
        this.e = c2171b.P();
        c2171b.P();
        c2171b.U(4);
        c2171b.T(z);
        this.f = c2171b.G(this.e);
    }

    public byte[] n() {
        return this.f;
    }

    public int o() {
        return this.e;
    }
}

package ax.ra;

import ax.oa.C2738a;
import java.io.IOException;

/* renamed from: ax.ra.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3019c extends C2738a {
    private short i;
    private byte[] j;

    public C3019c() {
        p(ax.oa.d.REQUEST);
    }

    @Override // ax.oa.C2738a, ax.pa.b
    public void a(ax.pa.d dVar) throws IOException {
        if (t() == null) {
            throw new IllegalStateException("Invalid stub: " + t());
        }
        l((short) ((i().contains(ax.oa.e.OBJECT_UUID) ? 40 : 24) + this.j.length));
        super.a(dVar);
        byte[] t = t();
        dVar.c(t.length);
        dVar.e(0);
        dVar.e(s());
        dVar.a(t);
    }

    public short s() {
        return this.i;
    }

    public byte[] t() {
        return this.j;
    }

    public void u(short s) {
        this.i = s;
    }

    public void v(byte[] bArr) {
        this.j = bArr;
    }
}

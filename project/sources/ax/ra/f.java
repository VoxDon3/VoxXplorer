package ax.ra;

import ax.oa.C2738a;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class f extends C2738a {
    private byte[] i;

    public f() {
        p(ax.oa.d.RESPONSE);
    }

    @Override // ax.oa.C2738a
    public void r(ax.pa.c cVar) throws IOException {
        super.r(cVar);
        t(new byte[(d() - b()) - 24]);
        cVar.b(8);
        cVar.e(s());
        cVar.b(b());
    }

    public byte[] s() {
        return this.i;
    }

    public void t(byte[] bArr) {
        this.i = bArr;
    }
}

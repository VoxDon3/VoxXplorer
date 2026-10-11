package ax.Dc;

import ax.Dc.AbstractC0679n;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0690z extends AbstractC0679n {
    private int e0;
    private AbstractC0679n.b f0;

    public C0690z() {
        super(new W(21));
    }

    @Override // ax.Dc.AbstractC0679n, ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        a(4, i2);
        super.j(bArr, i, i2);
        this.e0 = W.h(bArr, i);
        this.f0 = AbstractC0679n.b.d(W.h(bArr, i + 2));
    }
}

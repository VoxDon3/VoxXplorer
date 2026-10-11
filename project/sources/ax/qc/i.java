package ax.qc;

import ax.lc.C2504d;
import java.io.IOException;

/* loaded from: classes3.dex */
class i extends AbstractC2901b<C2504d> {
    public i(g gVar, ax.rc.f fVar, char[] cArr, int i, boolean z) throws IOException {
        super(gVar, fVar, cArr, i, z);
    }

    private byte[] g() throws IOException {
        byte[] bArr = new byte[12];
        f(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.qc.AbstractC2901b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2504d e(ax.rc.f fVar, char[] cArr, boolean z) throws IOException {
        return new C2504d(cArr, fVar.e(), fVar.k(), g(), z);
    }
}

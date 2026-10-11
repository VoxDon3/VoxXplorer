package ax.qc;

import ax.lc.InterfaceC2503c;
import java.io.IOException;

/* loaded from: classes3.dex */
class e extends AbstractC2901b<a> {
    public e(g gVar, ax.rc.f fVar, char[] cArr, int i) throws IOException {
        super(gVar, fVar, cArr, i, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.qc.AbstractC2901b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e(ax.rc.f fVar, char[] cArr, boolean z) {
        return new a();
    }

    static class a implements InterfaceC2503c {
        a() {
        }

        @Override // ax.lc.InterfaceC2503c
        public int a(byte[] bArr, int i, int i2) {
            return i2;
        }
    }
}

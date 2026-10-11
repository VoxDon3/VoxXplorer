package ax.be;

import java.io.InputStream;

/* renamed from: ax.be.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1737e extends AbstractC1736d implements InterfaceC1749q {
    private final long a;
    private final int b;

    C1737e(long j, byte[] bArr) throws L {
        this.a = j;
        if (bArr.length == 0) {
            this.b = 0;
            return;
        }
        if (bArr.length != 4) {
            throw new L("Unsupported BCJ filter properties");
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        this.b = i;
    }

    @Override // ax.be.InterfaceC1749q
    public InputStream b(InputStream inputStream, C1735c c1735c) {
        long j = this.a;
        return new H(inputStream, j == 4 ? new ax.je.g(false, this.b) : j == 5 ? new ax.je.d(false, this.b) : j == 6 ? new ax.je.c(false, this.b) : j == 7 ? new ax.je.a(false, this.b) : j == 8 ? new ax.je.b(false, this.b) : j == 9 ? new ax.je.e(false, this.b) : null);
    }

    @Override // ax.be.InterfaceC1749q
    public int d() {
        return H.a();
    }
}

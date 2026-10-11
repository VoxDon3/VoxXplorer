package ax.be;

import java.io.InputStream;

/* loaded from: classes3.dex */
class x extends w implements InterfaceC1749q {
    private int a;

    x(byte[] bArr) throws L {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                int i = (b & 1) | 2;
                this.a = i;
                this.a = i << ((b >>> 1) + 11);
                return;
            }
        }
        throw new L("Unsupported LZMA2 properties");
    }

    @Override // ax.be.InterfaceC1749q
    public InputStream b(InputStream inputStream, C1735c c1735c) {
        return new y(inputStream, this.a, null, c1735c);
    }

    @Override // ax.be.InterfaceC1749q
    public int d() {
        return y.d(this.a);
    }
}

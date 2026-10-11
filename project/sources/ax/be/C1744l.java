package ax.be;

import java.io.InputStream;

/* renamed from: ax.be.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1744l extends AbstractC1743k implements InterfaceC1749q {
    private final int a;

    C1744l(byte[] bArr) throws L {
        if (bArr.length != 1) {
            throw new L("Unsupported Delta filter properties");
        }
        this.a = (bArr[0] & 255) + 1;
    }

    @Override // ax.be.InterfaceC1749q
    public InputStream b(InputStream inputStream, C1735c c1735c) {
        return new C1745m(inputStream, this.a);
    }

    @Override // ax.be.InterfaceC1749q
    public int d() {
        return 1;
    }
}

package ax.Dd;

import ax.vd.InterfaceC3307d;

/* loaded from: classes3.dex */
public class k implements InterfaceC3307d {
    private byte[] a;

    public k(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.a;
    }

    public k(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}

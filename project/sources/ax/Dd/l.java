package ax.Dd;

import ax.vd.InterfaceC3307d;

/* loaded from: classes3.dex */
public class l implements InterfaceC3307d {
    private byte[] a;
    private InterfaceC3307d b;

    public l(InterfaceC3307d interfaceC3307d, byte[] bArr) {
        this(interfaceC3307d, bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.a;
    }

    public InterfaceC3307d b() {
        return this.b;
    }

    public l(InterfaceC3307d interfaceC3307d, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        this.b = interfaceC3307d;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}

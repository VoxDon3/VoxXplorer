package ax.ce;

import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class a extends c {
    private final CRC32 c = new CRC32();

    public a() {
        this.a = 4;
        this.b = "CRC32";
    }

    @Override // ax.ce.c
    public byte[] a() {
        byte[] bArr = {(byte) this.c.getValue(), (byte) (r0 >>> 8), (byte) (r0 >>> 16), (byte) (r0 >>> 24)};
        this.c.reset();
        return bArr;
    }

    @Override // ax.ce.c
    public void f(byte[] bArr, int i, int i2) {
        this.c.update(bArr, i, i2);
    }
}

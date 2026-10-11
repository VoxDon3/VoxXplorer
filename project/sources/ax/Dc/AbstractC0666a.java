package ax.Dc;

import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0666a implements N {
    private byte[] c0;
    private byte[] d0;
    private long q;

    protected AbstractC0666a() {
    }

    private void a() {
        byte[] bArr = this.c0;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 5];
        this.d0 = bArr2;
        bArr2[0] = 1;
        System.arraycopy(U.c(this.q), 0, this.d0, 1, 4);
        byte[] bArr3 = this.c0;
        System.arraycopy(bArr3, 0, this.d0, 5, bArr3.length);
    }

    @Override // ax.Dc.N
    public W c() {
        return i();
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b = bArr[i];
        if (b != 1) {
            throw new ZipException("Unsupported version [" + ((int) b) + "] for UniCode path extra data.");
        }
        this.q = U.i(bArr, i + 1);
        int i3 = i2 - 5;
        byte[] bArr2 = new byte[i3];
        this.c0 = bArr2;
        System.arraycopy(bArr, i + 5, bArr2, 0, i3);
        this.d0 = null;
    }

    public long e() {
        return this.q;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        return h();
    }

    public byte[] g() {
        byte[] bArr = this.c0;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        if (this.d0 == null) {
            a();
        }
        byte[] bArr = this.d0;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // ax.Dc.N
    public W i() {
        if (this.d0 == null) {
            a();
        }
        byte[] bArr = this.d0;
        return new W(bArr != null ? bArr.length : 0);
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        d(bArr, i, i2);
    }

    protected AbstractC0666a(String str, byte[] bArr, int i, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        this.q = crc32.getValue();
        this.c0 = str.getBytes(StandardCharsets.UTF_8);
    }
}

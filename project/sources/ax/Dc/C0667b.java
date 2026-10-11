package ax.Dc;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.Dc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0667b implements N, Cloneable {
    private static final W h0 = new W(30062);
    private int c0;
    private int d0;
    private boolean f0;
    private int q;
    private String e0 = HttpUrl.FRAGMENT_ENCODE_SET;
    private CRC32 g0 = new CRC32();

    @Override // ax.Dc.N
    public W b() {
        return h0;
    }

    @Override // ax.Dc.N
    public W c() {
        return new W(l().getBytes().length + 14);
    }

    public Object clone() {
        try {
            C0667b c0667b = (C0667b) super.clone();
            c0667b.g0 = new CRC32();
            return c0667b;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 14) {
            throw new ZipException("The length is too short, only " + i2 + " bytes, expected at least 14");
        }
        long i3 = U.i(bArr, i);
        int i4 = i2 - 4;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i + 4, bArr2, 0, i4);
        this.g0.reset();
        this.g0.update(bArr2);
        long value = this.g0.getValue();
        if (i3 != value) {
            throw new ZipException("Bad CRC checksum, expected " + Long.toHexString(i3) + " instead of " + Long.toHexString(value));
        }
        int h = W.h(bArr2, 0);
        int i5 = (int) U.i(bArr2, 2);
        if (i5 < 0 || i5 > i2 - 14) {
            throw new ZipException("Bad symbolic link name length " + i5 + " in ASI extra field");
        }
        this.c0 = W.h(bArr2, 6);
        this.d0 = W.h(bArr2, 8);
        if (i5 == 0) {
            this.e0 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 10, bArr3, 0, i5);
            this.e0 = new String(bArr3);
        }
        t((h & Http2.INITIAL_MAX_FRAME_SIZE) != 0);
        v(h);
    }

    @Override // ax.Dc.N
    public byte[] f() {
        int d = c().d();
        int i = d - 4;
        byte[] bArr = new byte[i];
        System.arraycopy(W.c(m()), 0, bArr, 0, 2);
        byte[] bytes = l().getBytes();
        System.arraycopy(U.c(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(W.c(o()), 0, bArr, 6, 2);
        System.arraycopy(W.c(k()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.g0.reset();
        this.g0.update(bArr);
        byte[] bArr2 = new byte[d];
        System.arraycopy(U.c(this.g0.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, i);
        return bArr2;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return f();
    }

    @Override // ax.Dc.N
    public W i() {
        return c();
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        d(bArr, i, i2);
    }

    public int k() {
        return this.d0;
    }

    public String l() {
        return this.e0;
    }

    public int m() {
        return this.q;
    }

    protected int n(int i) {
        return (i & 4095) | (s() ? 40960 : r() ? Http2.INITIAL_MAX_FRAME_SIZE : 32768);
    }

    public int o() {
        return this.c0;
    }

    public boolean r() {
        return this.f0 && !s();
    }

    public boolean s() {
        return !l().isEmpty();
    }

    public void t(boolean z) {
        this.f0 = z;
        this.q = n(this.q);
    }

    public void v(int i) {
        this.q = n(i);
    }
}

package ax.Dc;

import ax.Dc.AbstractC0679n;
import java.util.Arrays;
import java.util.zip.ZipException;

/* loaded from: classes3.dex */
public class B extends AbstractC0679n {
    private int e0;
    private AbstractC0679n.a f0;
    private int g0;
    private int h0;
    private long i0;
    private AbstractC0679n.b j0;
    private int k0;
    private byte[] l0;
    private byte[] m0;
    private byte[] n0;
    private byte[] o0;
    private byte[] p0;
    private byte[] q0;

    public B() {
        super(new W(23));
    }

    private void k(String str, int i, int i2, int i3) throws ZipException {
        if (i2 + i <= i3) {
            return;
        }
        throw new ZipException("Invalid X0017_StrongEncryptionHeader: " + str + " " + i + " doesn't fit into " + i3 + " bytes of data at position " + i2);
    }

    @Override // ax.Dc.AbstractC0679n, ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        super.d(bArr, i, i2);
        m(bArr, i, i2);
    }

    @Override // ax.Dc.AbstractC0679n, ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        super.j(bArr, i, i2);
        l(bArr, i, i2);
    }

    public void l(byte[] bArr, int i, int i2) throws ZipException {
        a(12, i2);
        this.e0 = W.h(bArr, i);
        this.f0 = AbstractC0679n.a.d(W.h(bArr, i + 2));
        this.g0 = W.h(bArr, i + 4);
        this.h0 = W.h(bArr, i + 6);
        long i3 = U.i(bArr, i + 8);
        this.i0 = i3;
        if (i3 > 0) {
            a(16, i2);
            this.j0 = AbstractC0679n.b.d(W.h(bArr, i + 12));
            this.k0 = W.h(bArr, i + 14);
        }
    }

    public void m(byte[] bArr, int i, int i2) throws ZipException {
        a(4, i2);
        int h = W.h(bArr, i);
        k("ivSize", h, 4, i2);
        int i3 = i + 4;
        a(i3, h);
        this.l0 = Arrays.copyOfRange(bArr, i3, h);
        int i4 = h + 16;
        a(i4, i2);
        int i5 = i + h;
        this.e0 = W.h(bArr, i5 + 6);
        this.f0 = AbstractC0679n.a.d(W.h(bArr, i5 + 8));
        this.g0 = W.h(bArr, i5 + 10);
        this.h0 = W.h(bArr, i5 + 12);
        int h2 = W.h(bArr, i5 + 14);
        k("erdSize", h2, i4, i2);
        int i6 = i5 + 16;
        a(i6, h2);
        this.m0 = Arrays.copyOfRange(bArr, i6, h2);
        int i7 = h + 20 + h2;
        a(i7, i2);
        long i8 = U.i(bArr, i6 + h2);
        this.i0 = i8;
        if (i8 == 0) {
            a(i7 + 2, i2);
            int h3 = W.h(bArr, i5 + 20 + h2);
            k("vSize", h3, h + 22 + h2, i2);
            if (h3 < 4) {
                throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + h3 + " is too small to hold CRC");
            }
            int i9 = i5 + 22 + h2;
            int i10 = h3 - 4;
            a(i9, i10);
            this.p0 = Arrays.copyOfRange(bArr, i9, i10);
            int i11 = (i9 + h3) - 4;
            a(i11, 4);
            this.q0 = Arrays.copyOfRange(bArr, i11, 4);
            return;
        }
        a(i7 + 6, i2);
        this.j0 = AbstractC0679n.b.d(W.h(bArr, i5 + 20 + h2));
        int i12 = i5 + 22 + h2;
        this.k0 = W.h(bArr, i12);
        int i13 = i5 + 24 + h2;
        int h4 = W.h(bArr, i13);
        int i14 = this.k0;
        if (h4 < i14) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: resize " + h4 + " is too small to hold hashSize" + this.k0);
        }
        this.n0 = new byte[i14];
        this.o0 = new byte[h4 - i14];
        k("resize", h4, h + 24 + h2, i2);
        System.arraycopy(bArr, i13, this.n0, 0, this.k0);
        int i15 = this.k0;
        System.arraycopy(bArr, i13 + i15, this.o0, 0, h4 - i15);
        a(h + 26 + h2 + h4 + 2, i2);
        int h5 = W.h(bArr, i5 + 26 + h2 + h4);
        if (h5 < 4) {
            throw new ZipException("Invalid X0017_StrongEncryptionHeader: vSize " + h5 + " is too small to hold CRC");
        }
        k("vSize", h5, h + 22 + h2 + h4, i2);
        int i16 = h5 - 4;
        byte[] bArr2 = new byte[i16];
        this.p0 = bArr2;
        this.q0 = new byte[4];
        int i17 = i12 + h4;
        System.arraycopy(bArr, i17, bArr2, 0, i16);
        System.arraycopy(bArr, (i17 + h5) - 4, this.q0, 0, 4);
    }
}

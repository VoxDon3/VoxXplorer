package ax.qc;

import ax.lc.C2501a;
import ax.oc.C2743a;
import ax.rc.C3026a;
import ax.tc.C3146e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: ax.qc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2900a extends AbstractC2901b<C2501a> {
    private byte[] g0;
    private byte[] h0;
    private int i0;
    private int j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;

    public C2900a(g gVar, ax.rc.f fVar, char[] cArr, int i, boolean z) throws IOException {
        super(gVar, fVar, cArr, i, z);
        this.g0 = new byte[1];
        this.h0 = new byte[16];
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
    }

    private void g(byte[] bArr, int i) {
        int i2 = this.k0;
        int i3 = this.j0;
        if (i2 >= i3) {
            i2 = i3;
        }
        this.n0 = i2;
        System.arraycopy(this.h0, this.i0, bArr, i, i2);
        p(this.n0);
        j(this.n0);
        int i4 = this.m0;
        int i5 = this.n0;
        this.m0 = i4 + i5;
        this.k0 -= i5;
        this.l0 += i5;
    }

    private void j(int i) {
        int i2 = this.j0 - i;
        this.j0 = i2;
        if (i2 <= 0) {
            this.j0 = 0;
        }
    }

    private byte[] m() throws IOException {
        byte[] bArr = new byte[2];
        f(bArr);
        return bArr;
    }

    private byte[] o(ax.rc.f fVar) throws IOException {
        if (fVar.b() == null) {
            throw new IOException("invalid aes extra data record");
        }
        C3026a b = fVar.b();
        if (b.b() == null) {
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        byte[] bArr = new byte[b.b().n()];
        f(bArr);
        return bArr;
    }

    private void p(int i) {
        int i2 = this.i0 + i;
        this.i0 = i2;
        if (i2 >= 15) {
            this.i0 = 15;
        }
    }

    private void v(byte[] bArr, int i) throws IOException {
        byte[] bArr2 = new byte[10];
        System.arraycopy(c().b(i), 0, bArr2, 0, 10);
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    @Override // ax.qc.AbstractC2901b
    protected void b(InputStream inputStream, int i) throws IOException {
        v(u(inputStream), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.qc.AbstractC2901b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2501a e(ax.rc.f fVar, char[] cArr, boolean z) throws IOException {
        return new C2501a(fVar.b(), cArr, o(fVar), m(), z);
    }

    @Override // ax.qc.AbstractC2901b, java.io.InputStream
    public int read() throws IOException {
        if (read(this.g0) == -1) {
            return -1;
        }
        return this.g0[0];
    }

    protected byte[] u(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[10];
        if (C3146e.e(inputStream, bArr) == 10) {
            return bArr;
        }
        throw new C2743a("Invalid AES Mac bytes. Could not read sufficient data");
    }

    @Override // ax.qc.AbstractC2901b, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // ax.qc.AbstractC2901b, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.k0 = i2;
        this.l0 = i;
        this.m0 = 0;
        if (this.j0 != 0) {
            g(bArr, i);
            int i3 = this.m0;
            if (i3 == i2) {
                return i3;
            }
        }
        if (this.k0 < 16) {
            byte[] bArr2 = this.h0;
            int read = super.read(bArr2, 0, bArr2.length);
            this.o0 = read;
            this.i0 = 0;
            if (read == -1) {
                this.j0 = 0;
                int i4 = this.m0;
                if (i4 > 0) {
                    return i4;
                }
                return -1;
            }
            this.j0 = read;
            g(bArr, this.l0);
            int i5 = this.m0;
            if (i5 == i2) {
                return i5;
            }
        }
        int i6 = this.l0;
        int i7 = this.k0;
        int read2 = super.read(bArr, i6, i7 - (i7 % 16));
        if (read2 == -1) {
            int i8 = this.m0;
            if (i8 > 0) {
                return i8;
            }
            return -1;
        }
        return read2 + this.m0;
    }
}

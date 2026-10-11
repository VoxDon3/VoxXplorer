package ax.Dc;

import java.util.zip.ZipException;

/* loaded from: classes3.dex */
public class F implements N {
    static final W g0 = new W(1);
    private K c0;
    private K d0;
    private U e0;
    private byte[] f0;
    private K q;

    private int a(byte[] bArr) {
        int i;
        K k = this.q;
        if (k != null) {
            System.arraycopy(k.a(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        K k2 = this.c0;
        if (k2 == null) {
            return i;
        }
        System.arraycopy(k2.a(), 0, bArr, i, 8);
        return i + 8;
    }

    @Override // ax.Dc.N
    public W b() {
        return g0;
    }

    @Override // ax.Dc.N
    public W c() {
        return new W(this.q != null ? 16 : 0);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 == 0) {
            return;
        }
        if (i2 < 16) {
            throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
        }
        this.q = new K(bArr, i);
        this.c0 = new K(bArr, i + 8);
        int i3 = i + 16;
        int i4 = i2 - 16;
        if (i4 >= 8) {
            this.d0 = new K(bArr, i3);
            i3 = i + 24;
            i4 = i2 - 24;
        }
        if (i4 >= 4) {
            this.e0 = new U(bArr, i3);
        }
    }

    public K e() {
        return this.c0;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        K k = this.q;
        if (k == null && this.c0 == null) {
            return ax.Kc.f.a;
        }
        if (k == null || this.c0 == null) {
            throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
        }
        byte[] bArr = new byte[16];
        a(bArr);
        return bArr;
    }

    public U g() {
        return this.e0;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        byte[] bArr = new byte[i().d()];
        int a = a(bArr);
        K k = this.d0;
        if (k != null) {
            System.arraycopy(k.a(), 0, bArr, a, 8);
            a += 8;
        }
        U u = this.e0;
        if (u != null) {
            System.arraycopy(u.b(), 0, bArr, a, 4);
        }
        return bArr;
    }

    @Override // ax.Dc.N
    public W i() {
        return new W((this.q != null ? 8 : 0) + (this.c0 != null ? 8 : 0) + (this.d0 == null ? 0 : 8) + (this.e0 != null ? 4 : 0));
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = new byte[i2];
        this.f0 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i2 >= 28) {
            d(bArr, i, i2);
            return;
        }
        if (i2 == 24) {
            this.q = new K(bArr, i);
            this.c0 = new K(bArr, i + 8);
            this.d0 = new K(bArr, i + 16);
        } else if (i2 % 8 == 4) {
            this.e0 = new U(bArr, (i + i2) - 4);
        }
    }

    public K k() {
        return this.d0;
    }

    public K l() {
        return this.q;
    }

    public void m(boolean z, boolean z2, boolean z3, boolean z4) throws ZipException {
        byte[] bArr = this.f0;
        if (bArr != null) {
            int i = 0;
            int i2 = (z ? 8 : 0) + (z2 ? 8 : 0) + (z3 ? 8 : 0) + (z4 ? 4 : 0);
            if (bArr.length < i2) {
                throw new ZipException("Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + i2 + " but is " + this.f0.length);
            }
            if (z) {
                this.q = new K(this.f0, 0);
                i = 8;
            }
            if (z2) {
                this.c0 = new K(this.f0, i);
                i += 8;
            }
            if (z3) {
                this.d0 = new K(this.f0, i);
                i += 8;
            }
            if (z4) {
                this.e0 = new U(this.f0, i);
            }
        }
    }

    public void n(K k) {
        this.c0 = k;
    }

    public void o(U u) {
        this.e0 = u;
    }

    public void p(K k) {
        this.d0 = k;
    }

    public void q(K k) {
        this.q = k;
    }
}

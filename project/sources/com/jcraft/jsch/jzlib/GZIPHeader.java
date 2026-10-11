package com.jcraft.jsch.jzlib;

/* loaded from: classes3.dex */
final class GZIPHeader implements Cloneable {
    int d0;
    byte[] f0;
    byte[] g0;
    byte[] h0;
    int i0;
    long j0;
    boolean q = false;
    private boolean c0 = false;
    int e0 = 255;
    boolean k0 = false;
    long l0 = 0;

    GZIPHeader() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Deflate deflate) {
        boolean z = this.q;
        boolean z2 = z;
        if (this.c0) {
            z2 = (z ? 1 : 0) | 2;
        }
        boolean z3 = z2;
        if (this.f0 != null) {
            z3 = (z2 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (this.g0 != null) {
            z4 = (z3 ? 1 : 0) | '\b';
        }
        int i = z4;
        if (this.h0 != null) {
            i = (z4 ? 1 : 0) | 16;
        }
        int i2 = deflate.H0;
        int i3 = i2 == 1 ? 4 : i2 == 9 ? 2 : 0;
        deflate.L(-29921);
        deflate.J((byte) 8);
        deflate.J((byte) i);
        deflate.J((byte) this.l0);
        deflate.J((byte) (this.l0 >> 8));
        deflate.J((byte) (this.l0 >> 16));
        deflate.J((byte) (this.l0 >> 24));
        deflate.J((byte) i3);
        deflate.J((byte) this.e0);
        byte[] bArr = this.f0;
        if (bArr != null) {
            deflate.J((byte) bArr.length);
            deflate.J((byte) (this.f0.length >> 8));
            byte[] bArr2 = this.f0;
            deflate.K(bArr2, 0, bArr2.length);
        }
        byte[] bArr3 = this.g0;
        if (bArr3 != null) {
            deflate.K(bArr3, 0, bArr3.length);
            deflate.J((byte) 0);
        }
        byte[] bArr4 = this.h0;
        if (bArr4 != null) {
            deflate.K(bArr4, 0, bArr4.length);
            deflate.J((byte) 0);
        }
    }

    void c(long j) {
        this.j0 = j;
    }

    public Object clone() throws CloneNotSupportedException {
        GZIPHeader gZIPHeader = (GZIPHeader) super.clone();
        byte[] bArr = gZIPHeader.f0;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            gZIPHeader.f0 = bArr2;
        }
        byte[] bArr3 = gZIPHeader.g0;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            gZIPHeader.g0 = bArr4;
        }
        byte[] bArr5 = gZIPHeader.h0;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            gZIPHeader.h0 = bArr6;
        }
        return gZIPHeader;
    }

    void d(long j) {
        this.l0 = j;
    }
}

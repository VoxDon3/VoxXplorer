package ax.qb;

import java.security.MessageDigest;

/* renamed from: ax.qb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2898f extends MessageDigest implements Cloneable {
    private long c0;
    private byte[] d0;
    private int[] e0;
    private int[] q;

    public C2898f() {
        super("MD4");
        this.q = new int[4];
        this.d0 = new byte[64];
        this.e0 = new int[16];
        engineReset();
    }

    private int b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    private int c(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & (i3 | i4)) | (i3 & i4)) + i5 + 1518500249;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    private int d(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 ^ i3) ^ i4) + i5 + 1859775393;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    private void f(byte[] bArr, int i) {
        int i2 = i;
        for (int i3 = 0; i3 < 16; i3++) {
            int[] iArr = this.e0;
            int i4 = ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
            int i5 = i2 + 3;
            int i6 = ((bArr[i2 + 2] & 255) << 16) | i4;
            i2 += 4;
            iArr[i3] = i6 | ((bArr[i5] & 255) << 24);
        }
        int[] iArr2 = this.q;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        int b = b(i7, i8, i9, i10, this.e0[0], 3);
        int b2 = b(i10, b, i8, i9, this.e0[1], 7);
        int b3 = b(i9, b2, b, i8, this.e0[2], 11);
        int b4 = b(i8, b3, b2, b, this.e0[3], 19);
        int b5 = b(b, b4, b3, b2, this.e0[4], 3);
        int b6 = b(b2, b5, b4, b3, this.e0[5], 7);
        int b7 = b(b3, b6, b5, b4, this.e0[6], 11);
        int b8 = b(b4, b7, b6, b5, this.e0[7], 19);
        int b9 = b(b5, b8, b7, b6, this.e0[8], 3);
        int b10 = b(b6, b9, b8, b7, this.e0[9], 7);
        int b11 = b(b7, b10, b9, b8, this.e0[10], 11);
        int b12 = b(b8, b11, b10, b9, this.e0[11], 19);
        int b13 = b(b9, b12, b11, b10, this.e0[12], 3);
        int b14 = b(b10, b13, b12, b11, this.e0[13], 7);
        int b15 = b(b11, b14, b13, b12, this.e0[14], 11);
        int b16 = b(b12, b15, b14, b13, this.e0[15], 19);
        int c = c(b13, b16, b15, b14, this.e0[0], 3);
        int c2 = c(b14, c, b16, b15, this.e0[4], 5);
        int c3 = c(b15, c2, c, b16, this.e0[8], 9);
        int c4 = c(b16, c3, c2, c, this.e0[12], 13);
        int c5 = c(c, c4, c3, c2, this.e0[1], 3);
        int c6 = c(c2, c5, c4, c3, this.e0[5], 5);
        int c7 = c(c3, c6, c5, c4, this.e0[9], 9);
        int c8 = c(c4, c7, c6, c5, this.e0[13], 13);
        int c9 = c(c5, c8, c7, c6, this.e0[2], 3);
        int c10 = c(c6, c9, c8, c7, this.e0[6], 5);
        int c11 = c(c7, c10, c9, c8, this.e0[10], 9);
        int c12 = c(c8, c11, c10, c9, this.e0[14], 13);
        int c13 = c(c9, c12, c11, c10, this.e0[3], 3);
        int c14 = c(c10, c13, c12, c11, this.e0[7], 5);
        int c15 = c(c11, c14, c13, c12, this.e0[11], 9);
        int c16 = c(c12, c15, c14, c13, this.e0[15], 13);
        int d = d(c13, c16, c15, c14, this.e0[0], 3);
        int d2 = d(c14, d, c16, c15, this.e0[8], 9);
        int d3 = d(c15, d2, d, c16, this.e0[4], 11);
        int d4 = d(c16, d3, d2, d, this.e0[12], 15);
        int d5 = d(d, d4, d3, d2, this.e0[2], 3);
        int d6 = d(d2, d5, d4, d3, this.e0[10], 9);
        int d7 = d(d3, d6, d5, d4, this.e0[6], 11);
        int d8 = d(d4, d7, d6, d5, this.e0[14], 15);
        int d9 = d(d5, d8, d7, d6, this.e0[1], 3);
        int d10 = d(d6, d9, d8, d7, this.e0[9], 9);
        int d11 = d(d7, d10, d9, d8, this.e0[5], 11);
        int d12 = d(d8, d11, d10, d9, this.e0[13], 15);
        int d13 = d(d9, d12, d11, d10, this.e0[3], 3);
        int d14 = d(d10, d13, d12, d11, this.e0[11], 9);
        int d15 = d(d11, d14, d13, d12, this.e0[7], 11);
        int d16 = d(d12, d15, d14, d13, this.e0[15], 15);
        int[] iArr3 = this.q;
        iArr3[0] = iArr3[0] + d13;
        iArr3[1] = iArr3[1] + d16;
        iArr3[2] = iArr3[2] + d15;
        iArr3[3] = iArr3[3] + d14;
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        return new C2898f(this);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        int i = (int) (this.c0 % 64);
        int i2 = i < 56 ? 56 - i : 120 - i;
        int i3 = i2 + 8;
        byte[] bArr = new byte[i3];
        bArr[0] = Byte.MIN_VALUE;
        for (int i4 = 0; i4 < 8; i4++) {
            bArr[i2 + i4] = (byte) ((this.c0 * 8) >>> (i4 * 8));
        }
        engineUpdate(bArr, 0, i3);
        byte[] bArr2 = new byte[16];
        for (int i5 = 0; i5 < 4; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                bArr2[(i5 * 4) + i6] = (byte) (this.q[i5] >>> (i6 * 8));
            }
        }
        engineReset();
        return bArr2;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        int[] iArr = this.q;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.c0 = 0L;
        for (int i = 0; i < 64; i++) {
            this.d0[i] = 0;
        }
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        long j = this.c0;
        int i = (int) (j % 64);
        this.c0 = j + 1;
        byte[] bArr = this.d0;
        bArr[i] = b;
        if (i == 63) {
            f(bArr, 0);
        }
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            long j = i2;
            if (i + j <= bArr.length) {
                long j2 = this.c0;
                int i3 = (int) (j2 % 64);
                this.c0 = j2 + j;
                int i4 = 64 - i3;
                int i5 = 0;
                if (i2 >= i4) {
                    System.arraycopy(bArr, i, this.d0, i3, i4);
                    f(this.d0, 0);
                    while (true) {
                        int i6 = i4 + 64;
                        if (i4 + 63 >= i2) {
                            break;
                        }
                        f(bArr, i4 + i);
                        i4 = i6;
                    }
                    i5 = i4;
                    i3 = 0;
                }
                if (i5 < i2) {
                    System.arraycopy(bArr, i + i5, this.d0, i3, i2 - i5);
                    return;
                }
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    private C2898f(C2898f c2898f) {
        this();
        this.q = (int[]) c2898f.q.clone();
        this.d0 = (byte[]) c2898f.d0.clone();
        this.c0 = c2898f.c0;
    }
}

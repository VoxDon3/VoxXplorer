package ax.ce;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class b extends c {
    private static final long[][] d = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 4, 256);
    private long c = -1;

    static {
        int i = 0;
        while (i < 4) {
            for (int i2 = 0; i2 < 256; i2++) {
                long j = i == 0 ? i2 : d[i - 1][i2];
                for (int i3 = 0; i3 < 8; i3++) {
                    long j2 = j & 1;
                    j >>>= 1;
                    if (j2 == 1) {
                        j ^= -3932672073523589310L;
                    }
                }
                d[i][i2] = j;
            }
            i++;
        }
    }

    public b() {
        this.a = 8;
        this.b = "CRC64";
    }

    @Override // ax.ce.c
    public byte[] a() {
        long j = ~this.c;
        this.c = -1L;
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (j >> (i * 8));
        }
        return bArr;
    }

    @Override // ax.ce.c
    public void f(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = i3 - 3;
        while (i < i4) {
            long j = this.c;
            int i5 = (int) j;
            long[][] jArr = d;
            this.c = (((j >>> 32) ^ (jArr[3][(i5 & 255) ^ (bArr[i] & 255)] ^ jArr[2][((i5 >>> 8) & 255) ^ (bArr[i + 1] & 255)])) ^ jArr[1][((i5 >>> 16) & 255) ^ (bArr[i + 2] & 255)]) ^ jArr[0][((i5 >>> 24) & 255) ^ (bArr[i + 3] & 255)];
            i += 4;
        }
        while (i < i3) {
            long[] jArr2 = d[0];
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            long j2 = this.c;
            this.c = (j2 >>> 8) ^ jArr2[i7 ^ (((int) j2) & 255)];
            i = i6;
        }
    }
}

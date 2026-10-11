package ax.Bd;

import ax.Nd.h;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class e implements c {
    private byte[] a;
    private long[][] b;

    @Override // ax.Bd.c
    public void a(byte[] bArr) {
        if (this.b == null) {
            this.b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (d.a(this.a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.a = bArr2;
        d.e(bArr, bArr2);
        d.c(this.a, this.b[1]);
        long[] jArr = this.b[1];
        d.k(jArr, jArr);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.b;
            d.g(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.b;
            d.s(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }

    @Override // ax.Bd.c
    public void b(byte[] bArr) {
        long[] jArr = this.b[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.b[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        h.n(j, bArr, 0);
        h.n(j2, bArr, 8);
    }
}

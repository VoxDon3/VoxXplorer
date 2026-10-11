package ax.K1;

import ax.S0.d0;

/* loaded from: classes.dex */
final class d {

    public static final class b {
        public final long[] a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;
        public final long g;

        private b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, long j2) {
            this.a = jArr;
            this.b = iArr;
            this.c = i;
            this.d = jArr2;
            this.e = iArr2;
            this.f = j;
            this.g = j2;
        }
    }

    public static b a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr2) {
            i4 += d0.k(i5, i2);
        }
        long[] jArr2 = new long[i4];
        int[] iArr3 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr4 = new int[i4];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i3 < iArr2.length) {
            int i10 = iArr2[i3];
            long j2 = jArr[i3];
            while (i10 > 0) {
                int min = Math.min(i2, i10);
                jArr2[i8] = j2;
                int i11 = i * min;
                iArr3[i8] = i11;
                i7 += i11;
                i9 = Math.max(i9, i11);
                jArr3[i8] = i6 * j;
                iArr4[i8] = 1;
                j2 += iArr3[i8];
                i6 += min;
                i10 -= min;
                i8++;
                i2 = i2;
            }
            i3++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, i9, jArr3, iArr4, j * i6, i7);
    }
}

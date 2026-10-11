/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.S0.d0;

final class d {
    public static b a(int n8, long[] lArray, int[] nArray, long l8) {
        int n9;
        int n10 = 8192 / n8;
        int n11 = nArray.length;
        int n12 = 0;
        int n13 = 0;
        for (n9 = 0; n9 < n11; ++n9) {
            n13 += d0.k(nArray[n9], n10);
        }
        long[] lArray2 = new long[n13];
        int[] nArray2 = new int[n13];
        long[] lArray3 = new long[n13];
        int[] nArray3 = new int[n13];
        int n14 = 0;
        int n15 = 0;
        n9 = 0;
        n11 = 0;
        for (n13 = n12; n13 < nArray.length; ++n13) {
            n12 = nArray[n13];
            long l9 = lArray[n13];
            while (n12 > 0) {
                int n16;
                int n17 = Math.min(n10, n12);
                lArray2[n9] = l9;
                nArray2[n9] = n16 = n8 * n17;
                n15 += n16;
                n11 = Math.max(n11, n16);
                lArray3[n9] = (long)n14 * l8;
                nArray3[n9] = 1;
                l9 += (long)nArray2[n9];
                n14 += n17;
                n12 -= n17;
                ++n9;
            }
        }
        return new b(lArray2, nArray2, n11, lArray3, nArray3, l8 * (long)n14, n15);
    }

    public static final class b {
        public final long[] a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;
        public final long g;

        private b(long[] lArray, int[] nArray, int n8, long[] lArray2, int[] nArray2, long l8, long l9) {
            this.a = lArray;
            this.b = nArray;
            this.c = n8;
            this.d = lArray2;
            this.e = nArray2;
            this.f = l8;
            this.g = l9;
        }
    }
}


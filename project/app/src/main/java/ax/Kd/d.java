/*
 * Decompiled with CFR 0.152.
 */
package ax.Kd;

public abstract class d {
    public static boolean a(int[] nArray, int[] nArray2) {
        for (int i8 = 7; i8 >= 0; --i8) {
            int n8 = nArray[i8] ^ Integer.MIN_VALUE;
            int n9 = Integer.MIN_VALUE ^ nArray2[i8];
            if (n8 < n9) {
                return false;
            }
            if (n8 <= n9) continue;
            return true;
        }
        return true;
    }

    public static int b(int[] nArray, int[] nArray2, int[] nArray3) {
        long l8 = nArray2[0];
        long l9 = nArray2[1];
        long l10 = nArray2[2];
        long l11 = nArray2[3];
        long l12 = nArray2[4];
        long l13 = nArray2[5];
        long l14 = nArray2[6];
        long l15 = nArray2[7];
        long l16 = 0L;
        int n8 = 0;
        while (n8 < 8) {
            long l17 = (long)nArray[n8] & 0xFFFFFFFFL;
            long l18 = l17 * (l8 & 0xFFFFFFFFL) + ((long)nArray3[n8] & 0xFFFFFFFFL);
            nArray3[n8] = (int)l18;
            int n9 = n8 + 1;
            l18 = (l18 >>> 32) + (l17 * (l9 & 0xFFFFFFFFL) + ((long)nArray3[n9] & 0xFFFFFFFFL));
            nArray3[n9] = (int)l18;
            int n10 = n8 + 2;
            l18 = (l18 >>> 32) + (l17 * (l10 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l18;
            n10 = n8 + 3;
            l18 = (l18 >>> 32) + (l17 * (l11 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l18;
            n10 = n8 + 4;
            l18 = (l18 >>> 32) + (l17 * (l12 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l18;
            n10 = n8 + 5;
            l18 = (l18 >>> 32) + (l17 * (l13 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l18;
            n10 = n8 + 6;
            l18 = (l18 >>> 32) + (l17 * (l14 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l18;
            n10 = n8 + 7;
            l17 = (l18 >>> 32) + (l17 * (l15 & 0xFFFFFFFFL) + ((long)nArray3[n10] & 0xFFFFFFFFL));
            nArray3[n10] = (int)l17;
            nArray3[n8] = (int)(l16 += (l17 >>> 32) + ((long)nArray3[n8 += 8] & 0xFFFFFFFFL));
            l16 >>>= 32;
            n8 = n9;
        }
        return (int)l16;
    }
}


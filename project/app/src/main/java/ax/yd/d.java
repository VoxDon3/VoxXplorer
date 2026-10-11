/*
 * Decompiled with CFR 0.152.
 */
package ax.yd;

import ax.Dd.k;
import ax.Nd.a;
import ax.Nd.h;
import ax.vd.o;
import ax.wd.g;
import ax.xd.e;
import ax.yd.c;

public class d {
    private d() {
    }

    private static void a(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int n8) {
        System.arraycopy(nArray, nArray.length - 16, nArray2, 0, 16);
        int n9 = nArray.length;
        n8 *= 2;
        int n10 = 0;
        int n11 = 0;
        while (n8 > 0) {
            d.h(nArray2, nArray, n10, nArray3);
            e.l(8, nArray3, nArray2);
            System.arraycopy(nArray2, 0, nArray4, n11, 16);
            n11 = (n9 >>> 1) + n10 - n11;
            n10 += 16;
            --n8;
        }
    }

    private static void b(byte[] byArray) {
        if (byArray != null) {
            a.g(byArray, (byte)0);
        }
    }

    private static void c(int[] nArray) {
        if (nArray != null) {
            a.i(nArray, 0);
        }
    }

    private static void d(int[][] nArray) {
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            d.c(nArray[i8]);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] e(byte[] byArray, byte[] objectArray, int n8, int n9, int n10, int n11) {
        Throwable throwable2;
        byte[] byArray2;
        block6: {
            int n12;
            int n13;
            int n14 = n9 * 128;
            byArray2 = d.g(byArray, objectArray, n10 * n14);
            int[] nArray = null;
            objectArray = nArray;
            try {
                n13 = byArray2.length >>> 2;
                objectArray = nArray;
                nArray = new int[n13];
                objectArray = nArray;
                h.i(byArray2, 0, nArray);
                n10 = 0;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            for (n12 = n8 * n9; n8 - n10 > 2 && n12 > 1024; ++n10, n12 >>>= 1) {
            }
            for (n12 = 0; n12 < n13; n12 += n14 >>> 2) {
                objectArray = nArray;
                {
                    d.f(nArray, n12, n8, n10, n9);
                    continue;
                }
            }
            objectArray = nArray;
            {
                h.g(nArray, byArray2, 0);
                objectArray = nArray;
                byArray = d.g(byArray, byArray2, n11);
            }
            d.b(byArray2);
            d.c(nArray);
            return byArray;
        }
        d.b(byArray2);
        d.c(objectArray);
        throw throwable2;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void f(int[] nArray, int n8, int n9, int n10, int n11) {
        int n12;
        int[][] nArrayArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int n13;
        int n14;
        int n15;
        block7: {
            n15 = ax.Nd.d.b(n9);
            n14 = n9 >>> n10;
            int n16 = 1 << n10;
            n10 = n15 - n10;
            n13 = n11 * 32;
            nArray5 = new int[16];
            nArray4 = new int[16];
            nArray3 = new int[n13];
            nArray2 = new int[n13];
            nArrayArray = new int[n16][];
            try {
                System.arraycopy(nArray, n8, nArray2, 0, n13);
                for (n15 = 0; n15 < n16; ++n15) {
                    int[] nArray6 = new int[n14 * n13];
                    nArrayArray[n15] = nArray6;
                    int n17 = 0;
                    for (n12 = 0; n12 < n14; n17 += n13, n12 += 2) {
                        System.arraycopy(nArray2, 0, nArray6, n17, n13);
                        d.a(nArray2, nArray5, nArray4, nArray3, n11);
                        System.arraycopy(nArray3, 0, nArray6, n17 += n13, n13);
                        d.a(nArray3, nArray5, nArray4, nArray2, n11);
                    }
                }
                break block7;
            }
            catch (Throwable throwable) {}
            d.d(nArrayArray);
            d.d(new int[][]{nArray2, nArray5, nArray4, nArray3});
            throw throwable;
        }
        for (n15 = 0; n15 < n9; ++n15) {
            n12 = nArray2[n13 - 16] & n9 - 1;
            {
                System.arraycopy(nArrayArray[n12 >>> n10], (n12 & n14 - 1) * n13, nArray3, 0, n13);
                d.h(nArray3, nArray2, 0, nArray3);
                d.a(nArray3, nArray5, nArray4, nArray2, n11);
                continue;
            }
        }
        {
            System.arraycopy(nArray2, 0, nArray, n8, n13);
        }
        d.d(nArrayArray);
        d.d(new int[][]{nArray2, nArray5, nArray4, nArray3});
    }

    private static byte[] g(byte[] byArray, byte[] byArray2, int n8) {
        c c8 = new c(new g());
        c8.b(byArray, byArray2, 1);
        return ((k)((o)c8).a(n8 * 8)).a();
    }

    private static void h(int[] nArray, int[] nArray2, int n8, int[] nArray3) {
        for (int i8 = nArray3.length - 1; i8 >= 0; --i8) {
            nArray3[i8] = nArray[i8] ^ nArray2[n8 + i8];
        }
    }

    public static byte[] i(byte[] object, byte[] byArray, int n8, int n9, int n10, int n11) {
        if (object != null) {
            if (byArray != null) {
                if (n8 > 1 && d.j(n8)) {
                    if (n9 == 1 && n8 >= 65536) {
                        throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                    }
                    if (n9 >= 1) {
                        int n12 = Integer.MAX_VALUE / (n9 * 1024);
                        if (n10 >= 1 && n10 <= n12) {
                            if (n11 >= 1) {
                                return d.e((byte[])object, byArray, n8, n9, n10, n11);
                            }
                            throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Parallelisation parameter p must be >= 1 and <= ");
                        ((StringBuilder)object).append(n12);
                        ((StringBuilder)object).append(" (based on block size r of ");
                        ((StringBuilder)object).append(n9);
                        ((StringBuilder)object).append(")");
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    throw new IllegalArgumentException("Block size r must be >= 1.");
                }
                throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        throw new IllegalArgumentException("Passphrase P must be provided.");
    }

    private static boolean j(int n8) {
        return (n8 & n8 - 1) == 0;
    }
}


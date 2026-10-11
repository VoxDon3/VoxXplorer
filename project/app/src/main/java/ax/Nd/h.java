/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

public abstract class h {
    public static int a(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] & 0xFF | (by << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    public static long b(byte[] byArray, int n8) {
        int n9 = h.a(byArray, n8);
        n8 = h.a(byArray, n8 + 4);
        long l8 = n9;
        return (long)n8 & 0xFFFFFFFFL | (l8 & 0xFFFFFFFFL) << 32;
    }

    public static void c(byte[] byArray, int n8, long[] lArray, int n9, int n10) {
        for (int i8 = 0; i8 < n10; ++i8) {
            lArray[n9 + i8] = h.b(byArray, n8);
            n8 += 8;
        }
    }

    public static void d(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)(n8 >>> 24);
        byArray[n9 + 1] = (byte)(n8 >>> 16);
        byArray[n9 + 2] = (byte)(n8 >>> 8);
        byArray[n9 + 3] = (byte)n8;
    }

    public static byte[] e(int n8) {
        byte[] byArray = new byte[4];
        h.d(n8, byArray, 0);
        return byArray;
    }

    public static void f(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    public static void g(int[] nArray, byte[] byArray, int n8) {
        int n9 = 0;
        int n10 = n8;
        for (n8 = n9; n8 < nArray.length; ++n8) {
            h.f(nArray[n8], byArray, n10);
            n10 += 4;
        }
    }

    public static int h(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    public static void i(byte[] byArray, int n8, int[] nArray) {
        int n9 = 0;
        int n10 = n8;
        for (n8 = n9; n8 < nArray.length; ++n8) {
            nArray[n8] = h.h(byArray, n10);
            n10 += 4;
        }
    }

    public static void j(byte[] byArray, int n8, int[] nArray, int n9, int n10) {
        for (int i8 = 0; i8 < n10; ++i8) {
            nArray[n9 + i8] = h.h(byArray, n8);
            n8 += 4;
        }
    }

    public static int[] k(byte[] byArray, int n8, int n9) {
        int[] nArray = new int[n9];
        int n10 = 0;
        int n11 = n8;
        for (n8 = n10; n8 < n9; ++n8) {
            nArray[n8] = h.h(byArray, n11);
            n11 += 4;
        }
        return nArray;
    }

    public static long l(byte[] byArray, int n8) {
        int n9 = h.h(byArray, n8);
        return ((long)h.h(byArray, n8 + 4) & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL & (long)n9;
    }

    public static void m(byte[] byArray, int n8, long[] lArray) {
        for (int i8 = 0; i8 < lArray.length; ++i8) {
            lArray[i8] = h.l(byArray, n8);
            n8 += 8;
        }
    }

    public static void n(long l8, byte[] byArray, int n8) {
        h.d((int)(l8 >>> 32), byArray, n8);
        h.d((int)(l8 & 0xFFFFFFFFL), byArray, n8 + 4);
    }

    public static void o(long[] lArray, int n8, int n9, byte[] byArray, int n10) {
        int n11 = 0;
        int n12 = n10;
        for (n10 = n11; n10 < n9; ++n10) {
            h.n(lArray[n8 + n10], byArray, n12);
            n12 += 8;
        }
    }

    public static void p(long l8, byte[] byArray, int n8) {
        h.f((int)(0xFFFFFFFFL & l8), byArray, n8);
        h.f((int)(l8 >>> 32), byArray, n8 + 4);
    }

    public static void q(long[] lArray, int n8, int n9, byte[] byArray, int n10) {
        int n11 = 0;
        int n12 = n10;
        for (n10 = n11; n10 < n9; ++n10) {
            h.p(lArray[n8 + n10], byArray, n12);
            n12 += 8;
        }
    }

    public static void r(long[] lArray, byte[] byArray, int n8) {
        int n9 = 0;
        int n10 = n8;
        for (n8 = n9; n8 < lArray.length; ++n8) {
            h.p(lArray[n8], byArray, n10);
            n10 += 8;
        }
    }

    public static byte[] s(long l8) {
        byte[] byArray = new byte[8];
        h.p(l8, byArray, 0);
        return byArray;
    }
}


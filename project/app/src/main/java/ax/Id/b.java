/*
 * Decompiled with CFR 0.152.
 */
package ax.Id;

import ax.Kd.c;

public abstract class b {
    private static final int[] a = new int[]{-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] b = new int[]{34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void A(int[] nArray, int[] nArray2) {
        for (int i8 = 0; i8 < 10; ++i8) {
            nArray2[i8] = -nArray[i8];
        }
    }

    public static void B(int[] nArray) {
        int n8 = nArray[9] >>> 23 & 1;
        ax.Id.b.E(nArray, n8);
        ax.Id.b.E(nArray, -n8);
    }

    public static void C(int[] nArray) {
        nArray[0] = 1;
        for (int i8 = 1; i8 < 10; ++i8) {
            nArray[i8] = 0;
        }
    }

    private static void D(int[] nArray, int[] nArray2, int[] nArray3) {
        ax.Id.b.G(nArray, nArray2);
        ax.Id.b.z(nArray, nArray2, nArray2);
        int[] nArray4 = ax.Id.b.h();
        ax.Id.b.G(nArray2, nArray4);
        ax.Id.b.z(nArray, nArray4, nArray4);
        ax.Id.b.F(nArray4, 2, nArray4);
        ax.Id.b.z(nArray2, nArray4, nArray4);
        nArray2 = ax.Id.b.h();
        ax.Id.b.F(nArray4, 5, nArray2);
        ax.Id.b.z(nArray4, nArray2, nArray2);
        int[] nArray5 = ax.Id.b.h();
        ax.Id.b.F(nArray2, 5, nArray5);
        ax.Id.b.z(nArray4, nArray5, nArray5);
        ax.Id.b.F(nArray5, 10, nArray4);
        ax.Id.b.z(nArray2, nArray4, nArray4);
        ax.Id.b.F(nArray4, 25, nArray2);
        ax.Id.b.z(nArray4, nArray2, nArray2);
        ax.Id.b.F(nArray2, 25, nArray5);
        ax.Id.b.z(nArray4, nArray5, nArray5);
        ax.Id.b.F(nArray5, 50, nArray4);
        ax.Id.b.z(nArray2, nArray4, nArray4);
        ax.Id.b.F(nArray4, 125, nArray2);
        ax.Id.b.z(nArray4, nArray2, nArray2);
        ax.Id.b.F(nArray2, 2, nArray4);
        ax.Id.b.z(nArray4, nArray, nArray3);
    }

    private static void E(int[] nArray, int n8) {
        int n9 = nArray[9];
        long l8 = (long)(((n9 >> 24) + n8) * 19) + (long)nArray[0];
        nArray[0] = (int)l8 & 0x3FFFFFF;
        l8 = (l8 >> 26) + (long)nArray[1];
        nArray[1] = (int)l8 & 0x3FFFFFF;
        l8 = (l8 >> 26) + (long)nArray[2];
        nArray[2] = (int)l8 & 0x1FFFFFF;
        l8 = (l8 >> 25) + (long)nArray[3];
        nArray[3] = (int)l8 & 0x3FFFFFF;
        l8 = (l8 >> 26) + (long)nArray[4];
        nArray[4] = (int)l8 & 0x1FFFFFF;
        l8 = (l8 >> 25) + (long)nArray[5];
        nArray[5] = (int)l8 & 0x3FFFFFF;
        l8 = (l8 >> 26) + (long)nArray[6];
        nArray[6] = (int)l8 & 0x3FFFFFF;
        l8 = (l8 >> 26) + (long)nArray[7];
        nArray[7] = 0x1FFFFFF & (int)l8;
        l8 = (l8 >> 25) + (long)nArray[8];
        nArray[8] = 0x3FFFFFF & (int)l8;
        nArray[9] = (0xFFFFFF & n9) + (int)(l8 >> 26);
    }

    public static void F(int[] nArray, int n8, int[] nArray2) {
        ax.Id.b.G(nArray, nArray2);
        while (--n8 > 0) {
            ax.Id.b.G(nArray2, nArray2);
        }
    }

    public static void G(int[] nArray, int[] nArray2) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        long l8 = n8;
        long l9 = n9 * 2;
        long l10 = n10 * 2;
        long l11 = n9;
        long l12 = n11 * 2;
        long l13 = n10;
        long l14 = n12 * 2;
        long l15 = l13 * l10 + l8 * l14 + l11 * l12;
        long l16 = n11;
        long l17 = n12;
        long l18 = n13;
        long l19 = n14 * 2;
        long l20 = n15 * 2;
        long l21 = n14;
        long l22 = n16 * 2;
        l13 = n15;
        long l23 = n17 * 2;
        long l24 = l13 * l20 + l18 * l23 + l21 * l22;
        long l25 = n16;
        long l26 = n17;
        long l27 = l8 * l8 - (l19 * l23 + l20 * l22) * 38L;
        l13 = l8 * l9 - (l20 * l23 + l25 * l25) * 38L;
        l11 = l8 * l10 + l11 * l11 - l25 * l23 * 38L;
        l8 = l9 * l10 + l8 * l12 - l26 * l23 * 38L;
        l9 = l9 * l14 + l10 * l12 - l18 * l18;
        l10 = l10 * l14 + l16 * l16 - l18 * l19;
        l16 = l16 * l14 - (l18 * l20 + l21 * l21);
        l18 = l17 * l14 - (l19 * l20 + l18 * l22);
        n14 = n9 + n14;
        n15 = n10 + n15;
        n16 = n11 + n16;
        n17 = n12 + n17;
        l14 = n8 + n13;
        l22 = n14 * 2;
        l19 = n15 * 2;
        l20 = n14;
        l23 = n16 * 2;
        l25 = n15;
        l21 = n17 * 2;
        l12 = n16;
        l17 = n17;
        l26 = l18 + (l22 * l19 + l14 * l23 - l8);
        n13 = (int)l26;
        l26 = (l26 >> 26) + (l25 * l19 + l14 * l21 + l20 * l23 - l15 - l24);
        n8 = (int)l26;
        l23 = l27 + ((l26 >> 25) + (l22 * l21 + l23 * l19) - l9) * 38L;
        nArray2[0] = (int)l23 & 0x3FFFFFF;
        l23 = (l23 >> 26) + (l13 + (l19 * l21 + l12 * l12 - l10) * 38L);
        nArray2[1] = (int)l23 & 0x3FFFFFF;
        l12 = (l23 >> 26) + (l11 + (l12 * l21 - l16) * 38L);
        nArray2[2] = (int)l12 & 0x1FFFFFF;
        l8 = (l12 >> 25) + (l8 + (l17 * l21 - l18) * 38L);
        nArray2[3] = (int)l8 & 0x3FFFFFF;
        l15 = (l8 >> 26) + (l15 + l24 * 38L);
        nArray2[4] = (int)l15 & 0x1FFFFFF;
        l15 = (l15 >> 25) + (l9 + (l14 * l14 - l27));
        nArray2[5] = (int)l15 & 0x3FFFFFF;
        l13 = (l15 >> 26) + (l10 + (l14 * l22 - l13));
        nArray2[6] = (int)l13 & 0x3FFFFFF;
        l13 = (l13 >> 26) + (l16 + (l14 * l19 + l20 * l20 - l11));
        nArray2[7] = 0x1FFFFFF & (int)l13;
        l13 = (l13 >> 25) + (long)(n13 & 0x3FFFFFF);
        nArray2[8] = (int)l13 & 0x3FFFFFF;
        nArray2[9] = (n8 & 0x1FFFFFF) + (int)(l13 >> 26);
    }

    public static boolean H(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = ax.Id.b.h();
        int[] nArray5 = ax.Id.b.h();
        ax.Id.b.z(nArray, nArray2, nArray4);
        ax.Id.b.G(nArray2, nArray5);
        ax.Id.b.z(nArray4, nArray5, nArray4);
        ax.Id.b.G(nArray5, nArray5);
        ax.Id.b.z(nArray5, nArray4, nArray5);
        int[] nArray6 = ax.Id.b.h();
        int[] nArray7 = ax.Id.b.h();
        ax.Id.b.D(nArray5, nArray6, nArray7);
        ax.Id.b.z(nArray7, nArray4, nArray7);
        nArray4 = ax.Id.b.h();
        ax.Id.b.G(nArray7, nArray4);
        ax.Id.b.z(nArray4, nArray2, nArray4);
        ax.Id.b.I(nArray4, nArray, nArray6);
        ax.Id.b.B(nArray6);
        if (ax.Id.b.x(nArray6)) {
            ax.Id.b.g(nArray7, 0, nArray3, 0);
            return true;
        }
        ax.Id.b.a(nArray4, nArray, nArray6);
        ax.Id.b.B(nArray6);
        if (ax.Id.b.x(nArray6)) {
            ax.Id.b.z(nArray7, b, nArray3);
            return true;
        }
        return false;
    }

    public static void I(int[] nArray, int[] nArray2, int[] nArray3) {
        for (int i8 = 0; i8 < 10; ++i8) {
            nArray3[i8] = nArray[i8] - nArray2[i8];
        }
    }

    public static void J(int[] nArray) {
        nArray[0] = nArray[0] - 1;
    }

    public static void K(int[] nArray) {
        for (int i8 = 0; i8 < 10; ++i8) {
            nArray[i8] = 0;
        }
    }

    public static void a(int[] nArray, int[] nArray2, int[] nArray3) {
        for (int i8 = 0; i8 < 10; ++i8) {
            nArray3[i8] = nArray[i8] + nArray2[i8];
        }
    }

    public static void b(int[] nArray) {
        nArray[0] = nArray[0] + 1;
    }

    public static void c(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        for (int i8 = 0; i8 < 10; ++i8) {
            int n8 = nArray[i8];
            int n9 = nArray2[i8];
            nArray3[i8] = n8 + n9;
            nArray4[i8] = n8 - n9;
        }
    }

    public static void d(int[] nArray) {
        int n8 = nArray[0];
        int n9 = nArray[1];
        int n10 = nArray[2];
        int n11 = nArray[3];
        int n12 = nArray[4];
        int n13 = nArray[5];
        int n14 = nArray[6];
        int n15 = nArray[7];
        int n16 = nArray[8];
        int n17 = nArray[9];
        n12 += n11 >> 26;
        n17 += n16 >> 26;
        n11 = (n11 & 0x3FFFFFF) + ((n10 += n9 >> 26) >> 25);
        n16 = (n16 & 0x3FFFFFF) + ((n15 += n14 >> 26) >> 25);
        n9 = (n9 & 0x3FFFFFF) + ((n8 += (n17 >> 25) * 38) >> 26);
        n14 = (n14 & 0x3FFFFFF) + ((n13 += n12 >> 25) >> 26);
        nArray[0] = n8 & 0x3FFFFFF;
        nArray[1] = n9 & 0x3FFFFFF;
        nArray[2] = (n10 & 0x1FFFFFF) + (n9 >> 26);
        nArray[3] = n11 & 0x3FFFFFF;
        nArray[4] = (n12 & 0x1FFFFFF) + (n11 >> 26);
        nArray[5] = n13 & 0x3FFFFFF;
        nArray[6] = n14 & 0x3FFFFFF;
        nArray[7] = (n15 & 0x1FFFFFF) + (n14 >> 26);
        nArray[8] = n16 & 0x3FFFFFF;
        nArray[9] = (n17 & 0x1FFFFFF) + (n16 >> 26);
    }

    public static void e(int n8, int[] nArray, int n9, int[] nArray2, int n10) {
        for (int i8 = 0; i8 < 10; ++i8) {
            int n11 = n10 + i8;
            int n12 = nArray2[n11];
            nArray2[n11] = n12 ^ (nArray[n9 + i8] ^ n12) & n8;
        }
    }

    public static void f(int n8, int[] nArray) {
        int n9 = 0;
        int n10 = 0 - n8;
        for (n8 = n9; n8 < 10; ++n8) {
            nArray[n8] = (nArray[n8] ^ n10) - n10;
        }
    }

    public static void g(int[] nArray, int n8, int[] nArray2, int n9) {
        for (int i8 = 0; i8 < 10; ++i8) {
            nArray2[n9 + i8] = nArray[n8 + i8];
        }
    }

    public static int[] h() {
        return new int[10];
    }

    public static int[] i(int n8) {
        return new int[n8 * 10];
    }

    public static void j(int n8, int[] nArray, int[] nArray2) {
        for (int i8 = 0; i8 < 10; ++i8) {
            int n9 = nArray[i8];
            int n10 = nArray2[i8];
            int n11 = (n9 ^ n10) & 0 - n8;
            nArray[i8] = n9 ^ n11;
            nArray2[i8] = n10 ^ n11;
        }
    }

    public static void k(byte[] byArray, int n8, int[] nArray) {
        ax.Id.b.m(byArray, n8, nArray, 0);
        ax.Id.b.m(byArray, n8 + 16, nArray, 5);
        nArray[9] = nArray[9] & 0xFFFFFF;
    }

    public static void l(int[] nArray, int n8, int[] nArray2) {
        ax.Id.b.n(nArray, n8, nArray2, 0);
        ax.Id.b.n(nArray, n8 + 4, nArray2, 5);
        nArray2[9] = nArray2[9] & 0xFFFFFF;
    }

    private static void m(byte[] byArray, int n8, int[] nArray, int n9) {
        int n10 = ax.Id.b.o(byArray, n8);
        int n11 = ax.Id.b.o(byArray, n8 + 4);
        int n12 = ax.Id.b.o(byArray, n8 + 8);
        n8 = ax.Id.b.o(byArray, n8 + 12);
        nArray[n9] = n10 & 0x3FFFFFF;
        nArray[n9 + 1] = (n10 >>> 26 | n11 << 6) & 0x3FFFFFF;
        nArray[n9 + 2] = (n11 >>> 20 | n12 << 12) & 0x1FFFFFF;
        nArray[n9 + 3] = 0x3FFFFFF & (n8 << 19 | n12 >>> 13);
        nArray[n9 + 4] = n8 >>> 7;
    }

    private static void n(int[] nArray, int n8, int[] nArray2, int n9) {
        int n10 = nArray[n8];
        int n11 = nArray[n8 + 1];
        int n12 = nArray[n8 + 2];
        n8 = nArray[n8 + 3];
        nArray2[n9] = n10 & 0x3FFFFFF;
        nArray2[n9 + 1] = (n10 >>> 26 | n11 << 6) & 0x3FFFFFF;
        nArray2[n9 + 2] = (n11 >>> 20 | n12 << 12) & 0x1FFFFFF;
        nArray2[n9 + 3] = 0x3FFFFFF & (n8 << 19 | n12 >>> 13);
        nArray2[n9 + 4] = n8 >>> 7;
    }

    private static int o(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return byArray[n8 + 3] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    public static void p(int[] nArray, byte[] byArray, int n8) {
        ax.Id.b.r(nArray, 0, byArray, n8);
        ax.Id.b.r(nArray, 5, byArray, n8 + 16);
    }

    public static void q(int[] nArray, int[] nArray2, int n8) {
        ax.Id.b.s(nArray, 0, nArray2, n8);
        ax.Id.b.s(nArray, 5, nArray2, n8 + 4);
    }

    private static void r(int[] nArray, int n8, byte[] byArray, int n9) {
        int n10 = nArray[n8];
        int n11 = nArray[n8 + 1];
        int n12 = nArray[n8 + 2];
        int n13 = nArray[n8 + 3];
        n8 = nArray[n8 + 4];
        ax.Id.b.t(n11 << 26 | n10, byArray, n9);
        ax.Id.b.t(n11 >>> 6 | n12 << 20, byArray, n9 + 4);
        ax.Id.b.t(n12 >>> 12 | n13 << 13, byArray, n9 + 8);
        ax.Id.b.t(n8 << 7 | n13 >>> 19, byArray, n9 + 12);
    }

    private static void s(int[] nArray, int n8, int[] nArray2, int n9) {
        int n10 = nArray[n8];
        int n11 = nArray[n8 + 1];
        int n12 = nArray[n8 + 2];
        int n13 = nArray[n8 + 3];
        n8 = nArray[n8 + 4];
        nArray2[n9] = n11 << 26 | n10;
        nArray2[n9 + 1] = n11 >>> 6 | n12 << 20;
        nArray2[n9 + 2] = n12 >>> 12 | n13 << 13;
        nArray2[n9 + 3] = n8 << 7 | n13 >>> 19;
    }

    private static void t(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    public static void u(int[] nArray, int[] nArray2) {
        int[] nArray3 = ax.Id.b.h();
        int[] nArray4 = new int[8];
        ax.Id.b.g(nArray, 0, nArray3, 0);
        ax.Id.b.B(nArray3);
        ax.Id.b.q(nArray3, nArray4, 0);
        c.j(a, nArray4, nArray4);
        ax.Id.b.l(nArray4, 0, nArray2);
    }

    public static void v(int[] nArray, int[] nArray2) {
        int[] nArray3 = ax.Id.b.h();
        int[] nArray4 = new int[8];
        ax.Id.b.g(nArray, 0, nArray3, 0);
        ax.Id.b.B(nArray3);
        ax.Id.b.q(nArray3, nArray4, 0);
        c.k(a, nArray4, nArray4);
        ax.Id.b.l(nArray4, 0, nArray2);
    }

    public static int w(int[] nArray) {
        int n8 = 0;
        for (int i8 = 0; i8 < 10; ++i8) {
            n8 |= nArray[i8];
        }
        return (n8 >>> 1 | n8 & 1) - 1 >> 31;
    }

    public static boolean x(int[] nArray) {
        return ax.Id.b.w(nArray) != 0;
    }

    public static void y(int[] nArray, int n8, int[] nArray2) {
        int n9 = nArray[0];
        int n10 = nArray[1];
        int n11 = nArray[2];
        int n12 = nArray[3];
        int n13 = nArray[4];
        int n14 = nArray[5];
        int n15 = nArray[6];
        int n16 = nArray[7];
        int n17 = nArray[8];
        int n18 = nArray[9];
        long l8 = n11;
        long l9 = n8;
        long l10 = l8 * l9;
        n8 = (int)l10;
        long l11 = (long)n13 * l9;
        n13 = (int)l11;
        l8 = (long)n16 * l9;
        n16 = (int)l8;
        long l12 = (long)n18 * l9;
        n18 = (int)l12;
        l12 = (l12 >> 25) * 38L + (long)n9 * l9;
        nArray2[0] = (int)l12 & 0x3FFFFFF;
        l11 = (l11 >> 25) + (long)n14 * l9;
        nArray2[5] = (int)l11 & 0x3FFFFFF;
        l12 = (l12 >> 26) + (long)n10 * l9;
        nArray2[1] = (int)l12 & 0x3FFFFFF;
        l10 = (l10 >> 25) + (long)n12 * l9;
        nArray2[3] = (int)l10 & 0x3FFFFFF;
        l11 = (l11 >> 26) + (long)n15 * l9;
        nArray2[6] = (int)l11 & 0x3FFFFFF;
        l9 = (l8 >> 25) + (long)n17 * l9;
        nArray2[8] = (int)l9 & 0x3FFFFFF;
        nArray2[2] = (n8 & 0x1FFFFFF) + (int)(l12 >> 26);
        nArray2[4] = (n13 & 0x1FFFFFF) + (int)(l10 >> 26);
        nArray2[7] = (n16 & 0x1FFFFFF) + (int)(l11 >> 26);
        nArray2[9] = (n18 & 0x1FFFFFF) + (int)(l9 >> 26);
    }

    public static void z(int[] nArray, int[] nArray2, int[] nArray3) {
        int n8 = nArray[0];
        int n9 = nArray2[0];
        int n10 = nArray[1];
        int n11 = nArray2[1];
        int n12 = nArray[2];
        int n13 = nArray2[2];
        int n14 = nArray[3];
        int n15 = nArray2[3];
        int n16 = nArray[4];
        int n17 = nArray2[4];
        int n18 = nArray[5];
        int n19 = nArray2[5];
        int n20 = nArray[6];
        int n21 = nArray2[6];
        int n22 = nArray[7];
        int n23 = nArray2[7];
        int n24 = nArray[8];
        int n25 = nArray2[8];
        int n26 = nArray[9];
        int n27 = nArray2[9];
        long l8 = n8;
        long l9 = n9;
        long l10 = n11;
        long l11 = n10;
        long l12 = n13;
        long l13 = n12;
        long l14 = n15;
        long l15 = n14;
        long l16 = n17;
        long l17 = n16;
        long l18 = (l13 * l12 << 1) + (l8 * l16 + l11 * l14 + l15 * l10 + l9 * l17);
        long l19 = n18;
        long l20 = n19;
        long l21 = n21;
        long l22 = n20;
        long l23 = n23;
        long l24 = n22;
        long l25 = n25;
        long l26 = n24;
        long l27 = n27;
        long l28 = n26;
        long l29 = (l24 * l23 << 1) + (l19 * l27 + l22 * l25 + l26 * l21 + l20 * l28);
        long l30 = l8 * l9 - (l22 * l27 + l24 * l25 + l26 * l23 + l28 * l21) * 76L;
        long l31 = l8 * l10 + l11 * l9 - ((l24 * l27 + l28 * l23 << 1) + l26 * l25) * 38L;
        long l32 = l8 * l12 + l11 * l10 + l13 * l9 - (l26 * l27 + l28 * l25) * 38L;
        l27 = (l11 * l12 + l13 * l10 << 1) + (l8 * l14 + l15 * l9) - l28 * l27 * 76L;
        l10 = (l11 * l16 + l13 * l14 + l15 * l12 + l17 * l10 << 1) - l19 * l20;
        l12 = (l13 * l16 + l17 * l12 << 1) + l15 * l14 - (l19 * l21 + l22 * l20);
        l14 = l15 * l16 + l17 * l14 - (l19 * l23 + l22 * l21 + l24 * l20);
        l26 = (l17 * l16 << 1) - ((l22 * l23 + l24 * l21 << 1) + (l19 * l25 + l26 * l20));
        l16 = n8 + n18;
        l24 = n9 + n19;
        l25 = n11 + n21;
        l21 = n10 + n20;
        l22 = n13 + n23;
        l20 = n12 + n22;
        l15 = n15 + n25;
        l17 = n14 + n24;
        l23 = n17 + n27;
        l19 = n16 + n26;
        l13 = l26 + ((l21 * l22 + l20 * l25 << 1) + (l16 * l15 + l17 * l24) - l27);
        n8 = (int)l13;
        l13 = (l13 >> 26) + ((l20 * l22 << 1) + (l16 * l23 + l21 * l15 + l17 * l25 + l19 * l24) - l18 - l29);
        n14 = (int)l13;
        l13 = l30 + ((l13 >> 25) + (l21 * l23 + l20 * l15 + l17 * l22 + l19 * l25 << 1) - l10) * 38L;
        nArray3[0] = (int)l13 & 0x3FFFFFF;
        l13 = (l13 >> 26) + (l31 + ((l20 * l23 + l22 * l19 << 1) + l17 * l15 - l12) * 38L);
        nArray3[1] = (int)l13 & 0x3FFFFFF;
        l17 = (l13 >> 26) + (l32 + (l17 * l23 + l19 * l15 - l14) * 38L);
        nArray3[2] = (int)l17 & 0x1FFFFFF;
        l27 = (l17 >> 25) + (l27 + ((l19 * l23 << 1) - l26) * 38L);
        nArray3[3] = (int)l27 & 0x3FFFFFF;
        l18 = (l27 >> 26) + (l18 + l29 * 38L);
        nArray3[4] = (int)l18 & 0x1FFFFFF;
        l30 = (l18 >> 25) + (l10 + (l16 * l24 - l30));
        nArray3[5] = (int)l30 & 0x3FFFFFF;
        l31 = (l30 >> 26) + (l12 + (l16 * l25 + l21 * l24 - l31));
        nArray3[6] = (int)l31 & 0x3FFFFFF;
        l32 = (l31 >> 26) + (l14 + (l16 * l22 + l21 * l25 + l20 * l24 - l32));
        nArray3[7] = (int)l32 & 0x1FFFFFF;
        l32 = (l32 >> 25) + (long)(n8 & 0x3FFFFFF);
        nArray3[8] = (int)l32 & 0x3FFFFFF;
        nArray3[9] = (n14 & 0x1FFFFFF) + (int)(l32 >> 26);
    }
}


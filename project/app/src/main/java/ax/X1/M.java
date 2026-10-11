/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;

public final class M {
    public static int a(byte[] byArray, int n8, int n9) {
        while (n8 < n9 && byArray[n8] != 71) {
            ++n8;
        }
        return n8;
    }

    public static boolean b(byte[] byArray, int n8, int n9, int n10) {
        int n11 = 0;
        for (int i8 = -4; i8 <= 4; ++i8) {
            int n12 = i8 * 188 + n10;
            if (n12 >= n8 && n12 < n9 && byArray[n12] == 71) {
                n11 = n12 = n11 + 1;
                if (n12 != 5) continue;
                return true;
            }
            n11 = 0;
        }
        return false;
    }

    public static long c(G g8, int n8, int n9) {
        g8.b0(n8);
        if (g8.a() < 5) {
            return -9223372036854775807L;
        }
        n8 = g8.v();
        if ((0x800000 & n8) != 0) {
            return -9223372036854775807L;
        }
        if ((0x1FFF00 & n8) >> 8 != n9) {
            return -9223372036854775807L;
        }
        if ((n8 & 0x20) != 0 && g8.M() >= 7 && g8.a() >= 7 && (g8.M() & 0x10) == 16) {
            byte[] byArray = new byte[6];
            g8.q(byArray, 0, 6);
            return M.d(byArray);
        }
        return -9223372036854775807L;
    }

    private static long d(byte[] byArray) {
        return ((long)byArray[0] & 0xFFL) << 25 | ((long)byArray[1] & 0xFFL) << 17 | ((long)byArray[2] & 0xFFL) << 9 | ((long)byArray[3] & 0xFFL) << 1 | (0xFFL & (long)byArray[4]) >> 7;
    }
}


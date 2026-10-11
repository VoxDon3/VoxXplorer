/*
 * Decompiled with CFR 0.152.
 */
package ax.t7;

import ax.q7.n;

final class b {
    static long a(double d8) {
        n.e(b.b(d8), "not a normal value");
        int n8 = Math.getExponent(d8);
        long l8 = Double.doubleToRawLongBits(d8) & 0xFFFFFFFFFFFFFL;
        if (n8 == -1023) {
            return l8 << 1;
        }
        return l8 | 0x10000000000000L;
    }

    static boolean b(double d8) {
        return Math.getExponent(d8) <= 1023;
    }

    static boolean c(double d8) {
        return Math.getExponent(d8) >= -1022;
    }

    static double d(double d8) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d8) & 0xFFFFFFFFFFFFFL | 0x3FF0000000000000L);
    }
}


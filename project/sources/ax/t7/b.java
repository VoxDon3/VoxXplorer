package ax.t7;

import ax.q7.n;

/* loaded from: classes3.dex */
final class b {
    static long a(double d) {
        n.e(b(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d) {
        return Math.getExponent(d) <= 1023;
    }

    static boolean c(double d) {
        return Math.getExponent(d) >= -1022;
    }

    static double d(double d) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
    }
}

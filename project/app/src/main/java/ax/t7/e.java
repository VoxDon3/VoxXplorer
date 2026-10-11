/*
 * Decompiled with CFR 0.152.
 */
package ax.t7;

import java.math.RoundingMode;

final class e {
    static void a(boolean bl, double d8, RoundingMode roundingMode) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rounded value is out of range for input ");
        stringBuilder.append(d8);
        stringBuilder.append(" and rounding mode ");
        stringBuilder.append((Object)roundingMode);
        throw new ArithmeticException(stringBuilder.toString());
    }

    static void b(boolean bl, String string, int n8, int n9) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("overflow: ");
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append(n8);
        stringBuilder.append(", ");
        stringBuilder.append(n9);
        stringBuilder.append(")");
        throw new ArithmeticException(stringBuilder.toString());
    }

    static void c(boolean bl, String string, long l8, long l9) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("overflow: ");
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append(l8);
        stringBuilder.append(", ");
        stringBuilder.append(l9);
        stringBuilder.append(")");
        throw new ArithmeticException(stringBuilder.toString());
    }

    static double d(String string, double d8) {
        if (d8 >= 0.0) {
            return d8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (");
        stringBuilder.append(d8);
        stringBuilder.append(") must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static long e(String string, long l8) {
        if (l8 >= 0L) {
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (");
        stringBuilder.append(l8);
        stringBuilder.append(") must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static int f(String string, int n8) {
        if (n8 > 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (");
        stringBuilder.append(n8);
        stringBuilder.append(") must be > 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void g(boolean bl) {
        if (bl) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}


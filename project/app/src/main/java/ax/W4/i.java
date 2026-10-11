/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.a;
import ax.W4.b;
import ax.X4.B;
import ax.X4.x;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class i {
    static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String b = String.valueOf(Long.MAX_VALUE);

    public static boolean a(char[] cArray, int n8, int n9, boolean bl) {
        String string = bl ? a : b;
        int n10 = string.length();
        if (n9 < n10) {
            return true;
        }
        if (n9 > n10) {
            return false;
        }
        for (n9 = 0; n9 < n10; ++n9) {
            int n11 = cArray[n8 + n9] - string.charAt(n9);
            if (n11 == 0) continue;
            return n11 < 0;
        }
        return true;
    }

    public static BigDecimal b(String string, boolean bl) throws NumberFormatException {
        if (bl) {
            return ax.W4.a.f(string);
        }
        return ax.W4.a.b(string);
    }

    public static BigInteger c(String string) throws NumberFormatException {
        return new BigInteger(string);
    }

    public static BigInteger d(String string, boolean bl) throws NumberFormatException {
        if (bl) {
            return ax.W4.b.a(string);
        }
        return i.c(string);
    }

    public static double e(String string, boolean bl) throws NumberFormatException {
        if (bl) {
            return x.a(string);
        }
        return Double.parseDouble(string);
    }

    public static float f(String string, boolean bl) throws NumberFormatException {
        if (bl) {
            return B.a(string);
        }
        return Float.parseFloat(string);
    }

    public static int g(char[] cArray, int n8, int n9) {
        int n10 = n8;
        int n11 = n9;
        if (n9 > 0) {
            n10 = n8;
            n11 = n9;
            if (cArray[n8] == '+') {
                n10 = n8 + 1;
                n11 = n9 - 1;
            }
        }
        int n12 = n8 = cArray[n10 + n11 - 1] - 48;
        int n13 = n10;
        int n14 = n8;
        int n15 = n10;
        int n16 = n8;
        n9 = n10;
        int n17 = n8;
        int n18 = n10;
        int n19 = n8;
        int n20 = n10;
        int n21 = n8;
        int n22 = n10;
        int n23 = n8;
        int n24 = n10;
        switch (n11) {
            default: {
                return n8;
            }
            case 9: {
                n12 = n8 + (cArray[n10] - 48) * 100000000;
                n13 = n10 + 1;
            }
            case 8: {
                n14 = n12 + (cArray[n13] - 48) * 10000000;
                n15 = n13 + 1;
            }
            case 7: {
                n16 = n14 + (cArray[n15] - 48) * 1000000;
                n9 = n15 + 1;
            }
            case 6: {
                n17 = n16 + (cArray[n9] - 48) * 100000;
                n18 = n9 + 1;
            }
            case 5: {
                n19 = n17 + (cArray[n18] - 48) * 10000;
                n20 = n18 + 1;
            }
            case 4: {
                n21 = n19 + (cArray[n20] - 48) * 1000;
                n22 = n20 + 1;
            }
            case 3: {
                n23 = n21 + (cArray[n22] - 48) * 100;
                n24 = n22 + 1;
            }
            case 2: 
        }
        return n23 + (cArray[n24] - 48) * 10;
    }

    public static long h(char[] cArray, int n8, int n9) {
        return (long)i.g(cArray, n8, n9 -= 9) * 1000000000L + (long)i.g(cArray, n8 + n9, 9);
    }

    public static long i(char[] cArray, int n8, boolean bl) {
        long l8 = 0L;
        for (int i8 = 0; i8 < 19; ++i8) {
            l8 = l8 * 10L + (long)(cArray[n8 + i8] - 48);
        }
        if (bl) {
            return -l8;
        }
        return l8;
    }
}


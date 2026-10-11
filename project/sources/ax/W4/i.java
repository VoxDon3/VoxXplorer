package ax.W4;

import ax.X4.B;
import ax.X4.x;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i {
    static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String b = String.valueOf(Long.MAX_VALUE);

    public static boolean a(char[] cArr, int i, int i2, boolean z) {
        String str = z ? a : b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static BigDecimal b(String str, boolean z) throws NumberFormatException {
        return z ? a.f(str) : a.b(str);
    }

    public static BigInteger c(String str) throws NumberFormatException {
        return new BigInteger(str);
    }

    public static BigInteger d(String str, boolean z) throws NumberFormatException {
        return z ? b.a(str) : c(str);
    }

    public static double e(String str, boolean z) throws NumberFormatException {
        return z ? x.a(str) : Double.parseDouble(str);
    }

    public static float f(String str, boolean z) throws NumberFormatException {
        return z ? B.a(str) : Float.parseFloat(str);
    }

    public static int g(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static long h(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (g(cArr, i, i3) * 1000000000) + g(cArr, i + i3, 9);
    }

    public static long i(char[] cArr, int i, boolean z) {
        long j = 0;
        for (int i2 = 0; i2 < 19; i2++) {
            j = (j * 10) + (cArr[i + i2] - '0');
        }
        return z ? -j : j;
    }
}

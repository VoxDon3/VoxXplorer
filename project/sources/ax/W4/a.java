package ax.W4;

import ax.X4.p;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class a {
    private static int a(int i, long j) {
        long j2 = i - j;
        if (j2 <= 2147483647L && j2 >= -2147483648L) {
            return (int) j2;
        }
        throw new NumberFormatException("Scale out of range: " + j2 + " while adjusting scale " + i + " to exponent " + j);
    }

    public static BigDecimal b(String str) {
        return c(str.toCharArray());
    }

    public static BigDecimal c(char[] cArr) {
        return d(cArr, 0, cArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigDecimal d(char[] r3, int r4, int r5) {
        /*
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 >= r0) goto Le
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            r0.<init>(r3, r4, r5)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r0
        La:
            r0 = move-exception
            goto L15
        Lc:
            r0 = move-exception
            goto L15
        Le:
            int r0 = r5 / 10
            java.math.BigDecimal r3 = e(r3, r4, r5, r0)     // Catch: java.lang.NumberFormatException -> La java.lang.ArithmeticException -> Lc
            return r3
        L15:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L1d
            java.lang.String r0 = "Not a valid number representation"
        L1d:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r1) goto L27
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3, r4, r5)
            goto L4a
        L27:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = new java.lang.String
            char[] r4 = java.util.Arrays.copyOfRange(r3, r4, r1)
            r2.<init>(r4)
            r5.append(r2)
            java.lang.String r4 = "(truncated, full length is "
            r5.append(r4)
            int r3 = r3.length
            r5.append(r3)
            java.lang.String r3 = " chars)"
            r5.append(r3)
            java.lang.String r1 = r5.toString()
        L4a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value \""
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = "\" can not be represented as `java.math.BigDecimal`, reason: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W4.a.d(char[], int, int):java.math.BigDecimal");
    }

    private static BigDecimal e(char[] cArr, int i, int i2, int i3) {
        int i4;
        BigDecimal g;
        int i5 = i + i2;
        int i6 = i;
        int i7 = i6;
        int i8 = -1;
        int i9 = 0;
        int i10 = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i6 < i5) {
            char c = cArr[i6];
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (i8 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i8 = i6;
                } else if (c != '-') {
                    if (c != '.') {
                        if (i10 >= 0 && i8 == -1) {
                            i9++;
                        }
                    } else {
                        if (i10 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i10 = i6;
                    }
                } else if (i8 >= 0) {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i7 = i6 + 1;
                    z = true;
                    z3 = true;
                }
            } else if (i8 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i7 = i6 + 1;
                z = true;
            }
            i6++;
        }
        if (i8 >= 0) {
            i4 = Integer.parseInt(new String(cArr, i8 + 1, (i5 - i8) - 1));
            i9 = a(i9, i4);
            i5 = i8;
        } else {
            i4 = 0;
        }
        if (i10 >= 0) {
            int i11 = (i5 - i10) - 1;
            g = g(cArr, i7, i10 - i7, i4, i3).add(g(cArr, i10 + 1, i11, i4 - i11, i3));
        } else {
            g = g(cArr, i7, i5 - i7, i4, i3);
        }
        if (i9 != 0) {
            g = g.setScale(i9);
        }
        return z3 ? g.negate() : g;
    }

    public static BigDecimal f(String str) {
        try {
            return p.a(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + e.getMessage());
        }
    }

    private static BigDecimal g(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i, i2).scaleByPowerOfTen(i3);
        }
        int i5 = i2 / 2;
        return g(cArr, i, i5, (i3 + i2) - i5, i4).add(g(cArr, i + i5, i2 - i5, i3, i4));
    }
}

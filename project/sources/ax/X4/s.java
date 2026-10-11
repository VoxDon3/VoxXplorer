package ax.X4;

import java.math.BigInteger;

/* loaded from: classes.dex */
class s extends f {
    s() {
    }

    private BigInteger d(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (i3 > 18) {
            return f(charSequence, i, i2, z);
        }
        int i4 = (i3 & 7) + i;
        long m = i.m(charSequence, i, i4);
        boolean z2 = m >= 0;
        while (i4 < i2) {
            int f = i.f(charSequence, i4);
            z2 &= f >= 0;
            m = (m * 100000000) + f;
            i4 += 8;
        }
        if (!z2) {
            throw new NumberFormatException("illegal syntax");
        }
        if (z) {
            m = -m;
        }
        return BigInteger.valueOf(m);
    }

    private BigInteger e(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int g = g(charSequence, i, i2);
        int i4 = i2 - g;
        if (i4 <= 0) {
            return BigInteger.ZERO;
        }
        if (i4 > 536870912) {
            throw new NumberFormatException("value exceeds limits");
        }
        byte[] bArr = new byte[((i4 + 1) >> 1) + 1];
        if ((i4 & 1) != 0) {
            int i5 = g + 1;
            int b = f.b(charSequence.charAt(g));
            bArr[1] = (byte) b;
            i3 = 2;
            z2 = b < 0;
            g = i5;
        } else {
            z2 = false;
            i3 = 1;
        }
        int i6 = ((i2 - g) & 7) + g;
        while (g < i6) {
            char charAt = charSequence.charAt(g);
            char charAt2 = charSequence.charAt(g + 1);
            int b2 = f.b(charAt);
            int b3 = f.b(charAt2);
            int i7 = i3 + 1;
            bArr[i3] = (byte) ((b2 << 4) | b3);
            z2 |= b3 < 0 || b2 < 0;
            g += 2;
            i3 = i7;
        }
        while (g < i2) {
            long h = i.h(charSequence, g);
            i.n(bArr, i3, (int) h);
            z2 |= h < 0;
            g += 8;
            i3 += 4;
        }
        if (z2) {
            throw new NumberFormatException("illegal syntax");
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z ? bigInteger.negate() : bigInteger;
    }

    private BigInteger f(CharSequence charSequence, int i, int i2, boolean z) {
        int g = g(charSequence, i, i2);
        if (i2 - g > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
        BigInteger b = C.b(charSequence, g, i2, k.e(g, i2));
        return z ? b.negate() : b;
    }

    private int g(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) == '0') {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a A[Catch: ArithmeticException -> 0x0043, TryCatch #0 {ArithmeticException -> 0x0043, blocks: (B:5:0x0006, B:9:0x0011, B:21:0x0035, B:24:0x0045, B:26:0x004a, B:28:0x0025, B:30:0x004f, B:31:0x0056, B:37:0x0057, B:38:0x005e), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigInteger c(java.lang.CharSequence r5, int r6, int r7, int r8) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            int r0 = r6 + r7
            if (r6 < 0) goto L57
            if (r0 < r6) goto L57
            int r1 = r5.length()     // Catch: java.lang.ArithmeticException -> L43
            if (r0 > r1) goto L57
            r1 = 1292782622(0x4d0e4c1e, float:1.49209568E8)
            if (r7 > r1) goto L57
            char r1 = r5.charAt(r6)     // Catch: java.lang.ArithmeticException -> L43
            r2 = 45
            if (r1 != r2) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L25
            r3 = 43
            if (r1 != r3) goto L23
            goto L25
        L23:
            r1 = r6
            goto L2d
        L25:
            int r1 = r6 + 1
            char r3 = ax.X4.f.a(r5, r1, r0)     // Catch: java.lang.ArithmeticException -> L43
            if (r3 == 0) goto L4f
        L2d:
            r3 = 10
            if (r8 == r3) goto L4a
            r3 = 16
            if (r8 == r3) goto L45
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.ArithmeticException -> L43
            java.lang.CharSequence r5 = r5.subSequence(r6, r7)     // Catch: java.lang.ArithmeticException -> L43
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ArithmeticException -> L43
            r0.<init>(r5, r8)     // Catch: java.lang.ArithmeticException -> L43
            return r0
        L43:
            r5 = move-exception
            goto L5f
        L45:
            java.math.BigInteger r5 = r4.e(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L43
            return r5
        L4a:
            java.math.BigInteger r5 = r4.d(r5, r1, r0, r2)     // Catch: java.lang.ArithmeticException -> L43
            return r5
        L4f:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException     // Catch: java.lang.ArithmeticException -> L43
            java.lang.String r6 = "illegal syntax"
            r5.<init>(r6)     // Catch: java.lang.ArithmeticException -> L43
            throw r5     // Catch: java.lang.ArithmeticException -> L43
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L43
            java.lang.String r6 = "offset < 0 or length > str.length"
            r5.<init>(r6)     // Catch: java.lang.ArithmeticException -> L43
            throw r5     // Catch: java.lang.ArithmeticException -> L43
        L5f:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.String r7 = "value exceeds limits"
            r6.<init>(r7)
            r6.initCause(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X4.s.c(java.lang.CharSequence, int, int, int):java.math.BigInteger");
    }
}

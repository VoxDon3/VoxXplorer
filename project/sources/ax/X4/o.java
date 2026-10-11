package ax.X4;

import java.math.BigDecimal;

/* loaded from: classes.dex */
final class o extends f {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.math.BigDecimal e(java.lang.CharSequence r6, int r7, int r8, int r9, int r10, boolean r11, int r12) {
        /*
            r5 = this;
            int r0 = r10 - r8
            int r0 = r0 + (-1)
            int r1 = r10 - r9
            int r2 = r8 - r7
            r3 = 400(0x190, float:5.6E-43)
            r4 = 0
            if (r2 <= 0) goto L21
            if (r2 <= r3) goto L1b
            java.util.NavigableMap r2 = ax.X4.k.c()
            ax.X4.k.f(r2, r7, r8)
            java.math.BigInteger r7 = ax.X4.C.b(r6, r7, r8, r2)
            goto L24
        L1b:
            java.math.BigInteger r7 = ax.X4.C.b(r6, r7, r8, r4)
        L1f:
            r2 = r4
            goto L24
        L21:
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            goto L1f
        L24:
            if (r0 <= 0) goto L4f
            if (r1 <= r3) goto L36
            if (r2 != 0) goto L2e
            java.util.NavigableMap r2 = ax.X4.k.c()
        L2e:
            ax.X4.k.f(r2, r9, r10)
            java.math.BigInteger r6 = ax.X4.C.b(r6, r9, r10, r2)
            goto L3a
        L36:
            java.math.BigInteger r6 = ax.X4.C.b(r6, r9, r10, r4)
        L3a:
            int r8 = r7.signum()
            if (r8 != 0) goto L42
        L40:
            r7 = r6
            goto L4f
        L42:
            java.math.BigInteger r8 = ax.X4.k.a(r2, r0)
            java.math.BigInteger r7 = ax.X4.l.k(r7, r8)
            java.math.BigInteger r6 = r7.add(r6)
            goto L40
        L4f:
            java.math.BigDecimal r6 = new java.math.BigDecimal
            if (r11 == 0) goto L57
            java.math.BigInteger r7 = r7.negate()
        L57:
            int r8 = -r12
            r6.<init>(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X4.o.e(java.lang.CharSequence, int, int, int, int, boolean, int):java.math.BigDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.math.BigDecimal c(java.lang.CharSequence r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X4.o.c(java.lang.CharSequence, int, int):java.math.BigDecimal");
    }

    BigDecimal d(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        long j2;
        int i8 = i;
        if (i2 > 1292782635) {
            throw new NumberFormatException("illegal syntax");
        }
        int i9 = i2 + i8;
        char a = f.a(charSequence, i8, i9);
        boolean z4 = a == '-';
        if ((z4 || a == '+') && (a = f.a(charSequence, (i8 = i8 + 1), i9)) == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        int i10 = i8;
        while (true) {
            i3 = i9 - 8;
            if (i10 >= i3 || !i.d(charSequence, i10)) {
                break;
            }
            i10 += 8;
        }
        while (i10 < i9 && charSequence.charAt(i10) == '0') {
            i10++;
        }
        int i11 = i10;
        while (i11 < i3 && i.c(charSequence, i11)) {
            i11 += 8;
        }
        while (i11 < i9) {
            a = charSequence.charAt(i11);
            if (!i.b(a)) {
                break;
            }
            i11++;
        }
        if (a == '.') {
            int i12 = i11 + 1;
            while (i12 < i3 && i.d(charSequence, i12)) {
                i12 += 8;
            }
            while (i12 < i9 && charSequence.charAt(i12) == '0') {
                i12++;
            }
            int i13 = i12;
            while (i13 < i3 && i.c(charSequence, i13)) {
                i13 += 8;
            }
            while (i13 < i9) {
                a = charSequence.charAt(i13);
                if (!i.b(a)) {
                    break;
                }
                i13++;
            }
            i5 = i12;
            i4 = i11;
            i11 = i13;
        } else {
            i4 = -1;
            i5 = -1;
        }
        if (i4 < 0) {
            i6 = i11 - i10;
            i5 = i11;
            i4 = i5;
            j = 0;
        } else {
            i6 = i10 == i4 ? i11 - i5 : (i11 - i10) - 1;
            j = (i4 - i11) + 1;
        }
        if ((a | ' ') == 101) {
            int i14 = i11 + 1;
            char a2 = f.a(charSequence, i14, i9);
            boolean z5 = a2 == '-';
            if (z5 || a2 == '+') {
                i14 = i11 + 2;
                a2 = f.a(charSequence, i14, i9);
            }
            boolean z6 = !i.b(a2);
            long j3 = 0;
            while (true) {
                if (j3 < 2147483647L) {
                    z3 = z5;
                    z = z4;
                    j3 = ((j3 * 10) + a2) - 48;
                } else {
                    z3 = z5;
                    z = z4;
                }
                j2 = j3;
                i14++;
                a2 = f.a(charSequence, i14, i9);
                if (!i.b(a2)) {
                    break;
                }
                j3 = j2;
                z4 = z;
                z5 = z3;
            }
            if (z3) {
                j2 = -j2;
            }
            j += j2;
            i7 = i11;
            z2 = z6;
            i11 = i14;
        } else {
            z = z4;
            i7 = i9;
            z2 = false;
        }
        if (z2 || i11 < i9) {
            throw new NumberFormatException("illegal syntax");
        }
        if (i7 - i8 == 0) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j < -2147483648L || j > 2147483647L || i6 > 1292782621) {
            throw new NumberFormatException("value exceeds limits");
        }
        return e(charSequence, i10, i4, i5, i7, z, (int) j);
    }
}

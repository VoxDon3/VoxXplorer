package ax.Ob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r extends q {
    public static Integer m(String str) {
        ax.Gb.l.f(str, "<this>");
        return n(str, 10);
    }

    public static final Integer n(String str, int i) {
        boolean z;
        int i2;
        int i3;
        ax.Gb.l.f(str, "<this>");
        b.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (ax.Gb.l.h(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int b = b.b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long o(String str) {
        ax.Gb.l.f(str, "<this>");
        return p(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long p(java.lang.String r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "<this>"
            ax.Gb.l.f(r0, r2)
            ax.Ob.b.a(r1)
            int r2 = r0.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = ax.Gb.l.h(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L38
            r6 = 1
            if (r2 != r6) goto L2a
            return r3
        L2a:
            r9 = 43
            if (r5 == r9) goto L37
            r4 = 45
            if (r5 == r4) goto L33
            return r3
        L33:
            r7 = -9223372036854775808
            r4 = 1
            goto L39
        L37:
            r4 = 1
        L38:
            r6 = 0
        L39:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L41:
            if (r4 >= r2) goto L73
            char r5 = r0.charAt(r4)
            int r5 = ax.Ob.b.b(r5, r1)
            if (r5 >= 0) goto L4e
            return r3
        L4e:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L62
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L5e
            return r3
        L5e:
            r15 = r3
            r16 = r4
            goto L63
        L62:
            return r3
        L63:
            long r3 = (long) r1
            long r11 = r11 * r3
            long r3 = (long) r5
            long r17 = r7 + r3
            int r5 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r5 >= 0) goto L6e
            return r15
        L6e:
            long r11 = r11 - r3
            int r4 = r16 + 1
            r3 = r15
            goto L41
        L73:
            if (r6 == 0) goto L7a
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            return r0
        L7a:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Ob.r.p(java.lang.String, int):java.lang.Long");
    }
}

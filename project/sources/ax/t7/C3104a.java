package ax.t7;

import java.math.RoundingMode;

/* renamed from: ax.t7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3104a {
    private static final double a = Math.log(2.0d);
    static final double[] b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: ax.t7.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0459a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d, double d2, double d3) {
        e.d("tolerance", d3);
        if (Math.copySign(d - d2, 1.0d) <= d3 || d == d2) {
            return true;
        }
        return Double.isNaN(d) && Double.isNaN(d2);
    }

    public static boolean b(double d) {
        if (b.b(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(b.a(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean c(double d) {
        if (d > 0.0d && b.b(d)) {
            long a2 = b.a(d);
            if ((a2 & (a2 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(double r6, java.math.RoundingMode r8) {
        /*
            r0 = 0
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L10
            boolean r0 = ax.t7.b.b(r6)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.String r1 = "x must be positive and finite"
            ax.q7.n.e(r0, r1)
            int r0 = java.lang.Math.getExponent(r6)
            boolean r1 = ax.t7.b.c(r6)
            if (r1 != 0) goto L2b
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r6 = r6 * r0
            int r6 = d(r6, r8)
            int r6 = r6 + (-52)
            return r6
        L2b:
            int[] r1 = ax.t7.C3104a.C0459a.a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            switch(r8) {
                case 1: goto L63;
                case 2: goto L6a;
                case 3: goto L5c;
                case 4: goto L54;
                case 5: goto L4a;
                case 6: goto L3c;
                case 7: goto L3c;
                case 8: goto L3c;
                default: goto L36;
            }
        L36:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L3c:
            double r6 = ax.t7.b.d(r6)
            double r6 = r6 * r6
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L6a
            r2 = 1
            goto L6a
        L4a:
            if (r0 < 0) goto L4d
            r2 = 1
        L4d:
            boolean r6 = c(r6)
        L51:
            r6 = r6 ^ r3
            r2 = r2 & r6
            goto L6a
        L54:
            if (r0 >= 0) goto L57
            r2 = 1
        L57:
            boolean r6 = c(r6)
            goto L51
        L5c:
            boolean r6 = c(r6)
            r2 = r6 ^ 1
            goto L6a
        L63:
            boolean r6 = c(r6)
            ax.t7.e.g(r6)
        L6a:
            if (r2 == 0) goto L6d
            int r0 = r0 + r3
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.t7.C3104a.d(double, java.math.RoundingMode):int");
    }

    static double e(double d, RoundingMode roundingMode) {
        if (!b.b(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C0459a.a[roundingMode.ordinal()]) {
            case 1:
                e.g(b(d));
                return d;
            case 2:
                return (d >= 0.0d || b(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= 0.0d || b(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (b(d)) {
                    return d;
                }
                return ((long) d) + (d > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d);
            case 7:
                double rint = Math.rint(d);
                return Math.abs(d - rint) == 0.5d ? d + Math.copySign(0.5d, d) : rint;
            case 8:
                double rint2 = Math.rint(d);
                return Math.abs(d - rint2) == 0.5d ? d : rint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d, RoundingMode roundingMode) {
        double e = e(d, roundingMode);
        e.a(((-9.223372036854776E18d) - e < 1.0d) & (e < 9.223372036854776E18d), d, roundingMode);
        return (long) e;
    }
}

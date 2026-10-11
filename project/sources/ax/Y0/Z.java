package ax.Y0;

import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class Z {
    public static final Z c;
    public static final Z d;
    public static final Z e;
    public static final Z f;
    public static final Z g;
    public final long a;
    public final long b;

    static {
        Z z = new Z(0L, 0L);
        c = z;
        d = new Z(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new Z(Long.MAX_VALUE, 0L);
        f = new Z(0L, Long.MAX_VALUE);
        g = z;
    }

    public Z(long j, long j2) {
        C0968a.a(j >= 0);
        C0968a.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.b
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = ax.S0.d0.A1(r0, r2, r4)
            long r2 = r8.b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = ax.S0.d0.c(r0, r2, r4)
            r4 = 0
            r5 = 1
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L2d
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 > 0) goto L2d
            r6 = 1
            goto L2e
        L2d:
            r6 = 0
        L2e:
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 > 0) goto L37
            int r7 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r7 > 0) goto L37
            r4 = 1
        L37:
            if (r6 == 0) goto L4c
            if (r4 == 0) goto L4c
            long r9 = r11 - r0
            long r9 = java.lang.Math.abs(r9)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L51
            goto L4e
        L4c:
            if (r6 == 0) goto L4f
        L4e:
            return r11
        L4f:
            if (r4 == 0) goto L52
        L51:
            return r13
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Y0.Z.a(long, long, long):long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            Z z = (Z) obj;
            if (this.a == z.a && this.b == z.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}

package ax.a1;

import ax.S0.C0968a;
import ax.a1.C1288f0;
import ax.q1.C2860u;
import ax.u7.C3218f;

/* loaded from: classes.dex */
public class r0 implements C1288f0.e {
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    public final int g;
    public final int h;

    public static class a {
        private int a = 250000;
        private int b = 750000;
        private int c = 4;
        private int d = 250000;
        private int e = 50000000;
        private int f = 2;
        private int g = 4;

        public r0 h() {
            return new r0(this);
        }
    }

    protected r0(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
    }

    protected static int b(int i, int i2, int i3) {
        return C3218f.e(((i * i2) * i3) / 1000000);
    }

    private static int d(int i) {
        int b = C2860u.b(i);
        C0968a.g(b != -2147483647);
        return b;
    }

    @Override // ax.a1.C1288f0.e
    public int a(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (c(i, i2, i3, i4, i5, i6) * d)) + i4) - 1) / i4) * i4;
    }

    protected int c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return g(i, i5, i4);
        }
        if (i3 == 1) {
            return e(i2);
        }
        if (i3 == 2) {
            return f(i2, i6);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i) {
        return C3218f.e((this.f * d(i)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lc
            int r1 = r3.g
        L9:
            int r0 = r0 * r1
            goto L11
        Lc:
            if (r4 != r2) goto L11
            int r1 = r3.h
            goto L9
        L11:
            r1 = -1
            if (r5 == r1) goto L1b
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            int r4 = ax.t7.c.b(r5, r2, r4)
            goto L1f
        L1b:
            int r4 = d(r4)
        L1f:
            long r0 = (long) r0
            long r4 = (long) r4
            long r0 = r0 * r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r4
            int r4 = ax.u7.C3218f.e(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a1.r0.f(int, int):int");
    }

    protected int g(int i, int i2, int i3) {
        return ax.S0.d0.p(i * this.d, b(this.b, i2, i3), b(this.c, i2, i3));
    }
}

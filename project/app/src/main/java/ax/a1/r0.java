/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.S0.d0;
import ax.a1.f0;
import ax.q1.u;
import ax.t7.c;
import ax.u7.f;
import java.math.RoundingMode;

public class r0
implements f0.e {
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    public final int g;
    public final int h;

    protected r0(a a8) {
        this.b = a8.a;
        this.c = a8.b;
        this.d = a8.c;
        this.e = a8.d;
        this.f = a8.e;
        this.g = a8.f;
        this.h = a8.g;
    }

    protected static int b(int n8, int n9, int n10) {
        return ax.u7.f.e((long)n8 * (long)n9 * (long)n10 / 1000000L);
    }

    private static int d(int n8) {
        boolean bl = (n8 = u.b(n8)) != -2147483647;
        ax.S0.a.g(bl);
        return n8;
    }

    @Override
    public int a(int n8, int n9, int n10, int n11, int n12, int n13, double d8) {
        return (Math.max(n8, (int)((double)this.c(n8, n9, n10, n11, n12, n13) * d8)) + n11 - 1) / n11 * n11;
    }

    protected int c(int n8, int n9, int n10, int n11, int n12, int n13) {
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 == 2) {
                    return this.f(n9, n13);
                }
                throw new IllegalArgumentException();
            }
            return this.e(n9);
        }
        return this.g(n8, n12, n11);
    }

    protected int e(int n8) {
        n8 = r0.d(n8);
        return ax.u7.f.e((long)this.f * (long)n8 / 1000000L);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int f(int n8, int n9) {
        int n10;
        block6: {
            int n11;
            block5: {
                block4: {
                    n11 = this.e;
                    if (n8 != 5) break block4;
                    n10 = this.g;
                    break block5;
                }
                n10 = n11;
                if (n8 != 8) break block6;
                n10 = this.h;
            }
            n10 = n11 * n10;
        }
        if (n9 != -1) {
            n8 = ax.t7.c.b(n9, 8, RoundingMode.CEILING);
            return ax.u7.f.e((long)n10 * (long)n8 / 1000000L);
        }
        n8 = r0.d(n8);
        return ax.u7.f.e((long)n10 * (long)n8 / 1000000L);
    }

    protected int g(int n8, int n9, int n10) {
        return d0.p(n8 * this.d, r0.b(this.b, n9, n10), r0.b(this.c, n9, n10));
    }

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
}


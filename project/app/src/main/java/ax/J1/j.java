/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.J1.g;
import ax.J1.i;
import ax.S0.a;
import ax.S0.d0;
import ax.q1.J;
import ax.q1.N;
import ax.q1.O;

final class j
implements g {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    private j(long l8, int n8, long l9, int n9, long l10, long[] lArray) {
        this.a = l8;
        this.b = n8;
        this.c = l9;
        this.d = n9;
        this.e = l10;
        this.g = lArray;
        l9 = -1L;
        l8 = l10 == -1L ? l9 : (l8 += l10);
        this.f = l8;
    }

    public static j a(i i8, long l8) {
        long l9 = i8.a();
        if (l9 == -9223372036854775807L) {
            return null;
        }
        J.a a8 = i8.a;
        return new j(l8, a8.c, l9, a8.f, i8.c, i8.f);
    }

    private long b(int n8) {
        return this.c * (long)n8 / 100L;
    }

    @Override
    public long g() {
        return this.f;
    }

    @Override
    public long h() {
        return this.a + (long)this.b;
    }

    @Override
    public boolean i() {
        return this.g != null;
    }

    @Override
    public long j(long l8) {
        if (this.i() && (l8 -= this.a) > (long)this.b) {
            long[] lArray = ax.S0.a.i(this.g);
            double d8 = (double)l8 * 256.0 / (double)this.e;
            int n8 = d0.h(lArray, (long)d8, true, true);
            long l9 = this.b(n8);
            long l10 = lArray[n8];
            int n9 = n8 + 1;
            long l11 = this.b(n9);
            l8 = n8 == 99 ? 256L : lArray[n9];
            d8 = l10 == l8 ? 0.0 : (d8 - (double)l10) / (double)(l8 - l10);
            return l9 + Math.round(d8 * (double)(l11 - l9));
        }
        return 0L;
    }

    @Override
    public N.a l(long l8) {
        if (!this.i()) {
            return new N.a(new O(0L, this.a + (long)this.b));
        }
        l8 = d0.q(l8, 0L, this.c);
        double d8 = (double)l8 * 100.0 / (double)this.c;
        double d9 = 0.0;
        if (!(d8 <= 0.0)) {
            if (d8 >= 100.0) {
                d9 = 256.0;
            } else {
                int n8 = (int)d8;
                long[] lArray = ax.S0.a.i(this.g);
                double d10 = lArray[n8];
                d9 = n8 == 99 ? 256.0 : (double)lArray[n8 + 1];
                d9 = d10 + (d8 - (double)n8) * (d9 - d10);
            }
        }
        long l9 = d0.q(Math.round(d9 / 256.0 * (double)this.e), this.b, this.e - 1L);
        return new N.a(new O(l8, this.a + l9));
    }

    @Override
    public int m() {
        return this.d;
    }

    @Override
    public long n() {
        return this.c;
    }
}


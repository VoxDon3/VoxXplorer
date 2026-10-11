/*
 * Decompiled with CFR 0.152.
 */
package ax.Y1;

import ax.S0.d0;
import ax.Y1.c;
import ax.q1.N;
import ax.q1.O;

final class e
implements N {
    private final c a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public e(c c8, int n8, long l8, long l9) {
        this.a = c8;
        this.b = n8;
        this.c = l8;
        this.d = l8 = (l9 - l8) / (long)c8.e;
        this.e = this.a(l8);
    }

    private long a(long l8) {
        return d0.p1(l8 * (long)this.b, 1000000L, this.a.c);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public N.a l(long l8) {
        long l9 = d0.q((long)this.a.c * l8 / ((long)this.b * 1000000L), 0L, this.d - 1L);
        long l10 = this.c;
        long l11 = this.a.e;
        long l12 = this.a(l9);
        O o8 = new O(l12, l10 + l11 * l9);
        if (l12 < l8 && l9 != this.d - 1L) {
            l8 = this.c;
            l11 = this.a.e;
            return new N.a(o8, new O(this.a(++l9), l8 + l11 * l9));
        }
        return new N.a(o8);
    }

    @Override
    public long n() {
        return this.e;
    }
}


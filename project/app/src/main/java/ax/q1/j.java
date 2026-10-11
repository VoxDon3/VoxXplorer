/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.q1.N;
import ax.q1.O;

public class j
implements N {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public j(long l8, long l9, int n8, int n9, boolean bl) {
        this.a = l8;
        this.b = l9;
        int n10 = n9;
        if (n9 == -1) {
            n10 = 1;
        }
        this.c = n10;
        this.e = n8;
        this.g = bl;
        if (l8 == -1L) {
            this.d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        this.d = l8 - l9;
        this.f = j.c(l8, l9, n8);
    }

    private long a(long l8) {
        l8 = l8 * (long)this.e / 8000000L;
        int n8 = this.c;
        long l9 = l8 / (long)n8 * (long)n8;
        long l10 = this.d;
        l8 = l9;
        if (l10 != -1L) {
            l8 = Math.min(l9, l10 - (long)n8);
        }
        l8 = Math.max(l8, 0L);
        return this.b + l8;
    }

    private static long c(long l8, long l9, int n8) {
        return Math.max(0L, l8 - l9) * 8000000L / (long)n8;
    }

    public long b(long l8) {
        return j.c(l8, this.b, this.e);
    }

    @Override
    public boolean i() {
        return this.d != -1L || this.g;
        {
        }
    }

    @Override
    public N.a l(long l8) {
        int n8;
        if (this.d == -1L && !this.g) {
            return new N.a(new O(0L, this.b));
        }
        long l9 = this.a(l8);
        long l10 = this.b(l9);
        O o8 = new O(l10, l9);
        if (this.d != -1L && l10 < l8 && (long)(n8 = this.c) + l9 < this.a) {
            l8 = l9 + (long)n8;
            return new N.a(o8, new O(this.b(l8), l8));
        }
        return new N.a(o8);
    }

    @Override
    public long n() {
        return this.f;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.f;
import ax.L1.g;
import ax.L1.i;
import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;
import ax.q1.s;
import ax.q1.u;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

final class a
implements g {
    private final f a;
    private final long b;
    private final long c;
    private final i d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public a(i i8, long l8, long l9, long l10, long l11, boolean bl) {
        boolean bl2 = l8 >= 0L && l9 > l8;
        ax.S0.a.a(bl2);
        this.d = i8;
        this.b = l8;
        this.c = l9;
        if (l10 != l9 - l8 && !bl) {
            this.e = 0;
        } else {
            this.f = l11;
            this.e = 4;
        }
        this.a = new f();
    }

    private long i(s s8) throws IOException {
        if (this.i == this.j) {
            return -1L;
        }
        long l8 = s8.getPosition();
        if (!this.a.d(s8, this.j)) {
            long l9 = this.i;
            if (l9 != l8) {
                return l9;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(s8, false);
        s8.m();
        long l10 = this.h;
        f f8 = this.a;
        long l11 = f8.c;
        int n8 = f8.h + f8.i;
        if (0L <= (l10 -= l11) && l10 < 72000L) {
            return -1L;
        }
        long l12 = l10 - 0L;
        long l13 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (l13 < 0) {
            this.j = l8;
            this.l = l11;
        } else {
            this.i = s8.getPosition() + (long)n8;
            this.k = this.a.c;
        }
        l8 = this.j;
        l11 = this.i;
        if (l8 - l11 < 100000L) {
            this.j = l11;
            return l11;
        }
        l11 = n8;
        l8 = l13 <= 0 ? 2L : 1L;
        long l14 = s8.getPosition();
        long l15 = this.j;
        long l16 = this.i;
        return d0.q(l14 - l11 * l8 + l10 * (l15 - l16) / (this.l - this.k), l16, l15 - 1L);
    }

    private void k(s s8) throws IOException {
        while (true) {
            this.a.c(s8);
            this.a.a(s8, false);
            f f8 = this.a;
            if (f8.c > this.h) {
                s8.m();
                return;
            }
            s8.n(f8.h + f8.i);
            this.i = s8.getPosition();
            this.k = this.a.c;
        }
    }

    @Override
    public long b(s s8) throws IOException {
        int n8 = this.e;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    long l8 = this.i(s8);
                    if (l8 != -1L) {
                        return l8;
                    }
                    this.e = 3;
                }
                this.k(s8);
                this.e = 4;
                return -(this.k + 2L);
            }
        } else {
            long l9;
            this.g = l9 = s8.getPosition();
            this.e = 1;
            long l10 = this.c - 65307L;
            if (l10 > l9) {
                return l10;
            }
        }
        this.f = this.j(s8);
        this.e = 4;
        return this.g;
    }

    @Override
    public void c(long l8) {
        this.h = d0.q(l8, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    public b h() {
        if (this.f != 0L) {
            return new b(this);
        }
        return null;
    }

    long j(s s8) throws IOException {
        this.a.b();
        if (this.a.c(s8)) {
            this.a.a(s8, false);
            f f8 = this.a;
            s8.n(f8.h + f8.i);
            long l8 = this.a.c;
            while (true) {
                f8 = this.a;
                if ((f8.b & 4) == 4 || !f8.c(s8) || s8.getPosition() >= this.c || !this.a.a(s8, true)) break;
                f8 = this.a;
                if (!u.f(s8, f8.h + f8.i)) break;
                l8 = this.a.c;
            }
            return l8;
        }
        throw new EOFException();
    }

    private final class b
    implements N {
        final a a;

        private b(a a8) {
            this.a = a8;
        }

        @Override
        public boolean i() {
            return true;
        }

        @Override
        public N.a l(long l8) {
            long l9 = this.a.d.c(l8);
            return new N.a(new O(l8, d0.q(this.a.b + BigInteger.valueOf(l9).multiply(BigInteger.valueOf(this.a.c - this.a.b)).divide(BigInteger.valueOf(this.a.f)).longValue() - 30000L, this.a.b, this.a.c - 1L)));
        }

        @Override
        public long n() {
            return this.a.d.b(this.a.f);
        }
    }
}


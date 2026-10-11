/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.a;
import ax.S0.d0;
import ax.S0.v;
import ax.q1.N;
import ax.q1.O;

public final class I
implements N {
    private final v a;
    private final v b;
    private long c;

    public I(long[] lArray, long[] lArray2, long l8) {
        boolean bl = lArray.length == lArray2.length;
        ax.S0.a.a(bl);
        int n8 = lArray2.length;
        if (n8 > 0 && lArray2[0] > 0L) {
            v v8;
            v v9;
            this.a = v9 = new v(++n8);
            this.b = v8 = new v(n8);
            v9.a(0L);
            v8.a(0L);
        } else {
            this.a = new v(n8);
            this.b = new v(n8);
        }
        this.a.b(lArray);
        this.b.b(lArray2);
        this.c = l8;
    }

    public void a(long l8, long l9) {
        if (this.b.d() == 0 && l8 > 0L) {
            this.a.a(0L);
            this.b.a(0L);
        }
        this.a.a(l9);
        this.b.a(l8);
    }

    public boolean b(long l8, long l9) {
        if (this.b.d() == 0) {
            return false;
        }
        v v8 = this.b;
        return l8 - v8.c(v8.d() - 1) < l9;
    }

    public void c(long l8) {
        this.c = l8;
    }

    @Override
    public boolean i() {
        return this.b.d() > 0;
    }

    public long j(long l8) {
        if (this.b.d() == 0) {
            return -9223372036854775807L;
        }
        int n8 = d0.e(this.a, l8, true, true);
        return this.b.c(n8);
    }

    @Override
    public N.a l(long l8) {
        if (this.b.d() == 0) {
            return new N.a(O.c);
        }
        int n8 = d0.e(this.b, l8, true, true);
        O o8 = new O(this.b.c(n8), this.a.c(n8));
        if (o8.a != l8 && n8 != this.b.d() - 1) {
            v v8 = this.b;
            return new N.a(o8, new O(v8.c(++n8), this.a.c(n8)));
        }
        return new N.a(o8);
    }

    @Override
    public long n() {
        return this.c;
    }
}


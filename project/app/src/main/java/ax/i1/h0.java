/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import ax.P0.N;
import ax.P0.y;
import ax.S0.a;

public final class h0
extends N {
    private static final Object r = new Object();
    private static final y s = new y.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Object o;
    private final y p;
    private final y.g q;

    public h0(long l8, long l9, long l10, long l11, long l12, long l13, long l14, boolean bl, boolean bl2, boolean bl3, Object object, y y8, y.g g8) {
        this.e = l8;
        this.f = l9;
        this.g = l10;
        this.h = l11;
        this.i = l12;
        this.j = l13;
        this.k = l14;
        this.l = bl;
        this.m = bl2;
        this.n = bl3;
        this.o = object;
        this.p = ax.S0.a.e(y8);
        this.q = g8;
    }

    public h0(long l8, long l9, long l10, long l11, boolean bl, boolean bl2, boolean bl3, Object object, y y8) {
        y.g g8 = bl3 ? y8.d : null;
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, l8, l9, l10, l11, bl, bl2, false, object, y8, g8);
    }

    public h0(long l8, boolean bl, boolean bl2, boolean bl3, Object object, y y8) {
        this(l8, l8, 0L, 0L, bl, bl2, bl3, object, y8);
    }

    @Override
    public int b(Object object) {
        if (r.equals(object)) {
            return 0;
        }
        return -1;
    }

    @Override
    public N.b g(int n8, N.b b8, boolean bl) {
        ax.S0.a.c(n8, 0, 1);
        Object object = bl ? r : null;
        return b8.t(null, object, 0, this.h, -this.j);
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public Object m(int n8) {
        ax.S0.a.c(n8, 0, 1);
        return r;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public N.c o(int n8, N.c c8, long l8) {
        long l9;
        boolean bl;
        block2: {
            block3: {
                ax.S0.a.c(n8, 0, 1);
                long l10 = this.k;
                bl = this.m;
                l9 = l10;
                if (!bl) break block2;
                l9 = l10;
                if (this.n) break block2;
                l9 = l10;
                if (l8 == 0L) break block2;
                long l11 = this.i;
                if (l11 == -9223372036854775807L) break block3;
                l9 = l8 = l10 + l8;
                if (l8 <= l11) break block2;
            }
            l8 = -9223372036854775807L;
            return c8.g(N.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l8, this.i, 0, 0, this.j);
        }
        l8 = l9;
        return c8.g(N.c.q, this.p, this.o, this.e, this.f, this.g, this.l, bl, this.q, l8, this.i, 0, 0, this.j);
    }

    @Override
    public int p() {
        return 1;
    }
}


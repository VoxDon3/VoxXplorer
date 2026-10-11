/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.J1.g;
import ax.q1.J;
import ax.q1.j;

final class a
extends j
implements g {
    private final long h;
    private final int i;
    private final int j;
    private final boolean k;
    private final long l;

    public a(long l8, long l9, int n8, int n9, boolean bl) {
        super(l8, l9, n8, n9, bl);
        this.h = l9;
        this.i = n8;
        this.j = n9;
        this.k = bl;
        if (l8 == -1L) {
            l8 = -1L;
        }
        this.l = l8;
    }

    public a(long l8, long l9, J.a a8, boolean bl) {
        this(l8, l9, a8.f, a8.c, bl);
    }

    public a d(long l8) {
        return new a(l8, this.h, this.i, this.j, this.k);
    }

    @Override
    public long g() {
        return this.l;
    }

    @Override
    public long h() {
        return this.h;
    }

    @Override
    public long j(long l8) {
        return this.b(l8);
    }

    @Override
    public int m() {
        return this.i;
    }
}


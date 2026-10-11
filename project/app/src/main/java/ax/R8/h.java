/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.m;
import ax.Q8.p;
import ax.h9.b;
import ax.o9.c;

public class h
extends p {
    private final long f;
    private final i g;
    private final c h;
    private final boolean i;
    private long j;

    public h(g g8, long l8, long l9, long l10, i i8, c c8, boolean bl, int n8) {
        super(57, g8, m.n0, l8, l9, Math.max(c8.a(), n8));
        this.f = l10;
        this.g = i8;
        this.h = c8;
        this.i = bl;
        this.j = n8;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.X();
        b8.u(this.f);
        this.g.b(b8);
        int n8 = this.h.a();
        long l8 = 0L;
        if (n8 > 0) {
            b8.u(120);
            b8.u(n8);
        } else {
            b8.u(0L);
            b8.u(0L);
        }
        b8.u(0L);
        b8.u(0L);
        b8.u(0L);
        b8.u(this.n());
        if (this.i) {
            l8 = 1L;
        }
        b8.u(l8);
        b8.Y();
        while (this.h.a() > 0) {
            this.h.g(b8);
        }
    }

    public long o() {
        return this.f;
    }
}


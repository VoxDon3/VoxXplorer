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

public class z
extends p {
    private final i f;
    private final c g;

    public z(g g8, i i8, long l8, long l9, c c8, int n8) {
        super(49, g8, m.l0, l8, l9, Math.min(n8, c8.a()));
        this.f = i8;
        this.g = c8;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.s(112);
        b8.u(this.n());
        b8.w(this.g.d());
        this.f.b(b8);
        b8.u(0L);
        b8.u(Math.max(0, this.g.a() - this.n()));
        b8.s(0);
        b8.s(0);
        b8.u(0L);
        this.g.j(b8, this.d());
    }
}


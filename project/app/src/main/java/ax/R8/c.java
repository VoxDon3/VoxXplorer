/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.i;
import ax.Q8.m;
import ax.Q8.q;
import ax.Z8.a;
import ax.h9.b;

public class c
extends q {
    private i e;
    private ax.J8.b f;
    private ax.J8.b g;
    private ax.J8.b h;
    private ax.J8.b i;
    private long j;
    private long k;
    private byte[] l;

    public c() {
    }

    public c(g g8, long l8, long l9, i i8) {
        super(24, g8, m.i0, l8, l9);
        this.e = i8;
    }

    @Override
    protected void j(b b8) throws a.b {
        b8.J();
        b8.J();
        b8.U(4);
        this.f = ax.J8.c.c(b8);
        this.g = ax.J8.c.c(b8);
        this.h = ax.J8.c.c(b8);
        this.i = ax.J8.c.c(b8);
        this.j = b8.Q();
        this.k = b8.Q();
        this.l = b8.G(4);
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.s(1);
        b8.Y();
        this.e.b(b8);
    }
}


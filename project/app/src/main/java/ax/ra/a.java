/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.oa.b;
import ax.oa.d;
import ax.oa.e;
import java.io.IOException;
import java.util.EnumSet;

public final class a
extends ax.oa.a {
    private final int i;
    private final int j;
    private final b k;
    private final b l;

    public a(int n8, int n9, b b8, b b9) {
        this.p(d.n0);
        this.q(EnumSet.of(e.c0, e.d0));
        this.l((short)72);
        this.i = n8;
        this.j = n9;
        this.k = b8;
        this.l = b9;
    }

    @Override
    public void a(ax.pa.d d8) throws IOException {
        super.a(d8);
        d8.e(this.i);
        d8.e(this.j);
        d8.c(0);
        d8.b(1);
        d8.b(0);
        d8.e(0);
        d8.e(0);
        d8.b(1);
        d8.b(0);
        d8.a(this.k.p());
        d8.e(this.k.h());
        d8.e(this.k.j());
        d8.a(this.l.p());
        d8.e(this.l.h());
        d8.e(this.l.j());
    }
}


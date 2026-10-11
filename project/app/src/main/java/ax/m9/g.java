/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.r;
import ax.Q8.t;
import ax.Xd.d;
import ax.Xd.f;
import ax.c9.e;
import ax.l9.l;
import ax.m9.i;

public class g
extends i {
    private static final d c = f.k(g.class);
    private l b;

    public g(l l8) {
        this.b = l8;
    }

    @Override
    protected void e(r r8) throws e {
        this.b.b(((t)r8.b()).f());
        c.u("Server granted us {} credits for {}, now available: {} credits", ((t)r8.b()).f(), r8, this.b.a());
        this.a.a(r8);
    }
}


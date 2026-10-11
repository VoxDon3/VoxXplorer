/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.m;
import ax.Q8.q;
import ax.h9.b;
import ax.k9.e;

public class w
extends q {
    private final g e;
    private boolean f;
    private e g;

    public w(g g8, e e8, long l8) {
        super(9, g8, m.f0, l8, 0L);
        this.e = g8;
        this.g = e8;
    }

    private void n(b b8) {
        if (this.e == ax.Q8.g.i0 && this.f) {
            b8.s(1);
            return;
        }
        b8.X();
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        this.n(b8);
        b8.s(72);
        String string = this.g.toString();
        b8.a0(string);
        b8.Z(string);
    }
}


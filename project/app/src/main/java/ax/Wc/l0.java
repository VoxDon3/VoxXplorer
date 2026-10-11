/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.D;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.q;
import ax.Wc.v;
import ax.Wc.x0;

public class l0
extends k {
    public l0(v v8, q q8, A a8, int n8, A a9) {
        super(v8, q8, a8, n8, a9);
    }

    public l0(x0 x02) {
        super(x02);
    }

    @Override
    A A() {
        return this;
    }

    @Override
    A B() {
        return this;
    }

    @Override
    D C() {
        int n8;
        h h8 = new h(4);
        A a8 = this.q;
        if (a8 != null) {
            h8.a(a8);
        }
        if ((a8 = this.c0) != null) {
            h8.a(a8);
        }
        if ((a8 = this.d0) != null) {
            h8.a(a8.A());
        }
        boolean bl = (n8 = this.e0) == 0;
        h8.a(new A0(bl, n8, this.f0));
        return new x0(h8);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.K0;
import ax.Wc.M0;
import ax.Wc.Q0;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.q;
import ax.Wc.v;

public class J0
extends k {
    public J0(M0 m02) {
        super(m02);
    }

    public J0(h h8) {
        this(K0.a(h8));
    }

    public J0(v v8, q q8, A a8, int n8, A a9) {
        super(v8, q8, a8, n8, a9);
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
            h8.a(a8.B());
        }
        boolean bl = (n8 = this.e0) == 0;
        h8.a(new Q0(bl, n8, this.f0));
        return new M0(h8);
    }
}


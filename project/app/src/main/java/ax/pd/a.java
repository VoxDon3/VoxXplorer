/*
 * Decompiled with CFR 0.152.
 */
package ax.pd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.v;
import ax.Wc.x0;

public class a
extends t {
    private g c0;
    private v q;

    private a(D d8) {
        this.q = (v)d8.I(0);
        this.c0 = d8.I(1);
    }

    public a(v v8, g g8) {
        this.q = v8;
        this.c0 = g8;
    }

    public static a r(Object object) {
        if (object instanceof a) {
            return (a)object;
        }
        if (object != null) {
            return new a(D.G(object));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override
    public A g() {
        h h8 = new h(2);
        h8.a(this.q);
        h8.a(this.c0);
        return new x0(h8);
    }

    public v s() {
        return this.q;
    }

    public g t() {
        return this.c0;
    }
}


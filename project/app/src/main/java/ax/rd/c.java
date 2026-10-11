/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.t;
import ax.rd.a;
import ax.rd.m;

public class c
extends t {
    m c0;
    a d0;
    ax.Wc.c e0;
    D q;

    private c(D d8) {
        this.q = d8;
        if (d8.size() == 3) {
            this.c0 = m.s(d8.I(0));
            this.d0 = a.t(d8.I(1));
            this.e0 = ax.Wc.c.I(d8.I(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static c r(Object object) {
        if (object instanceof c) {
            return (c)object;
        }
        if (object != null) {
            return new c(D.G(object));
        }
        return null;
    }

    @Override
    public A g() {
        return this.q;
    }

    public m s() {
        return this.c0;
    }
}


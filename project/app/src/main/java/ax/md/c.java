/*
 * Decompiled with CFR 0.152.
 */
package ax.md;

import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.h;
import ax.Wc.q;
import ax.Wc.r0;
import ax.Wc.t;
import ax.Wc.x0;
import ax.md.a;
import java.math.BigInteger;

public class c
extends t {
    public static final ax.rd.a f0;
    public static final ax.rd.a g0;
    public static final q h0;
    public static final q i0;
    private ax.rd.a c0;
    private q d0;
    private q e0;
    private ax.rd.a q;

    static {
        ax.rd.a a8;
        f0 = a8 = new ax.rd.a(ax.ld.a.i, r0.c0);
        g0 = new ax.rd.a(a.i, a8);
        h0 = new q(20L);
        i0 = new q(1L);
    }

    public c() {
        this.q = f0;
        this.c0 = g0;
        this.d0 = h0;
        this.e0 = i0;
    }

    private c(D d8) {
        this.q = f0;
        this.c0 = g0;
        this.d0 = h0;
        this.e0 = i0;
        for (int i8 = 0; i8 != d8.size(); ++i8) {
            J j8 = (J)d8.I(i8);
            int n8 = j8.M();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 == 3) {
                            this.e0 = ax.Wc.q.D(j8, true);
                            continue;
                        }
                        throw new IllegalArgumentException("unknown tag");
                    }
                    this.d0 = ax.Wc.q.D(j8, true);
                    continue;
                }
                this.c0 = ax.rd.a.s(j8, true);
                continue;
            }
            this.q = ax.rd.a.s(j8, true);
        }
    }

    public c(ax.rd.a a8, ax.rd.a a9, q q8, q q9) {
        this.q = a8;
        this.c0 = a9;
        this.d0 = q8;
        this.e0 = q9;
    }

    public static c s(Object object) {
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
        h h8 = new h(4);
        if (!this.q.equals(f0)) {
            h8.a(new A0(true, 0, this.q));
        }
        if (!this.c0.equals(g0)) {
            h8.a(new A0(true, 1, this.c0));
        }
        if (!this.d0.y(h0)) {
            h8.a(new A0(true, 2, this.d0));
        }
        if (!this.e0.y(i0)) {
            h8.a(new A0(true, 3, this.e0));
        }
        return new x0(h8);
    }

    public ax.rd.a r() {
        return this.q;
    }

    public ax.rd.a t() {
        return this.c0;
    }

    public BigInteger u() {
        return this.d0.G();
    }
}


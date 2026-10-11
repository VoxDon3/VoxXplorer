/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.t0;
import ax.Wc.v;
import ax.Wc.w;
import ax.Wc.x0;

public class e
extends t {
    public static final v A0;
    public static final v B0;
    public static final v C0;
    public static final v D0;
    public static final v E0;
    public static final v F0;
    public static final v G0;
    public static final v H0;
    public static final v I0;
    public static final v J0;
    public static final v e0;
    public static final v f0;
    public static final v g0;
    public static final v h0;
    public static final v i0;
    public static final v j0;
    public static final v k0;
    public static final v l0;
    public static final v m0;
    public static final v n0;
    public static final v o0;
    public static final v p0;
    public static final v q0;
    public static final v r0;
    public static final v s0;
    public static final v t0;
    public static final v u0;
    public static final v v0;
    public static final v w0;
    public static final v x0;
    public static final v y0;
    public static final v z0;
    private boolean c0;
    private w d0;
    private v q;

    static {
        e0 = new v("2.5.29.9").K();
        f0 = new v("2.5.29.14").K();
        g0 = new v("2.5.29.15").K();
        h0 = new v("2.5.29.16").K();
        i0 = new v("2.5.29.17").K();
        j0 = new v("2.5.29.18").K();
        k0 = new v("2.5.29.19").K();
        l0 = new v("2.5.29.20").K();
        m0 = new v("2.5.29.21").K();
        n0 = new v("2.5.29.23").K();
        o0 = new v("2.5.29.24").K();
        p0 = new v("2.5.29.27").K();
        q0 = new v("2.5.29.28").K();
        r0 = new v("2.5.29.29").K();
        s0 = new v("2.5.29.30").K();
        t0 = new v("2.5.29.31").K();
        u0 = new v("2.5.29.32").K();
        v0 = new v("2.5.29.33").K();
        w0 = new v("2.5.29.35").K();
        x0 = new v("2.5.29.36").K();
        y0 = new v("2.5.29.37").K();
        z0 = new v("2.5.29.46").K();
        A0 = new v("2.5.29.54").K();
        B0 = new v("1.3.6.1.5.5.7.1.1").K();
        C0 = new v("1.3.6.1.5.5.7.1.11").K();
        D0 = new v("1.3.6.1.5.5.7.1.12").K();
        E0 = new v("1.3.6.1.5.5.7.1.2").K();
        F0 = new v("1.3.6.1.5.5.7.1.3").K();
        G0 = new v("1.3.6.1.5.5.7.1.4").K();
        H0 = new v("2.5.29.56").K();
        I0 = new v("2.5.29.55").K();
        J0 = new v("2.5.29.60").K();
    }

    /*
     * Enabled aggressive block sorting
     */
    private e(D g8) {
        if (((D)g8).size() == 2) {
            this.q = v.J(((D)g8).I(0));
            this.c0 = false;
            g8 = ((D)g8).I(1);
        } else {
            if (((D)g8).size() != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Bad sequence size: ");
                stringBuilder.append(((D)g8).size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.q = v.J(((D)g8).I(0));
            this.c0 = ax.Wc.e.D(((D)g8).I(1)).G();
            g8 = ((D)g8).I(2);
        }
        this.d0 = w.E(g8);
    }

    public e(v v8, boolean bl, w w8) {
        this.q = v8;
        this.c0 = bl;
        this.d0 = w8;
    }

    public e(v v8, boolean bl, byte[] byArray) {
        this(v8, bl, new t0(byArray));
    }

    public static e t(Object object) {
        if (object instanceof e) {
            return (e)object;
        }
        if (object != null) {
            return new e(D.G(object));
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        return ((e)(object = (e)object)).r().y(this.r()) && ((e)object).s().y(this.s()) && ((e)object).u() == this.u();
    }

    @Override
    public A g() {
        h h8 = new h(3);
        h8.a(this.q);
        if (this.c0) {
            h8.a(ax.Wc.e.E(true));
        }
        h8.a(this.d0);
        return new x0(h8);
    }

    @Override
    public int hashCode() {
        if (this.u()) {
            return this.s().hashCode() ^ this.r().hashCode();
        }
        return ~(this.s().hashCode() ^ this.r().hashCode());
    }

    public v r() {
        return this.q;
    }

    public w s() {
        return this.d0;
    }

    public boolean u() {
        return this.c0;
    }
}


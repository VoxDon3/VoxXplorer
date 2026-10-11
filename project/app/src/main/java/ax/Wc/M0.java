/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.E;
import ax.Wc.H0;
import ax.Wc.J0;
import ax.Wc.L0;
import ax.Wc.O0;
import ax.Wc.V;
import ax.Wc.Y;
import ax.Wc.c;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.t0;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public class M0
extends D {
    private int d0 = -1;

    public M0() {
    }

    public M0(g g8) {
        super(g8);
    }

    public M0(h h8) {
        super(h8);
    }

    M0(g[] gArray, boolean bl) {
        super(gArray, bl);
    }

    private int Q() throws IOException {
        if (this.d0 < 0) {
            int n8 = this.q.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += this.q[i8].g().B().w(true);
            }
            this.d0 = n9;
        }
        return this.d0;
    }

    @Override
    A B() {
        return this;
    }

    @Override
    c K() {
        return new H0(V.K(this.C()), false);
    }

    @Override
    k M() {
        return new J0(this);
    }

    @Override
    w N() {
        return new t0(Y.I(this.D()));
    }

    @Override
    E O() {
        return new O0(false, this.P());
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        int n8;
        y8.s(bl, 48);
        L0 l02 = y8.e();
        int n9 = this.q.length;
        int n10 = this.d0;
        int n11 = 0;
        if (n10 < 0 && n9 <= 16) {
            A[] aArray = new A[n9];
            n8 = 0;
            for (n10 = 0; n10 < n9; ++n10) {
                A a8;
                aArray[n10] = a8 = this.q[n10].g().B();
                n8 += a8.w(true);
            }
            this.d0 = n8;
            y8.k(n8);
            for (n8 = n11; n8 < n9; ++n8) {
                ((y)l02).u(aArray[n8], true);
            }
        } else {
            y8.k(this.Q());
            for (n8 = 0; n8 < n9; ++n8) {
                ((y)l02).u(this.q[n8].g(), true);
            }
        }
    }

    @Override
    int w(boolean bl) throws IOException {
        return y.g(bl, this.Q());
    }
}


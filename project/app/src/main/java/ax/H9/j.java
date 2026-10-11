/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.k;
import ax.I9.u;
import ax.Qa.a;
import ax.Qa.c;

public class j
extends k {
    private boolean i = false;
    private boolean j = false;
    private boolean k = true;
    private u l;

    public j(String string) {
        super(string);
    }

    private u H() {
        u u8;
        u u9 = u8 = this.l;
        if (u8 == null) {
            u9 = this.d();
        }
        return u9;
    }

    private void M(boolean bl, c c8) {
        this.f(c8, new a(this, bl){
            final j c0;
            final boolean q;
            {
                this.c0 = j8;
                this.q = bl;
            }

            @Override
            public void run() {
                this.c0.N(this.q);
            }
        });
    }

    private void N(boolean bl) {
        if (bl) {
            this.P();
        }
        double d8 = bl ? 1.0 : 0.0;
        this.o(d8);
    }

    private void P() {
        this.H().w(true);
        this.j = true;
    }

    public void F() {
        if (this.i) {
            this.H().w(false);
        }
    }

    public boolean G(int n8) {
        double[] dArray = this.l();
        boolean bl = this.j;
        this.j = false;
        if (this.k) {
            if (dArray[n8] >= 0.01) {
                this.k = false;
                return true;
            }
        } else if (dArray[n8] < 0.01) {
            this.k = true;
        }
        return bl;
    }

    public boolean I() {
        return this.k;
    }

    public void J(c c8) {
        this.M(false, c8);
    }

    public void K(c c8) {
        this.M(true, c8);
    }

    public void L(boolean bl) {
        this.i = bl;
    }

    public void O(u u8) {
        this.l = u8;
        this.L(true);
        this.l.w(false);
    }
}


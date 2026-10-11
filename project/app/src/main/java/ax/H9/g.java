/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.c;
import ax.H9.m;

public class g
extends m {
    c[] c;

    public g(int n8, String string, double d8) {
        super(string);
        this.n(n8, d8);
    }

    public void i() {
        this.j(0);
    }

    public void j(int n8) {
        this.c[n8].h();
    }

    public double k(int n8) {
        return this.c[n8].n();
    }

    public double[] l() {
        return this.c[0].o();
    }

    public double[] m(int n8) {
        return this.c[n8].o();
    }

    protected void n(int n8, double d8) {
        this.c = new c[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            this.c[i8] = new c(this, d8);
        }
    }

    public void o(double d8) {
        this.p(0, d8);
    }

    protected void p(int n8, double d8) {
        this.c[n8].q(d8);
    }
}


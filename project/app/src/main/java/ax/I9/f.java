/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.I9.e;

public abstract class f
extends e {
    protected double A;
    public k y;
    private double z;

    public f() {
        k k8;
        this.y = k8 = new k("Q");
        this.f(k8);
        this.y.C(0.1, 1.0, 10.0);
    }

    @Override
    public void A() {
        double d8 = this.j.l()[0];
        double d9 = this.y.l()[0];
        double d10 = d8;
        if (d8 < 1.0E-5) {
            d10 = 1.0E-5;
        }
        d8 = d9;
        if (d9 < 1.0E-5) {
            d8 = 1.0E-5;
        }
        if (this.C(d10, d8)) {
            this.u = d10;
            this.z = d8;
            this.B(d10 * this.m(), d8);
            this.D();
        }
    }

    public void B(double d8, double d9) {
        double d10 = d8;
        if (d8 >= 0.499) {
            d10 = 0.499;
        }
        this.v = d8 = d10 * (Math.PI * 2);
        this.x = Math.cos(d8);
        this.w = d8 = Math.sin(this.v);
        this.A = d8 / (d9 * 2.0);
    }

    protected boolean C(double d8, double d9) {
        return d8 != this.u || d9 != this.z;
        {
        }
    }

    public abstract void D();
}


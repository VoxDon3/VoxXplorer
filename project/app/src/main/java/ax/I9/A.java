/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.l;
import ax.I9.z;

public class A
extends z {
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private boolean q;
    private boolean r;

    public A() {
        l l8;
        this.j = l8 = new l("Output");
        this.f(l8);
        this.q = true;
        this.m = 1.0;
    }

    private double z() {
        this.h.s();
        if (this.h.v()) {
            this.q = false;
            this.p = this.h.B(this.m());
            return this.m() * this.h.u();
        }
        this.q = true;
        this.r = true;
        this.l = 0.0;
        return 0.0;
    }

    public double A(double d8) {
        return d8;
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.l();
        double[] dArray2 = this.k.l();
        double[] dArray3 = this.j.l();
        while (n8 < n9) {
            double d8;
            if (this.l >= 1.0) {
                while ((d8 = this.l) >= 1.0) {
                    this.n = this.p;
                    this.l = d8 - 1.0;
                    this.m = this.z();
                }
            } else if (n8 == 0 && (this.q || !this.h.w())) {
                this.p = d8 = this.o;
                this.n = d8;
                this.l = 0.0;
                this.m = this.z();
            }
            double d9 = this.p;
            double d10 = this.n;
            d8 = this.l;
            this.o = d9 = (d9 - d10) * d8 + d10;
            dArray3[n8] = d9 * dArray[n8];
            this.l = d8 + this.A(this.m * dArray2[n8]);
            ++n8;
        }
        if (this.r) {
            this.r = false;
            if (this.h.E()) {
                this.h();
            }
        }
    }
}


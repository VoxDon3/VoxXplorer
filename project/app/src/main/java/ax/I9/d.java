/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.H9.m;
import ax.H9.n;
import ax.I9.s;

public class d
extends s {
    public k j;
    public n k;
    private double l;
    private double m = 0.0;
    private double n = 1.0;
    private double o = 1.0E-5;

    public d() {
        m m8;
        this.j = m8 = new k("Time");
        this.f(m8);
        this.h.C(this.o, 1.0, 1.0);
        m8 = new n("Current", 1.0);
        this.k = m8;
        this.f(m8);
    }

    private double z(double d8, double d9, double d10) {
        double d11 = this.n();
        return Math.pow(d10 / d9, 1.0 / (d8 * d11));
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.l();
        double d8 = this.h.l()[0];
        double d9 = this.j.l()[0];
        double d10 = this.k.i();
        d8 = Math.max(this.o, d8);
        d10 = Math.max(this.o, d10);
        if (d9 != this.m) {
            this.n = this.z(d9, d10, d8);
            this.m = d9;
        }
        if (d8 != this.l) {
            this.n = this.z(d9, d10, d8);
            this.l = d8;
        }
        if (d10 < (d8 = this.l)) {
            while (true) {
                d9 = d10;
                if (n8 < n9) {
                    d9 = d10 * this.n;
                    d8 = this.l;
                    d10 = d9;
                    if (d9 > d8) {
                        this.n = 1.0;
                        d10 = d8;
                    }
                    dArray[n8] = d10;
                    ++n8;
                    continue;
                }
                break;
            }
        } else if (d10 > d8) {
            while (true) {
                d9 = d10;
                if (n8 < n9) {
                    d9 = d10 * this.n;
                    d8 = this.l;
                    d10 = d9;
                    if (d9 < d8) {
                        this.n = 1.0;
                        d10 = d8;
                    }
                    dArray[n8] = d10;
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            d9 = d10;
            if (d10 == d8) {
                while (true) {
                    d9 = d10;
                    if (n8 >= n9) break;
                    dArray[n8] = this.l;
                    ++n8;
                }
            }
        }
        this.k.j(d9);
    }
}


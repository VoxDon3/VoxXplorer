/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.H9.m;
import ax.H9.n;
import ax.I9.s;

public class h
extends s {
    public k j;
    public n k;
    private double l;
    private double m;
    private double n;
    private double o = 0.0;
    private double p = 1.0;

    public h() {
        m m8;
        this.j = m8 = new k("Time");
        this.f(m8);
        m8 = new n("Current");
        this.k = m8;
        this.f(m8);
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.i.l();
        double d8 = this.h.l()[0];
        double d9 = this.k.i();
        if (d8 != this.n) {
            this.l = d9;
            this.m = 0.0;
            this.n = d8;
        }
        if (d9 == this.n) {
            while (true) {
                d8 = d9;
                if (n8 < n9) {
                    dArray[n8] = d9;
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            double d10 = this.j.l()[0];
            d8 = d9;
            int n10 = n8;
            if (d10 != this.o) {
                this.p = this.i(d10);
                this.o = d10;
                n10 = n8;
                d8 = d9;
            }
            while (n10 < n9) {
                d8 = this.m;
                if (d8 < 1.0) {
                    d9 = this.l;
                    d10 = this.n;
                    this.m = d8 + this.p;
                    d8 = d9 + (d10 - d9) * d8;
                } else {
                    d8 = this.n;
                }
                dArray[n10] = d8;
                ++n10;
            }
        }
        this.k.j(d8);
    }
}


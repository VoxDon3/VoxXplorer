/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.I9.p;

public abstract class e
extends p {
    public k k;
    protected double l;
    protected double m;
    protected double n;
    protected double o;
    protected double p;
    private double q;
    private double r;
    private double s;
    private double t;
    protected double u;
    protected double v;
    protected double w;
    protected double x;

    public e() {
        k k8;
        this.k = k8 = new k("Amplitude", 1.0);
        this.f(k8);
    }

    protected abstract void A();

    @Override
    public void k(int n8, int n9) {
        this.A();
        this.z(n8, n9);
    }

    public void z(int n8, int n9) {
        double[] dArray = this.h.l();
        double[] dArray2 = this.k.l();
        double[] dArray3 = this.i.l();
        double d8 = this.q;
        double d9 = this.r;
        double d10 = this.s;
        double d11 = this.t;
        double d12 = this.l;
        double d13 = this.m;
        double d14 = this.n;
        double d15 = this.o;
        double d16 = this.p;
        while (n8 < n9) {
            double d17 = dArray[n8];
            d11 = d12 * d17 + d13 * d8 + d9 * d14 - d15 * d10 - d11 * d16;
            dArray3[n8] = dArray2[n8] * d11;
            int n10 = n8 + 1;
            double d18 = dArray[n10];
            d10 = d12 * d18 + d13 * d17 + d8 * d14 - d15 * d11 - d10 * d16;
            dArray3[n10] = dArray2[n10] * d10;
            n8 += 2;
            d9 = d17;
            d8 = d18;
        }
        this.q = d8;
        this.r = d9;
        this.s = d10 + 1.0E-26;
        this.t = d11 - 1.0E-26;
    }
}


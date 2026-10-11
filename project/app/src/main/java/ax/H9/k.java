/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.H9.a;
import ax.H9.b;
import ax.H9.c;
import ax.H9.g;

public class k
extends g
implements a {
    private double d = 0.0;
    private double e = 1.0;
    private double f = 0.0;
    private double[] g;
    private boolean h = false;

    public k(int n8, String string) {
        this(n8, string, 0.0);
    }

    public k(int n8, String string, double d8) {
        super(n8, string, d8);
        this.y(d8);
        this.g = new double[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            this.g[i8] = d8;
        }
    }

    public k(String string) {
        this(1, string, 0.0);
    }

    public k(String string, double d8) {
        this(1, string, d8);
    }

    public void A(double d8) {
        this.d = d8;
    }

    public void B(boolean bl) {
        this.h = bl;
    }

    public void C(double d8, double d9, double d10) {
        this.A(d8);
        this.z(d10);
        this.y(d9);
        this.u(d9);
    }

    public void D(k k8) {
        this.C(k8.s(), k8.q(), k8.r());
    }

    @Override
    public void a(long l8, int n8, int n9) {
        c[] cArray = this.c;
        int n10 = cArray.length;
        for (int i8 = 0; i8 < n10; ++i8) {
            ((b)cArray[i8]).a(l8, n8, n9);
        }
    }

    @Override
    protected void n(int n8, double d8) {
        this.c = new b[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            this.c[i8] = new b(this, d8);
        }
    }

    @Override
    protected void p(int n8, double d8) {
        super.p(n8, d8);
        this.g[n8] = d8;
    }

    public double q() {
        return this.f;
    }

    public double r() {
        return this.e;
    }

    public double s() {
        return this.d;
    }

    public boolean t() {
        return this.h;
    }

    public void u(double d8) {
        this.w(0, d8);
    }

    public void v(double d8, ax.Qa.c c8) {
        this.x(0, d8, c8);
    }

    public void w(int n8, double d8) {
        this.g[n8] = d8;
        this.e(new ax.Qa.a(this, n8, d8){
            final double c0;
            final k d0;
            final int q;
            {
                this.d0 = k8;
                this.q = n8;
                this.c0 = d8;
            }

            @Override
            public void run() {
                this.d0.p(this.q, this.c0);
            }
        });
    }

    public void x(int n8, double d8, ax.Qa.c c8) {
        this.k(n8);
        this.f(c8, new ax.Qa.a(this, n8, d8){
            final double c0;
            final k d0;
            final int q;
            {
                this.d0 = k8;
                this.q = n8;
                this.c0 = d8;
            }

            @Override
            public void run() {
                this.d0.p(this.q, this.c0);
            }
        });
    }

    public void y(double d8) {
        this.f = d8;
    }

    public void z(double d8) {
        this.e = d8;
    }
}


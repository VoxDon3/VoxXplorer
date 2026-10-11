/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.D9.b;
import ax.H9.a;
import ax.H9.g;
import java.util.ArrayList;

public class c
implements a {
    private double[] a = new double[8];
    private ArrayList<c> b = new ArrayList();
    private g c;

    protected c(g g8, double d8) {
        this.c = g8;
        this.q(d8);
    }

    private void d(c c8) {
        if (!this.b.contains(c8)) {
            this.b.add(c8);
        }
    }

    private void e(c object) {
        b b8 = this.c.c();
        if (b8 != (object = ((c)object).c.c()) && b8 != null && object != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
    }

    private void g(c c8) {
        this.d(c8);
        c8.d(this);
    }

    private void i() {
        ArrayList<c> arrayList = this.b;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            c c8 = arrayList.get(i8);
            c8.p(this);
        }
        this.b.clear();
    }

    private void p(c c8) {
        this.b.remove(c8);
    }

    @Override
    public void a(long l8, int n8, int n9) {
        for (int i8 = 0; i8 < this.l(); ++i8) {
            this.k(i8).m().d().u(l8, n8, n9);
        }
    }

    protected void f(c c8) {
        this.e(c8);
        this.c.e(new ax.Qa.a(this, c8){
            final c c0;
            final c q;
            {
                this.c0 = c8;
                this.q = c9;
            }

            @Override
            public void run() {
                this.c0.g(this.q);
            }
        });
    }

    protected void h() {
        this.c.e(new ax.Qa.a(this){
            final c q;
            {
                this.q = c8;
            }

            @Override
            public void run() {
                this.q.i();
            }
        });
    }

    protected void j() {
        double[] dArray = this.a;
        double d8 = dArray[dArray.length - 1];
        for (int i8 = 0; i8 < (dArray = this.a).length - 1; ++i8) {
            dArray[i8] = d8;
        }
    }

    public c k(int n8) {
        return this.b.get(n8);
    }

    public int l() {
        return this.b.size();
    }

    protected g m() {
        return this.c;
    }

    public double n() {
        return this.a[0];
    }

    public double[] o() {
        return this.a;
    }

    protected void q(double d8) {
        double[] dArray;
        for (int i8 = 0; i8 < (dArray = this.a).length; ++i8) {
            dArray[i8] = d8;
        }
    }
}


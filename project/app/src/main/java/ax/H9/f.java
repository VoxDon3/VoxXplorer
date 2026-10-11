/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.B9.b;
import ax.B9.c;

class f
extends c {
    private b f;
    private int g;
    private b h;
    private int i;
    private int j;
    private double k;

    f() {
    }

    @Override
    public double a(int n8) {
        int n9 = n8 / this.f.d();
        if (n9 < this.j) {
            double d8 = (double)n9 * this.k;
            return (1.0 - d8) * this.f.a(this.g + n8) + d8 * this.h.a(n8 + this.i);
        }
        return this.h.a(n8 + this.i);
    }

    @Override
    public double c(int n8, double d8) {
        return this.h.c(n8, d8);
    }

    @Override
    public int d() {
        return this.h.d();
    }

    public void e(b b8, int n8, int n9, b b9, int n10, int n11) {
        b b10 = b8;
        int n12 = n8;
        if (b8 instanceof f) {
            f f8 = (f)b8;
            b10 = b8;
            n12 = n8;
            if (n8 >= f8.j) {
                b10 = f8.h;
                n12 = n8 + f8.i / b10.d();
            }
        }
        b8 = b9;
        n8 = n10;
        if (b9 instanceof f) {
            b9 = (f)b9;
            b8 = ((f)b9).h;
            n8 = n10 + ((f)b9).i / b8.d();
        }
        this.f = b10;
        this.h = b8;
        this.g = n12 * b10.d();
        this.j = n9;
        this.i = n8 * b8.d();
        double d8 = 1.0;
        if (n9 != 0) {
            d8 = 1.0 / (double)n9;
        }
        this.k = d8;
        this.a = n11;
    }
}


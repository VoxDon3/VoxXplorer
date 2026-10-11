/*
 * Decompiled with CFR 0.152.
 */
package ax.G9;

import ax.G9.a;
import ax.J9.c;

public class b
extends a {
    private c e;

    public b(c c8) {
        this.e = c8;
    }

    @Override
    public void a(int n8, int n9) {
        double d8 = n9;
        this.e.l(n8, d8 * 0.007874015748031496);
    }

    @Override
    public void c(int n8, int n9, int n10) {
        double d8 = (double)n10 * 0.007874015748031496;
        if (n9 != 1) {
            if (n9 != 7) {
                if (n9 != 10) {
                    if (n9 != 74) {
                        return;
                    }
                    this.e.m(n8, d8);
                    return;
                }
                this.e.j(n8, d8 * 2.0 - 1.0);
                return;
            }
            this.e.o(n8, d8);
            return;
        }
        this.e.n(n8, d8 * 0.1);
    }

    @Override
    public void f(int n8, int n9, int n10) {
        this.e.e(n8, n9, n10);
    }

    @Override
    public void g(int n8, int n9, int n10) {
        this.e.g(n8, n9, n10);
    }

    @Override
    public void i(int n8, int n9) {
        double d8 = n9 - 8192;
        this.e.k(n8, d8 * 1.220703125E-4);
    }

    @Override
    public void k(int n8, int n9) {
        this.e.h(n8, n9);
    }

    @Override
    public void m(int n8, int n9, int n10) {
        if (n9 != 0) {
            return;
        }
        double d8 = n10 >> 7;
        double d9 = n10 & 0x7F;
        this.e.i(n8, d8 + d9 * 0.01);
    }

    public void n(byte[] byArray, int n8, int n9) {
        this.h(byArray, n8, n9);
    }
}


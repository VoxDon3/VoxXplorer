/*
 * Decompiled with CFR 0.152.
 */
package ax.zd;

import ax.Ad.c;
import ax.vd.d;
import ax.vd.l;

public class a
implements l {
    private byte[] a;
    private byte[] b;
    private int c;
    private ax.vd.a d;
    private ax.Cd.a e;
    private int f;

    public a(ax.vd.a a8, int n8) {
        this(a8, n8, null);
    }

    public a(ax.vd.a a8, int n8, ax.Cd.a a9) {
        if (n8 % 8 == 0) {
            this.d = new c(a8);
            this.e = a9;
            this.f = n8 / 8;
            this.a = new byte[a8.d()];
            this.b = new byte[a8.d()];
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override
    public int a() {
        return this.f;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        if (n9 >= 0) {
            int n10 = this.d.d();
            int n11 = this.c;
            int n12 = n10 - n11;
            int n13 = n8;
            int n14 = n9;
            if (n9 > n12) {
                System.arraycopy(byArray, n8, this.b, n11, n12);
                this.d.h(this.b, 0, this.a, 0);
                this.c = 0;
                n9 -= n12;
                n8 += n12;
                while (true) {
                    n13 = n8;
                    n14 = n9;
                    if (n9 <= n10) break;
                    this.d.h(byArray, n8, this.a, 0);
                    n9 -= n10;
                    n8 += n10;
                }
            }
            System.arraycopy(byArray, n13, this.b, this.c, n14);
            this.c += n14;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    @Override
    public int c(byte[] byArray, int n8) {
        int n9 = this.d.d();
        if (this.e == null) {
            int n10;
            while ((n10 = this.c) < n9) {
                this.b[n10] = 0;
                this.c = n10 + 1;
            }
        } else {
            if (this.c == n9) {
                this.d.h(this.b, 0, this.a, 0);
                this.c = 0;
            }
            this.e.a(this.b, this.c);
        }
        this.d.h(this.b, 0, this.a, 0);
        System.arraycopy(this.a, 0, byArray, n8, this.f);
        this.f();
        return this.f;
    }

    @Override
    public void d(byte by) {
        int n8 = this.c;
        byte[] byArray = this.b;
        if (n8 == byArray.length) {
            this.d.h(byArray, 0, this.a, 0);
            this.c = 0;
        }
        byArray = this.b;
        n8 = this.c;
        this.c = n8 + 1;
        byArray[n8] = by;
    }

    @Override
    public void e(d d8) {
        this.f();
        this.d.e(true, d8);
    }

    public void f() {
        byte[] byArray;
        for (int i8 = 0; i8 < (byArray = this.b).length; ++i8) {
            byArray[i8] = 0;
        }
        this.c = 0;
        this.d.a();
    }
}


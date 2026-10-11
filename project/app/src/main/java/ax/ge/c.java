/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

import ax.ge.d;
import ax.ge.f;
import ax.ge.g;

final class c
extends f {
    private final d l;
    private final int[] m;
    private final g n;
    private final int o;
    private final int p;
    private int q = -1;
    private int r;

    c(int n8, int n9, int n10, int n11, int n12, int n13, ax.be.c c8) {
        super(n8, n9, n10, n11, n12, c8);
        this.l = new d(n8, c8);
        this.p = ++n8;
        this.m = c8.c(n8, false);
        this.r = n8;
        this.n = new g(n11 - 1);
        if (n13 <= 0) {
            n13 = n11 / 4 + 4;
        }
        this.o = n13;
    }

    private int w() {
        int n8 = this.n(4, 4);
        if (n8 != 0) {
            int n9;
            this.r = n9 = this.r + 1;
            if (n9 == Integer.MAX_VALUE) {
                n9 = Integer.MAX_VALUE - this.p;
                this.l.f(n9);
                ax.ge.f.p(this.m, this.p, n9);
                this.r -= n9;
            }
            this.q = n9 = this.q + 1;
            if (n9 == this.p) {
                this.q = 0;
            }
        }
        return n8;
    }

    @Override
    public g j() {
        int[] nArray;
        Object object;
        this.n.c = 0;
        int n8 = this.c;
        int n9 = this.d;
        int n10 = this.w();
        int n11 = n8;
        int n12 = n9;
        if (n10 < n8) {
            if (n10 == 0) {
                return this.n;
            }
            n11 = n8 = n10;
            n12 = n9;
            if (n9 > n10) {
                n12 = n8;
                n11 = n8;
            }
        }
        this.l.a(this.e, this.g);
        int n13 = this.r - this.l.b();
        int n14 = this.r - this.l.c();
        int n15 = this.l.d();
        this.l.h(this.r);
        this.m[this.q] = n15;
        int n16 = this.p;
        if (n13 < n16 && (object = this.e)[(n8 = this.g) - n13] == object[n8]) {
            object = this.n;
            nArray = object.a;
            n9 = 2;
            nArray[0] = 2;
            object.b[0] = n13 - 1;
            object.c = 1;
        } else {
            n9 = 0;
        }
        int n17 = 3;
        n10 = n13;
        n8 = n9;
        if (n13 != n14) {
            n10 = n13;
            n8 = n9;
            if (n14 < n16) {
                object = this.e;
                n16 = this.g;
                n10 = n13;
                n8 = n9;
                if (object[n16 - n14] == object[n16]) {
                    object = this.n;
                    nArray = object.b;
                    n8 = object.c;
                    object.c = n8 + 1;
                    nArray[n8] = n14 - 1;
                    n10 = n14;
                    n8 = 3;
                }
            }
        }
        n9 = n8;
        if (this.n.c > 0) {
            while (n8 < n11 && (object = this.e)[(n9 = this.g) + n8 - n10] == object[n9 + n8]) {
                ++n8;
            }
            object = this.n;
            object.a[object.c - 1] = n8;
            n9 = n8;
            if (n8 >= n12) {
                return object;
            }
        }
        n8 = n9 < 3 ? n17 : n9;
        n10 = this.o;
        n9 = n8;
        n8 = n10;
        while (true) {
            n14 = this.r - n15;
            if (n8 == 0 || n14 >= (n10 = this.p)) break;
            object = this.m;
            n15 = this.q;
            if (n14 <= n15) {
                n10 = 0;
            }
            n17 = object[n15 - n14 + n10];
            object = this.e;
            n15 = this.g;
            n10 = n9;
            if (object[n15 + n9 - n14] == object[n15 + n9]) {
                n10 = n9;
                if (object[n15 - n14] == object[n15]) {
                    n10 = 0;
                    while ((n15 = n10 + 1) < n11) {
                        object = this.e;
                        n13 = this.g;
                        n10 = n15;
                        if (object[n13 + n15 - n14] == object[n13 + n15]) continue;
                    }
                    n10 = n9;
                    if (n15 > n9) {
                        object = this.n;
                        nArray = object.a;
                        n9 = object.c;
                        nArray[n9] = n15;
                        object.b[n9] = n14 - 1;
                        object.c = n9 + 1;
                        if (n15 >= n12) {
                            return object;
                        }
                        n10 = n15;
                    }
                }
            }
            n15 = n17;
            --n8;
            n9 = n10;
        }
        return this.n;
    }

    @Override
    public void r(ax.be.c c8) {
        c8.e(this.m);
        this.l.g(c8);
        super.r(c8);
    }

    @Override
    public void v(int n8) {
        while (n8 > 0) {
            if (this.w() != 0) {
                this.l.a(this.e, this.g);
                this.m[this.q] = this.l.d();
                this.l.h(this.r);
            }
            --n8;
        }
    }
}


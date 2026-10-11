/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.he.c;
import ax.he.f;
import ax.he.g;

final class e
extends c {
    private final f[] B = new f[4096];
    private int C = 0;
    private int D = 0;
    private ax.ge.g E;
    private final int[] F = new int[4];
    private final g G = new g();

    e(ax.ie.e e8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, ax.be.c c8) {
        super(e8, ax.ge.f.g(n11, Math.max(n12, 4096), 4096, n13, 273, n14, n15, c8), n8, n9, n10, n11, n13);
        for (n8 = 0; n8 < 4096; ++n8) {
            this.B[n8] = new f();
        }
    }

    private void D(int n8, int n9, int n10, int n11) {
        int n12;
        Object object;
        int n13;
        int n14;
        int n15;
        block10: {
            int n16;
            int n17;
            block11: {
                n15 = this.n.e(0);
                n14 = this.n.e(this.B[this.C].b[0] + 1);
                n13 = this.B[this.C].c + this.o.d(n15, n14, this.n.e(1), n8, this.B[this.C].a);
                object = this.B;
                n17 = this.C;
                if (n13 < object[n17 + 1].c) {
                    object[n17 + 1].b(n13, n17, -1);
                    n17 = 1;
                } else {
                    n17 = 0;
                }
                n12 = n17;
                if (n14 != n15) break block10;
                object = this.B;
                n16 = this.C;
                if (object[n16 + 1].d == n16) break block11;
                n12 = n17;
                if (object[n16 + 1].e == 0) break block10;
            }
            n9 = this.v(n11, object[n16].a, n9);
            object = this.B;
            n11 = this.C;
            n12 = n17;
            if (n9 <= object[n11 + 1].c) {
                object[n11 + 1].b(n9, n11, 0);
                n12 = 1;
            }
        }
        if (n12 == 0 && n14 != n15 && n10 > 2) {
            n9 = Math.min(this.r, n10 - 1);
            if ((n9 = this.n.i(1, this.B[this.C].b[0], n9)) >= 2) {
                this.G.d(this.B[this.C].a);
                this.G.e();
                n10 = this.a;
                n8 = n13 + this.p(0, n9, this.G, n8 + 1 & n10);
                n9 = this.C + 1 + n9;
                while ((n10 = this.D) < n9) {
                    object = this.B;
                    this.D = ++n10;
                    object[n10].a();
                }
                object = this.B[n9];
                if (n8 < ((f)object).c) {
                    ((f)object).c(n8, this.C, 0);
                }
            }
        }
    }

    private int E(int n8, int n9, int n10, int n11) {
        int n12 = Math.min(n10, this.r);
        int n13 = 2;
        for (int i8 = 0; i8 < 4; ++i8) {
            int n14;
            int n15;
            Object object;
            int n16;
            int n17;
            int n18 = this.n.h(this.B[this.C].b[i8], n12);
            if (n18 < 2) continue;
            while ((n17 = this.D) < (n16 = this.C) + n18) {
                object = this.B;
                this.D = n16 = n17 + 1;
                object[n16].a();
            }
            n17 = this.q(n11, i8, this.B[n16].a, n9);
            for (n16 = n18; n16 >= 2; --n16) {
                n15 = this.q.c(n16, n9) + n17;
                object = this.B;
                n14 = this.C;
                if (n15 >= object[n14 + n16].c) continue;
                object[n14 + n16].b(n15, n14, i8);
            }
            if (i8 == 0) {
                n13 = n18 + 1;
            }
            n16 = Math.min(this.r, n10 - n18 - 1);
            if ((n16 = this.n.i(n18 + 1, this.B[this.C].b[i8], n16)) < 2) continue;
            n15 = this.q.c(n18, n9);
            this.G.d(this.B[this.C].a);
            this.G.f();
            int n19 = this.n.f(n18, 0);
            int n20 = this.n.e(0);
            int n21 = this.n.f(n18, 1);
            object = this.o;
            n14 = n8 + n18;
            n19 = ((c.c)object).d(n19, n20, n21, n14, this.G);
            this.G.e();
            n21 = this.a;
            n17 = n17 + n15 + n19 + this.p(0, n16, this.G, n14 + 1 & n21);
            n16 = this.C + n18 + 1 + n16;
            while ((n15 = this.D) < n16) {
                object = this.B;
                this.D = ++n15;
                ((f)object[n15]).a();
            }
            object = this.B[n16];
            if (n17 >= ((f)object).c) continue;
            ((f)object).d(n17, this.C, i8, n18, 0);
        }
        return n13;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void F(int n8, int n9, int n10, int n11, int n12) {
        int n13;
        int n14;
        Object object = this.E;
        if (((ax.ge.g)object).a[((ax.ge.g)object).c - 1] > n10) {
            ((ax.ge.g)object).c = 0;
            while (true) {
                ax.ge.g g8 = this.E;
                object = g8.a;
                n14 = g8.c;
                if (object[n14] >= n10) break;
                g8.c = n14 + 1;
            }
            g8.c = n14 + 1;
            object[n14] = n10;
        }
        object = this.E;
        if (((ax.ge.g)object).a[((ax.ge.g)object).c - 1] < n12) return;
        while (true) {
            n13 = this.D;
            n14 = this.C;
            object = this.E;
            if (n13 >= ((ax.ge.g)object).a[((ax.ge.g)object).c - 1] + n14) break;
            object = this.B;
            this.D = n14 = n13 + 1;
            object[n14].a();
        }
        n13 = this.u(n11, this.B[n14].a);
        n11 = 0;
        while (n12 > this.E.a[n11]) {
            ++n11;
        }
        while (true) {
            n14 = this.E.b[n11];
            int n15 = this.r(n13, n14, n12, n9);
            object = this.B;
            int n16 = this.C;
            if (n15 < object[n16 + n12].c) {
                object[n16 + n12].b(n15, n16, n14 + 4);
            }
            if (n12 == this.E.a[n11]) {
                n16 = Math.min(this.r, n10 - n12 - 1);
                if ((n16 = this.n.i(n12 + 1, n14, n16)) >= 2) {
                    this.G.d(this.B[this.C].a);
                    this.G.g();
                    int n17 = this.n.f(n12, 0);
                    int n18 = this.n.e(0);
                    int n19 = this.n.f(n12, 1);
                    object = this.o;
                    int n20 = n8 + n12;
                    n19 = ((c.c)object).d(n17, n18, n19, n20, this.G);
                    this.G.e();
                    n18 = this.a;
                    n15 = n15 + n19 + this.p(0, n16, this.G, n20 + 1 & n18);
                    n16 = this.C + n12 + 1 + n16;
                    while ((n20 = this.D) < n16) {
                        object = this.B;
                        this.D = ++n20;
                        ((f)object[n20]).a();
                    }
                    object = this.B[n16];
                    if (n15 < ((f)object).c) {
                        ((f)object).d(n15, this.C, n14 + 4, n12, 0);
                    }
                }
                n11 = n14 = n11 + 1;
                if (n14 == this.E.c) {
                    return;
                }
            }
            ++n12;
        }
    }

    private int G() {
        f[] fArray;
        int n8;
        this.D = n8 = this.C;
        int n9 = this.B[n8].d;
        do {
            fArray = this.B;
            int n10 = this.C;
            f f8 = fArray[n10];
            n8 = n9;
            if (f8.f) {
                f f9 = fArray[n9];
                f9.d = n10;
                f9.e = -1;
                n8 = n9 - 1;
                this.C = n9;
                if (f8.g) {
                    f9 = fArray[n8];
                    f9.d = n9;
                    f9.e = f8.i;
                    this.C = n8;
                    n8 = f8.h;
                }
            }
            f8 = fArray[n8];
            n9 = f8.d;
            f8.d = this.C;
            this.C = n8;
        } while (n8 > 0);
        this.C = n8 = fArray[0].d;
        this.y = fArray[n8].e;
        return n8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void H() {
        var6_1 /* !! */  = this.B;
        var5_2 = var6_1 /* !! */ [this.C];
        var1_3 = var5_2.d;
        if (var5_2.f) {
            --var1_3;
            if (var5_2.g) {
                var5_2.a.d(var6_1 /* !! */ [var5_2.h].a);
                var5_2 = this.B[this.C];
                var2_4 = var5_2.i;
                var5_2 = var5_2.a;
                if (var2_4 < 4) {
                    var5_2.f();
                } else {
                    var5_2.g();
                }
            } else {
                var5_2.a.d(var6_1 /* !! */ [var1_3].a);
            }
            this.B[this.C].a.e();
        } else {
            var5_2.a.d(var6_1 /* !! */ [var1_3].a);
        }
        var2_4 = this.C;
        if (var1_3 == var2_4 - 1) {
            var5_2 = this.B[var2_4];
            var2_4 = var5_2.e;
            var5_2 = var5_2.a;
            if (var2_4 == 0) {
                var5_2.h();
            } else {
                var5_2.e();
            }
            var5_2 = this.B;
            System.arraycopy(var5_2[var1_3].b, 0, var5_2[this.C].b, 0, 4);
            return;
        }
        var5_2 = this.B[var2_4];
        if (var5_2.f && var5_2.g) {
            var1_3 = var5_2.h;
            var2_4 = var5_2.i;
            var5_2 = var5_2.a;
lbl37:
            // 2 sources

            while (true) {
                var5_2.f();
                var3_5 = var2_4;
                var2_4 = var1_3;
                break;
            }
        } else {
            var3_5 = var5_2.e;
            var5_2 = var5_2.a;
            if (var3_5 < 4) {
                var2_4 = var3_5;
                ** continue;
            }
            var5_2.g();
            var2_4 = var1_3;
        }
        var1_3 = 1;
        var5_2 = this.B;
        var4_6 = this.C;
        if (var3_5 < 4) {
            var5_2[var4_6].b[0] = var5_2[var2_4].b[var3_5];
            while (true) {
                if (var1_3 > var3_5) break;
                var5_2 = this.B;
                var5_2[this.C].b[var1_3] = var5_2[var2_4].b[var1_3 - 1];
            }
            for (var4_6 = ++var1_3; var4_6 < 4; ++var4_6) {
                var5_2 = this.B;
                var5_2[this.C].b[var4_6] = var5_2[var2_4].b[var4_6];
            }
            return;
        }
        var6_1 /* !! */  = (f[])var5_2[var4_6].b;
        var6_1 /* !! */ [0] = (f)(var3_5 - 4);
        System.arraycopy(var5_2[var2_4].b, 0, var6_1 /* !! */ , 1, 3);
    }

    @Override
    public void b() {
        this.C = 0;
        this.D = 0;
        super.b();
    }

    @Override
    int t() {
        int n8;
        Object object;
        Object object2;
        int n9;
        int n10 = this.C;
        if (n10 < this.D) {
            int n11;
            f[] fArray = this.B;
            this.C = n11 = fArray[n10].d;
            this.y = fArray[n11].e;
            return n11 - n10;
        }
        this.C = 0;
        this.D = 0;
        this.y = -1;
        if (this.z == -1) {
            this.E = this.s();
        }
        if ((n9 = Math.min(this.n.c(), 273)) < 2) {
            return 1;
        }
        Object object3 = 0;
        for (n10 = 0; n10 < 4; ++n10) {
            this.F[n10] = this.n.h(this.b[n10], n9);
            object2 = this.F;
            object = object2[n10];
            if (object < 2) {
                object2[n10] = false;
                n8 = object3;
            } else {
                n8 = object3;
                if (object > object2[object3]) {
                    n8 = n10;
                }
            }
            object3 = n8;
        }
        n10 = this.F[object3];
        n9 = this.r;
        if (n10 >= n9) {
            this.y = object3;
            this.z(n10 - 1);
            return this.F[object3];
        }
        object2 = this.E;
        n10 = ((ax.ge.g)object2).c;
        if (n10 > 0) {
            n8 = ((ax.ge.g)object2).a[n10 - 1];
            object = ((ax.ge.g)object2).b[n10 - 1];
            n10 = n8;
            if (n8 >= n9) {
                this.y = (int)(object + 4);
                this.z(n8 - 1);
                return n8;
            }
        } else {
            n10 = 0;
        }
        n8 = this.n.e(0);
        int n12 = this.n.e(this.b[0] + 1);
        if (n10 < 2 && n8 != n12 && this.F[object3] < 2) {
            return 1;
        }
        n9 = this.n.k();
        int n13 = this.a & n9;
        object = this.n.e(1);
        object = this.o.d(n8, n12, (int)object, n9, this.c);
        this.B[1].b((int)object, 0, -1);
        int n14 = this.k(this.c, n13);
        object = this.l(n14, this.c);
        if (n12 == n8) {
            n8 = this.v((int)object, this.c, n13);
            object2 = this.B[1];
            if (n8 < ((f)object2).c) {
                ((f)object2).b(n8, 0, 0);
            }
        }
        this.D = object3 = Math.max(n10, this.F[object3]);
        if (object3 < 2) {
            this.y = this.B[1].e;
            return 1;
        }
        this.C();
        this.B[0].a.d(this.c);
        System.arraycopy(this.b, 0, this.B[0].b, 0, 4);
        for (object3 = this.D; object3 >= 2; --object3) {
            this.B[object3].a();
        }
        for (object3 = 0; object3 < 4; ++object3) {
            n8 = this.F[object3];
            if (n8 < 2) continue;
            n12 = this.q((int)object, (int)object3, this.c, n13);
            do {
                int n15 = this.q.c(n8, n13) + n12;
                object2 = this.B[n8];
                if (n15 >= ((f)object2).c) continue;
                ((f)object2).b(n15, 0, (int)object3);
            } while (--n8 >= 2);
        }
        object = Math.max(this.F[0] + 1, 2);
        if (object <= n10) {
            n14 = this.u(n14, this.c);
            n10 = 0;
            do {
                object3 = object;
                n8 = ++n10;
            } while (object > this.E.a[n10]);
            while (true) {
                n10 = this.E.b[n8];
                object = this.r(n14, n10, (int)object3, n13);
                object2 = this.B[object3];
                if (object < ((f)object2).c) {
                    ((f)object2).b((int)object, 0, n10 + 4);
                }
                object2 = this.E;
                n10 = n8;
                if (object3 == ((ax.ge.g)object2).a[n8]) {
                    n10 = ++n8;
                    if (n8 == ((ax.ge.g)object2).c) break;
                }
                ++object3;
                n8 = n10;
            }
        }
        object3 = Math.min(this.n.c(), 4095);
        n10 = n9;
        while (true) {
            this.C = n8 = this.C + 1;
            if (n8 >= this.D) break;
            this.E = object2 = this.s();
            n8 = ((ax.ge.g)object2).c;
            if (n8 > 0 && ((ax.ge.g)object2).a[n8 - 1] >= this.r) break;
            --object3;
            n8 = this.a & ++n10;
            this.H();
            object2 = this.B[this.C];
            n9 = ((f)object2).c;
            n9 = this.k(((f)object2).a, n8) + n9;
            object = this.l(n9, this.B[this.C].a);
            this.D(n10, n8, (int)object3, (int)object);
            if (object3 < 2) continue;
            object = this.E(n10, n8, (int)object3, (int)object);
            if (this.E.c <= 0) continue;
            this.F(n10, n8, (int)object3, n9, (int)object);
        }
        return this.G();
    }
}


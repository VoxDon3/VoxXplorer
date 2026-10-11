/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.ge.f;
import ax.he.a;
import ax.he.d;
import ax.he.e;
import ax.he.g;
import java.io.IOException;
import java.lang.reflect.Array;

public abstract class c
extends a {
    private int A;
    private final ax.ie.e m;
    final f n;
    final c o;
    final b p;
    final b q;
    final int r;
    private int s = 0;
    private int t = 0;
    private final int u;
    private final int[][] v;
    private final int[][] w;
    private final int[] x;
    int y;
    int z;

    c(ax.ie.e e8, f f8, int n8, int n9, int n10, int n11, int n12) {
        super(n10);
        Class<Integer> clazz = Integer.TYPE;
        this.w = (int[][])Array.newInstance(clazz, 4, 128);
        this.x = new int[16];
        this.y = 0;
        this.z = -1;
        this.A = 0;
        this.m = e8;
        this.n = f8;
        this.r = n12;
        this.o = new c(this, n8, n9);
        this.p = new b(this, n10, n12);
        this.q = new b(this, n10, n12);
        this.u = n8 = ax.he.c.m(n11 - 1) + 1;
        this.v = (int[][])Array.newInstance(clazz, 4, n8);
        this.b();
    }

    private void A() {
        this.t = 16;
        for (int i8 = 0; i8 < 16; ++i8) {
            this.x[i8] = ax.ie.e.k(this.l, i8);
        }
    }

    private void B() {
        Object object;
        int n8;
        int n9;
        int n10;
        this.s = 128;
        int n11 = 0;
        while (true) {
            n10 = 14;
            if (n11 >= 4) break;
            n9 = 0;
            while (true) {
                if (n9 >= this.u) break;
                this.v[n11][n9] = ax.ie.e.h(this.j[n11], n9);
                ++n9;
            }
            for (n8 = n10; n8 < this.u; ++n8) {
                object = this.v[n11];
                object[n8] = object[n8] + ax.ie.e.i((n8 >>> 1) - 5);
            }
            for (n9 = 0; n9 < 4; ++n9) {
                this.w[n11][n9] = this.v[n11][n9];
            }
            ++n11;
        }
        n9 = 4;
        for (n11 = 4; n11 < 14; ++n11) {
            object = this.k;
            int n12 = n11 - 4;
            int n13 = object[n12].length;
            for (n8 = 0; n8 < n13; ++n8) {
                int n14 = ax.ie.e.k(this.k[n12], n9 - ((n11 & 1 | 2) << (n11 >>> 1) - 1));
                for (n10 = 0; n10 < 4; ++n10) {
                    this.w[n10][n9] = this.v[n10][n11] + n14;
                }
                ++n9;
            }
        }
    }

    private boolean f() throws IOException {
        if (!this.n.l(0)) {
            return false;
        }
        this.z(1);
        this.m.b(this.d[this.c.a()], 0, 0);
        this.o.c();
        --this.z;
        ++this.A;
        return true;
    }

    private void h(int n8, int n9, int n10) throws IOException {
        this.c.g();
        this.p.b(n9, n10);
        n10 = ax.he.c.m(n8);
        this.m.c(this.j[ax.he.a.a(n9)], n10);
        if (n10 >= 4) {
            int n11 = n10 >>> 1;
            n9 = n8 - ((n10 & 1 | 2) << n11 - 1);
            if (n10 < 14) {
                this.m.e(this.k[n10 - 4], n9);
            } else {
                this.m.d(n9 >>> 4, n11 - 5);
                this.m.e(this.l, n9 & 0xF);
                --this.t;
            }
        }
        int[] nArray = this.b;
        nArray[3] = nArray[2];
        nArray[2] = nArray[1];
        nArray[1] = nArray[0];
        nArray[0] = n8;
        --this.s;
    }

    private void i(int n8, int n9, int n10) throws IOException {
        int n11 = 0;
        if (n8 == 0) {
            this.m.b(this.f, this.c.a(), 0);
            ax.ie.e e8 = this.m;
            short[] sArray = this.i[this.c.a()];
            n8 = n9 == 1 ? n11 : 1;
            e8.b(sArray, n10, n8);
        } else {
            int[] nArray;
            n11 = this.b[n8];
            this.m.b(this.f, this.c.a(), 1);
            if (n8 == 1) {
                this.m.b(this.g, this.c.a(), 0);
            } else {
                this.m.b(this.g, this.c.a(), 1);
                this.m.b(this.h, this.c.a(), n8 - 2);
                if (n8 == 3) {
                    nArray = this.b;
                    nArray[3] = nArray[2];
                }
                nArray = this.b;
                nArray[2] = nArray[1];
            }
            nArray = this.b;
            nArray[1] = nArray[0];
            nArray[0] = n11;
        }
        if (n9 == 1) {
            this.c.h();
            return;
        }
        this.q.b(n9, n10);
        this.c.f();
    }

    private boolean j() throws IOException {
        if (!this.n.l(this.z + 1)) {
            return false;
        }
        int n8 = this.t();
        int n9 = this.n.k() - this.z & this.a;
        if (this.y == -1) {
            this.m.b(this.d[this.c.a()], n9, 0);
            this.o.b();
        } else {
            this.m.b(this.d[this.c.a()], n9, 1);
            if (this.y < 4) {
                this.m.b(this.e, this.c.a(), 1);
                this.i(this.y, n8, n9);
            } else {
                this.m.b(this.e, this.c.a(), 0);
                this.h(this.y - 4, n8, n9);
            }
        }
        this.z -= n8;
        this.A += n8;
        return true;
    }

    public static int m(int n8) {
        int n9;
        int n10;
        if (n8 <= 4 && n8 >= 0) {
            return n8;
        }
        if ((0xFFFF0000 & n8) == 0) {
            n10 = n8 << 16;
            n9 = 15;
        } else {
            n9 = 31;
            n10 = n8;
        }
        int n11 = n10;
        int n12 = n9;
        if ((0xFF000000 & n10) == 0) {
            n11 = n10 << 8;
            n12 = n9 - 8;
        }
        n10 = n11;
        n9 = n12;
        if ((0xF0000000 & n11) == 0) {
            n10 = n11 << 4;
            n9 = n12 - 4;
        }
        n11 = n10;
        n12 = n9;
        if ((0xC0000000 & n10) == 0) {
            n11 = n10 << 2;
            n12 = n9 - 2;
        }
        n9 = n12;
        if ((n11 & Integer.MIN_VALUE) == 0) {
            n9 = n12 - 1;
        }
        return (n9 << 1) + (n8 >>> n9 - 1 & 1);
    }

    public static c n(ax.ie.e e8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, ax.be.c c8) {
        if (n11 != 1) {
            if (n11 == 2) {
                return new e(e8, n8, n9, n10, n12, n13, n14, n15, n16, c8);
            }
            throw new IllegalArgumentException();
        }
        return new d(e8, n8, n9, n10, n12, n13, n14, n15, n16, c8);
    }

    void C() {
        if (this.s <= 0) {
            this.B();
        }
        if (this.t <= 0) {
            this.A();
        }
        this.p.d();
        this.q.d();
    }

    @Override
    public void b() {
        super.b();
        this.o.e();
        this.p.a();
        this.q.a();
        this.s = 0;
        this.t = 0;
        this.A += this.z + 1;
        this.z = -1;
    }

    public void d() throws IOException {
        if (this.n.m() || this.f()) {
            while (this.j()) {
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e() {
        try {
            if (!this.n.m() && !this.f()) {
                return false;
            }
            while (this.A <= 0x1FFEEF && this.m.j() <= 65510) {
                boolean bl = this.j();
                if (bl) continue;
                return false;
            }
            return true;
        }
        catch (IOException iOException) {
            throw new Error();
        }
    }

    public void g() throws IOException {
        int n8 = this.n.k() - this.z & this.a;
        this.m.b(this.d[this.c.a()], n8, 1);
        this.m.b(this.e, this.c.a(), 0);
        this.h(-1, 2, n8);
    }

    int k(g g8, int n8) {
        return ax.ie.e.g(this.d[g8.a()][n8], 1);
    }

    int l(int n8, g g8) {
        return n8 + ax.ie.e.g(this.e[g8.a()], 1);
    }

    public f o() {
        return this.n;
    }

    int p(int n8, int n9, g g8, int n10) {
        return this.q(this.l(this.k(g8, n10), g8), n8, g8, n10) + this.q.c(n9, n10);
    }

    int q(int n8, int n9, g g8, int n10) {
        if (n9 == 0) {
            return n8 + (ax.ie.e.g(this.f[g8.a()], 0) + ax.ie.e.g(this.i[g8.a()][n10], 1));
        }
        n8 += ax.ie.e.g(this.f[g8.a()], 1);
        if (n9 == 1) {
            return n8 + ax.ie.e.g(this.g[g8.a()], 0);
        }
        return n8 + (ax.ie.e.g(this.g[g8.a()], 1) + ax.ie.e.g(this.h[g8.a()], n9 - 2));
    }

    int r(int n8, int n9, int n10, int n11) {
        n8 += this.p.c(n10, n11);
        n10 = ax.he.a.a(n10);
        if (n9 < 128) {
            return n8 + this.w[n10][n9];
        }
        n11 = ax.he.c.m(n9);
        return n8 + (this.v[n10][n11] + this.x[n9 & 0xF]);
    }

    ax.ge.g s() {
        ++this.z;
        return this.n.j();
    }

    abstract int t();

    int u(int n8, g g8) {
        return n8 + ax.ie.e.g(this.e[g8.a()], 0);
    }

    int v(int n8, g g8, int n9) {
        return n8 + ax.ie.e.g(this.f[g8.a()], 0) + ax.ie.e.g(this.i[g8.a()][n9], 0);
    }

    public int w() {
        return this.A;
    }

    public void x(ax.be.c c8) {
        this.n.r(c8);
    }

    public void y() {
        this.A = 0;
    }

    void z(int n8) {
        this.z += n8;
        this.n.v(n8);
    }

    class b
    extends a.a {
        private final int[] f;
        private final int[][] g;
        final c h;

        b(c c8, int n8, int n9) {
            this.h = c8;
            super(c8);
            n8 = 1 << n8;
            this.f = new int[n8];
            n9 = Math.max(n9 - 1, 16);
            this.g = new int[n8][n9];
        }

        private void e(int n8) {
            int[] nArray;
            int n9;
            int n10 = ax.ie.e.g(this.a[0], 0);
            for (n9 = 0; n9 < 8; ++n9) {
                this.g[n8][n9] = ax.ie.e.h(this.b[n8], n9) + n10;
            }
            n10 = ax.ie.e.g(this.a[0], 1);
            int n11 = ax.ie.e.g(this.a[1], 0);
            while (n9 < 16) {
                this.g[n8][n9] = n10 + n11 + ax.ie.e.h(this.c[n8], n9 - 8);
                ++n9;
            }
            n11 = ax.ie.e.g(this.a[1], 1);
            while (n9 < (nArray = this.g[n8]).length) {
                nArray[n9] = n10 + n11 + ax.ie.e.h(this.d, n9 - 16);
                ++n9;
            }
        }

        @Override
        void a() {
            int[] nArray;
            super.a();
            for (int i8 = 0; i8 < (nArray = this.f).length; ++i8) {
                nArray[i8] = 0;
            }
        }

        void b(int n8, int n9) throws IOException {
            int n10 = n8 - 2;
            if (n10 < 8) {
                this.h.m.b(this.a, 0, 0);
                this.h.m.c(this.b[n9], n10);
            } else {
                this.h.m.b(this.a, 0, 1);
                n10 = n8 - 10;
                if (n10 < 8) {
                    this.h.m.b(this.a, 1, 0);
                    this.h.m.c(this.c[n9], n10);
                } else {
                    this.h.m.b(this.a, 1, 1);
                    this.h.m.c(this.d, n8 - 18);
                }
            }
            int[] nArray = this.f;
            nArray[n9] = nArray[n9] - 1;
        }

        int c(int n8, int n9) {
            return this.g[n9][n8 - 2];
        }

        void d() {
            int[] nArray;
            for (int i8 = 0; i8 < (nArray = this.f).length; ++i8) {
                if (nArray[i8] > 0) continue;
                nArray[i8] = 32;
                this.e(i8);
            }
        }
    }

    class c
    extends a.b {
        private final a[] d;
        final c e;

        c(c aArray, int n8, int n9) {
            this.e = aArray;
            super((ax.he.a)aArray, n8, n9);
            this.d = new a[1 << n8 + n9];
            for (n8 = 0; n8 < (aArray = this.d).length; ++n8) {
                aArray[n8] = new a(this);
            }
        }

        void b() throws IOException {
            c c8 = this.e;
            int n8 = this.a(c8.n.e(c8.z + 1), this.e.n.k() - this.e.z);
            this.d[n8].b();
        }

        void c() throws IOException {
            this.d[0].b();
        }

        int d(int n8, int n9, int n10, int n11, g g8) {
            int n12 = ax.ie.e.g(this.e.d[g8.a()][this.e.a & n11], 0);
            n10 = this.a(n10, n11);
            n8 = g8.b() ? this.d[n10].d(n8) : this.d[n10].c(n8, n9);
            return n12 + n8;
        }

        void e() {
            a[] aArray;
            for (int i8 = 0; i8 < (aArray = this.d).length; ++i8) {
                aArray[i8].a();
            }
        }

        private class a
        extends a.b.a {
            final c c;

            private a(c c8) {
                this.c = c8;
                super(c8);
            }

            void b() throws IOException {
                c c8 = this.c.e;
                int n8 = c8.n.e(c8.z);
                int n9 = 256;
                n8 |= 0x100;
                if (this.c.e.c.b()) {
                    do {
                        this.c.e.m.b(this.a, n8 >>> 8, n8 >>> 7 & 1);
                        n8 = n9 = n8 << 1;
                    } while (n9 < 65536);
                } else {
                    int n10;
                    c8 = this.c.e;
                    int n11 = c8.n.e(c8.b[0] + 1 + c8.z);
                    do {
                        this.c.e.m.b(this.a, ((n11 <<= 1) & n9) + n9 + (n8 >>> 8), n8 >>> 7 & 1);
                        n10 = n8 << 1;
                        n9 &= ~(n11 ^ n10);
                        n8 = n10;
                    } while (n10 < 65536);
                }
                this.c.e.c.e();
            }

            int c(int n8, int n9) {
                int n10;
                int n11;
                int n12 = 256;
                n8 |= 0x100;
                int n13 = 0;
                do {
                    n10 = n13 + ax.ie.e.g(this.a[((n9 <<= 1) & n12) + n12 + (n8 >>> 8)], n8 >>> 7 & 1);
                    n11 = n8 << 1;
                    n12 &= ~(n9 ^ n11);
                    n13 = n10;
                    n8 = n11;
                } while (n11 < 65536);
                return n10;
            }

            int d(int n8) {
                int n9;
                int n10;
                n8 |= 0x100;
                int n11 = 0;
                do {
                    n9 = n11 + ax.ie.e.g(this.a[n8 >>> 8], n8 >>> 7 & 1);
                    n10 = n8 << 1;
                    n11 = n9;
                    n8 = n10;
                } while (n10 < 65536);
                return n9;
            }
        }
    }
}


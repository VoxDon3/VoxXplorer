/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.ge.e;
import ax.he.a;
import java.io.IOException;

public final class b
extends a {
    private final e m;
    private final ax.ie.b n;
    private final c o;
    private final b p = new b(this);
    private final b q = new b(this);

    public b(e e8, ax.ie.b b8, int n8, int n9, int n10) {
        super(n10);
        this.m = e8;
        this.n = b8;
        this.o = new c(this, n8, n9);
        this.b();
    }

    private int f(int n8) throws IOException {
        int n9;
        this.c.g();
        int[] nArray = this.b;
        nArray[3] = nArray[2];
        nArray[2] = nArray[1];
        nArray[1] = nArray[0];
        int n10 = this.p.b(n8);
        n8 = this.n.c(this.j[ax.he.a.a(n10)]);
        if (n8 < 4) {
            this.b[0] = n8;
            return n10;
        }
        int n11 = n8 >> 1;
        nArray = this.b;
        nArray[0] = n9 = (2 | n8 & 1) << n11 - 1;
        if (n8 < 14) {
            nArray[0] = this.n.e(this.k[n8 - 4]) | n9;
            return n10;
        }
        nArray[0] = this.n.d(n11 - 5) << 4 | n9;
        nArray = this.b;
        nArray[0] = nArray[0] | this.n.e(this.l);
        return n10;
    }

    private int g(int n8) throws IOException {
        if (this.n.b(this.f, this.c.a()) == 0) {
            if (this.n.b(this.i[this.c.a()], n8) == 0) {
                this.c.h();
                return 1;
            }
        } else {
            int[] nArray;
            int n9;
            if (this.n.b(this.g, this.c.a()) == 0) {
                n9 = this.b[1];
            } else {
                if (this.n.b(this.h, this.c.a()) == 0) {
                    n9 = this.b[2];
                } else {
                    nArray = this.b;
                    n9 = nArray[3];
                    nArray[3] = nArray[2];
                }
                nArray = this.b;
                nArray[2] = nArray[1];
            }
            nArray = this.b;
            nArray[1] = nArray[0];
            nArray[0] = n9;
        }
        this.c.f();
        return this.q.b(n8);
    }

    @Override
    public void b() {
        super.b();
        this.o.c();
        this.p.a();
        this.q.a();
    }

    public void e() throws IOException {
        this.m.j();
        while (this.m.f()) {
            int n8 = this.m.d() & this.a;
            if (this.n.b(this.d[this.c.a()], n8) == 0) {
                this.o.b();
                continue;
            }
            n8 = this.n.b(this.e, this.c.a()) == 0 ? this.f(n8) : this.g(n8);
            this.m.i(this.b[0], n8);
        }
        this.n.f();
    }

    public boolean h() {
        return this.b[0] == -1;
    }

    private class b
    extends a.a {
        final b f;

        private b(b b8) {
            this.f = b8;
            super(b8);
        }

        int b(int n8) throws IOException {
            if (this.f.n.b(this.a, 0) == 0) {
                return this.f.n.c(this.b[n8]) + 2;
            }
            if (this.f.n.b(this.a, 1) == 0) {
                return this.f.n.c(this.c[n8]) + 10;
            }
            return this.f.n.c(this.d) + 18;
        }
    }

    private class c
    extends a.b {
        private final a[] d;
        final b e;

        c(b aArray, int n8, int n9) {
            this.e = aArray;
            super((ax.he.a)aArray, n8, n9);
            this.d = new a[1 << n8 + n9];
            for (n8 = 0; n8 < (aArray = this.d).length; ++n8) {
                aArray[n8] = new a(this);
            }
        }

        void b() throws IOException {
            int n8 = this.a(this.e.m.c(0), this.e.m.d());
            this.d[n8].b();
        }

        void c() {
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
                int n8;
                boolean bl = this.c.e.c.b();
                int n9 = 1;
                if (bl) {
                    do {
                        n9 = n8 = this.c.e.n.b(this.a, n9) | n9 << 1;
                    } while (n8 < 256);
                } else {
                    int n10 = this.c.e.m.c(this.c.e.b[0]);
                    int n11 = 256;
                    n9 = 1;
                    do {
                        int n12 = (n10 <<= 1) & n11;
                        int n13 = this.c.e.n.b(this.a, n11 + n12 + n9);
                        n8 = n9 << 1 | n13;
                        n11 &= ~n12 ^ 0 - n13;
                        n9 = n8;
                    } while (n8 < 256);
                }
                this.c.e.m.h((byte)n8);
                this.c.e.c.e();
            }
        }
    }
}


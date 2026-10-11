/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import ax.H9.k;
import ax.H9.l;
import ax.I9.d;
import ax.I9.j;
import ax.I9.n;
import ax.I9.q;
import ax.I9.u;
import ax.I9.v;
import ax.I9.y;
import ax.J9.f;
import ax.J9.g;
import ax.J9.h;

public class c {
    private ax.A9.b a;
    private q b;
    private a[] c;
    private double d = 0.25;

    public c() {
        this(16);
    }

    public c(int n8) {
        a[] aArray;
        this.c = new a[n8];
        for (n8 = 0; n8 < (aArray = this.c).length; ++n8) {
            aArray[n8] = new a(this, n8);
        }
    }

    public l c() {
        return this.b.j;
    }

    public void d(int n8, int n9, double d8) {
        this.c[n8].e(n9, d8 * this.d);
    }

    public void e(int n8, int n9, int n10) {
        this.d(n8, n9, (double)n10 * 0.007874015748031496);
    }

    public void f(int n8, int n9, double d8) {
        this.c[n8].g(n9, d8 * this.d);
    }

    public void g(int n8, int n9, int n10) {
        this.f(n8, n9, (double)n10 * 0.007874015748031496);
    }

    public void h(int n8, int n9) {
        this.c[n8].i(n9);
    }

    public void i(int n8, double d8) {
        this.c[n8].j(d8);
    }

    public void j(int n8, double d8) {
        this.c[n8].k(d8);
    }

    public void k(int n8, double d8) {
        this.c[n8].l(d8);
    }

    public void l(int n8, double d8) {
        this.c[n8].m(d8);
    }

    public void m(int n8, double d8) {
        this.c[n8].n(d8);
    }

    public void n(int n8, double d8) {
        this.c[n8].o(d8);
    }

    public void o(int n8, double d8) {
        this.c[n8].p(d8);
    }

    public void p(ax.A9.b object, int n8, int n9, int n10, g g8) {
        this.a = object;
        if (this.b == null) {
            q q8;
            this.b = q8 = new q();
            object.e(q8);
        }
        object = new b(this, n10 * n9, g8);
        for (n10 = 0; n10 < n9; ++n10) {
            this.c[n8 + n10].q((b)object);
        }
    }

    private class a {
        private v a;
        private ax.I9.l b;
        private ax.I9.h c;
        private ax.I9.h d;
        private d e;
        private j f;
        private ax.I9.k g;
        private double h;
        private double i;
        private int j;
        private b k;
        private int l;
        private boolean m;
        h n;
        final c o;

        a(c c8, int n8) {
            this.o = c8;
            this.h = 5.0;
            this.i = 0.16666666666666666;
            this.n = new h(this){
                final a a;
                {
                    this.a = a8;
                }

                @Override
                public void a(y y8) {
                    y8.c(this.a.j);
                    this.a.c(y8);
                }
            };
            this.l = n8;
            if (n8 == 9) {
                this.m = true;
                this.j = 128;
            }
        }

        private void c(y y8) {
            Object object = y8.d();
            k k8 = (k)((u)object).o("FreqScaler");
            if (k8 != null) {
                k8.i();
                this.b.i.r(k8);
            }
            if ((k8 = (k)((u)object).o("Timbre")) != null) {
                k8.i();
                this.c.i.r(k8);
                this.c.h.D(k8);
            }
            if ((object = (k)((u)object).o("Pressure")) != null) {
                ((ax.H9.g)object).i();
                this.d.i.r((k)object);
                this.d.h.D((k)object);
            }
            y8.b().i();
            y8.b().r(this.f.h);
        }

        private int d(int n8) {
            return (this.l << 8) + n8;
        }

        void e(int n8, double d8) {
            this.f(n8, d8, this.o.a.d());
        }

        void f(int n8, double d8, ax.Qa.c c8) {
            this.k.c.g(this.d(n8), c8);
        }

        void g(int n8, double d8) {
            this.h(n8, d8, this.o.a.d());
        }

        void h(int n8, double d8, ax.Qa.c c8) {
            double d9 = ax.Pa.a.b(n8);
            this.k.c.h(this.d(n8), d9, d8, this.n, c8);
        }

        void i(int n8) {
            if (!this.m) {
                String string = this.k.a.c()[n8 %= this.k.a.b()];
                this.j = n8;
            }
        }

        public void j(double d8) {
            this.i = d8 / 12.0;
        }

        public void k(double d8) {
            this.g.i.u(d8);
        }

        public void l(double d8) {
            this.b.h.u(this.i * d8);
        }

        public void m(double d8) {
            double d9 = this.d.h.s();
            d8 = Math.pow(this.d.h.r() / d9, d8);
            this.d.h.u(d9 * d8);
        }

        public void n(double d8) {
            double d9 = this.c.h.s();
            double d10 = this.c.h.r();
            this.c.h.u(d9 + d8 * (d10 - d9));
        }

        public void o(double d8) {
            this.a.i.u(d8);
        }

        public void p(double d8) {
            d8 = Math.pow(63095.73444801944, d8);
            this.e.h.u(d8 * 1.5848931924611107E-5);
        }

        void q(b object) {
            this.k = object;
            Object object2 = this.o.a;
            this.b = object = new ax.I9.l();
            object2.e((u)object);
            object2 = this.o.a;
            this.a = object = new n();
            object2.e((u)object);
            object2 = this.o.a;
            this.c = object = new ax.I9.h();
            object2.e((u)object);
            this.c.j.u(0.02);
            object2 = this.o.a;
            this.d = object = new ax.I9.h();
            object2.e((u)object);
            this.d.j.u(0.02);
            object = this.o.a;
            this.e = object2 = new d();
            object.e((u)object2);
            this.e.h.u(1.0);
            this.e.j.u(0.02);
            object = this.o.a;
            this.f = object2 = new j();
            object.e((u)object2);
            object = this.o.a;
            this.g = object2 = new ax.I9.k();
            object.e((u)object2);
            this.b.h.B(true);
            this.a.k.r(this.b.h);
            this.a.i.u(0.0);
            this.a.h.u(this.h);
            this.e.i.r(this.f.i);
            this.f.j.r(this.g.h);
            this.g.j.q(0, ((c)this.o).b.h, 0);
            this.g.j.q(1, ((c)this.o).b.i, 0);
        }
    }

    private class b {
        private g a;
        private y[] b;
        private f c;
        final c d;

        b(c c8, int n8, g g8) {
            this.d = c8;
            this.a = g8;
            this.b = new y[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                y y8 = g8.a();
                u u8 = y8.d();
                c8.a.e(u8);
                this.b[i8] = y8;
            }
            this.c = new f(this.b);
        }
    }
}


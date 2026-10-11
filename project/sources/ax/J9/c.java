package ax.J9;

import ax.I9.j;
import ax.I9.k;
import ax.I9.l;
import ax.I9.n;
import ax.I9.q;
import ax.I9.u;
import ax.I9.v;
import ax.I9.y;

/* loaded from: classes3.dex */
public class c {
    private ax.A9.b a;
    private q b;
    private a[] c;
    private double d;

    private class a {
        private v a;
        private l b;
        private ax.I9.h c;
        private ax.I9.h d;
        private ax.I9.d e;
        private j f;
        private k g;
        private int j;
        private b k;
        private int l;
        private boolean m;
        private double h = 5.0d;
        private double i = 0.16666666666666666d;
        h n = new C0099a();

        /* renamed from: ax.J9.c$a$a, reason: collision with other inner class name */
        class C0099a implements h {
            C0099a() {
            }

            @Override // ax.J9.h
            public void a(y yVar) {
                yVar.c(a.this.j);
                a.this.c(yVar);
            }
        }

        a(int i) {
            this.l = i;
            if (i == 9) {
                this.m = true;
                this.j = 128;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(y yVar) {
            u d = yVar.d();
            ax.H9.k kVar = (ax.H9.k) d.o("FreqScaler");
            if (kVar != null) {
                kVar.i();
                this.b.i.r(kVar);
            }
            ax.H9.k kVar2 = (ax.H9.k) d.o("Timbre");
            if (kVar2 != null) {
                kVar2.i();
                this.c.i.r(kVar2);
                this.c.h.D(kVar2);
            }
            ax.H9.k kVar3 = (ax.H9.k) d.o("Pressure");
            if (kVar3 != null) {
                kVar3.i();
                this.d.i.r(kVar3);
                this.d.h.D(kVar3);
            }
            yVar.b().i();
            yVar.b().r(this.f.h);
        }

        private int d(int i) {
            return (this.l << 8) + i;
        }

        void e(int i, double d) {
            f(i, d, c.this.a.d());
        }

        void f(int i, double d, ax.Qa.c cVar) {
            this.k.c.g(d(i), cVar);
        }

        void g(int i, double d) {
            h(i, d, c.this.a.d());
        }

        void h(int i, double d, ax.Qa.c cVar) {
            this.k.c.h(d(i), ax.Pa.a.b(i), d, this.n, cVar);
        }

        void i(int i) {
            if (this.m) {
                return;
            }
            int b = i % this.k.a.b();
            String str = this.k.a.c()[b];
            this.j = b;
        }

        public void j(double d) {
            this.i = d / 12.0d;
        }

        public void k(double d) {
            this.g.i.u(d);
        }

        public void l(double d) {
            this.b.h.u(this.i * d);
        }

        public void m(double d) {
            double s = this.d.h.s();
            this.d.h.u(s * Math.pow(this.d.h.r() / s, d));
        }

        public void n(double d) {
            double s = this.c.h.s();
            this.c.h.u(s + (d * (this.c.h.r() - s)));
        }

        public void o(double d) {
            this.a.i.u(d);
        }

        public void p(double d) {
            this.e.h.u(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
        }

        void q(b bVar) {
            this.k = bVar;
            ax.A9.b bVar2 = c.this.a;
            l lVar = new l();
            this.b = lVar;
            bVar2.e(lVar);
            ax.A9.b bVar3 = c.this.a;
            n nVar = new n();
            this.a = nVar;
            bVar3.e(nVar);
            ax.A9.b bVar4 = c.this.a;
            ax.I9.h hVar = new ax.I9.h();
            this.c = hVar;
            bVar4.e(hVar);
            this.c.j.u(0.02d);
            ax.A9.b bVar5 = c.this.a;
            ax.I9.h hVar2 = new ax.I9.h();
            this.d = hVar2;
            bVar5.e(hVar2);
            this.d.j.u(0.02d);
            ax.A9.b bVar6 = c.this.a;
            ax.I9.d dVar = new ax.I9.d();
            this.e = dVar;
            bVar6.e(dVar);
            this.e.h.u(1.0d);
            this.e.j.u(0.02d);
            ax.A9.b bVar7 = c.this.a;
            j jVar = new j();
            this.f = jVar;
            bVar7.e(jVar);
            ax.A9.b bVar8 = c.this.a;
            k kVar = new k();
            this.g = kVar;
            bVar8.e(kVar);
            this.b.h.B(true);
            this.a.k.r(this.b.h);
            this.a.i.u(0.0d);
            this.a.h.u(this.h);
            this.e.i.r(this.f.i);
            this.f.j.r(this.g.h);
            this.g.j.q(0, c.this.b.h, 0);
            this.g.j.q(1, c.this.b.i, 0);
        }
    }

    private class b {
        private g a;
        private y[] b;
        private f c;

        b(int i, g gVar) {
            this.a = gVar;
            this.b = new y[i];
            for (int i2 = 0; i2 < i; i2++) {
                y a = gVar.a();
                c.this.a.e(a.d());
                this.b[i2] = a;
            }
            this.c = new f(this.b);
        }
    }

    public c() {
        this(16);
    }

    public ax.H9.l c() {
        return this.b.j;
    }

    public void d(int i, int i2, double d) {
        this.c[i].e(i2, d * this.d);
    }

    public void e(int i, int i2, int i3) {
        d(i, i2, i3 * 0.007874015748031496d);
    }

    public void f(int i, int i2, double d) {
        this.c[i].g(i2, d * this.d);
    }

    public void g(int i, int i2, int i3) {
        f(i, i2, i3 * 0.007874015748031496d);
    }

    public void h(int i, int i2) {
        this.c[i].i(i2);
    }

    public void i(int i, double d) {
        this.c[i].j(d);
    }

    public void j(int i, double d) {
        this.c[i].k(d);
    }

    public void k(int i, double d) {
        this.c[i].l(d);
    }

    public void l(int i, double d) {
        this.c[i].m(d);
    }

    public void m(int i, double d) {
        this.c[i].n(d);
    }

    public void n(int i, double d) {
        this.c[i].o(d);
    }

    public void o(int i, double d) {
        this.c[i].p(d);
    }

    public void p(ax.A9.b bVar, int i, int i2, int i3, g gVar) {
        this.a = bVar;
        if (this.b == null) {
            q qVar = new q();
            this.b = qVar;
            bVar.e(qVar);
        }
        b bVar2 = new b(i3 * i2, gVar);
        for (int i4 = 0; i4 < i2; i4++) {
            this.c[i + i4].q(bVar2);
        }
    }

    public c(int i) {
        this.d = 0.25d;
        this.c = new a[i];
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.c;
            if (i2 >= aVarArr.length) {
                return;
            }
            aVarArr[i2] = new a(i2);
            i2++;
        }
    }
}

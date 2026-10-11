package ax.X1;

import ax.P0.C0901j;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.S0.d0;
import ax.T0.h;
import ax.X1.L;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Collections;

/* loaded from: classes.dex */
public final class q implements InterfaceC1152m {
    private final G a;
    private final String b;
    private String c;
    private U d;
    private a e;
    private boolean f;
    private long m;
    private final boolean[] g = new boolean[3];
    private final w h = new w(32, 128);
    private final w i = new w(33, 128);
    private final w j = new w(34, 128);
    private final w k = new w(39, 128);
    private final w l = new w(40, 128);
    private long n = -9223372036854775807L;
    private final ax.S0.G o = new ax.S0.G();

    private static final class a {
        private final U a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(U u) {
            this.a = u;
        }

        private static boolean b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        private static boolean c(int i) {
            return i < 32 || i == 40;
        }

        private void d(int i) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.f(j, this.m ? 1 : 0, i2, i, null);
            }
        }

        public void a(long j, int i, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    d(i + ((int) (j - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public void e(byte[] bArr, int i, int i2) {
            if (this.f) {
                int i3 = this.d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.d = i3 + (i2 - i);
                } else {
                    this.g = (bArr[i4] & 128) != 0;
                    this.f = false;
                }
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long j, int i, int i2, long j2, boolean z) {
            this.g = false;
            this.h = false;
            this.e = j2;
            this.d = 0;
            this.b = j;
            if (!c(i2)) {
                if (this.i && !this.j) {
                    if (z) {
                        d(i);
                    }
                    this.i = false;
                }
                if (b(i2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = i2 >= 16 && i2 <= 21;
            this.c = z2;
            this.f = z2 || i2 <= 9;
        }
    }

    public q(G g, String str) {
        this.a = g;
        this.b = str;
    }

    private void a() {
        C0968a.i(this.d);
        d0.i(this.e);
    }

    private void g(long j, int i, int i2, long j2) {
        this.e.a(j, i, this.f);
        if (!this.f) {
            this.h.b(i2);
            this.i.b(i2);
            this.j.b(i2);
            if (this.h.c() && this.i.c() && this.j.c()) {
                C0912v i3 = i(this.c, this.h, this.i, this.j, this.b);
                this.d.e(i3);
                ax.q7.n.t(i3.q != -1);
                this.a.f(i3.q);
                this.f = true;
            }
        }
        if (this.k.b(i2)) {
            w wVar = this.k;
            this.o.Z(this.k.d, ax.T0.h.L(wVar.d, wVar.e));
            this.o.c0(5);
            this.a.c(j2, this.o);
        }
        if (this.l.b(i2)) {
            w wVar2 = this.l;
            this.o.Z(this.l.d, ax.T0.h.L(wVar2.d, wVar2.e));
            this.o.c0(5);
            this.a.c(j2, this.o);
        }
    }

    private void h(byte[] bArr, int i, int i2) {
        this.e.e(bArr, i, i2);
        if (!this.f) {
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
            this.j.a(bArr, i, i2);
        }
        this.k.a(bArr, i, i2);
        this.l.a(bArr, i, i2);
    }

    private static C0912v i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i = wVar.e;
        byte[] bArr = new byte[wVar2.e + i + wVar3.e];
        System.arraycopy(wVar.d, 0, bArr, 0, i);
        System.arraycopy(wVar2.d, 0, bArr, wVar.e, wVar2.e);
        System.arraycopy(wVar3.d, 0, bArr, wVar.e + wVar2.e, wVar3.e);
        h.C0193h u = ax.T0.h.u(wVar2.d, 3, wVar2.e, null);
        h.c cVar = u.c;
        return new C0912v.b().j0(str).W(str2).y0("video/hevc").U(cVar != null ? C0976i.h(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f) : null).F0(u.h).h0(u.i).b0(u.j).a0(u.k).V(new C0901j.b().d(u.n).c(u.o).e(u.p).g(u.e + 8).b(u.f + 8).a()).u0(u.l).p0(u.m).q0(u.b + 1).k0(Collections.singletonList(bArr)).P();
    }

    private void j(long j, int i, int i2, long j2) {
        this.e.g(j, i, i2, j2, this.f);
        if (!this.f) {
            this.h.e(i2);
            this.i.e(i2);
            this.j.e(i2);
        }
        this.k.e(i2);
        this.l.e(i2);
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.m = 0L;
        this.n = -9223372036854775807L;
        ax.T0.h.c(this.g);
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.l.d();
        this.a.b();
        a aVar = this.e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) {
        int i;
        a();
        while (g.a() > 0) {
            int g2 = g.g();
            int j = g.j();
            byte[] f = g.f();
            this.m += g.a();
            this.d.g(g, g.a());
            while (g2 < j) {
                int e = ax.T0.h.e(f, g2, j, this.g);
                if (e == j) {
                    h(f, g2, j);
                    return;
                }
                int i2 = ax.T0.h.i(f, e);
                if (e <= 0 || f[e - 1] != 0) {
                    i = 3;
                } else {
                    e--;
                    i = 4;
                }
                int i3 = e;
                int i4 = i3 - g2;
                if (i4 > 0) {
                    h(f, g2, i3);
                }
                int i5 = j - i3;
                long j2 = this.m - i5;
                g(j2, i5, i4 < 0 ? -i4 : 0, this.n);
                j(j2, i5, i2, this.n);
                g2 = i3 + i;
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.c = dVar.b();
        U u = interfaceC2859t.u(dVar.c(), 2);
        this.d = u;
        this.e = new a(u);
        this.a.d(interfaceC2859t, dVar);
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
        a();
        if (z) {
            this.a.e();
            g(this.m, 0, 0, this.n);
            j(this.m, 0, 48, this.n);
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.n = j;
    }
}

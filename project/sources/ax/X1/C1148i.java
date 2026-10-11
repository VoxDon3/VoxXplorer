package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.X1.L;
import ax.q1.C2841a;
import ax.q1.C2855o;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ax.X1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148i implements InterfaceC1152m {
    private static final byte[] x = {73, 68, 51};
    private final boolean a;
    private final ax.S0.F b;
    private final ax.S0.G c;
    private final String d;
    private final int e;
    private final String f;
    private String g;
    private U h;
    private U i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private U v;
    private long w;

    public C1148i(boolean z, String str) {
        this(z, null, 0, str);
    }

    private void a() {
        C0968a.e(this.h);
        d0.i(this.v);
        d0.i(this.i);
    }

    private void g(ax.S0.G g) {
        if (g.a() == 0) {
            return;
        }
        this.b.a[0] = g.f()[g.g()];
        this.b.p(2);
        int h = this.b.h(4);
        int i = this.p;
        if (i != -1 && h != i) {
            q();
            return;
        }
        if (!this.n) {
            this.n = true;
            this.o = this.q;
            this.p = h;
        }
        t();
    }

    private boolean h(ax.S0.G g, int i) {
        g.b0(i + 1);
        if (!w(g, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        int h = this.b.h(1);
        int i2 = this.o;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.p != -1) {
            if (!w(g, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.p) {
                return false;
            }
            g.b0(i + 2);
        }
        if (!w(g, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        int h2 = this.b.h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] f = g.f();
        int j = g.j();
        int i3 = i + h2;
        if (i3 >= j) {
            return true;
        }
        byte b = f[i3];
        if (b == -1) {
            int i4 = i3 + 1;
            if (i4 == j) {
                return true;
            }
            return l((byte) -1, f[i4]) && ((f[i4] & 8) >> 3) == h;
        }
        if (b != 73) {
            return false;
        }
        int i5 = i3 + 1;
        if (i5 == j) {
            return true;
        }
        if (f[i5] != 68) {
            return false;
        }
        int i6 = i3 + 2;
        return i6 == j || f[i6] == 51;
    }

    private boolean i(ax.S0.G g, byte[] bArr, int i) {
        int min = Math.min(g.a(), i - this.k);
        g.q(bArr, this.k, min);
        int i2 = this.k + min;
        this.k = i2;
        return i2 == i;
    }

    private void j(ax.S0.G g) {
        byte[] f = g.f();
        int g2 = g.g();
        int j = g.j();
        while (g2 < j) {
            int i = g2 + 1;
            byte b = f[g2];
            int i2 = b & 255;
            if (this.l == 512 && l((byte) -1, (byte) i2) && (this.n || h(g, g2 - 1))) {
                this.q = (b & 8) >> 3;
                this.m = (b & 1) == 0;
                if (this.n) {
                    t();
                } else {
                    r();
                }
                g.b0(i);
                return;
            }
            int i3 = this.l;
            int i4 = i2 | i3;
            if (i4 == 329) {
                this.l = 768;
            } else if (i4 == 511) {
                this.l = 512;
            } else if (i4 == 836) {
                this.l = 1024;
            } else if (i4 == 1075) {
                u();
                g.b0(i);
                return;
            } else if (i3 != 256) {
                this.l = 256;
            }
            g2 = i;
        }
        g.b0(g2);
    }

    private boolean l(byte b, byte b2) {
        return m(((b & 255) << 8) | (b2 & 255));
    }

    public static boolean m(int i) {
        return (i & 65526) == 65520;
    }

    private void n() throws ax.P0.E {
        this.b.p(0);
        if (this.r) {
            this.b.r(10);
        } else {
            int i = 2;
            int h = this.b.h(2) + 1;
            if (h != 2) {
                C0987u.h("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
            } else {
                i = h;
            }
            this.b.r(5);
            byte[] a = C2841a.a(i, this.p, this.b.h(3));
            C2841a.b e = C2841a.e(a);
            C0912v P = new C0912v.b().j0(this.g).W(this.f).y0("audio/mp4a-latm").U(e.c).T(e.b).z0(e.a).k0(Collections.singletonList(a)).n0(this.d).w0(this.e).P();
            this.s = 1024000000 / P.H;
            this.h.e(P);
            this.r = true;
        }
        this.b.r(4);
        int h2 = this.b.h(13);
        int i2 = h2 - 7;
        if (this.m) {
            i2 = h2 - 9;
        }
        v(this.h, this.s, 0, i2);
    }

    private void o() {
        this.i.g(this.c, 10);
        this.c.b0(6);
        v(this.i, 0L, 10, this.c.L() + 10);
    }

    private void p(ax.S0.G g) {
        int min = Math.min(g.a(), this.t - this.k);
        this.v.g(g, min);
        int i = this.k + min;
        this.k = i;
        if (i == this.t) {
            C0968a.g(this.u != -9223372036854775807L);
            this.v.f(this.u, 1, this.t, 0, null);
            this.u += this.w;
            s();
        }
    }

    private void q() {
        this.n = false;
        s();
    }

    private void r() {
        this.j = 1;
        this.k = 0;
    }

    private void s() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    private void t() {
        this.j = 3;
        this.k = 0;
    }

    private void u() {
        this.j = 2;
        this.k = x.length;
        this.t = 0;
        this.c.b0(0);
    }

    private void v(U u, long j, int i, int i2) {
        this.j = 4;
        this.k = i;
        this.v = u;
        this.w = j;
        this.t = i2;
    }

    private boolean w(ax.S0.G g, byte[] bArr, int i) {
        if (g.a() < i) {
            return false;
        }
        g.q(bArr, 0, i);
        return true;
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.u = -9223372036854775807L;
        q();
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) throws ax.P0.E {
        a();
        while (g.a() > 0) {
            int i = this.j;
            if (i == 0) {
                j(g);
            } else if (i == 1) {
                g(g);
            } else if (i != 2) {
                if (i == 3) {
                    if (i(g, this.b.a, this.m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    p(g);
                }
            } else if (i(g, this.c.f(), 10)) {
                o();
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.g = dVar.b();
        U u = interfaceC2859t.u(dVar.c(), 1);
        this.h = u;
        this.v = u;
        if (!this.a) {
            this.i = new C2855o();
            return;
        }
        dVar.a();
        U u2 = interfaceC2859t.u(dVar.c(), 5);
        this.i = u2;
        u2.e(new C0912v.b().j0(dVar.b()).W(this.f).y0("application/id3").P());
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.u = j;
    }

    public long k() {
        return this.s;
    }

    public C1148i(boolean z, String str, int i, String str2) {
        this.b = new ax.S0.F(new byte[7]);
        this.c = new ax.S0.G(Arrays.copyOf(x, 10));
        this.o = -1;
        this.p = -1;
        this.s = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
        s();
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}

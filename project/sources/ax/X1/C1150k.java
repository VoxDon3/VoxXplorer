package ax.X1;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.X1.L;
import ax.q1.C2856p;
import ax.q1.InterfaceC2859t;
import ax.q1.U;
import ax.u7.C3218f;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.X1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150k implements InterfaceC1152m {
    private final ax.S0.G a;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private U g;
    private int i;
    private int j;
    private long k;
    private C0912v l;
    private int m;
    private int n;
    private int h = 0;
    private long q = -9223372036854775807L;
    private final AtomicInteger b = new AtomicInteger();
    private int o = -1;
    private int p = -1;

    public C1150k(String str, int i, int i2, String str2) {
        this.a = new ax.S0.G(new byte[i2]);
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    private boolean a(ax.S0.G g, byte[] bArr, int i) {
        int min = Math.min(g.a(), i - this.i);
        g.q(bArr, this.i, min);
        int i2 = this.i + min;
        this.i = i2;
        return i2 == i;
    }

    private void g() {
        byte[] f = this.a.f();
        if (this.l == null) {
            C0912v h = C2856p.h(f, this.f, this.c, this.d, this.e, null);
            this.l = h;
            this.g.e(h);
        }
        this.m = C2856p.b(f);
        this.k = C3218f.e(d0.o1(C2856p.g(f), this.l.H));
    }

    private void h() throws ax.P0.E {
        C2856p.b i = C2856p.i(this.a.f());
        k(i);
        this.m = i.d;
        long j = i.e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.k = j;
    }

    private void i() throws ax.P0.E {
        C2856p.b k = C2856p.k(this.a.f(), this.b);
        if (this.n == 3) {
            k(k);
        }
        this.m = k.d;
        long j = k.e;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        this.k = j;
    }

    private boolean j(ax.S0.G g) {
        while (g.a() > 0) {
            int i = this.j << 8;
            this.j = i;
            int M = i | g.M();
            this.j = M;
            int c = C2856p.c(M);
            this.n = c;
            if (c != 0) {
                byte[] f = this.a.f();
                int i2 = this.j;
                f[0] = (byte) ((i2 >> 24) & 255);
                f[1] = (byte) ((i2 >> 16) & 255);
                f[2] = (byte) ((i2 >> 8) & 255);
                f[3] = (byte) (i2 & 255);
                this.i = 4;
                this.j = 0;
                return true;
            }
        }
        return false;
    }

    private void k(C2856p.b bVar) {
        int i;
        int i2 = bVar.b;
        if (i2 == -2147483647 || (i = bVar.c) == -1) {
            return;
        }
        C0912v c0912v = this.l;
        if (c0912v != null && i == c0912v.G && i2 == c0912v.H && Objects.equals(bVar.a, c0912v.o)) {
            return;
        }
        C0912v c0912v2 = this.l;
        C0912v P = (c0912v2 == null ? new C0912v.b() : c0912v2.b()).j0(this.f).W(this.e).y0(bVar.a).T(bVar.c).z0(bVar.b).n0(this.c).w0(this.d).P();
        this.l = P;
        this.g.e(P);
    }

    @Override // ax.X1.InterfaceC1152m
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // ax.X1.InterfaceC1152m
    public void c(ax.S0.G g) throws ax.P0.E {
        C0968a.i(this.g);
        while (g.a() > 0) {
            switch (this.h) {
                case 0:
                    if (!j(g)) {
                        break;
                    } else {
                        int i = this.n;
                        if (i != 3 && i != 4) {
                            if (i != 1) {
                                this.h = 2;
                                break;
                            } else {
                                this.h = 1;
                                break;
                            }
                        } else {
                            this.h = 4;
                            break;
                        }
                    }
                case 1:
                    if (!a(g, this.a.f(), 18)) {
                        break;
                    } else {
                        g();
                        this.a.b0(0);
                        this.g.g(this.a, 18);
                        this.h = 6;
                        break;
                    }
                case 2:
                    if (!a(g, this.a.f(), 7)) {
                        break;
                    } else {
                        this.o = C2856p.j(this.a.f());
                        this.h = 3;
                        break;
                    }
                case 3:
                    if (!a(g, this.a.f(), this.o)) {
                        break;
                    } else {
                        h();
                        this.a.b0(0);
                        this.g.g(this.a, this.o);
                        this.h = 6;
                        break;
                    }
                case 4:
                    if (!a(g, this.a.f(), 6)) {
                        break;
                    } else {
                        int l = C2856p.l(this.a.f());
                        this.p = l;
                        int i2 = this.i;
                        if (i2 > l) {
                            int i3 = i2 - l;
                            this.i = i2 - i3;
                            g.b0(g.g() - i3);
                        }
                        this.h = 5;
                        break;
                    }
                case 5:
                    if (!a(g, this.a.f(), this.p)) {
                        break;
                    } else {
                        i();
                        this.a.b0(0);
                        this.g.g(this.a, this.p);
                        this.h = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(g.a(), this.m - this.i);
                    this.g.g(g, min);
                    int i4 = this.i + min;
                    this.i = i4;
                    if (i4 == this.m) {
                        C0968a.g(this.q != -9223372036854775807L);
                        this.g.f(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // ax.X1.InterfaceC1152m
    public void d(InterfaceC2859t interfaceC2859t, L.d dVar) {
        dVar.a();
        this.f = dVar.b();
        this.g = interfaceC2859t.u(dVar.c(), 1);
    }

    @Override // ax.X1.InterfaceC1152m
    public void f(long j, int i) {
        this.q = j;
    }

    @Override // ax.X1.InterfaceC1152m
    public void e(boolean z) {
    }
}

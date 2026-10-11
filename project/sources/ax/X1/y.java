package ax.X1;

import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.X1.L;
import ax.q1.InterfaceC2859t;

/* loaded from: classes.dex */
public final class y implements L {
    private final InterfaceC1152m a;
    private final ax.S0.F b = new ax.S0.F(new byte[10]);
    private int c = 0;
    private int d;
    private ax.S0.M e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public y(InterfaceC1152m interfaceC1152m) {
        this.a = interfaceC1152m;
    }

    private boolean e(ax.S0.G g, byte[] bArr, int i) {
        int min = Math.min(g.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            g.c0(min);
        } else {
            g.q(bArr, this.d, min);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    private boolean f() {
        this.b.p(0);
        int h = this.b.h(24);
        if (h != 1) {
            C0987u.h("PesReader", "Unexpected start code prefix: " + h);
            this.j = -1;
            return false;
        }
        this.b.r(8);
        int h2 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        int h3 = this.b.h(8);
        this.i = h3;
        if (h2 == 0) {
            this.j = -1;
        } else {
            int i = (h2 - 3) - h3;
            this.j = i;
            if (i < 0) {
                C0987u.h("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            this.b.r(1);
            this.b.r(1);
            long h = (this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                this.b.r(1);
                this.b.r(1);
                this.b.r(1);
                this.e.b((this.b.h(3) << 30) | (this.b.h(15) << 15) | this.b.h(15));
                this.h = true;
            }
            this.l = this.e.b(h);
        }
    }

    private void h(int i) {
        this.c = i;
        this.d = 0;
    }

    @Override // ax.X1.L
    public void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, L.d dVar) {
        this.e = m;
        this.a.d(interfaceC2859t, dVar);
    }

    @Override // ax.X1.L
    public void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    @Override // ax.X1.L
    public void c(ax.S0.G g, int i) throws ax.P0.E {
        C0968a.i(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    C0987u.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        C0987u.h("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    this.a.e(g.j() == 0);
                }
            }
            h(1);
        }
        while (g.a() > 0) {
            int i3 = this.c;
            if (i3 == 0) {
                g.c0(g.a());
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (e(g, this.b.a, Math.min(10, this.i)) && e(g, null, this.i)) {
                        g();
                        i |= this.k ? 4 : 0;
                        this.a.f(this.l, i);
                        h(3);
                    }
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int a = g.a();
                    int i4 = this.j;
                    int i5 = i4 == -1 ? 0 : a - i4;
                    if (i5 > 0) {
                        a -= i5;
                        g.a0(g.g() + a);
                    }
                    this.a.c(g);
                    int i6 = this.j;
                    if (i6 != -1) {
                        int i7 = i6 - a;
                        this.j = i7;
                        if (i7 == 0) {
                            this.a.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(g, this.b.a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    public boolean d(boolean z) {
        return this.c == 3 && this.j == -1 && !(z && (this.a instanceof C1153n)) && (!z || f());
    }
}

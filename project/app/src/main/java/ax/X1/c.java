/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.a;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.b;
import ax.q1.t;

public final class c
implements m {
    private final F a;
    private final G b;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private U g;
    private int h;
    private int i;
    private boolean j;
    private long k;
    private v l;
    private int m;
    private long n;

    public c(String string) {
        this(null, 0, string);
    }

    public c(String string, int n8, String string2) {
        F f8;
        this.a = f8 = new F(new byte[128]);
        this.b = new G(f8.a);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = string;
        this.d = n8;
        this.e = string2;
    }

    private boolean a(G g8, byte[] byArray, int n8) {
        int n9 = Math.min(g8.a(), n8 - this.i);
        g8.q(byArray, this.i, n9);
        this.i = n9 = this.i + n9;
        return n9 == n8;
    }

    private void g() {
        this.a.p(0);
        b.b b8 = ax.q1.b.f(this.a);
        Object object = this.l;
        if (object == null || b8.d != ((v)object).G || b8.c != ((v)object).H || !j.Objects.equals((Object)b8.a, (Object)((v)object).o)) {
            object = new v.b().j0(this.f).W(this.e).y0(b8.a).T(b8.d).z0(b8.c).n0(this.c).w0(this.d).t0(b8.g);
            if ("audio/ac3".equals(b8.a)) {
                ((v.b)object).S(b8.g);
            }
            this.l = object = ((v.b)object).P();
            this.g.e((v)object);
        }
        this.m = b8.e;
        this.k = (long)b8.f * 1000000L / (long)this.l.H;
    }

    private boolean h(G g8) {
        while (true) {
            int n8 = g8.a();
            boolean bl = false;
            boolean bl2 = false;
            if (n8 <= 0) break;
            if (!this.j) {
                if (g8.M() == 11) {
                    bl2 = true;
                }
                this.j = bl2;
                continue;
            }
            n8 = g8.M();
            if (n8 == 119) {
                this.j = false;
                return true;
            }
            bl2 = bl;
            if (n8 == 11) {
                bl2 = true;
            }
            this.j = bl2;
        }
        return false;
    }

    @Override
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override
    public void c(G g8) {
        ax.S0.a.i(this.g);
        while (g8.a() > 0) {
            int n8 = this.h;
            boolean bl = true;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) continue;
                    n8 = Math.min(g8.a(), this.m - this.i);
                    this.g.g(g8, n8);
                    this.i = n8 = this.i + n8;
                    if (n8 != this.m) continue;
                    if (this.n == -9223372036854775807L) {
                        bl = false;
                    }
                    ax.S0.a.g(bl);
                    this.g.f(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                    continue;
                }
                if (!this.a(g8, this.b.f(), 128)) continue;
                this.g();
                this.b.b0(0);
                this.g.g(this.b, 128);
                this.h = 2;
                continue;
            }
            if (!this.h(g8)) continue;
            this.h = 1;
            this.b.f()[0] = 11;
            this.b.f()[1] = 119;
            this.i = 2;
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        d8.a();
        this.f = d8.b();
        this.g = t8.u(d8.c(), 1);
    }

    @Override
    public void e(boolean bl) {
    }

    @Override
    public void f(long l8, int n8) {
        this.n = l8;
    }
}


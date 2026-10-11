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
import ax.q1.c;
import ax.q1.t;

public final class f
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
    private boolean k;
    private long l;
    private v m;
    private int n;
    private long o;

    public f(String string) {
        this(null, 0, string);
    }

    public f(String string, int n8, String string2) {
        F f8;
        this.a = f8 = new F(new byte[16]);
        this.b = new G(f8.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.o = -9223372036854775807L;
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
        c.c c8 = ax.q1.c.g(this.a);
        v v8 = this.m;
        if (v8 == null || c8.c != v8.G || c8.b != v8.H || !"audio/ac4".equals(v8.o)) {
            this.m = v8 = new v.b().j0(this.f).W(this.e).y0("audio/ac4").T(c8.c).z0(c8.b).n0(this.c).w0(this.d).P();
            this.g.e(v8);
        }
        this.n = c8.d;
        this.l = (long)c8.e * 1000000L / (long)this.m.H;
    }

    private boolean h(G g8) {
        block4: {
            boolean bl;
            boolean bl2;
            int n8;
            while (true) {
                n8 = g8.a();
                bl2 = false;
                bl = false;
                if (n8 <= 0) break block4;
                if (!this.j) {
                    if (g8.M() == 172) {
                        bl = true;
                    }
                    this.j = bl;
                    continue;
                }
                n8 = g8.M();
                bl = n8 == 172;
                this.j = bl;
                if (n8 == 64 || n8 == 65) break;
            }
            bl = bl2;
            if (n8 == 65) {
                bl = true;
            }
            this.k = bl;
            return true;
        }
        return false;
    }

    @Override
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.o = -9223372036854775807L;
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
                    n8 = Math.min(g8.a(), this.n - this.i);
                    this.g.g(g8, n8);
                    this.i = n8 = this.i + n8;
                    if (n8 != this.n) continue;
                    if (this.o == -9223372036854775807L) {
                        bl = false;
                    }
                    ax.S0.a.g(bl);
                    this.g.f(this.o, 1, this.n, 0, null);
                    this.o += this.l;
                    this.h = 0;
                    continue;
                }
                if (!this.a(g8, this.b.f(), 16)) continue;
                this.g();
                this.b.b0(0);
                this.g.g(this.b, 16);
                this.h = 2;
                continue;
            }
            if (!this.h(g8)) continue;
            this.h = 1;
            this.b.f()[0] = -84;
            byte[] byArray = this.b.f();
            n8 = this.k ? 65 : 64;
            byArray[1] = (byte)n8;
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
        this.o = l8;
    }
}


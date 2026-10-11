/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.X1.L;
import ax.X1.m;
import ax.X1.v;
import ax.q1.U;
import ax.q1.t;
import ax.r7.z;

public final class u
implements m {
    private final String a;
    private final G b;
    private final F c;
    private final G d;
    private int e;
    private String f;
    private U g;
    private double h;
    private double i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private v.b q;
    private int r;
    private int s;
    private int t;
    private long u;
    private boolean v;

    public u(String string) {
        this.a = string;
        this.e = 0;
        this.b = new G(new byte[15], 2);
        this.c = new F();
        this.d = new G();
        this.q = new v.b();
        this.r = -2147483647;
        this.s = -1;
        this.u = -1L;
        this.k = true;
        this.n = true;
        this.h = -9.223372036854776E18;
        this.i = -9.223372036854776E18;
    }

    private void a(G g8, G g9, boolean bl) {
        int n8 = g8.g();
        int n9 = Math.min(g8.a(), g9.a());
        g8.q(g9.f(), g9.g(), n9);
        g9.c0(n9);
        if (bl) {
            g8.b0(n8);
        }
    }

    private void g() {
        int n8;
        if (this.v) {
            this.k = false;
            n8 = 1;
        } else {
            n8 = 0;
        }
        double d8 = (double)(this.s - this.t) * 1000000.0 / (double)this.r;
        long l8 = Math.round(this.h);
        if (this.j) {
            this.j = false;
            this.h = this.i;
        } else {
            this.h += d8;
        }
        this.g.f(l8, n8, this.p, 0, null);
        this.v = false;
        this.t = 0;
        this.p = 0;
    }

    private void h(F object) throws E {
        z<Object> z8 = ax.X1.v.h((F)object);
        this.r = ((v.c)((Object)z8)).b;
        this.s = ((v.c)((Object)z8)).c;
        long l8 = this.u;
        long l9 = this.q.b;
        if (l8 != l9) {
            this.u = l9;
            int n8 = ((v.c)((Object)z8)).a;
            object = "mhm1";
            if (n8 != -1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("mhm1");
                ((StringBuilder)object).append(String.format(".%02X", ((v.c)((Object)z8)).a));
                object = ((StringBuilder)object).toString();
            }
            z8 = (z8 = (z<Object>)((v.c)((Object)z8)).d) != null && ((Object)z8).length > 0 ? z.B(d0.f, z8) : null;
            object = new v.b().j0(this.f).W(this.a).y0("audio/mhm1").z0(this.r).U((String)object).k0(z8).P();
            this.g.e((ax.P0.v)object);
        }
        this.v = true;
    }

    private boolean i() throws E {
        int n8 = this.b.j();
        this.c.o(this.b.f(), n8);
        boolean bl = ax.X1.v.g(this.c, this.q);
        if (bl) {
            this.o = 0;
            this.p += this.q.c + n8;
        }
        return bl;
    }

    private boolean j(int n8) {
        return n8 == 1 || n8 == 17;
        {
        }
    }

    private boolean k(G g8) {
        int n8 = this.l;
        if ((n8 & 2) == 0) {
            g8.b0(g8.j());
            return false;
        }
        if ((n8 & 4) == 0) {
            while (g8.a() > 0) {
                this.m = n8 = this.m << 8;
                this.m = n8 |= g8.M();
                if (!ax.X1.v.e(n8)) continue;
                g8.b0(g8.g() - 3);
                this.m = 0;
                return true;
            }
            return false;
        }
        return true;
    }

    private void l(G g8) {
        int n8 = Math.min(g8.a(), this.q.c - this.o);
        this.g.g(g8, n8);
        this.o += n8;
    }

    @Override
    public void b() {
        this.e = 0;
        this.m = 0;
        this.b.X(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18;
        this.i = -9.223372036854776E18;
    }

    @Override
    public void c(G g8) throws E {
        ax.S0.a.i(this.g);
        while (g8.a() > 0) {
            int n8 = this.e;
            if (n8 != 0) {
                Object object;
                if (n8 != 1) {
                    if (n8 == 2) {
                        if (this.j(this.q.a)) {
                            this.a(g8, this.d, true);
                        }
                        this.l(g8);
                        n8 = this.o;
                        object = this.q;
                        if (n8 != ((v.b)object).c) continue;
                        n8 = ((v.b)object).a;
                        if (n8 == 1) {
                            this.h(new F(this.d.f()));
                        } else if (n8 == 17) {
                            this.t = ax.X1.v.f(new F(this.d.f()));
                        } else if (n8 == 2) {
                            this.g();
                        }
                        this.e = 1;
                        continue;
                    }
                    throw new IllegalStateException();
                }
                this.a(g8, this.b, false);
                if (this.b.a() == 0) {
                    if (this.i()) {
                        this.b.b0(0);
                        object = this.g;
                        G g9 = this.b;
                        object.g(g9, g9.j());
                        this.b.X(2);
                        this.d.X(this.q.c);
                        this.n = true;
                        this.e = 2;
                        continue;
                    }
                    if (this.b.j() >= 15) continue;
                    object = this.b;
                    ((G)object).a0(((G)object).j() + 1);
                    this.n = false;
                    continue;
                }
                this.n = false;
                continue;
            }
            if (!this.k(g8)) continue;
            this.e = 1;
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
        this.l = n8;
        if (!(this.k || this.p == 0 && this.n)) {
            this.j = true;
        }
        if (l8 != -9223372036854775807L) {
            if (this.j) {
                this.i = l8;
                return;
            }
            this.h = l8;
        }
    }
}


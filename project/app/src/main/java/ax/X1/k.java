/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.p;
import ax.q1.t;
import ax.u7.f;
import java.util.concurrent.atomic.AtomicInteger;

public final class k
implements m {
    private final G a;
    private final AtomicInteger b;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private U g;
    private int h;
    private int i;
    private int j;
    private long k;
    private v l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long q;

    public k(String string, int n8, int n9, String string2) {
        this.a = new G(new byte[n9]);
        this.h = 0;
        this.q = -9223372036854775807L;
        this.b = new AtomicInteger();
        this.o = -1;
        this.p = -1;
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
        byte[] byArray = this.a.f();
        if (this.l == null) {
            v v8;
            this.l = v8 = ax.q1.p.h(byArray, this.f, this.c, this.d, this.e, null);
            this.g.e(v8);
        }
        this.m = ax.q1.p.b(byArray);
        this.k = ax.u7.f.e(d0.o1(ax.q1.p.g(byArray), this.l.H));
    }

    private void h() throws E {
        long l8;
        p.b b8 = ax.q1.p.i(this.a.f());
        this.k(b8);
        this.m = b8.d;
        long l9 = l8 = b8.e;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        this.k = l9;
    }

    private void i() throws E {
        long l8;
        p.b b8 = ax.q1.p.k(this.a.f(), this.b);
        if (this.n == 3) {
            this.k(b8);
        }
        this.m = b8.d;
        long l9 = l8 = b8.e;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        this.k = l9;
    }

    private boolean j(G object) {
        while (((G)object).a() > 0) {
            int n8;
            this.j = n8 = this.j << 8;
            this.j = n8 |= ((G)object).M();
            this.n = n8 = ax.q1.p.c(n8);
            if (n8 == 0) continue;
            object = this.a.f();
            n8 = this.j;
            object[0] = (byte)(n8 >> 24 & 0xFF);
            object[1] = (byte)(n8 >> 16 & 0xFF);
            object[2] = (byte)(n8 >> 8 & 0xFF);
            object[3] = (byte)(n8 & 0xFF);
            this.i = 4;
            this.j = 0;
            return true;
        }
        return false;
    }

    private void k(p.b object) {
        Object object2;
        int n8;
        int n9 = ((p.b)object).b;
        if (!(n9 == -2147483647 || (n8 = ((p.b)object).c) == -1 || (object2 = this.l) != null && n8 == ((v)object2).G && n9 == ((v)object2).H && j.Objects.equals((Object)((p.b)object).a, (Object)((v)object2).o))) {
            object2 = this.l;
            object2 = object2 == null ? new v.b() : ((v)object2).b();
            this.l = object = ((v.b)object2).j0(this.f).W(this.e).y0(((p.b)object).a).T(((p.b)object).c).z0(((p.b)object).b).n0(this.c).w0(this.d).P();
            this.g.e((v)object);
        }
    }

    @Override
    public void b() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override
    public void c(G g8) throws E {
        ax.S0.a.i(this.g);
        block9: while (g8.a() > 0) {
            int n8;
            switch (this.h) {
                default: {
                    throw new IllegalStateException();
                }
                case 6: {
                    n8 = Math.min(g8.a(), this.m - this.i);
                    this.g.g(g8, n8);
                    this.i = n8 = this.i + n8;
                    if (n8 != this.m) continue block9;
                    boolean bl = this.q != -9223372036854775807L;
                    ax.S0.a.g(bl);
                    U u8 = this.g;
                    long l8 = this.q;
                    n8 = this.n == 4 ? 0 : 1;
                    u8.f(l8, n8, this.m, 0, null);
                    this.q += this.k;
                    this.h = 0;
                    continue block9;
                }
                case 5: {
                    if (!this.a(g8, this.a.f(), this.p)) continue block9;
                    this.i();
                    this.a.b0(0);
                    this.g.g(this.a, this.p);
                    this.h = 6;
                    continue block9;
                }
                case 4: {
                    int n9;
                    if (!this.a(g8, this.a.f(), 6)) continue block9;
                    this.p = n9 = ax.q1.p.l(this.a.f());
                    n8 = this.i;
                    if (n8 > n9) {
                        n9 = n8 - n9;
                        this.i = n8 - n9;
                        g8.b0(g8.g() - n9);
                    }
                    this.h = 5;
                    continue block9;
                }
                case 3: {
                    if (!this.a(g8, this.a.f(), this.o)) continue block9;
                    this.h();
                    this.a.b0(0);
                    this.g.g(this.a, this.o);
                    this.h = 6;
                    continue block9;
                }
                case 2: {
                    if (!this.a(g8, this.a.f(), 7)) continue block9;
                    this.o = ax.q1.p.j(this.a.f());
                    this.h = 3;
                    continue block9;
                }
                case 1: {
                    if (!this.a(g8, this.a.f(), 18)) continue block9;
                    this.g();
                    this.a.b0(0);
                    this.g.g(this.a, 18);
                    this.h = 6;
                    continue block9;
                }
                case 0: 
            }
            if (!this.j(g8)) continue;
            n8 = this.n;
            if (n8 != 3 && n8 != 4) {
                if (n8 == 1) {
                    this.h = 1;
                    continue;
                }
                this.h = 2;
                continue;
            }
            this.h = 4;
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
        this.q = l8;
    }
}


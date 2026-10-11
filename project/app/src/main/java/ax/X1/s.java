/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.E;
import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.a;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.a;
import ax.q1.t;
import java.util.Collections;

public final class s
implements m {
    private final String a;
    private final int b;
    private final String c;
    private final G d;
    private final F e;
    private U f;
    private String g;
    private v h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private String w;

    public s(String object, int n8, String string) {
        this.a = object;
        this.b = n8;
        this.c = string;
        this.d = object = new G(1024);
        this.e = new F(((G)object).f());
        this.m = -9223372036854775807L;
    }

    private static long a(F f8) {
        return f8.h((f8.h(2) + 1) * 8);
    }

    private void g(F f8) throws E {
        block7: {
            block8: {
                block6: {
                    block5: {
                        block4: {
                            if (f8.g()) break block4;
                            this.n = true;
                            this.l(f8);
                            break block5;
                        }
                        if (!this.n) break block6;
                    }
                    if (this.o != 0) break block7;
                    if (this.p != 0) break block8;
                    this.k(f8, this.j(f8));
                    if (this.r) {
                        f8.r((int)this.s);
                    }
                }
                return;
            }
            throw E.a(null, null);
        }
        throw E.a(null, null);
    }

    private int h(F f8) throws E {
        int n8 = f8.b();
        a.b b8 = ax.q1.a.d(f8, true);
        this.w = b8.c;
        this.t = b8.a;
        this.v = b8.b;
        return n8 - f8.b();
    }

    private void i(F f8) {
        int n8;
        this.q = n8 = f8.h(3);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    if (n8 != 6 && n8 != 7) {
                        throw new IllegalStateException();
                    }
                    f8.r(1);
                    return;
                }
                f8.r(6);
                return;
            }
            f8.r(9);
            return;
        }
        f8.r(8);
    }

    private int j(F f8) throws E {
        if (this.q == 0) {
            int n8;
            int n9;
            int n10 = 0;
            do {
                n9 = f8.h(8);
                n10 = n8 = n10 + n9;
            } while (n9 == 255);
            return n8;
        }
        throw E.a(null, null);
    }

    private void k(F f8, int n8) {
        int n9 = f8.e();
        boolean bl = false;
        if ((n9 & 7) == 0) {
            this.d.b0(n9 >> 3);
        } else {
            f8.i(this.d.f(), 0, n8 * 8);
            this.d.b0(0);
        }
        this.f.g(this.d, n8);
        if (this.m != -9223372036854775807L) {
            bl = true;
        }
        ax.S0.a.g(bl);
        this.f.f(this.m, 1, n8, 0, null);
        this.m += this.u;
    }

    private void l(F f8) throws E {
        int n8 = f8.h(1);
        int n9 = n8 == 1 ? f8.h(1) : 0;
        this.o = n9;
        if (n9 == 0) {
            if (n8 == 1) {
                ax.X1.s.a(f8);
            }
            if (f8.g()) {
                this.p = f8.h(6);
                int n10 = f8.h(4);
                n9 = f8.h(3);
                if (n10 == 0 && n9 == 0) {
                    boolean bl;
                    if (n8 == 0) {
                        n10 = f8.e();
                        n9 = this.h(f8);
                        f8.p(n10);
                        Object object = new byte[(n9 + 7) / 8];
                        f8.i((byte[])object, 0, n9);
                        object = new v.b().j0(this.g).W(this.c).y0("audio/mp4a-latm").U(this.w).T(this.v).z0(this.t).k0(Collections.singletonList(object)).n0(this.a).w0(this.b).P();
                        if (!((v)object).equals(this.h)) {
                            this.h = object;
                            this.u = 1024000000L / (long)((v)object).H;
                            this.f.e((v)object);
                        }
                    } else {
                        f8.r((int)ax.X1.s.a(f8) - this.h(f8));
                    }
                    this.i(f8);
                    this.r = bl = f8.g();
                    this.s = 0L;
                    if (bl) {
                        if (n8 == 1) {
                            this.s = ax.X1.s.a(f8);
                        } else {
                            do {
                                bl = f8.g();
                                this.s = (this.s << 8) + (long)f8.h(8);
                            } while (bl);
                        }
                    }
                    if (f8.g()) {
                        f8.r(8);
                    }
                    return;
                }
                throw E.a(null, null);
            }
            throw E.a(null, null);
        }
        throw E.a(null, null);
    }

    private void m(int n8) {
        this.d.X(n8);
        this.e.n(this.d.f());
    }

    @Override
    public void b() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override
    public void c(G g8) throws E {
        ax.S0.a.i(this.f);
        while (g8.a() > 0) {
            int n8 = this.i;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 == 3) {
                            n8 = Math.min(g8.a(), this.k - this.j);
                            g8.q(this.e.a, this.j, n8);
                            this.j = n8 = this.j + n8;
                            if (n8 != this.k) continue;
                            this.e.p(0);
                            this.g(this.e);
                            this.i = 0;
                            continue;
                        }
                        throw new IllegalStateException();
                    }
                    this.k = n8 = (this.l & 0xFFFFFF1F) << 8 | g8.M();
                    if (n8 > this.d.f().length) {
                        this.m(this.k);
                    }
                    this.j = 0;
                    this.i = 3;
                    continue;
                }
                n8 = g8.M();
                if ((n8 & 0xE0) == 224) {
                    this.l = n8;
                    this.i = 2;
                    continue;
                }
                if (n8 == 86) continue;
                this.i = 0;
                continue;
            }
            if (g8.M() != 86) continue;
            this.i = 1;
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        d8.a();
        this.f = t8.u(d8.c(), 1);
        this.g = d8.b();
    }

    @Override
    public void e(boolean bl) {
    }

    @Override
    public void f(long l8, int n8) {
        this.m = l8;
    }
}


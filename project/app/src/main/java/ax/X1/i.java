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
import ax.S0.u;
import ax.X1.L;
import ax.X1.m;
import ax.q1.U;
import ax.q1.a;
import ax.q1.o;
import ax.q1.t;
import java.util.Arrays;
import java.util.Collections;

public final class i
implements m {
    private static final byte[] x = new byte[]{73, 68, 51};
    private final boolean a;
    private final F b = new F(new byte[7]);
    private final G c = new G(Arrays.copyOf(x, 10));
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
    private int o = -1;
    private int p = -1;
    private int q;
    private boolean r;
    private long s = -9223372036854775807L;
    private int t;
    private long u = -9223372036854775807L;
    private U v;
    private long w;

    public i(boolean bl, String string) {
        this(bl, null, 0, string);
    }

    public i(boolean bl, String string, int n8, String string2) {
        this.a = bl;
        this.d = string;
        this.e = n8;
        this.f = string2;
        this.s();
    }

    private void a() {
        ax.S0.a.e(this.h);
        d0.i(this.v);
        d0.i(this.i);
    }

    private void g(G g8) {
        if (g8.a() == 0) {
            return;
        }
        this.b.a[0] = g8.f()[g8.g()];
        this.b.p(2);
        int n8 = this.b.h(4);
        int n9 = this.p;
        if (n9 != -1 && n8 != n9) {
            this.q();
            return;
        }
        if (!this.n) {
            this.n = true;
            this.o = this.q;
            this.p = n8;
        }
        this.t();
    }

    private boolean h(G g8, int n8) {
        g8.b0(n8 + 1);
        if (!this.w(g8, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        int n9 = this.b.h(1);
        int n10 = this.o;
        if (n10 != -1 && n9 != n10) {
            return false;
        }
        if (this.p != -1) {
            if (!this.w(g8, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.p) {
                return false;
            }
            g8.b0(n8 + 2);
        }
        if (!this.w(g8, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        int n11 = this.b.h(13);
        if (n11 < 7) {
            return false;
        }
        byte[] byArray = g8.f();
        n10 = g8.j();
        if ((n8 += n11) >= n10) {
            return true;
        }
        n11 = byArray[n8];
        if (n11 == -1) {
            if (++n8 == n10) {
                return true;
            }
            return this.l((byte)-1, byArray[n8]) && (byArray[n8] & 8) >> 3 == n9;
        }
        if (n11 != 73) {
            return false;
        }
        n9 = n8 + 1;
        if (n9 == n10) {
            return true;
        }
        if (byArray[n9] != 68) {
            return false;
        }
        if ((n8 += 2) == n10) {
            return true;
        }
        return byArray[n8] == 51;
    }

    private boolean i(G g8, byte[] byArray, int n8) {
        int n9 = Math.min(g8.a(), n8 - this.k);
        g8.q(byArray, this.k, n9);
        this.k = n9 = this.k + n9;
        return n9 == n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void j(G g8) {
        byte[] byArray = g8.f();
        int n8 = g8.g();
        int n9 = g8.j();
        while (true) {
            int n10;
            block12: {
                block13: {
                    if (n8 >= n9) {
                        g8.b0(n8);
                        return;
                    }
                    n10 = n8 + 1;
                    int n11 = byArray[n8];
                    int n12 = n11 & 0xFF;
                    if (this.l == 512 && this.l((byte)-1, (byte)n12) && (this.n || this.h(g8, n8 - 1))) {
                        this.q = (n11 & 8) >> 3;
                        boolean bl = true;
                        if ((n11 & 1) != 0) {
                            bl = false;
                        }
                        this.m = bl;
                        if (!this.n) {
                            this.r();
                        } else {
                            this.t();
                        }
                        g8.b0(n10);
                        return;
                    }
                    n11 = this.l;
                    if ((n12 |= n11) == 329) break block13;
                    if (n12 != 511) {
                        if (n12 != 836) {
                            if (n12 == 1075) {
                                this.u();
                                g8.b0(n10);
                                return;
                            }
                            if (n11 != 256) {
                                this.l = 256;
                                continue;
                            }
                            break block12;
                        } else {
                            this.l = 1024;
                        }
                        break block12;
                    } else {
                        this.l = 512;
                    }
                    break block12;
                }
                this.l = 768;
            }
            n8 = n10;
        }
    }

    private boolean l(byte by, byte by2) {
        return ax.X1.i.m((by & 0xFF) << 8 | by2 & 0xFF);
    }

    public static boolean m(int n8) {
        return (n8 & 0xFFF6) == 65520;
    }

    private void n() throws E {
        int n8;
        int n9;
        this.b.p(0);
        if (!this.r) {
            Object object = this.b;
            n9 = 2;
            n8 = ((F)object).h(2) + 1;
            if (n8 != 2) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Detected audio object type: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(", but assuming AAC LC.");
                ax.S0.u.h("AdtsReader", ((StringBuilder)object).toString());
            } else {
                n9 = n8;
            }
            this.b.r(5);
            n8 = this.b.h(3);
            object = ax.q1.a.a(n9, this.p, n8);
            a.b b8 = ax.q1.a.e((byte[])object);
            object = new v.b().j0(this.g).W(this.f).y0("audio/mp4a-latm").U(b8.c).T(b8.b).z0(b8.a).k0(Collections.singletonList(object)).n0(this.d).w0(this.e).P();
            this.s = 1024000000L / (long)((v)object).H;
            this.h.e((v)object);
            this.r = true;
        } else {
            this.b.r(10);
        }
        this.b.r(4);
        n8 = this.b.h(13);
        n9 = n8 - 7;
        if (this.m) {
            n9 = n8 - 9;
        }
        this.v(this.h, this.s, 0, n9);
    }

    private void o() {
        this.i.g(this.c, 10);
        this.c.b0(6);
        this.v(this.i, 0L, 10, this.c.L() + 10);
    }

    private void p(G g8) {
        int n8 = Math.min(g8.a(), this.t - this.k);
        this.v.g(g8, n8);
        this.k = n8 = this.k + n8;
        if (n8 == this.t) {
            boolean bl = this.u != -9223372036854775807L;
            ax.S0.a.g(bl);
            this.v.f(this.u, 1, this.t, 0, null);
            this.u += this.w;
            this.s();
        }
    }

    private void q() {
        this.n = false;
        this.s();
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

    private void v(U u8, long l8, int n8, int n9) {
        this.j = 4;
        this.k = n8;
        this.v = u8;
        this.w = l8;
        this.t = n9;
    }

    private boolean w(G g8, byte[] byArray, int n8) {
        if (g8.a() < n8) {
            return false;
        }
        g8.q(byArray, 0, n8);
        return true;
    }

    @Override
    public void b() {
        this.u = -9223372036854775807L;
        this.q();
    }

    @Override
    public void c(G g8) throws E {
        this.a();
        while (g8.a() > 0) {
            int n8 = this.j;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 == 4) {
                                this.p(g8);
                                continue;
                            }
                            throw new IllegalStateException();
                        }
                        n8 = this.m ? 7 : 5;
                        if (!this.i(g8, this.b.a, n8)) continue;
                        this.n();
                        continue;
                    }
                    if (!this.i(g8, this.c.f(), 10)) continue;
                    this.o();
                    continue;
                }
                this.g(g8);
                continue;
            }
            this.j(g8);
        }
    }

    @Override
    public void d(t object, L.d d8) {
        U u8;
        d8.a();
        this.g = d8.b();
        this.h = u8 = object.u(d8.c(), 1);
        this.v = u8;
        if (this.a) {
            d8.a();
            this.i = object = object.u(d8.c(), 5);
            object.e(new v.b().j0(d8.b()).W(this.f).y0("application/id3").P());
            return;
        }
        this.i = new o();
    }

    @Override
    public void e(boolean bl) {
    }

    @Override
    public void f(long l8, int n8) {
        this.u = l8;
    }

    public long k() {
        return this.s;
    }
}


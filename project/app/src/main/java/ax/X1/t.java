/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.X1.L;
import ax.X1.m;
import ax.q1.J;
import ax.q1.U;

public final class t
implements m {
    private final G a;
    private final J.a b;
    private final String c;
    private final int d;
    private final String e;
    private U f;
    private String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public t(String string) {
        this(null, 0, string);
    }

    public t(String string, int n8, String string2) {
        G g8;
        this.a = g8 = new G(4);
        g8.f()[0] = -1;
        this.b = new J.a();
        this.n = -9223372036854775807L;
        this.c = string;
        this.d = n8;
        this.e = string2;
    }

    private void a(G g8) {
        byte[] byArray = g8.f();
        int n8 = g8.j();
        for (int i8 = g8.g(); i8 < n8; ++i8) {
            byte by = byArray[i8];
            boolean bl = (by & 0xFF) == 255;
            by = this.k && (by & 0xE0) == 224 ? (byte)1 : 0;
            this.k = bl;
            if (by == 0) continue;
            g8.b0(i8 + 1);
            this.k = false;
            this.a.f()[1] = byArray[i8];
            this.i = 2;
            this.h = 1;
            return;
        }
        g8.b0(n8);
    }

    private void g(G g8) {
        int n8 = Math.min(g8.a(), this.m - this.i);
        this.f.g(g8, n8);
        this.i = n8 = this.i + n8;
        if (n8 < this.m) {
            return;
        }
        boolean bl = this.n != -9223372036854775807L;
        ax.S0.a.g(bl);
        this.f.f(this.n, 1, this.m, 0, null);
        this.n += this.l;
        this.i = 0;
        this.h = 0;
    }

    private void h(G object) {
        int n8 = Math.min(((G)object).a(), 4 - this.i);
        ((G)object).q(this.a.f(), this.i, n8);
        this.i = n8 = this.i + n8;
        if (n8 < 4) {
            return;
        }
        this.a.b0(0);
        if (!this.b.a(this.a.v())) {
            this.i = 0;
            this.h = 1;
            return;
        }
        object = this.b;
        this.m = ((J.a)object).c;
        if (!this.j) {
            this.l = (long)((J.a)object).g * 1000000L / (long)((J.a)object).d;
            object = new v.b().j0(this.g).W(this.e).y0(this.b.b).o0(4096).T(this.b.e).z0(this.b.d).n0(this.c).w0(this.d).P();
            this.f.e((v)object);
            this.j = true;
        }
        this.a.b0(0);
        this.f.g(this.a, 4);
        this.h = 2;
    }

    @Override
    public void b() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override
    public void c(G g8) {
        ax.S0.a.i(this.f);
        while (g8.a() > 0) {
            int n8 = this.h;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        this.g(g8);
                        continue;
                    }
                    throw new IllegalStateException();
                }
                this.h(g8);
                continue;
            }
            this.a(g8);
        }
    }

    @Override
    public void d(ax.q1.t t8, L.d d8) {
        d8.a();
        this.g = d8.b();
        this.f = t8.u(d8.c(), 1);
    }

    @Override
    public void e(boolean bl) {
    }

    @Override
    public void f(long l8, int n8) {
        this.n = l8;
    }
}


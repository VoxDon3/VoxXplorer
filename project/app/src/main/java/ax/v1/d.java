/*
 * Decompiled with CFR 0.152.
 */
package ax.v1;

import ax.P0.C;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.q1.A;
import ax.q1.B;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.e;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import ax.q1.y;
import ax.q1.z;
import ax.v1.b;
import ax.v1.c;
import java.io.IOException;
import java.util.List;

public final class d
implements r {
    public static final x o = new c();
    private final byte[] a = new byte[42];
    private final G b = new G(new byte[32768], 0);
    private final boolean c;
    private final y.a d;
    private t e;
    private U f;
    private int g;
    private C h;
    private B i;
    private int j;
    private int k;
    private b l;
    private int m;
    private long n;

    public d() {
        this(0);
    }

    public d(int n8) {
        boolean bl = true;
        if ((n8 & 1) == 0) {
            bl = false;
        }
        this.c = bl;
        this.d = new y.a();
        this.g = 0;
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new d()};
    }

    private long h(G g8, boolean bl) {
        int n8;
        ax.S0.a.e(this.i);
        for (n8 = g8.g(); n8 <= g8.j() - 16; ++n8) {
            g8.b0(n8);
            if (!y.d(g8, this.i, this.k, this.d)) continue;
            g8.b0(n8);
            return this.d.a;
        }
        if (bl) {
            while (n8 <= g8.j() - this.j) {
                g8.b0(n8);
                boolean bl2 = false;
                try {
                    bl = y.d(g8, this.i, this.k, this.d);
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    bl = false;
                }
                if (g8.g() > g8.j()) {
                    bl = bl2;
                }
                if (bl) {
                    g8.b0(n8);
                    return this.d.a;
                }
                ++n8;
            }
            g8.b0(g8.j());
        } else {
            g8.b0(n8);
        }
        return -1L;
    }

    private void i(s s8) throws IOException {
        this.k = z.b(s8);
        d0.i(this.e).h(this.j(s8.getPosition(), s8.getLength()));
        this.g = 5;
    }

    private N j(long l8, long l9) {
        ax.S0.a.e(this.i);
        Object object = this.i;
        B.a a8 = ((B)object).k;
        if (a8 != null && a8.a.length > 0) {
            return new A((B)object, l8);
        }
        if (l9 != -1L && ((B)object).j > 0L) {
            this.l = object = new b((B)object, this.k, l8, l9);
            return ((e)object).b();
        }
        return new N.b(((B)object).f());
    }

    private void l(s s8) throws IOException {
        byte[] byArray = this.a;
        s8.p(byArray, 0, byArray.length);
        s8.m();
        this.g = 2;
    }

    private void m() {
        long l8 = this.n * 1000000L / (long)d0.i(this.i).e;
        d0.i(this.f).f(l8, 1, this.m, 0, null);
    }

    private int n(s object, M m8) throws IOException {
        boolean bl;
        int n8;
        ax.S0.a.e(this.f);
        ax.S0.a.e(this.i);
        b b8 = this.l;
        if (b8 != null && b8.d()) {
            return this.l.c((s)object, m8);
        }
        if (this.n == -1L) {
            this.n = y.i((s)object, this.i);
            return 0;
        }
        int n9 = this.b.j();
        if (n9 < 32768) {
            n8 = object.c(this.b.f(), n9, 32768 - n9);
            bl = n8 == -1;
            if (!bl) {
                this.b.a0(n9 + n8);
            } else if (this.b.a() == 0) {
                this.m();
                return -1;
            }
        } else {
            bl = false;
        }
        n9 = this.b.g();
        int n10 = this.m;
        n8 = this.j;
        if (n10 < n8) {
            object = this.b;
            ((G)object).c0(Math.min(n8 - n10, ((G)object).a()));
        }
        long l8 = this.h(this.b, bl);
        n8 = this.b.g() - n9;
        this.b.b0(n9);
        this.f.g(this.b, n8);
        this.m += n8;
        if (l8 != -1L) {
            this.m();
            this.m = 0;
            this.n = l8;
        }
        n9 = this.b.f().length;
        n8 = this.b.j();
        if (this.b.a() < 16 && n9 - n8 < 16) {
            n9 = this.b.a();
            System.arraycopy(this.b.f(), this.b.g(), this.b.f(), 0, n9);
            this.b.b0(0);
            this.b.a0(n9);
        }
        return 0;
    }

    private void o(s s8) throws IOException {
        this.h = z.d(s8, this.c ^ true);
        this.g = 1;
    }

    private void p(s object) throws IOException {
        z.a a8 = new z.a(this.i);
        boolean bl = false;
        while (!bl) {
            bl = z.e((s)object, a8);
            this.i = d0.i(a8.a);
        }
        ax.S0.a.e(this.i);
        this.j = Math.max(this.i.c, 6);
        object = this.i.g(this.a, this.h);
        d0.i(this.f).e(((v)object).b().W("audio/flac").P());
        d0.i(this.f).d(this.i.f());
        this.g = 4;
    }

    private void q(s s8) throws IOException {
        z.i(s8);
        this.g = 3;
    }

    @Override
    public void a(t t8) {
        this.e = t8;
        this.f = t8.u(0, 1);
        t8.o();
    }

    @Override
    public void b(long l8, long l9) {
        long l10 = 0L;
        if (l8 == 0L) {
            this.g = 0;
        } else {
            b b8 = this.l;
            if (b8 != null) {
                b8.h(l9);
            }
        }
        l8 = l9 == 0L ? l10 : -1L;
        this.n = l8;
        this.m = 0;
        this.b.X(0);
    }

    @Override
    public boolean c(s s8) throws IOException {
        z.c(s8, false);
        return z.a(s8);
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        int n8 = this.g;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                return this.n(s8, m8);
                            }
                            throw new IllegalStateException();
                        }
                        this.i(s8);
                        return 0;
                    }
                    this.p(s8);
                    return 0;
                }
                this.q(s8);
                return 0;
            }
            this.l(s8);
            return 0;
        }
        this.o(s8);
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}


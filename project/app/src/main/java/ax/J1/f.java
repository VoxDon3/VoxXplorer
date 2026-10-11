/*
 * Decompiled with CFR 0.152.
 */
package ax.J1;

import ax.E1.h;
import ax.E1.l;
import ax.E1.n;
import ax.J1.a;
import ax.J1.b;
import ax.J1.c;
import ax.J1.d;
import ax.J1.e;
import ax.J1.g;
import ax.J1.h;
import ax.J1.i;
import ax.J1.j;
import ax.P0.C;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.q1.F;
import ax.q1.H;
import ax.q1.J;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.o;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;

public final class f
implements r {
    public static final x v = new d();
    private static final h.a w = new e();
    private final int a;
    private final long b;
    private final G c;
    private final J.a d;
    private final F e;
    private final H f;
    private final U g;
    private t h;
    private U i;
    private U j;
    private int k;
    private C l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;
    private g r;
    private boolean s;
    private boolean t;
    private long u;

    public f() {
        this(0);
    }

    public f(int n8) {
        this(n8, -9223372036854775807L);
    }

    public f(int n8, long l8) {
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.a = n9;
        this.b = l8;
        this.c = new G(10);
        this.d = new J.a();
        this.e = new F();
        this.m = -9223372036854775807L;
        this.f = new H();
        o o8 = new o();
        this.g = o8;
        this.j = o8;
        this.p = -1L;
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean h(int n8, int n9, int n10, int n11, int n12) {
        return n9 == 67 && n10 == 79 && n11 == 77 && (n12 == 77 || n8 == 2) || n9 == 77 && n10 == 76 && n11 == 76 && (n12 == 84 || n8 == 2);
    }

    private void i() {
        ax.S0.a.i(this.i);
        d0.i(this.h);
    }

    private g j(s s8) throws IOException {
        g g8;
        block14: {
            block15: {
                g g9;
                block13: {
                    long l8;
                    long l9;
                    g9 = this.t(s8);
                    g8 = ax.J1.f.s(this.l, s8.getPosition());
                    if (this.s) {
                        return new g.a();
                    }
                    if ((this.a & 4) != 0) {
                        if (g8 != null) {
                            l9 = g8.n();
                            l8 = g8.g();
                        } else if (g9 != null) {
                            l9 = g9.n();
                            l8 = g9.g();
                        } else {
                            l9 = ax.J1.f.p(this.l);
                            l8 = -1L;
                        }
                        g9 = new b(l9, s8.getPosition(), l8);
                    } else if (g8 != null) {
                        g9 = g8;
                    } else if (g9 == null) {
                        g9 = null;
                    }
                    if (g9 == null || !this.y(g9) || g9.n() == -9223372036854775807L || g9.g() == -1L && s8.getLength() == -1L) break block13;
                    l9 = g9.h() != -1L ? g9.h() : 0L;
                    l8 = g9.g() != -1L ? g9.g() : s8.getLength();
                    g8 = new a(l8, l9, ax.u7.f.n(d0.r1(l8 - l9, 8000000L, g9.n(), RoundingMode.HALF_UP)), -1, false);
                    break block14;
                }
                if (g9 == null) break block15;
                g8 = g9;
                if (!this.y(g9)) break block14;
            }
            boolean bl = (this.a & 2) != 0;
            g8 = this.o(s8, bl);
        }
        this.i.d(g8.n());
        return g8;
    }

    private long l(long l8) {
        return this.m + l8 * 1000000L / (long)this.d.d;
    }

    private g n(long l8, i i8, long l9) {
        block6: {
            long l10;
            long l11;
            block5: {
                block4: {
                    l11 = i8.a();
                    if (l11 == -9223372036854775807L) {
                        return null;
                    }
                    long l12 = i8.c;
                    if (l12 == -1L) break block4;
                    l10 = l12 - (long)i8.a.c;
                    l9 = l8 + l12;
                    break block5;
                }
                if (l9 == -1L) break block6;
                l10 = l9 - l8 - (long)i8.a.c;
            }
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            int n8 = ax.u7.f.e(d0.r1(l10, 8000000L, l11, roundingMode));
            int n9 = ax.u7.f.e(ax.t7.d.b(l10, i8.b, roundingMode));
            return new a(l9, l8 + (long)i8.a.c, n8, n9, false);
        }
        return null;
    }

    private g o(s s8, boolean bl) throws IOException {
        s8.p(this.c.f(), 0, 4);
        this.c.b0(0);
        this.d.a(this.c.v());
        return new a(s8.getLength(), s8.getPosition(), this.d, bl);
    }

    private static long p(C c8) {
        if (c8 != null) {
            int n8 = c8.e();
            for (int i8 = 0; i8 < n8; ++i8) {
                C.a a8 = c8.d(i8);
                if (!(a8 instanceof n)) continue;
                a8 = (n)a8;
                if (!((ax.E1.i)a8).a.equals("TLEN")) continue;
                return d0.a1(Long.parseLong((String)((n)a8).d.get(0)));
            }
        }
        return -9223372036854775807L;
    }

    private static int q(G g8, int n8) {
        if (g8.j() >= n8 + 4) {
            g8.b0(n8);
            n8 = g8.v();
            if (n8 == 1483304551 || n8 == 1231971951) {
                return n8;
            }
        }
        if (g8.j() >= 40) {
            g8.b0(36);
            if (g8.v() == 1447187017) {
                return 1447187017;
            }
        }
        return 0;
    }

    private static boolean r(int n8, long l8) {
        return (long)(n8 & 0xFFFE0C00) == (l8 & 0xFFFFFFFFFFFE0C00L);
    }

    private static c s(C c8, long l8) {
        if (c8 != null) {
            int n8 = c8.e();
            for (int i8 = 0; i8 < n8; ++i8) {
                C.a a8 = c8.d(i8);
                if (!(a8 instanceof l)) continue;
                return ax.J1.c.a(l8, (l)a8, ax.J1.f.p(c8));
            }
        }
        return null;
    }

    private g t(s s8) throws IOException {
        int n8;
        Object object = new G(this.d.c);
        s8.p(((G)object).f(), 0, this.d.c);
        Object object2 = this.d;
        int n9 = ((J.a)object2).a;
        int n10 = 21;
        if ((n9 & 1) != 0) {
            if (((J.a)object2).e != 1) {
                n10 = 36;
            }
        } else if (((J.a)object2).e == 1) {
            n10 = 13;
        }
        if ((n9 = ax.J1.f.q((G)object, n10)) != 1231971951) {
            if (n9 != 1447187017) {
                if (n9 != 1483304551) {
                    s8.m();
                    return null;
                }
            } else {
                object2 = ax.J1.h.a(s8.getLength(), s8.getPosition(), this.d, (G)object);
                s8.n(this.d.c);
                return object2;
            }
        }
        object2 = ax.J1.i.b(this.d, (G)object);
        if (!this.e.a() && (n10 = ((i)object2).d) != -1 && (n8 = ((i)object2).e) != -1) {
            object = this.e;
            ((F)object).a = n10;
            ((F)object).b = n8;
        }
        long l8 = s8.getPosition();
        if (s8.getLength() != -1L && ((i)object2).c != -1L && s8.getLength() != ((i)object2).c + l8) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Data size mismatch between stream (");
            ((StringBuilder)object).append(s8.getLength());
            ((StringBuilder)object).append(") and Xing frame (");
            ((StringBuilder)object).append(((i)object2).c + l8);
            ((StringBuilder)object).append("), using Xing value.");
            ax.S0.u.f("Mp3Extractor", ((StringBuilder)object).toString());
        }
        s8.n(this.d.c);
        if (n9 == 1483304551) {
            return ax.J1.j.a((i)object2, l8);
        }
        return this.n(l8, (i)object2, s8.getLength());
    }

    private void u() {
        long l8;
        g g8 = this.r;
        if (g8 instanceof a && g8.i() && (l8 = this.p) != -1L && l8 != this.r.g()) {
            this.r = ((a)this.r).d(this.p);
            ax.S0.a.e(this.h).h(this.r);
            ax.S0.a.e(this.i).d(this.r.n());
        }
    }

    private boolean v(s s8) throws IOException {
        long l8;
        g g8 = this.r;
        if (g8 != null && (l8 = g8.g()) != -1L && s8.i() > l8 - 4L) {
            return true;
        }
        try {
            boolean bl = s8.h(this.c.f(), 0, 4, true);
            return bl ^ true;
        }
        catch (EOFException eOFException) {
            return true;
        }
    }

    private int w(s s8) throws IOException {
        long l8;
        long l9;
        if (this.k == 0) {
            try {
                this.z(s8, false);
            }
            catch (EOFException eOFException) {
                return -1;
            }
        }
        if (this.r == null) {
            Object object = this.j(s8);
            this.r = object;
            this.h.h((N)object);
            v.b b8 = new v.b().W("audio/mpeg").y0(this.d.b).o0(4096).T(this.d.e).z0(this.d.d).d0(this.e.a).e0(this.e.b);
            object = (this.a & 8) != 0 ? null : this.l;
            object = b8.r0((C)object);
            if (this.r.m() != -2147483647) {
                ((v.b)object).S(this.r.m());
            }
            this.j.e(((v.b)object).P());
            this.o = s8.getPosition();
        } else if (this.o != 0L && (l9 = s8.getPosition()) < (l8 = this.o)) {
            s8.n((int)(l8 - l9));
        }
        return this.x(s8);
    }

    private int x(s s8) throws IOException {
        int n8;
        if (this.q == 0) {
            s8.m();
            if (this.v(s8)) {
                return -1;
            }
            this.c.b0(0);
            n8 = this.c.v();
            if (ax.J1.f.r(n8, this.k) && J.j(n8) != -1) {
                long l8;
                this.d.a(n8);
                if (this.m == -9223372036854775807L) {
                    this.m = this.r.j(s8.getPosition());
                    if (this.b != -9223372036854775807L) {
                        l8 = this.r.j(0L);
                        this.m += this.b - l8;
                    }
                }
                this.q = this.d.c;
                l8 = s8.getPosition();
                J.a a8 = this.d;
                this.p = l8 + (long)a8.c;
                g g8 = this.r;
                if (g8 instanceof b) {
                    g8 = (b)g8;
                    ((b)g8).b(this.l(this.n + (long)a8.g), this.p);
                    if (this.t && ((b)g8).a(this.u)) {
                        this.t = false;
                        this.j = this.i;
                    }
                }
            } else {
                s8.n(1);
                this.k = 0;
                return 0;
            }
        }
        if ((n8 = this.j.a(s8, this.q, true)) == -1) {
            return -1;
        }
        this.q = n8 = this.q - n8;
        if (n8 > 0) {
            return 0;
        }
        this.j.f(this.l(this.n), 1, this.d.c, 0, null);
        this.n += (long)this.d.g;
        this.q = 0;
        return 0;
    }

    private boolean y(g g8) {
        return !g8.i() && (this.a & 1) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean z(s s8, boolean bl) throws IOException {
        int n8;
        int n9 = bl ? 32768 : 131072;
        s8.m();
        if (s8.getPosition() == 0L) {
            Object object = (this.a & 8) == 0 ? null : w;
            this.l = object = this.f.a(s8, (h.a)object);
            if (object != null) {
                this.e.c((C)object);
            }
            n8 = (int)s8.i();
            if (!bl) {
                s8.n(n8);
            }
        } else {
            n8 = 0;
        }
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        while (true) {
            int n13;
            int n14;
            block21: {
                block19: {
                    block20: {
                        block18: {
                            if (!this.v(s8)) break block18;
                            if (n11 <= 0) {
                                this.u();
                                throw new EOFException();
                            }
                            break block19;
                        }
                        this.c.b0(0);
                        int n15 = this.c.v();
                        if (n10 != 0 && !ax.J1.f.r(n15, n10) || (n14 = J.j(n15)) == -1) {
                            n10 = n12 + 1;
                            if (n12 == n9) {
                                if (bl) {
                                    return false;
                                }
                                this.u();
                                throw new EOFException();
                            }
                            if (bl) {
                                s8.m();
                                s8.j(n8 + n10);
                            } else {
                                s8.n(1);
                            }
                            n12 = n10;
                            n10 = 0;
                            n11 = 0;
                            continue;
                        }
                        n13 = n11 + 1;
                        if (n13 != 1) break block20;
                        this.d.a(n15);
                        n11 = n15;
                        break block21;
                    }
                    n11 = n10;
                    if (n13 != 4) break block21;
                }
                if (bl) {
                    s8.n(n8 + n12);
                } else {
                    s8.m();
                }
                this.k = n10;
                return true;
            }
            s8.j(n14 - 4);
            n10 = n11;
            n11 = n13;
        }
    }

    @Override
    public void a(t object) {
        this.h = object;
        this.i = object = object.u(0, 1);
        this.j = object;
        this.h.o();
    }

    @Override
    public void b(long l8, long l9) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.u = l9;
        g g8 = this.r;
        if (g8 instanceof b && !((b)g8).a(l9)) {
            this.t = true;
            this.j = this.g;
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        return this.z(s8, true);
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        this.i();
        int n8 = this.w(s8);
        if (n8 == -1 && this.r instanceof b) {
            long l8 = this.l(this.n);
            if (this.r.n() != l8) {
                ((b)this.r).c(l8);
                this.h.h(this.r);
                this.i.d(this.r.n());
            }
        }
        return n8;
    }

    public /* synthetic */ List k() {
        return ax.q1.q.a(this);
    }

    public void m() {
        this.s = true;
    }
}


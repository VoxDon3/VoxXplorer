/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.j;
import ax.P0.v;
import ax.S0.d0;
import ax.S0.i;
import ax.T0.h;
import ax.X1.G;
import ax.X1.L;
import ax.X1.m;
import ax.X1.w;
import ax.q1.U;
import ax.q1.t;
import ax.q7.n;
import java.util.Collections;

public final class q
implements m {
    private final G a;
    private final String b;
    private String c;
    private U d;
    private a e;
    private boolean f;
    private final boolean[] g;
    private final w h;
    private final w i;
    private final w j;
    private final w k;
    private final w l;
    private long m;
    private long n;
    private final ax.S0.G o;

    public q(G g8, String string) {
        this.a = g8;
        this.b = string;
        this.g = new boolean[3];
        this.h = new w(32, 128);
        this.i = new w(33, 128);
        this.j = new w(34, 128);
        this.k = new w(39, 128);
        this.l = new w(40, 128);
        this.n = -9223372036854775807L;
        this.o = new ax.S0.G();
    }

    private void a() {
        ax.S0.a.i(this.d);
        d0.i(this.e);
    }

    private void g(long l8, int n8, int n9, long l9) {
        Object object;
        this.e.a(l8, n8, this.f);
        if (!this.f) {
            this.h.b(n9);
            this.i.b(n9);
            this.j.b(n9);
            if (this.h.c() && this.i.c() && this.j.c()) {
                object = q.i(this.c, this.h, this.i, this.j, this.b);
                this.d.e((v)object);
                boolean bl = ((v)object).q != -1;
                ax.q7.n.t(bl);
                this.a.f(((v)object).q);
                this.f = true;
            }
        }
        if (this.k.b(n9)) {
            object = this.k;
            n8 = ax.T0.h.L(((w)object).d, ((w)object).e);
            this.o.Z(this.k.d, n8);
            this.o.c0(5);
            this.a.c(l9, this.o);
        }
        if (this.l.b(n9)) {
            object = this.l;
            n8 = ax.T0.h.L(((w)object).d, ((w)object).e);
            this.o.Z(this.l.d, n8);
            this.o.c0(5);
            this.a.c(l9, this.o);
        }
    }

    private void h(byte[] byArray, int n8, int n9) {
        this.e.e(byArray, n8, n9);
        if (!this.f) {
            this.h.a(byArray, n8, n9);
            this.i.a(byArray, n8, n9);
            this.j.a(byArray, n8, n9);
        }
        this.k.a(byArray, n8, n9);
        this.l.a(byArray, n8, n9);
    }

    private static v i(String string, w object, w object2, w object3, String string2) {
        int n8 = ((w)object).e;
        byte[] byArray = new byte[((w)object2).e + n8 + ((w)object3).e];
        System.arraycopy(((w)object).d, 0, byArray, 0, n8);
        System.arraycopy(((w)object2).d, 0, byArray, ((w)object).e, ((w)object2).e);
        System.arraycopy(((w)object3).d, 0, byArray, ((w)object).e + ((w)object2).e, ((w)object3).e);
        object3 = ((w)object2).d;
        n8 = ((w)object2).e;
        object = null;
        object2 = ax.T0.h.u((byte[])object3, 3, n8, null);
        object3 = ((h.h)object2).c;
        if (object3 != null) {
            object = ax.S0.i.h(((h.c)object3).a, ((h.c)object3).b, ((h.c)object3).c, ((h.c)object3).d, ((h.c)object3).e, ((h.c)object3).f);
        }
        return new v.b().j0(string).W(string2).y0("video/hevc").U((String)object).F0(((h.h)object2).h).h0(((h.h)object2).i).b0(((h.h)object2).j).a0(((h.h)object2).k).V(new j.b().d(((h.h)object2).n).c(((h.h)object2).o).e(((h.h)object2).p).g(((h.h)object2).e + 8).b(((h.h)object2).f + 8).a()).u0(((h.h)object2).l).p0(((h.h)object2).m).q0(((h.h)object2).b + 1).k0(Collections.singletonList(byArray)).P();
    }

    private void j(long l8, int n8, int n9, long l9) {
        this.e.g(l8, n8, n9, l9, this.f);
        if (!this.f) {
            this.h.e(n9);
            this.i.e(n9);
            this.j.e(n9);
        }
        this.k.e(n9);
        this.l.e(n9);
    }

    @Override
    public void b() {
        this.m = 0L;
        this.n = -9223372036854775807L;
        ax.T0.h.c(this.g);
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.l.d();
        this.a.b();
        a a8 = this.e;
        if (a8 != null) {
            a8.f();
        }
    }

    @Override
    public void c(ax.S0.G g8) {
        this.a();
        while (g8.a() > 0) {
            int n8 = g8.g();
            int n9 = g8.j();
            byte[] byArray = g8.f();
            this.m += (long)g8.a();
            this.d.g(g8, g8.a());
            while (n8 < n9) {
                int n10;
                int n11 = ax.T0.h.e(byArray, n8, n9, this.g);
                if (n11 == n9) {
                    this.h(byArray, n8, n9);
                    return;
                }
                int n12 = ax.T0.h.i(byArray, n11);
                if (n11 > 0 && byArray[n11 - 1] == 0) {
                    --n11;
                    n10 = 4;
                } else {
                    n10 = 3;
                }
                int n13 = n11 - n8;
                if (n13 > 0) {
                    this.h(byArray, n8, n11);
                }
                int n14 = n9 - n11;
                long l8 = this.m - (long)n14;
                n8 = n13 < 0 ? -n13 : 0;
                this.g(l8, n14, n8, this.n);
                this.j(l8, n14, n12, this.n);
                n8 = n11 + n10;
            }
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        U u8;
        d8.a();
        this.c = d8.b();
        this.d = u8 = t8.u(d8.c(), 2);
        this.e = new a(u8);
        this.a.d(t8, d8);
    }

    @Override
    public void e(boolean bl) {
        this.a();
        if (bl) {
            this.a.e();
            this.g(this.m, 0, 0, this.n);
            this.j(this.m, 0, 48, this.n);
        }
    }

    @Override
    public void f(long l8, int n8) {
        this.n = l8;
    }

    private static final class a {
        private final U a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(U u8) {
            this.a = u8;
        }

        private static boolean b(int n8) {
            return 32 <= n8 && n8 <= 35 || n8 == 39;
        }

        private static boolean c(int n8) {
            return n8 < 32 || n8 == 40;
            {
            }
        }

        private void d(int n8) {
            long l8;
            long l9;
            long l10 = this.l;
            if (l10 != -9223372036854775807L && (l9 = this.b) != (l8 = this.k)) {
                int n9 = this.m;
                int n10 = (int)(l9 - l8);
                this.a.f(l10, n9, n10, n8, null);
            }
        }

        public void a(long l8, int n8, boolean bl) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
                return;
            }
            if (!this.h && !this.g) {
                return;
            }
            if (bl && this.i) {
                this.d(n8 + (int)(l8 - this.b));
            }
            this.k = this.b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }

        public void e(byte[] byArray, int n8, int n9) {
            if (this.f) {
                int n10 = this.d;
                int n11 = n8 + 2 - n10;
                if (n11 < n9) {
                    boolean bl = (byArray[n11] & 0x80) != 0;
                    this.g = bl;
                    this.f = false;
                    return;
                }
                this.d = n10 + (n9 - n8);
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long l8, int n8, int n9, long l9, boolean bl) {
            block8: {
                block7: {
                    boolean bl2 = false;
                    this.g = false;
                    this.h = false;
                    this.e = l9;
                    this.d = 0;
                    this.b = l8;
                    if (!ax.X1.q$a.c(n9)) {
                        if (this.i && !this.j) {
                            if (bl) {
                                this.d(n8);
                            }
                            this.i = false;
                        }
                        if (ax.X1.q$a.b(n9)) {
                            this.h = this.j ^ true;
                            this.j = true;
                        }
                    }
                    bl = n9 >= 16 && n9 <= 21;
                    this.c = bl;
                    if (bl) break block7;
                    bl = bl2;
                    if (n9 > 9) break block8;
                }
                bl = true;
            }
            this.f = bl;
        }
    }
}


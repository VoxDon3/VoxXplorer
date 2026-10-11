/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.SparseArray;
import ax.P0.j;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.i;
import ax.T0.h;
import ax.T0.j;
import ax.X1.G;
import ax.X1.L;
import ax.X1.m;
import ax.X1.w;
import ax.q1.U;
import ax.q1.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class p
implements m {
    private final G a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final w e;
    private final w f;
    private final w g;
    private long h;
    private final boolean[] i;
    private String j;
    private U k;
    private b l;
    private boolean m;
    private long n;
    private boolean o;
    private final ax.S0.G p;

    public p(G g8, boolean bl, boolean bl2, String string) {
        this.a = g8;
        this.b = bl;
        this.c = bl2;
        this.d = string;
        this.i = new boolean[3];
        this.e = new w(7, 128);
        this.f = new w(8, 128);
        this.g = new w(6, 128);
        this.n = -9223372036854775807L;
        this.p = new ax.S0.G();
    }

    private void a() {
        ax.S0.a.i(this.k);
        d0.i(this.l);
    }

    private void g(long l8, int n8, int n9, long l9) {
        Object object;
        if (!this.m || this.l.c()) {
            this.e.b(n9);
            this.f.b(n9);
            if (!this.m) {
                if (this.e.c() && this.f.c()) {
                    object = new ArrayList();
                    Object object2 = this.e;
                    object.add(Arrays.copyOf(((w)object2).d, ((w)object2).e));
                    object2 = this.f;
                    object.add(Arrays.copyOf(((w)object2).d, ((w)object2).e));
                    object2 = this.e;
                    object2 = ax.T0.h.C(((w)object2).d, 3, ((w)object2).e);
                    Object object3 = this.f;
                    object3 = ax.T0.h.A(((w)object3).d, 3, ((w)object3).e);
                    String string = ax.S0.i.f(((h.m)object2).a, ((h.m)object2).b, ((h.m)object2).c);
                    this.k.e(new v.b().j0(this.j).W(this.d).y0("video/avc").U(string).F0(((h.m)object2).f).h0(((h.m)object2).g).V(new j.b().d(((h.m)object2).q).c(((h.m)object2).r).e(((h.m)object2).s).g(((h.m)object2).i + 8).b(((h.m)object2).j + 8).a()).u0(((h.m)object2).h).k0((List<byte[]>)object).p0(((h.m)object2).t).P());
                    this.m = true;
                    this.a.f(((h.m)object2).t);
                    this.l.f((h.m)object2);
                    this.l.e((h.l)object3);
                    this.e.d();
                    this.f.d();
                }
            } else if (this.e.c()) {
                object = this.e;
                object = ax.T0.h.C(((w)object).d, 3, ((w)object).e);
                this.a.f(((h.m)object).t);
                this.l.f((h.m)object);
                this.e.d();
            } else if (this.f.c()) {
                object = this.f;
                object = ax.T0.h.A(((w)object).d, 3, ((w)object).e);
                this.l.e((h.l)object);
                this.f.d();
            }
        }
        if (this.g.b(n9)) {
            object = this.g;
            n9 = ax.T0.h.L(((w)object).d, ((w)object).e);
            this.p.Z(this.g.d, n9);
            this.p.b0(4);
            this.a.c(l9, this.p);
        }
        if (this.l.b(l8, n8, this.m)) {
            this.o = false;
        }
    }

    private void h(byte[] byArray, int n8, int n9) {
        if (!this.m || this.l.c()) {
            this.e.a(byArray, n8, n9);
            this.f.a(byArray, n8, n9);
        }
        this.g.a(byArray, n8, n9);
        this.l.a(byArray, n8, n9);
    }

    private void i(long l8, int n8, long l9) {
        if (!this.m || this.l.c()) {
            this.e.e(n8);
            this.f.e(n8);
        }
        this.g.e(n8);
        this.l.i(l8, n8, l9, this.o);
    }

    @Override
    public void b() {
        this.h = 0L;
        this.o = false;
        this.n = -9223372036854775807L;
        ax.T0.h.c(this.i);
        this.e.d();
        this.f.d();
        this.g.d();
        this.a.b();
        b b8 = this.l;
        if (b8 != null) {
            b8.g();
        }
    }

    @Override
    public void c(ax.S0.G g8) {
        this.a();
        int n8 = g8.g();
        int n9 = g8.j();
        byte[] byArray = g8.f();
        this.h += (long)g8.a();
        this.k.g(g8, g8.a());
        while (true) {
            int n10;
            int n11;
            if ((n11 = ax.T0.h.e(byArray, n8, n9, this.i)) == n9) {
                this.h(byArray, n8, n9);
                return;
            }
            int n12 = ax.T0.h.j(byArray, n11);
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
            long l8 = this.h - (long)n14;
            n8 = n13 < 0 ? -n13 : 0;
            this.g(l8, n14, n8, this.n);
            this.i(l8, n12, this.n);
            n8 = n11 + n10;
        }
    }

    @Override
    public void d(t t8, L.d d8) {
        U u8;
        d8.a();
        this.j = d8.b();
        this.k = u8 = t8.u(d8.c(), 2);
        this.l = new b(u8, this.b, this.c);
        this.a.d(t8, d8);
    }

    @Override
    public void e(boolean bl) {
        this.a();
        if (bl) {
            this.a.e();
            this.g(this.h, 0, 0, this.n);
            this.i(this.h, 9, this.n);
            this.g(this.h, 0, 0, this.n);
        }
    }

    @Override
    public void f(long l8, int n8) {
        this.n = l8;
        int n9 = this.o;
        n8 = (n8 & 2) != 0 ? 1 : 0;
        this.o = n9 | n8;
    }

    private static final class b {
        private final U a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<h.m> d;
        private final SparseArray<h.l> e;
        private final j f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m;
        private a n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;
        private boolean s;

        public b(U object, boolean bl, boolean bl2) {
            this.a = object;
            this.b = bl;
            this.c = bl2;
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.m = new a();
            this.n = new a();
            object = new byte[128];
            this.g = (byte[])object;
            this.f = new j((byte[])object, 0, 0);
            this.g();
        }

        private void d(int n8) {
            long l8;
            long l9;
            long l10 = this.q;
            if (l10 != -9223372036854775807L && (l9 = this.j) != (l8 = this.p)) {
                int n9 = this.r;
                int n10 = (int)(l9 - l8);
                this.a.f(l10, n9, n10, n8, null);
            }
        }

        private void h() {
            boolean bl;
            boolean bl2 = this.b ? this.n.d() : this.s;
            boolean bl3 = this.r;
            int n8 = this.i;
            boolean bl4 = bl = true;
            if (n8 != 5) {
                bl4 = bl2 && n8 == 1 ? bl : false;
            }
            this.r = bl3 | bl4;
        }

        /*
         * Enabled aggressive block sorting
         */
        public void a(byte[] object, int n8, int n9) {
            int n10;
            boolean bl;
            boolean bl2;
            boolean bl3;
            boolean bl4;
            int n11;
            h.m m8;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block28: {
                block29: {
                    block25: {
                        block24: {
                            block26: {
                                block27: {
                                    h.l l8;
                                    block23: {
                                        block22: {
                                            block21: {
                                                block20: {
                                                    if (!this.k) {
                                                        return;
                                                    }
                                                    byte[] byArray = this.g;
                                                    n18 = byArray.length;
                                                    n17 = this.h;
                                                    if (n18 < n17 + (n15 -= n16)) {
                                                        this.g = Arrays.copyOf(byArray, (n17 + n15) * 2);
                                                    }
                                                    System.arraycopy(object, n16, this.g, this.h, n15);
                                                    this.h = n16 = this.h + n15;
                                                    this.f.j(this.g, 0, n16);
                                                    if (!this.f.c(8)) {
                                                        return;
                                                    }
                                                    this.f.l();
                                                    n14 = this.f.f(2);
                                                    this.f.m(5);
                                                    if (!this.f.d()) {
                                                        return;
                                                    }
                                                    this.f.i();
                                                    if (!this.f.d()) {
                                                        return;
                                                    }
                                                    n13 = this.f.i();
                                                    if (!this.c) {
                                                        this.k = false;
                                                        this.n.f(n13);
                                                        return;
                                                    }
                                                    if (!this.f.d()) {
                                                        return;
                                                    }
                                                    n12 = this.f.i();
                                                    if (this.e.indexOfKey(n12) < 0) {
                                                        this.k = false;
                                                        return;
                                                    }
                                                    l8 = (h.l)this.e.get(n12);
                                                    m8 = (h.m)this.d.get(l8.b);
                                                    if (m8.k) {
                                                        if (!this.f.c(2)) {
                                                            return;
                                                        }
                                                        this.f.m(2);
                                                    }
                                                    if (!this.f.c(m8.m)) {
                                                        return;
                                                    }
                                                    n11 = this.f.f(m8.m);
                                                    if (m8.l) break block20;
                                                    if (!this.f.c(1)) {
                                                        return;
                                                    }
                                                    bl4 = this.f.e();
                                                    if (!bl4) break block21;
                                                    if (!this.f.c(1)) {
                                                        return;
                                                    }
                                                    bl3 = this.f.e();
                                                    bl2 = true;
                                                    break block22;
                                                }
                                                bl4 = false;
                                            }
                                            bl2 = false;
                                            bl3 = false;
                                        }
                                        bl = this.i == 5;
                                        if (bl) {
                                            if (!this.f.d()) {
                                                return;
                                            }
                                            n18 = this.f.i();
                                        } else {
                                            n18 = 0;
                                        }
                                        n16 = m8.n;
                                        if (n16 != 0) break block23;
                                        if (!this.f.c(m8.o)) {
                                            return;
                                        }
                                        n17 = this.f.f(m8.o);
                                        if (!l8.c || bl4) break block24;
                                        if (!this.f.d()) {
                                            return;
                                        }
                                        n15 = this.f.h();
                                        break block25;
                                    }
                                    if (n16 != 1 || m8.p) break block26;
                                    if (!this.f.d()) {
                                        return;
                                    }
                                    n16 = this.f.h();
                                    if (!l8.c || bl4) break block27;
                                    if (!this.f.d()) {
                                        return;
                                    }
                                    n10 = this.f.h();
                                    n17 = 0;
                                    n15 = 0;
                                    break block28;
                                }
                                n17 = 0;
                                n15 = 0;
                                break block29;
                            }
                            n17 = 0;
                        }
                        n15 = 0;
                    }
                    n16 = 0;
                }
                n10 = 0;
            }
            this.n.e(m8, n14, n13, n11, n12, bl4, bl2, bl3, bl, n18, n17, n15, n16, n10);
            this.k = false;
        }

        public boolean b(long l8, int n8, boolean bl) {
            if (this.i == 9 || this.c && this.n.c(this.m)) {
                if (bl && this.o) {
                    this.d(n8 + (int)(l8 - this.j));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            this.h();
            this.i = 24;
            return this.r;
        }

        public boolean c() {
            return this.c;
        }

        public void e(h.l l8) {
            this.e.append(l8.a, (Object)l8);
        }

        public void f(h.m m8) {
            this.d.append(m8.d, (Object)m8);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void i(long l8, int n8, long l9, boolean bl) {
            this.i = n8;
            this.l = l9;
            this.j = l8;
            this.s = bl;
            if (this.b && n8 == 1 || this.c && (n8 == 5 || n8 == 1 || n8 == 2)) {
                a a8 = this.m;
                this.m = this.n;
                this.n = a8;
                a8.b();
                this.h = 0;
                this.k = true;
            }
        }

        private static final class a {
            private boolean a;
            private boolean b;
            private h.m c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            private boolean c(a a8) {
                boolean bl;
                int n8;
                int n9;
                if (!this.a) {
                    return false;
                }
                if (!a8.a) {
                    return true;
                }
                h.m m8 = ax.S0.a.i(this.c);
                h.m m9 = ax.S0.a.i(a8.c);
                return this.f != a8.f || this.g != a8.g || this.h != a8.h || this.i && a8.i && this.j != a8.j || (n9 = this.d) != (n8 = a8.d) && (n9 == 0 || n8 == 0) || (n9 = m8.n) == 0 && m9.n == 0 && (this.m != a8.m || this.n != a8.n) || n9 == 1 && m9.n == 1 && (this.o != a8.o || this.p != a8.p) || (bl = this.k) != a8.k || bl && this.l != a8.l;
                {
                }
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            public boolean d() {
                int n8;
                return this.b && ((n8 = this.e) == 7 || n8 == 2);
            }

            public void e(h.m m8, int n8, int n9, int n10, int n11, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n12, int n13, int n14, int n15, int n16) {
                this.c = m8;
                this.d = n8;
                this.e = n9;
                this.f = n10;
                this.g = n11;
                this.h = bl;
                this.i = bl2;
                this.j = bl3;
                this.k = bl4;
                this.l = n12;
                this.m = n13;
                this.n = n14;
                this.o = n15;
                this.p = n16;
                this.a = true;
                this.b = true;
            }

            public void f(int n8) {
                this.e = n8;
                this.b = true;
            }
        }
    }
}


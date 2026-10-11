/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.net.Uri;
import android.util.Pair;
import ax.P0.b;
import ax.P0.y;
import ax.S0.a;
import ax.S0.d0;

public abstract class N {
    public static final N a = new N(){

        @Override
        public int b(Object object) {
            return -1;
        }

        @Override
        public b g(int n8, b b8, boolean bl) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int i() {
            return 0;
        }

        @Override
        public Object m(int n8) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public c o(int n8, c c8, long l8) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int p() {
            return 0;
        }
    };
    private static final String b = d0.G0(0);
    private static final String c = d0.G0(1);
    private static final String d = d0.G0(2);

    protected N() {
    }

    public int a(boolean bl) {
        if (this.q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object var1);

    public int c(boolean bl) {
        if (this.q()) {
            return -1;
        }
        return this.p() - 1;
    }

    public final int d(int n8, b b8, c c8, int n9, boolean bl) {
        int n10 = this.f((int)n8, (b)b8).c;
        if (this.n((int)n10, (c)c8).o == n8) {
            n8 = this.e(n10, n9, bl);
            if (n8 == -1) {
                return -1;
            }
            return this.n((int)n8, (c)c8).n;
        }
        return n8 + 1;
    }

    public int e(int n8, int n9, boolean bl) {
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    if (n8 == this.c(bl)) {
                        return this.a(bl);
                    }
                    return n8 + 1;
                }
                throw new IllegalStateException();
            }
            return n8;
        }
        if (n8 == this.c(bl)) {
            return -1;
        }
        return n8 + 1;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof N)) {
            return false;
        }
        N n8 = (N)object;
        if (n8.p() == this.p() && n8.i() == this.i()) {
            int n9;
            c c8 = new c();
            b b8 = new b();
            object = new c();
            b b9 = new b();
            for (n9 = 0; n9 < this.p(); ++n9) {
                if (this.n(n9, c8).equals(n8.n(n9, (c)object))) continue;
                return false;
            }
            for (n9 = 0; n9 < this.i(); ++n9) {
                if (this.g(n9, b8, true).equals(n8.g(n9, b9, true))) continue;
                return false;
            }
            n9 = this.a(true);
            if (n9 != n8.a(true)) {
                return false;
            }
            int n10 = this.c(true);
            if (n10 != n8.c(true)) {
                return false;
            }
            while (n9 != n10) {
                int n11 = this.e(n9, 0, true);
                if (n11 != n8.e(n9, 0, true)) {
                    return false;
                }
                n9 = n11;
            }
            return true;
        }
        return false;
    }

    public final b f(int n8, b b8) {
        return this.g(n8, b8, false);
    }

    public abstract b g(int var1, b var2, boolean var3);

    public b h(Object object, b b8) {
        return this.g(this.b(object), b8, true);
    }

    public int hashCode() {
        int n8;
        c c8 = new c();
        b b8 = new b();
        int n9 = 217 + this.p();
        for (n8 = 0; n8 < this.p(); ++n8) {
            n9 = n9 * 31 + this.n(n8, c8).hashCode();
        }
        n8 = n9 * 31 + this.i();
        for (n9 = 0; n9 < this.i(); ++n9) {
            n8 = n8 * 31 + this.g(n9, b8, true).hashCode();
        }
        int n10 = this.a(true);
        n9 = n8;
        n8 = n10;
        while (n8 != -1) {
            n9 = n9 * 31 + n8;
            n8 = this.e(n8, 0, true);
        }
        return n9;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c c8, b b8, int n8, long l8) {
        return ax.S0.a.e(this.k(c8, b8, n8, l8, 0L));
    }

    public final Pair<Object, Long> k(c c8, b b8, int n8, long l8, long l9) {
        ax.S0.a.c(n8, 0, this.p());
        this.o(n8, c8, l9);
        l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = l8 = c8.c();
            if (l8 == -9223372036854775807L) {
                return null;
            }
        }
        n8 = c8.n;
        this.f(n8, b8);
        while (n8 < c8.o && b8.e != l9) {
            int n9 = n8 + 1;
            if (this.f((int)n9, (b)b8).e > l9) break;
            n8 = n9;
        }
        this.g(n8, b8, true);
        long l10 = b8.d;
        l8 = l9 -= b8.e;
        if (l10 != -9223372036854775807L) {
            l8 = Math.min(l9, l10 - 1L);
        }
        l8 = Math.max(0L, l8);
        return Pair.create((Object)ax.S0.a.e(b8.b), (Object)l8);
    }

    public int l(int n8, int n9, boolean bl) {
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    if (n8 == this.a(bl)) {
                        return this.c(bl);
                    }
                    return n8 - 1;
                }
                throw new IllegalStateException();
            }
            return n8;
        }
        if (n8 == this.a(bl)) {
            return -1;
        }
        return n8 - 1;
    }

    public abstract Object m(int var1);

    public final c n(int n8, c c8) {
        return this.o(n8, c8, 0L);
    }

    public abstract c o(int var1, c var2, long var3);

    public abstract int p();

    public final boolean q() {
        return this.p() == 0;
    }

    public final boolean r(int n8, b b8, c c8, int n9, boolean bl) {
        return this.d(n8, b8, c8, n9, bl) == -1;
    }

    public static final class b {
        private static final String h = d0.G0(0);
        private static final String i = d0.G0(1);
        private static final String j = d0.G0(2);
        private static final String k = d0.G0(3);
        private static final String l = d0.G0(4);
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public ax.P0.b g = ax.P0.b.g;

        public int a(int n8) {
            return this.g.a((int)n8).b;
        }

        public long b(int n8, int n9) {
            b.a a8 = this.g.a(n8);
            if (a8.b != -1) {
                return a8.g[n9];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.g.b;
        }

        public int d(long l8) {
            return this.g.b(l8, this.d);
        }

        public int e(long l8) {
            return this.g.c(l8, this.d);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && b.class.equals(object.getClass())) {
                object = (b)object;
                if (j.Objects.equals((Object)this.a, (Object)((b)object).a) && j.Objects.equals((Object)this.b, (Object)((b)object).b) && this.c == ((b)object).c && this.d == ((b)object).d && this.e == ((b)object).e && this.f == ((b)object).f && j.Objects.equals((Object)this.g, (Object)((b)object).g)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int n8) {
            return this.g.a((int)n8).a;
        }

        public long g() {
            return this.g.c;
        }

        public int h(int n8, int n9) {
            b.a a8 = this.g.a(n8);
            if (a8.b != -1) {
                return a8.f[n9];
            }
            return 0;
        }

        public int hashCode() {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.b;
            if (object != null) {
                n8 = object.hashCode();
            }
            int n10 = this.c;
            long l8 = this.d;
            int n11 = (int)(l8 ^ l8 >>> 32);
            l8 = this.e;
            return ((((((217 + n9) * 31 + n8) * 31 + n10) * 31 + n11) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.f) * 31 + this.g.hashCode();
        }

        public long i(int n8) {
            return this.g.a((int)n8).i;
        }

        public long j() {
            return d0.E1(this.d);
        }

        public long k() {
            return this.d;
        }

        public int l(int n8) {
            return this.g.a(n8).c();
        }

        public int m(int n8, int n9) {
            return this.g.a(n8).d(n9);
        }

        public long n() {
            return d0.E1(this.e);
        }

        public long o() {
            return this.e;
        }

        public int p() {
            return this.g.e;
        }

        public boolean q(int n8) {
            return this.g.a(n8).e() ^ true;
        }

        public boolean r(int n8) {
            return n8 == this.c() - 1 && this.g.d(n8);
        }

        public boolean s(int n8) {
            return this.g.a((int)n8).j;
        }

        public b t(Object object, Object object2, int n8, long l8, long l9) {
            return this.u(object, object2, n8, l8, l9, ax.P0.b.g, false);
        }

        public b u(Object object, Object object2, int n8, long l8, long l9, ax.P0.b b8, boolean bl) {
            this.a = object;
            this.b = object2;
            this.c = n8;
            this.d = l8;
            this.e = l9;
            this.g = b8;
            this.f = bl;
            return this;
        }
    }

    public static final class c {
        private static final String A;
        private static final String B;
        private static final String C;
        private static final String D;
        private static final String E;
        private static final String F;
        public static final Object q;
        private static final Object r;
        private static final y s;
        private static final String t;
        private static final String u;
        private static final String v;
        private static final String w;
        private static final String x;
        private static final String y;
        private static final String z;
        public Object a = q;
        @Deprecated
        public Object b;
        public y c = s;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        public y.g j;
        public boolean k;
        public long l;
        public long m;
        public int n;
        public int o;
        public long p;

        static {
            q = new Object();
            r = new Object();
            s = new y.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();
            t = d0.G0(1);
            u = d0.G0(2);
            v = d0.G0(3);
            w = d0.G0(4);
            x = d0.G0(5);
            y = d0.G0(6);
            z = d0.G0(7);
            A = d0.G0(8);
            B = d0.G0(9);
            C = d0.G0(10);
            D = d0.G0(11);
            E = d0.G0(12);
            F = d0.G0(13);
        }

        public long a() {
            return d0.i0(this.g);
        }

        public long b() {
            return d0.E1(this.l);
        }

        public long c() {
            return this.l;
        }

        public long d() {
            return d0.E1(this.m);
        }

        public long e() {
            return this.p;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && c.class.equals(object.getClass())) {
                object = (c)object;
                if (j.Objects.equals((Object)this.a, (Object)((c)object).a) && j.Objects.equals((Object)this.c, (Object)((c)object).c) && j.Objects.equals((Object)this.d, (Object)((c)object).d) && j.Objects.equals((Object)this.j, (Object)((c)object).j) && this.e == ((c)object).e && this.f == ((c)object).f && this.g == ((c)object).g && this.h == ((c)object).h && this.i == ((c)object).i && this.k == ((c)object).k && this.l == ((c)object).l && this.m == ((c)object).m && this.n == ((c)object).n && this.o == ((c)object).o && this.p == ((c)object).p) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.j != null;
        }

        public c g(Object object, y y8, Object object2, long l8, long l9, long l10, boolean bl, boolean bl2, y.g g8, long l11, long l12, int n8, int n9, long l13) {
            this.a = object;
            object = y8 != null ? y8 : s;
            this.c = object;
            object = y8 != null && (object = y8.b) != null ? ((y.h)object).h : null;
            this.b = object;
            this.d = object2;
            this.e = l8;
            this.f = l9;
            this.g = l10;
            this.h = bl;
            this.i = bl2;
            this.j = g8;
            this.l = l11;
            this.m = l12;
            this.n = n8;
            this.o = n9;
            this.p = l13;
            this.k = false;
            return this;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            int n9 = this.c.hashCode();
            Object object = this.d;
            int n10 = 0;
            int n11 = object == null ? 0 : object.hashCode();
            object = this.j;
            if (object != null) {
                n10 = ((y.g)object).hashCode();
            }
            long l8 = this.e;
            int n12 = (int)(l8 ^ l8 >>> 32);
            l8 = this.f;
            int n13 = (int)(l8 ^ l8 >>> 32);
            l8 = this.g;
            int n14 = (int)(l8 ^ l8 >>> 32);
            int n15 = this.h;
            int n16 = this.i;
            int n17 = this.k;
            l8 = this.l;
            int n18 = (int)(l8 ^ l8 >>> 32);
            l8 = this.m;
            int n19 = (int)(l8 ^ l8 >>> 32);
            int n20 = this.n;
            int n21 = this.o;
            l8 = this.p;
            return ((((((((((((((217 + n8) * 31 + n9) * 31 + n11) * 31 + n10) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n21) * 31 + (int)(l8 ^ l8 >>> 32);
        }
    }
}


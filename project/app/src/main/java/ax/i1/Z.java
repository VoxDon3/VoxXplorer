/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import android.os.Looper;
import ax.N1.t;
import ax.P0.N;
import ax.P0.v;
import ax.P0.y;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.z;
import ax.Z0.I1;
import ax.b1.l;
import ax.b1.u;
import ax.i1.C;
import ax.i1.E;
import ax.i1.F;
import ax.i1.N;
import ax.i1.O;
import ax.i1.T;
import ax.i1.Y;
import ax.i1.a;
import ax.i1.a0;
import ax.i1.d;
import ax.i1.h0;
import ax.i1.w;
import ax.m1.f;
import ax.m1.k;
import ax.m1.m;
import ax.n1.c;
import ax.q1.N;
import ax.q1.n;
import ax.q1.x;
import ax.q7.u;

public final class Z
extends a
implements Y.c {
    private final g.a h;
    private final T.a i;
    private final ax.b1.w j;
    private final m k;
    private final int l;
    private final int m;
    private final v n;
    private final u<c> o;
    private boolean p;
    private long q;
    private boolean r;
    private boolean s;
    private z t;
    private y u;

    private Z(y y8, g.a a8, T.a a9, ax.b1.w w8, m m8, int n8, int n9, v v8, u<c> u8) {
        this.u = y8;
        this.h = a8;
        this.i = a9;
        this.j = w8;
        this.k = m8;
        this.l = n8;
        this.n = v8;
        this.m = n9;
        this.p = true;
        this.q = -9223372036854775807L;
        this.o = u8;
    }

    private y.h D() {
        return ax.S0.a.e(this.j().b);
    }

    private void E() {
        h0 h02;
        ax.P0.N n8 = h02 = new h0(this.q, this.r, false, this.s, null, this.j());
        if (this.p) {
            n8 = new w(this, h02){
                final Z f;
                {
                    this.f = z8;
                    super(n8);
                }

                @Override
                public N.b g(int n8, N.b b8, boolean bl) {
                    super.g(n8, b8, bl);
                    b8.f = true;
                    return b8;
                }

                @Override
                public N.c o(int n8, N.c c8, long l8) {
                    super.o(n8, c8, l8);
                    c8.k = true;
                    return c8;
                }
            };
        }
        this.B(n8);
    }

    @Override
    protected void A(z z8) {
        this.t = z8;
        this.j.c(ax.S0.a.e(Looper.myLooper()), this.x());
        this.j.k();
        this.E();
    }

    @Override
    protected void C() {
        this.j.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(y y8) {
        synchronized (this) {
            this.u = y8;
            return;
        }
    }

    @Override
    public void e(C c8) {
        ((Y)c8).f0();
    }

    @Override
    public void h(long l8, N n8, boolean bl) {
        long l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = this.q;
        }
        boolean bl2 = n8.i();
        if (!this.p && this.q == l9 && this.r == bl2 && this.s == bl) {
            return;
        }
        this.q = l9;
        this.r = bl2;
        this.s = bl;
        this.p = false;
        this.E();
    }

    @Override
    public C i(F.b u8, ax.m1.b b8, long l8) {
        g g8 = this.h.a();
        z z8 = this.t;
        if (z8 != null) {
            g8.d(z8);
        }
        y.h h8 = this.D();
        z8 = h8.a;
        T t8 = this.i.a(this.x());
        ax.b1.w w8 = this.j;
        u.a a8 = this.s((F.b)((Object)u8));
        m m8 = this.k;
        N.a a9 = this.u((F.b)((Object)u8));
        String string = h8.e;
        int n8 = this.l;
        int n9 = this.m;
        v v8 = this.n;
        l8 = d0.a1(h8.i);
        u8 = this.o;
        u8 = u8 != null ? (c)u8.get() : null;
        return new Y((Uri)z8, g8, t8, w8, a8, m8, a9, this, b8, string, n8, n9, v8, l8, (c)((Object)u8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public y j() {
        synchronized (this) {
            return this.u;
        }
    }

    @Override
    public void k() {
    }

    public static final class b
    implements O {
        private final g.a a;
        private T.a b;
        private ax.b1.z c;
        private m d;
        private int e;
        private u<c> f;
        private int g;
        private v h;

        public b(g.a a8) {
            this(a8, new n());
        }

        public b(g.a a8, T.a a9) {
            this(a8, a9, new l(), new k(), 0x100000);
        }

        public b(g.a a8, T.a a9, ax.b1.z z8, m m8, int n8) {
            this.a = a8;
            this.b = a9;
            this.c = z8;
            this.d = m8;
            this.e = n8;
        }

        public b(g.a a8, x x8) {
            this(a8, new a0(x8));
        }

        public static /* synthetic */ T h(x x8, I1 i12) {
            return new d(x8);
        }

        @Override
        public /* synthetic */ F.a a(t.a a8) {
            return E.d(this, a8);
        }

        @Override
        public /* synthetic */ F.a b(int n8) {
            return E.b(this, n8);
        }

        @Override
        public /* synthetic */ F.a c(boolean bl) {
            return E.a(this, bl);
        }

        @Override
        public /* synthetic */ F.a d(f.a a8) {
            return E.c(this, a8);
        }

        public Z i(y y8) {
            ax.S0.a.e(y8.b);
            return new Z(y8, this.a, this.b, this.c.a(y8), this.d, this.e, this.g, this.h, this.f);
        }

        b j(int n8, v v8) {
            this.g = n8;
            this.h = ax.S0.a.e(v8);
            return this;
        }

        public b k(ax.b1.z z8) {
            this.c = ax.S0.a.f(z8, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b l(m m8) {
            this.d = ax.S0.a.f(m8, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.os.Looper;
import androidx.media3.exoplayer.hls.d;
import androidx.media3.exoplayer.hls.g;
import ax.N1.t;
import ax.P0.L;
import ax.P0.N;
import ax.P0.y;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.z;
import ax.b1.u;
import ax.b1.w;
import ax.c1.b;
import ax.c1.c;
import ax.c1.e;
import ax.d1.a;
import ax.d1.f;
import ax.d1.l;
import ax.d1.m;
import ax.i1.C;
import ax.i1.F;
import ax.i1.N;
import ax.i1.O;
import ax.i1.h0;
import ax.i1.j;
import ax.i1.k;
import ax.m1.f;
import java.io.IOException;
import java.util.List;

public final class HlsMediaSource
extends ax.i1.a
implements m.e {
    private final e h;
    private final ax.c1.d i;
    private final j j;
    private final w k;
    private final ax.m1.m l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final m p;
    private final long q;
    private final long r;
    private y.g s;
    private z t;
    private y u;

    static {
        ax.P0.z.a("media3.exoplayer.hls");
    }

    private HlsMediaSource(y y8, ax.c1.d d8, e e8, j j8, ax.m1.f f8, w w8, ax.m1.m m8, m m9, long l8, boolean bl, int n8, boolean bl2, long l9) {
        this.u = y8;
        this.s = y8.d;
        this.i = d8;
        this.h = e8;
        this.j = j8;
        this.k = w8;
        this.l = m8;
        this.p = m9;
        this.q = l8;
        this.m = bl;
        this.n = n8;
        this.o = bl2;
        this.r = l9;
    }

    private h0 D(f f8, long l8, long l9, d d8) {
        long l10 = f8.h - this.p.e();
        long l11 = f8.o ? l10 + f8.u : -9223372036854775807L;
        long l12 = this.H(f8);
        long l13 = this.s.a;
        l13 = l13 != -9223372036854775807L ? d0.a1(l13) : HlsMediaSource.J(f8, l12);
        this.K(f8, d0.q(l13, l12, f8.u + l12));
        l13 = this.I(f8, l12);
        boolean bl = f8.d == 2 && f8.f;
        return new h0(l8, l9, -9223372036854775807L, l11, f8.u, l10, l13, true, f8.o ^ true, bl, d8, this.j(), this.s);
    }

    private h0 E(f f8, long l8, long l9, d d8) {
        long l10;
        l10 = f8.e != -9223372036854775807L && !f8.r.isEmpty() ? (!f8.g && (l10 = f8.e) != f8.u ? HlsMediaSource.G(f8.r, (long)l10).f0 : f8.e) : 0L;
        long l11 = f8.u;
        return new h0(l8, l9, -9223372036854775807L, l11, l11, 0L, l10, true, false, true, d8, this.j(), null);
    }

    private static f.d F(List<f.d> list, long l8) {
        f.d d8 = null;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            f.d d9 = list.get(i8);
            long l9 = d9.f0;
            if (l9 > l8 || !d9.m0) {
                d9 = d8;
                if (l9 > l8) break;
            }
            d8 = d9;
        }
        return d8;
    }

    private static f.f G(List<f.f> list, long l8) {
        return list.get(d0.f(list, l8, true, true));
    }

    private long H(f f8) {
        if (f8.p) {
            return d0.a1(d0.i0(this.q)) - f8.e();
        }
        return 0L;
    }

    private long I(f object, long l8) {
        long l9 = ((f)object).e;
        l8 = l9 != -9223372036854775807L ? l9 : ((f)object).u + l8 - d0.a1(this.s.a);
        if (((f)object).g) {
            return l8;
        }
        f.d d8 = HlsMediaSource.F(((f)object).s, l8);
        if (d8 != null) {
            return d8.f0;
        }
        if (((f)object).r.isEmpty()) {
            return 0L;
        }
        object = HlsMediaSource.G(((f)object).r, l8);
        d8 = HlsMediaSource.F(((f.f)object).n0, l8);
        if (d8 != null) {
            return d8.f0;
        }
        return ((f.g)object).f0;
    }

    private static long J(f f8, long l8) {
        f.h h8 = f8.v;
        long l9 = f8.e;
        if (l9 != -9223372036854775807L) {
            l9 = f8.u - l9;
        } else {
            l9 = h8.d;
            if ((l9 == -9223372036854775807L || f8.n == -9223372036854775807L) && (l9 = h8.c) == -9223372036854775807L) {
                l9 = f8.m * 3L;
            }
        }
        return l9 + l8;
    }

    /*
     * Unable to fully structure code
     */
    private void K(f var1_1, long var2_2) {
        var7_3 = this.j().d;
        if (var7_3.d != -3.4028235E38f || var7_3.e != -3.4028235E38f) ** GOTO lbl-1000
        var1_1 = var1_1.v;
        if (var1_1.c == -9223372036854775807L && var1_1.d == -9223372036854775807L) {
            var6_4 = true;
        } else lbl-1000:
        // 2 sources

        {
            var6_4 = false;
        }
        var1_1 = new y.g.a().k(d0.E1(var2_2));
        var5_5 = 1.0f;
        var4_6 = var6_4 != false ? 1.0f : this.s.d;
        var1_1 = var1_1.j(var4_6);
        var4_6 = var6_4 != false ? var5_5 : this.s.e;
        this.s = var1_1.h(var4_6).f();
    }

    @Override
    protected void A(z object) {
        this.t = object;
        this.k.c(ax.S0.a.e(Looper.myLooper()), this.x());
        this.k.k();
        object = this.u(null);
        this.p.d(ax.S0.a.e(this.j().b).a, (N.a)object, this);
    }

    @Override
    protected void C() {
        this.p.stop();
        this.k.d();
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
        ((g)c8).D();
    }

    @Override
    public void f(f object) {
        long l8 = ((f)object).p ? d0.E1(((f)object).h) : -9223372036854775807L;
        int n8 = ((f)object).d;
        long l9 = n8 != 2 && n8 != 1 ? -9223372036854775807L : l8;
        d d8 = new d(ax.S0.a.e(this.p.h()), (f)object);
        object = this.p.g() ? this.D((f)object, l9, l8, d8) : this.E((f)object, l9, l8, d8);
        this.B((N)object);
    }

    @Override
    public C i(F.b object, ax.m1.b b8, long l8) {
        N.a a8 = this.u((F.b)object);
        object = this.s((F.b)object);
        return new g(this.h, this.p, this.i, this.t, null, this.k, (u.a)object, this.l, a8, b8, this.j, this.m, this.n, this.o, this.x(), this.r);
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
    public void k() throws IOException {
        this.p.l();
    }

    public static final class Factory
    implements O {
        private final ax.c1.d a;
        private e b;
        private t.a c;
        private boolean d;
        private int e;
        private l f;
        private m.a g;
        private j h;
        private f.a i;
        private ax.b1.z j;
        private ax.m1.m k;
        private boolean l;
        private int m;
        private boolean n;
        private long o;
        private long p;

        public Factory(g.a a8) {
            this(new b(a8));
        }

        public Factory(ax.c1.d d8) {
            this.a = ax.S0.a.e(d8);
            this.j = new ax.b1.l();
            this.f = new a();
            this.g = ax.d1.c.q0;
            this.k = new ax.m1.k();
            this.h = new k();
            this.m = 1;
            this.o = -9223372036854775807L;
            this.l = true;
            this.i(true);
        }

        public HlsMediaSource h(y y8) {
            Object object;
            ax.S0.a.e(y8.b);
            if (this.b == null) {
                this.b = new c();
            }
            if ((object = this.c) != null) {
                this.b.a((t.a)object);
            }
            this.b.c(this.d);
            this.b.b(this.e);
            e e8 = this.b;
            Object object2 = this.f;
            Object object3 = y8.b.d;
            object = object2;
            if (!object3.isEmpty()) {
                object = new ax.d1.e((l)object2, (List<L>)object3);
            }
            if ((object2 = this.i) != null) {
                object2.a(y8);
            }
            object2 = this.a;
            object3 = this.h;
            w w8 = this.j.a(y8);
            ax.m1.m m8 = this.k;
            return new HlsMediaSource(y8, (ax.c1.d)object2, e8, (j)object3, null, w8, m8, this.g.a(this.a, m8, (l)object, null), this.o, this.l, this.m, this.n, this.p);
        }

        @Deprecated
        public Factory i(boolean bl) {
            this.d = bl;
            return this;
        }

        public Factory j(int n8) {
            this.e = n8;
            return this;
        }

        public Factory k(f.a a8) {
            this.i = ax.S0.a.e(a8);
            return this;
        }

        public Factory l(ax.b1.z z8) {
            this.j = ax.S0.a.f(z8, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory m(ax.m1.m m8) {
            this.k = ax.S0.a.f(m8, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory n(t.a a8) {
            this.c = a8;
            return this;
        }
    }
}


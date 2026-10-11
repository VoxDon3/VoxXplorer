/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.A;
import androidx.media3.exoplayer.B;
import androidx.media3.exoplayer.C;
import androidx.media3.exoplayer.D;
import androidx.media3.exoplayer.E;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.G;
import androidx.media3.exoplayer.H;
import androidx.media3.exoplayer.I;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.J;
import androidx.media3.exoplayer.J0;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.L;
import androidx.media3.exoplayer.L0;
import androidx.media3.exoplayer.M;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N;
import androidx.media3.exoplayer.O;
import androidx.media3.exoplayer.P;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.S;
import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.V;
import androidx.media3.exoplayer.V0;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.X0;
import androidx.media3.exoplayer.Y;
import androidx.media3.exoplayer.Z;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.a1;
import androidx.media3.exoplayer.b0;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.d1;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.f0;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.h0;
import androidx.media3.exoplayer.i0;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.s;
import androidx.media3.exoplayer.t;
import androidx.media3.exoplayer.u;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v;
import androidx.media3.exoplayer.w;
import androidx.media3.exoplayer.x;
import androidx.media3.exoplayer.y;
import androidx.media3.exoplayer.z;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.P0.n;
import ax.P0.r;
import ax.S0.f;
import ax.S0.k;
import ax.S0.q;
import ax.Z0.E1;
import ax.Z0.I1;
import ax.Z0.a;
import ax.a1.B;
import ax.i1.F;
import ax.i1.g0;
import ax.i1.q0;
import ax.k1.h;
import ax.p1.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

final class X
extends ax.P0.h
implements ExoPlayer {
    private final d A;
    private long A0;
    private final androidx.media3.exoplayer.d B;
    private final V0 C;
    private final a1 D;
    private final d1 E;
    private final long F;
    private final X0 G;
    private final f<Integer> H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private ax.r7.C<Integer> O;
    private ax.Y0.Y P;
    private ax.Y0.Z Q;
    private ax.i1.g0 R;
    private ExoPlayer.c S;
    private boolean T;
    private H.b U;
    private ax.P0.A V;
    private ax.P0.A W;
    private ax.P0.v X;
    private ax.P0.v Y;
    private Object Z;
    private Surface a0;
    final ax.l1.K b;
    private SurfaceHolder b0;
    final H.b c;
    private l c0;
    private final k d;
    private boolean d0;
    private final Context e;
    private TextureView e0;
    private final ax.P0.H f;
    private int f0;
    private final M0[] g;
    private int g0;
    private final M0[] h;
    private ax.S0.I h0;
    private final ax.l1.J i;
    private ax.Y0.b i0;
    private final q j;
    private ax.Y0.b j0;
    private final n0.f k;
    private ax.P0.c k0;
    private final n0 l;
    private float l0;
    private final ax.S0.t<H.d> m;
    private boolean m0;
    private final CopyOnWriteArraySet<ExoPlayer.a> n;
    private ax.R0.c n0;
    private final N.b o;
    private boolean o0;
    private final List<e> p;
    private boolean p0;
    private final boolean q;
    private int q0;
    private final F.a r;
    private ax.P0.J r0;
    private final a s;
    private boolean s0;
    private final Looper t;
    private boolean t0;
    private final ax.m1.e u;
    private n u0;
    private final long v;
    private ax.P0.a0 v0;
    private final long w;
    private ax.P0.A w0;
    private final long x;
    private J0 x0;
    private final ax.S0.h y;
    private int y0;
    private final c z;
    private int z0;

    static {
        ax.P0.z.a("media3.exoplayer");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"HandlerLeak"})
    public X(ExoPlayer.b b8, ax.P0.H object) {
        Throwable throwable2;
        block9: {
            Object object2;
            Object object3;
            boolean bl;
            Object object4;
            Object object5;
            Object object6;
            this.d = new k();
            try {
                object6 = new StringBuilder();
                ((StringBuilder)object6).append("Init ");
                ((StringBuilder)object6).append(Integer.toHexString(System.identityHashCode(this)));
                ((StringBuilder)object6).append(" [");
                ((StringBuilder)object6).append("AndroidXMedia3/1.8.1");
                ((StringBuilder)object6).append("] [");
                ((StringBuilder)object6).append(ax.S0.d0.e);
                ((StringBuilder)object6).append("]");
                ax.S0.u.f("ExoPlayerImpl", ((StringBuilder)object6).toString());
                this.e = b8.a.getApplicationContext();
                this.s = b8.i.apply(b8.b);
                this.q0 = b8.k;
                this.r0 = b8.l;
                this.k0 = b8.m;
                this.f0 = b8.s;
                this.g0 = b8.t;
                this.m0 = b8.q;
                this.F = b8.C;
                object5 = new c(this);
                this.z = object5;
                this.A = object6 = new d();
                object6 = new Handler(b8.j);
                object4 = b8.d.get();
                object5 = object4.b((Handler)object6, (ax.o1.P)object5, (ax.a1.z)object5, (h)object5, (ax.g1.b)object5);
                this.g = object5;
                bl = ((M0[])object5).length > 0;
                ax.S0.a.g(bl);
                this.h = new M0[((M0[])object5).length];
                for (int i8 = 0; i8 < ((M0[])(object3 = this.h)).length; ++i8) {
                    object5 = this.g[i8];
                    object2 = this.z;
                    object3[i8] = object4.a((M0)object5, (Handler)object6, (ax.o1.P)object2, (ax.a1.z)object2, (h)object2, (ax.g1.b)object2);
                }
            }
            catch (Throwable throwable2) {
                break block9;
            }
            {
                this.i = object3 = b8.f.get();
                this.r = b8.e.get();
                this.u = object5 = b8.h.get();
                this.q = b8.u;
                this.Q = b8.v;
                this.v = b8.x;
                this.w = b8.y;
                this.x = b8.z;
                this.P = b8.w;
                this.T = b8.D;
                object4 = b8.j;
                this.t = object4;
                this.y = object6 = b8.b;
                if (object == null) {
                    object = this;
                }
                this.f = object;
                object2 = new C(this);
                Object object7 = new ax.S0.t((Looper)object4, (ax.S0.h)object6, object2);
                this.m = object7;
                object2 = new CopyOnWriteArraySet();
                this.n = object2;
                this.p = object2;
                this.R = object2 = new g0.a(0);
                this.S = ExoPlayer.c.b;
                object7 = this.g;
                this.b = object2 = new ax.l1.K(new ax.Y0.W[((M0[])object7).length], new ax.l1.D[((M0[])object7).length], ax.P0.V.b, null);
                super();
                this.o = object7;
                super();
                Object object8 = ((H.b.a)object7).c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, ((ax.l1.J)object3).h()).d(23, b8.r).d(25, b8.r).d(33, b8.r).d(26, b8.r).d(34, b8.r).e();
                this.c = object8;
                object7 = new H.b.a();
                this.U = ((H.b.a)object7).b((H.b)object8).a(4).a(10).e();
                this.j = object6.d((Looper)object4, null);
                this.k = object8 = new D(this);
                this.x0 = J0.k((ax.l1.K)object2);
                this.s.d0((ax.P0.H)object, (Looper)object4);
                object7 = new I1(b8.I);
                this.l = object = new n0(this.e, this.g, this.h, (ax.l1.J)object3, (ax.l1.K)object2, b8.g.get(), (ax.m1.e)object5, this.I, this.J, this.s, this.Q, b8.A, b8.B, this.T, b8.J, (Looper)object4, (ax.S0.h)object6, (n0.f)object8, (I1)object7, b8.F, this.S, this.A);
                object3 = ((n0)object).P();
                this.l0 = 1.0f;
                this.I = 0;
                this.V = object2 = ax.P0.A.I;
                this.W = object2;
                this.w0 = object2;
                this.y0 = -1;
                this.n0 = ax.R0.c.d;
                this.o0 = true;
                this.N(this.s);
                object2 = new Handler((Looper)object4);
                object5.e((Handler)object2, this.s);
                this.L1(this.z);
                long l8 = b8.c;
                if (l8 > 0L) {
                    ((n0)object).I(l8);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    androidx.media3.exoplayer.X$b.b(this.e, this, b8.E, (I1)object7);
                }
                object2 = new F(this);
                this.H = object5 = new f(0, (Looper)object3, (Looper)object4, (ax.S0.h)object6, object2);
                object2 = new G(this);
                ((f)object5).e((Runnable)object2);
                this.B = object5 = new androidx.media3.exoplayer.d(b8.a, (Looper)object3, b8.j, this.z, (ax.S0.h)object6);
                ((androidx.media3.exoplayer.d)object5).d(b8.p);
                if (b8.H) {
                    this.G = object5 = b8.K;
                    object2 = new H(this);
                    object5.b((X0.a)object2, this.e, (Looper)object4, (Looper)object3, (ax.S0.h)object6);
                } else {
                    this.G = null;
                }
                this.C = b8.r ? (object5 = new V0(b8.a, this.z, this.k0.b(), (Looper)object3, (Looper)object4, (ax.S0.h)object6)) : null;
                this.D = object4 = new a1(b8.a, (Looper)object3, (ax.S0.h)object6);
                bl = b8.o != 0;
                ((a1)object4).c(bl);
                this.E = object4 = new d1(b8.a, (Looper)object3, (ax.S0.h)object6);
                bl = b8.o == 2;
                ((d1)object4).c(bl);
                this.u0 = ax.P0.n.e;
                this.v0 = ax.P0.a0.e;
                this.h0 = ax.S0.I.c;
                ((n0)object).A1(this.P);
                ((n0)object).j1(this.k0, b8.n);
                this.u2(1, 3, this.k0);
                this.u2(2, 4, this.f0);
                this.u2(2, 5, this.g0);
                this.u2(1, 9, this.m0);
                this.u2(6, 8, this.A);
                this.v2(16, this.q0);
                this.d.f();
            }
            return;
        }
        this.d.f();
        throw throwable2;
    }

    private void A2(Object object) {
        Surface surface;
        Object object2 = this.Z;
        boolean bl = object2 != null && object2 != object;
        long l8 = bl ? this.F : -9223372036854775807L;
        boolean bl2 = this.l.J1(object, l8);
        if (bl && (object2 = this.Z) == (surface = this.a0)) {
            surface.release();
            this.a0 = null;
        }
        this.Z = object;
        if (!bl2) {
            this.C2(androidx.media3.exoplayer.s.f(new ax.Y0.N(3), 1003));
        }
    }

    static /* synthetic */ n C1(X x8, n n8) {
        x8.u0 = n8;
        return n8;
    }

    private void C2(s s8) {
        J0 j02;
        J0 j03 = this.x0;
        j03 = j03.c(j03.b);
        j03.q = j03.s;
        j03.r = 0L;
        j03 = j02 = androidx.media3.exoplayer.X.j2(j03, 1);
        if (s8 != null) {
            j03 = j02.f(s8);
        }
        ++this.K;
        this.l.T1();
        this.F2(j03, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void D2() {
        H.b b8;
        H.b b9 = this.U;
        this.U = b8 = ax.S0.d0.O(this.f, this.c);
        if (!b8.equals(b9)) {
            this.m.h(13, new L(this));
        }
    }

    static /* synthetic */ ax.Y0.b E1(X x8, ax.Y0.b b8) {
        x8.i0 = b8;
        return b8;
    }

    private void E2(boolean bl, int n8) {
        int n9 = this.R1(bl);
        J0 j02 = this.x0;
        if (j02.l == bl && j02.n == n9 && j02.m == n8) {
            return;
        }
        ++this.K;
        J0 j03 = j02;
        if (j02.p) {
            j03 = j02.a();
        }
        j03 = j03.e(bl, n8, n9);
        this.l.r1(bl, n8, n9);
        this.F2(j03, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void F2(J0 j02, int n8, boolean bl, int n9, long l8, int n10, boolean bl2) {
        boolean bl3;
        boolean bl4;
        int n11;
        J0 j03 = this.x0;
        this.x0 = j02;
        boolean bl5 = j03.a.equals(j02.a);
        Object object = this.W1(j02, j03, bl, n9, bl5 ^ true, bl2);
        boolean bl6 = (Boolean)((Pair)object).first;
        int n12 = (Integer)((Pair)object).second;
        object = null;
        Object object2 = null;
        if (bl6) {
            object = object2;
            if (!j02.a.q()) {
                n11 = j02.a.h((Object)j02.b.a, (N.b)this.o).c;
                object = j02.a.n((int)n11, (N.c)this.a).c;
            }
            this.w0 = ax.P0.A.I;
        }
        if (bl6 || !j03.j.equals(j02.j)) {
            this.w0 = this.w0.a().N(j02.j).J();
        }
        object2 = this.O1();
        boolean bl7 = ((ax.P0.A)object2).equals(this.V);
        this.V = object2;
        n11 = j03.l != j02.l ? 1 : 0;
        boolean bl8 = j03.e != j02.e;
        if (bl8 || n11 != 0) {
            this.H2();
        }
        if (bl4 = (bl3 = j03.g) != (bl2 = j02.g)) {
            this.G2(bl2);
        }
        if (!bl5) {
            this.m.h(0, new t(j02, n8));
        }
        if (bl) {
            object2 = this.f2(n9, j03, n10);
            H.e e8 = this.e2(l8);
            this.m.h(11, new S(n9, (H.e)object2, e8));
        }
        if (bl6) {
            this.m.h(1, new T((ax.P0.y)object, n12));
        }
        if (j03.f != j02.f) {
            this.m.h(10, new U(j02));
            if (j02.f != null) {
                this.m.h(10, new V(j02));
            }
        }
        if ((object = j03.i) != (object2 = j02.i)) {
            this.i.i(((ax.l1.K)object2).e);
            this.m.h(2, new W(j02));
        }
        if (!bl7) {
            object = this.V;
            this.m.h(14, new u((ax.P0.A)object));
        }
        if (bl4) {
            this.m.h(3, new v(j02));
        }
        if (bl8 || n11 != 0) {
            this.m.h(-1, new w(j02));
        }
        if (bl8) {
            this.m.h(4, new x(j02));
        }
        if (n11 != 0 || j03.m != j02.m) {
            this.m.h(5, new E(j02));
        }
        if (j03.n != j02.n) {
            this.m.h(6, new O(j02));
        }
        if (j03.n() != j02.n()) {
            this.m.h(7, new P(j02));
        }
        if (!j03.o.equals(j02.o)) {
            this.m.h(12, new Q(j02));
        }
        this.D2();
        this.m.f();
        if (j03.p != j02.p) {
            object = this.n.iterator();
            while (object.hasNext()) {
                ((ExoPlayer.a)object.next()).G(j02.p);
            }
        }
    }

    static /* synthetic */ ax.P0.v G1(X x8, ax.P0.v v8) {
        x8.X = v8;
        return v8;
    }

    private void G2(boolean bl) {
        ax.P0.J j8 = this.r0;
        if (j8 != null) {
            if (bl && !this.s0) {
                j8.a(this.q0);
                this.s0 = true;
                return;
            }
            if (!bl && this.s0) {
                j8.b(this.q0);
                this.s0 = false;
            }
        }
    }

    public static /* synthetic */ void H0(J0 j02, H.d d8) {
        d8.j(j02.o);
    }

    static /* synthetic */ ax.P0.a0 H1(X x8, ax.P0.a0 a02) {
        x8.v0 = a02;
        return a02;
    }

    private void H2() {
        int n8 = this.i();
        boolean bl = true;
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean bl2 = this.i2();
                a1 a12 = this.D;
                if (!this.v() || bl2) {
                    bl = false;
                }
                a12.d(bl);
                this.E.d(this.v());
                return;
            }
        }
        this.D.d(false);
        this.E.d(false);
    }

    public static /* synthetic */ void I0(J0 j02, H.d d8) {
        d8.E(j02.g);
        d8.I(j02.g);
    }

    private void I2() {
        this.d.b();
        if (Thread.currentThread() != this.i0().getThread()) {
            String string = ax.S0.d0.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.i0().getThread().getName());
            if (!this.o0) {
                IllegalStateException illegalStateException = this.p0 ? null : new IllegalStateException();
                ax.S0.u.i("ExoPlayerImpl", string, illegalStateException);
                this.p0 = true;
                return;
            }
            throw new IllegalStateException(string);
        }
    }

    public static /* synthetic */ void J0(ax.P0.A a8, H.d d8) {
        d8.j0(a8);
    }

    public static /* synthetic */ void K0(boolean bl, H.d d8) {
        d8.S(bl);
    }

    static /* synthetic */ ax.Y0.b K1(X x8, ax.Y0.b b8) {
        x8.j0 = b8;
        return b8;
    }

    public static /* synthetic */ void L0(J0 j02, H.d d8) {
        d8.D(j02.n);
    }

    public static /* synthetic */ void M0(J0 j02, H.d d8) {
        d8.O(j02.e);
    }

    private static ax.P0.T M1(ax.P0.T object, ax.r7.C<Integer> object2) {
        object = ((ax.P0.T)object).I();
        object2 = ((ax.r7.C)object2).n();
        while (object2.hasNext()) {
            ((T.c)object).U((Integer)object2.next(), true);
        }
        return ((T.c)object).F();
    }

    public static /* synthetic */ void N0(int n8, H.d d8) {
        d8.v(n8);
    }

    private List<I0.c> N1(int n8, List<ax.i1.F> list) {
        ArrayList<I0.c> arrayList = new ArrayList<I0.c>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            I0.c c8 = new I0.c(list.get(i8), this.q);
            arrayList.add(c8);
            this.p.add(i8 + n8, new e(c8.b, c8.a));
        }
        this.R = this.R.e(n8, arrayList.size());
        return arrayList;
    }

    public static /* synthetic */ void O0(X x8) {
        x8.H.g(ax.S0.d0.J(x8.e));
    }

    private ax.P0.A O1() {
        Object object = this.h0();
        if (((ax.P0.N)object).q()) {
            return this.w0;
        }
        object = ((ax.P0.N)object).n((int)this.b0(), (N.c)this.a).c;
        return this.w0.a().L(((ax.P0.y)object).e).J();
    }

    public static /* synthetic */ void P0(ax.P0.y y8, int n8, H.d d8) {
        d8.a0(y8, n8);
    }

    public static /* synthetic */ void Q0(X x8, H.d d8, r r8) {
        d8.c0(x8.f, new H.c(r8));
    }

    public static /* synthetic */ void R0(int n8, H.d d8) {
        d8.c(n8);
    }

    private int R1(boolean bl) {
        if (this.N) {
            return 4;
        }
        X0 x02 = this.G;
        if (x02 != null && !x02.a()) {
            return 3;
        }
        if (this.x0.n == 1 && !bl) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ void S0(X x8, H.d d8) {
        d8.W(x8.U);
    }

    private static n S1(V0 v02) {
        int n8 = 0;
        n.b b8 = new n.b(0);
        int n9 = v02 != null ? v02.l() : 0;
        b8 = b8.g(n9);
        n9 = n8;
        if (v02 != null) {
            n9 = v02.k();
        }
        return b8.f(n9).e();
    }

    public static /* synthetic */ void T0(ax.P0.T t8, H.d d8) {
        d8.U(t8);
    }

    private ax.P0.N T1() {
        return new L0(this.p, this.R);
    }

    public static /* synthetic */ void U0(int n8, int n9, H.d d8) {
        d8.o0(n8, n9);
    }

    private List<ax.i1.F> U1(List<ax.P0.y> list) {
        ArrayList<ax.i1.F> arrayList = new ArrayList<ax.i1.F>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            arrayList.add(this.r.e(list.get(i8)));
        }
        return arrayList;
    }

    public static /* synthetic */ void V0(J0 j02, H.d d8) {
        d8.N(j02.f);
    }

    private K0 V1(K0.b b8) {
        int n8 = this.a2(this.x0);
        n0 n02 = this.l;
        ax.P0.N n9 = this.x0.a;
        if (n8 == -1) {
            n8 = 0;
        }
        return new K0(n02, b8, n9, n8, this.y, n02.P());
    }

    public static /* synthetic */ void W0(ax.P0.c c8, H.d d8) {
        d8.r0(c8);
    }

    private Pair<Boolean, Integer> W1(J0 j02, J0 j03, boolean bl, int n8, boolean bl2, boolean bl3) {
        Integer n9;
        block7: {
            block11: {
                block9: {
                    int n10;
                    block10: {
                        block8: {
                            ax.P0.N n11 = j03.a;
                            ax.P0.N n12 = j02.a;
                            boolean bl4 = n12.q();
                            n9 = -1;
                            if (bl4 && n11.q()) {
                                return new Pair((Object)Boolean.FALSE, (Object)n9);
                            }
                            boolean bl5 = n12.q();
                            bl4 = n11.q();
                            n10 = 3;
                            if (bl5 != bl4) {
                                return new Pair((Object)Boolean.TRUE, (Object)3);
                            }
                            if (n11.n((int)n11.h((Object)j03.b.a, (N.b)this.o).c, (N.c)this.a).a.equals(n12.n((int)n12.h((Object)j02.b.a, (N.b)this.o).c, (N.c)this.a).a)) break block7;
                            if (!bl || n8 != 0) break block8;
                            n8 = 1;
                            break block9;
                        }
                        if (!bl || n8 != 1) break block10;
                        n8 = 2;
                        break block9;
                    }
                    if (!bl2) break block11;
                    n8 = n10;
                }
                return new Pair((Object)Boolean.TRUE, (Object)n8);
            }
            throw new IllegalStateException();
        }
        if (bl && n8 == 0 && j03.b.d < j02.b.d) {
            return new Pair((Object)Boolean.TRUE, (Object)0);
        }
        if (bl && n8 == 1 && bl3) {
            return new Pair((Object)Boolean.TRUE, (Object)2);
        }
        return new Pair((Object)Boolean.FALSE, (Object)n9);
    }

    public static /* synthetic */ void X0(J0 j02, H.d d8) {
        d8.Z(j02.l, j02.e);
    }

    public static /* synthetic */ void Y0(J0 j02, H.d d8) {
        d8.H(j02.i.d);
    }

    private long Y1(J0 j02) {
        if (j02.b.b()) {
            j02.a.h(j02.b.a, this.o);
            if (j02.c == -9223372036854775807L) {
                return j02.a.n(this.a2(j02), this.a).b();
            }
            return this.o.n() + ax.S0.d0.E1(j02.c);
        }
        return ax.S0.d0.E1(this.Z1(j02));
    }

    public static /* synthetic */ void Z0(J0 j02, H.d d8) {
        d8.t0(j02.n());
    }

    private long Z1(J0 j02) {
        if (j02.a.q()) {
            return ax.S0.d0.a1(this.A0);
        }
        long l8 = j02.p ? j02.m() : j02.s;
        if (j02.b.b()) {
            return l8;
        }
        return this.q2(j02.a, j02.b, l8);
    }

    public static /* synthetic */ void a1(J0 j02, H.d d8) {
        d8.i0(j02.l, j02.m);
    }

    private int a2(J0 j02) {
        if (j02.a.q()) {
            return this.y0;
        }
        return j02.a.h((Object)j02.b.a, (N.b)this.o).c;
    }

    public static /* synthetic */ void b1(X x8, boolean bl) {
        x8.p2(bl);
    }

    private Pair<Object, Long> b2(ax.P0.N n8, ax.P0.N n9, int n10, long l8) {
        block4: {
            boolean bl = n8.q();
            long l9 = -9223372036854775807L;
            int n11 = -1;
            if (!bl && !n9.q()) {
                Pair<Object, Long> pair = n8.j(this.a, this.o, n10, ax.S0.d0.a1(l8));
                Object object = ax.S0.d0.i(pair).first;
                if (n9.b(object) != -1) {
                    return pair;
                }
                n10 = androidx.media3.exoplayer.n0.Y0(this.a, this.o, this.I, this.J, object, n8, n9);
                if (n10 != -1) {
                    return this.l2(n9, n10, n9.n(n10, this.a).b());
                }
                return this.l2(n9, -1, -9223372036854775807L);
            }
            boolean bl2 = !n8.q() && n9.q();
            if (bl2) {
                n10 = n11;
            }
            if (!bl2) break block4;
            l8 = l9;
        }
        return this.l2(n9, n10, l8);
    }

    public static /* synthetic */ void c1(X x8, n0.e e8) {
        x8.h2(e8);
    }

    public static /* synthetic */ void d1(int n8, H.e e8, H.e e9, H.d d8) {
        d8.F(n8);
        d8.p0(e8, e9, n8);
    }

    public static /* synthetic */ void e1(float f8, H.d d8) {
        d8.L(f8);
    }

    private H.e e2(long l8) {
        Object object;
        int n8;
        Object object2;
        Object object3;
        int n9 = this.b0();
        if (!this.x0.a.q()) {
            object3 = this.x0;
            object2 = ((J0)object3).b.a;
            ((J0)object3).a.h(object2, this.o);
            n8 = this.x0.a.b(object2);
            object = this.x0.a.n((int)n9, (N.c)this.a).a;
            object3 = this.a.c;
        } else {
            object = null;
            object3 = null;
            object2 = null;
            n8 = -1;
        }
        long l9 = ax.S0.d0.E1(l8);
        l8 = this.x0.b.b() ? ax.S0.d0.E1(androidx.media3.exoplayer.X.g2(this.x0)) : l9;
        F.b b8 = this.x0.b;
        return new H.e(object, n9, (ax.P0.y)object3, object2, n8, l9, l8, b8.b, b8.c);
    }

    public static /* synthetic */ void f1(H.d d8) {
        d8.N(androidx.media3.exoplayer.s.f(new ax.Y0.N(1), 1003));
    }

    /*
     * Unable to fully structure code
     */
    private H.e f2(int var1_1, J0 var2_2, int var3_3) {
        block6: {
            block7: {
                block8: {
                    var13_4 = new N.b();
                    if (!var2_2.a.q()) {
                        var12_5 = var2_2.b.a;
                        var2_2.a.h(var12_5, var13_4);
                        var4_6 = var13_4.c;
                        var3_3 = var2_2.a.b(var12_5);
                        var10_7 = var2_2.a.n((int)var4_6, (N.c)this.a).a;
                        var11_8 = this.a.c;
                        var5_9 = var3_3;
                    } else {
                        var10_7 = null;
                        var11_8 = null;
                        var12_5 = var11_8;
                        var5_9 = -1;
                        var4_6 = var3_3;
                    }
                    if (var1_1 != 0) break block7;
                    if (!var2_2.b.b()) break block8;
                    var14_10 = var2_2.b;
                    var6_11 = var13_4.b(var14_10.b, var14_10.c);
                    var8_12 = androidx.media3.exoplayer.X.g2((J0)var2_2);
                    break block6;
                }
                if (var2_2.b.e != -1) {
                    var6_11 = androidx.media3.exoplayer.X.g2(this.x0);
lbl26:
                    // 3 sources

                    while (true) {
                        var8_12 = var6_11;
                        break block6;
                        break;
                    }
                }
                var6_11 = var13_4.e + var13_4.d;
                ** GOTO lbl26
            }
            if (var2_2.b.b()) {
                var6_11 = var2_2.s;
                var8_12 = androidx.media3.exoplayer.X.g2((J0)var2_2);
            } else {
                var6_11 = var13_4.e + var2_2.s;
                ** continue;
            }
        }
        var6_11 = ax.S0.d0.E1(var6_11);
        var8_12 = ax.S0.d0.E1(var8_12);
        var2_2 = var2_2.b;
        return new H.e(var10_7, var4_6, var11_8, var12_5, var5_9, var6_11, var8_12, var2_2.b, var2_2.c);
    }

    public static /* synthetic */ void g1(X x8, n0.e e8) {
        x8.j.c(new J(x8, e8));
    }

    private static long g2(J0 j02) {
        N.c c8 = new N.c();
        N.b b8 = new N.b();
        j02.a.h(j02.b.a, b8);
        if (j02.c == -9223372036854775807L) {
            return j02.a.n(b8.c, c8).c();
        }
        return b8.o() + j02.c;
    }

    public static /* synthetic */ void h1(X x8, int n8, int n9) {
        x8.o2(n8, n9);
    }

    private void h2(n0.e e8) {
        int n8;
        this.K = n8 = this.K - e8.c;
        boolean bl = e8.d;
        boolean bl2 = true;
        if (bl) {
            this.L = e8.e;
            this.M = true;
        }
        if (n8 == 0) {
            List<ax.P0.N> list;
            ax.P0.N n9 = e8.b.a;
            if (!this.x0.a.q() && n9.q()) {
                this.y0 = -1;
                this.A0 = 0L;
                this.z0 = 0;
            }
            if (!n9.q()) {
                list = ((L0)n9).F();
                bl = list.size() == this.p.size();
                ax.S0.a.g(bl);
                for (n8 = 0; n8 < list.size(); ++n8) {
                    this.p.get(n8).a(list.get(n8));
                }
            }
            bl = this.M;
            long l8 = -9223372036854775807L;
            if (bl) {
                bl = bl2;
                if (e8.b.b.equals(this.x0.b)) {
                    bl = e8.b.d != this.x0.s ? bl2 : false;
                }
                if (bl) {
                    if (!n9.q() && !e8.b.b.b()) {
                        list = e8.b;
                        l8 = this.q2(n9, ((J0)((Object)list)).b, ((J0)((Object)list)).d);
                    } else {
                        l8 = e8.b.d;
                    }
                }
            } else {
                bl = false;
            }
            this.M = false;
            this.F2(e8.b, 1, bl, this.L, l8, -1, false);
        }
    }

    public static /* synthetic */ void i1(J0 j02, int n8, H.d d8) {
        d8.P(j02.a, n8);
    }

    public static /* synthetic */ void j1(J0 j02, H.d d8) {
        d8.J(j02.f);
    }

    private static J0 j2(J0 j02, int n8) {
        j02 = j02.h(n8);
        if (n8 != 1 && n8 != 4) {
            return j02;
        }
        return j02.b(false);
    }

    static /* synthetic */ ax.P0.v k1(X x8, ax.P0.v v8) {
        x8.Y = v8;
        return v8;
    }

    private J0 k2(J0 object, ax.P0.N object2, Pair<Object, Long> object3) {
        long l8;
        long l9;
        boolean bl = ((ax.P0.N)object2).q() || object3 != null;
        ax.S0.a.a(bl);
        List<ax.P0.C> list = ((J0)object).a;
        long l10 = this.Y1((J0)object);
        J0 j02 = ((J0)object).j((ax.P0.N)object2);
        if (((ax.P0.N)object2).q()) {
            object = J0.l();
            l10 = ax.S0.d0.a1(this.A0);
            object = j02.d((F.b)object, l10, l10, l10, 0L, ax.i1.q0.d, this.b, ax.r7.z.<ax.P0.C>z()).c((F.b)object);
            ((J0)object).q = ((J0)object).s;
            return object;
        }
        Object object4 = j02.b.a;
        bl = object4.equals(ax.S0.d0.i(object3).first);
        object = !bl ? new F.b(object3.first) : j02.b;
        long l11 = (Long)object3.second;
        l10 = l9 = ax.S0.d0.a1(l10);
        if (!((ax.P0.N)((Object)list)).q()) {
            l10 = l9 - ((ax.P0.N)((Object)list)).h(object4, this.o).o();
        }
        if (bl && (l8 = l11 == l10 ? 0 : (l11 < l10 ? -1 : 1)) >= 0) {
            if (l8 == false) {
                l8 = ((ax.P0.N)object2).b(j02.k.a);
                if (l8 != -1 && ((ax.P0.N)object2).f((int)l8, (N.b)this.o).c == ((ax.P0.N)object2).h((Object)((F.b)object).a, (N.b)this.o).c) {
                    return j02;
                }
                ((ax.P0.N)object2).h(((F.b)object).a, this.o);
                l10 = ((F.b)object).b() ? this.o.b(((F.b)object).b, ((F.b)object).c) : this.o.d;
                object = j02.d((F.b)object, j02.s, j02.s, j02.d, l10 - j02.s, j02.h, j02.i, j02.j).c((F.b)object);
                ((J0)object).q = l10;
                return object;
            }
            ax.S0.a.g(((F.b)object).b() ^ true);
            l9 = Math.max(0L, j02.r - (l11 - l10));
            l10 = j02.q;
            if (j02.k.equals(j02.b)) {
                l10 = l11 + l9;
            }
            object = j02.d((F.b)object, l11, l11, l11, l9, j02.h, j02.i, j02.j);
            ((J0)object).q = l10;
            return object;
        }
        ax.S0.a.g(((F.b)object).b() ^ true);
        object2 = !bl ? ax.i1.q0.d : j02.h;
        object3 = !bl ? this.b : j02.i;
        list = !bl ? ax.r7.z.z() : j02.j;
        object = j02.d((F.b)object, l11, l11, l11, 0L, (q0)object2, (ax.l1.K)object3, list).c((F.b)object);
        ((J0)object).q = l11;
        return object;
    }

    private Pair<Object, Long> l2(ax.P0.N n8, int n9, long l8) {
        int n10;
        block3: {
            block2: {
                if (n8.q()) {
                    this.y0 = n9;
                    long l9 = l8;
                    if (l8 == -9223372036854775807L) {
                        l9 = 0L;
                    }
                    this.A0 = l9;
                    this.z0 = 0;
                    return null;
                }
                if (n9 == -1) break block2;
                n10 = n9;
                if (n9 < n8.p()) break block3;
            }
            n10 = n8.a(this.J);
            l8 = n8.n(n10, this.a).b();
        }
        return n8.j(this.a, this.o, n10, ax.S0.d0.a1(l8));
    }

    static /* synthetic */ boolean m1(X x8, boolean bl) {
        x8.m0 = bl;
        return bl;
    }

    private void m2(int n8, int n9) {
        if (n8 == this.h0.b() && n9 == this.h0.a()) {
            return;
        }
        this.h0 = new ax.S0.I(n8, n9);
        this.m.k(24, new z(n8, n9));
        this.u2(2, 14, new ax.S0.I(n8, n9));
    }

    private void n2() {
        J0 j02 = this.x0;
        this.E2(j02.l, j02.m);
    }

    static /* synthetic */ ax.R0.c o1(X x8, ax.R0.c c8) {
        x8.n0 = c8;
        return c8;
    }

    private void o2(int n8, int n9) {
        this.I2();
        this.u2(1, 10, n9);
        this.u2(2, 10, n9);
        this.m.k(21, new N(n9));
    }

    private void p2(boolean bl) {
        block5: {
            block4: {
                if (this.t0) break block4;
                if (!bl) break block5;
                if (this.x0.n == 3) {
                    this.n2();
                }
            }
            return;
        }
        this.n2();
    }

    static /* synthetic */ ax.P0.A q1(X x8, ax.P0.A a8) {
        x8.w0 = a8;
        return a8;
    }

    private long q2(ax.P0.N n8, F.b b8, long l8) {
        n8.h(b8.a, this.o);
        return l8 + this.o.o();
    }

    private J0 r2(J0 object, int n8, int n9) {
        int n10 = this.a2((J0)object);
        long l8 = this.Y1((J0)object);
        Object object2 = ((J0)object).a;
        int n11 = this.p.size();
        ++this.K;
        this.s2(n8, n9);
        ax.P0.N n12 = this.T1();
        object2 = this.k2((J0)object, n12, this.b2((ax.P0.N)object2, n12, n10, l8));
        int n13 = ((J0)object2).e;
        object = object2;
        if (n13 != 1) {
            object = object2;
            if (n13 != 4) {
                object = object2;
                if (n8 < n9) {
                    object = object2;
                    if (n9 == n11) {
                        object = object2;
                        if (n10 >= ((J0)object2).a.p()) {
                            object = androidx.media3.exoplayer.X.j2((J0)object2, 4);
                        }
                    }
                }
            }
        }
        this.l.N0(n8, n9, this.R);
        return object;
    }

    private void s2(int n8, int n9) {
        for (int i8 = n9 - 1; i8 >= n8; --i8) {
            this.p.remove(i8);
        }
        this.R = this.R.a(n8, n9);
    }

    static /* synthetic */ ax.P0.A t1(X x8, ax.P0.A a8) {
        x8.V = a8;
        return a8;
    }

    private void t2() {
        TextureView textureView;
        if (this.c0 != null) {
            this.V1(this.A).m(10000).l(null).k();
            this.c0.g(this.z);
            this.c0 = null;
        }
        if ((textureView = this.e0) != null) {
            if (textureView.getSurfaceTextureListener() != this.z) {
                ax.S0.u.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.e0.setSurfaceTextureListener(null);
            }
            this.e0 = null;
        }
        if ((textureView = this.b0) != null) {
            textureView.removeCallback((SurfaceHolder.Callback)this.z);
            this.b0 = null;
        }
    }

    private void u2(int n8, int n9, Object object) {
        Object object2;
        int n10;
        Object object3 = this.g;
        int n11 = ((M0[])object3).length;
        int n12 = 0;
        for (n10 = 0; n10 < n11; ++n10) {
            object2 = object3[n10];
            if (n8 != -1 && object2.k() != n8) continue;
            this.V1((K0.b)object2).m(n9).l(object).k();
        }
        object2 = this.h;
        n11 = ((M0[])object2).length;
        for (n10 = n12; n10 < n11; ++n10) {
            object3 = object2[n10];
            if (object3 == null || n8 != -1 && object3.k() != n8) continue;
            this.V1((K0.b)object3).m(n9).l(object).k();
        }
    }

    private void v2(int n8, Object object) {
        this.u2(-1, n8, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void x2(List<ax.i1.F> var1_1, int var2_2, long var3_3, boolean var5_4) {
        var6_5 = this.a2(this.x0);
        var8_6 = this.s0();
        ++this.K;
        if (!this.p.isEmpty()) {
            this.s2(0, this.p.size());
        }
        var1_1 /* !! */  = this.N1(0, var1_1 /* !! */ );
        var10_7 = this.T1();
        if (!var10_7.q() && var2_2 >= var10_7.p()) {
            throw new ax.P0.w((ax.P0.N)var10_7, var2_2, var3_3);
        }
        if (var5_4) {
            var2_2 = var10_7.a(this.J);
            var3_3 = -9223372036854775807L;
            while (true) {
                var6_5 = var2_2;
                break;
            }
        } else {
            if (var2_2 != -1) ** continue;
            var3_3 = var8_6;
        }
        var11_8 = this.k2(this.x0, (ax.P0.N)var10_7, this.l2((ax.P0.N)var10_7, var6_5, var3_3));
        var2_2 = var7_9 = var11_8.e;
        if (var6_5 != -1) {
            var2_2 = var7_9;
            if (var7_9 != 1) {
                var2_2 = !var10_7.q() && var6_5 < var10_7.p() ? 2 : 4;
            }
        }
        var10_7 = androidx.media3.exoplayer.X.j2(var11_8, var2_2);
        this.l.o1(var1_1 /* !! */ , var6_5, ax.S0.d0.a1(var3_3), this.R);
        var5_4 = this.x0.b.a.equals(var10_7.b.a) == false && this.x0.a.q() == false;
        this.F2((J0)var10_7, 0, var5_4, 4, this.Z1((J0)var10_7), -1, false);
    }

    private void y2(SurfaceHolder surfaceHolder) {
        this.d0 = false;
        this.b0 = surfaceHolder;
        surfaceHolder.addCallback((SurfaceHolder.Callback)this.z);
        surfaceHolder = this.b0.getSurface();
        if (surfaceHolder != null && surfaceHolder.isValid()) {
            surfaceHolder = this.b0.getSurfaceFrame();
            this.m2(surfaceHolder.width(), surfaceHolder.height());
            return;
        }
        this.m2(0, 0);
    }

    private void z2(SurfaceTexture surfaceTexture) {
        surfaceTexture = new Surface(surfaceTexture);
        this.A2(surfaceTexture);
        this.a0 = surfaceTexture;
    }

    @Override
    public long A() {
        this.I2();
        return this.x;
    }

    @Override
    protected void A0(int n8, long l8, int n9, boolean bl) {
        J0 j02;
        ax.P0.N n10;
        block10: {
            block9: {
                block8: {
                    block7: {
                        this.I2();
                        if (n8 == -1) break block7;
                        boolean bl2 = n8 >= 0;
                        ax.S0.a.a(bl2);
                        n10 = this.x0.a;
                        if (n10.q() || n8 < n10.p()) break block8;
                    }
                    return;
                }
                this.s.R();
                ++this.K;
                if (this.p()) {
                    ax.S0.u.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    n0.e e8 = new n0.e(this.x0);
                    e8.b(1);
                    this.k.a(e8);
                    return;
                }
                J0 j03 = this.x0;
                n9 = j03.e;
                if (n9 == 3) break block9;
                j02 = j03;
                if (n9 != 4) break block10;
                j02 = j03;
                if (n10.q()) break block10;
            }
            j02 = androidx.media3.exoplayer.X.j2(this.x0, 2);
        }
        n9 = this.b0();
        j02 = this.k2(j02, n10, this.l2(n10, n8, l8));
        this.l.a1(n10, n8, ax.S0.d0.a1(l8));
        this.F2(j02, 0, true, 1, this.Z1(j02), n9, bl);
    }

    public void B2(SurfaceHolder surfaceHolder) {
        this.I2();
        if (surfaceHolder == null) {
            this.P1();
            return;
        }
        this.t2();
        this.d0 = true;
        this.b0 = surfaceHolder;
        surfaceHolder.addCallback((SurfaceHolder.Callback)this.z);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            this.A2(surface);
            surfaceHolder = surfaceHolder.getSurfaceFrame();
            this.m2(surfaceHolder.width(), surfaceHolder.height());
            return;
        }
        this.A2(null);
        this.m2(0, 0);
    }

    @Override
    public int D() {
        this.I2();
        if (this.x0.a.q()) {
            return this.z0;
        }
        J0 j02 = this.x0;
        return j02.a.b(j02.b.a);
    }

    @Override
    public void E(TextureView textureView) {
        this.I2();
        if (textureView != null && textureView == this.e0) {
            this.P1();
        }
    }

    @Override
    public ax.P0.a0 F() {
        this.I2();
        return this.v0;
    }

    @Override
    public void G(ax.P0.c c8, boolean bl) {
        this.I2();
        if (this.t0) {
            return;
        }
        if (!j.Objects.equals((Object)this.k0, (Object)c8)) {
            this.k0 = c8;
            this.u2(1, 3, c8);
            V0 v02 = this.C;
            if (v02 != null) {
                v02.o(c8.b());
            }
            this.m.h(20, new K(c8));
        }
        this.l.j1(this.k0, bl);
        this.m.f();
    }

    @Override
    public void I(List<ax.P0.y> list, boolean bl) {
        this.I2();
        this.w2(this.U1(list), bl);
    }

    @Override
    public int K() {
        this.I2();
        if (this.p()) {
            return this.x0.b.c;
        }
        return -1;
    }

    @Override
    public void L(SurfaceView object) {
        this.I2();
        if (object instanceof ax.o1.y) {
            this.t2();
            this.A2(object);
            this.y2(object.getHolder());
            return;
        }
        if (object instanceof l) {
            this.t2();
            this.c0 = (l)((Object)object);
            this.V1(this.A).m(10000).l((Object)this.c0).k();
            this.c0.d(this.z);
            this.A2(this.c0.getVideoSurface());
            this.y2(object.getHolder());
            return;
        }
        object = object == null ? null : object.getHolder();
        this.B2((SurfaceHolder)object);
    }

    public void L1(ExoPlayer.a a8) {
        this.n.add(a8);
    }

    @Override
    public ax.S0.I M() {
        this.I2();
        return this.h0;
    }

    @Override
    public void N(H.d d8) {
        this.m.c(ax.S0.a.e(d8));
    }

    @Override
    public void O(int n8, int n9) {
        this.I2();
        boolean bl = n8 >= 0 && n9 >= n8;
        ax.S0.a.a(bl);
        int n10 = this.p.size();
        n9 = Math.min(n9, n10);
        if (n8 < n10 && n8 != n9) {
            J0 j02 = this.r2(this.x0, n8, n9);
            this.F2(j02, 0, j02.b.a.equals(this.x0.b.a) ^ true, 4, this.Z1(j02), -1, false);
        }
    }

    public void P1() {
        this.I2();
        this.t2();
        this.A2(null);
        this.m2(0, 0);
    }

    public void Q1(SurfaceHolder surfaceHolder) {
        this.I2();
        if (surfaceHolder != null && surfaceHolder == this.b0) {
            this.P1();
        }
    }

    @Override
    public void S(boolean bl) {
        this.I2();
        this.E2(bl, 1);
    }

    @Override
    public long T() {
        this.I2();
        return this.w;
    }

    @Override
    public long V() {
        this.I2();
        return this.Y1(this.x0);
    }

    @Override
    public ax.P0.V X() {
        this.I2();
        return this.x0.i.d;
    }

    public ax.S0.h X1() {
        return this.y;
    }

    @Override
    public ax.R0.c Z() {
        this.I2();
        return this.n0;
    }

    @Override
    public void a(int n8) {
        this.I2();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                this.D.c(true);
                this.E.c(true);
                return;
            }
            this.D.c(true);
            this.E.c(false);
            return;
        }
        this.D.c(false);
        this.E.c(false);
    }

    @Override
    public int a0() {
        this.I2();
        if (this.p()) {
            return this.x0.b.b;
        }
        return -1;
    }

    @Override
    public int b() {
        this.I2();
        return this.H.d();
    }

    @Override
    public int b0() {
        int n8;
        this.I2();
        int n9 = n8 = this.a2(this.x0);
        if (n8 == -1) {
            n9 = 0;
        }
        return n9;
    }

    @Override
    public void c(ax.Y0.Z z8) {
        this.I2();
        ax.Y0.Z z9 = z8;
        if (z8 == null) {
            z9 = ax.Y0.Z.g;
        }
        if (!this.Q.equals(z9)) {
            this.Q = z9;
            this.l.C1(z9);
        }
    }

    public Looper c2() {
        return this.l.P();
    }

    @Override
    public void d() {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("Release ");
        ((StringBuilder)object).append(Integer.toHexString(System.identityHashCode(this)));
        ((StringBuilder)object).append(" [");
        ((StringBuilder)object).append("AndroidXMedia3/1.8.1");
        ((StringBuilder)object).append("] [");
        ((StringBuilder)object).append(ax.S0.d0.e);
        ((StringBuilder)object).append("] [");
        ((StringBuilder)object).append(ax.P0.z.b());
        ((StringBuilder)object).append("]");
        ax.S0.u.f("ExoPlayerImpl", ((StringBuilder)object).toString());
        this.I2();
        this.B.d(false);
        object = this.C;
        if (object != null) {
            ((V0)object).n();
        }
        this.D.d(false);
        this.E.d(false);
        object = this.G;
        if (object != null) {
            object.f();
        }
        if (!this.l.J0()) {
            this.m.k(10, new A());
        }
        this.m.i();
        this.j.k(null);
        this.u.g(this.s);
        object = this.x0;
        if (((J0)object).p) {
            this.x0 = ((J0)object).a();
        }
        this.x0 = object = androidx.media3.exoplayer.X.j2(this.x0, 1);
        this.x0 = object = ((J0)object).c(((J0)object).b);
        ((J0)object).q = ((J0)object).s;
        this.x0.r = 0L;
        this.s.d();
        this.t2();
        object = this.a0;
        if (object != null) {
            object.release();
            this.a0 = null;
        }
        if (this.s0) {
            ax.S0.a.e(this.r0).b(this.q0);
            this.s0 = false;
        }
        this.n0 = ax.R0.c.d;
        this.t0 = true;
    }

    @Override
    public void d0(SurfaceView object) {
        this.I2();
        object = object == null ? null : object.getHolder();
        this.Q1((SurfaceHolder)object);
    }

    public s d2() {
        this.I2();
        return this.x0.f;
    }

    @Override
    public void e(ax.P0.G object) {
        this.I2();
        ax.P0.G g8 = object;
        if (object == null) {
            g8 = ax.P0.G.d;
        }
        if (this.x0.o.equals(g8)) {
            return;
        }
        object = this.x0.g(g8);
        ++this.K;
        this.l.t1(g8);
        this.F2((J0)object, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public int f0() {
        this.I2();
        return this.x0.n;
    }

    @Override
    public long g0() {
        this.I2();
        if (this.p()) {
            J0 j02 = this.x0;
            F.b b8 = j02.b;
            j02.a.h(b8.a, this.o);
            return ax.S0.d0.E1(this.o.b(b8.b, b8.c));
        }
        return this.C();
    }

    @Override
    public ax.P0.G h() {
        this.I2();
        return this.x0.o;
    }

    @Override
    public ax.P0.N h0() {
        this.I2();
        return this.x0.a;
    }

    @Override
    public int i() {
        this.I2();
        return this.x0.e;
    }

    @Override
    public Looper i0() {
        return this.t;
    }

    public boolean i2() {
        this.I2();
        return this.x0.p;
    }

    @Override
    public boolean isScrubbingModeEnabled() {
        this.I2();
        return this.N;
    }

    @Override
    public void j(int n8) {
        this.I2();
        if (this.I != n8) {
            this.I = n8;
            this.l.w1(n8);
            this.m.h(8, new B(n8));
            this.D2();
            this.m.f();
        }
    }

    @Override
    public boolean j0() {
        this.I2();
        return this.J;
    }

    @Override
    public void k() {
        this.I2();
        J0 j02 = this.x0;
        if (j02.e != 1) {
            return;
        }
        j02 = j02.f(null);
        int n8 = j02.a.q() ? 4 : 2;
        j02 = androidx.media3.exoplayer.X.j2(j02, n8);
        ++this.K;
        this.l.H0();
        this.F2(j02, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public ax.P0.T k0() {
        ax.P0.T t8;
        this.I2();
        ax.P0.T t9 = t8 = this.i.c();
        if (this.N) {
            t9 = t8.I().L(this.O).F();
        }
        return t9;
    }

    @Override
    public void l(float f8) {
        this.I2();
        f8 = ax.S0.d0.o(f8, 0.0f, 1.0f);
        if (this.l0 == f8) {
            return;
        }
        this.l0 = f8;
        this.l.L1(f8);
        this.m.k(22, new y(f8));
    }

    @Override
    public long l0() {
        this.I2();
        if (this.x0.a.q()) {
            return this.A0;
        }
        Object object = this.x0;
        if (((J0)object).k.d != ((J0)object).b.d) {
            return ((J0)object).a.n(this.b0(), this.a).d();
        }
        long l8 = ((J0)object).q;
        if (this.x0.k.b()) {
            object = this.x0;
            object = ((J0)object).a.h(((J0)object).k.a, this.o);
            l8 = ((N.b)object).f(this.x0.k.b);
            if (l8 == Long.MIN_VALUE) {
                l8 = ((N.b)object).d;
            }
        }
        object = this.x0;
        return ax.S0.d0.E1(this.q2(((J0)object).a, ((J0)object).k, l8));
    }

    @Override
    public int o() {
        this.I2();
        return this.I;
    }

    @Override
    public void o0(TextureView textureView) {
        this.I2();
        if (textureView == null) {
            this.P1();
            return;
        }
        this.t2();
        this.e0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ax.S0.u.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener)this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            this.A2(null);
            this.m2(0, 0);
            return;
        }
        this.z2(surfaceTexture);
        this.m2(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public boolean p() {
        this.I2();
        return this.x0.b.b();
    }

    @Override
    public void q(H.d d8) {
        this.I2();
        this.m.j(ax.S0.a.e(d8));
    }

    @Override
    public ax.P0.A q0() {
        this.I2();
        return this.V;
    }

    @Override
    public long r() {
        this.I2();
        return ax.S0.d0.E1(this.x0.r);
    }

    @Override
    public void r0(ax.Z0.c c8) {
        this.s.f0(ax.S0.a.e(c8));
    }

    @Override
    public long s0() {
        this.I2();
        return ax.S0.d0.E1(this.Z1(this.x0));
    }

    @Override
    public void setImageOutput(ImageOutput imageOutput) {
        this.I2();
        this.u2(4, 15, imageOutput);
    }

    @Override
    public void setScrubbingModeEnabled(boolean bl) {
        this.I2();
        if (bl == this.N) {
            return;
        }
        this.N = bl;
        if (!this.P.a.isEmpty() && this.i.h()) {
            ax.P0.T t8;
            ax.P0.T t9 = this.i.c();
            if (bl) {
                this.O = t9.E;
                t8 = androidx.media3.exoplayer.X.M1(t9, this.P.a);
            } else {
                t8 = t9.I().L(this.O).F();
                this.O = null;
            }
            if (!t8.equals(t9)) {
                this.i.m(t8);
            }
        }
        this.l.y1(bl);
        this.n2();
    }

    @Override
    public void stop() {
        this.I2();
        this.C2(null);
        this.n0 = new ax.R0.c(ax.r7.z.<ax.R0.a>z(), this.x0.s);
    }

    @Override
    public long t0() {
        this.I2();
        return this.v;
    }

    @Override
    public H.b u() {
        this.I2();
        return this.U;
    }

    @Override
    public boolean v() {
        this.I2();
        return this.x0.l;
    }

    @Override
    public void w(ax.P0.T t8) {
        this.I2();
        if (this.i.h()) {
            ax.P0.T t9;
            ax.P0.T t10 = this.k0();
            if (this.N) {
                this.O = t8.E;
                t9 = androidx.media3.exoplayer.X.M1(t8, this.P.a);
            } else {
                t9 = t8;
            }
            if (!t9.equals(this.i.c())) {
                this.i.m(t9);
            }
            if (!t10.equals(t8)) {
                this.m.k(19, new I(t8));
            }
        }
    }

    public void w2(List<ax.i1.F> list, boolean bl) {
        this.I2();
        this.x2(list, -1, -9223372036854775807L, bl);
    }

    @Override
    public void z(boolean bl) {
        this.I2();
        if (this.J != bl) {
            this.J = bl;
            this.l.E1(bl);
            this.m.h(9, new M(bl));
            this.D2();
            this.m.f();
        }
    }

    private static final class b {
        public static /* synthetic */ void a(Context object, boolean bl, X x8, I1 i12) {
            if ((object = E1.F0((Context)object)) == null) {
                ax.S0.u.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (bl) {
                x8.r0((ax.Z0.c)object);
            }
            i12.b(((E1)object).M0());
        }

        public static void b(Context context, X x8, boolean bl, I1 i12) {
            x8.X1().d(x8.c2(), null).c(new Y(context, bl, x8, i12));
        }
    }

    private final class c
    implements ax.o1.P,
    ax.a1.z,
    h,
    ax.g1.b,
    SurfaceHolder.Callback,
    TextureView.SurfaceTextureListener,
    l.b,
    d.b,
    V0.b,
    ExoPlayer.a {
        final X a;

        private c(X x8) {
            this.a = x8;
        }

        public static /* synthetic */ void H(int n8, boolean bl, H.d d8) {
            d8.Y(n8, bl);
        }

        public static /* synthetic */ void I(n n8, H.d d8) {
            d8.k0(n8);
        }

        public static /* synthetic */ Integer J(int n8, Integer n9) {
            return n8;
        }

        public static /* synthetic */ void K(ax.P0.C c8, H.d d8) {
            d8.r(c8);
        }

        public static /* synthetic */ void L(ax.P0.a0 a02, H.d d8) {
            d8.a(a02);
        }

        public static /* synthetic */ Integer M(int n8, Integer n9) {
            return n8;
        }

        public static /* synthetic */ void N(c c8, H.d d8) {
            d8.j0(c8.a.V);
        }

        public static /* synthetic */ void O(ax.R0.c c8, H.d d8) {
            d8.s(c8);
        }

        public static /* synthetic */ void P(boolean bl, H.d d8) {
            d8.e(bl);
        }

        public static /* synthetic */ void Q(List list, H.d d8) {
            d8.t(list);
        }

        @Override
        public void A(int n8, long l8, long l9) {
            this.a.s.A(n8, l8, l9);
        }

        @Override
        public void B(ax.Y0.b b8) {
            androidx.media3.exoplayer.X.E1(this.a, b8);
            this.a.s.B(b8);
        }

        @Override
        public void C(long l8, int n8) {
            this.a.s.C(l8, n8);
        }

        @Override
        public /* synthetic */ void D(boolean bl) {
            ax.Y0.C.a(this, bl);
        }

        @Override
        public void E(Surface surface) {
            this.a.A2(surface);
        }

        @Override
        public void F(int n8, boolean bl) {
            this.a.m.k(30, new g0(n8, bl));
        }

        @Override
        public void G(boolean bl) {
            this.a.H2();
        }

        @Override
        public void a(ax.P0.a0 a02) {
            androidx.media3.exoplayer.X.H1(this.a, a02);
            this.a.m.k(25, new e0(a02));
        }

        @Override
        public void b(B.a a8) {
            this.a.s.b(a8);
        }

        @Override
        public void c(int n8) {
            this.a.H.h(new i0(n8), new a0(n8));
        }

        @Override
        public void d(int n8) {
            n n9 = androidx.media3.exoplayer.X.S1(this.a.C);
            if (!n9.equals(this.a.u0)) {
                androidx.media3.exoplayer.X.C1(this.a, n9);
                this.a.m.k(29, new f0(n9));
            }
        }

        @Override
        public void e(boolean bl) {
            if (this.a.m0 == bl) {
                return;
            }
            androidx.media3.exoplayer.X.m1(this.a, bl);
            this.a.m.k(23, new h0(bl));
        }

        @Override
        public void f(Exception exception) {
            this.a.s.f(exception);
        }

        @Override
        public void g(B.a a8) {
            this.a.s.g(a8);
        }

        @Override
        public void h(ax.P0.v v8, ax.Y0.c c8) {
            androidx.media3.exoplayer.X.G1(this.a, v8);
            this.a.s.h(v8, c8);
        }

        @Override
        public void i(String string) {
            this.a.s.i(string);
        }

        @Override
        public void j() {
            this.a.E2(false, 3);
        }

        @Override
        public void k(String string, long l8, long l9) {
            this.a.s.k(string, l8, l9);
        }

        @Override
        public void l(ax.P0.v v8, ax.Y0.c c8) {
            androidx.media3.exoplayer.X.k1(this.a, v8);
            this.a.s.l(v8, c8);
        }

        @Override
        public void m(ax.Y0.b b8) {
            this.a.s.m(b8);
            androidx.media3.exoplayer.X.G1(this.a, null);
            androidx.media3.exoplayer.X.E1(this.a, null);
        }

        @Override
        public void n(String string) {
            this.a.s.n(string);
        }

        @Override
        public void o(String string, long l8, long l9) {
            this.a.s.o(string, l8, l9);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n8, int n9) {
            this.a.z2(surfaceTexture);
            this.a.m2(n8, n9);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.a.A2(null);
            this.a.m2(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n8, int n9) {
            this.a.m2(n8, n9);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void p(int n8, long l8) {
            this.a.s.p(n8, l8);
        }

        @Override
        public void q(Object object, long l8) {
            this.a.s.q(object, l8);
            if (this.a.Z == object) {
                this.a.m.k(26, new ax.Y0.M());
            }
        }

        @Override
        public void r(ax.P0.C c8) {
            Object object = this.a;
            androidx.media3.exoplayer.X.q1((X)object, ((X)object).w0.a().M(c8).J());
            object = this.a.O1();
            if (!((ax.P0.A)object).equals(this.a.V)) {
                androidx.media3.exoplayer.X.t1(this.a, (ax.P0.A)object);
                this.a.m.h(14, new b0(this));
            }
            this.a.m.h(28, new c0(c8));
            this.a.m.f();
        }

        @Override
        public void s(ax.R0.c c8) {
            androidx.media3.exoplayer.X.o1(this.a, c8);
            this.a.m.k(27, new Z(c8));
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int n8, int n9, int n10) {
            this.a.m2(n9, n10);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (this.a.d0) {
                this.a.A2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (this.a.d0) {
                this.a.A2(null);
            }
            this.a.m2(0, 0);
        }

        @Override
        public void t(List<ax.R0.a> list) {
            this.a.m.k(27, new d0(list));
        }

        @Override
        public void u(ax.Y0.b b8) {
            this.a.s.u(b8);
            androidx.media3.exoplayer.X.k1(this.a, null);
            androidx.media3.exoplayer.X.K1(this.a, null);
        }

        @Override
        public void v(Surface surface) {
            this.a.A2(null);
        }

        @Override
        public void w(ax.Y0.b b8) {
            androidx.media3.exoplayer.X.K1(this.a, b8);
            this.a.s.w(b8);
        }

        @Override
        public void x(long l8) {
            this.a.s.x(l8);
        }

        @Override
        public void y(Exception exception) {
            this.a.s.y(exception);
        }

        @Override
        public void z(Exception exception) {
            this.a.s.z(exception);
        }
    }

    private static final class d
    implements ax.o1.z,
    ax.p1.a,
    K0.b {
        private ax.p1.a c0;
        private ax.o1.z d0;
        private ax.p1.a e0;
        private ax.o1.z q;

        private d() {
        }

        @Override
        public void B(int n8, Object object) {
            if (n8 != 7) {
                if (n8 != 8) {
                    if (n8 != 10000) {
                        return;
                    }
                    if ((object = (l)((Object)object)) == null) {
                        this.d0 = null;
                        this.e0 = null;
                        return;
                    }
                    this.d0 = ((l)((Object)object)).getVideoFrameMetadataListener();
                    this.e0 = ((l)((Object)object)).getCameraMotionListener();
                    return;
                }
                this.c0 = (ax.p1.a)object;
                return;
            }
            this.q = (ax.o1.z)object;
        }

        @Override
        public void b(long l8, float[] fArray) {
            ax.p1.a a8 = this.e0;
            if (a8 != null) {
                a8.b(l8, fArray);
            }
            if ((a8 = this.c0) != null) {
                a8.b(l8, fArray);
            }
        }

        @Override
        public void e() {
            ax.p1.a a8 = this.e0;
            if (a8 != null) {
                a8.e();
            }
            if ((a8 = this.c0) != null) {
                a8.e();
            }
        }

        @Override
        public void g(long l8, long l9, ax.P0.v v8, MediaFormat mediaFormat) {
            ax.o1.z z8 = this.d0;
            if (z8 != null) {
                z8.g(l8, l9, v8, mediaFormat);
            }
            if ((z8 = this.q) != null) {
                z8.g(l8, l9, v8, mediaFormat);
            }
        }
    }

    private static final class e
    implements u0 {
        private final Object a;
        private final ax.i1.F b;
        private ax.P0.N c;

        public e(Object object, ax.i1.A a8) {
            this.a = object;
            this.b = a8;
            this.c = a8.W();
        }

        public void a(ax.P0.N n8) {
            this.c = n8;
        }

        @Override
        public Object q() {
            return this.a;
        }

        @Override
        public ax.P0.N r() {
            return this.c;
        }
    }
}


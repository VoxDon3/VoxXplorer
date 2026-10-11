package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
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
import androidx.media3.exoplayer.C0593d;
import androidx.media3.exoplayer.C0614n0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.V0;
import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.X0;
import androidx.media3.exoplayer.image.ImageOutput;
import ax.P0.AbstractC0899h;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0913w;
import ax.P0.C0915y;
import ax.P0.C0916z;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.S0.C0968a;
import ax.S0.C0973f;
import ax.S0.C0978k;
import ax.S0.C0986t;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Z0.E1;
import ax.Z0.I1;
import ax.Z0.InterfaceC1200a;
import ax.Z0.InterfaceC1206c;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;
import ax.g1.InterfaceC2103b;
import ax.i1.C2204A;
import ax.i1.InterfaceC2209F;
import ax.i1.g0;
import ax.k1.InterfaceC2365h;
import ax.l1.AbstractC2451J;
import ax.l1.InterfaceC2445D;
import ax.p1.InterfaceC2758a;
import ax.p1.l;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class X extends AbstractC0899h implements ExoPlayer {
    private final d A;
    private long A0;
    private final C0593d B;
    private final V0 C;
    private final a1 D;
    private final d1 E;
    private final long F;
    private final X0 G;
    private final C0973f<Integer> H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private boolean N;
    private AbstractC2964C<Integer> O;
    private ax.Y0.Y P;
    private ax.Y0.Z Q;
    private ax.i1.g0 R;
    private ExoPlayer.c S;
    private boolean T;
    private H.b U;
    private ax.P0.A V;
    private ax.P0.A W;
    private C0912v X;
    private C0912v Y;
    private Object Z;
    private Surface a0;
    final ax.l1.K b;
    private SurfaceHolder b0;
    final H.b c;
    private ax.p1.l c0;
    private final C0978k d = new C0978k();
    private boolean d0;
    private final Context e;
    private TextureView e0;
    private final ax.P0.H f;
    private int f0;
    private final M0[] g;
    private int g0;
    private final M0[] h;
    private ax.S0.I h0;
    private final AbstractC2451J i;
    private C1176b i0;
    private final InterfaceC0984q j;
    private C1176b j0;
    private final C0614n0.f k;
    private C0894c k0;
    private final C0614n0 l;
    private float l0;
    private final C0986t<H.d> m;
    private boolean m0;
    private final CopyOnWriteArraySet<ExoPlayer.a> n;
    private ax.R0.c n0;
    private final N.b o;
    private boolean o0;
    private final List<e> p;
    private boolean p0;
    private final boolean q;
    private int q0;
    private final InterfaceC2209F.a r;
    private ax.P0.J r0;
    private final InterfaceC1200a s;
    private boolean s0;
    private final Looper t;
    private boolean t0;
    private final ax.m1.e u;
    private C0905n u0;
    private final long v;
    private ax.P0.a0 v0;
    private final long w;
    private ax.P0.A w0;
    private final long x;
    private J0 x0;
    private final InterfaceC0975h y;
    private int y0;
    private final c z;
    private int z0;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        public static /* synthetic */ void a(Context context, boolean z, X x, I1 i1) {
            E1 F0 = E1.F0(context);
            if (F0 == null) {
                C0987u.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z) {
                x.r0(F0);
            }
            i1.b(F0.M0());
        }

        public static void b(final Context context, final X x, final boolean z, final I1 i1) {
            x.X1().d(x.c2(), null).c(new Runnable() { // from class: androidx.media3.exoplayer.Y
                @Override // java.lang.Runnable
                public final void run() {
                    X.b.a(context, z, x, i1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements ax.o1.P, InterfaceC1309z, InterfaceC2365h, InterfaceC2103b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C0593d.b, V0.b, ExoPlayer.a {
        private c() {
        }

        @Override // ax.a1.InterfaceC1309z
        public void A(int i, long j, long j2) {
            X.this.s.A(i, j, j2);
        }

        @Override // ax.o1.P
        public void B(C1176b c1176b) {
            X.this.i0 = c1176b;
            X.this.s.B(c1176b);
        }

        @Override // ax.o1.P
        public void C(long j, int i) {
            X.this.s.C(j, i);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public /* synthetic */ void D(boolean z) {
            ax.Y0.C.a(this, z);
        }

        @Override // ax.p1.l.b
        public void E(Surface surface) {
            X.this.A2(surface);
        }

        @Override // androidx.media3.exoplayer.V0.b
        public void F(final int i, final boolean z) {
            X.this.m.k(30, new C0986t.a() { // from class: androidx.media3.exoplayer.g0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).Y(i, z);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void G(boolean z) {
            X.this.H2();
        }

        @Override // ax.o1.P
        public void a(final ax.P0.a0 a0Var) {
            X.this.v0 = a0Var;
            X.this.m.k(25, new C0986t.a() { // from class: androidx.media3.exoplayer.e0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).a(ax.P0.a0.this);
                }
            });
        }

        @Override // ax.a1.InterfaceC1309z
        public void b(InterfaceC1276B.a aVar) {
            X.this.s.b(aVar);
        }

        @Override // ax.a1.InterfaceC1309z
        public void c(final int i) {
            X.this.H.h(new InterfaceC2879f() { // from class: androidx.media3.exoplayer.i0
                @Override // ax.q7.InterfaceC2879f
                public final Object apply(Object obj) {
                    Integer valueOf;
                    valueOf = Integer.valueOf(i);
                    return valueOf;
                }
            }, new InterfaceC2879f() { // from class: androidx.media3.exoplayer.a0
                @Override // ax.q7.InterfaceC2879f
                public final Object apply(Object obj) {
                    Integer valueOf;
                    valueOf = Integer.valueOf(i);
                    return valueOf;
                }
            });
        }

        @Override // androidx.media3.exoplayer.V0.b
        public void d(int i) {
            final C0905n S1 = X.S1(X.this.C);
            if (S1.equals(X.this.u0)) {
                return;
            }
            X.this.u0 = S1;
            X.this.m.k(29, new C0986t.a() { // from class: androidx.media3.exoplayer.f0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).k0(C0905n.this);
                }
            });
        }

        @Override // ax.a1.InterfaceC1309z
        public void e(final boolean z) {
            if (X.this.m0 == z) {
                return;
            }
            X.this.m0 = z;
            X.this.m.k(23, new C0986t.a() { // from class: androidx.media3.exoplayer.h0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).e(z);
                }
            });
        }

        @Override // ax.a1.InterfaceC1309z
        public void f(Exception exc) {
            X.this.s.f(exc);
        }

        @Override // ax.a1.InterfaceC1309z
        public void g(InterfaceC1276B.a aVar) {
            X.this.s.g(aVar);
        }

        @Override // ax.o1.P
        public void h(C0912v c0912v, C1177c c1177c) {
            X.this.X = c0912v;
            X.this.s.h(c0912v, c1177c);
        }

        @Override // ax.o1.P
        public void i(String str) {
            X.this.s.i(str);
        }

        @Override // androidx.media3.exoplayer.C0593d.b
        public void j() {
            X.this.E2(false, 3);
        }

        @Override // ax.o1.P
        public void k(String str, long j, long j2) {
            X.this.s.k(str, j, j2);
        }

        @Override // ax.a1.InterfaceC1309z
        public void l(C0912v c0912v, C1177c c1177c) {
            X.this.Y = c0912v;
            X.this.s.l(c0912v, c1177c);
        }

        @Override // ax.o1.P
        public void m(C1176b c1176b) {
            X.this.s.m(c1176b);
            X.this.X = null;
            X.this.i0 = null;
        }

        @Override // ax.a1.InterfaceC1309z
        public void n(String str) {
            X.this.s.n(str);
        }

        @Override // ax.a1.InterfaceC1309z
        public void o(String str, long j, long j2) {
            X.this.s.o(str, j, j2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            X.this.z2(surfaceTexture);
            X.this.m2(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            X.this.A2(null);
            X.this.m2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            X.this.m2(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // ax.o1.P
        public void p(int i, long j) {
            X.this.s.p(i, j);
        }

        @Override // ax.o1.P
        public void q(Object obj, long j) {
            X.this.s.q(obj, j);
            if (X.this.Z == obj) {
                X.this.m.k(26, new C0986t.a() { // from class: ax.Y0.M
                    @Override // ax.S0.C0986t.a
                    public final void invoke(Object obj2) {
                        ((H.d) obj2).b0();
                    }
                });
            }
        }

        @Override // ax.g1.InterfaceC2103b
        public void r(final ax.P0.C c) {
            X x = X.this;
            x.w0 = x.w0.a().M(c).J();
            ax.P0.A O1 = X.this.O1();
            if (!O1.equals(X.this.V)) {
                X.this.V = O1;
                X.this.m.h(14, new C0986t.a() { // from class: androidx.media3.exoplayer.b0
                    @Override // ax.S0.C0986t.a
                    public final void invoke(Object obj) {
                        ((H.d) obj).j0(X.this.V);
                    }
                });
            }
            X.this.m.h(28, new C0986t.a() { // from class: androidx.media3.exoplayer.c0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).r(ax.P0.C.this);
                }
            });
            X.this.m.f();
        }

        @Override // ax.k1.InterfaceC2365h
        public void s(final ax.R0.c cVar) {
            X.this.n0 = cVar;
            X.this.m.k(27, new C0986t.a() { // from class: androidx.media3.exoplayer.Z
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).s(ax.R0.c.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            X.this.m2(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (X.this.d0) {
                X.this.A2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (X.this.d0) {
                X.this.A2(null);
            }
            X.this.m2(0, 0);
        }

        @Override // ax.k1.InterfaceC2365h
        public void t(final List<ax.R0.a> list) {
            X.this.m.k(27, new C0986t.a() { // from class: androidx.media3.exoplayer.d0
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).t(list);
                }
            });
        }

        @Override // ax.a1.InterfaceC1309z
        public void u(C1176b c1176b) {
            X.this.s.u(c1176b);
            X.this.Y = null;
            X.this.j0 = null;
        }

        @Override // ax.p1.l.b
        public void v(Surface surface) {
            X.this.A2(null);
        }

        @Override // ax.a1.InterfaceC1309z
        public void w(C1176b c1176b) {
            X.this.j0 = c1176b;
            X.this.s.w(c1176b);
        }

        @Override // ax.a1.InterfaceC1309z
        public void x(long j) {
            X.this.s.x(j);
        }

        @Override // ax.a1.InterfaceC1309z
        public void y(Exception exc) {
            X.this.s.y(exc);
        }

        @Override // ax.o1.P
        public void z(Exception exc) {
            X.this.s.z(exc);
        }
    }

    private static final class d implements ax.o1.z, InterfaceC2758a, K0.b {
        private InterfaceC2758a c0;
        private ax.o1.z d0;
        private InterfaceC2758a e0;
        private ax.o1.z q;

        private d() {
        }

        @Override // androidx.media3.exoplayer.K0.b
        public void B(int i, Object obj) {
            if (i == 7) {
                this.q = (ax.o1.z) obj;
                return;
            }
            if (i == 8) {
                this.c0 = (InterfaceC2758a) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            ax.p1.l lVar = (ax.p1.l) obj;
            if (lVar == null) {
                this.d0 = null;
                this.e0 = null;
            } else {
                this.d0 = lVar.getVideoFrameMetadataListener();
                this.e0 = lVar.getCameraMotionListener();
            }
        }

        @Override // ax.p1.InterfaceC2758a
        public void b(long j, float[] fArr) {
            InterfaceC2758a interfaceC2758a = this.e0;
            if (interfaceC2758a != null) {
                interfaceC2758a.b(j, fArr);
            }
            InterfaceC2758a interfaceC2758a2 = this.c0;
            if (interfaceC2758a2 != null) {
                interfaceC2758a2.b(j, fArr);
            }
        }

        @Override // ax.p1.InterfaceC2758a
        public void e() {
            InterfaceC2758a interfaceC2758a = this.e0;
            if (interfaceC2758a != null) {
                interfaceC2758a.e();
            }
            InterfaceC2758a interfaceC2758a2 = this.c0;
            if (interfaceC2758a2 != null) {
                interfaceC2758a2.e();
            }
        }

        @Override // ax.o1.z
        public void g(long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
            long j3;
            long j4;
            C0912v c0912v2;
            MediaFormat mediaFormat2;
            ax.o1.z zVar = this.d0;
            if (zVar != null) {
                zVar.g(j, j2, c0912v, mediaFormat);
                mediaFormat2 = mediaFormat;
                c0912v2 = c0912v;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                c0912v2 = c0912v;
                mediaFormat2 = mediaFormat;
            }
            ax.o1.z zVar2 = this.q;
            if (zVar2 != null) {
                zVar2.g(j3, j4, c0912v2, mediaFormat2);
            }
        }
    }

    private static final class e implements InterfaceC0627u0 {
        private final Object a;
        private final InterfaceC2209F b;
        private ax.P0.N c;

        public e(Object obj, C2204A c2204a) {
            this.a = obj;
            this.b = c2204a;
            this.c = c2204a.W();
        }

        public void a(ax.P0.N n) {
            this.c = n;
        }

        @Override // androidx.media3.exoplayer.InterfaceC0627u0
        public Object q() {
            return this.a;
        }

        @Override // androidx.media3.exoplayer.InterfaceC0627u0
        public ax.P0.N r() {
            return this.c;
        }
    }

    static {
        C0916z.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public X(ExoPlayer.b bVar, ax.P0.H h) {
        Looper looper;
        Looper looper2;
        InterfaceC0975h interfaceC0975h;
        try {
            C0987u.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + ax.S0.d0.e + "]");
            this.e = bVar.a.getApplicationContext();
            this.s = bVar.i.apply(bVar.b);
            this.q0 = bVar.k;
            this.r0 = bVar.l;
            this.k0 = bVar.m;
            this.f0 = bVar.s;
            this.g0 = bVar.t;
            this.m0 = bVar.q;
            this.F = bVar.C;
            c cVar = new c();
            this.z = cVar;
            this.A = new d();
            Handler handler = new Handler(bVar.j);
            ax.Y0.X x = bVar.d.get();
            Handler handler2 = handler;
            M0[] b2 = x.b(handler2, cVar, cVar, cVar, cVar);
            this.g = b2;
            C0968a.g(b2.length > 0);
            this.h = new M0[b2.length];
            int i = 0;
            while (true) {
                M0[] m0Arr = this.h;
                if (i >= m0Arr.length) {
                    break;
                }
                M0 m0 = this.g[i];
                c cVar2 = this.z;
                ax.Y0.X x2 = x;
                Handler handler3 = handler2;
                m0Arr[i] = x2.a(m0, handler3, cVar2, cVar2, cVar2, cVar2);
                i++;
                x = x2;
                handler2 = handler3;
            }
            AbstractC2451J abstractC2451J = bVar.f.get();
            this.i = abstractC2451J;
            this.r = bVar.e.get();
            ax.m1.e eVar = bVar.h.get();
            this.u = eVar;
            this.q = bVar.u;
            this.Q = bVar.v;
            this.v = bVar.x;
            this.w = bVar.y;
            this.x = bVar.z;
            this.P = bVar.w;
            this.T = bVar.D;
            Looper looper3 = bVar.j;
            this.t = looper3;
            InterfaceC0975h interfaceC0975h2 = bVar.b;
            this.y = interfaceC0975h2;
            ax.P0.H h2 = h == null ? this : h;
            this.f = h2;
            this.m = new C0986t<>(looper3, interfaceC0975h2, new C0986t.b() { // from class: androidx.media3.exoplayer.C
                @Override // ax.S0.C0986t.b
                public final void a(Object obj, ax.P0.r rVar) {
                    ((H.d) obj).c0(X.this.f, new H.c(rVar));
                }
            });
            this.n = new CopyOnWriteArraySet<>();
            this.p = new ArrayList();
            this.R = new g0.a(0);
            this.S = ExoPlayer.c.b;
            M0[] m0Arr2 = this.g;
            ax.l1.K k = new ax.l1.K(new ax.Y0.W[m0Arr2.length], new InterfaceC2445D[m0Arr2.length], ax.P0.V.b, null);
            this.b = k;
            this.o = new N.b();
            H.b e2 = new H.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, abstractC2451J.h()).d(23, bVar.r).d(25, bVar.r).d(33, bVar.r).d(26, bVar.r).d(34, bVar.r).e();
            this.c = e2;
            this.U = new H.b.a().b(e2).a(4).a(10).e();
            this.j = interfaceC0975h2.d(looper3, null);
            C0614n0.f fVar = new C0614n0.f() { // from class: androidx.media3.exoplayer.D
                @Override // androidx.media3.exoplayer.C0614n0.f
                public final void a(C0614n0.e eVar2) {
                    r0.j.c(new Runnable() { // from class: androidx.media3.exoplayer.J
                        @Override // java.lang.Runnable
                        public final void run() {
                            X.this.h2(eVar2);
                        }
                    });
                }
            };
            this.k = fVar;
            this.x0 = J0.k(k);
            this.s.d0(h2, looper3);
            I1 i1 = new I1(bVar.I);
            C0614n0 c0614n0 = new C0614n0(this.e, this.g, this.h, abstractC2451J, k, bVar.g.get(), eVar, this.I, this.J, this.s, this.Q, bVar.A, bVar.B, this.T, bVar.J, looper3, interfaceC0975h2, fVar, i1, bVar.F, this.S, this.A);
            this.l = c0614n0;
            Looper P = c0614n0.P();
            this.l0 = 1.0f;
            this.I = 0;
            ax.P0.A a2 = ax.P0.A.I;
            this.V = a2;
            this.W = a2;
            this.w0 = a2;
            this.y0 = -1;
            this.n0 = ax.R0.c.d;
            this.o0 = true;
            N(this.s);
            eVar.e(new Handler(looper3), this.s);
            L1(this.z);
            long j = bVar.c;
            if (j > 0) {
                c0614n0.I(j);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.b(this.e, this, bVar.E, i1);
            }
            C0973f<Integer> c0973f = new C0973f<>(0, P, looper3, interfaceC0975h2, new C0973f.a() { // from class: androidx.media3.exoplayer.F
                @Override // ax.S0.C0973f.a
                public final void a(Object obj, Object obj2) {
                    X.this.o2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.H = c0973f;
            c0973f.e(new Runnable() { // from class: androidx.media3.exoplayer.G
                @Override // java.lang.Runnable
                public final void run() {
                    r0.H.g(Integer.valueOf(ax.S0.d0.J(X.this.e)));
                }
            });
            C0593d c0593d = new C0593d(bVar.a, P, bVar.j, this.z, interfaceC0975h2);
            this.B = c0593d;
            c0593d.d(bVar.p);
            if (bVar.H) {
                X0 x0 = bVar.K;
                this.G = x0;
                looper = looper3;
                x0.b(new X0.a() { // from class: androidx.media3.exoplayer.H
                    @Override // androidx.media3.exoplayer.X0.a
                    public final void a(boolean z) {
                        X.this.p2(z);
                    }
                }, this.e, looper, P, interfaceC0975h2);
                P = P;
            } else {
                looper = looper3;
                this.G = null;
            }
            if (bVar.r) {
                Looper looper4 = P;
                looper2 = looper4;
                interfaceC0975h = interfaceC0975h2;
                this.C = new V0(bVar.a, this.z, this.k0.b(), looper4, looper, interfaceC0975h2);
            } else {
                looper2 = P;
                interfaceC0975h = interfaceC0975h2;
                this.C = null;
            }
            a1 a1Var = new a1(bVar.a, looper2, interfaceC0975h);
            this.D = a1Var;
            a1Var.c(bVar.o != 0);
            d1 d1Var = new d1(bVar.a, looper2, interfaceC0975h);
            this.E = d1Var;
            d1Var.c(bVar.o == 2);
            this.u0 = C0905n.e;
            this.v0 = ax.P0.a0.e;
            this.h0 = ax.S0.I.c;
            c0614n0.A1(this.P);
            c0614n0.j1(this.k0, bVar.n);
            u2(1, 3, this.k0);
            u2(2, 4, Integer.valueOf(this.f0));
            u2(2, 5, Integer.valueOf(this.g0));
            u2(1, 9, Boolean.valueOf(this.m0));
            u2(6, 8, this.A);
            v2(16, Integer.valueOf(this.q0));
            this.d.f();
        } catch (Throwable th) {
            this.d.f();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2(Object obj) {
        Object obj2 = this.Z;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean J1 = this.l.J1(obj, z ? this.F : -9223372036854775807L);
        if (z) {
            Object obj3 = this.Z;
            Surface surface = this.a0;
            if (obj3 == surface) {
                surface.release();
                this.a0 = null;
            }
        }
        this.Z = obj;
        if (J1) {
            return;
        }
        C2(C0622s.f(new ax.Y0.N(3), 1003));
    }

    private void C2(C0622s c0622s) {
        J0 j0 = this.x0;
        J0 c2 = j0.c(j0.b);
        c2.q = c2.s;
        c2.r = 0L;
        J0 j2 = j2(c2, 1);
        if (c0622s != null) {
            j2 = j2.f(c0622s);
        }
        this.K++;
        this.l.T1();
        F2(j2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void D2() {
        H.b bVar = this.U;
        H.b O = ax.S0.d0.O(this.f, this.c);
        this.U = O;
        if (O.equals(bVar)) {
            return;
        }
        this.m.h(13, new C0986t.a() { // from class: androidx.media3.exoplayer.L
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((H.d) obj).W(X.this.U);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2(boolean z, int i) {
        int R1 = R1(z);
        J0 j0 = this.x0;
        if (j0.l == z && j0.n == R1 && j0.m == i) {
            return;
        }
        this.K++;
        if (j0.p) {
            j0 = j0.a();
        }
        J0 e2 = j0.e(z, i, R1);
        this.l.r1(z, i, R1);
        F2(e2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void F2(final J0 j0, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        J0 j02 = this.x0;
        this.x0 = j0;
        boolean equals = j02.a.equals(j0.a);
        Pair<Boolean, Integer> W1 = W1(j0, j02, z, i2, !equals, z2);
        boolean booleanValue = ((Boolean) W1.first).booleanValue();
        final int intValue = ((Integer) W1.second).intValue();
        if (booleanValue) {
            r6 = j0.a.q() ? null : j0.a.n(j0.a.h(j0.b.a, this.o).c, this.a).c;
            this.w0 = ax.P0.A.I;
        }
        if (booleanValue || !j02.j.equals(j0.j)) {
            this.w0 = this.w0.a().N(j0.j).J();
        }
        ax.P0.A O1 = O1();
        boolean equals2 = O1.equals(this.V);
        this.V = O1;
        boolean z3 = j02.l != j0.l;
        boolean z4 = j02.e != j0.e;
        if (z4 || z3) {
            H2();
        }
        boolean z5 = j02.g;
        boolean z6 = j0.g;
        boolean z7 = z5 != z6;
        if (z7) {
            G2(z6);
        }
        if (!equals) {
            this.m.h(0, new C0986t.a() { // from class: androidx.media3.exoplayer.t
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    H.d dVar = (H.d) obj;
                    dVar.P(J0.this.a, i);
                }
            });
        }
        if (z) {
            final H.e f2 = f2(i2, j02, i3);
            final H.e e2 = e2(j);
            this.m.h(11, new C0986t.a() { // from class: androidx.media3.exoplayer.S
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    X.d1(i2, f2, e2, (H.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.m.h(1, new C0986t.a() { // from class: androidx.media3.exoplayer.T
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).a0(C0915y.this, intValue);
                }
            });
        }
        if (j02.f != j0.f) {
            this.m.h(10, new C0986t.a() { // from class: androidx.media3.exoplayer.U
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).J(J0.this.f);
                }
            });
            if (j0.f != null) {
                this.m.h(10, new C0986t.a() { // from class: androidx.media3.exoplayer.V
                    @Override // ax.S0.C0986t.a
                    public final void invoke(Object obj) {
                        ((H.d) obj).N(J0.this.f);
                    }
                });
            }
        }
        ax.l1.K k = j02.i;
        ax.l1.K k2 = j0.i;
        if (k != k2) {
            this.i.i(k2.e);
            this.m.h(2, new C0986t.a() { // from class: androidx.media3.exoplayer.W
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).H(J0.this.i.d);
                }
            });
        }
        if (!equals2) {
            final ax.P0.A a2 = this.V;
            this.m.h(14, new C0986t.a() { // from class: androidx.media3.exoplayer.u
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).j0(ax.P0.A.this);
                }
            });
        }
        if (z7) {
            this.m.h(3, new C0986t.a() { // from class: androidx.media3.exoplayer.v
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    X.I0(J0.this, (H.d) obj);
                }
            });
        }
        if (z4 || z3) {
            this.m.h(-1, new C0986t.a() { // from class: androidx.media3.exoplayer.w
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).Z(r0.l, J0.this.e);
                }
            });
        }
        if (z4) {
            this.m.h(4, new C0986t.a() { // from class: androidx.media3.exoplayer.x
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).O(J0.this.e);
                }
            });
        }
        if (z3 || j02.m != j0.m) {
            this.m.h(5, new C0986t.a() { // from class: androidx.media3.exoplayer.E
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).i0(r0.l, J0.this.m);
                }
            });
        }
        if (j02.n != j0.n) {
            this.m.h(6, new C0986t.a() { // from class: androidx.media3.exoplayer.O
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).D(J0.this.n);
                }
            });
        }
        if (j02.n() != j0.n()) {
            this.m.h(7, new C0986t.a() { // from class: androidx.media3.exoplayer.P
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).t0(J0.this.n());
                }
            });
        }
        if (!j02.o.equals(j0.o)) {
            this.m.h(12, new C0986t.a() { // from class: androidx.media3.exoplayer.Q
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).j(J0.this.o);
                }
            });
        }
        D2();
        this.m.f();
        if (j02.p != j0.p) {
            Iterator<ExoPlayer.a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().G(j0.p);
            }
        }
    }

    private void G2(boolean z) {
        ax.P0.J j = this.r0;
        if (j != null) {
            if (z && !this.s0) {
                j.a(this.q0);
                this.s0 = true;
            } else {
                if (z || !this.s0) {
                    return;
                }
                j.b(this.q0);
                this.s0 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H2() {
        int i = i();
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.D.d(v() && !i2());
                this.E.d(v());
                return;
            } else if (i != 4) {
                throw new IllegalStateException();
            }
        }
        this.D.d(false);
        this.E.d(false);
    }

    public static /* synthetic */ void I0(J0 j0, H.d dVar) {
        dVar.E(j0.g);
        dVar.I(j0.g);
    }

    private void I2() {
        this.d.b();
        if (Thread.currentThread() != i0().getThread()) {
            String G = ax.S0.d0.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), i0().getThread().getName());
            if (this.o0) {
                throw new IllegalStateException(G);
            }
            C0987u.i("ExoPlayerImpl", G, this.p0 ? null : new IllegalStateException());
            this.p0 = true;
        }
    }

    private static ax.P0.T M1(ax.P0.T t, AbstractC2964C<Integer> abstractC2964C) {
        T.c I = t.I();
        ax.r7.j0<Integer> it = abstractC2964C.iterator();
        while (it.hasNext()) {
            I.U(it.next().intValue(), true);
        }
        return I.F();
    }

    private List<I0.c> N1(int i, List<InterfaceC2209F> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            I0.c cVar = new I0.c(list.get(i2), this.q);
            arrayList.add(cVar);
            this.p.add(i2 + i, new e(cVar.b, cVar.a));
        }
        this.R = this.R.e(i, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.P0.A O1() {
        ax.P0.N h0 = h0();
        if (h0.q()) {
            return this.w0;
        }
        return this.w0.a().L(h0.n(b0(), this.a).c.e).J();
    }

    private int R1(boolean z) {
        if (this.N) {
            return 4;
        }
        X0 x0 = this.G;
        if (x0 == null || x0.a()) {
            return (this.x0.n != 1 || z) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0905n S1(V0 v0) {
        return new C0905n.b(0).g(v0 != null ? v0.l() : 0).f(v0 != null ? v0.k() : 0).e();
    }

    private ax.P0.N T1() {
        return new L0(this.p, this.R);
    }

    private List<InterfaceC2209F> U1(List<C0915y> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.e(list.get(i)));
        }
        return arrayList;
    }

    private K0 V1(K0.b bVar) {
        int a2 = a2(this.x0);
        C0614n0 c0614n0 = this.l;
        return new K0(c0614n0, bVar, this.x0.a, a2 == -1 ? 0 : a2, this.y, c0614n0.P());
    }

    private Pair<Boolean, Integer> W1(J0 j0, J0 j02, boolean z, int i, boolean z2, boolean z3) {
        ax.P0.N n = j02.a;
        ax.P0.N n2 = j0.a;
        if (n2.q() && n.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (n2.q() != n.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (n.n(n.h(j02.b.a, this.o).c, this.a).a.equals(n2.n(n2.h(j0.b.a, this.o).c, this.a).a)) {
            return (z && i == 0 && j02.b.d < j0.b.d) ? new Pair<>(Boolean.TRUE, 0) : (z && i == 1 && z3) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
    }

    private long Y1(J0 j0) {
        if (!j0.b.b()) {
            return ax.S0.d0.E1(Z1(j0));
        }
        j0.a.h(j0.b.a, this.o);
        return j0.c == -9223372036854775807L ? j0.a.n(a2(j0), this.a).b() : this.o.n() + ax.S0.d0.E1(j0.c);
    }

    private long Z1(J0 j0) {
        if (j0.a.q()) {
            return ax.S0.d0.a1(this.A0);
        }
        long m = j0.p ? j0.m() : j0.s;
        return j0.b.b() ? m : q2(j0.a, j0.b, m);
    }

    private int a2(J0 j0) {
        return j0.a.q() ? this.y0 : j0.a.h(j0.b.a, this.o).c;
    }

    private Pair<Object, Long> b2(ax.P0.N n, ax.P0.N n2, int i, long j) {
        if (n.q() || n2.q()) {
            boolean z = !n.q() && n2.q();
            return l2(n2, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair<Object, Long> j2 = n.j(this.a, this.o, i, ax.S0.d0.a1(j));
        Object obj = ((Pair) ax.S0.d0.i(j2)).first;
        if (n2.b(obj) != -1) {
            return j2;
        }
        int Y0 = C0614n0.Y0(this.a, this.o, this.I, this.J, obj, n, n2);
        return Y0 != -1 ? l2(n2, Y0, n2.n(Y0, this.a).b()) : l2(n2, -1, -9223372036854775807L);
    }

    public static /* synthetic */ void d1(int i, H.e eVar, H.e eVar2, H.d dVar) {
        dVar.F(i);
        dVar.p0(eVar, eVar2, i);
    }

    private H.e e2(long j) {
        Object obj;
        C0915y c0915y;
        Object obj2;
        int i;
        int b0 = b0();
        if (this.x0.a.q()) {
            obj = null;
            c0915y = null;
            obj2 = null;
            i = -1;
        } else {
            J0 j0 = this.x0;
            Object obj3 = j0.b.a;
            j0.a.h(obj3, this.o);
            int b2 = this.x0.a.b(obj3);
            obj2 = obj3;
            obj = this.x0.a.n(b0, this.a).a;
            c0915y = this.a.c;
            i = b2;
        }
        long E1 = ax.S0.d0.E1(j);
        long E12 = this.x0.b.b() ? ax.S0.d0.E1(g2(this.x0)) : E1;
        InterfaceC2209F.b bVar = this.x0.b;
        return new H.e(obj, b0, c0915y, obj2, i, E1, E12, bVar.b, bVar.c);
    }

    private H.e f2(int i, J0 j0, int i2) {
        int i3;
        Object obj;
        C0915y c0915y;
        Object obj2;
        int i4;
        long j;
        long g2;
        N.b bVar = new N.b();
        if (j0.a.q()) {
            i3 = i2;
            obj = null;
            c0915y = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = j0.b.a;
            j0.a.h(obj3, bVar);
            int i5 = bVar.c;
            int b2 = j0.a.b(obj3);
            Object obj4 = j0.a.n(i5, this.a).a;
            c0915y = this.a.c;
            obj2 = obj3;
            i4 = b2;
            obj = obj4;
            i3 = i5;
        }
        if (i == 0) {
            if (j0.b.b()) {
                InterfaceC2209F.b bVar2 = j0.b;
                j = bVar.b(bVar2.b, bVar2.c);
                g2 = g2(j0);
            } else {
                j = j0.b.e != -1 ? g2(this.x0) : bVar.e + bVar.d;
                g2 = j;
            }
        } else if (j0.b.b()) {
            j = j0.s;
            g2 = g2(j0);
        } else {
            j = bVar.e + j0.s;
            g2 = j;
        }
        long E1 = ax.S0.d0.E1(j);
        long E12 = ax.S0.d0.E1(g2);
        InterfaceC2209F.b bVar3 = j0.b;
        return new H.e(obj, i3, c0915y, obj2, i4, E1, E12, bVar3.b, bVar3.c);
    }

    private static long g2(J0 j0) {
        N.c cVar = new N.c();
        N.b bVar = new N.b();
        j0.a.h(j0.b.a, bVar);
        return j0.c == -9223372036854775807L ? j0.a.n(bVar.c, cVar).c() : bVar.o() + j0.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2(C0614n0.e eVar) {
        boolean z;
        long j;
        int i = this.K - eVar.c;
        this.K = i;
        boolean z2 = true;
        if (eVar.d) {
            this.L = eVar.e;
            this.M = true;
        }
        if (i == 0) {
            ax.P0.N n = eVar.b.a;
            if (!this.x0.a.q() && n.q()) {
                this.y0 = -1;
                this.A0 = 0L;
                this.z0 = 0;
            }
            if (!n.q()) {
                List<ax.P0.N> F = ((L0) n).F();
                C0968a.g(F.size() == this.p.size());
                for (int i2 = 0; i2 < F.size(); i2++) {
                    this.p.get(i2).a(F.get(i2));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.M) {
                if (eVar.b.b.equals(this.x0.b) && eVar.b.d == this.x0.s) {
                    z2 = false;
                }
                if (z2) {
                    if (n.q() || eVar.b.b.b()) {
                        j = eVar.b.d;
                    } else {
                        J0 j0 = eVar.b;
                        j = q2(n, j0.b, j0.d);
                    }
                    j2 = j;
                }
                z = z2;
            } else {
                z = false;
            }
            this.M = false;
            F2(eVar.b, 1, z, this.L, j2, -1, false);
        }
    }

    private static J0 j2(J0 j0, int i) {
        J0 h = j0.h(i);
        return (i == 1 || i == 4) ? h.b(false) : h;
    }

    private J0 k2(J0 j0, ax.P0.N n, Pair<Object, Long> pair) {
        C0968a.a(n.q() || pair != null);
        ax.P0.N n2 = j0.a;
        long Y1 = Y1(j0);
        J0 j = j0.j(n);
        if (n.q()) {
            InterfaceC2209F.b l = J0.l();
            long a1 = ax.S0.d0.a1(this.A0);
            J0 c2 = j.d(l, a1, a1, a1, 0L, ax.i1.q0.d, this.b, AbstractC2991z.z()).c(l);
            c2.q = c2.s;
            return c2;
        }
        Object obj = j.b.a;
        boolean equals = obj.equals(((Pair) ax.S0.d0.i(pair)).first);
        InterfaceC2209F.b bVar = !equals ? new InterfaceC2209F.b(pair.first) : j.b;
        long longValue = ((Long) pair.second).longValue();
        long a12 = ax.S0.d0.a1(Y1);
        if (!n2.q()) {
            a12 -= n2.h(obj, this.o).o();
        }
        if (!equals || longValue < a12) {
            InterfaceC2209F.b bVar2 = bVar;
            C0968a.g(!bVar2.b());
            J0 c3 = j.d(bVar2, longValue, longValue, longValue, 0L, !equals ? ax.i1.q0.d : j.h, !equals ? this.b : j.i, !equals ? AbstractC2991z.z() : j.j).c(bVar2);
            c3.q = longValue;
            return c3;
        }
        if (longValue != a12) {
            InterfaceC2209F.b bVar3 = bVar;
            C0968a.g(!bVar3.b());
            long max = Math.max(0L, j.r - (longValue - a12));
            long j2 = j.q;
            if (j.k.equals(j.b)) {
                j2 = longValue + max;
            }
            J0 d2 = j.d(bVar3, longValue, longValue, longValue, max, j.h, j.i, j.j);
            d2.q = j2;
            return d2;
        }
        int b2 = n.b(j.k.a);
        if (b2 != -1 && n.f(b2, this.o).c == n.h(bVar.a, this.o).c) {
            return j;
        }
        n.h(bVar.a, this.o);
        long b3 = bVar.b() ? this.o.b(bVar.b, bVar.c) : this.o.d;
        InterfaceC2209F.b bVar4 = bVar;
        J0 c4 = j.d(bVar4, j.s, j.s, j.d, b3 - j.s, j.h, j.i, j.j).c(bVar4);
        c4.q = b3;
        return c4;
    }

    private Pair<Object, Long> l2(ax.P0.N n, int i, long j) {
        if (n.q()) {
            this.y0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.A0 = j;
            this.z0 = 0;
            return null;
        }
        if (i == -1 || i >= n.p()) {
            i = n.a(this.J);
            j = n.n(i, this.a).b();
        }
        return n.j(this.a, this.o, i, ax.S0.d0.a1(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(final int i, final int i2) {
        if (i == this.h0.b() && i2 == this.h0.a()) {
            return;
        }
        this.h0 = new ax.S0.I(i, i2);
        this.m.k(24, new C0986t.a() { // from class: androidx.media3.exoplayer.z
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((H.d) obj).o0(i, i2);
            }
        });
        u2(2, 14, new ax.S0.I(i, i2));
    }

    private void n2() {
        J0 j0 = this.x0;
        E2(j0.l, j0.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2(int i, final int i2) {
        I2();
        u2(1, 10, Integer.valueOf(i2));
        u2(2, 10, Integer.valueOf(i2));
        this.m.k(21, new C0986t.a() { // from class: androidx.media3.exoplayer.N
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((H.d) obj).c(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2(boolean z) {
        if (this.t0) {
            return;
        }
        if (!z) {
            n2();
        } else if (this.x0.n == 3) {
            n2();
        }
    }

    private long q2(ax.P0.N n, InterfaceC2209F.b bVar, long j) {
        n.h(bVar.a, this.o);
        return j + this.o.o();
    }

    private J0 r2(J0 j0, int i, int i2) {
        int a2 = a2(j0);
        long Y1 = Y1(j0);
        ax.P0.N n = j0.a;
        int size = this.p.size();
        this.K++;
        s2(i, i2);
        ax.P0.N T1 = T1();
        J0 k2 = k2(j0, T1, b2(n, T1, a2, Y1));
        int i3 = k2.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && a2 >= k2.a.p()) {
            k2 = j2(k2, 4);
        }
        this.l.N0(i, i2, this.R);
        return k2;
    }

    private void s2(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.p.remove(i3);
        }
        this.R = this.R.a(i, i2);
    }

    private void t2() {
        if (this.c0 != null) {
            V1(this.A).m(10000).l(null).k();
            this.c0.g(this.z);
            this.c0 = null;
        }
        TextureView textureView = this.e0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.z) {
                C0987u.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.e0.setSurfaceTextureListener(null);
            }
            this.e0 = null;
        }
        SurfaceHolder surfaceHolder = this.b0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.z);
            this.b0 = null;
        }
    }

    private void u2(int i, int i2, Object obj) {
        for (M0 m0 : this.g) {
            if (i == -1 || m0.k() == i) {
                V1(m0).m(i2).l(obj).k();
            }
        }
        for (M0 m02 : this.h) {
            if (m02 != null && (i == -1 || m02.k() == i)) {
                V1(m02).m(i2).l(obj).k();
            }
        }
    }

    private void v2(int i, Object obj) {
        u2(-1, i, obj);
    }

    private void x2(List<InterfaceC2209F> list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        int i4 = i;
        int a2 = a2(this.x0);
        long s0 = s0();
        this.K++;
        if (!this.p.isEmpty()) {
            s2(0, this.p.size());
        }
        List<I0.c> N1 = N1(0, list);
        ax.P0.N T1 = T1();
        if (!T1.q() && i4 >= T1.p()) {
            throw new C0913w(T1, i4, j);
        }
        if (z) {
            i4 = T1.a(this.J);
            j2 = -9223372036854775807L;
        } else {
            if (i4 == -1) {
                i2 = a2;
                j2 = s0;
                J0 k2 = k2(this.x0, T1, l2(T1, i2, j2));
                i3 = k2.e;
                if (i2 != -1 && i3 != 1) {
                    i3 = (!T1.q() || i2 >= T1.p()) ? 4 : 2;
                }
                J0 j22 = j2(k2, i3);
                this.l.o1(N1, i2, ax.S0.d0.a1(j2), this.R);
                F2(j22, 0, this.x0.b.a.equals(j22.b.a) && !this.x0.a.q(), 4, Z1(j22), -1, false);
            }
            j2 = j;
        }
        i2 = i4;
        J0 k22 = k2(this.x0, T1, l2(T1, i2, j2));
        i3 = k22.e;
        if (i2 != -1) {
            if (T1.q()) {
            }
        }
        J0 j222 = j2(k22, i3);
        this.l.o1(N1, i2, ax.S0.d0.a1(j2), this.R);
        F2(j222, 0, this.x0.b.a.equals(j222.b.a) && !this.x0.a.q(), 4, Z1(j222), -1, false);
    }

    private void y2(SurfaceHolder surfaceHolder) {
        this.d0 = false;
        this.b0 = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = this.b0.getSurface();
        if (surface == null || !surface.isValid()) {
            m2(0, 0);
        } else {
            Rect surfaceFrame = this.b0.getSurfaceFrame();
            m2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        A2(surface);
        this.a0 = surface;
    }

    @Override // ax.P0.H
    public long A() {
        I2();
        return this.x;
    }

    @Override // ax.P0.AbstractC0899h
    protected void A0(int i, long j, int i2, boolean z) {
        I2();
        if (i == -1) {
            return;
        }
        C0968a.a(i >= 0);
        ax.P0.N n = this.x0.a;
        if (n.q() || i < n.p()) {
            this.s.R();
            this.K++;
            if (p()) {
                C0987u.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C0614n0.e eVar = new C0614n0.e(this.x0);
                eVar.b(1);
                this.k.a(eVar);
                return;
            }
            J0 j0 = this.x0;
            int i3 = j0.e;
            if (i3 == 3 || (i3 == 4 && !n.q())) {
                j0 = j2(this.x0, 2);
            }
            int b0 = b0();
            J0 k2 = k2(j0, n, l2(n, i, j));
            this.l.a1(n, i, ax.S0.d0.a1(j));
            F2(k2, 0, true, 1, Z1(k2), b0, z);
        }
    }

    public void B2(SurfaceHolder surfaceHolder) {
        I2();
        if (surfaceHolder == null) {
            P1();
            return;
        }
        t2();
        this.d0 = true;
        this.b0 = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            A2(null);
            m2(0, 0);
        } else {
            A2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // ax.P0.H
    public int D() {
        I2();
        if (this.x0.a.q()) {
            return this.z0;
        }
        J0 j0 = this.x0;
        return j0.a.b(j0.b.a);
    }

    @Override // ax.P0.H
    public void E(TextureView textureView) {
        I2();
        if (textureView == null || textureView != this.e0) {
            return;
        }
        P1();
    }

    @Override // ax.P0.H
    public ax.P0.a0 F() {
        I2();
        return this.v0;
    }

    @Override // ax.P0.H
    public void G(final C0894c c0894c, boolean z) {
        I2();
        if (this.t0) {
            return;
        }
        if (!Objects.equals(this.k0, c0894c)) {
            this.k0 = c0894c;
            u2(1, 3, c0894c);
            V0 v0 = this.C;
            if (v0 != null) {
                v0.o(c0894c.b());
            }
            this.m.h(20, new C0986t.a() { // from class: androidx.media3.exoplayer.K
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).r0(C0894c.this);
                }
            });
        }
        this.l.j1(this.k0, z);
        this.m.f();
    }

    @Override // ax.P0.H
    public void I(List<C0915y> list, boolean z) {
        I2();
        w2(U1(list), z);
    }

    @Override // ax.P0.H
    public int K() {
        I2();
        if (p()) {
            return this.x0.b.c;
        }
        return -1;
    }

    @Override // ax.P0.H
    public void L(SurfaceView surfaceView) {
        I2();
        if (surfaceView instanceof ax.o1.y) {
            t2();
            A2(surfaceView);
            y2(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof ax.p1.l)) {
                B2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            t2();
            this.c0 = (ax.p1.l) surfaceView;
            V1(this.A).m(10000).l(this.c0).k();
            this.c0.d(this.z);
            A2(this.c0.getVideoSurface());
            y2(surfaceView.getHolder());
        }
    }

    public void L1(ExoPlayer.a aVar) {
        this.n.add(aVar);
    }

    @Override // ax.P0.H
    public ax.S0.I M() {
        I2();
        return this.h0;
    }

    @Override // ax.P0.H
    public void N(H.d dVar) {
        this.m.c((H.d) C0968a.e(dVar));
    }

    @Override // ax.P0.H
    public void O(int i, int i2) {
        I2();
        C0968a.a(i >= 0 && i2 >= i);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i >= size || i == min) {
            return;
        }
        J0 r2 = r2(this.x0, i, min);
        F2(r2, 0, !r2.b.a.equals(this.x0.b.a), 4, Z1(r2), -1, false);
    }

    public void P1() {
        I2();
        t2();
        A2(null);
        m2(0, 0);
    }

    public void Q1(SurfaceHolder surfaceHolder) {
        I2();
        if (surfaceHolder == null || surfaceHolder != this.b0) {
            return;
        }
        P1();
    }

    @Override // ax.P0.H
    public void S(boolean z) {
        I2();
        E2(z, 1);
    }

    @Override // ax.P0.H
    public long T() {
        I2();
        return this.w;
    }

    @Override // ax.P0.H
    public long V() {
        I2();
        return Y1(this.x0);
    }

    @Override // ax.P0.H
    public ax.P0.V X() {
        I2();
        return this.x0.i.d;
    }

    public InterfaceC0975h X1() {
        return this.y;
    }

    @Override // ax.P0.H
    public ax.R0.c Z() {
        I2();
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void a(int i) {
        I2();
        if (i == 0) {
            this.D.c(false);
            this.E.c(false);
        } else if (i == 1) {
            this.D.c(true);
            this.E.c(false);
        } else {
            if (i != 2) {
                return;
            }
            this.D.c(true);
            this.E.c(true);
        }
    }

    @Override // ax.P0.H
    public int a0() {
        I2();
        if (p()) {
            return this.x0.b.b;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int b() {
        I2();
        return this.H.d().intValue();
    }

    @Override // ax.P0.H
    public int b0() {
        I2();
        int a2 = a2(this.x0);
        if (a2 == -1) {
            return 0;
        }
        return a2;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void c(ax.Y0.Z z) {
        I2();
        if (z == null) {
            z = ax.Y0.Z.g;
        }
        if (this.Q.equals(z)) {
            return;
        }
        this.Q = z;
        this.l.C1(z);
    }

    public Looper c2() {
        return this.l.P();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void d() {
        C0987u.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + ax.S0.d0.e + "] [" + C0916z.b() + "]");
        I2();
        this.B.d(false);
        V0 v0 = this.C;
        if (v0 != null) {
            v0.n();
        }
        this.D.d(false);
        this.E.d(false);
        X0 x0 = this.G;
        if (x0 != null) {
            x0.f();
        }
        if (!this.l.J0()) {
            this.m.k(10, new C0986t.a() { // from class: androidx.media3.exoplayer.A
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).N(C0622s.f(new ax.Y0.N(1), 1003));
                }
            });
        }
        this.m.i();
        this.j.k(null);
        this.u.g(this.s);
        J0 j0 = this.x0;
        if (j0.p) {
            this.x0 = j0.a();
        }
        J0 j2 = j2(this.x0, 1);
        this.x0 = j2;
        J0 c2 = j2.c(j2.b);
        this.x0 = c2;
        c2.q = c2.s;
        this.x0.r = 0L;
        this.s.d();
        t2();
        Surface surface = this.a0;
        if (surface != null) {
            surface.release();
            this.a0 = null;
        }
        if (this.s0) {
            ((ax.P0.J) C0968a.e(this.r0)).b(this.q0);
            this.s0 = false;
        }
        this.n0 = ax.R0.c.d;
        this.t0 = true;
    }

    @Override // ax.P0.H
    public void d0(SurfaceView surfaceView) {
        I2();
        Q1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // ax.P0.H
    /* renamed from: d2, reason: merged with bridge method [inline-methods] */
    public C0622s R() {
        I2();
        return this.x0.f;
    }

    @Override // ax.P0.H
    public void e(ax.P0.G g) {
        I2();
        if (g == null) {
            g = ax.P0.G.d;
        }
        if (this.x0.o.equals(g)) {
            return;
        }
        J0 g2 = this.x0.g(g);
        this.K++;
        this.l.t1(g);
        F2(g2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // ax.P0.H
    public int f0() {
        I2();
        return this.x0.n;
    }

    @Override // ax.P0.H
    public long g0() {
        I2();
        if (!p()) {
            return C();
        }
        J0 j0 = this.x0;
        InterfaceC2209F.b bVar = j0.b;
        j0.a.h(bVar.a, this.o);
        return ax.S0.d0.E1(this.o.b(bVar.b, bVar.c));
    }

    @Override // ax.P0.H
    public ax.P0.G h() {
        I2();
        return this.x0.o;
    }

    @Override // ax.P0.H
    public ax.P0.N h0() {
        I2();
        return this.x0.a;
    }

    @Override // ax.P0.H
    public int i() {
        I2();
        return this.x0.e;
    }

    @Override // ax.P0.H
    public Looper i0() {
        return this.t;
    }

    public boolean i2() {
        I2();
        return this.x0.p;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isScrubbingModeEnabled() {
        I2();
        return this.N;
    }

    @Override // ax.P0.H
    public void j(final int i) {
        I2();
        if (this.I != i) {
            this.I = i;
            this.l.w1(i);
            this.m.h(8, new C0986t.a() { // from class: androidx.media3.exoplayer.B
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).v(i);
                }
            });
            D2();
            this.m.f();
        }
    }

    @Override // ax.P0.H
    public boolean j0() {
        I2();
        return this.J;
    }

    @Override // ax.P0.H
    public void k() {
        I2();
        J0 j0 = this.x0;
        if (j0.e != 1) {
            return;
        }
        J0 f = j0.f(null);
        J0 j2 = j2(f, f.a.q() ? 4 : 2);
        this.K++;
        this.l.H0();
        F2(j2, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // ax.P0.H
    public ax.P0.T k0() {
        I2();
        ax.P0.T c2 = this.i.c();
        return this.N ? c2.I().L(this.O).F() : c2;
    }

    @Override // ax.P0.H
    public void l(float f) {
        I2();
        final float o = ax.S0.d0.o(f, 0.0f, 1.0f);
        if (this.l0 == o) {
            return;
        }
        this.l0 = o;
        this.l.L1(o);
        this.m.k(22, new C0986t.a() { // from class: androidx.media3.exoplayer.y
            @Override // ax.S0.C0986t.a
            public final void invoke(Object obj) {
                ((H.d) obj).L(o);
            }
        });
    }

    @Override // ax.P0.H
    public long l0() {
        I2();
        if (this.x0.a.q()) {
            return this.A0;
        }
        J0 j0 = this.x0;
        if (j0.k.d != j0.b.d) {
            return j0.a.n(b0(), this.a).d();
        }
        long j = j0.q;
        if (this.x0.k.b()) {
            J0 j02 = this.x0;
            N.b h = j02.a.h(j02.k.a, this.o);
            long f = h.f(this.x0.k.b);
            j = f == Long.MIN_VALUE ? h.d : f;
        }
        J0 j03 = this.x0;
        return ax.S0.d0.E1(q2(j03.a, j03.k, j));
    }

    @Override // ax.P0.H
    public int o() {
        I2();
        return this.I;
    }

    @Override // ax.P0.H
    public void o0(TextureView textureView) {
        I2();
        if (textureView == null) {
            P1();
            return;
        }
        t2();
        this.e0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C0987u.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            A2(null);
            m2(0, 0);
        } else {
            z2(surfaceTexture);
            m2(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // ax.P0.H
    public boolean p() {
        I2();
        return this.x0.b.b();
    }

    @Override // ax.P0.H
    public void q(H.d dVar) {
        I2();
        this.m.j((H.d) C0968a.e(dVar));
    }

    @Override // ax.P0.H
    public ax.P0.A q0() {
        I2();
        return this.V;
    }

    @Override // ax.P0.H
    public long r() {
        I2();
        return ax.S0.d0.E1(this.x0.r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void r0(InterfaceC1206c interfaceC1206c) {
        this.s.f0((InterfaceC1206c) C0968a.e(interfaceC1206c));
    }

    @Override // ax.P0.H
    public long s0() {
        I2();
        return ax.S0.d0.E1(Z1(this.x0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        I2();
        u2(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeEnabled(boolean z) {
        ax.P0.T F;
        I2();
        if (z == this.N) {
            return;
        }
        this.N = z;
        if (!this.P.a.isEmpty() && this.i.h()) {
            ax.P0.T c2 = this.i.c();
            if (z) {
                this.O = c2.E;
                F = M1(c2, this.P.a);
            } else {
                F = c2.I().L(this.O).F();
                this.O = null;
            }
            if (!F.equals(c2)) {
                this.i.m(F);
            }
        }
        this.l.y1(z);
        n2();
    }

    @Override // ax.P0.H
    public void stop() {
        I2();
        C2(null);
        this.n0 = new ax.R0.c(AbstractC2991z.z(), this.x0.s);
    }

    @Override // ax.P0.H
    public long t0() {
        I2();
        return this.v;
    }

    @Override // ax.P0.H
    public H.b u() {
        I2();
        return this.U;
    }

    @Override // ax.P0.H
    public boolean v() {
        I2();
        return this.x0.l;
    }

    @Override // ax.P0.H
    public void w(final ax.P0.T t) {
        ax.P0.T t2;
        I2();
        if (this.i.h()) {
            ax.P0.T k0 = k0();
            if (this.N) {
                this.O = t.E;
                t2 = M1(t, this.P.a);
            } else {
                t2 = t;
            }
            if (!t2.equals(this.i.c())) {
                this.i.m(t2);
            }
            if (k0.equals(t)) {
                return;
            }
            this.m.k(19, new C0986t.a() { // from class: androidx.media3.exoplayer.I
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).U(ax.P0.T.this);
                }
            });
        }
    }

    public void w2(List<InterfaceC2209F> list, boolean z) {
        I2();
        x2(list, -1, -9223372036854775807L, z);
    }

    @Override // ax.P0.H
    public void z(final boolean z) {
        I2();
        if (this.J != z) {
            this.J = z;
            this.l.E1(z);
            this.m.h(9, new C0986t.a() { // from class: androidx.media3.exoplayer.M
                @Override // ax.S0.C0986t.a
                public final void invoke(Object obj) {
                    ((H.d) obj).S(z);
                }
            });
            D2();
            this.m.f();
        }
    }
}

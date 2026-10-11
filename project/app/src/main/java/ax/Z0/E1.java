/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import ax.P0.A;
import ax.P0.C;
import ax.P0.E;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.i;
import ax.P0.n;
import ax.P0.o;
import ax.P0.v;
import ax.P0.y;
import ax.S0.d0;
import ax.S0.z;
import ax.U0.A;
import ax.U0.q;
import ax.U0.s;
import ax.U0.t;
import ax.U0.u;
import ax.Z0.A0;
import ax.Z0.A1;
import ax.Z0.B0;
import ax.Z0.B1;
import ax.Z0.C0;
import ax.Z0.C1;
import ax.Z0.D0;
import ax.Z0.D1;
import ax.Z0.E0;
import ax.Z0.F0;
import ax.Z0.F1;
import ax.Z0.G0;
import ax.Z0.H0;
import ax.Z0.I0;
import ax.Z0.J0;
import ax.Z0.K0;
import ax.Z0.L0;
import ax.Z0.M0;
import ax.Z0.N0;
import ax.Z0.O0;
import ax.Z0.P0;
import ax.Z0.Q0;
import ax.Z0.R0;
import ax.Z0.S0;
import ax.Z0.T0;
import ax.Z0.U0;
import ax.Z0.V0;
import ax.Z0.W0;
import ax.Z0.X0;
import ax.Z0.Y0;
import ax.Z0.Z0;
import ax.Z0.a1;
import ax.Z0.b1;
import ax.Z0.c;
import ax.Z0.c1;
import ax.Z0.d1;
import ax.Z0.e1;
import ax.Z0.f1;
import ax.Z0.g1;
import ax.Z0.h1;
import ax.Z0.i1;
import ax.Z0.j1;
import ax.Z0.k1;
import ax.Z0.l1;
import ax.Z0.m1;
import ax.Z0.n1;
import ax.Z0.o1;
import ax.Z0.p1;
import ax.Z0.q1;
import ax.Z0.r1;
import ax.Z0.s1;
import ax.Z0.t1;
import ax.Z0.u1;
import ax.Z0.v1;
import ax.Z0.w0;
import ax.Z0.w1;
import ax.Z0.x0;
import ax.Z0.x1;
import ax.Z0.y0;
import ax.Z0.y1;
import ax.Z0.z0;
import ax.Z0.z1;
import ax.a1.B;
import ax.b1.U;
import ax.b1.h;
import ax.b1.n;
import ax.f1.L;
import ax.i1.B;
import ax.i1.F;
import ax.r7.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class E1
implements c,
F1.a {
    private int A;
    private boolean B;
    private final Context a;
    private final Executor b;
    private final F1 c;
    private final PlaybackSession d;
    private final long e;
    private final N.c f;
    private final N.b g;
    private final HashMap<String, Long> h;
    private final HashMap<String, Long> i;
    private String j;
    private PlaybackMetrics.Builder k;
    private int l;
    private int m;
    private int n;
    private F o;
    private b p;
    private b q;
    private b r;
    private v s;
    private v t;
    private v u;
    private boolean v;
    private int w;
    private boolean x;
    private int y;
    private int z;

    private E1(Context object, PlaybackSession playbackSession) {
        this.a = object.getApplicationContext();
        this.d = playbackSession;
        this.b = ax.S0.b.a();
        this.f = new N.c();
        this.g = new N.b();
        this.i = new HashMap();
        this.h = new HashMap();
        this.e = SystemClock.elapsedRealtime();
        this.m = 0;
        this.n = 0;
        object = new w0();
        this.c = object;
        object.c(this);
    }

    public static /* synthetic */ void A0(E1 e12, PlaybackMetrics playbackMetrics) {
        n1.a(e12.d, playbackMetrics);
    }

    public static /* synthetic */ void B0(E1 e12, NetworkEvent networkEvent) {
        k1.a(e12.d, networkEvent);
    }

    public static /* synthetic */ void C0(E1 e12, TrackChangeEvent trackChangeEvent) {
        t1.a(e12.d, trackChangeEvent);
    }

    public static /* synthetic */ void D0(E1 e12, PlaybackStateEvent playbackStateEvent) {
        m1.a(e12.d, playbackStateEvent);
    }

    private boolean E0(b b8) {
        return b8 != null && b8.c.equals(this.c.a());
    }

    public static E1 F0(Context context) {
        MediaMetricsManager mediaMetricsManager = u1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManager == null) {
            return null;
        }
        return new E1(context, v1.a(mediaMetricsManager));
    }

    private void G0() {
        Object object = this.k;
        if (object != null && this.B) {
            Y0.a((PlaybackMetrics.Builder)object, this.A);
            Z0.a(this.k, this.y);
            a1.a(this.k, this.z);
            object = this.h.get(this.j);
            PlaybackMetrics.Builder builder = this.k;
            long l8 = object == null ? 0L : (Long)object;
            b1.a(builder, l8);
            object = this.i.get(this.j);
            builder = this.k;
            l8 = object == null ? 0L : (Long)object;
            c1.a(builder, l8);
            builder = this.k;
            int n8 = object != null && (Long)object > 0L ? 1 : 0;
            d1.a(builder, n8);
            object = f1.a(this.k);
            this.b.execute(new C1(this, (PlaybackMetrics)object));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    @SuppressLint(value={"SwitchIntDef"})
    private static int H0(int n8) {
        switch (d0.b0(n8)) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: 
        }
        return 24;
    }

    private static o I0(ax.r7.z<V.a> object) {
        j0<V.a> j02 = ((ax.r7.z)object).n();
        while (j02.hasNext()) {
            object = (V.a)j02.next();
            for (int i8 = 0; i8 < ((V.a)object).a; ++i8) {
                o o8;
                if (!((V.a)object).i(i8) || (o8 = ((V.a)object).b((int)i8).s) == null) continue;
                return o8;
            }
        }
        return null;
    }

    private static int J0(o o8) {
        for (int i8 = 0; i8 < o8.e0; ++i8) {
            UUID uUID = o8.e((int)i8).c0;
            if (uUID.equals(ax.P0.i.d)) {
                return 3;
            }
            if (uUID.equals(ax.P0.i.e)) {
                return 2;
            }
            if (!uUID.equals(ax.P0.i.c)) continue;
            return 6;
        }
        return 1;
    }

    private static a K0(F throwable, Context context, boolean bl) {
        int n8;
        int n9;
        Throwable throwable2;
        if (throwable.q == 1001) {
            return new a(20, 0);
        }
        if (throwable instanceof androidx.media3.exoplayer.s) {
            throwable2 = (androidx.media3.exoplayer.s)throwable;
            n9 = ((androidx.media3.exoplayer.s)throwable2).k0 == 1 ? 1 : 0;
            n8 = ((androidx.media3.exoplayer.s)throwable2).o0;
        } else {
            n8 = 0;
            n9 = 0;
        }
        throwable2 = ax.S0.a.e(throwable.getCause());
        if (throwable2 instanceof IOException) {
            if (throwable2 instanceof u) {
                return new a(5, ((u)throwable2).e0);
            }
            if (!(throwable2 instanceof t) && !(throwable2 instanceof E)) {
                bl = throwable2 instanceof s;
                if (!bl && !(throwable2 instanceof A.a)) {
                    if (throwable.q == 1002) {
                        return new a(21, 0);
                    }
                    if (throwable2 instanceof n.a) {
                        throwable = ax.S0.a.e(throwable2.getCause());
                        if (throwable instanceof MediaDrm.MediaDrmStateException) {
                            n9 = d0.c0(((MediaDrm.MediaDrmStateException)throwable).getDiagnosticInfo());
                            return new a(E1.H0(n9), n9);
                        }
                        if (s1.a(throwable)) {
                            return new a(27, 0);
                        }
                        if (throwable instanceof NotProvisionedException) {
                            return new a(24, 0);
                        }
                        if (throwable instanceof DeniedByServerException) {
                            return new a(29, 0);
                        }
                        if (throwable instanceof U) {
                            return new a(23, 0);
                        }
                        if (throwable instanceof h.e) {
                            return new a(28, 0);
                        }
                        return new a(30, 0);
                    }
                    if (throwable2 instanceof q.a && throwable2.getCause() instanceof FileNotFoundException) {
                        throwable = ax.S0.a.e(throwable2.getCause()).getCause();
                        if (throwable instanceof ErrnoException && ((ErrnoException)throwable).errno == OsConstants.EACCES) {
                            return new a(32, 0);
                        }
                        return new a(31, 0);
                    }
                    return new a(9, 0);
                }
                if (ax.S0.z.e(context).g() == 1) {
                    return new a(3, 0);
                }
                throwable = throwable2.getCause();
                if (throwable instanceof UnknownHostException) {
                    return new a(6, 0);
                }
                if (throwable instanceof SocketTimeoutException) {
                    return new a(7, 0);
                }
                if (bl && ((s)throwable2).d0 == 1) {
                    return new a(4, 0);
                }
                return new a(8, 0);
            }
            n9 = bl ? 10 : 11;
            return new a(n9, 0);
        }
        if (n9 != 0 && (n8 == 0 || n8 == 1)) {
            return new a(35, 0);
        }
        if (n9 != 0 && n8 == 3) {
            return new a(15, 0);
        }
        if (n9 != 0 && n8 == 2) {
            return new a(23, 0);
        }
        if (throwable2 instanceof L.c) {
            return new a(13, d0.c0(((L.c)throwable2).e0));
        }
        if (throwable2 instanceof ax.f1.B) {
            return new a(14, ((ax.f1.B)throwable2).d0);
        }
        if (throwable2 instanceof OutOfMemoryError) {
            return new a(14, 0);
        }
        if (throwable2 instanceof B.c) {
            return new a(17, ((B.c)throwable2).q);
        }
        if (throwable2 instanceof B.f) {
            return new a(18, ((B.f)throwable2).q);
        }
        if (throwable2 instanceof MediaCodec.CryptoException) {
            n9 = ((MediaCodec.CryptoException)throwable2).getErrorCode();
            return new a(E1.H0(n9), n9);
        }
        return new a(22, 0);
    }

    private static Pair<String, String> L0(String object) {
        object = d0.x1((String)object, "-");
        String string = object[0];
        object = ((String[])object).length >= 2 ? object[1] : null;
        return Pair.create((Object)string, (Object)object);
    }

    private static int N0(Context context) {
        switch (ax.S0.z.e(context).g()) {
            default: {
                return 1;
            }
            case 10: {
                return 7;
            }
            case 9: {
                return 8;
            }
            case 7: {
                return 3;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 9;
            }
            case 0: 
        }
        return 0;
    }

    private static int O0(y object) {
        object = ((y)object).b;
        if (object == null) {
            return 0;
        }
        int n8 = d0.E0(((y.h)object).a, ((y.h)object).b);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return 1;
                }
                return 4;
            }
            return 5;
        }
        return 3;
    }

    private static int P0(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return 1;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    private void Q0(c.b b8) {
        for (int i8 = 0; i8 < b8.d(); ++i8) {
            int n8 = b8.b(i8);
            c.a a8 = b8.c(n8);
            if (n8 == 0) {
                this.c.f(a8);
                continue;
            }
            if (n8 == 11) {
                this.c.d(a8, this.l);
                continue;
            }
            this.c.b(a8);
        }
    }

    private void R0(long l8) {
        int n8 = E1.N0(this.a);
        if (n8 != this.n) {
            this.n = n8;
            NetworkEvent networkEvent = N0.a(M0.a(L0.a(I0.a(), n8), l8 - this.e));
            this.b.execute(new A1(this, networkEvent));
        }
    }

    private void S0(long l8) {
        F f8 = this.o;
        if (f8 == null) {
            return;
        }
        Object object = this.a;
        boolean bl = this.w == 4;
        object = E1.K0(f8, object, bl);
        f8 = X0.a(W0.a(V0.a(U0.a(S0.a(e1.a(), l8 - this.e), object.a), object.b), f8));
        this.b.execute(new B1(this, (PlaybackErrorEvent)f8));
        this.B = true;
        this.o = null;
    }

    private void T0(H h8, c.b b8, long l8) {
        if (h8.i() != 2) {
            this.v = false;
        }
        if (h8.R() == null) {
            this.x = false;
        } else if (b8.a(10)) {
            this.x = true;
        }
        int n8 = this.b1(h8);
        if (this.m != n8) {
            this.m = n8;
            this.B = true;
            h8 = i1.a(h1.a(g1.a(p1.a(), this.m), l8 - this.e));
            this.b.execute(new D1(this, (PlaybackStateEvent)h8));
        }
    }

    private void U0(H object, c.b object2, long l8) {
        if (((c.b)object2).a(2)) {
            object = object.X();
            boolean bl = ((V)object).c(2);
            boolean bl2 = ((V)object).c(1);
            boolean bl3 = ((V)object).c(3);
            if (bl || bl2 || bl3) {
                if (!bl) {
                    this.Z0(l8, null, 0);
                }
                if (!bl2) {
                    this.V0(l8, null, 0);
                }
                if (!bl3) {
                    this.X0(l8, null, 0);
                }
            }
        }
        if (this.E0(this.p)) {
            object = this.p;
            object2 = ((b)object).a;
            if (((v)object2).w != -1) {
                this.Z0(l8, (v)object2, ((b)object).b);
                this.p = null;
            }
        }
        if (this.E0(this.q)) {
            object = this.q;
            this.V0(l8, ((b)object).a, ((b)object).b);
            this.q = null;
        }
        if (this.E0(this.r)) {
            object = this.r;
            this.X0(l8, ((b)object).a, ((b)object).b);
            this.r = null;
        }
    }

    private void V0(long l8, v v8, int n8) {
        if (j.Objects.equals((Object)this.t, (Object)v8)) {
            return;
        }
        if (this.t == null && n8 == 0) {
            n8 = 1;
        }
        this.t = v8;
        this.a1(0, l8, v8, n8);
    }

    private void W0(H object, c.b b8) {
        if (b8.a(0)) {
            c.a a8 = b8.c(0);
            if (this.k != null) {
                this.Y0(a8.b, a8.d);
            }
        }
        if (b8.a(2) && this.k != null && (object = E1.I0(object.X().a())) != null) {
            P0.a(O0.a(d0.i(this.k)), E1.J0((o)object));
        }
        if (b8.a(1011)) {
            ++this.A;
        }
    }

    private void X0(long l8, v v8, int n8) {
        if (j.Objects.equals((Object)this.u, (Object)v8)) {
            return;
        }
        if (this.u == null && n8 == 0) {
            n8 = 1;
        }
        this.u = v8;
        this.a1(2, l8, v8, n8);
    }

    private void Y0(N object, F.b b8) {
        int n8;
        PlaybackMetrics.Builder builder = this.k;
        if (b8 == null || (n8 = ((N)object).b(b8.a)) == -1) {
            return;
        }
        ((N)object).f(n8, this.g);
        ((N)object).n(this.g.c, this.f);
        o1.a(builder, E1.O0(this.f.c));
        object = this.f;
        if (!(((N.c)object).m == -9223372036854775807L || ((N.c)object).k || ((N.c)object).i || ((N.c)object).f())) {
            q1.a(builder, this.f.d());
        }
        n8 = this.f.f() ? 2 : 1;
        r1.a(builder, n8);
        this.B = true;
    }

    private void Z0(long l8, v v8, int n8) {
        if (j.Objects.equals((Object)this.s, (Object)v8)) {
            return;
        }
        if (this.s == null && n8 == 0) {
            n8 = 1;
        }
        this.s = v8;
        this.a1(1, l8, v8, n8);
    }

    private void a1(int n8, long l8, v v8, int n9) {
        TrackChangeEvent.Builder builder = w1.a(x0.a(n8), l8 - this.e);
        if (v8 != null) {
            float f8;
            A0.a(builder, 1);
            C0.a(builder, E1.P0(n9));
            Object object = v8.n;
            if (object != null) {
                D0.a(builder, (String)object);
            }
            if ((object = v8.o) != null) {
                E0.a(builder, (String)object);
            }
            if ((object = v8.k) != null) {
                F0.a(builder, (String)object);
            }
            if ((n8 = v8.j) != -1) {
                G0.a(builder, n8);
            }
            if ((n8 = v8.v) != -1) {
                H0.a(builder, n8);
            }
            if ((n8 = v8.w) != -1) {
                J0.a(builder, n8);
            }
            if ((n8 = v8.G) != -1) {
                K0.a(builder, n8);
            }
            if ((n8 = v8.H) != -1) {
                x1.a(builder, n8);
            }
            if ((object = v8.d) != null) {
                object = E1.L0((String)object);
                y1.a(builder, (String)object.first);
                object = object.second;
                if (object != null) {
                    y0.a(builder, (String)object);
                }
            }
            if ((f8 = v8.z) != -1.0f) {
                z0.a(builder, f8);
            }
        } else {
            A0.a(builder, 0);
        }
        this.B = true;
        v8 = B0.a(builder);
        this.b.execute(new z1(this, (TrackChangeEvent)v8));
    }

    private int b1(H h8) {
        int n8 = h8.i();
        if (this.v) {
            return 5;
        }
        if (this.x) {
            return 13;
        }
        if (n8 == 4) {
            return 11;
        }
        if (n8 == 2) {
            n8 = this.m;
            if (n8 != 0 && n8 != 2 && n8 != 12) {
                if (!h8.v()) {
                    return 7;
                }
                if (h8.f0() != 0) {
                    return 10;
                }
                return 6;
            }
            return 2;
        }
        if (n8 == 3) {
            if (!h8.v()) {
                return 4;
            }
            if (h8.f0() != 0) {
                return 9;
            }
            return 3;
        }
        if (n8 == 1 && this.m != 0) {
            return 12;
        }
        return this.m;
    }

    public static /* synthetic */ void z0(E1 e12, PlaybackErrorEvent playbackErrorEvent) {
        l1.a(e12.d, playbackErrorEvent);
    }

    @Override
    public /* synthetic */ void A(c.a a8) {
        ax.Z0.b.w(this, a8);
    }

    @Override
    public /* synthetic */ void B(c.a a8, int n8) {
        ax.Z0.b.j(this, a8, n8);
    }

    @Override
    public /* synthetic */ void C(c.a a8, long l8) {
        ax.Z0.b.i(this, a8, l8);
    }

    @Override
    public /* synthetic */ void D(c.a a8, V v8) {
        ax.Z0.b.e0(this, a8, v8);
    }

    @Override
    public /* synthetic */ void E(c.a a8, ax.Y0.b b8) {
        ax.Z0.b.k0(this, a8, b8);
    }

    @Override
    public void F(c.a a8, ax.i1.y y8, B b8, IOException iOException, boolean bl) {
        this.w = b8.a;
    }

    @Override
    public /* synthetic */ void G(c.a a8, y y8, int n8) {
        ax.Z0.b.K(this, a8, y8, n8);
    }

    @Override
    public void H(c.a a8, String string) {
        F.b b8 = a8.d;
        if (b8 != null && b8.b()) {
            return;
        }
        this.G0();
        this.j = string;
        this.k = R0.a(Q0.a(T0.a(), "AndroidXMedia3"), "1.8.1");
        this.Y0(a8.b, a8.d);
    }

    @Override
    public /* synthetic */ void I(c.a a8, int n8) {
        ax.Z0.b.X(this, a8, n8);
    }

    @Override
    public void J(c.a a8, String string) {
    }

    @Override
    public /* synthetic */ void K(c.a a8) {
        ax.Z0.b.A(this, a8);
    }

    @Override
    public /* synthetic */ void L(c.a a8, ax.R0.c c8) {
        ax.Z0.b.q(this, a8, c8);
    }

    @Override
    public /* synthetic */ void M(c.a a8) {
        ax.Z0.b.x(this, a8);
    }

    public LogSessionId M0() {
        return j1.a(this.d);
    }

    @Override
    public /* synthetic */ void N(c.a a8, ax.i1.y y8, B b8, int n8) {
        ax.Z0.b.I(this, a8, y8, b8, n8);
    }

    @Override
    public /* synthetic */ void O(c.a a8, int n8) {
        ax.Z0.b.c0(this, a8, n8);
    }

    @Override
    public /* synthetic */ void P(c.a a8, boolean bl) {
        ax.Z0.b.E(this, a8, bl);
    }

    @Override
    public /* synthetic */ void Q(c.a a8, int n8, long l8, long l9) {
        ax.Z0.b.n(this, a8, n8, l8, l9);
    }

    @Override
    public /* synthetic */ void R(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.H(this, a8, y8, b8);
    }

    @Override
    public /* synthetic */ void S(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.G(this, a8, y8, b8);
    }

    @Override
    public /* synthetic */ void T(c.a a8, int n8) {
        ax.Z0.b.y(this, a8, n8);
    }

    @Override
    public /* synthetic */ void U(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.F(this, a8, y8, b8);
    }

    @Override
    public /* synthetic */ void V(c.a a8, String string, long l8, long l9) {
        ax.Z0.b.i0(this, a8, string, l8, l9);
    }

    @Override
    public /* synthetic */ void W(c.a a8, T t8) {
        ax.Z0.b.d0(this, a8, t8);
    }

    @Override
    public /* synthetic */ void X(c.a a8, B.a a9) {
        ax.Z0.b.l(this, a8, a9);
    }

    @Override
    public /* synthetic */ void Y(c.a a8, int n8, boolean bl) {
        ax.Z0.b.t(this, a8, n8, bl);
    }

    @Override
    public /* synthetic */ void Z(c.a a8, long l8, int n8) {
        ax.Z0.b.l0(this, a8, l8, n8);
    }

    @Override
    public void a(c.a object, B b8) {
        block3: {
            block4: {
                block5: {
                    block2: {
                        if (((c.a)object).d == null) break block2;
                        object = new b(ax.S0.a.e(b8.c), b8.d, this.c.g(((c.a)object).b, ax.S0.a.e(((c.a)object).d)));
                        int n8 = b8.b;
                        if (n8 == 0) break block3;
                        if (n8 == 1) break block4;
                        if (n8 == 2) break block3;
                        if (n8 == 3) break block5;
                    }
                    return;
                }
                this.r = object;
                return;
            }
            this.q = object;
            return;
        }
        this.p = object;
    }

    @Override
    public void a0(c.a object, a0 a02) {
        object = this.p;
        if (object != null) {
            v v8 = ((b)object).a;
            if (v8.w == -1) {
                this.p = new b(v8.b().F0(a02.a).h0(a02.b).P(), ((b)object).b, ((b)object).c);
            }
        }
    }

    @Override
    public /* synthetic */ void b(c.a a8, String string) {
        ax.Z0.b.e(this, a8, string);
    }

    @Override
    public void b0(c.a a8, H.e e8, H.e e9, int n8) {
        if (n8 == 1) {
            this.v = true;
        }
        this.l = n8;
    }

    @Override
    public /* synthetic */ void c(c.a a8) {
        ax.Z0.b.Y(this, a8);
    }

    @Override
    public /* synthetic */ void c0(c.a a8, G g8) {
        ax.Z0.b.O(this, a8, g8);
    }

    @Override
    public /* synthetic */ void d(c.a a8, n n8) {
        ax.Z0.b.s(this, a8, n8);
    }

    @Override
    public void d0(H h8, c.b b8) {
        if (b8.d() != 0) {
            this.Q0(b8);
            long l8 = SystemClock.elapsedRealtime();
            this.W0(h8, b8);
            this.S0(l8);
            this.U0(h8, b8, l8);
            this.R0(l8);
            this.T0(h8, b8, l8);
            if (b8.a(1028)) {
                this.c.e(b8.c(1028));
            }
        }
    }

    @Override
    public /* synthetic */ void e(c.a a8, Exception exception) {
        ax.Z0.b.k(this, a8, exception);
    }

    @Override
    public /* synthetic */ void e0(c.a a8, B.a a9) {
        ax.Z0.b.m(this, a8, a9);
    }

    @Override
    public /* synthetic */ void f(c.a a8, int n8, int n9) {
        ax.Z0.b.b0(this, a8, n8, n9);
    }

    @Override
    public /* synthetic */ void f0(c.a a8, A a9) {
        ax.Z0.b.L(this, a8, a9);
    }

    @Override
    public /* synthetic */ void g(c.a a8) {
        ax.Z0.b.S(this, a8);
    }

    @Override
    public /* synthetic */ void g0(c.a a8, Object object, long l8) {
        ax.Z0.b.V(this, a8, object, l8);
    }

    @Override
    public /* synthetic */ void h(c.a a8, B b8) {
        ax.Z0.b.f0(this, a8, b8);
    }

    @Override
    public /* synthetic */ void h0(c.a a8, float f8) {
        ax.Z0.b.o0(this, a8, f8);
    }

    @Override
    public /* synthetic */ void i(c.a a8) {
        ax.Z0.b.v(this, a8);
    }

    @Override
    public /* synthetic */ void i0(c.a a8, String string, long l8) {
        ax.Z0.b.c(this, a8, string, l8);
    }

    @Override
    public /* synthetic */ void j(c.a a8, ax.P0.c c8) {
        ax.Z0.b.a(this, a8, c8);
    }

    @Override
    public /* synthetic */ void j0(c.a a8, F f8) {
        ax.Z0.b.R(this, a8, f8);
    }

    public /* synthetic */ void k(c.a a8, List list) {
        ax.Z0.b.r(this, a8, list);
    }

    @Override
    public /* synthetic */ void k0(c.a a8, v v8, ax.Y0.c c8) {
        ax.Z0.b.m0(this, a8, v8, c8);
    }

    @Override
    public /* synthetic */ void l(c.a a8, String string, long l8) {
        ax.Z0.b.h0(this, a8, string, l8);
    }

    @Override
    public /* synthetic */ void l0(c.a a8, int n8, int n9, boolean bl) {
        ax.Z0.b.W(this, a8, n8, n9, bl);
    }

    @Override
    public /* synthetic */ void m(c.a a8, v v8, ax.Y0.c c8) {
        ax.Z0.b.h(this, a8, v8, c8);
    }

    @Override
    public /* synthetic */ void m0(c.a a8, boolean bl, int n8) {
        ax.Z0.b.T(this, a8, bl, n8);
    }

    @Override
    public /* synthetic */ void n(c.a a8, boolean bl) {
        ax.Z0.b.a0(this, a8, bl);
    }

    @Override
    public /* synthetic */ void n0(c.a a8, boolean bl) {
        ax.Z0.b.J(this, a8, bl);
    }

    @Override
    public void o(c.a a8, String string, String string2) {
    }

    @Override
    public /* synthetic */ void o0(c.a a8, boolean bl) {
        ax.Z0.b.D(this, a8, bl);
    }

    @Override
    public void p(c.a a8, F f8) {
        this.o = f8;
    }

    @Override
    public /* synthetic */ void p0(c.a a8, String string, long l8, long l9) {
        ax.Z0.b.d(this, a8, string, l8, l9);
    }

    @Override
    public /* synthetic */ void q(c.a a8, Exception exception) {
        ax.Z0.b.g0(this, a8, exception);
    }

    @Override
    public /* synthetic */ void q0(c.a a8, C c8) {
        ax.Z0.b.M(this, a8, c8);
    }

    @Override
    public /* synthetic */ void r(c.a a8, ax.Y0.b b8) {
        ax.Z0.b.g(this, a8, b8);
    }

    @Override
    public /* synthetic */ void r0(c.a a8, int n8) {
        ax.Z0.b.U(this, a8, n8);
    }

    @Override
    public /* synthetic */ void s(c.a a8, int n8, int n9, int n10, float f8) {
        ax.Z0.b.n0(this, a8, n8, n9, n10, f8);
    }

    @Override
    public /* synthetic */ void s0(c.a a8, H.b b8) {
        ax.Z0.b.o(this, a8, b8);
    }

    @Override
    public /* synthetic */ void t(c.a a8, Exception exception) {
        ax.Z0.b.b(this, a8, exception);
    }

    @Override
    public /* synthetic */ void t0(c.a a8, String string) {
        ax.Z0.b.j0(this, a8, string);
    }

    @Override
    public /* synthetic */ void u(c.a a8, ax.Y0.b b8) {
        ax.Z0.b.f(this, a8, b8);
    }

    @Override
    public /* synthetic */ void u0(c.a a8, Exception exception) {
        ax.Z0.b.z(this, a8, exception);
    }

    @Override
    public /* synthetic */ void v(c.a a8, boolean bl, int n8) {
        ax.Z0.b.N(this, a8, bl, n8);
    }

    @Override
    public void v0(c.a a8, ax.Y0.b b8) {
        this.y += b8.g;
        this.z += b8.e;
    }

    @Override
    public /* synthetic */ void w(c.a a8, int n8) {
        ax.Z0.b.P(this, a8, n8);
    }

    @Override
    public void w0(c.a object, int n8, long l8, long l9) {
        Object object2 = ((c.a)object).d;
        if (object2 != null) {
            object = this.c.g(((c.a)object).b, ax.S0.a.e(object2));
            Serializable serializable = this.i.get(object);
            object2 = this.h.get(object);
            HashMap<String, Long> hashMap = this.i;
            long l10 = 0L;
            l9 = serializable == null ? 0L : (Long)serializable;
            hashMap.put((String)object, l9 + l8);
            serializable = this.h;
            l8 = object2 == null ? l10 : (Long)object2;
            ((HashMap)serializable).put(object, l8 + (long)n8);
        }
    }

    @Override
    public /* synthetic */ void x(c.a a8, boolean bl) {
        ax.Z0.b.Z(this, a8, bl);
    }

    @Override
    public /* synthetic */ void x0(c.a a8, int n8) {
        ax.Z0.b.Q(this, a8, n8);
    }

    @Override
    public void y(c.a object, String string, boolean bl) {
        object = ((c.a)object).d;
        if ((object == null || !((F.b)object).b()) && string.equals(this.j)) {
            this.G0();
        }
        this.h.remove(string);
        this.i.remove(string);
    }

    @Override
    public /* synthetic */ void y0(c.a a8) {
        ax.Z0.b.u(this, a8);
    }

    @Override
    public /* synthetic */ void z(c.a a8, int n8, long l8) {
        ax.Z0.b.B(this, a8, n8, l8);
    }

    private static final class a {
        public final int a;
        public final int b;

        public a(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    private static final class b {
        public final v a;
        public final int b;
        public final String c;

        public b(v v8, int n8, String string) {
            this.a = v8;
            this.b = n8;
            this.c = string;
        }
    }
}


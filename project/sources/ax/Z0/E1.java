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
import androidx.media3.exoplayer.C0622s;
import ax.P0.C0894c;
import ax.P0.C0900i;
import ax.P0.C0905n;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.H;
import ax.P0.N;
import ax.P0.V;
import ax.S0.C0968a;
import ax.S0.C0969b;
import ax.S0.C0992z;
import ax.U0.A;
import ax.U0.q;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Z0.F1;
import ax.Z0.InterfaceC1206c;
import ax.a1.InterfaceC1276B;
import ax.b1.C1459h;
import ax.b1.InterfaceC1465n;
import ax.f1.C2004B;
import ax.f1.L;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.InterfaceC2209F;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class E1 implements InterfaceC1206c, F1.a {
    private int A;
    private boolean B;
    private final Context a;
    private final F1 c;
    private final PlaybackSession d;
    private String j;
    private PlaybackMetrics.Builder k;
    private int l;
    private ax.P0.F o;
    private b p;
    private b q;
    private b r;
    private C0912v s;
    private C0912v t;
    private C0912v u;
    private boolean v;
    private int w;
    private boolean x;
    private int y;
    private int z;
    private final Executor b = C0969b.a();
    private final N.c f = new N.c();
    private final N.b g = new N.b();
    private final HashMap<String, Long> i = new HashMap<>();
    private final HashMap<String, Long> h = new HashMap<>();
    private final long e = SystemClock.elapsedRealtime();
    private int m = 0;
    private int n = 0;

    private static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static final class b {
        public final C0912v a;
        public final int b;
        public final String c;

        public b(C0912v c0912v, int i, String str) {
            this.a = c0912v;
            this.b = i;
            this.c = str;
        }
    }

    private E1(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        C1253w0 c1253w0 = new C1253w0();
        this.c = c1253w0;
        c1253w0.c(this);
    }

    private boolean E0(b bVar) {
        return bVar != null && bVar.c.equals(this.c.a());
    }

    public static E1 F0(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a2 = u1.a(context.getSystemService("media_metrics"));
        if (a2 == null) {
            return null;
        }
        createPlaybackSession = a2.createPlaybackSession();
        return new E1(context, createPlaybackSession);
    }

    private void G0() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            build = this.k.build();
            this.b.execute(new Runnable() { // from class: ax.Z0.C1
                @Override // java.lang.Runnable
                public final void run() {
                    E1.this.d.reportPlaybackMetrics(build);
                }
            });
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

    @SuppressLint({"SwitchIntDef"})
    private static int H0(int i) {
        switch (ax.S0.d0.b0(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static C0906o I0(AbstractC2991z<V.a> abstractC2991z) {
        C0906o c0906o;
        ax.r7.j0<V.a> it = abstractC2991z.iterator();
        while (it.hasNext()) {
            V.a next = it.next();
            for (int i = 0; i < next.a; i++) {
                if (next.i(i) && (c0906o = next.b(i).s) != null) {
                    return c0906o;
                }
            }
        }
        return null;
    }

    private static int J0(C0906o c0906o) {
        for (int i = 0; i < c0906o.e0; i++) {
            UUID uuid = c0906o.e(i).c0;
            if (uuid.equals(C0900i.d)) {
                return 3;
            }
            if (uuid.equals(C0900i.e)) {
                return 2;
            }
            if (uuid.equals(C0900i.c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a K0(ax.P0.F f, Context context, boolean z) {
        int i;
        boolean z2;
        if (f.q == 1001) {
            return new a(20, 0);
        }
        if (f instanceof C0622s) {
            C0622s c0622s = (C0622s) f;
            z2 = c0622s.k0 == 1;
            i = c0622s.o0;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) C0968a.e(f.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new a(35, 0);
            }
            if (z2 && i == 3) {
                return new a(15, 0);
            }
            if (z2 && i == 2) {
                return new a(23, 0);
            }
            if (th instanceof L.c) {
                return new a(13, ax.S0.d0.c0(((L.c) th).e0));
            }
            if (th instanceof C2004B) {
                return new a(14, ((C2004B) th).d0);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC1276B.c) {
                return new a(17, ((InterfaceC1276B.c) th).q);
            }
            if (th instanceof InterfaceC1276B.f) {
                return new a(18, ((InterfaceC1276B.f) th).q);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(H0(errorCode), errorCode);
        }
        if (th instanceof ax.U0.u) {
            return new a(5, ((ax.U0.u) th).e0);
        }
        if ((th instanceof ax.U0.t) || (th instanceof ax.P0.E)) {
            return new a(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof ax.U0.s;
        if (z3 || (th instanceof A.a)) {
            if (C0992z.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z3 && ((ax.U0.s) th).d0 == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (f.q == 1002) {
            return new a(21, 0);
        }
        if (th instanceof InterfaceC1465n.a) {
            Throwable th2 = (Throwable) C0968a.e(th.getCause());
            if (!(th2 instanceof MediaDrm.MediaDrmStateException)) {
                return s1.a(th2) ? new a(27, 0) : th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof ax.b1.U ? new a(23, 0) : th2 instanceof C1459h.e ? new a(28, 0) : new a(30, 0);
            }
            int c0 = ax.S0.d0.c0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new a(H0(c0), c0);
        }
        if (!(th instanceof q.a) || !(th.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) C0968a.e(th.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    private static Pair<String, String> L0(String str) {
        String[] x1 = ax.S0.d0.x1(str, "-");
        return Pair.create(x1[0], x1.length >= 2 ? x1[1] : null);
    }

    private static int N0(Context context) {
        switch (C0992z.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int O0(C0915y c0915y) {
        C0915y.h hVar = c0915y.b;
        if (hVar == null) {
            return 0;
        }
        int E0 = ax.S0.d0.E0(hVar.a, hVar.b);
        if (E0 == 0) {
            return 3;
        }
        if (E0 != 1) {
            return E0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int P0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    private void Q0(InterfaceC1206c.b bVar) {
        for (int i = 0; i < bVar.d(); i++) {
            int b2 = bVar.b(i);
            InterfaceC1206c.a c = bVar.c(b2);
            if (b2 == 0) {
                this.c.f(c);
            } else if (b2 == 11) {
                this.c.d(c, this.l);
            } else {
                this.c.b(c);
            }
        }
    }

    private void R0(long j) {
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis;
        final NetworkEvent build;
        int N0 = N0(this.a);
        if (N0 != this.n) {
            this.n = N0;
            networkType = I0.a().setNetworkType(N0);
            timeSinceCreatedMillis = networkType.setTimeSinceCreatedMillis(j - this.e);
            build = timeSinceCreatedMillis.build();
            this.b.execute(new Runnable() { // from class: ax.Z0.A1
                @Override // java.lang.Runnable
                public final void run() {
                    E1.this.d.reportNetworkEvent(build);
                }
            });
        }
    }

    private void S0(long j) {
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build;
        ax.P0.F f = this.o;
        if (f == null) {
            return;
        }
        a K0 = K0(f, this.a, this.w == 4);
        timeSinceCreatedMillis = C1214e1.a().setTimeSinceCreatedMillis(j - this.e);
        errorCode = timeSinceCreatedMillis.setErrorCode(K0.a);
        subErrorCode = errorCode.setSubErrorCode(K0.b);
        exception = subErrorCode.setException(f);
        build = exception.build();
        this.b.execute(new Runnable() { // from class: ax.Z0.B1
            @Override // java.lang.Runnable
            public final void run() {
                E1.this.d.reportPlaybackErrorEvent(build);
            }
        });
        this.B = true;
        this.o = null;
    }

    private void T0(ax.P0.H h, InterfaceC1206c.b bVar, long j) {
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        if (h.i() != 2) {
            this.v = false;
        }
        if (h.R() == null) {
            this.x = false;
        } else if (bVar.a(10)) {
            this.x = true;
        }
        int b1 = b1(h);
        if (this.m != b1) {
            this.m = b1;
            this.B = true;
            state = p1.a().setState(this.m);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(j - this.e);
            build = timeSinceCreatedMillis.build();
            this.b.execute(new Runnable() { // from class: ax.Z0.D1
                @Override // java.lang.Runnable
                public final void run() {
                    E1.this.d.reportPlaybackStateEvent(build);
                }
            });
        }
    }

    private void U0(ax.P0.H h, InterfaceC1206c.b bVar, long j) {
        if (bVar.a(2)) {
            ax.P0.V X = h.X();
            boolean c = X.c(2);
            boolean c2 = X.c(1);
            boolean c3 = X.c(3);
            if (c || c2 || c3) {
                if (!c) {
                    Z0(j, null, 0);
                }
                if (!c2) {
                    V0(j, null, 0);
                }
                if (!c3) {
                    X0(j, null, 0);
                }
            }
        }
        if (E0(this.p)) {
            b bVar2 = this.p;
            C0912v c0912v = bVar2.a;
            if (c0912v.w != -1) {
                Z0(j, c0912v, bVar2.b);
                this.p = null;
            }
        }
        if (E0(this.q)) {
            b bVar3 = this.q;
            V0(j, bVar3.a, bVar3.b);
            this.q = null;
        }
        if (E0(this.r)) {
            b bVar4 = this.r;
            X0(j, bVar4.a, bVar4.b);
            this.r = null;
        }
    }

    private void V0(long j, C0912v c0912v, int i) {
        if (Objects.equals(this.t, c0912v)) {
            return;
        }
        int i2 = (this.t == null && i == 0) ? 1 : i;
        this.t = c0912v;
        a1(0, j, c0912v, i2);
    }

    private void W0(ax.P0.H h, InterfaceC1206c.b bVar) {
        C0906o I0;
        if (bVar.a(0)) {
            InterfaceC1206c.a c = bVar.c(0);
            if (this.k != null) {
                Y0(c.b, c.d);
            }
        }
        if (bVar.a(2) && this.k != null && (I0 = I0(h.X().a())) != null) {
            O0.a(ax.S0.d0.i(this.k)).setDrmType(J0(I0));
        }
        if (bVar.a(1011)) {
            this.A++;
        }
    }

    private void X0(long j, C0912v c0912v, int i) {
        if (Objects.equals(this.u, c0912v)) {
            return;
        }
        int i2 = (this.u == null && i == 0) ? 1 : i;
        this.u = c0912v;
        a1(2, j, c0912v, i2);
    }

    private void Y0(ax.P0.N n, InterfaceC2209F.b bVar) {
        int b2;
        PlaybackMetrics.Builder builder = this.k;
        if (bVar == null || (b2 = n.b(bVar.a)) == -1) {
            return;
        }
        n.f(b2, this.g);
        n.n(this.g.c, this.f);
        builder.setStreamType(O0(this.f.c));
        N.c cVar = this.f;
        if (cVar.m != -9223372036854775807L && !cVar.k && !cVar.i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f.d());
        }
        builder.setPlaybackType(this.f.f() ? 2 : 1);
        this.B = true;
    }

    private void Z0(long j, C0912v c0912v, int i) {
        if (Objects.equals(this.s, c0912v)) {
            return;
        }
        int i2 = (this.s == null && i == 0) ? 1 : i;
        this.s = c0912v;
        a1(1, j, c0912v, i2);
    }

    private void a1(int i, long j, C0912v c0912v, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = C1255x0.a(i).setTimeSinceCreatedMillis(j - this.e);
        if (c0912v != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(P0(i2));
            String str = c0912v.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0912v.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0912v.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c0912v.j;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c0912v.v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c0912v.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c0912v.G;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c0912v.H;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c0912v.d;
            if (str4 != null) {
                Pair<String, String> L0 = L0(str4);
                timeSinceCreatedMillis.setLanguage((String) L0.first);
                Object obj = L0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c0912v.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        build = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() { // from class: ax.Z0.z1
            @Override // java.lang.Runnable
            public final void run() {
                E1.this.d.reportTrackChangeEvent(build);
            }
        });
    }

    private int b1(ax.P0.H h) {
        int i = h.i();
        if (this.v) {
            return 5;
        }
        if (this.x) {
            return 13;
        }
        if (i == 4) {
            return 11;
        }
        if (i == 2) {
            int i2 = this.m;
            if (i2 == 0 || i2 == 2 || i2 == 12) {
                return 2;
            }
            if (h.v()) {
                return h.f0() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (i == 3) {
            if (h.v()) {
                return h.f0() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (i != 1 || this.m == 0) {
            return this.m;
        }
        return 12;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void A(InterfaceC1206c.a aVar) {
        C1203b.w(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void B(InterfaceC1206c.a aVar, int i) {
        C1203b.j(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void C(InterfaceC1206c.a aVar, long j) {
        C1203b.i(this, aVar, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void D(InterfaceC1206c.a aVar, ax.P0.V v) {
        C1203b.e0(this, aVar, v);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void E(InterfaceC1206c.a aVar, C1176b c1176b) {
        C1203b.k0(this, aVar, c1176b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void F(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b, IOException iOException, boolean z) {
        this.w = c2205b.a;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void G(InterfaceC1206c.a aVar, C0915y c0915y, int i) {
        C1203b.K(this, aVar, c0915y, i);
    }

    @Override // ax.Z0.F1.a
    public void H(InterfaceC1206c.a aVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        InterfaceC2209F.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            G0();
            this.j = str;
            playerName = T0.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.8.1");
            this.k = playerVersion;
            Y0(aVar.b, aVar.d);
        }
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void I(InterfaceC1206c.a aVar, int i) {
        C1203b.X(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void K(InterfaceC1206c.a aVar) {
        C1203b.A(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void L(InterfaceC1206c.a aVar, ax.R0.c cVar) {
        C1203b.q(this, aVar, cVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void M(InterfaceC1206c.a aVar) {
        C1203b.x(this, aVar);
    }

    public LogSessionId M0() {
        LogSessionId sessionId;
        sessionId = this.d.getSessionId();
        return sessionId;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void N(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b, int i) {
        C1203b.I(this, aVar, c2234y, c2205b, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void O(InterfaceC1206c.a aVar, int i) {
        C1203b.c0(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void P(InterfaceC1206c.a aVar, boolean z) {
        C1203b.E(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void Q(InterfaceC1206c.a aVar, int i, long j, long j2) {
        C1203b.n(this, aVar, i, j, j2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void R(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b) {
        C1203b.H(this, aVar, c2234y, c2205b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void S(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b) {
        C1203b.G(this, aVar, c2234y, c2205b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void T(InterfaceC1206c.a aVar, int i) {
        C1203b.y(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void U(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b) {
        C1203b.F(this, aVar, c2234y, c2205b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void V(InterfaceC1206c.a aVar, String str, long j, long j2) {
        C1203b.i0(this, aVar, str, j, j2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void W(InterfaceC1206c.a aVar, ax.P0.T t) {
        C1203b.d0(this, aVar, t);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void X(InterfaceC1206c.a aVar, InterfaceC1276B.a aVar2) {
        C1203b.l(this, aVar, aVar2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void Y(InterfaceC1206c.a aVar, int i, boolean z) {
        C1203b.t(this, aVar, i, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void Z(InterfaceC1206c.a aVar, long j, int i) {
        C1203b.l0(this, aVar, j, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void a(InterfaceC1206c.a aVar, C2205B c2205b) {
        if (aVar.d == null) {
            return;
        }
        b bVar = new b((C0912v) C0968a.e(c2205b.c), c2205b.d, this.c.g(aVar.b, (InterfaceC2209F.b) C0968a.e(aVar.d)));
        int i = c2205b.b;
        if (i != 0) {
            if (i == 1) {
                this.q = bVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.r = bVar;
                return;
            }
        }
        this.p = bVar;
    }

    @Override // ax.Z0.InterfaceC1206c
    public void a0(InterfaceC1206c.a aVar, ax.P0.a0 a0Var) {
        b bVar = this.p;
        if (bVar != null) {
            C0912v c0912v = bVar.a;
            if (c0912v.w == -1) {
                this.p = new b(c0912v.b().F0(a0Var.a).h0(a0Var.b).P(), bVar.b, bVar.c);
            }
        }
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void b(InterfaceC1206c.a aVar, String str) {
        C1203b.e(this, aVar, str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void b0(InterfaceC1206c.a aVar, H.e eVar, H.e eVar2, int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void c(InterfaceC1206c.a aVar) {
        C1203b.Y(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void c0(InterfaceC1206c.a aVar, ax.P0.G g) {
        C1203b.O(this, aVar, g);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void d(InterfaceC1206c.a aVar, C0905n c0905n) {
        C1203b.s(this, aVar, c0905n);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void d0(ax.P0.H h, InterfaceC1206c.b bVar) {
        if (bVar.d() == 0) {
            return;
        }
        Q0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        W0(h, bVar);
        S0(elapsedRealtime);
        U0(h, bVar, elapsedRealtime);
        R0(elapsedRealtime);
        T0(h, bVar, elapsedRealtime);
        if (bVar.a(1028)) {
            this.c.e(bVar.c(1028));
        }
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void e(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.k(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void e0(InterfaceC1206c.a aVar, InterfaceC1276B.a aVar2) {
        C1203b.m(this, aVar, aVar2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void f(InterfaceC1206c.a aVar, int i, int i2) {
        C1203b.b0(this, aVar, i, i2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void f0(InterfaceC1206c.a aVar, ax.P0.A a2) {
        C1203b.L(this, aVar, a2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void g(InterfaceC1206c.a aVar) {
        C1203b.S(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void g0(InterfaceC1206c.a aVar, Object obj, long j) {
        C1203b.V(this, aVar, obj, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void h(InterfaceC1206c.a aVar, C2205B c2205b) {
        C1203b.f0(this, aVar, c2205b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void h0(InterfaceC1206c.a aVar, float f) {
        C1203b.o0(this, aVar, f);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void i(InterfaceC1206c.a aVar) {
        C1203b.v(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void i0(InterfaceC1206c.a aVar, String str, long j) {
        C1203b.c(this, aVar, str, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void j(InterfaceC1206c.a aVar, C0894c c0894c) {
        C1203b.a(this, aVar, c0894c);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void j0(InterfaceC1206c.a aVar, ax.P0.F f) {
        C1203b.R(this, aVar, f);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void k(InterfaceC1206c.a aVar, List list) {
        C1203b.r(this, aVar, list);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void k0(InterfaceC1206c.a aVar, C0912v c0912v, C1177c c1177c) {
        C1203b.m0(this, aVar, c0912v, c1177c);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void l(InterfaceC1206c.a aVar, String str, long j) {
        C1203b.h0(this, aVar, str, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void l0(InterfaceC1206c.a aVar, int i, int i2, boolean z) {
        C1203b.W(this, aVar, i, i2, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void m(InterfaceC1206c.a aVar, C0912v c0912v, C1177c c1177c) {
        C1203b.h(this, aVar, c0912v, c1177c);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void m0(InterfaceC1206c.a aVar, boolean z, int i) {
        C1203b.T(this, aVar, z, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void n(InterfaceC1206c.a aVar, boolean z) {
        C1203b.a0(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void n0(InterfaceC1206c.a aVar, boolean z) {
        C1203b.J(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void o0(InterfaceC1206c.a aVar, boolean z) {
        C1203b.D(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void p(InterfaceC1206c.a aVar, ax.P0.F f) {
        this.o = f;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void p0(InterfaceC1206c.a aVar, String str, long j, long j2) {
        C1203b.d(this, aVar, str, j, j2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void q(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.g0(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void q0(InterfaceC1206c.a aVar, ax.P0.C c) {
        C1203b.M(this, aVar, c);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void r(InterfaceC1206c.a aVar, C1176b c1176b) {
        C1203b.g(this, aVar, c1176b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void r0(InterfaceC1206c.a aVar, int i) {
        C1203b.U(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void s(InterfaceC1206c.a aVar, int i, int i2, int i3, float f) {
        C1203b.n0(this, aVar, i, i2, i3, f);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void s0(InterfaceC1206c.a aVar, H.b bVar) {
        C1203b.o(this, aVar, bVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void t(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.b(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void t0(InterfaceC1206c.a aVar, String str) {
        C1203b.j0(this, aVar, str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void u(InterfaceC1206c.a aVar, C1176b c1176b) {
        C1203b.f(this, aVar, c1176b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void u0(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.z(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void v(InterfaceC1206c.a aVar, boolean z, int i) {
        C1203b.N(this, aVar, z, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void v0(InterfaceC1206c.a aVar, C1176b c1176b) {
        this.y += c1176b.g;
        this.z += c1176b.e;
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void w(InterfaceC1206c.a aVar, int i) {
        C1203b.P(this, aVar, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void w0(InterfaceC1206c.a aVar, int i, long j, long j2) {
        InterfaceC2209F.b bVar = aVar.d;
        if (bVar != null) {
            String g = this.c.g(aVar.b, (InterfaceC2209F.b) C0968a.e(bVar));
            Long l = this.i.get(g);
            Long l2 = this.h.get(g);
            this.i.put(g, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.h.put(g, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void x(InterfaceC1206c.a aVar, boolean z) {
        C1203b.Z(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void x0(InterfaceC1206c.a aVar, int i) {
        C1203b.Q(this, aVar, i);
    }

    @Override // ax.Z0.F1.a
    public void y(InterfaceC1206c.a aVar, String str, boolean z) {
        InterfaceC2209F.b bVar = aVar.d;
        if ((bVar == null || !bVar.b()) && str.equals(this.j)) {
            G0();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void y0(InterfaceC1206c.a aVar) {
        C1203b.u(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void z(InterfaceC1206c.a aVar, int i, long j) {
        C1203b.B(this, aVar, i, j);
    }

    @Override // ax.Z0.F1.a
    public void J(InterfaceC1206c.a aVar, String str) {
    }

    @Override // ax.Z0.F1.a
    public void o(InterfaceC1206c.a aVar, String str, String str2) {
    }
}

package ax.a1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import ax.P0.C0894c;
import ax.P0.C0898g;
import ax.P0.C0912v;
import ax.Q0.o;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.Z0.I1;
import ax.a1.C1288f0;
import ax.a1.C1294j;
import ax.a1.F;
import ax.a1.InterfaceC1276B;
import ax.a1.r0;
import ax.q1.C2842b;
import ax.q1.C2843c;
import ax.q1.C2856p;
import ax.q1.C2860u;
import ax.r7.AbstractC2991z;
import ax.v0.ExecutorC3244a;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.a1.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288f0 implements InterfaceC1276B {
    public static boolean q0 = false;
    private static final Object r0 = new Object();
    private static ScheduledExecutorService s0;
    private static int t0;
    private C1285e A;
    private C1294j B;
    private l C;
    private C0894c D;
    private k E;
    private k F;
    private ax.P0.G G;
    private boolean H;
    private ByteBuffer I;
    private int J;
    private long K;
    private long L;
    private long M;
    private long N;
    private int O;
    private boolean P;
    private boolean Q;
    private long R;
    private float S;
    private ByteBuffer T;
    private int U;
    private ByteBuffer V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private final Context a;
    private boolean a0;
    private final ax.Q0.p b;
    private int b0;
    private final boolean c;
    private boolean c0;
    private final G d;
    private C0898g d0;
    private final H0 e;
    private C1295k e0;
    private final ax.Q0.t f;
    private boolean f0;
    private final G0 g;
    private long g0;
    private final AbstractC2991z<ax.Q0.o> h;
    private long h0;
    private final F i;
    private boolean i0;
    private final ArrayDeque<k> j;
    private boolean j0;
    private final boolean k;
    private Looper k0;
    private int l;
    private long l0;
    private o m;
    private long m0;
    private final m<InterfaceC1276B.c> n;
    private Handler n0;
    private final m<InterfaceC1276B.f> o;
    private Context o0;
    private final e p;
    private boolean p0;
    private final d q;
    private final ExoPlayer.a r;
    private final f s;
    private final int t;
    private I1 u;
    private InterfaceC1276B.d v;
    private h w;
    private h x;
    private ax.Q0.n y;
    private AudioTrack z;

    /* renamed from: ax.a1.f0$b */
    private static final class b {
        public static long a(AudioTrack audioTrack, h hVar) {
            int bufferSizeInFrames;
            int bufferSizeInFrames2;
            if (hVar.c == 0) {
                bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                return hVar.d(bufferSizeInFrames2);
            }
            bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
            return ax.S0.d0.r1(bufferSizeInFrames, 1000000L, C1288f0.d0(hVar.g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, C1295k c1295k) {
            audioTrack.setPreferredDevice(c1295k == null ? null : c1295k.a);
        }
    }

    /* renamed from: ax.a1.f0$c */
    private static final class c {
        public static void a(AudioTrack audioTrack, I1 i1) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId a = i1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            audioTrack.setLogSessionId(a);
        }
    }

    /* renamed from: ax.a1.f0$d */
    public interface d {
        C1296l a(C0912v c0912v, C0894c c0894c);
    }

    /* renamed from: ax.a1.f0$e */
    public interface e {
        public static final e a = new r0.a().h();

        int a(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* renamed from: ax.a1.f0$f */
    public interface f {
        public static final f a = new B0();

        int a(int i);

        AudioTrack b(InterfaceC1276B.a aVar, C0894c c0894c, int i, Context context);
    }

    /* renamed from: ax.a1.f0$h */
    private static final class h {
        public final C0912v a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final ax.Q0.n i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public h(C0912v c0912v, int i, int i2, int i3, int i4, int i5, int i6, int i7, ax.Q0.n nVar, boolean z, boolean z2, boolean z3) {
            this.a = c0912v;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = nVar;
            this.j = z;
            this.k = z2;
            this.l = z3;
        }

        public InterfaceC1276B.a a() {
            return new InterfaceC1276B.a(this.g, this.e, this.f, this.l, this.c == 1, this.h);
        }

        public boolean b(h hVar) {
            return hVar.c == this.c && hVar.g == this.g && hVar.e == this.e && hVar.f == this.f && hVar.d == this.d && hVar.j == this.j && hVar.k == this.k;
        }

        public h c(int i) {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, i, this.i, this.j, this.k, this.l);
        }

        public long d(long j) {
            return ax.S0.d0.o1(j, this.e);
        }

        public long e(long j) {
            return ax.S0.d0.o1(j, this.a.H);
        }

        public boolean f() {
            return this.c == 1;
        }
    }

    /* renamed from: ax.a1.f0$i */
    public static class i implements ax.Q0.p {
        private final ax.Q0.o[] a;
        private final F0 b;
        private final ax.Q0.s c;

        public i(ax.Q0.o... oVarArr) {
            this(oVarArr, new F0(), new ax.Q0.s());
        }

        @Override // ax.Q0.p
        public long a(long j) {
            return this.c.e() ? this.c.i(j) : j;
        }

        @Override // ax.Q0.p
        public ax.P0.G b(ax.P0.G g) {
            this.c.k(g.a);
            this.c.j(g.b);
            return g;
        }

        @Override // ax.Q0.p
        public long c() {
            return this.b.v();
        }

        @Override // ax.Q0.p
        public boolean d(boolean z) {
            this.b.E(z);
            return z;
        }

        @Override // ax.Q0.p
        public ax.Q0.o[] e() {
            return this.a;
        }

        public i(ax.Q0.o[] oVarArr, F0 f0, ax.Q0.s sVar) {
            ax.Q0.o[] oVarArr2 = new ax.Q0.o[oVarArr.length + 2];
            this.a = oVarArr2;
            System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            this.b = f0;
            this.c = sVar;
            oVarArr2[oVarArr.length] = f0;
            oVarArr2[oVarArr.length + 1] = sVar;
        }
    }

    /* renamed from: ax.a1.f0$j */
    public static final class j extends RuntimeException {
        private j(String str) {
            super(str);
        }
    }

    /* renamed from: ax.a1.f0$k */
    private static final class k {
        public final ax.P0.G a;
        public final long b;
        public final long c;
        public long d;

        private k(ax.P0.G g, long j, long j2) {
            this.a = g;
            this.b = j;
            this.c = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.a1.f0$l */
    static final class l {
        private final AudioTrack a;
        private final C1294j b;
        private AudioRouting.OnRoutingChangedListener c = new AudioRouting.OnRoutingChangedListener() { // from class: ax.a1.o0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C1288f0.l.this.b(audioRouting);
            }
        };

        public l(AudioTrack audioTrack, C1294j c1294j) {
            this.a = audioTrack;
            this.b = c1294j;
            audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
        
            r2 = r2.getRoutedDevice();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(android.media.AudioRouting r2) {
            /*
                r1 = this;
                android.media.AudioRouting$OnRoutingChangedListener r0 = r1.c
                if (r0 != 0) goto L5
                goto L10
            L5:
                android.media.AudioDeviceInfo r2 = ax.a1.n0.a(r2)
                if (r2 == 0) goto L10
                ax.a1.j r0 = r1.b
                r0.j(r2)
            L10:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.a1.C1288f0.l.b(android.media.AudioRouting):void");
        }

        public void c() {
            this.a.removeOnRoutingChangedListener(l0.a(C0968a.e(this.c)));
            this.c = null;
        }
    }

    /* renamed from: ax.a1.f0$m */
    private static final class m<T extends Exception> {
        private T a;
        private long b = -9223372036854775807L;
        private long c = -9223372036854775807L;

        public void a() {
            this.a = null;
            this.b = -9223372036854775807L;
            this.c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.a == null) {
                return false;
            }
            return C1288f0.h0() || SystemClock.elapsedRealtime() < this.c;
        }

        public void c(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t;
            }
            if (this.b == -9223372036854775807L && !C1288f0.h0()) {
                this.b = 200 + elapsedRealtime;
            }
            long j = this.b;
            if (j == -9223372036854775807L || elapsedRealtime < j) {
                this.c = elapsedRealtime + 50;
                return;
            }
            T t2 = this.a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.a;
            a();
            throw t3;
        }
    }

    /* renamed from: ax.a1.f0$n */
    private final class n implements F.a {
        private n() {
        }

        @Override // ax.a1.F.a
        public void a(long j) {
            if (C1288f0.this.v != null) {
                C1288f0.this.v.a(j);
            }
        }

        @Override // ax.a1.F.a
        public void b(int i, long j) {
            if (C1288f0.this.v != null) {
                C1288f0.this.v.i(i, j, SystemClock.elapsedRealtime() - C1288f0.this.h0);
            }
        }

        @Override // ax.a1.F.a
        public void c(long j) {
            C0987u.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // ax.a1.F.a
        public void d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1288f0.this.e0() + ", " + C1288f0.this.f0();
            if (C1288f0.q0) {
                throw new j(str);
            }
            C0987u.h("DefaultAudioSink", str);
        }

        @Override // ax.a1.F.a
        public void e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1288f0.this.e0() + ", " + C1288f0.this.f0();
            if (C1288f0.q0) {
                throw new j(str);
            }
            C0987u.h("DefaultAudioSink", str);
        }
    }

    /* renamed from: ax.a1.f0$o */
    private final class o {
        private final Handler a = new Handler(Looper.myLooper());
        private final AudioTrack.StreamEventCallback b;

        /* renamed from: ax.a1.f0$o$a */
        class a extends AudioTrack.StreamEventCallback {
            final /* synthetic */ C1288f0 a;

            a(C1288f0 c1288f0) {
                this.a = c1288f0;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(C1288f0.this.z) && C1288f0.this.v != null && C1288f0.this.Z) {
                    C1288f0.this.v.l();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(C1288f0.this.z)) {
                    C1288f0.this.Y = true;
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(C1288f0.this.z) && C1288f0.this.v != null && C1288f0.this.Z) {
                    C1288f0.this.v.l();
                }
            }
        }

        public o() {
            this.b = new a(C1288f0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC3244a(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    private void A0() {
        ax.Q0.n nVar = this.x.i;
        this.y = nVar;
        nVar.b();
    }

    private boolean B0() {
        if (this.f0) {
            return false;
        }
        h hVar = this.x;
        return hVar.c == 0 && !C0(hVar.a.I);
    }

    private boolean C0(int i2) {
        return this.c && ax.S0.d0.K0(i2);
    }

    private boolean D0() {
        h hVar = this.x;
        return hVar != null && hVar.j && Build.VERSION.SDK_INT >= 23;
    }

    private static int E0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private int F0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        int write;
        if (Build.VERSION.SDK_INT >= 26) {
            write = audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
            return write;
        }
        if (this.I == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.I = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.I.putInt(1431633921);
        }
        if (this.J == 0) {
            this.I.putInt(4, i2);
            this.I.putLong(8, j2 * 1000);
            this.I.position(0);
            this.J = i2;
        }
        int remaining = this.I.remaining();
        if (remaining > 0) {
            int write2 = audioTrack.write(this.I, remaining, 1);
            if (write2 < 0) {
                this.J = 0;
                return write2;
            }
            if (write2 < remaining) {
                return 0;
            }
        }
        int E0 = E0(audioTrack, byteBuffer, i2);
        if (E0 < 0) {
            this.J = 0;
            return E0;
        }
        this.J -= E0;
        return E0;
    }

    public static /* synthetic */ void H(AudioTrack audioTrack, final InterfaceC1276B.d dVar, Handler handler, final InterfaceC1276B.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: ax.a1.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1276B.d.this.b(aVar);
                    }
                });
            }
            synchronized (r0) {
                try {
                    int i2 = t0 - 1;
                    t0 = i2;
                    if (i2 == 0) {
                        s0.shutdown();
                        s0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (dVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: ax.a1.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1276B.d.this.b(aVar);
                    }
                });
            }
            synchronized (r0) {
                try {
                    int i3 = t0 - 1;
                    t0 = i3;
                    if (i3 == 0) {
                        s0.shutdown();
                        s0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void R(long j2) {
        ax.P0.G g2;
        if (D0()) {
            g2 = ax.P0.G.d;
        } else {
            g2 = B0() ? this.b.b(this.G) : ax.P0.G.d;
            this.G = g2;
        }
        ax.P0.G g3 = g2;
        this.H = B0() ? this.b.d(this.H) : false;
        this.j.add(new k(g3, Math.max(0L, j2), this.x.d(f0())));
        A0();
        InterfaceC1276B.d dVar = this.v;
        if (dVar != null) {
            dVar.e(this.H);
        }
    }

    private long S(long j2) {
        while (!this.j.isEmpty() && j2 >= this.j.getFirst().c) {
            this.F = this.j.remove();
        }
        k kVar = this.F;
        long j3 = j2 - kVar.c;
        long h0 = ax.S0.d0.h0(j3, kVar.a.a);
        if (!this.j.isEmpty()) {
            k kVar2 = this.F;
            return kVar2.b + h0 + kVar2.d;
        }
        long a2 = this.b.a(j3);
        k kVar3 = this.F;
        long j4 = kVar3.b + a2;
        kVar3.d = a2 - h0;
        return j4;
    }

    private long T(long j2) {
        long c2 = this.b.c();
        long d2 = j2 + this.x.d(c2);
        long j3 = this.l0;
        if (c2 > j3) {
            long d3 = this.x.d(c2 - j3);
            this.l0 = c2;
            g0(d3);
        }
        return d2;
    }

    private AudioTrack U(InterfaceC1276B.a aVar, C0894c c0894c, int i2, C0912v c0912v, Context context) throws InterfaceC1276B.c {
        try {
            AudioTrack b2 = this.s.b(aVar, c0894c, i2, context);
            int state = b2.getState();
            if (state == 1) {
                return b2;
            }
            try {
                b2.release();
            } catch (Exception unused) {
            }
            throw new InterfaceC1276B.c(state, aVar.b, aVar.c, aVar.a, aVar.f, c0912v, aVar.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new InterfaceC1276B.c(0, aVar.b, aVar.c, aVar.a, aVar.f, c0912v, aVar.e, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[Catch: c -> 0x0042, TRY_LEAVE, TryCatch #1 {c -> 0x0042, blocks: (B:9:0x0032, B:11:0x003a), top: B:8:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.media.AudioTrack V(ax.a1.C1288f0.h r9) throws ax.a1.InterfaceC1276B.c {
        /*
            r8 = this;
            int r0 = r8.b0     // Catch: ax.a1.InterfaceC1276B.c -> L46
            int r1 = r8.t     // Catch: ax.a1.InterfaceC1276B.c -> L46
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.a     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.o0     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = ax.a1.Q.a(r2, r1)     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            r8.o0 = r0     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L49
        L20:
            android.content.Context r0 = r8.o0     // Catch: ax.a1.InterfaceC1276B.c -> L1c
            r1 = 0
            r7 = r0
            r5 = 0
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            ax.a1.B$a r3 = r9.a()     // Catch: ax.a1.InterfaceC1276B.c -> L46
            ax.P0.c r4 = r8.D     // Catch: ax.a1.InterfaceC1276B.c -> L46
            ax.P0.v r6 = r9.a     // Catch: ax.a1.InterfaceC1276B.c -> L46
            r2 = r8
            android.media.AudioTrack r9 = r2.U(r3, r4, r5, r6, r7)     // Catch: ax.a1.InterfaceC1276B.c -> L42
            androidx.media3.exoplayer.ExoPlayer$a r0 = r2.r     // Catch: ax.a1.InterfaceC1276B.c -> L42
            if (r0 == 0) goto L45
            boolean r1 = l0(r9)     // Catch: ax.a1.InterfaceC1276B.c -> L42
            r0.D(r1)     // Catch: ax.a1.InterfaceC1276B.c -> L42
            return r9
        L42:
            r0 = move-exception
        L43:
            r9 = r0
            goto L49
        L45:
            return r9
        L46:
            r0 = move-exception
            r2 = r8
            goto L43
        L49:
            ax.a1.B$d r0 = r2.v
            if (r0 == 0) goto L50
            r0.f(r9)
        L50:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a1.C1288f0.V(ax.a1.f0$h):android.media.AudioTrack");
    }

    private AudioTrack W() throws InterfaceC1276B.c {
        try {
            return V((h) C0968a.e(this.x));
        } catch (InterfaceC1276B.c e2) {
            h hVar = this.x;
            if (hVar.h > 1000000) {
                h c2 = hVar.c(1000000);
                try {
                    AudioTrack V = V(c2);
                    this.x = c2;
                    return V;
                } catch (InterfaceC1276B.c e3) {
                    e2.addSuppressed(e3);
                    m0();
                    throw e2;
                }
            }
            m0();
            throw e2;
        }
    }

    private void X(long j2) throws InterfaceC1276B.f {
        C1288f0 c1288f0;
        int E0;
        InterfaceC1276B.d dVar;
        if (this.V == null || this.o.b()) {
            return;
        }
        int remaining = this.V.remaining();
        if (this.f0) {
            C0968a.g(j2 != -9223372036854775807L);
            if (j2 == Long.MIN_VALUE) {
                j2 = this.g0;
            } else {
                this.g0 = j2;
            }
            c1288f0 = this;
            E0 = c1288f0.F0(this.z, this.V, remaining, j2);
        } else {
            c1288f0 = this;
            E0 = E0(c1288f0.z, c1288f0.V, remaining);
        }
        c1288f0.h0 = SystemClock.elapsedRealtime();
        if (E0 < 0) {
            if (j0(E0)) {
                if (f0() <= 0) {
                    if (l0(c1288f0.z)) {
                        m0();
                    }
                }
                r7 = true;
            }
            InterfaceC1276B.f fVar = new InterfaceC1276B.f(E0, c1288f0.x.a, r7);
            InterfaceC1276B.d dVar2 = c1288f0.v;
            if (dVar2 != null) {
                dVar2.f(fVar);
            }
            if (!fVar.c0 || c1288f0.a == null) {
                c1288f0.o.c(fVar);
                return;
            }
            C1285e c1285e = C1285e.c;
            c1288f0.A = c1285e;
            c1288f0.B.g(c1285e);
            throw fVar;
        }
        c1288f0.o.a();
        if (l0(c1288f0.z)) {
            if (c1288f0.N > 0) {
                c1288f0.j0 = false;
            }
            if (c1288f0.Z && (dVar = c1288f0.v) != null && E0 < remaining && !c1288f0.j0) {
                dVar.h();
            }
        }
        int i2 = c1288f0.x.c;
        if (i2 == 0) {
            c1288f0.M += E0;
        }
        if (E0 == remaining) {
            if (i2 != 0) {
                C0968a.g(c1288f0.V == c1288f0.T);
                c1288f0.N += c1288f0.O * c1288f0.U;
            }
            c1288f0.V = null;
        }
    }

    private boolean Y() throws InterfaceC1276B.f {
        ByteBuffer byteBuffer;
        if (!this.y.f()) {
            X(Long.MIN_VALUE);
            return this.V == null;
        }
        this.y.h();
        s0(Long.MIN_VALUE);
        return this.y.e() && ((byteBuffer = this.V) == null || !byteBuffer.hasRemaining());
    }

    private static int Z(int i2, int i3, int i4) {
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i4);
        C0968a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int a0(Context context) {
        int deviceId;
        deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    private static int b0(int i2, ByteBuffer byteBuffer) {
        if (i2 == 20) {
            return ax.q1.L.h(byteBuffer);
        }
        if (i2 != 30) {
            switch (i2) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int m2 = ax.q1.J.m(ax.S0.d0.P(byteBuffer, byteBuffer.position()));
                    if (m2 != -1) {
                        return m2;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i2) {
                        case 14:
                            int b2 = C2842b.b(byteBuffer);
                            if (b2 == -1) {
                                return 0;
                            }
                            return C2842b.i(byteBuffer, b2) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return C2843c.f(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i2);
                    }
            }
            return C2842b.e(byteBuffer);
        }
        return C2856p.f(byteBuffer);
    }

    private static String c0(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d0(int i2) {
        int b2 = C2860u.b(i2);
        C0968a.g(b2 != -2147483647);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e0() {
        return this.x.c == 0 ? this.K / r0.b : this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long f0() {
        return this.x.c == 0 ? ax.S0.d0.l(this.M, r0.d) : this.N;
    }

    private void g0(long j2) {
        this.m0 += j2;
        if (this.n0 == null) {
            this.n0 = new Handler(Looper.myLooper());
        }
        this.n0.removeCallbacksAndMessages(null);
        this.n0.postDelayed(new Runnable() { // from class: ax.a1.d0
            @Override // java.lang.Runnable
            public final void run() {
                C1288f0.this.o0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h0() {
        boolean z;
        synchronized (r0) {
            z = t0 > 0;
        }
        return z;
    }

    private boolean i0() throws InterfaceC1276B.c {
        C1294j c1294j;
        I1 i1;
        if (this.n.b()) {
            return false;
        }
        AudioTrack W = W();
        this.z = W;
        if (l0(W)) {
            t0(this.z);
            h hVar = this.x;
            if (hVar.k) {
                AudioTrack audioTrack = this.z;
                C0912v c0912v = hVar.a;
                audioTrack.setOffloadDelayPadding(c0912v.J, c0912v.K);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 && (i1 = this.u) != null) {
            c.a(this.z, i1);
        }
        F f2 = this.i;
        AudioTrack audioTrack2 = this.z;
        h hVar2 = this.x;
        f2.u(audioTrack2, hVar2.c == 2, hVar2.g, hVar2.d, hVar2.h, this.p0);
        z0();
        int i3 = this.d0.a;
        if (i3 != 0) {
            this.z.attachAuxEffect(i3);
            this.z.setAuxEffectSendLevel(this.d0.b);
        }
        C1295k c1295k = this.e0;
        if (c1295k != null && i2 >= 23) {
            b.b(this.z, c1295k);
            C1294j c1294j2 = this.B;
            if (c1294j2 != null) {
                c1294j2.j(this.e0.a);
            }
        }
        if (i2 >= 24 && (c1294j = this.B) != null) {
            this.C = new l(this.z, c1294j);
        }
        this.Q = true;
        int audioSessionId = this.z.getAudioSessionId();
        boolean z = audioSessionId != this.b0;
        this.b0 = audioSessionId;
        InterfaceC1276B.d dVar = this.v;
        if (dVar != null) {
            dVar.g(this.x.a());
            if (z) {
                this.c0 = true;
                this.v.c(this.b0);
            }
        }
        return true;
    }

    private static boolean j0(int i2) {
        return (Build.VERSION.SDK_INT >= 24 && i2 == -6) || i2 == -32;
    }

    private boolean k0() {
        return this.z != null;
    }

    private static boolean l0(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private void m0() {
        if (this.x.f()) {
            this.i0 = true;
        }
    }

    private ByteBuffer n0(ByteBuffer byteBuffer) {
        if (this.x.c == 0) {
            int F = (int) ax.S0.d0.F(ax.S0.d0.a1(20L), this.x.e);
            long f0 = f0();
            if (f0 < F) {
                h hVar = this.x;
                return E0.a(byteBuffer, hVar.g, hVar.d, (int) f0, F);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        if (this.m0 >= 300000) {
            this.v.d();
            this.m0 = 0L;
        }
    }

    private void p0() {
        Context context;
        Looper myLooper = Looper.myLooper();
        C0968a.h(this.B == null || this.k0 == myLooper, "DefaultAudioSink accessed on multiple threads: " + c0(this.k0) + " and " + c0(myLooper));
        if (this.B == null && (context = this.a) != null) {
            this.k0 = myLooper;
            C1294j c1294j = new C1294j(context, new C1294j.f() { // from class: ax.a1.c0
                @Override // ax.a1.C1294j.f
                public final void a(C1285e c1285e) {
                    C1288f0.this.q0(c1285e);
                }
            }, this.D, this.e0);
            this.B = c1294j;
            this.A = c1294j.h();
        }
        C0968a.e(this.A);
    }

    private void r0() {
        if (this.X) {
            return;
        }
        this.X = true;
        this.i.h(f0());
        if (l0(this.z)) {
            this.Y = false;
        }
        this.z.stop();
        this.J = 0;
    }

    private void s0(long j2) throws InterfaceC1276B.f {
        X(j2);
        if (this.V != null) {
            return;
        }
        if (!this.y.f()) {
            ByteBuffer byteBuffer = this.T;
            if (byteBuffer != null) {
                y0(byteBuffer);
                X(j2);
                return;
            }
            return;
        }
        while (!this.y.e()) {
            do {
                ByteBuffer d2 = this.y.d();
                if (d2.hasRemaining()) {
                    y0(d2);
                    X(j2);
                } else {
                    ByteBuffer byteBuffer2 = this.T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.y.i(this.T);
                    }
                }
            } while (this.V == null);
            return;
        }
    }

    private void t0(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new o();
        }
        this.m.a(audioTrack);
    }

    private static void u0(final AudioTrack audioTrack, final InterfaceC1276B.d dVar, final InterfaceC1276B.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (r0) {
            try {
                if (s0 == null) {
                    s0 = ax.S0.d0.c1("ExoPlayer:AudioTrackReleaseThread");
                }
                t0++;
                s0.schedule(new Runnable() { // from class: ax.a1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1288f0.H(audioTrack, dVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void v0() {
        this.K = 0L;
        this.L = 0L;
        this.M = 0L;
        this.N = 0L;
        this.j0 = false;
        this.O = 0;
        this.F = new k(this.G, 0L, 0L);
        this.R = 0L;
        this.E = null;
        this.j.clear();
        this.T = null;
        this.U = 0;
        this.V = null;
        this.X = false;
        this.W = false;
        this.Y = false;
        this.I = null;
        this.J = 0;
        this.e.o();
        A0();
    }

    private void w0(ax.P0.G g2) {
        k kVar = new k(g2, -9223372036854775807L, -9223372036854775807L);
        if (k0()) {
            this.E = kVar;
        } else {
            this.F = kVar;
        }
    }

    private void x0() {
        PlaybackParams allowDefaults;
        PlaybackParams speed;
        PlaybackParams pitch;
        PlaybackParams audioFallbackMode;
        PlaybackParams playbackParams;
        float speed2;
        PlaybackParams playbackParams2;
        float pitch2;
        if (k0()) {
            allowDefaults = L.a().allowDefaults();
            speed = allowDefaults.setSpeed(this.G.a);
            pitch = speed.setPitch(this.G.b);
            audioFallbackMode = pitch.setAudioFallbackMode(2);
            try {
                this.z.setPlaybackParams(audioFallbackMode);
            } catch (IllegalArgumentException e2) {
                C0987u.i("DefaultAudioSink", "Failed to set playback params", e2);
            }
            playbackParams = this.z.getPlaybackParams();
            speed2 = playbackParams.getSpeed();
            playbackParams2 = this.z.getPlaybackParams();
            pitch2 = playbackParams2.getPitch();
            ax.P0.G g2 = new ax.P0.G(speed2, pitch2);
            this.G = g2;
            this.i.v(g2.a);
        }
    }

    private void y0(ByteBuffer byteBuffer) {
        C0968a.g(this.V == null);
        if (byteBuffer.hasRemaining()) {
            this.V = n0(byteBuffer);
        }
    }

    private void z0() {
        if (k0()) {
            this.z.setVolume(this.S);
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void A(C0894c c0894c) {
        if (this.D.equals(c0894c)) {
            return;
        }
        this.D = c0894c;
        if (this.f0) {
            return;
        }
        C1294j c1294j = this.B;
        if (c1294j != null) {
            c1294j.i(c0894c);
        }
        flush();
    }

    @Override // ax.a1.InterfaceC1276B
    public void B(InterfaceC0975h interfaceC0975h) {
        this.i.w(interfaceC0975h);
    }

    @Override // ax.a1.InterfaceC1276B
    public void C(C0898g c0898g) {
        if (this.d0.equals(c0898g)) {
            return;
        }
        int i2 = c0898g.a;
        float f2 = c0898g.b;
        AudioTrack audioTrack = this.z;
        if (audioTrack != null) {
            if (this.d0.a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.z.setAuxEffectSendLevel(f2);
            }
        }
        this.d0 = c0898g;
    }

    @Override // ax.a1.InterfaceC1276B
    public boolean D(ByteBuffer byteBuffer, long j2, int i2) throws InterfaceC1276B.c, InterfaceC1276B.f {
        ByteBuffer byteBuffer2 = this.T;
        C0968a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.w != null) {
            if (!Y()) {
                return false;
            }
            if (this.w.b(this.x)) {
                this.x = this.w;
                this.w = null;
                AudioTrack audioTrack = this.z;
                if (audioTrack != null && l0(audioTrack) && this.x.k) {
                    if (this.z.getPlayState() == 3) {
                        this.z.setOffloadEndOfStream();
                        this.i.a();
                    }
                    AudioTrack audioTrack2 = this.z;
                    C0912v c0912v = this.x.a;
                    audioTrack2.setOffloadDelayPadding(c0912v.J, c0912v.K);
                    this.j0 = true;
                }
            } else {
                r0();
                if (k()) {
                    return false;
                }
                flush();
            }
            R(j2);
        }
        if (!k0()) {
            try {
                if (!i0()) {
                    return false;
                }
            } catch (InterfaceC1276B.c e2) {
                if (e2.c0) {
                    throw e2;
                }
                this.n.c(e2);
                return false;
            }
        }
        this.n.a();
        if (this.Q) {
            this.R = Math.max(0L, j2);
            this.P = false;
            this.Q = false;
            if (D0()) {
                x0();
            }
            R(j2);
            if (this.Z) {
                m();
            }
        }
        if (!this.i.m(f0())) {
            return false;
        }
        if (this.T == null) {
            C0968a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.x;
            if (hVar.c != 0 && this.O == 0) {
                int b0 = b0(hVar.g, byteBuffer);
                this.O = b0;
                if (b0 == 0) {
                    return true;
                }
            }
            if (this.E != null) {
                if (!Y()) {
                    return false;
                }
                R(j2);
                this.E = null;
            }
            long e3 = this.R + this.x.e(e0() - this.e.n());
            if (!this.P && Math.abs(e3 - j2) > 200000) {
                InterfaceC1276B.d dVar = this.v;
                if (dVar != null) {
                    dVar.f(new InterfaceC1276B.e(j2, e3));
                }
                this.P = true;
            }
            if (this.P) {
                if (!Y()) {
                    return false;
                }
                long j3 = j2 - e3;
                this.R += j3;
                this.P = false;
                R(j2);
                InterfaceC1276B.d dVar2 = this.v;
                if (dVar2 != null && j3 != 0) {
                    dVar2.k();
                }
            }
            if (this.x.c == 0) {
                this.K += byteBuffer.remaining();
            } else {
                this.L += this.O * i2;
            }
            this.T = byteBuffer;
            this.U = i2;
        }
        s0(j2);
        if (!this.T.hasRemaining()) {
            this.T = null;
            this.U = 0;
            return true;
        }
        if (!this.i.l(f0())) {
            return false;
        }
        C0987u.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // ax.a1.InterfaceC1276B
    public void E(boolean z) {
        this.H = z;
        w0(D0() ? ax.P0.G.d : this.G);
    }

    @Override // ax.a1.InterfaceC1276B
    public void a() {
        flush();
        ax.r7.j0<ax.Q0.o> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f.a();
        this.g.a();
        ax.Q0.n nVar = this.y;
        if (nVar != null) {
            nVar.j();
        }
        this.Z = false;
        this.i0 = false;
    }

    @Override // ax.a1.InterfaceC1276B
    public boolean b(C0912v c0912v) {
        return n(c0912v) != 0;
    }

    @Override // ax.a1.InterfaceC1276B
    public boolean c() {
        if (k0()) {
            return this.W && !k();
        }
        return true;
    }

    @Override // ax.a1.InterfaceC1276B
    public void d() {
        C1294j c1294j = this.B;
        if (c1294j != null) {
            c1294j.k();
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void e(ax.P0.G g2) {
        this.G = new ax.P0.G(ax.S0.d0.o(g2.a, 0.1f, 8.0f), ax.S0.d0.o(g2.b, 0.1f, 8.0f));
        if (D0()) {
            x0();
        } else {
            w0(g2);
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void f() {
        this.Z = false;
        if (k0()) {
            this.i.r();
            if (!this.X || l0(this.z)) {
                this.z.pause();
            }
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void flush() {
        l lVar;
        if (k0()) {
            v0();
            if (this.i.k()) {
                this.z.pause();
            }
            if (l0(this.z)) {
                ((o) C0968a.e(this.m)).b(this.z);
            }
            InterfaceC1276B.a a2 = this.x.a();
            h hVar = this.w;
            if (hVar != null) {
                this.x = hVar;
                this.w = null;
            }
            this.i.s();
            if (Build.VERSION.SDK_INT >= 24 && (lVar = this.C) != null) {
                lVar.c();
                this.C = null;
            }
            u0(this.z, this.v, a2);
            this.z = null;
        }
        this.o.a();
        this.n.a();
        this.l0 = 0L;
        this.m0 = 0L;
        Handler handler = this.n0;
        if (handler != null) {
            ((Handler) C0968a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void g(AudioDeviceInfo audioDeviceInfo) {
        this.e0 = audioDeviceInfo == null ? null : new C1295k(audioDeviceInfo);
        C1294j c1294j = this.B;
        if (c1294j != null) {
            c1294j.j(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.z;
        if (audioTrack != null) {
            b.b(audioTrack, this.e0);
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public ax.P0.G h() {
        return this.G;
    }

    @Override // ax.a1.InterfaceC1276B
    public void i() throws InterfaceC1276B.f {
        if (!this.W && k0() && Y()) {
            r0();
            this.W = true;
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void j(C0912v c0912v, int i2, int[] iArr) throws InterfaceC1276B.b {
        int i3;
        int intValue;
        int intValue2;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        ax.Q0.n nVar;
        int i6;
        int i7;
        int a2;
        p0();
        if ("audio/raw".equals(c0912v.o)) {
            C0968a.a(ax.S0.d0.L0(c0912v.I));
            i4 = ax.S0.d0.m0(c0912v.I, c0912v.G);
            AbstractC2991z.a aVar = new AbstractC2991z.a();
            aVar.j(this.h);
            if (C0(c0912v.I)) {
                aVar.a(this.g);
            } else {
                aVar.a(this.f);
                aVar.i(this.b.e());
            }
            ax.Q0.n nVar2 = new ax.Q0.n(aVar.k());
            if (nVar2.equals(this.y)) {
                nVar2 = this.y;
            }
            this.e.p(c0912v.J, c0912v.K);
            this.d.n(iArr);
            try {
                o.a a3 = nVar2.a(new o.a(c0912v));
                int i8 = a3.c;
                i3 = a3.a;
                int a4 = this.s.a(a3.b);
                int m0 = ax.S0.d0.m0(i8, a3.b);
                intValue = i8;
                intValue2 = a4;
                z = this.k;
                i5 = 0;
                nVar = nVar2;
                i6 = m0;
                z2 = false;
            } catch (o.b e2) {
                throw new InterfaceC1276B.b(e2, c0912v);
            }
        } else {
            ax.Q0.n nVar3 = new ax.Q0.n(AbstractC2991z.z());
            i3 = c0912v.H;
            C1296l z3 = this.l != 0 ? z(c0912v) : C1296l.d;
            if (this.l == 0 || !z3.a) {
                Pair<Integer, Integer> h2 = this.A.h(c0912v, this.D);
                if (h2 == null) {
                    throw new InterfaceC1276B.b("Unable to configure passthrough for: " + c0912v, c0912v);
                }
                intValue = ((Integer) h2.first).intValue();
                intValue2 = ((Integer) h2.second).intValue();
                z = this.k;
                i4 = -1;
                z2 = false;
                i5 = 2;
                nVar = nVar3;
                i6 = -1;
            } else {
                int f2 = ax.P0.D.f((String) C0968a.e(c0912v.o), c0912v.k);
                int a5 = this.s.a(c0912v.G);
                z2 = z3.b;
                nVar = nVar3;
                intValue = f2;
                intValue2 = a5;
                i4 = -1;
                i6 = -1;
                z = true;
                i5 = 1;
            }
        }
        if (intValue == 0) {
            throw new InterfaceC1276B.b("Invalid output encoding (mode=" + i5 + ") for: " + c0912v, c0912v);
        }
        if (intValue2 == 0) {
            throw new InterfaceC1276B.b("Invalid output channel config (mode=" + i5 + ") for: " + c0912v, c0912v);
        }
        int i9 = c0912v.j;
        int i10 = ("audio/vnd.dts.hd;profile=lbr".equals(c0912v.o) && i9 == -1) ? 768000 : i9;
        if (i2 != 0) {
            a2 = i2;
            i7 = i3;
        } else {
            i7 = i3;
            a2 = this.p.a(Z(i3, intValue2, intValue), intValue, i5, i6 != -1 ? i6 : 1, i7, i10, z ? 8.0d : 1.0d);
        }
        this.i0 = false;
        boolean z4 = z2;
        int i11 = i5;
        h hVar = new h(c0912v, i4, i11, i6, i7, intValue2, intValue, a2, nVar, z, z4, this.f0);
        if (k0()) {
            this.w = hVar;
        } else {
            this.x = hVar;
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public boolean k() {
        boolean isOffloadedPlayback;
        if (!k0()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = this.z.isOffloadedPlayback();
            if (isOffloadedPlayback && this.Y) {
                return false;
            }
        }
        return this.i.j(f0());
    }

    @Override // ax.a1.InterfaceC1276B
    public void l(float f2) {
        if (this.S != f2) {
            this.S = f2;
            z0();
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void m() {
        this.Z = true;
        if (k0()) {
            this.i.x();
            if (!this.X || l0(this.z)) {
                this.z.play();
            }
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public int n(C0912v c0912v) {
        p0();
        if (!"audio/raw".equals(c0912v.o)) {
            return this.A.j(c0912v, this.D) ? 2 : 0;
        }
        if (ax.S0.d0.L0(c0912v.I)) {
            int i2 = c0912v.I;
            return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
        }
        C0987u.h("DefaultAudioSink", "Invalid PCM encoding: " + c0912v.I);
        return 0;
    }

    @Override // ax.a1.InterfaceC1276B
    public void o(int i2) {
        if (this.c0) {
            if (this.b0 != i2) {
                return;
            } else {
                this.c0 = false;
            }
        }
        if (this.b0 != i2) {
            this.b0 = i2;
            this.a0 = i2 != 0;
            flush();
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public long p() {
        if (!k0()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(this.z, this.x);
        }
        return ax.S0.d0.r1(this.x.h, 1000000L, this.x.c == 0 ? r0.e * r0.d : d0(r0.g), RoundingMode.DOWN);
    }

    @Override // ax.a1.InterfaceC1276B
    public void q(int i2, int i3) {
        h hVar;
        AudioTrack audioTrack = this.z;
        if (audioTrack == null || !l0(audioTrack) || (hVar = this.x) == null || !hVar.k) {
            return;
        }
        this.z.setOffloadDelayPadding(i2, i3);
    }

    public void q0(C1285e c1285e) {
        Looper myLooper = Looper.myLooper();
        C0968a.h(this.k0 == myLooper, "Current looper (" + c0(myLooper) + ") is not the playback looper (" + c0(this.k0) + ")");
        C1285e c1285e2 = this.A;
        if (c1285e2 == null || c1285e.equals(c1285e2)) {
            return;
        }
        this.A = c1285e;
        InterfaceC1276B.d dVar = this.v;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public void r(int i2) {
        C0968a.g(Build.VERSION.SDK_INT >= 29);
        this.l = i2;
    }

    @Override // ax.a1.InterfaceC1276B
    public long s(boolean z) {
        if (!k0() || this.Q) {
            return Long.MIN_VALUE;
        }
        return T(S(Math.min(this.i.c(), this.x.d(f0()))));
    }

    @Override // ax.a1.InterfaceC1276B
    public void t() {
        if (this.f0) {
            this.f0 = false;
            flush();
        }
    }

    @Override // ax.a1.InterfaceC1276B
    public /* synthetic */ void u(long j2) {
        C1275A.a(this, j2);
    }

    @Override // ax.a1.InterfaceC1276B
    public void v() {
        this.P = true;
    }

    @Override // ax.a1.InterfaceC1276B
    public void w(I1 i1) {
        this.u = i1;
    }

    @Override // ax.a1.InterfaceC1276B
    public void x(InterfaceC1276B.d dVar) {
        this.v = dVar;
    }

    @Override // ax.a1.InterfaceC1276B
    public void y() {
        C0968a.g(this.a0);
        if (this.f0) {
            return;
        }
        this.f0 = true;
        flush();
    }

    @Override // ax.a1.InterfaceC1276B
    public C1296l z(C0912v c0912v) {
        return this.i0 ? C1296l.d : this.q.a(c0912v, this.D);
    }

    private C1288f0(g gVar) {
        Context applicationContext = gVar.a == null ? null : gVar.a.getApplicationContext();
        this.a = applicationContext;
        this.D = C0894c.h;
        this.A = applicationContext != null ? null : gVar.b;
        this.b = gVar.c;
        this.c = gVar.d;
        int i2 = Build.VERSION.SDK_INT;
        this.k = i2 >= 23 && gVar.e;
        this.l = 0;
        this.p = gVar.g;
        this.q = (d) C0968a.e(gVar.i);
        this.i = new F(new n());
        G g2 = new G();
        this.d = g2;
        H0 h0 = new H0();
        this.e = h0;
        this.f = new ax.Q0.t();
        this.g = new G0();
        this.h = AbstractC2991z.B(h0, g2);
        this.S = 1.0f;
        this.b0 = 0;
        this.d0 = new C0898g(0, 0.0f);
        ax.P0.G g3 = ax.P0.G.d;
        this.F = new k(g3, 0L, 0L);
        this.G = g3;
        this.H = false;
        this.j = new ArrayDeque<>();
        this.n = new m<>();
        this.o = new m<>();
        this.r = gVar.k;
        this.s = gVar.h;
        this.t = (i2 < 34 || gVar.a == null) ? -1 : a0(gVar.a);
        this.p0 = gVar.j;
    }

    /* renamed from: ax.a1.f0$g */
    public static final class g {
        private final Context a;
        private C1285e b;
        private ax.Q0.p c;
        private boolean d;
        private boolean e;
        private boolean f;
        private e g;
        private f h;
        private d i;
        private boolean j;
        private ExoPlayer.a k;

        @Deprecated
        public g() {
            this.j = true;
            this.a = null;
            this.b = C1285e.c;
            this.g = e.a;
            this.h = f.a;
        }

        public C1288f0 k() {
            C0968a.g(!this.f);
            this.f = true;
            if (this.c == null) {
                this.c = new i(new ax.Q0.o[0]);
            }
            if (this.i == null) {
                this.i = new J(this.a);
            }
            return new C1288f0(this);
        }

        public g l(ax.Q0.p pVar) {
            C0968a.e(pVar);
            this.c = pVar;
            return this;
        }

        public g m(ax.Q0.o[] oVarArr) {
            C0968a.e(oVarArr);
            return l(new i(oVarArr));
        }

        public g n(boolean z) {
            this.e = z;
            return this;
        }

        public g o(boolean z) {
            this.d = z;
            return this;
        }

        public g(Context context) {
            this.j = true;
            this.a = context;
            this.b = C1285e.c;
            this.g = e.a;
            this.h = f.a;
        }
    }
}

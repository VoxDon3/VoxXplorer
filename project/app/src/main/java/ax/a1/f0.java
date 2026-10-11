/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import ax.P0.D;
import ax.P0.v;
import ax.Q0.o;
import ax.Q0.p;
import ax.Q0.s;
import ax.Q0.t;
import ax.S0.u;
import ax.Z0.G1;
import ax.Z0.H1;
import ax.Z0.I1;
import ax.a1.A;
import ax.a1.B;
import ax.a1.B0;
import ax.a1.E0;
import ax.a1.F;
import ax.a1.F0;
import ax.a1.G;
import ax.a1.G0;
import ax.a1.H0;
import ax.a1.J;
import ax.a1.L;
import ax.a1.M;
import ax.a1.N;
import ax.a1.O;
import ax.a1.P;
import ax.a1.Q;
import ax.a1.S;
import ax.a1.T;
import ax.a1.U;
import ax.a1.V;
import ax.a1.W;
import ax.a1.X;
import ax.a1.Y;
import ax.a1.Z;
import ax.a1.a0;
import ax.a1.b0;
import ax.a1.c0;
import ax.a1.d0;
import ax.a1.e0;
import ax.a1.g0;
import ax.a1.h0;
import ax.a1.i0;
import ax.a1.k0;
import ax.a1.l0;
import ax.a1.m0;
import ax.a1.n0;
import ax.a1.o0;
import ax.a1.p0;
import ax.a1.q0;
import ax.a1.r0;
import ax.r7.z;
import ax.v0.a;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class f0
implements B {
    public static boolean q0 = false;
    private static final Object r0 = new Object();
    private static ScheduledExecutorService s0;
    private static int t0;
    private ax.a1.e A;
    private ax.a1.j B;
    private l C;
    private ax.P0.c D;
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
    private final p b;
    private int b0;
    private final boolean c;
    private boolean c0;
    private final G d;
    private ax.P0.g d0;
    private final H0 e;
    private ax.a1.k e0;
    private final t f;
    private boolean f0;
    private final G0 g;
    private long g0;
    private final z<ax.Q0.o> h;
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
    private final m<B.c> n;
    private Handler n0;
    private final m<B.f> o;
    private Context o0;
    private final e p;
    private boolean p0;
    private final d q;
    private final ExoPlayer.a r;
    private final f s;
    private final int t;
    private I1 u;
    private B.d v;
    private h w;
    private h x;
    private ax.Q0.n y;
    private AudioTrack z;

    private f0(g g8) {
        G g9;
        Object object = g8.a == null ? null : g8.a.getApplicationContext();
        this.a = object;
        this.D = ax.P0.c.h;
        object = object != null ? null : g8.b;
        this.A = object;
        this.b = g8.c;
        this.c = g8.d;
        int n8 = Build.VERSION.SDK_INT;
        boolean bl = n8 >= 23 && g8.e;
        this.k = bl;
        this.l = 0;
        this.p = g8.g;
        this.q = ax.S0.a.e(g8.i);
        this.i = new F(new n(this));
        this.d = g9 = new G();
        object = new H0();
        this.e = object;
        this.f = new t();
        this.g = new G0();
        this.h = ax.r7.z.B(object, g9);
        this.S = 1.0f;
        this.b0 = 0;
        this.d0 = new ax.P0.g(0, 0.0f);
        object = ax.P0.G.d;
        this.F = new k((ax.P0.G)object, 0L, 0L);
        this.G = object;
        this.H = false;
        this.j = new ArrayDeque();
        this.n = new m();
        this.o = new m();
        this.r = g8.k;
        this.s = g8.h;
        n8 = n8 >= 34 && g8.a != null ? ax.a1.f0.a0(g8.a) : -1;
        this.t = n8;
        this.p0 = g8.j;
    }

    private void A0() {
        ax.Q0.n n8;
        this.y = n8 = this.x.i;
        n8.b();
    }

    private boolean B0() {
        if (!this.f0) {
            h h8 = this.x;
            if (h8.c == 0 && !this.C0(h8.a.I)) {
                return true;
            }
        }
        return false;
    }

    private boolean C0(int n8) {
        return this.c && ax.S0.d0.K0(n8);
    }

    private boolean D0() {
        h h8 = this.x;
        return h8 != null && h8.j && Build.VERSION.SDK_INT >= 23;
    }

    private static int E0(AudioTrack audioTrack, ByteBuffer byteBuffer, int n8) {
        return audioTrack.write(byteBuffer, n8, 1);
    }

    public static /* synthetic */ void F(B.d d8, B.a a8) {
        d8.b(a8);
    }

    private int F0(AudioTrack audioTrack, ByteBuffer byteBuffer, int n8, long l8) {
        int n9;
        if (Build.VERSION.SDK_INT >= 26) {
            return ax.a1.W.a(audioTrack, byteBuffer, n8, 1, l8 * 1000L);
        }
        if (this.I == null) {
            ByteBuffer byteBuffer2;
            this.I = byteBuffer2 = ByteBuffer.allocate(16);
            byteBuffer2.order(ByteOrder.BIG_ENDIAN);
            this.I.putInt(0x55550001);
        }
        if (this.J == 0) {
            this.I.putInt(4, n8);
            this.I.putLong(8, l8 * 1000L);
            this.I.position(0);
            this.J = n8;
        }
        if ((n9 = this.I.remaining()) > 0) {
            int n10 = audioTrack.write(this.I, n9, 1);
            if (n10 < 0) {
                this.J = 0;
                return n10;
            }
            if (n10 < n9) {
                return 0;
            }
        }
        if ((n8 = ax.a1.f0.E0(audioTrack, byteBuffer, n8)) < 0) {
            this.J = 0;
            return n8;
        }
        this.J -= n8;
        return n8;
    }

    public static /* synthetic */ void G(f0 f02) {
        f02.o0();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void H(AudioTrack object, B.d object2, Handler handler, B.a a8) {
        block10: {
            try {
                object.flush();
                object.release();
                if (object2 == null || !handler.getLooper().getThread().isAlive()) break block10;
            }
            catch (Throwable throwable) {
                if (object2 != null && handler.getLooper().getThread().isAlive()) {
                    handler.post((Runnable)new e0((B.d)object2, a8));
                }
                object2 = r0;
                synchronized (object2) {
                    Throwable throwable22;
                    block14: {
                        block11: {
                            try {
                                int n8;
                                t0 = n8 = t0 - 1;
                                if (n8 != 0) break block11;
                                s0.shutdown();
                                s0 = null;
                            }
                            catch (Throwable throwable22) {
                                break block14;
                            }
                        }
                        throw throwable;
                    }
                    throw throwable22;
                }
            }
            handler.post((Runnable)new e0((B.d)object2, a8));
        }
        object = r0;
        synchronized (object) {
            Throwable throwable3;
            block13: {
                block12: {
                    try {
                        int n9;
                        t0 = n9 = t0 - 1;
                        if (n9 != 0) break block12;
                        s0.shutdown();
                        s0 = null;
                    }
                    catch (Throwable throwable3) {
                        break block13;
                    }
                }
                return;
            }
            throw throwable3;
        }
    }

    static /* synthetic */ boolean L(f0 f02, boolean bl) {
        f02.Y = bl;
        return bl;
    }

    private void R(long l8) {
        Object object;
        if (!this.D0()) {
            object = this.B0() ? this.b.b(this.G) : ax.P0.G.d;
            this.G = object;
        } else {
            object = ax.P0.G.d;
        }
        boolean bl = this.B0() ? this.b.d(this.H) : false;
        this.H = bl;
        this.j.add(new k((ax.P0.G)object, Math.max(0L, l8), this.x.d(this.f0())));
        this.A0();
        object = this.v;
        if (object != null) {
            object.e(this.H);
        }
    }

    private long S(long l8) {
        while (!this.j.isEmpty() && l8 >= this.j.getFirst().c) {
            this.F = this.j.remove();
        }
        k k8 = this.F;
        long l9 = l8 - k8.c;
        l8 = ax.S0.d0.h0(l9, k8.a.a);
        if (this.j.isEmpty()) {
            l9 = this.b.a(l9);
            k8 = this.F;
            long l10 = k8.b;
            k8.d = l9 - l8;
            return l10 + l9;
        }
        k8 = this.F;
        return k8.b + l8 + k8.d;
    }

    private long T(long l8) {
        long l9 = this.b.c();
        long l10 = this.x.d(l9);
        long l11 = this.l0;
        if (l9 > l11) {
            l11 = this.x.d(l9 - l11);
            this.l0 = l9;
            this.g0(l11);
        }
        return l8 + l10;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private AudioTrack U(B.a a8, ax.P0.c c8, int n8, v v8, Context context) throws B.c {
        Exception var2_4;
        c8 = this.s.b(a8, c8, n8, context);
        n8 = c8.getState();
        if (n8 == 1) {
            return c8;
        }
        try {
            c8.release();
        }
        catch (Exception exception) {
            throw new B.c(n8, a8.b, a8.c, a8.a, a8.f, v8, a8.e, null);
        }
        throw new B.c(n8, a8.b, a8.c, a8.a, a8.f, v8, a8.e, null);
        catch (IllegalArgumentException illegalArgumentException) {
            throw new B.c(0, a8.b, a8.c, a8.a, a8.f, v8, a8.e, (Exception)var2_4);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {}
        throw new B.c(0, a8.b, a8.c, a8.a, a8.f, v8, a8.e, (Exception)var2_4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AudioTrack V(h object) throws B.c {
        RuntimeException var1_4;
        B.d d8;
        block11: {
            int n8;
            block12: {
                block9: {
                    block10: {
                        int n9;
                        try {
                            n8 = this.b0;
                            n9 = this.t;
                            if (n9 == -1) break block9;
                        }
                        catch (B.c c8) {}
                        try {
                            d8 = this.a;
                            if (d8 == null || Build.VERSION.SDK_INT < 34) break block9;
                            if (this.o0 != null) break block10;
                            this.o0 = ax.a1.Q.a((Context)d8, n9);
                        }
                        catch (B.c c9) {
                            break block11;
                        }
                    }
                    d8 = this.o0;
                    n8 = 0;
                    break block12;
                }
                d8 = null;
            }
            B.a a8 = ((h)object).a();
            ax.P0.c c10 = this.D;
            object = ((h)object).a;
            try {
                d8 = this.U(a8, c10, n8, (v)object, (Context)d8);
                object = this.r;
                if (object == null) return d8;
                object.D(ax.a1.f0.l0((AudioTrack)d8));
                return d8;
            }
            catch (B.c c11) {}
            {
            }
        }
        d8 = this.v;
        if (d8 == null) throw var1_4;
        d8.f((Exception)var1_4);
        throw var1_4;
    }

    private AudioTrack W() throws B.c {
        try {
            AudioTrack audioTrack = this.V(ax.S0.a.e(this.x));
            return audioTrack;
        }
        catch (B.c c8) {
            h h8 = this.x;
            if (h8.h > 1000000) {
                h8 = h8.c(1000000);
                try {
                    AudioTrack audioTrack = this.V(h8);
                    this.x = h8;
                    return audioTrack;
                }
                catch (B.c c9) {
                    c8.addSuppressed(c9);
                }
            }
            this.m0();
            throw c8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void X(long l8) throws B.f {
        int n8;
        int n9;
        boolean bl;
        boolean bl2;
        int n10;
        block17: {
            block18: {
                block19: {
                    if (this.V == null) {
                        return;
                    }
                    if (this.o.b()) {
                        return;
                    }
                    n10 = this.V.remaining();
                    bl2 = this.f0;
                    bl = false;
                    boolean bl3 = false;
                    if (bl2) {
                        bl2 = l8 != -9223372036854775807L;
                        ax.S0.a.g(bl2);
                        if (l8 == Long.MIN_VALUE) {
                            l8 = this.g0;
                        } else {
                            this.g0 = l8;
                        }
                        n9 = this.F0(this.z, this.V, n10, l8);
                    } else {
                        n9 = ax.a1.f0.E0(this.z, this.V, n10);
                    }
                    this.h0 = SystemClock.elapsedRealtime();
                    if (n9 >= 0) break block17;
                    bl2 = bl3;
                    if (!ax.a1.f0.j0(n9)) break block18;
                    if (this.f0() > 0L) break block19;
                    bl2 = bl3;
                    if (!ax.a1.f0.l0(this.z)) break block18;
                    this.m0();
                }
                bl2 = true;
            }
            B.f f8 = new B.f(n9, this.x.a, bl2);
            Object object = this.v;
            if (object != null) {
                object.f(f8);
            }
            if (f8.c0 && this.a != null) {
                this.A = object = ax.a1.e.c;
                this.B.g((ax.a1.e)object);
                throw f8;
            }
            this.o.c(f8);
            return;
        }
        this.o.a();
        if (ax.a1.f0.l0(this.z)) {
            B.d d8;
            if (this.N > 0L) {
                this.j0 = false;
            }
            if (this.Z && (d8 = this.v) != null && n9 < n10 && !this.j0) {
                d8.h();
            }
        }
        if ((n8 = this.x.c) == 0) {
            this.M += (long)n9;
        }
        if (n9 != n10) return;
        if (n8 != 0) {
            bl2 = bl;
            if (this.V == this.T) {
                bl2 = true;
            }
            ax.S0.a.g(bl2);
            this.N += (long)this.O * (long)this.U;
        }
        this.V = null;
    }

    private boolean Y() throws B.f {
        ByteBuffer byteBuffer;
        if (!this.y.f()) {
            this.X(Long.MIN_VALUE);
            return this.V == null;
        }
        this.y.h();
        this.s0(Long.MIN_VALUE);
        return this.y.e() && ((byteBuffer = this.V) == null || !byteBuffer.hasRemaining());
    }

    private static int Z(int n8, int n9, int n10) {
        boolean bl = (n8 = AudioTrack.getMinBufferSize((int)n8, (int)n9, (int)n10)) != -2;
        ax.S0.a.g(bl);
        return n8;
    }

    private static int a0(Context context) {
        int n8 = ax.a1.S.a(context);
        if (n8 != 0 && n8 != -1) {
            return n8;
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    private static int b0(int var0, ByteBuffer var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String c0(Looper looper) {
        if (looper == null) {
            return "null";
        }
        return looper.getThread().getName();
    }

    private static int d0(int n8) {
        boolean bl = (n8 = ax.q1.u.b(n8)) != -2147483647;
        ax.S0.a.g(bl);
        return n8;
    }

    private long e0() {
        h h8 = this.x;
        if (h8.c == 0) {
            return this.K / (long)h8.b;
        }
        return this.L;
    }

    private long f0() {
        h h8 = this.x;
        if (h8.c == 0) {
            return ax.S0.d0.l(this.M, h8.d);
        }
        return this.N;
    }

    private void g0(long l8) {
        this.m0 += l8;
        if (this.n0 == null) {
            this.n0 = new Handler(Looper.myLooper());
        }
        this.n0.removeCallbacksAndMessages(null);
        this.n0.postDelayed((Runnable)new d0(this), 100L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean h0() {
        Object object = r0;
        synchronized (object) {
            if (t0 <= 0) return false;
            return true;
        }
    }

    private boolean i0() throws B.c {
        int n8;
        Object object;
        boolean bl = this.n.b();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        Object object2 = this.W();
        this.z = object2;
        if (ax.a1.f0.l0((AudioTrack)object2)) {
            this.t0(this.z);
            object = this.x;
            if (((h)object).k) {
                object2 = this.z;
                object = ((h)object).a;
                ax.a1.V.a((AudioTrack)object2, ((v)object).J, ((v)object).K);
            }
        }
        if ((n8 = Build.VERSION.SDK_INT) >= 31 && (object2 = this.u) != null) {
            ax.a1.f0$c.a(this.z, (I1)object2);
        }
        F f8 = this.i;
        object2 = this.z;
        object = this.x;
        bl = ((h)object).c == 2;
        f8.u((AudioTrack)object2, bl, ((h)object).g, ((h)object).d, ((h)object).h, this.p0);
        this.z0();
        int n9 = this.d0.a;
        if (n9 != 0) {
            this.z.attachAuxEffect(n9);
            this.z.setAuxEffectSendLevel(this.d0.b);
        }
        if ((object2 = this.e0) != null && n8 >= 23) {
            ax.a1.f0$b.b(this.z, (ax.a1.k)object2);
            object2 = this.B;
            if (object2 != null) {
                ((ax.a1.j)object2).j(this.e0.a);
            }
        }
        if (n8 >= 24 && (object2 = this.B) != null) {
            this.C = new l(this.z, (ax.a1.j)object2);
        }
        this.Q = true;
        n9 = this.z.getAudioSessionId();
        if (n9 != this.b0) {
            bl2 = true;
        }
        this.b0 = n9;
        object2 = this.v;
        if (object2 != null) {
            object2.g(this.x.a());
            if (bl2) {
                this.c0 = true;
                this.v.c(this.b0);
            }
        }
        return true;
    }

    private static boolean j0(int n8) {
        return Build.VERSION.SDK_INT >= 24 && n8 == -6 || n8 == -32;
    }

    private boolean k0() {
        return this.z != null;
    }

    private static boolean l0(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && ax.a1.T.a(audioTrack);
    }

    private void m0() {
        if (!this.x.f()) {
            return;
        }
        this.i0 = true;
    }

    private ByteBuffer n0(ByteBuffer byteBuffer) {
        long l8;
        int n8;
        block3: {
            block2: {
                if (this.x.c != 0) break block2;
                n8 = (int)ax.S0.d0.F(ax.S0.d0.a1(20L), this.x.e);
                l8 = this.f0();
                if (l8 < (long)n8) break block3;
            }
            return byteBuffer;
        }
        h h8 = this.x;
        return E0.a(byteBuffer, h8.g, h8.d, (int)l8, n8);
    }

    private void o0() {
        if (this.m0 >= 300000L) {
            this.v.d();
            this.m0 = 0L;
        }
    }

    private void p0() {
        Object object = Looper.myLooper();
        boolean bl = this.B == null || this.k0 == object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultAudioSink accessed on multiple threads: ");
        stringBuilder.append(ax.a1.f0.c0(this.k0));
        stringBuilder.append(" and ");
        stringBuilder.append(ax.a1.f0.c0((Looper)object));
        ax.S0.a.h(bl, stringBuilder.toString());
        if (this.B == null && (stringBuilder = this.a) != null) {
            this.k0 = object;
            object = new ax.a1.j((Context)stringBuilder, new c0(this), this.D, this.e0);
            this.B = object;
            this.A = ((ax.a1.j)object).h();
        }
        ax.S0.a.e(this.A);
    }

    private void r0() {
        if (!this.X) {
            this.X = true;
            this.i.h(this.f0());
            if (ax.a1.f0.l0(this.z)) {
                this.Y = false;
            }
            this.z.stop();
            this.J = 0;
        }
    }

    private void s0(long l8) throws B.f {
        this.X(l8);
        if (this.V == null) {
            if (!this.y.f()) {
                ByteBuffer byteBuffer = this.T;
                if (byteBuffer != null) {
                    this.y0(byteBuffer);
                    this.X(l8);
                    return;
                }
            } else {
                block0: while (!this.y.e()) {
                    ByteBuffer byteBuffer;
                    while ((byteBuffer = this.y.d()).hasRemaining()) {
                        this.y0(byteBuffer);
                        this.X(l8);
                        if (this.V == null) continue;
                        break block0;
                    }
                    byteBuffer = this.T;
                    if (byteBuffer == null || !byteBuffer.hasRemaining()) break;
                    this.y.i(this.T);
                }
            }
        }
    }

    private void t0(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new o(this);
        }
        this.m.a(audioTrack);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void u0(AudioTrack audioTrack, B.d d8, B.a a8) {
        Handler handler = new Handler(Looper.myLooper());
        Object object = r0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (s0 != null) break block3;
                        s0 = ax.S0.d0.c1("ExoPlayer:AudioTrackReleaseThread");
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                ++t0;
                ScheduledExecutorService scheduledExecutorService = s0;
                b0 b02 = new b0(audioTrack, d8, handler, a8);
                scheduledExecutorService.schedule(b02, 20L, TimeUnit.MILLISECONDS);
                return;
            }
            throw throwable2;
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
        this.A0();
    }

    private void w0(ax.P0.G object) {
        object = new k((ax.P0.G)object, -9223372036854775807L, -9223372036854775807L);
        if (this.k0()) {
            this.E = object;
            return;
        }
        this.F = object;
    }

    private void x0() {
        if (this.k0()) {
            Object object = ax.a1.a0.a(ax.a1.Z.a(ax.a1.Y.a(ax.a1.X.a(ax.a1.L.a()), this.G.a), this.G.b), 2);
            try {
                ax.a1.M.a(this.z, object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.S0.u.i("DefaultAudioSink", "Failed to set playback params", illegalArgumentException);
            }
            object = new ax.P0.G(ax.a1.O.a(ax.a1.N.a(this.z)), ax.a1.P.a(ax.a1.N.a(this.z)));
            this.G = object;
            this.i.v(object.a);
        }
    }

    private void y0(ByteBuffer byteBuffer) {
        boolean bl = this.V == null;
        ax.S0.a.g(bl);
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        this.V = this.n0(byteBuffer);
    }

    private void z0() {
        if (this.k0()) {
            this.z.setVolume(this.S);
        }
    }

    @Override
    public void A(ax.P0.c c8) {
        block5: {
            block4: {
                if (this.D.equals(c8)) break block4;
                this.D = c8;
                if (!this.f0) break block5;
            }
            return;
        }
        ax.a1.j j8 = this.B;
        if (j8 != null) {
            j8.i(c8);
        }
        this.flush();
    }

    @Override
    public void B(ax.S0.h h8) {
        this.i.w(h8);
    }

    @Override
    public void C(ax.P0.g g8) {
        if (this.d0.equals(g8)) {
            return;
        }
        int n8 = g8.a;
        float f8 = g8.b;
        AudioTrack audioTrack = this.z;
        if (audioTrack != null) {
            if (this.d0.a != n8) {
                audioTrack.attachAuxEffect(n8);
            }
            if (n8 != 0) {
                this.z.setAuxEffectSendLevel(f8);
            }
        }
        this.d0 = g8;
    }

    @Override
    public boolean D(ByteBuffer byteBuffer, long l8, int n8) throws B.c, B.f {
        Object object = this.T;
        boolean bl = object == null || byteBuffer == object;
        ax.S0.a.a(bl);
        if (this.w != null) {
            if (!this.Y()) {
                return false;
            }
            if (!this.w.b(this.x)) {
                this.r0();
                if (this.k()) {
                    return false;
                }
                this.flush();
            } else {
                this.x = this.w;
                this.w = null;
                object = this.z;
                if (object != null && ax.a1.f0.l0((AudioTrack)object) && this.x.k) {
                    if (this.z.getPlayState() == 3) {
                        ax.a1.U.a(this.z);
                        this.i.a();
                    }
                    AudioTrack audioTrack = this.z;
                    object = this.x.a;
                    ax.a1.V.a(audioTrack, ((v)object).J, ((v)object).K);
                    this.j0 = true;
                }
            }
            this.R(l8);
        }
        if (!this.k0()) {
            try {
                bl = this.i0();
                if (!bl) {
                    return false;
                }
            }
            catch (B.c c8) {
                if (!c8.c0) {
                    this.n.c(c8);
                    return false;
                }
                throw c8;
            }
        }
        this.n.a();
        if (this.Q) {
            this.R = Math.max(0L, l8);
            this.P = false;
            this.Q = false;
            if (this.D0()) {
                this.x0();
            }
            this.R(l8);
            if (this.Z) {
                this.m();
            }
        }
        if (!this.i.m(this.f0())) {
            return false;
        }
        if (this.T == null) {
            bl = byteBuffer.order() == ByteOrder.LITTLE_ENDIAN;
            ax.S0.a.a(bl);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            object = this.x;
            if (((h)object).c != 0 && this.O == 0) {
                int n9;
                this.O = n9 = ax.a1.f0.b0(((h)object).g, byteBuffer);
                if (n9 == 0) {
                    return true;
                }
            }
            if (this.E != null) {
                if (!this.Y()) {
                    return false;
                }
                this.R(l8);
                this.E = null;
            }
            long l9 = this.R + this.x.e(this.e0() - this.e.n());
            if (!this.P && Math.abs(l9 - l8) > 200000L) {
                object = this.v;
                if (object != null) {
                    object.f(new B.e(l8, l9));
                }
                this.P = true;
            }
            if (this.P) {
                if (!this.Y()) {
                    return false;
                }
                l9 = l8 - l9;
                this.R += l9;
                this.P = false;
                this.R(l8);
                object = this.v;
                if (object != null && l9 != 0L) {
                    object.k();
                }
            }
            if (this.x.c == 0) {
                this.K += (long)byteBuffer.remaining();
            } else {
                this.L += (long)this.O * (long)n8;
            }
            this.T = byteBuffer;
            this.U = n8;
        }
        this.s0(l8);
        if (!this.T.hasRemaining()) {
            this.T = null;
            this.U = 0;
            return true;
        }
        if (this.i.l(this.f0())) {
            ax.S0.u.h("DefaultAudioSink", "Resetting stalled audio track");
            this.flush();
            return true;
        }
        return false;
    }

    @Override
    public void E(boolean bl) {
        this.H = bl;
        ax.P0.G g8 = this.D0() ? ax.P0.G.d : this.G;
        this.w0(g8);
    }

    @Override
    public void a() {
        this.flush();
        Object object = this.h.n();
        while (object.hasNext()) {
            ((ax.Q0.o)object.next()).a();
        }
        this.f.a();
        this.g.a();
        object = this.y;
        if (object != null) {
            ((ax.Q0.n)object).j();
        }
        this.Z = false;
        this.i0 = false;
    }

    @Override
    public boolean b(v v8) {
        return this.n(v8) != 0;
    }

    @Override
    public boolean c() {
        return !this.k0() || this.W && !this.k();
        {
        }
    }

    @Override
    public void d() {
        ax.a1.j j8 = this.B;
        if (j8 != null) {
            j8.k();
        }
    }

    @Override
    public void e(ax.P0.G g8) {
        this.G = new ax.P0.G(ax.S0.d0.o(g8.a, 0.1f, 8.0f), ax.S0.d0.o(g8.b, 0.1f, 8.0f));
        if (this.D0()) {
            this.x0();
            return;
        }
        this.w0(g8);
    }

    @Override
    public void f() {
        this.Z = false;
        if (this.k0()) {
            this.i.r();
            if (!this.X || ax.a1.f0.l0(this.z)) {
                this.z.pause();
            }
        }
    }

    @Override
    public void flush() {
        B.a a8;
        if (this.k0()) {
            this.v0();
            if (this.i.k()) {
                this.z.pause();
            }
            if (ax.a1.f0.l0(this.z)) {
                ax.S0.a.e(this.m).b(this.z);
            }
            a8 = this.x.a();
            Object object = this.w;
            if (object != null) {
                this.x = object;
                this.w = null;
            }
            this.i.s();
            if (Build.VERSION.SDK_INT >= 24 && (object = this.C) != null) {
                ((l)object).c();
                this.C = null;
            }
            ax.a1.f0.u0(this.z, this.v, a8);
            this.z = null;
        }
        this.o.a();
        this.n.a();
        this.l0 = 0L;
        this.m0 = 0L;
        a8 = this.n0;
        if (a8 != null) {
            ((Handler)ax.S0.a.e(a8)).removeCallbacksAndMessages(null);
        }
    }

    @Override
    public void g(AudioDeviceInfo audioDeviceInfo) {
        Object object = audioDeviceInfo == null ? null : new ax.a1.k(audioDeviceInfo);
        this.e0 = object;
        object = this.B;
        if (object != null) {
            ((ax.a1.j)object).j(audioDeviceInfo);
        }
        if ((audioDeviceInfo = this.z) != null) {
            ax.a1.f0$b.b((AudioTrack)audioDeviceInfo, this.e0);
        }
    }

    @Override
    public ax.P0.G h() {
        return this.G;
    }

    @Override
    public void i() throws B.f {
        if (!this.W && this.k0() && this.Y()) {
            this.r0();
            this.W = true;
        }
    }

    @Override
    public void j(v object, int n8, int[] object2) throws B.b {
        block16: {
            boolean bl;
            int n9;
            boolean bl2;
            int n10;
            int n11;
            int n12;
            int n13;
            Object object3;
            int n14;
            block14: {
                block15: {
                    block13: {
                        this.p0();
                        if (!"audio/raw".equals(((v)object).o)) break block13;
                        ax.S0.a.a(ax.S0.d0.L0(((v)object).I));
                        n14 = ax.S0.d0.m0(((v)object).I, ((v)object).G);
                        object3 = new z.a();
                        ((z.a)object3).j(this.h);
                        if (this.C0(((v)object).I)) {
                            ((z.a)object3).h(this.g);
                        } else {
                            ((z.a)object3).h(this.f);
                            ((z.a)object3).i(this.b.e());
                        }
                        ax.Q0.n n15 = new ax.Q0.n(((z.a)object3).k());
                        object3 = n15;
                        if (n15.equals(this.y)) {
                            object3 = this.y;
                        }
                        this.e.p(((v)object).J, ((v)object).K);
                        this.d.n((int[])object2);
                        object2 = new o.a((v)object);
                        try {
                            object2 = ((ax.Q0.n)object3).a((o.a)object2);
                            n13 = ((o.a)object2).c;
                            n12 = ((o.a)object2).a;
                            n11 = this.s.a(((o.a)object2).b);
                        }
                        catch (o.b b8) {
                            throw new B.b(b8, (v)object);
                        }
                        n10 = ax.S0.d0.m0(n13, ((o.a)object2).b);
                        bl2 = this.k;
                        n9 = 0;
                        object2 = object3;
                        bl = false;
                        break block14;
                    }
                    object2 = new ax.Q0.n(ax.r7.z.<ax.Q0.o>z());
                    n12 = ((v)object).H;
                    object3 = this.l != 0 ? this.z((v)object) : ax.a1.l.d;
                    if (this.l == 0 || !((ax.a1.l)object3).a) break block15;
                    n13 = ax.P0.D.f(ax.S0.a.e(((v)object).o), ((v)object).k);
                    n11 = this.s.a(((v)object).G);
                    bl = ((ax.a1.l)object3).b;
                    n14 = -1;
                    n10 = -1;
                    bl2 = true;
                    n9 = 1;
                    break block14;
                }
                object3 = this.A.h((v)object, this.D);
                if (object3 == null) break block16;
                n13 = (Integer)((Pair)object3).first;
                n11 = (Integer)((Pair)object3).second;
                bl2 = this.k;
                n14 = -1;
                bl = false;
                n9 = 2;
                n10 = -1;
            }
            if (n13 != 0) {
                if (n11 != 0) {
                    int n16 = ((v)object).j;
                    if ("audio/vnd.dts.hd;profile=lbr".equals(((v)object).o) && n16 == -1) {
                        n16 = 768000;
                    }
                    if (n8 == 0) {
                        object3 = this.p;
                        int n17 = ax.a1.f0.Z(n12, n11, n13);
                        n8 = n10 != -1 ? n10 : 1;
                        double d8 = bl2 ? 8.0 : 1.0;
                        n8 = object3.a(n17, n13, n9, n8, n12, n16, d8);
                    }
                    this.i0 = false;
                    object = new h((v)object, n14, n9, n10, n12, n11, n13, n8, (ax.Q0.n)object2, bl2, bl, this.f0);
                    if (this.k0()) {
                        this.w = object;
                        return;
                    }
                    this.x = object;
                    return;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Invalid output channel config (mode=");
                ((StringBuilder)object2).append(n9);
                ((StringBuilder)object2).append(") for: ");
                ((StringBuilder)object2).append(object);
                throw new B.b(((StringBuilder)object2).toString(), (v)object);
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Invalid output encoding (mode=");
            ((StringBuilder)object2).append(n9);
            ((StringBuilder)object2).append(") for: ");
            ((StringBuilder)object2).append(object);
            throw new B.b(((StringBuilder)object2).toString(), (v)object);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unable to configure passthrough for: ");
        ((StringBuilder)object2).append(object);
        throw new B.b(((StringBuilder)object2).toString(), (v)object);
    }

    @Override
    public boolean k() {
        return this.k0() && (Build.VERSION.SDK_INT < 29 || !ax.a1.T.a(this.z) || !this.Y) && this.i.j(this.f0());
    }

    @Override
    public void l(float f8) {
        if (this.S != f8) {
            this.S = f8;
            this.z0();
        }
    }

    @Override
    public void m() {
        this.Z = true;
        if (this.k0()) {
            this.i.x();
            if (!this.X || ax.a1.f0.l0(this.z)) {
                this.z.play();
            }
        }
    }

    @Override
    public int n(v v8) {
        this.p0();
        if ("audio/raw".equals(v8.o)) {
            if (!ax.S0.d0.L0(v8.I)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid PCM encoding: ");
                stringBuilder.append(v8.I);
                ax.S0.u.h("DefaultAudioSink", stringBuilder.toString());
                return 0;
            }
            int n8 = v8.I;
            if (!(n8 == 2 || this.c && n8 == 4)) {
                return 1;
            }
            return 2;
        }
        if (this.A.j(v8, this.D)) {
            return 2;
        }
        return 0;
    }

    @Override
    public void o(int n8) {
        block6: {
            boolean bl;
            block5: {
                boolean bl2 = this.c0;
                bl = false;
                if (!bl2) break block5;
                if (this.b0 != n8) break block6;
                this.c0 = false;
            }
            if (this.b0 != n8) {
                this.b0 = n8;
                if (n8 != 0) {
                    bl = true;
                }
                this.a0 = bl;
                this.flush();
            }
        }
    }

    @Override
    public long p() {
        if (!this.k0()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.a1.f0$b.a(this.z, this.x);
        }
        h h8 = this.x;
        long l8 = h8.c == 0 ? (long)h8.e * (long)h8.d : (long)ax.a1.f0.d0(h8.g);
        return ax.S0.d0.r1(this.x.h, 1000000L, l8, RoundingMode.DOWN);
    }

    @Override
    public void q(int n8, int n9) {
        Object object = this.z;
        if (object != null && ax.a1.f0.l0(object) && (object = this.x) != null && object.k) {
            ax.a1.V.a(this.z, n8, n9);
        }
    }

    public void q0(ax.a1.e object) {
        Looper looper = Looper.myLooper();
        boolean bl = this.k0 == looper;
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Current looper (");
        ((StringBuilder)object2).append(ax.a1.f0.c0(looper));
        ((StringBuilder)object2).append(") is not the playback looper (");
        ((StringBuilder)object2).append(ax.a1.f0.c0(this.k0));
        ((StringBuilder)object2).append(")");
        ax.S0.a.h(bl, ((StringBuilder)object2).toString());
        object2 = this.A;
        if (object2 != null && !((ax.a1.e)object).equals(object2)) {
            this.A = object;
            object = this.v;
            if (object != null) {
                object.j();
            }
        }
    }

    @Override
    public void r(int n8) {
        boolean bl = Build.VERSION.SDK_INT >= 29;
        ax.S0.a.g(bl);
        this.l = n8;
    }

    @Override
    public long s(boolean bl) {
        if (this.k0() && !this.Q) {
            return this.T(this.S(Math.min(this.i.c(), this.x.d(this.f0()))));
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void t() {
        if (this.f0) {
            this.f0 = false;
            this.flush();
        }
    }

    @Override
    public /* synthetic */ void u(long l8) {
        ax.a1.A.a(this, l8);
    }

    @Override
    public void v() {
        this.P = true;
    }

    @Override
    public void w(I1 i12) {
        this.u = i12;
    }

    @Override
    public void x(B.d d8) {
        this.v = d8;
    }

    @Override
    public void y() {
        ax.S0.a.g(this.a0);
        if (!this.f0) {
            this.f0 = true;
            this.flush();
        }
    }

    @Override
    public ax.a1.l z(v v8) {
        if (this.i0) {
            return ax.a1.l.d;
        }
        return this.q.a(v8, this.D);
    }

    private static final class b {
        public static long a(AudioTrack audioTrack, h h8) {
            if (h8.c == 0) {
                return h8.d(ax.a1.h0.a(audioTrack));
            }
            return ax.S0.d0.r1(ax.a1.h0.a(audioTrack), 1000000L, ax.a1.f0.d0(h8.g), RoundingMode.DOWN);
        }

        public static void b(AudioTrack audioTrack, ax.a1.k k8) {
            k8 = k8 == null ? null : k8.a;
            ax.a1.g0.a(audioTrack, (AudioDeviceInfo)k8);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, I1 i12) {
            if (!H1.a((LogSessionId)(i12 = i12.a()), G1.a())) {
                ax.a1.i0.a(audioTrack, (LogSessionId)i12);
            }
        }
    }

    public static interface d {
        public ax.a1.l a(v var1, ax.P0.c var2);
    }

    public static interface e {
        public static final e a = new r0.a().h();

        public int a(int var1, int var2, int var3, int var4, int var5, int var6, double var7);
    }

    public static interface f {
        public static final f a = new B0();

        public int a(int var1);

        public AudioTrack b(B.a var1, ax.P0.c var2, int var3, Context var4);
    }

    public static final class g {
        private final Context a;
        private ax.a1.e b;
        private p c;
        private boolean d;
        private boolean e;
        private boolean f;
        private e g;
        private f h;
        private d i;
        private boolean j = true;
        private ExoPlayer.a k;

        @Deprecated
        public g() {
            this.a = null;
            this.b = ax.a1.e.c;
            this.g = ax.a1.f0$e.a;
            this.h = ax.a1.f0$f.a;
        }

        public g(Context context) {
            this.a = context;
            this.b = ax.a1.e.c;
            this.g = ax.a1.f0$e.a;
            this.h = ax.a1.f0$f.a;
        }

        public f0 k() {
            ax.S0.a.g(this.f ^ true);
            this.f = true;
            if (this.c == null) {
                this.c = new i(new ax.Q0.o[0]);
            }
            if (this.i == null) {
                this.i = new J(this.a);
            }
            return new f0(this);
        }

        public g l(p p8) {
            ax.S0.a.e(p8);
            this.c = p8;
            return this;
        }

        public g m(ax.Q0.o[] oArray) {
            ax.S0.a.e(oArray);
            return this.l(new i(oArray));
        }

        public g n(boolean bl) {
            this.e = bl;
            return this;
        }

        public g o(boolean bl) {
            this.d = bl;
            return this;
        }
    }

    private static final class h {
        public final v a;
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

        public h(v v8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, ax.Q0.n n15, boolean bl, boolean bl2, boolean bl3) {
            this.a = v8;
            this.b = n8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
            this.h = n14;
            this.i = n15;
            this.j = bl;
            this.k = bl2;
            this.l = bl3;
        }

        public B.a a() {
            int n8 = this.g;
            int n9 = this.e;
            int n10 = this.f;
            boolean bl = this.l;
            boolean bl2 = this.c == 1;
            return new B.a(n8, n9, n10, bl, bl2, this.h);
        }

        public boolean b(h h8) {
            return h8.c == this.c && h8.g == this.g && h8.e == this.e && h8.f == this.f && h8.d == this.d && h8.j == this.j && h8.k == this.k;
        }

        public h c(int n8) {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, n8, this.i, this.j, this.k, this.l);
        }

        public long d(long l8) {
            return ax.S0.d0.o1(l8, this.e);
        }

        public long e(long l8) {
            return ax.S0.d0.o1(l8, this.a.H);
        }

        public boolean f() {
            return this.c == 1;
        }
    }

    public static class i
    implements p {
        private final ax.Q0.o[] a;
        private final F0 b;
        private final s c;

        public i(ax.Q0.o ... oArray) {
            this(oArray, new F0(), new s());
        }

        public i(ax.Q0.o[] oArray, F0 f02, s s8) {
            ax.Q0.o[] oArray2 = new ax.Q0.o[oArray.length + 2];
            this.a = oArray2;
            System.arraycopy(oArray, 0, oArray2, 0, oArray.length);
            this.b = f02;
            this.c = s8;
            oArray2[oArray.length] = f02;
            oArray2[oArray.length + 1] = s8;
        }

        @Override
        public long a(long l8) {
            long l9 = l8;
            if (this.c.e()) {
                l9 = this.c.i(l8);
            }
            return l9;
        }

        @Override
        public ax.P0.G b(ax.P0.G g8) {
            this.c.k(g8.a);
            this.c.j(g8.b);
            return g8;
        }

        @Override
        public long c() {
            return this.b.v();
        }

        @Override
        public boolean d(boolean bl) {
            this.b.E(bl);
            return bl;
        }

        @Override
        public ax.Q0.o[] e() {
            return this.a;
        }
    }

    public static final class j
    extends RuntimeException {
        private j(String string) {
            super(string);
        }
    }

    private static final class k {
        public final ax.P0.G a;
        public final long b;
        public final long c;
        public long d;

        private k(ax.P0.G g8, long l8, long l9) {
            this.a = g8;
            this.b = l8;
            this.c = l9;
        }
    }

    private static final class l {
        private final AudioTrack a;
        private final ax.a1.j b;
        private AudioRouting.OnRoutingChangedListener c;

        public l(AudioTrack audioTrack, ax.a1.j j8) {
            this.a = audioTrack;
            this.b = j8;
            this.c = new o0(this);
            j8 = new Handler(Looper.myLooper());
            ax.a1.k0.a(audioTrack, this.c, (Handler)j8);
        }

        public static /* synthetic */ void a(l l8, AudioRouting audioRouting) {
            l8.b(audioRouting);
        }

        private void b(AudioRouting audioRouting) {
            if (this.c != null && (audioRouting = ax.a1.n0.a(audioRouting)) != null) {
                this.b.j((AudioDeviceInfo)audioRouting);
            }
        }

        public void c() {
            ax.a1.m0.a(this.a, ax.a1.l0.a(ax.S0.a.e(this.c)));
            this.c = null;
        }
    }

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
            if (ax.a1.f0.h0()) {
                return true;
            }
            return SystemClock.elapsedRealtime() < this.c;
        }

        public void c(T t8) throws T {
            long l8;
            long l9 = SystemClock.elapsedRealtime();
            if (this.a == null) {
                this.a = t8;
            }
            if (this.b == -9223372036854775807L && !ax.a1.f0.h0()) {
                this.b = 200L + l9;
            }
            if ((l8 = this.b) != -9223372036854775807L && l9 >= l8) {
                T t9 = this.a;
                if (t9 != t8) {
                    ((Throwable)t9).addSuppressed((Throwable)t8);
                }
                t8 = this.a;
                this.a();
                throw t8;
            }
            this.c = l9 + 50L;
        }
    }

    private final class n
    implements F.a {
        final f0 a;

        private n(f0 f02) {
            this.a = f02;
        }

        @Override
        public void a(long l8) {
            if (this.a.v != null) {
                this.a.v.a(l8);
            }
        }

        @Override
        public void b(int n8, long l8) {
            if (this.a.v != null) {
                long l9 = SystemClock.elapsedRealtime();
                long l10 = this.a.h0;
                this.a.v.i(n8, l8, l9 - l10);
            }
        }

        @Override
        public void c(long l8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring impossibly large audio latency: ");
            stringBuilder.append(l8);
            ax.S0.u.h("DefaultAudioSink", stringBuilder.toString());
        }

        @Override
        public void d(long l8, long l9, long l10, long l11) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("Spurious audio timestamp (frame position mismatch): ");
            charSequence.append(l8);
            charSequence.append(", ");
            charSequence.append(l9);
            charSequence.append(", ");
            charSequence.append(l10);
            charSequence.append(", ");
            charSequence.append(l11);
            charSequence.append(", ");
            charSequence.append(this.a.e0());
            charSequence.append(", ");
            charSequence.append(this.a.f0());
            charSequence = charSequence.toString();
            if (!q0) {
                ax.S0.u.h("DefaultAudioSink", (String)charSequence);
                return;
            }
            throw new j((String)charSequence);
        }

        @Override
        public void e(long l8, long l9, long l10, long l11) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("Spurious audio timestamp (system clock mismatch): ");
            charSequence.append(l8);
            charSequence.append(", ");
            charSequence.append(l9);
            charSequence.append(", ");
            charSequence.append(l10);
            charSequence.append(", ");
            charSequence.append(l11);
            charSequence.append(", ");
            charSequence.append(this.a.e0());
            charSequence.append(", ");
            charSequence.append(this.a.f0());
            charSequence = charSequence.toString();
            if (!q0) {
                ax.S0.u.h("DefaultAudioSink", (String)charSequence);
                return;
            }
            throw new j((String)charSequence);
        }
    }

    private final class o {
        private final Handler a;
        private final AudioTrack.StreamEventCallback b;
        final f0 c;

        public o(f0 f02) {
            this.c = f02;
            this.a = new Handler(Looper.myLooper());
            this.b = new AudioTrack.StreamEventCallback(this, f02){
                final f0 a;
                final o b;
                {
                    this.b = o8;
                    this.a = f02;
                }

                public void onDataRequest(AudioTrack audioTrack, int n8) {
                    if (audioTrack.equals(this.b.c.z) && this.b.c.v != null && this.b.c.Z) {
                        this.b.c.v.l();
                    }
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    if (!audioTrack.equals(this.b.c.z)) {
                        return;
                    }
                    ax.a1.f0.L(this.b.c, true);
                }

                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(this.b.c.z) && this.b.c.v != null && this.b.c.Z) {
                        this.b.c.v.l();
                    }
                }
            };
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.a;
            j.Objects.requireNonNull((Object)handler);
            ax.a1.q0.a(audioTrack, new a(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            ax.a1.p0.a(audioTrack, this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }
}


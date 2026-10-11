package ax.a1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;
import ax.P0.C0894c;
import ax.P0.C0898g;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0976i;
import ax.S0.C0987u;
import ax.S0.C0990x;
import ax.Y0.C1177c;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;
import ax.f1.C2006D;
import ax.f1.C2025t;
import ax.f1.InterfaceC2029x;
import ax.f1.a0;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes.dex */
public class C0 extends ax.f1.L implements ax.Y0.S {
    private final Context K1;
    private final InterfaceC1309z.a L1;
    private final InterfaceC1276B M1;
    private final C2025t N1;
    private int O1;
    private boolean P1;
    private boolean Q1;
    private C0912v R1;
    private C0912v S1;
    private long T1;
    private boolean U1;
    private boolean V1;
    private boolean W1;
    private int X1;
    private boolean Y1;
    private long Z1;

    private static final class b {
        public static void a(InterfaceC1276B interfaceC1276B, Object obj) {
            interfaceC1276B.g(C1291h.a(obj));
        }
    }

    private final class c implements InterfaceC1276B.d {
        private c() {
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void a(long j) {
            C0.this.L1.x(j);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void b(InterfaceC1276B.a aVar) {
            C0.this.L1.r(aVar);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void c(int i) {
            if (Build.VERSION.SDK_INT >= 35 && C0.this.N1 != null) {
                C0.this.N1.e(i);
            }
            C0.this.L1.o(i);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void d() {
            C0.this.W1 = true;
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void e(boolean z) {
            C0.this.L1.y(z);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void f(Exception exc) {
            C0987u.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C0.this.L1.p(exc);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void g(InterfaceC1276B.a aVar) {
            C0.this.L1.q(aVar);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void h() {
            M0.a S0 = C0.this.S0();
            if (S0 != null) {
                S0.a();
            }
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void i(int i, long j, long j2) {
            C0.this.L1.z(i, j, j2);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void j() {
            C0.this.Z();
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void k() {
            C0.this.l2();
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void l() {
            M0.a S0 = C0.this.S0();
            if (S0 != null) {
                S0.b();
            }
        }
    }

    public C0(Context context, InterfaceC2029x.b bVar, ax.f1.Q q, boolean z, Handler handler, InterfaceC1309z interfaceC1309z, InterfaceC1276B interfaceC1276B) {
        this(context, bVar, q, z, handler, interfaceC1309z, interfaceC1276B, Build.VERSION.SDK_INT >= 35 ? new C2025t() : null);
    }

    private static boolean d2(String str) {
        if (Build.VERSION.SDK_INT >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str2 = Build.DEVICE;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean e2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean f2() {
        if (Build.VERSION.SDK_INT != 23) {
            return false;
        }
        String str = Build.MODEL;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int g2(C0912v c0912v) {
        C1296l z = this.M1.z(c0912v);
        if (!z.a) {
            return 0;
        }
        int i = z.b ? 1536 : 512;
        return z.c ? i | 2048 : i;
    }

    private int h2(C2006D c2006d, C0912v c0912v) {
        int i;
        if (!"OMX.google.raw.decoder".equals(c2006d.a) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && ax.S0.d0.S0(this.K1))) {
            return c0912v.p;
        }
        return -1;
    }

    private static List<C2006D> j2(ax.f1.Q q, C0912v c0912v, boolean z, InterfaceC1276B interfaceC1276B) throws a0.c {
        C2006D q2;
        return c0912v.o == null ? AbstractC2991z.z() : (!interfaceC1276B.b(c0912v) || (q2 = ax.f1.a0.q()) == null) ? ax.f1.a0.n(q, c0912v, z, false) : AbstractC2991z.A(q2);
    }

    private void m2(int i) {
        C2025t c2025t;
        this.M1.o(i);
        if (Build.VERSION.SDK_INT < 35 || (c2025t = this.N1) == null) {
            return;
        }
        c2025t.e(i);
    }

    private void n2() {
        InterfaceC2029x E0 = E0();
        if (E0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.X1));
            E0.a(bundle);
        }
    }

    private void o2() {
        long s = this.M1.s(c());
        if (s != Long.MIN_VALUE) {
            if (!this.U1) {
                s = Math.max(this.T1, s);
            }
            this.T1 = s;
            this.U1 = false;
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i == 2) {
            this.M1.l(((Float) C0968a.e(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.M1.A((C0894c) C0968a.e((C0894c) obj));
            return;
        }
        if (i == 6) {
            this.M1.C((C0898g) C0968a.e((C0898g) obj));
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                b.a(this.M1, obj);
            }
        } else if (i == 16) {
            this.X1 = ((Integer) C0968a.e(obj)).intValue();
            n2();
        } else if (i == 9) {
            this.M1.E(((Boolean) C0968a.e(obj)).booleanValue());
        } else if (i != 10) {
            super.B(i, obj);
        } else {
            m2(((Integer) C0968a.e(obj)).intValue());
        }
    }

    @Override // ax.f1.L
    protected float J0(float f, C0912v c0912v, C0912v[] c0912vArr) {
        int i = -1;
        for (C0912v c0912v2 : c0912vArr) {
            int i2 = c0912v2.H;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // ax.f1.L
    protected List<C2006D> L0(ax.f1.Q q, C0912v c0912v, boolean z) throws a0.c {
        return ax.f1.a0.o(j2(q, c0912v, z, this.M1), c0912v);
    }

    @Override // ax.f1.L
    protected long M0(long j, long j2, boolean z) {
        boolean z2 = this.Z1 != -9223372036854775807L;
        if (!this.Y1) {
            return (z2 || super.c()) ? 1000000L : 10000L;
        }
        long p = this.M1.p();
        if (!z2 || p == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(p, this.Z1 - j) / (h() != null ? h().a : 1.0f)) / 2.0f)) - (ax.S0.d0.a1(K().b()) - j2));
    }

    @Override // ax.f1.L
    protected InterfaceC2029x.a O0(C2006D c2006d, C0912v c0912v, MediaCrypto mediaCrypto, float f) {
        this.O1 = i2(c2006d, c0912v, Q());
        this.P1 = d2(c2006d.a);
        this.Q1 = e2(c2006d.a);
        MediaFormat k2 = k2(c0912v, c2006d.c, this.O1, f);
        this.S1 = (!"audio/raw".equals(c2006d.b) || "audio/raw".equals(c0912v.o)) ? null : c0912v;
        return InterfaceC2029x.a.a(c2006d, k2, c0912v, mediaCrypto, this.N1);
    }

    @Override // ax.f1.L
    protected boolean Q1(C0912v c0912v) {
        if (L().a != 0) {
            int g2 = g2(c0912v);
            if ((g2 & 512) != 0) {
                if (L().a == 2 || (g2 & 1024) != 0) {
                    return true;
                }
                if (c0912v.J == 0 && c0912v.K == 0) {
                    return true;
                }
            }
        }
        return this.M1.b(c0912v);
    }

    @Override // ax.f1.L
    protected int R1(ax.f1.Q q, C0912v c0912v) throws a0.c {
        int i;
        boolean z;
        if (!ax.P0.D.o(c0912v.o)) {
            return ax.Y0.V.a(0);
        }
        boolean z2 = true;
        boolean z3 = c0912v.P != 0;
        boolean S1 = ax.f1.L.S1(c0912v);
        int i2 = 8;
        if (!S1 || (z3 && ax.f1.a0.q() == null)) {
            i = 0;
        } else {
            i = g2(c0912v);
            if (this.M1.b(c0912v)) {
                return ax.Y0.V.c(4, 8, 32, i);
            }
        }
        if ("audio/raw".equals(c0912v.o) && !this.M1.b(c0912v)) {
            return ax.Y0.V.a(1);
        }
        if (!this.M1.b(ax.S0.d0.l0(2, c0912v.G, c0912v.H))) {
            return ax.Y0.V.a(1);
        }
        List<C2006D> j2 = j2(q, c0912v, false, this.M1);
        if (j2.isEmpty()) {
            return ax.Y0.V.a(1);
        }
        if (!S1) {
            return ax.Y0.V.a(2);
        }
        C2006D c2006d = j2.get(0);
        boolean q2 = c2006d.q(c0912v);
        if (!q2) {
            for (int i3 = 1; i3 < j2.size(); i3++) {
                C2006D c2006d2 = j2.get(i3);
                if (c2006d2.q(c0912v)) {
                    c2006d = c2006d2;
                    z = false;
                    break;
                }
            }
        }
        z2 = q2;
        z = true;
        int i4 = z2 ? 4 : 3;
        if (z2 && c2006d.t(c0912v)) {
            i2 = 16;
        }
        return ax.Y0.V.e(i4, i2, 32, c2006d.h ? 64 : 0, z ? 128 : 0, i);
    }

    @Override // ax.f1.L
    protected void T0(ax.V0.i iVar) {
        C0912v c0912v;
        if (Build.VERSION.SDK_INT < 29 || (c0912v = iVar.c0) == null || !Objects.equals(c0912v.o, "audio/opus") || !a1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(iVar.h0);
        int i = ((C0912v) C0968a.e(iVar.c0)).J;
        if (byteBuffer.remaining() == 8) {
            this.M1.q(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.V1 = true;
        this.R1 = null;
        this.Z1 = -9223372036854775807L;
        try {
            this.M1.flush();
            try {
                super.U();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.U();
                throw th;
            } finally {
            }
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void V(boolean z, boolean z2) throws C0622s {
        super.V(z, z2);
        this.L1.v(this.B1);
        if (L().b) {
            this.M1.y();
        } else {
            this.M1.t();
        }
        this.M1.w(P());
        this.M1.B(K());
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) throws C0622s {
        super.X(j, z);
        this.M1.flush();
        this.T1 = j;
        this.Z1 = -9223372036854775807L;
        this.W1 = false;
        this.U1 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void Y() {
        C2025t c2025t;
        this.M1.d();
        if (Build.VERSION.SDK_INT < 35 || (c2025t = this.N1) == null) {
            return;
        }
        c2025t.c();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void a0() {
        this.W1 = false;
        this.Z1 = -9223372036854775807L;
        try {
            super.a0();
        } finally {
            if (this.V1) {
                this.V1 = false;
                this.M1.a();
            }
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void b0() {
        super.b0();
        this.M1.m();
        this.Y1 = true;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.M0
    public boolean c() {
        return super.c() && this.M1.c();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void c0() {
        o2();
        this.Y1 = false;
        this.M1.f();
        super.c0();
    }

    @Override // ax.Y0.S
    public void e(ax.P0.G g) {
        this.M1.e(g);
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // ax.Y0.S
    public ax.P0.G h() {
        return this.M1.h();
    }

    @Override // ax.f1.L
    protected void h1(Exception exc) {
        C0987u.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.L1.n(exc);
    }

    @Override // ax.f1.L
    protected void i1(String str, InterfaceC2029x.a aVar, long j, long j2) {
        this.L1.s(str, j, j2);
    }

    protected int i2(C2006D c2006d, C0912v c0912v, C0912v[] c0912vArr) {
        int h2 = h2(c2006d, c0912v);
        if (c0912vArr.length == 1) {
            return h2;
        }
        for (C0912v c0912v2 : c0912vArr) {
            if (c2006d.e(c0912v, c0912v2).d != 0) {
                h2 = Math.max(h2, h2(c2006d, c0912v2));
            }
        }
        return h2;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.M0
    public boolean isReady() {
        return this.M1.k() || super.isReady();
    }

    @Override // ax.f1.L
    protected void j1(String str) {
        this.L1.t(str);
    }

    @Override // ax.f1.L
    protected C1177c k1(ax.Y0.O o) throws C0622s {
        C0912v c0912v = (C0912v) C0968a.e(o.b);
        this.R1 = c0912v;
        C1177c k1 = super.k1(o);
        this.L1.w(c0912v, k1);
        return k1;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat k2(C0912v c0912v, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c0912v.G);
        mediaFormat.setInteger("sample-rate", c0912v.H);
        C0990x.e(mediaFormat, c0912v.r);
        C0990x.d(mediaFormat, "max-input-size", i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !f2()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if ("audio/ac4".equals(c0912v.o)) {
            Pair<Integer, Integer> r = C0976i.r(c0912v);
            if (r != null) {
                C0990x.d(mediaFormat, "profile", ((Integer) r.first).intValue());
                C0990x.d(mediaFormat, "level", ((Integer) r.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (i2 >= 24 && this.M1.n(ax.S0.d0.l0(4, c0912v.G, c0912v.H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.X1));
        }
        return mediaFormat;
    }

    @Override // ax.f1.L
    protected C1177c l0(C2006D c2006d, C0912v c0912v, C0912v c0912v2) {
        C1177c e = c2006d.e(c0912v, c0912v2);
        int i = e.e;
        if (b1(c0912v2)) {
            i |= 32768;
        }
        if (h2(c2006d, c0912v2) > this.O1) {
            i |= 64;
        }
        int i2 = i;
        return new C1177c(c2006d.a, c0912v, c0912v2, i2 != 0 ? 0 : e.d, i2);
    }

    @Override // ax.f1.L
    protected void l1(C0912v c0912v, MediaFormat mediaFormat) throws C0622s {
        int i;
        C0912v c0912v2 = this.S1;
        int[] iArr = null;
        if (c0912v2 != null) {
            c0912v = c0912v2;
        } else if (E0() != null) {
            C0968a.e(mediaFormat);
            C0912v P = new C0912v.b().y0("audio/raw").s0("audio/raw".equals(c0912v.o) ? c0912v.I : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? ax.S0.d0.j0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).d0(c0912v.J).e0(c0912v.K).r0(c0912v.l).Z(c0912v.m).j0(c0912v.a).l0(c0912v.b).m0(c0912v.c).n0(c0912v.d).A0(c0912v.e).w0(c0912v.f).T(mediaFormat.getInteger("channel-count")).z0(mediaFormat.getInteger("sample-rate")).P();
            if (this.P1 && P.G == 6 && (i = c0912v.G) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < c0912v.G; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.Q1) {
                iArr = ax.q1.X.a(P.G);
            }
            c0912v = P;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!a1() || L().a == 0) {
                    this.M1.r(0);
                } else {
                    this.M1.r(L().a);
                }
            }
            this.M1.j(c0912v, 0, iArr);
        } catch (InterfaceC1276B.b e) {
            throw I(e, e.q, 5001);
        }
    }

    protected void l2() {
        this.U1 = true;
    }

    @Override // ax.f1.L
    protected void m1(long j) {
        this.M1.u(j);
    }

    @Override // ax.f1.L
    protected void o1() {
        super.o1();
        this.M1.v();
    }

    @Override // ax.f1.L
    protected boolean s1(long j, long j2, InterfaceC2029x interfaceC2029x, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0912v c0912v) throws C0622s {
        C0968a.e(byteBuffer);
        this.Z1 = -9223372036854775807L;
        if (this.S1 != null && (i2 & 2) != 0) {
            ((InterfaceC2029x) C0968a.e(interfaceC2029x)).m(i, false);
            return true;
        }
        if (z) {
            if (interfaceC2029x != null) {
                interfaceC2029x.m(i, false);
            }
            this.B1.f += i3;
            this.M1.v();
            return true;
        }
        try {
            if (!this.M1.D(byteBuffer, j3, i3)) {
                this.Z1 = j3;
                return false;
            }
            if (interfaceC2029x != null) {
                interfaceC2029x.m(i, false);
            }
            this.B1.e += i3;
            return true;
        } catch (InterfaceC1276B.c e) {
            throw J(e, this.R1, e.c0, (!a1() || L().a == 0) ? 5001 : 5004);
        } catch (InterfaceC1276B.f e2) {
            throw J(e2, c0912v, e2.c0, (!a1() || L().a == 0) ? 5002 : 5003);
        }
    }

    @Override // ax.Y0.S
    public long w() {
        if (getState() == 2) {
            o2();
        }
        return this.T1;
    }

    @Override // ax.f1.L
    protected void x1() throws C0622s {
        try {
            this.M1.i();
            if (N0() != -9223372036854775807L) {
                this.Z1 = N0();
            }
        } catch (InterfaceC1276B.f e) {
            throw J(e, e.d0, e.c0, a1() ? 5003 : 5002);
        }
    }

    @Override // ax.Y0.S
    public boolean z() {
        boolean z = this.W1;
        this.W1 = false;
        return z;
    }

    public C0(Context context, InterfaceC2029x.b bVar, ax.f1.Q q, boolean z, Handler handler, InterfaceC1309z interfaceC1309z, InterfaceC1276B interfaceC1276B, C2025t c2025t) {
        super(1, bVar, q, z, 44100.0f);
        this.K1 = context.getApplicationContext();
        this.M1 = interfaceC1276B;
        this.N1 = c2025t;
        this.X1 = -1000;
        this.L1 = new InterfaceC1309z.a(handler, interfaceC1309z);
        this.Z1 = -9223372036854775807L;
        interfaceC1276B.x(new c());
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public ax.Y0.S H() {
        return this;
    }
}

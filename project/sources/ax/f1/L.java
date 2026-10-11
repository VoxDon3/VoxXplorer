package ax.f1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.AbstractC0601h;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;
import ax.P0.C0900i;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.V0.i;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Z0.I1;
import ax.a1.D0;
import ax.b1.C1464m;
import ax.b1.InterfaceC1465n;
import ax.f1.InterfaceC2029x;
import ax.f1.a0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class L extends AbstractC0601h {
    private static final byte[] J1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final C2020n A0;
    private C0622s A1;
    private final MediaCodec.BufferInfo B0;
    protected C1176b B1;
    private final ArrayDeque<e> C0;
    private e C1;
    private final D0 D0;
    private long D1;
    private C0912v E0;
    private boolean E1;
    private C0912v F0;
    private boolean F1;
    private InterfaceC1465n G0;
    private boolean G1;
    private InterfaceC1465n H0;
    private long H1;
    private M0.a I0;
    private long I1;
    private MediaCrypto J0;
    private long K0;
    private float L0;
    private float M0;
    private InterfaceC2029x N0;
    private C0912v O0;
    private MediaFormat P0;
    private boolean Q0;
    private float R0;
    private ArrayDeque<C2006D> S0;
    private c T0;
    private C2006D U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private boolean Z0;
    private boolean a1;
    private boolean b1;
    private long c1;
    private boolean d1;
    private long e1;
    private int f1;
    private int g1;
    private ByteBuffer h1;
    private boolean i1;
    private boolean j1;
    private boolean k1;
    private boolean l1;
    private boolean m1;
    private boolean n1;
    private int o1;
    private int p1;
    private int q1;
    private boolean r1;
    private boolean s1;
    private final InterfaceC2029x.b t0;
    private boolean t1;
    private final Q u0;
    private long u1;
    private final boolean v0;
    private long v1;
    private final float w0;
    private boolean w1;
    private final ax.V0.i x0;
    private boolean x1;
    private final ax.V0.i y0;
    private boolean y1;
    private final ax.V0.i z0;
    private boolean z1;

    private static final class b {
        public static void a(InterfaceC2029x.a aVar, I1 i1) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId a = i1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = aVar.b;
            stringId = a.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    private final class d implements InterfaceC2029x.c {
        private d() {
        }

        @Override // ax.f1.InterfaceC2029x.c
        public void a() {
            if (L.this.I0 != null) {
                L.this.I0.b();
            }
        }

        @Override // ax.f1.InterfaceC2029x.c
        public void b() {
            if (L.this.I0 != null) {
                L.this.I0.b();
            }
        }
    }

    private static final class e {
        public static final e e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final ax.S0.L<C0912v> d = new ax.S0.L<>();

        public e(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public L(int i, InterfaceC2029x.b bVar, Q q, boolean z, float f) {
        super(i);
        this.t0 = bVar;
        this.u0 = (Q) C0968a.e(q);
        this.v0 = z;
        this.w0 = f;
        this.x0 = ax.V0.i.F();
        this.y0 = new ax.V0.i(0);
        this.z0 = new ax.V0.i(2);
        C2020n c2020n = new C2020n();
        this.A0 = c2020n;
        this.B0 = new MediaCodec.BufferInfo();
        this.L0 = 1.0f;
        this.M0 = 1.0f;
        this.K0 = -9223372036854775807L;
        this.C0 = new ArrayDeque<>();
        this.C1 = e.e;
        c2020n.C(0);
        c2020n.e0.order(ByteOrder.nativeOrder());
        this.D0 = new D0();
        this.R0 = -1.0f;
        this.V0 = 0;
        this.o1 = 0;
        this.f1 = -1;
        this.g1 = -1;
        this.e1 = -9223372036854775807L;
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.p1 = 0;
        this.q1 = 0;
        this.B1 = new C1176b();
        this.H1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
    }

    private void A0() {
        try {
            ((InterfaceC2029x) C0968a.i(this.N0)).flush();
        } finally {
            z1();
        }
    }

    private void B1() {
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
    }

    private boolean C0() {
        if (this.N0 == null) {
            return false;
        }
        if (O1()) {
            w1();
            return true;
        }
        if (L1()) {
            A0();
        } else {
            q1();
        }
        return false;
    }

    private void C1() {
        this.f1 = -1;
        this.y0.e0 = null;
    }

    private List<C2006D> D0(boolean z) throws a0.c {
        C0912v c0912v = (C0912v) C0968a.e(this.E0);
        List<C2006D> L0 = L0(this.u0, c0912v, z);
        if (!L0.isEmpty() || !z) {
            return L0;
        }
        List<C2006D> L02 = L0(this.u0, c0912v, false);
        if (!L02.isEmpty()) {
            C0987u.h("MediaCodecRenderer", "Drm session requires secure decoder for " + c0912v.o + ", but no secure decoder available. Trying to proceed with " + L02 + ".");
        }
        return L02;
    }

    private void D1() {
        this.g1 = -1;
        this.h1 = null;
    }

    private void E1(InterfaceC1465n interfaceC1465n) {
        C1464m.a(this.G0, interfaceC1465n);
        this.G0 = interfaceC1465n;
    }

    private void F1(e eVar) {
        this.C1 = eVar;
        long j = eVar.c;
        if (j != -9223372036854775807L) {
            this.E1 = true;
            m1(j);
        }
    }

    private void I1(InterfaceC1465n interfaceC1465n) {
        C1464m.a(this.H0, interfaceC1465n);
        this.H0 = interfaceC1465n;
    }

    private boolean J1(long j) {
        return this.K0 == -9223372036854775807L || K().b() - j < this.K0;
    }

    protected static boolean S1(C0912v c0912v) {
        int i = c0912v.P;
        return i == 0 || i == 2;
    }

    private boolean U0() {
        return this.g1 >= 0;
    }

    private boolean U1(C0912v c0912v) throws C0622s {
        if (Build.VERSION.SDK_INT >= 23 && this.N0 != null && this.q1 != 3 && getState() != 0) {
            float J0 = J0(this.M0, (C0912v) C0968a.e(c0912v), Q());
            float f = this.R0;
            if (f == J0) {
                return true;
            }
            if (J0 == -1.0f) {
                u0();
                return false;
            }
            if (f == -1.0f && J0 <= this.w0) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", J0);
            ((InterfaceC2029x) C0968a.e(this.N0)).a(bundle);
            this.R0 = J0;
        }
        return true;
    }

    private void V1() throws C0622s {
        ax.V0.b h = ((InterfaceC1465n) C0968a.e(this.H0)).h();
        if (h instanceof ax.b1.F) {
            try {
                ((MediaCrypto) C0968a.e(this.J0)).setMediaDrmSession(((ax.b1.F) h).b);
            } catch (MediaCryptoException e2) {
                throw I(e2, this.E0, 6006);
            }
        }
        E1(this.H0);
        this.p1 = 0;
        this.q1 = 0;
    }

    private boolean W0() {
        if (!this.A0.M()) {
            return true;
        }
        long O = O();
        return c1(O, this.A0.K()) == c1(O, this.z0.g0);
    }

    private void X0(C0912v c0912v) {
        s0();
        String str = c0912v.o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.A0.N(32);
        } else {
            this.A0.N(1);
        }
        this.k1 = true;
    }

    private void Y0(C2006D c2006d, MediaCrypto mediaCrypto) throws Exception {
        this.U0 = c2006d;
        C0912v c0912v = (C0912v) C0968a.e(this.E0);
        String str = c2006d.a;
        int i = Build.VERSION.SDK_INT;
        float J0 = i < 23 ? -1.0f : J0(this.M0, c0912v, Q());
        float f = J0 > this.w0 ? J0 : -1.0f;
        long b2 = K().b();
        InterfaceC2029x.a O0 = O0(c2006d, c0912v, mediaCrypto, f);
        if (i >= 31) {
            b.a(O0, P());
        }
        try {
            ax.S0.N.a("createCodec:" + str);
            InterfaceC2029x a2 = this.t0.a(O0);
            this.N0 = a2;
            this.d1 = a2.h(new d());
            ax.S0.N.b();
            long b3 = K().b();
            if (!c2006d.q(c0912v)) {
                C0987u.h("MediaCodecRenderer", ax.S0.d0.G("Format exceeds selected codec's capabilities [%s, %s]", C0912v.l(c0912v), str));
            }
            this.R0 = f;
            this.O0 = c0912v;
            this.V0 = m0(str);
            this.W0 = q0(str);
            this.X0 = n0(str);
            this.Y0 = o0(str);
            this.b1 = p0(c2006d) || I0();
            if (((InterfaceC2029x) C0968a.e(this.N0)).e()) {
                this.n1 = true;
                this.o1 = 1;
                this.Z0 = this.V0 != 0;
            }
            if (getState() == 2) {
                this.e1 = K().b() + 1000;
            }
            this.B1.a++;
            i1(str, O0, b3, b3 - b2);
        } catch (Throwable th) {
            ax.S0.N.b();
            throw th;
        }
    }

    private boolean Z0() throws C0622s {
        C0968a.g(this.J0 == null);
        InterfaceC1465n interfaceC1465n = this.G0;
        ax.V0.b h = interfaceC1465n.h();
        if (ax.b1.F.d && (h instanceof ax.b1.F)) {
            int state = interfaceC1465n.getState();
            if (state == 1) {
                InterfaceC1465n.a aVar = (InterfaceC1465n.a) C0968a.e(interfaceC1465n.g());
                throw I(aVar, this.E0, aVar.q);
            }
            if (state != 4) {
                return false;
            }
        }
        if (h == null) {
            return interfaceC1465n.g() != null;
        }
        if (h instanceof ax.b1.F) {
            ax.b1.F f = (ax.b1.F) h;
            try {
                this.J0 = new MediaCrypto(f.a, f.b);
            } catch (MediaCryptoException e2) {
                throw I(e2, this.E0, 6006);
            }
        }
        return true;
    }

    private boolean c1(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C0912v c0912v = this.F0;
        return (c0912v != null && Objects.equals(c0912v.o, "audio/opus") && ax.q1.L.g(j, j2)) ? false : true;
    }

    private static boolean d1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void f1(MediaCrypto mediaCrypto, boolean z) throws c, C0622s {
        C0912v c0912v = (C0912v) C0968a.e(this.E0);
        if (this.S0 == null) {
            try {
                List<C2006D> D0 = D0(z);
                ArrayDeque<C2006D> arrayDeque = new ArrayDeque<>();
                this.S0 = arrayDeque;
                if (this.v0) {
                    arrayDeque.addAll(D0);
                } else if (!D0.isEmpty()) {
                    this.S0.add(D0.get(0));
                }
                this.T0 = null;
            } catch (a0.c e2) {
                throw new c(c0912v, e2, z, -49998);
            }
        }
        if (this.S0.isEmpty()) {
            throw new c(c0912v, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) C0968a.e(this.S0);
        while (this.N0 == null) {
            C2006D c2006d = (C2006D) C0968a.e((C2006D) arrayDeque2.peekFirst());
            if (!g1(c0912v) || !M1(c2006d)) {
                return;
            }
            try {
                Y0(c2006d, mediaCrypto);
            } catch (Exception e3) {
                C0987u.i("MediaCodecRenderer", "Failed to initialize decoder: " + c2006d, e3);
                arrayDeque2.removeFirst();
                c cVar = new c(c0912v, e3, z, c2006d);
                h1(cVar);
                if (this.T0 == null) {
                    this.T0 = cVar;
                } else {
                    this.T0 = this.T0.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.T0;
                }
            }
        }
        this.S0 = null;
    }

    private void j0() throws C0622s {
        C0968a.g(!this.w1);
        ax.Y0.O M = M();
        this.z0.p();
        do {
            this.z0.p();
            int f0 = f0(M, this.z0, 0);
            if (f0 == -5) {
                k1(M);
                return;
            }
            if (f0 == -4) {
                if (!this.z0.s()) {
                    this.u1 = Math.max(this.u1, this.z0.g0);
                    if (n() || this.y0.w()) {
                        this.v1 = this.u1;
                    }
                    if (this.y1) {
                        C0912v c0912v = (C0912v) C0968a.e(this.E0);
                        this.F0 = c0912v;
                        if (Objects.equals(c0912v.o, "audio/opus") && !this.F0.r.isEmpty()) {
                            this.F0 = this.F0.b().d0(ax.q1.L.f(this.F0.r.get(0))).P();
                        }
                        l1(this.F0, null);
                        this.y1 = false;
                    }
                    this.z0.D();
                    C0912v c0912v2 = this.F0;
                    if (c0912v2 != null && Objects.equals(c0912v2.o, "audio/opus")) {
                        if (this.z0.r()) {
                            ax.V0.i iVar = this.z0;
                            iVar.c0 = this.F0;
                            T0(iVar);
                        }
                        if (ax.q1.L.g(O(), this.z0.g0)) {
                            this.D0.a(this.z0, this.F0.r);
                        }
                    }
                    if (!W0()) {
                        break;
                    }
                } else {
                    this.w1 = true;
                    this.v1 = this.u1;
                    return;
                }
            } else {
                if (f0 != -3) {
                    throw new IllegalStateException();
                }
                if (n()) {
                    this.v1 = this.u1;
                    return;
                }
                return;
            }
        } while (this.A0.H(this.z0));
        this.l1 = true;
    }

    private boolean k0(long j, long j2) throws C0622s {
        boolean z;
        C0968a.g(!this.x1);
        if (this.A0.M()) {
            C2020n c2020n = this.A0;
            z = false;
            if (!s1(j, j2, null, c2020n.e0, this.g1, 0, c2020n.L(), this.A0.J(), c1(O(), this.A0.K()), this.A0.s(), (C0912v) C0968a.e(this.F0))) {
                return false;
            }
            n1(this.A0.K());
            this.A0.p();
        } else {
            z = false;
        }
        if (this.w1) {
            this.x1 = true;
            return z;
        }
        if (this.l1) {
            C0968a.g(this.A0.H(this.z0));
            this.l1 = z;
        }
        if (this.m1) {
            if (this.A0.M()) {
                return true;
            }
            s0();
            this.m1 = z;
            e1();
            if (!this.k1) {
                return z;
            }
        }
        j0();
        if (this.A0.M()) {
            this.A0.D();
        }
        if (this.A0.M() || this.w1 || this.m1) {
            return true;
        }
        return z;
    }

    private int m0(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean n0(String str) {
        return Build.VERSION.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean o0(String str) {
        return Build.VERSION.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean p0(C2006D c2006d) {
        String str = c2006d.a;
        int i = Build.VERSION.SDK_INT;
        if (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c2006d.g;
        }
        return true;
    }

    private static boolean q0(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void q1() {
        if (this.I1 != -9223372036854775807L) {
            long O = O();
            long j = this.I1;
            if (O > j || this.D1 >= j) {
                return;
            }
            this.G1 = true;
            this.I1 = -9223372036854775807L;
        }
    }

    @TargetApi(23)
    private void r1() throws C0622s {
        int i = this.q1;
        if (i == 1) {
            A0();
            return;
        }
        if (i == 2) {
            A0();
            V1();
        } else if (i == 3) {
            v1();
        } else {
            this.x1 = true;
            x1();
        }
    }

    private void s0() {
        this.k1 = false;
        y1();
    }

    private boolean t0() {
        if (this.r1) {
            this.p1 = 1;
            if (this.X0) {
                this.q1 = 3;
                return false;
            }
            this.q1 = 1;
        }
        return true;
    }

    private void t1() {
        this.t1 = true;
        MediaFormat f = ((InterfaceC2029x) C0968a.e(this.N0)).f();
        if (this.V0 != 0 && f.getInteger("width") == 32 && f.getInteger("height") == 32) {
            this.a1 = true;
        } else {
            this.P0 = f;
            this.Q0 = true;
        }
    }

    private void u0() throws C0622s {
        if (!this.r1) {
            v1();
        } else {
            this.p1 = 1;
            this.q1 = 3;
        }
    }

    private boolean u1(int i) throws C0622s {
        ax.Y0.O M = M();
        this.x0.p();
        int f0 = f0(M, this.x0, i | 4);
        if (f0 == -5) {
            k1(M);
            return true;
        }
        if (f0 != -4 || !this.x0.s()) {
            return false;
        }
        this.w1 = true;
        r1();
        return false;
    }

    @TargetApi(23)
    private boolean v0() throws C0622s {
        if (this.r1) {
            this.p1 = 1;
            if (this.X0) {
                this.q1 = 3;
                return false;
            }
            this.q1 = 2;
        } else {
            V1();
        }
        return true;
    }

    private void v1() throws C0622s {
        w1();
        e1();
    }

    private boolean w0(long j, long j2) throws C0622s {
        boolean z;
        boolean s1;
        int l;
        InterfaceC2029x interfaceC2029x = (InterfaceC2029x) C0968a.e(this.N0);
        if (!U0()) {
            if (this.Y0 && this.s1) {
                try {
                    l = interfaceC2029x.l(this.B0);
                } catch (IllegalStateException unused) {
                    r1();
                    if (this.x1) {
                        w1();
                    }
                    return false;
                }
            } else {
                l = interfaceC2029x.l(this.B0);
            }
            if (l < 0) {
                if (l == -2) {
                    t1();
                    return true;
                }
                if (this.b1 && (this.w1 || this.p1 == 2)) {
                    r1();
                }
                long j3 = this.c1;
                if (j3 != -9223372036854775807L && j3 + 100 < K().a()) {
                    r1();
                }
                return false;
            }
            if (this.a1) {
                this.a1 = false;
                interfaceC2029x.m(l, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.B0;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                r1();
                return false;
            }
            this.g1 = l;
            ByteBuffer q = interfaceC2029x.q(l);
            this.h1 = q;
            if (q != null) {
                q.position(this.B0.offset);
                ByteBuffer byteBuffer = this.h1;
                MediaCodec.BufferInfo bufferInfo2 = this.B0;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            W1(this.B0.presentationTimeUs);
        }
        this.i1 = this.B0.presentationTimeUs < O();
        long j4 = this.v1;
        this.j1 = j4 != -9223372036854775807L && j4 <= this.B0.presentationTimeUs;
        if (this.G1) {
            long j5 = this.H1;
            if (j5 == -9223372036854775807L || this.B0.presentationTimeUs > j5) {
                this.H1 = this.B0.presentationTimeUs;
                this.i1 = true;
                this.j1 = false;
            } else {
                this.G1 = false;
                this.H1 = -9223372036854775807L;
            }
        }
        if (this.Y0 && this.s1) {
            try {
                ByteBuffer byteBuffer2 = this.h1;
                int i = this.g1;
                MediaCodec.BufferInfo bufferInfo3 = this.B0;
                z = false;
                try {
                    s1 = s1(j, j2, interfaceC2029x, byteBuffer2, i, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.i1, this.j1, (C0912v) C0968a.e(this.F0));
                } catch (IllegalStateException unused2) {
                    r1();
                    if (this.x1) {
                        w1();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            ByteBuffer byteBuffer3 = this.h1;
            int i2 = this.g1;
            MediaCodec.BufferInfo bufferInfo4 = this.B0;
            s1 = s1(j, j2, interfaceC2029x, byteBuffer3, i2, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.i1, this.j1, (C0912v) C0968a.e(this.F0));
        }
        if (s1) {
            n1(this.B0.presentationTimeUs);
            boolean z2 = (this.B0.flags & 4) != 0;
            if (!z2 && this.s1 && this.j1) {
                this.c1 = K().a();
            }
            D1();
            if (!z2) {
                return true;
            }
            r1();
        }
        return z;
    }

    private boolean x0(C2006D c2006d, C0912v c0912v, InterfaceC1465n interfaceC1465n, InterfaceC1465n interfaceC1465n2) throws C0622s {
        ax.V0.b h;
        ax.V0.b h2;
        if (interfaceC1465n == interfaceC1465n2) {
            return false;
        }
        if (interfaceC1465n2 != null && interfaceC1465n != null && (h = interfaceC1465n2.h()) != null && (h2 = interfaceC1465n.h()) != null && h.getClass().equals(h2.getClass())) {
            if (!(h instanceof ax.b1.F)) {
                return false;
            }
            if (!interfaceC1465n2.b().equals(interfaceC1465n.b()) || Build.VERSION.SDK_INT < 23) {
                return true;
            }
            UUID uuid = C0900i.e;
            if (!uuid.equals(interfaceC1465n.b()) && !uuid.equals(interfaceC1465n2.b())) {
                return !c2006d.g && (interfaceC1465n2.getState() == 2 || ((interfaceC1465n2.getState() == 3 || interfaceC1465n2.getState() == 4) && interfaceC1465n2.f((String) C0968a.e(c0912v.o))));
            }
        }
        return true;
    }

    private void y1() {
        B1();
        this.m1 = false;
        this.A0.p();
        this.z0.p();
        this.l1 = false;
        this.D0.d();
    }

    private boolean z0() throws C0622s {
        int i;
        if (this.N0 == null || (i = this.p1) == 2 || this.w1) {
            return false;
        }
        if (i == 0 && N1()) {
            u0();
        }
        InterfaceC2029x interfaceC2029x = (InterfaceC2029x) C0968a.e(this.N0);
        if (this.f1 < 0) {
            int j = interfaceC2029x.j();
            this.f1 = j;
            if (j < 0) {
                return false;
            }
            this.y0.e0 = interfaceC2029x.o(j);
            this.y0.p();
        }
        if (this.p1 == 1) {
            if (!this.b1) {
                this.s1 = true;
                interfaceC2029x.c(this.f1, 0, 0, 0L, 4);
                C1();
            }
            this.p1 = 2;
            return false;
        }
        if (this.Z0) {
            this.Z0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(this.y0.e0);
            byte[] bArr = J1;
            byteBuffer.put(bArr);
            interfaceC2029x.c(this.f1, 0, bArr.length, 0L, 0);
            C1();
            this.r1 = true;
            return true;
        }
        if (this.o1 == 1) {
            for (int i2 = 0; i2 < ((C0912v) C0968a.e(this.O0)).r.size(); i2++) {
                ((ByteBuffer) C0968a.e(this.y0.e0)).put(this.O0.r.get(i2));
            }
            this.o1 = 2;
        }
        int position = ((ByteBuffer) C0968a.e(this.y0.e0)).position();
        ax.Y0.O M = M();
        try {
            int f0 = f0(M, this.y0, 0);
            if (f0 == -3) {
                if (n()) {
                    this.v1 = this.u1;
                }
                return false;
            }
            if (f0 == -5) {
                if (this.o1 == 2) {
                    this.y0.p();
                    this.o1 = 1;
                }
                k1(M);
                return true;
            }
            if (this.y0.s()) {
                this.v1 = this.u1;
                if (this.o1 == 2) {
                    this.y0.p();
                    this.o1 = 1;
                }
                this.w1 = true;
                if (!this.r1) {
                    r1();
                    return false;
                }
                if (!this.b1) {
                    this.s1 = true;
                    interfaceC2029x.c(this.f1, 0, 0, 0L, 4);
                    C1();
                }
                return false;
            }
            if (!this.r1 && !this.y0.u()) {
                this.y0.p();
                if (this.o1 == 2) {
                    this.o1 = 1;
                }
                return true;
            }
            if (K1(this.y0)) {
                return true;
            }
            boolean E = this.y0.E();
            if (E) {
                this.y0.d0.b(position);
            }
            long j2 = this.y0.g0;
            if (this.y1) {
                if (this.C0.isEmpty()) {
                    this.C1.d.a(j2, (C0912v) C0968a.e(this.E0));
                } else {
                    this.C0.peekLast().d.a(j2, (C0912v) C0968a.e(this.E0));
                }
                this.y1 = false;
            }
            this.u1 = Math.max(this.u1, j2);
            if (n() || this.y0.w()) {
                this.v1 = this.u1;
            }
            this.y0.D();
            if (this.y0.r()) {
                T0(this.y0);
            }
            p1(this.y0);
            int F0 = F0(this.y0);
            if ((Build.VERSION.SDK_INT < 34 || (F0 & 32) == 0) && !L().b) {
                this.I1 = Math.max(this.I1, this.y0.g0);
            }
            if (E) {
                ((InterfaceC2029x) C0968a.e(interfaceC2029x)).b(this.f1, 0, this.y0.d0, j2, F0);
            } else {
                ((InterfaceC2029x) C0968a.e(interfaceC2029x)).c(this.f1, 0, ((ByteBuffer) C0968a.e(this.y0.e0)).limit(), j2, F0);
            }
            C1();
            this.r1 = true;
            this.o1 = 0;
            this.B1.c++;
            return true;
        } catch (i.a e2) {
            h1(e2);
            u1(0);
            A0();
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.N0
    public final int A() {
        return 8;
    }

    protected void A1() {
        z1();
        this.A1 = null;
        this.S0 = null;
        this.U0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = false;
        this.t1 = false;
        this.R0 = -1.0f;
        this.V0 = 0;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.b1 = false;
        this.d1 = false;
        this.n1 = false;
        this.o1 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i == 11) {
            this.I0 = (M0.a) C0968a.e((M0.a) obj);
        } else {
            super.B(i, obj);
        }
    }

    protected final boolean B0() throws C0622s {
        boolean C0 = C0();
        if (C0) {
            e1();
        }
        return C0;
    }

    protected final InterfaceC2029x E0() {
        return this.N0;
    }

    protected int F0(ax.V0.i iVar) {
        return 0;
    }

    protected final C2006D G0() {
        return this.U0;
    }

    protected final void G1() {
        this.z1 = true;
    }

    protected final C0912v H0() {
        return this.O0;
    }

    protected final void H1(C0622s c0622s) {
        this.A1 = c0622s;
    }

    protected boolean I0() {
        return false;
    }

    protected abstract float J0(float f, C0912v c0912v, C0912v[] c0912vArr);

    protected final MediaFormat K0() {
        return this.P0;
    }

    protected boolean K1(ax.V0.i iVar) {
        if (!P1(iVar)) {
            return false;
        }
        iVar.p();
        this.B1.d++;
        return true;
    }

    protected abstract List<C2006D> L0(Q q, C0912v c0912v, boolean z) throws a0.c;

    protected boolean L1() {
        return true;
    }

    protected long M0(long j, long j2, boolean z) {
        return super.o(j, j2);
    }

    protected boolean M1(C2006D c2006d) {
        return true;
    }

    protected long N0() {
        return this.v1;
    }

    protected boolean N1() {
        return false;
    }

    protected abstract InterfaceC2029x.a O0(C2006D c2006d, C0912v c0912v, MediaCrypto mediaCrypto, float f);

    protected boolean O1() {
        int i = this.q1;
        if (i == 3 || ((this.W0 && !this.t1) || (this.X0 && this.s1))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C0968a.g(i2 >= 23);
            if (i2 >= 23) {
                try {
                    V1();
                } catch (C0622s e2) {
                    C0987u.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    return true;
                }
            }
        }
        return false;
    }

    protected final long P0() {
        return this.C1.c;
    }

    protected boolean P1(ax.V0.i iVar) {
        return false;
    }

    protected final long Q0() {
        return this.C1.b;
    }

    protected boolean Q1(C0912v c0912v) {
        return false;
    }

    protected float R0() {
        return this.L0;
    }

    protected abstract int R1(Q q, C0912v c0912v) throws a0.c;

    protected final M0.a S0() {
        return this.I0;
    }

    protected abstract void T0(ax.V0.i iVar) throws C0622s;

    protected final boolean T1() throws C0622s {
        return U1(this.O0);
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.E0 = null;
        F1(e.e);
        this.C0.clear();
        if (this.k1) {
            s0();
        } else {
            C0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void V(boolean z, boolean z2) throws C0622s {
        this.B1 = new C1176b();
    }

    protected boolean V0() {
        return this.G1;
    }

    protected final void W1(long j) throws C0622s {
        C0912v j2 = this.C1.d.j(j);
        if (j2 == null && this.E1 && this.P0 != null) {
            j2 = this.C1.d.i();
        }
        if (j2 != null) {
            this.F0 = j2;
        } else if (!this.Q0 || this.F0 == null) {
            return;
        }
        l1((C0912v) C0968a.e(this.F0), this.P0);
        this.Q0 = false;
        this.E1 = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) throws C0622s {
        this.w1 = false;
        this.x1 = false;
        this.z1 = false;
        if (this.k1) {
            y1();
        } else {
            B0();
        }
        if (this.C1.d.l() > 0) {
            this.y1 = true;
        }
        this.C1.d.c();
        this.C0.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void a0() {
        try {
            s0();
            w1();
        } finally {
            I1(null);
        }
    }

    protected final boolean a1() {
        return this.k1;
    }

    @Override // androidx.media3.exoplayer.N0
    public final int b(C0912v c0912v) throws C0622s {
        try {
            return R1(this.u0, c0912v);
        } catch (a0.c e2) {
            throw I(e2, c0912v, 4002);
        }
    }

    protected final boolean b1(C0912v c0912v) {
        return this.H0 == null && Q1(c0912v);
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return this.x1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.AbstractC0601h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void d0(ax.P0.C0912v[] r12, long r13, long r15, ax.i1.InterfaceC2209F.b r17) throws androidx.media3.exoplayer.C0622s {
        /*
            r11 = this;
            ax.f1.L$e r12 = r11.C1
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            ax.f1.L$e r4 = new ax.f1.L$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.F1(r4)
            boolean r12 = r11.F1
            if (r12 == 0) goto L56
            r11.o1()
            return
        L24:
            java.util.ArrayDeque<ax.f1.L$e> r12 = r11.C0
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.u1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.D1
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            ax.f1.L$e r4 = new ax.f1.L$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.F1(r4)
            ax.f1.L$e r12 = r11.C1
            long r12 = r12.c
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 == 0) goto L56
            r11.o1()
        L56:
            return
        L57:
            java.util.ArrayDeque<ax.f1.L$e> r12 = r11.C0
            ax.f1.L$e r0 = new ax.f1.L$e
            long r1 = r11.u1
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.L.d0(ax.P0.v[], long, long, ax.i1.F$b):void");
    }

    protected final void e1() throws C0622s {
        C0912v c0912v;
        boolean z;
        if (this.N0 != null || this.k1 || (c0912v = this.E0) == null) {
            return;
        }
        if (b1(c0912v)) {
            X0(c0912v);
            return;
        }
        E1(this.H0);
        if (this.G0 == null || Z0()) {
            try {
                InterfaceC1465n interfaceC1465n = this.G0;
                if (interfaceC1465n != null) {
                    if (interfaceC1465n.getState() != 3) {
                        if (this.G0.getState() == 4) {
                        }
                    }
                    if (this.G0.f((String) C0968a.i(c0912v.o))) {
                        z = true;
                        f1(this.J0, z);
                    }
                }
                z = false;
                f1(this.J0, z);
            } catch (c e2) {
                throw I(e2, c0912v, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.J0;
        if (mediaCrypto == null || this.N0 != null) {
            return;
        }
        mediaCrypto.release();
        this.J0 = null;
    }

    protected boolean g1(C0912v c0912v) throws C0622s {
        return true;
    }

    protected abstract void h1(Exception exc);

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) throws C0622s {
        boolean z = false;
        if (this.z1) {
            this.z1 = false;
            r1();
        }
        C0622s c0622s = this.A1;
        if (c0622s != null) {
            this.A1 = null;
            throw c0622s;
        }
        try {
            if (this.x1) {
                x1();
                return;
            }
            if (this.E0 != null || u1(2)) {
                e1();
                if (this.k1) {
                    ax.S0.N.a("bypassRender");
                    while (k0(j, j2)) {
                    }
                    ax.S0.N.b();
                } else if (this.N0 != null) {
                    long b2 = K().b();
                    ax.S0.N.a("drainAndFeed");
                    while (w0(j, j2) && J1(b2)) {
                    }
                    while (z0() && J1(b2)) {
                    }
                    ax.S0.N.b();
                } else {
                    this.B1.d += h0(j);
                    u1(1);
                }
                this.B1.c();
            }
        } catch (MediaCodec.CryptoException e2) {
            throw I(e2, this.E0, ax.S0.d0.b0(e2.getErrorCode()));
        } catch (IllegalStateException e3) {
            if (!d1(e3)) {
                throw e3;
            }
            h1(e3);
            if ((e3 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e3).isRecoverable()) {
                z = true;
            }
            if (z) {
                w1();
            }
            C2004B r0 = r0(e3, G0());
            throw J(r0, this.E0, z, r0.d0 == 1101 ? 4006 : 4003);
        }
    }

    protected abstract void i1(String str, InterfaceC2029x.a aVar, long j, long j2);

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        if (this.E0 == null) {
            return false;
        }
        if (T() || U0()) {
            return true;
        }
        return this.e1 != -9223372036854775807L && K().b() < this.e1;
    }

    protected abstract void j1(String str);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (v0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
    
        if (v0() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected ax.Y0.C1177c k1(ax.Y0.O r12) throws androidx.media3.exoplayer.C0622s {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.L.k1(ax.Y0.O):ax.Y0.c");
    }

    protected abstract C1177c l0(C2006D c2006d, C0912v c0912v, C0912v c0912v2);

    protected abstract void l1(C0912v c0912v, MediaFormat mediaFormat) throws C0622s;

    protected void n1(long j) {
        this.D1 = j;
        while (!this.C0.isEmpty() && j >= this.C0.peek().a) {
            F1((e) C0968a.e(this.C0.poll()));
            o1();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public final long o(long j, long j2) {
        return M0(j, j2, this.d1);
    }

    protected C2004B r0(Throwable th, C2006D c2006d) {
        return new C2004B(th, c2006d);
    }

    protected abstract boolean s1(long j, long j2, InterfaceC2029x interfaceC2029x, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0912v c0912v) throws C0622s;

    /* JADX WARN: Multi-variable type inference failed */
    protected void w1() {
        try {
            InterfaceC2029x interfaceC2029x = this.N0;
            if (interfaceC2029x != null) {
                interfaceC2029x.d();
                this.B1.b++;
                j1(((C2006D) C0968a.e(this.U0)).a);
            }
            this.N0 = null;
            try {
                MediaCrypto mediaCrypto = this.J0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.N0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.J0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public void x(float f, float f2) throws C0622s {
        this.L0 = f;
        this.M0 = f2;
        U1(this.O0);
    }

    protected abstract void x1() throws C0622s;

    public void y0() {
        this.F1 = true;
    }

    protected void z1() {
        C1();
        D1();
        B1();
        this.e1 = -9223372036854775807L;
        this.s1 = false;
        this.c1 = -9223372036854775807L;
        this.r1 = false;
        this.Z0 = false;
        this.a1 = false;
        this.i1 = false;
        this.j1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.o1 = this.n1 ? 1 : 0;
        this.G1 = false;
        this.H1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
    }

    public static class c extends Exception {
        public final boolean c0;
        public final C2006D d0;
        public final String e0;
        public final c f0;
        public final String q;

        public c(C0912v c0912v, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c0912v, th, c0912v.o, z, null, b(i), null);
        }

        private static String b(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : HttpUrl.FRAGMENT_ENCODE_SET) + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.q, this.c0, this.d0, this.e0, cVar);
        }

        public c(C0912v c0912v, Throwable th, boolean z, C2006D c2006d) {
            this("Decoder init failed: " + c2006d.a + ", " + c0912v, th, c0912v.o, z, c2006d, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private c(String str, Throwable th, String str2, boolean z, C2006D c2006d, String str3, c cVar) {
            super(str, th);
            this.q = str2;
            this.c0 = z;
            this.d0 = c2006d;
            this.e0 = str3;
            this.f0 = cVar;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void b0() {
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void c0() {
    }

    protected void o1() {
    }

    protected void m1(long j) {
    }

    protected void p1(ax.V0.i iVar) throws C0622s {
    }
}

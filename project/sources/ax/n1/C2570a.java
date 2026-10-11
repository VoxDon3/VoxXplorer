package ax.n1;

import android.os.SystemClock;
import android.text.TextUtils;
import ax.P0.A;
import ax.P0.C;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Z0.C1203b;
import ax.Z0.InterfaceC1206c;
import ax.a1.InterfaceC1276B;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.l1.AbstractC2448G;
import ax.r7.AbstractC2991z;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: ax.n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2570a implements InterfaceC1206c {
    private static final NumberFormat e;
    private final String a;
    private final N.c b;
    private final N.b c;
    private final long d;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public C2570a(String str) {
        this.a = str;
        this.b = new N.c();
        this.c = new N.b();
        this.d = SystemClock.elapsedRealtime();
    }

    private static String A0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String B0(int i) {
        return i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String C0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String D0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String E0(long j) {
        return j == -9223372036854775807L ? "?" : e.format(j / 1000.0f);
    }

    private static String F0(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String G0(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private String H(InterfaceC1206c.a aVar, String str, String str2, Throwable th) {
        String str3 = str + " [" + J(aVar);
        if (th instanceof F) {
            str3 = str3 + ", errorCode=" + ((F) th).a();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String e2 = C0987u.e(th);
        if (!TextUtils.isEmpty(e2)) {
            str3 = str3 + "\n  " + e2.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    private void H0(InterfaceC1206c.a aVar, String str) {
        J0(H(aVar, str, null, null));
    }

    private void I0(InterfaceC1206c.a aVar, String str, String str2) {
        J0(H(aVar, str, str2, null));
    }

    private String J(InterfaceC1206c.a aVar) {
        String str = "window=" + aVar.c;
        if (aVar.d != null) {
            str = str + ", period=" + aVar.b.b(aVar.d.a);
            if (aVar.d.b()) {
                str = (str + ", adGroup=" + aVar.d.b) + ", ad=" + aVar.d.c;
            }
        }
        return "eventTime=" + E0(aVar.a - this.d) + ", mediaPos=" + E0(aVar.e) + ", " + str;
    }

    private void K0(InterfaceC1206c.a aVar, String str, String str2, Throwable th) {
        M0(H(aVar, str, str2, th));
    }

    private void L0(InterfaceC1206c.a aVar, String str, Throwable th) {
        M0(H(aVar, str, null, th));
    }

    private void N0(InterfaceC1206c.a aVar, String str, Exception exc) {
        K0(aVar, "internalError", str, exc);
    }

    private void O0(C c, String str) {
        for (int i = 0; i < c.e(); i++) {
            J0(str + c.d(i));
        }
    }

    private static String o(InterfaceC1276B.a aVar) {
        return aVar.a + "," + aVar.c + "," + aVar.b + "," + aVar.d + "," + aVar.e + "," + aVar.f;
    }

    private static String y(int i) {
        switch (i) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return "?";
        }
    }

    private static String z0(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    @Override // ax.Z0.InterfaceC1206c
    public void A(InterfaceC1206c.a aVar) {
        H0(aVar, "drmKeysRestored");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void B(InterfaceC1206c.a aVar, int i) {
        I0(aVar, "audioSessionId", Integer.toString(i));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void C(InterfaceC1206c.a aVar, long j) {
        I0(aVar, "audioPositionAdvancing", "since " + E0(((j - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.d));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void D(InterfaceC1206c.a aVar, V v) {
        C c;
        J0("tracks [" + J(aVar));
        AbstractC2991z<V.a> a = v.a();
        for (int i = 0; i < a.size(); i++) {
            V.a aVar2 = a.get(i);
            J0("  group [ id=" + aVar2.a().b);
            for (int i2 = 0; i2 < aVar2.a; i2++) {
                J0("    " + G0(aVar2.i(i2)) + " Track:" + i2 + ", " + C0912v.l(aVar2.b(i2)) + ", supported=" + d0.d0(aVar2.c(i2)));
            }
            J0("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < a.size(); i3++) {
            V.a aVar3 = a.get(i3);
            for (int i4 = 0; !z && i4 < aVar3.a; i4++) {
                if (aVar3.i(i4) && (c = aVar3.b(i4).l) != null && c.e() > 0) {
                    J0("  Metadata [");
                    O0(c, "    ");
                    J0("  ]");
                    z = true;
                }
            }
        }
        J0("]");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void E(InterfaceC1206c.a aVar, C1176b c1176b) {
        H0(aVar, "videoEnabled");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void F(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b, IOException iOException, boolean z) {
        N0(aVar, "loadError", iOException);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void G(InterfaceC1206c.a aVar, C0915y c0915y, int i) {
        J0("mediaItem [" + J(aVar) + ", reason=" + z0(i) + "]");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void I(InterfaceC1206c.a aVar, int i) {
        I0(aVar, "repeatMode", C0(i));
    }

    protected void J0(String str) {
        C0987u.b(this.a, str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void K(InterfaceC1206c.a aVar) {
        H0(aVar, "drmSessionReleased");
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void L(InterfaceC1206c.a aVar, ax.R0.c cVar) {
        C1203b.q(this, aVar, cVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void M(InterfaceC1206c.a aVar) {
        C1203b.x(this, aVar);
    }

    protected void M0(String str) {
        C0987u.c(this.a, str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void N(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b, int i) {
        C1203b.I(this, aVar, c2234y, c2205b, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void O(InterfaceC1206c.a aVar, int i) {
        int i2 = aVar.b.i();
        int p = aVar.b.p();
        J0("timeline [" + J(aVar) + ", periodCount=" + i2 + ", windowCount=" + p + ", reason=" + F0(i));
        for (int i3 = 0; i3 < Math.min(i2, 3); i3++) {
            aVar.b.f(i3, this.c);
            J0("  period [" + E0(this.c.j()) + "]");
        }
        if (i2 > 3) {
            J0("  ...");
        }
        for (int i4 = 0; i4 < Math.min(p, 3); i4++) {
            aVar.b.n(i4, this.b);
            J0("  window [" + E0(this.b.d()) + ", seekable=" + this.b.h + ", dynamic=" + this.b.i + "]");
        }
        if (p > 3) {
            J0("  ...");
        }
        J0("]");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void P(InterfaceC1206c.a aVar, boolean z) {
        I0(aVar, "isPlaying", Boolean.toString(z));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void Q(InterfaceC1206c.a aVar, int i, long j, long j2) {
        K0(aVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null);
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
    public void T(InterfaceC1206c.a aVar, int i) {
        I0(aVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void U(InterfaceC1206c.a aVar, C2234y c2234y, C2205B c2205b) {
        C1203b.F(this, aVar, c2234y, c2205b);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void V(InterfaceC1206c.a aVar, String str, long j, long j2) {
        I0(aVar, "videoDecoderInitialized", str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void W(InterfaceC1206c.a aVar, T t) {
        C1203b.d0(this, aVar, t);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void X(InterfaceC1206c.a aVar, InterfaceC1276B.a aVar2) {
        I0(aVar, "audioTrackInit", o(aVar2));
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
        I0(aVar, "downstreamFormat", C0912v.l(c2205b.c));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void a0(InterfaceC1206c.a aVar, a0 a0Var) {
        StringBuilder sb = new StringBuilder("w=" + a0Var.a + ", h=" + a0Var.b);
        if (a0Var.d != 1.0f) {
            sb.append(", par=");
            sb.append(a0Var.d);
        }
        I0(aVar, "videoSize", sb.toString());
    }

    @Override // ax.Z0.InterfaceC1206c
    public void b(InterfaceC1206c.a aVar, String str) {
        I0(aVar, "audioDecoderReleased", str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void b0(InterfaceC1206c.a aVar, H.e eVar, H.e eVar2, int i) {
        I0(aVar, "positionDiscontinuity", "reason=" + y(i) + ", PositionInfo:old [" + eVar + "], PositionInfo:new [" + eVar2 + "]");
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void c(InterfaceC1206c.a aVar) {
        C1203b.Y(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void c0(InterfaceC1206c.a aVar, G g) {
        I0(aVar, "playbackParameters", g.toString());
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void d(InterfaceC1206c.a aVar, C0905n c0905n) {
        C1203b.s(this, aVar, c0905n);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void d0(H h, InterfaceC1206c.b bVar) {
        C1203b.C(this, h, bVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void e(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.k(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void e0(InterfaceC1206c.a aVar, InterfaceC1276B.a aVar2) {
        I0(aVar, "audioTrackReleased", o(aVar2));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void f(InterfaceC1206c.a aVar, int i, int i2) {
        I0(aVar, "surfaceSize", "w=" + i + ", h=" + i2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void f0(InterfaceC1206c.a aVar, A a) {
        C1203b.L(this, aVar, a);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void g(InterfaceC1206c.a aVar) {
        C1203b.S(this, aVar);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void g0(InterfaceC1206c.a aVar, Object obj, long j) {
        I0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void h(InterfaceC1206c.a aVar, C2205B c2205b) {
        I0(aVar, "upstreamDiscarded", C0912v.l(c2205b.c));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void h0(InterfaceC1206c.a aVar, float f) {
        I0(aVar, "volume", Float.toString(f));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void i(InterfaceC1206c.a aVar) {
        H0(aVar, "drmKeysRemoved");
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void i0(InterfaceC1206c.a aVar, String str, long j) {
        C1203b.c(this, aVar, str, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void j(InterfaceC1206c.a aVar, C0894c c0894c) {
        I0(aVar, "audioAttributes", c0894c.a + "," + c0894c.b + "," + c0894c.c + "," + c0894c.d);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void j0(InterfaceC1206c.a aVar, F f) {
        C1203b.R(this, aVar, f);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void k(InterfaceC1206c.a aVar, List list) {
        C1203b.r(this, aVar, list);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void k0(InterfaceC1206c.a aVar, C0912v c0912v, C1177c c1177c) {
        I0(aVar, "videoInputFormat", C0912v.l(c0912v));
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void l(InterfaceC1206c.a aVar, String str, long j) {
        C1203b.h0(this, aVar, str, j);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void l0(InterfaceC1206c.a aVar, int i, int i2, boolean z) {
        I0(aVar, "rendererReady", "rendererIndex=" + i + ", " + d0.v0(i2) + ", " + z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void m(InterfaceC1206c.a aVar, C0912v c0912v, C1177c c1177c) {
        I0(aVar, "audioInputFormat", C0912v.l(c0912v));
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void m0(InterfaceC1206c.a aVar, boolean z, int i) {
        C1203b.T(this, aVar, z, i);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void n(InterfaceC1206c.a aVar, boolean z) {
        I0(aVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void n0(InterfaceC1206c.a aVar, boolean z) {
        C1203b.J(this, aVar, z);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void o0(InterfaceC1206c.a aVar, boolean z) {
        I0(aVar, "loading", Boolean.toString(z));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void p(InterfaceC1206c.a aVar, F f) {
        L0(aVar, "playerFailed", f);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void p0(InterfaceC1206c.a aVar, String str, long j, long j2) {
        I0(aVar, "audioDecoderInitialized", str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void q(InterfaceC1206c.a aVar, Exception exc) {
        C1203b.g0(this, aVar, exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void q0(InterfaceC1206c.a aVar, C c) {
        J0("metadata [" + J(aVar));
        O0(c, "  ");
        J0("]");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void r(InterfaceC1206c.a aVar, C1176b c1176b) {
        H0(aVar, "audioEnabled");
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
    public void t0(InterfaceC1206c.a aVar, String str) {
        I0(aVar, "videoDecoderReleased", str);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void u(InterfaceC1206c.a aVar, C1176b c1176b) {
        H0(aVar, "audioDisabled");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void u0(InterfaceC1206c.a aVar, Exception exc) {
        N0(aVar, "drmSessionManagerError", exc);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void v(InterfaceC1206c.a aVar, boolean z, int i) {
        I0(aVar, "playWhenReady", z + ", " + A0(i));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void v0(InterfaceC1206c.a aVar, C1176b c1176b) {
        H0(aVar, "videoDisabled");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void w(InterfaceC1206c.a aVar, int i) {
        I0(aVar, "state", D0(i));
    }

    @Override // ax.Z0.InterfaceC1206c
    public /* synthetic */ void w0(InterfaceC1206c.a aVar, int i, long j, long j2) {
        C1203b.p(this, aVar, i, j, j2);
    }

    @Override // ax.Z0.InterfaceC1206c
    public void x(InterfaceC1206c.a aVar, boolean z) {
        I0(aVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void x0(InterfaceC1206c.a aVar, int i) {
        I0(aVar, "playbackSuppressionReason", B0(i));
    }

    @Override // ax.Z0.InterfaceC1206c
    public void y0(InterfaceC1206c.a aVar) {
        H0(aVar, "drmKeysLoaded");
    }

    @Override // ax.Z0.InterfaceC1206c
    public void z(InterfaceC1206c.a aVar, int i, long j) {
        I0(aVar, "droppedFrames", Integer.toString(i));
    }

    @Deprecated
    public C2570a(AbstractC2448G abstractC2448G) {
        this("EventLogger");
    }
}

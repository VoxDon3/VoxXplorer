package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import ax.P0.C0912v;
import ax.P0.D;
import ax.Q0.o;
import ax.S0.C0968a;
import ax.S0.N;
import ax.S0.d0;
import ax.a1.C1288f0;
import ax.a1.H;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;

/* loaded from: classes.dex */
public final class b extends H<ax.W0.a> {
    private static int V0;
    public static final /* synthetic */ int W0 = 0;

    public b() {
        this((Handler) null, (InterfaceC1309z) null, new o[0]);
    }

    public static int G0() {
        return V0;
    }

    public static void I0(int i) {
        V0 = i;
    }

    private boolean J0(C0912v c0912v) {
        if (!K0(c0912v, 2)) {
            return true;
        }
        if (s0(d0.l0(4, c0912v.G, c0912v.H)) != 2) {
            return false;
        }
        return !"audio/ac3".equals(c0912v.o);
    }

    private boolean K0(C0912v c0912v, int i) {
        return C0(d0.l0(i, c0912v.G, c0912v.H));
    }

    private boolean L0(String str) {
        if (ax.P2.b.i()) {
            return FfmpegLibrary.e(str);
        }
        if (ax.P2.b.a() == 1) {
            return com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary.g(str);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.N0
    public int A() {
        return 8;
    }

    @Override // ax.a1.H
    protected int D0(C0912v c0912v) {
        String str = (String) C0968a.e(c0912v.o);
        if (!ax.P2.b.b() || !D.o(str)) {
            return 0;
        }
        if (!L0(str)) {
            return 1;
        }
        if (K0(c0912v, 2) || K0(c0912v, 4)) {
            return c0912v.P != 0 ? 2 : 4;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.a1.H
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public ax.W0.a m0(C0912v c0912v, ax.V0.b bVar) throws ax.W0.b {
        N.a("createFfmpegAudioDecoder");
        int i = c0912v.p;
        int i2 = i != -1 ? i : 5760;
        ax.W0.a ffmpegAudioDecoder = ax.P2.b.i() ? new FfmpegAudioDecoder(c0912v, 16, 16, i2, J0(c0912v)) : new com.google.android.exoplayer2.ext.ffmpeg.a(ax.P2.b.f(), c0912v, 16, 16, i2, J0(c0912v), V0);
        N.b();
        return ffmpegAudioDecoder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.a1.H
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public C0912v r0(ax.W0.a aVar) {
        C0968a.e(aVar);
        int y = aVar.y();
        int G0 = G0();
        if (G0 > 0 && y > G0) {
            y = G0;
        }
        return new C0912v.b().y0("audio/raw").T(y).z0(aVar.A()).s0(aVar.z()).P();
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "FfmpegAudioRenderer";
    }

    public b(Handler handler, InterfaceC1309z interfaceC1309z, o... oVarArr) {
        this(handler, interfaceC1309z, new C1288f0.g().m(oVarArr).k());
    }

    public b(Handler handler, InterfaceC1309z interfaceC1309z, InterfaceC1276B interfaceC1276B) {
        super(handler, interfaceC1309z, interfaceC1276B);
    }
}

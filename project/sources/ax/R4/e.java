package ax.R4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import ax.P0.A;
import ax.P0.C;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0915y;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.I;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P4.i;
import ax.P4.k;
import ax.R4.f;
import com.example.android.uamp.MusicService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements f, AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener {
    private static final String B0 = ax.S4.b.f(e.class);
    public static int C0;
    private final WifiManager.WifiLock d0;
    private int e0;
    private boolean f0;
    private f.a g0;
    private final ax.Q4.b h0;
    private volatile boolean i0;
    private volatile int j0;
    private volatile int k0;
    private volatile String l0;
    private volatile String m0;
    private MediaSessionCompat.QueueItem n0;
    private final Context q;
    private final AudioManager q0;
    private d s0;
    private boolean u0;
    private int v0;
    private androidx.media.a w0;
    private boolean z0;
    private boolean c0 = true;
    private volatile float o0 = 1.0f;
    private int p0 = 0;
    private boolean r0 = false;
    private final Set<String> t0 = new HashSet();
    private final IntentFilter x0 = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private final BroadcastReceiver y0 = new a();
    H.d A0 = new b();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                ax.S4.b.a(e.B0, "Headphones disconnected.");
                if (e.this.n()) {
                    Intent intent2 = new Intent(context, (Class<?>) MusicService.class);
                    intent2.setAction("com.example.android.uamp.ACTION_CMD");
                    intent2.putExtra("CMD_NAME", "CMD_PAUSE");
                    try {
                        k.d(e.this.q, intent2);
                    } catch (IllegalStateException e) {
                        ax.Ha.c.i(e.this.q).f().b("AUDIO NOISY").l(e).h();
                    }
                }
            }
        }
    }

    class b implements H.d {
        b() {
        }

        private void G(String str) {
            if (str == null) {
                if (e.this.g0 != null) {
                    e.this.g0.b(e.this.q.getString(i.b), true, 0, null);
                }
            } else if (e.this.g0 != null) {
                if (!e.this.u0 && ax.P2.b.d(str)) {
                    ax.P2.a.n(e.this.q);
                    if (ax.P2.b.g() && ax.P2.b.c(str)) {
                        e.this.u0 = true;
                        e.this.s0.z();
                        e.this.s0.o();
                        return;
                    }
                }
                e.this.g0.b(e.this.q.getString(i.c, str), true, 4005, str);
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void D(int i) {
            I.r(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void E(boolean z) {
            I.k(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void F(int i) {
            I.v(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void H(V v) {
            I.E(this, v);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void I(boolean z) {
            I.i(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void J(F f) {
            I.t(this, f);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void L(float f) {
            I.G(this, f);
        }

        @Override // ax.P0.H.d
        public void N(F f) {
            ax.S4.b.c(e.B0, "Media player error: what=" + f.q + ", " + f.a());
            if (f.q == 1004) {
                if (e.this.T()) {
                    return;
                }
                String a = e.this.s0.a();
                if ("audio/flac".equals(a) && e.this.R(a)) {
                    return;
                }
            }
            if (e.this.g0 != null) {
                e.this.g0.b(e.this.q.getString(i.a, f.a()), false, 0, null);
            }
        }

        @Override // ax.P0.H.d
        public void O(int i) {
            if (i != 3) {
                if (i == 4) {
                    ax.S4.b.a(e.B0, "onCompletion from ExoPlayer");
                    e.this.e(0);
                    if (e.this.g0 != null) {
                        e.this.g0.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!e.this.s0.g()) {
                G(e.this.s0.a());
                return;
            }
            if (e.this.s0.l() || !e.this.S()) {
                String c = e.this.s0.c();
                long e = e.this.s0.e();
                if (e.this.g0 != null && !TextUtils.isEmpty(c) && e != -9223372036854775807L && e > 0) {
                    e.this.g0.a(c, e);
                }
                e.this.r0 = true;
                if (!e.this.z0) {
                    e.this.G();
                    return;
                }
                e.this.z0 = false;
                ax.S4.b.a(e.B0, "onSeekComplete from MediaPlayer:", Integer.valueOf(e.this.s0.d()));
                e eVar = e.this;
                eVar.j0 = eVar.s0.d();
                if (e.this.e0 == 6) {
                    e.this.s0.n();
                    e.this.e0 = 3;
                    e.this.O();
                }
                if (e.this.g0 != null) {
                    e.this.g0.d(e.this.e0);
                }
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void P(N n, int i) {
            I.C(this, n, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void S(boolean z) {
            I.z(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void U(T t) {
            I.D(this, t);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void W(H.b bVar) {
            I.c(this, bVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Y(int i, boolean z) {
            I.g(this, i, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Z(boolean z, int i) {
            I.u(this, z, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a(a0 a0Var) {
            I.F(this, a0Var);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a0(C0915y c0915y, int i) {
            I.l(this, c0915y, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void b0() {
            I.x(this);
        }

        @Override // ax.P0.H.d
        public void c(int i) {
            e.this.F(i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c0(H h, H.c cVar) {
            I.h(this, h, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void e(boolean z) {
            I.A(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void i0(boolean z, int i) {
            I.o(this, z, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j(G g) {
            I.p(this, g);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j0(A a) {
            I.m(this, a);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void k0(C0905n c0905n) {
            I.f(this, c0905n);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void o0(int i, int i2) {
            I.B(this, i, i2);
        }

        @Override // ax.P0.H.d
        public void p0(H.e eVar, H.e eVar2, int i) {
            if (i == 1) {
                e.this.z0 = true;
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r(C c) {
            I.n(this, c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r0(C0894c c0894c) {
            I.a(this, c0894c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void s(ax.R0.c cVar) {
            I.d(this, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t(List list) {
            I.e(this, list);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t0(boolean z) {
            I.j(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void v(int i) {
            I.y(this, i);
        }
    }

    public e(Context context, ax.Q4.b bVar) {
        this.q = context;
        this.h0 = bVar;
        this.q0 = (AudioManager) context.getSystemService("audio");
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            this.d0 = wifiManager.createWifiLock(3, "uAmp_lock");
        } else {
            this.d0 = null;
        }
        this.e0 = 0;
        this.s0 = new d(context, true ^ this.c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i) {
        C0 = i;
        try {
            Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
            intent.putExtra("android.media.extra.PACKAGE_NAME", this.q.getPackageName());
            intent.putExtra("android.media.extra.AUDIO_SESSION", i);
            this.q.sendBroadcast(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        String str = B0;
        ax.S4.b.a(str, "configMediaPlayerState. mAudioFocus=", Integer.valueOf(this.p0));
        int i = this.p0;
        if (i != 0) {
            if (i == 1) {
                if (this.s0.i()) {
                    this.s0.x(0.2f);
                }
            } else if (this.s0.i()) {
                this.s0.x(1.0f);
            }
            if (this.f0 && this.r0) {
                if (this.s0.i()) {
                    if (!this.s0.k()) {
                        ax.S4.b.a(str, "configMediaPlayerState startMediaPlayer. seeking to ", Integer.valueOf(this.j0));
                        if (this.j0 == this.s0.d()) {
                            this.s0.n();
                            this.e0 = 3;
                            O();
                        } else {
                            this.s0.r(this.j0);
                            this.e0 = 6;
                        }
                    } else if (this.e0 != 3) {
                        ax.S4.b.c(str, "configMediaPlayerState already playing : but state is not applied");
                        this.e0 = 3;
                    }
                }
                this.f0 = false;
            }
        } else if (this.e0 == 3) {
            boolean z = this.f0;
            N(false, !z, !z);
        }
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.d(this.e0);
        }
    }

    private void H() {
        ax.S4.b.a(B0, "createMediaPlayerIfNeeded. needed? ", Boolean.valueOf(!this.s0.i()));
        if (this.s0.i()) {
            this.s0.q();
            return;
        }
        this.s0.h();
        this.s0.y(true);
        this.s0.v(this, this.A0);
        if (this.s0.j()) {
            F(this.s0.b());
        }
    }

    public static int J() {
        return C0;
    }

    private void K() {
        ax.S4.b.a(B0, "giveUpAudioFocus");
        if (this.p0 == 2) {
            androidx.media.a aVar = this.w0;
            if (aVar != null) {
                androidx.media.b.a(this.q0, aVar);
            }
            this.p0 = 0;
        }
    }

    private boolean L(Uri uri) {
        String scheme = uri.getScheme();
        return "file".equals(scheme) || "content".equals(scheme);
    }

    private void M(String str) {
        this.f0 = false;
        this.r0 = false;
        this.e0 = 1;
        V();
        K();
        Q(true);
        if (this.g0 != null) {
            this.g0.b(this.q.getString(i.a, str), true, 0, null);
        }
    }

    private void N(boolean z, boolean z2, boolean z3) {
        if (z3) {
            this.f0 = false;
        }
        if (this.e0 == 3) {
            if (this.s0.i() && this.s0.k()) {
                this.s0.m();
                this.j0 = this.s0.d();
            }
            Q(false);
            if (z) {
                K();
            }
        }
        this.e0 = 2;
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.d(2);
        }
        if (z2) {
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (!this.s0.i() || this.o0 == this.s0.f()) {
            return;
        }
        g(this.o0);
    }

    private void P() {
        if (this.i0) {
            return;
        }
        this.q.registerReceiver(this.y0, this.x0);
        this.i0 = true;
    }

    private void Q(boolean z) {
        ax.S4.b.a(B0, "relaxResources. releaseMediaPlayer=", Boolean.valueOf(z));
        if (z && this.s0.i()) {
            try {
                int b2 = this.s0.b();
                if (b2 != 0) {
                    Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
                    intent.putExtra("android.media.extra.AUDIO_SESSION", b2);
                    intent.putExtra("android.media.extra.PACKAGE_NAME", this.q.getPackageName());
                    this.q.sendBroadcast(intent);
                }
            } catch (Exception unused) {
            }
            this.s0.q();
            this.s0.p();
            C0 = 0;
            this.r0 = false;
        }
        WifiManager.WifiLock wifiLock = this.d0;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.d0.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R(String str) {
        if (this.u0 || !ax.P2.b.d(str)) {
            return false;
        }
        if (ax.P2.b.e(str, ax.P2.a.c(this.q))) {
            ax.P2.a.n(this.q);
            if (ax.P2.b.g() && ax.P2.b.c(str)) {
                this.s0.u();
                int max = Math.max(0, this.s0.d());
                Q(true);
                this.j0 = max;
                b(this.n0);
                this.u0 = true;
                return true;
            }
        }
        String string = this.q.getString(i.c, str);
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.b(string, true, 4005, str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        String c = this.s0.c();
        if (TextUtils.isEmpty(c)) {
            c = this.m0;
        }
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        this.t0.add(c);
        if (this.s0.i()) {
            this.j0 = Math.max(0, this.s0.d());
        }
        MediaSessionCompat.QueueItem queueItem = this.n0;
        if (queueItem == null) {
            return false;
        }
        b(queueItem);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        if (this.v0 < 5 && this.s0.i() && !this.s0.j() && this.s0.l()) {
            int max = Math.max(0, this.s0.d()) + 200;
            long e = this.s0.e();
            if (e != -9223372036854775807L && e > 0 && max >= e) {
                return false;
            }
            boolean z = this.e0 == 3 || this.f0;
            this.v0++;
            this.r0 = false;
            this.z0 = false;
            this.j0 = max;
            int i = z ? 6 : 2;
            this.e0 = i;
            f.a aVar = this.g0;
            if (aVar != null) {
                aVar.d(i);
            }
            try {
                this.s0.z();
                this.s0.o();
                this.s0.r(max);
                if (z) {
                    this.s0.n();
                }
                return true;
            } catch (IllegalStateException e2) {
                ax.S4.b.b(B0, e2, "Decoder error seek retry failed");
            }
        }
        return false;
    }

    private boolean U() {
        ax.S4.b.a(B0, "tryToGetAudioFocus");
        if (this.p0 == 2) {
            return true;
        }
        if (this.w0 == null) {
            this.w0 = new a.b(1).g(false).c(new AudioAttributesCompat.a().b(2).c(1).a()).e(this).a();
        }
        if (androidx.media.b.b(this.q0, this.w0) != 1) {
            return this.p0 == 1;
        }
        this.p0 = 2;
        return true;
    }

    private void V() {
        if (this.i0) {
            try {
                this.q.unregisterReceiver(this.y0);
            } catch (IllegalArgumentException unused) {
            }
            this.i0 = false;
        }
    }

    private void W(String str) {
        boolean X = X(str);
        if (this.s0.j() != X) {
            Q(true);
            this.s0 = new d(this.q, X);
        }
    }

    private boolean X(String str) {
        return !this.c0 || this.t0.contains(str);
    }

    public void I() {
        Q(true);
    }

    @Override // ax.R4.f
    public boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // ax.R4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.support.v4.media.session.MediaSessionCompat.QueueItem r9) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.R4.e.b(android.support.v4.media.session.MediaSessionCompat$QueueItem):void");
    }

    @Override // ax.R4.f
    public void c(boolean z) {
        f.a aVar;
        this.e0 = 1;
        if (z && (aVar = this.g0) != null) {
            aVar.d(1);
        }
        this.j0 = j();
        K();
        V();
        Q(true);
    }

    @Override // ax.R4.f
    public void d(String str, int i) {
        this.j0 = i;
        this.k0 = i;
        this.l0 = str;
    }

    @Override // ax.R4.f
    public void e(int i) {
        f.a aVar;
        ax.S4.b.a(B0, "seekTo called with ", Integer.valueOf(i));
        if (!this.s0.i()) {
            this.j0 = i;
            return;
        }
        int i2 = this.e0;
        if (this.s0.k()) {
            this.e0 = 6;
        }
        this.s0.r(i);
        int i3 = this.e0;
        if (i2 == i3 || (aVar = this.g0) == null) {
            return;
        }
        aVar.d(i3);
    }

    @Override // ax.R4.f
    public void f() {
        N(true, true, true);
    }

    @Override // ax.R4.f
    public void g(float f) {
        if (this.s0.j() && Build.VERSION.SDK_INT < 23) {
            this.o0 = 1.0f;
            return;
        }
        this.o0 = f;
        if (this.s0.i()) {
            if (!this.s0.j()) {
                this.s0.w(f);
            } else if (this.s0.k()) {
                this.s0.w(f);
            }
        }
    }

    @Override // ax.R4.f
    public int getState() {
        return this.e0;
    }

    @Override // ax.R4.f
    public void h(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            Q(true);
            this.s0 = new d(this.q, true ^ this.c0);
        }
    }

    @Override // ax.R4.f
    public String i() {
        return this.m0;
    }

    @Override // ax.R4.f
    public int j() {
        return this.s0.i() ? this.s0.d() : this.j0;
    }

    @Override // ax.R4.f
    public void k(int i) {
        this.j0 = i;
    }

    @Override // ax.R4.f
    public void l(f.a aVar) {
        this.g0 = aVar;
    }

    @Override // ax.R4.f
    public boolean n() {
        if (this.f0) {
            return true;
        }
        return this.s0.i() && this.s0.k();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        String str = B0;
        ax.S4.b.a(str, "onAudioFocusChange. focusChange=", Integer.valueOf(i));
        if (i == 1) {
            this.p0 = 2;
        } else if (i == -1 || i == -2 || i == -3) {
            this.p0 = i == -3 ? 1 : 0;
            if (i == -1) {
                this.f0 = false;
            } else if (this.e0 == 3 && i == -2) {
                this.f0 = true;
            }
        } else {
            ax.S4.b.c(str, "onAudioFocusChange: Ignoring unsupported focusChange: ", Integer.valueOf(i));
        }
        G();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        ax.S4.b.a(B0, "onCompletion from MediaPlayer");
        e(0);
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ax.S4.b.c(B0, "Media player error: what=" + i + ", extra=" + i2);
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.b("MediaPlayer error " + i + " (" + i2 + ")", false, 0, null);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        ax.S4.b.a(B0, "onPrepared from MediaPlayer");
        this.r0 = true;
        G();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        ax.S4.b.a(B0, "onSeekComplete from MediaPlayer:", Integer.valueOf(mediaPlayer.getCurrentPosition()));
        this.j0 = mediaPlayer.getCurrentPosition();
        if (this.e0 == 6) {
            this.s0.n();
            this.e0 = 3;
            O();
        }
        f.a aVar = this.g0;
        if (aVar != null) {
            aVar.d(this.e0);
        }
    }
}

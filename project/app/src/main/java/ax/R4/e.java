/*
 * Decompiled with CFR 0.152.
 */
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
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.media.AudioAttributesCompat;
import androidx.media.a;
import ax.P0.A;
import ax.P0.C;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.I;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.n;
import ax.P0.y;
import ax.P4.i;
import ax.P4.k;
import ax.Q4.b;
import ax.R0.c;
import ax.R4.d;
import ax.R4.f;
import com.example.android.uamp.MusicService;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class e
implements f,
AudioManager.OnAudioFocusChangeListener,
MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnPreparedListener,
MediaPlayer.OnSeekCompleteListener {
    private static final String B0 = ax.S4.b.f(e.class);
    public static int C0;
    H.d A0;
    private boolean c0 = true;
    private final WifiManager.WifiLock d0;
    private int e0;
    private boolean f0;
    private f.a g0;
    private final b h0;
    private volatile boolean i0;
    private volatile int j0;
    private volatile int k0;
    private volatile String l0;
    private volatile String m0;
    private MediaSessionCompat.QueueItem n0;
    private volatile float o0 = 1.0f;
    private int p0 = 0;
    private final Context q;
    private final AudioManager q0;
    private boolean r0 = false;
    private d s0;
    private final Set<String> t0 = new HashSet<String>();
    private boolean u0;
    private int v0;
    private a w0;
    private final IntentFilter x0 = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private final BroadcastReceiver y0 = new BroadcastReceiver(this){
        final e a;
        {
            this.a = e8;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                ax.S4.b.a(B0, "Headphones disconnected.");
                if (this.a.n()) {
                    context = new Intent(context, MusicService.class);
                    context.setAction("com.example.android.uamp.ACTION_CMD");
                    context.putExtra("CMD_NAME", "CMD_PAUSE");
                    try {
                        k.d(this.a.q, (Intent)context);
                        return;
                    }
                    catch (IllegalStateException illegalStateException) {
                        ax.Ha.c.i(this.a.q).f().b("AUDIO NOISY").l(illegalStateException).h();
                    }
                }
            }
        }
    };
    private boolean z0;

    public e(Context context, b b8) {
        this.A0 = new H.d(this){
            final e a;
            {
                this.a = e8;
            }

            private void G(String string) {
                if (string != null) {
                    if (this.a.g0 != null) {
                        if (!this.a.u0 && ax.P2.b.d(string)) {
                            ax.P2.a.n(this.a.q);
                            if (ax.P2.b.g() && ax.P2.b.c(string)) {
                                e.C(this.a, true);
                                this.a.s0.z();
                                this.a.s0.o();
                                return;
                            }
                        }
                        String string2 = this.a.q.getString(i.c, new Object[]{string});
                        this.a.g0.b(string2, true, 4005, string);
                        return;
                    }
                } else if (this.a.g0 != null) {
                    string = this.a.q.getString(i.b);
                    this.a.g0.b(string, true, 0, null);
                }
            }

            @Override
            public /* synthetic */ void D(int n8) {
                I.r(this, n8);
            }

            @Override
            public /* synthetic */ void E(boolean bl) {
                I.k(this, bl);
            }

            @Override
            public /* synthetic */ void F(int n8) {
                I.v(this, n8);
            }

            @Override
            public /* synthetic */ void H(V v8) {
                I.E(this, v8);
            }

            @Override
            public /* synthetic */ void I(boolean bl) {
                I.i(this, bl);
            }

            @Override
            public /* synthetic */ void J(F f8) {
                I.t(this, f8);
            }

            @Override
            public /* synthetic */ void L(float f8) {
                I.G(this, f8);
            }

            @Override
            public void N(F object) {
                String string = B0;
                CharSequence charSequence = new StringBuilder();
                charSequence.append("Media player error: what=");
                charSequence.append(((F)object).q);
                charSequence.append(", ");
                charSequence.append(((F)object).a());
                ax.S4.b.c(string, charSequence.toString());
                if (!(((F)object).q == 1004 && (this.a.T() || "audio/flac".equals(charSequence = this.a.s0.a()) && this.a.R((String)charSequence)) || this.a.g0 == null)) {
                    object = this.a.q.getString(i.a, new Object[]{((F)object).a()});
                    this.a.g0.b((String)object, false, 0, null);
                }
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void O(int n8) {
                if (n8 == 3) {
                    if (!this.a.s0.g()) {
                        this.G(this.a.s0.a());
                        return;
                    }
                    if (!this.a.s0.l() && this.a.S()) return;
                    Object object = this.a.s0.c();
                    long l8 = this.a.s0.e();
                    if (this.a.g0 != null && !TextUtils.isEmpty((CharSequence)object) && l8 != -9223372036854775807L && l8 > 0L) {
                        this.a.g0.a((String)object, l8);
                    }
                    e.E(this.a, true);
                    if (this.a.z0) {
                        e.q(this.a, false);
                        ax.S4.b.a(B0, "onSeekComplete from MediaPlayer:", this.a.s0.d());
                        object = this.a;
                        e.r((e)object, ((e)object).s0.d());
                        if (this.a.e0 == 6) {
                            this.a.s0.n();
                            e.t(this.a, 3);
                            this.a.O();
                        }
                        if (this.a.g0 == null) return;
                        this.a.g0.d(this.a.e0);
                        return;
                    }
                    this.a.G();
                    return;
                }
                if (n8 != 4) return;
                ax.S4.b.a(B0, "onCompletion from ExoPlayer");
                this.a.e(0);
                if (this.a.g0 == null) return;
                this.a.g0.c();
            }

            @Override
            public /* synthetic */ void P(N n8, int n9) {
                I.C(this, n8, n9);
            }

            @Override
            public /* synthetic */ void S(boolean bl) {
                I.z(this, bl);
            }

            @Override
            public /* synthetic */ void U(T t8) {
                I.D(this, t8);
            }

            @Override
            public /* synthetic */ void W(H.b b8) {
                I.c(this, b8);
            }

            @Override
            public /* synthetic */ void Y(int n8, boolean bl) {
                I.g(this, n8, bl);
            }

            @Override
            public /* synthetic */ void Z(boolean bl, int n8) {
                I.u(this, bl, n8);
            }

            @Override
            public /* synthetic */ void a(a0 a02) {
                I.F(this, a02);
            }

            @Override
            public /* synthetic */ void a0(y y8, int n8) {
                I.l(this, y8, n8);
            }

            @Override
            public /* synthetic */ void b0() {
                I.x(this);
            }

            @Override
            public void c(int n8) {
                this.a.F(n8);
            }

            @Override
            public /* synthetic */ void c0(H h8, H.c c8) {
                I.h(this, h8, c8);
            }

            @Override
            public /* synthetic */ void e(boolean bl) {
                I.A(this, bl);
            }

            @Override
            public /* synthetic */ void i0(boolean bl, int n8) {
                I.o(this, bl, n8);
            }

            @Override
            public /* synthetic */ void j(G g8) {
                I.p(this, g8);
            }

            @Override
            public /* synthetic */ void j0(A a8) {
                I.m(this, a8);
            }

            @Override
            public /* synthetic */ void k0(n n8) {
                I.f(this, n8);
            }

            @Override
            public /* synthetic */ void o0(int n8, int n9) {
                I.B(this, n8, n9);
            }

            @Override
            public void p0(H.e e8, H.e e9, int n8) {
                if (n8 == 1) {
                    e.q(this.a, true);
                }
            }

            @Override
            public /* synthetic */ void r(C c8) {
                I.n(this, c8);
            }

            @Override
            public /* synthetic */ void r0(ax.P0.c c8) {
                I.a(this, c8);
            }

            @Override
            public /* synthetic */ void s(c c8) {
                I.d(this, c8);
            }

            public /* synthetic */ void t(List list) {
                I.e(this, list);
            }

            @Override
            public /* synthetic */ void t0(boolean bl) {
                I.j(this, bl);
            }

            @Override
            public /* synthetic */ void v(int n8) {
                I.y(this, n8);
            }
        };
        this.q = context;
        this.h0 = b8;
        this.q0 = (AudioManager)context.getSystemService("audio");
        b8 = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        this.d0 = b8 != null ? b8.createWifiLock(3, "uAmp_lock") : null;
        this.e0 = 0;
        this.s0 = new d(context, true ^ this.c0);
    }

    static /* synthetic */ boolean C(e e8, boolean bl) {
        e8.u0 = bl;
        return bl;
    }

    static /* synthetic */ boolean E(e e8, boolean bl) {
        e8.r0 = bl;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void F(int n8) {
        C0 = n8;
        try {
            Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
            intent.putExtra("android.media.extra.PACKAGE_NAME", this.q.getPackageName());
            intent.putExtra("android.media.extra.AUDIO_SESSION", n8);
            this.q.sendBroadcast(intent);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void G() {
        Object object = B0;
        ax.S4.b.a((String)object, "configMediaPlayerState. mAudioFocus=", this.p0);
        int n8 = this.p0;
        if (n8 == 0) {
            if (this.e0 == 3) {
                boolean bl = this.f0;
                this.N(false, bl ^ true, bl ^ true);
            }
        } else {
            if (n8 == 1) {
                if (this.s0.i()) {
                    this.s0.x(0.2f);
                }
            } else if (this.s0.i()) {
                this.s0.x(1.0f);
            }
            if (this.f0 && this.r0) {
                if (this.s0.i()) {
                    if (!this.s0.k()) {
                        ax.S4.b.a((String)object, "configMediaPlayerState startMediaPlayer. seeking to ", this.j0);
                        if (this.j0 == this.s0.d()) {
                            this.s0.n();
                            this.e0 = 3;
                            this.O();
                        } else {
                            this.s0.r(this.j0);
                            this.e0 = 6;
                        }
                    } else if (this.e0 != 3) {
                        ax.S4.b.c((String)object, "configMediaPlayerState already playing : but state is not applied");
                        this.e0 = 3;
                    }
                }
                this.f0 = false;
            }
        }
        if ((object = this.g0) != null) {
            object.d(this.e0);
        }
    }

    private void H() {
        ax.S4.b.a(B0, "createMediaPlayerIfNeeded. needed? ", this.s0.i() ^ true);
        if (!this.s0.i()) {
            this.s0.h();
            this.s0.y(true);
            this.s0.v(this, this.A0);
            if (this.s0.j()) {
                this.F(this.s0.b());
            }
            return;
        }
        this.s0.q();
    }

    public static int J() {
        return C0;
    }

    private void K() {
        ax.S4.b.a(B0, "giveUpAudioFocus");
        if (this.p0 == 2) {
            a a8 = this.w0;
            if (a8 != null) {
                androidx.media.b.a(this.q0, a8);
            }
            this.p0 = 0;
        }
    }

    private boolean L(Uri object) {
        return "file".equals(object = object.getScheme()) || "content".equals(object);
        {
        }
    }

    private void M(String string) {
        this.f0 = false;
        this.r0 = false;
        this.e0 = 1;
        this.V();
        this.K();
        this.Q(true);
        if (this.g0 != null) {
            string = this.q.getString(i.a, new Object[]{string});
            this.g0.b(string, true, 0, null);
        }
    }

    private void N(boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            this.f0 = false;
        }
        if (this.e0 == 3) {
            if (this.s0.i() && this.s0.k()) {
                this.s0.m();
                this.j0 = this.s0.d();
            }
            this.Q(false);
            if (bl) {
                this.K();
            }
        }
        this.e0 = 2;
        f.a a8 = this.g0;
        if (a8 != null) {
            a8.d(2);
        }
        if (bl2) {
            this.V();
        }
    }

    private void O() {
        if (this.s0.i() && this.o0 != this.s0.f()) {
            this.g(this.o0);
        }
    }

    private void P() {
        if (!this.i0) {
            this.q.registerReceiver(this.y0, this.x0);
            this.i0 = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Q(boolean bl) {
        WifiManager.WifiLock wifiLock;
        ax.S4.b.a(B0, "relaxResources. releaseMediaPlayer=", bl);
        if (bl && this.s0.i()) {
            try {
                int n8 = this.s0.b();
                if (n8 != 0) {
                    wifiLock = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
                    wifiLock.putExtra("android.media.extra.AUDIO_SESSION", n8);
                    wifiLock.putExtra("android.media.extra.PACKAGE_NAME", this.q.getPackageName());
                    this.q.sendBroadcast((Intent)wifiLock);
                }
            }
            catch (Exception exception) {}
            this.s0.q();
            this.s0.p();
            C0 = 0;
            this.r0 = false;
        }
        if ((wifiLock = this.d0) != null && wifiLock.isHeld()) {
            this.d0.release();
        }
    }

    private boolean R(String string) {
        if (!this.u0 && ax.P2.b.d(string)) {
            if (ax.P2.b.e(string, ax.P2.a.c(this.q))) {
                ax.P2.a.n(this.q);
                if (ax.P2.b.g() && ax.P2.b.c(string)) {
                    this.s0.u();
                    int n8 = Math.max(0, this.s0.d());
                    this.Q(true);
                    this.j0 = n8;
                    this.b(this.n0);
                    this.u0 = true;
                    return true;
                }
            }
            String string2 = this.q.getString(i.c, new Object[]{string});
            f.a a8 = this.g0;
            if (a8 != null) {
                a8.b(string2, true, 4005, string);
            }
            return true;
        }
        return false;
    }

    private boolean S() {
        String string = this.s0.c();
        Object object = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            object = this.m0;
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            return false;
        }
        this.t0.add((String)object);
        if (this.s0.i()) {
            this.j0 = Math.max(0, this.s0.d());
        }
        if ((object = this.n0) == null) {
            return false;
        }
        this.b((MediaSessionCompat.QueueItem)object);
        return true;
    }

    private boolean T() {
        if (this.v0 < 5 && this.s0.i() && !this.s0.j() && this.s0.l()) {
            IllegalStateException illegalStateException2;
            block7: {
                block6: {
                    int n8 = Math.max(0, this.s0.d()) + 200;
                    long l8 = this.s0.e();
                    if (l8 != -9223372036854775807L && l8 > 0L && (long)n8 >= l8) {
                        return false;
                    }
                    boolean bl = this.e0 == 3 || this.f0;
                    ++this.v0;
                    this.r0 = false;
                    this.z0 = false;
                    this.j0 = n8;
                    int n9 = bl ? 6 : 2;
                    this.e0 = n9;
                    f.a a8 = this.g0;
                    if (a8 != null) {
                        a8.d(n9);
                    }
                    try {
                        this.s0.z();
                        this.s0.o();
                        this.s0.r(n8);
                        if (!bl) break block6;
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block7;
                    }
                    this.s0.n();
                }
                return true;
            }
            ax.S4.b.b(B0, illegalStateException2, "Decoder error seek retry failed");
        }
        return false;
    }

    private boolean U() {
        ax.S4.b.a(B0, "tryToGetAudioFocus");
        if (this.p0 != 2) {
            if (this.w0 == null) {
                AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat.a().b(2).c(1).a();
                this.w0 = new a.b(1).g(false).c(audioAttributesCompat).e(this).a();
            }
            if (androidx.media.b.b(this.q0, this.w0) == 1) {
                this.p0 = 2;
                return true;
            }
            return this.p0 == 1;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void V() {
        if (this.i0) {
            try {
                this.q.unregisterReceiver(this.y0);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            this.i0 = false;
        }
    }

    private void W(String string) {
        boolean bl = this.X(string);
        if (this.s0.j() != bl) {
            this.Q(true);
            this.s0 = new d(this.q, bl);
        }
    }

    private boolean X(String string) {
        return !this.c0 || this.t0.contains(string);
        {
        }
    }

    static /* synthetic */ boolean q(e e8, boolean bl) {
        e8.z0 = bl;
        return bl;
    }

    static /* synthetic */ int r(e e8, int n8) {
        e8.j0 = n8;
        return n8;
    }

    static /* synthetic */ int t(e e8, int n8) {
        e8.e0 = n8;
        return n8;
    }

    public void I() {
        this.Q(true);
    }

    @Override
    public boolean a() {
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(MediaSessionCompat.QueueItem object) {
        Throwable var1_6;
        Object object2;
        block18: {
            IllegalArgumentException illegalArgumentException2;
            block17: {
                NullPointerException nullPointerException2;
                block16: {
                    block15: {
                        object2 = object != null && ((MediaSessionCompat.QueueItem)object).c() != null ? ((MediaSessionCompat.QueueItem)object).c().f() : null;
                        if (TextUtils.isEmpty(object2)) {
                            this.M("Invalid media item");
                            return;
                        }
                        Object object3 = ax.S4.c.b((String)object2);
                        if ((object3 = this.h0.e((String)object3)) == null) {
                            this.M("Missing media metadata");
                            return;
                        }
                        if (TextUtils.isEmpty((CharSequence)(object3 = ((MediaMetadataCompat)object3).i("__SOURCE__")))) {
                            this.M("Missing media source");
                            return;
                        }
                        this.n0 = object;
                        this.f0 = true;
                        if (!this.U()) {
                            this.M("Audio focus request failed");
                            return;
                        }
                        this.P();
                        boolean bl = TextUtils.equals((CharSequence)object2, (CharSequence)this.m0);
                        if (!bl) {
                            this.j0 = this.k0 != 0 && object2 != null && ((String)object2).equals(this.l0) ? this.k0 : 0;
                            this.k0 = 0;
                            this.l0 = null;
                            this.m0 = object2;
                        }
                        this.W((String)object2);
                        if (bl && this.s0.i()) {
                            if (this.e0 == 3 && this.s0.k()) {
                                this.f0 = false;
                                return;
                            }
                            if (this.e0 == 6) {
                                return;
                            }
                        }
                        if (this.e0 == 2 && bl && this.s0.i()) {
                            this.G();
                            return;
                        }
                        this.e0 = 1;
                        this.Q(false);
                        try {
                            this.H();
                            this.e0 = 6;
                            this.s0.s();
                            object = Uri.parse((String)object3);
                            this.s0.t((String)object2, (Uri)object);
                            this.r0 = false;
                            this.u0 = false;
                            this.v0 = 0;
                            this.s0.o();
                            if (this.L((Uri)object) || (object = this.d0) == null) break block15;
                            object.acquire();
                        }
                        catch (NullPointerException nullPointerException2) {
                            break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            break block17;
                        }
                        catch (SecurityException securityException) {
                            break block18;
                        }
                        catch (IllegalStateException illegalStateException) {
                            break block18;
                        }
                        catch (IOException iOException) {
                            break block18;
                        }
                    }
                    if ((object = this.g0) == null) return;
                    object.d(this.e0);
                    return;
                }
                ax.Ha.c.i(this.q).f().b("MEDIA PLAYER ERROR").l(nullPointerException2).h();
                object = this.g0;
                if (object == null) return;
                object.b(((Throwable)nullPointerException2).getMessage(), true, 0, null);
                return;
            }
            ax.Ha.c.i(this.q).f().d("MEDIA PLAYER ILLEGAL ARGUMENT ERROR").l(illegalArgumentException2).h();
            object2 = this.g0;
            if (object2 == null) return;
            object2.b(illegalArgumentException2.getMessage(), true, 0, null);
            return;
        }
        ax.S4.b.b(B0, (Throwable)var1_6, "Exception playing song");
        object2 = this.g0;
        if (object2 == null) return;
        object2.b(var1_6.getMessage(), true, 0, null);
    }

    @Override
    public void c(boolean bl) {
        f.a a8;
        this.e0 = 1;
        if (bl && (a8 = this.g0) != null) {
            a8.d(1);
        }
        this.j0 = this.j();
        this.K();
        this.V();
        this.Q(true);
    }

    @Override
    public void d(String string, int n8) {
        this.j0 = n8;
        this.k0 = n8;
        this.l0 = string;
    }

    @Override
    public void e(int n8) {
        f.a a8;
        ax.S4.b.a(B0, "seekTo called with ", n8);
        if (!this.s0.i()) {
            this.j0 = n8;
            return;
        }
        int n9 = this.e0;
        if (this.s0.k()) {
            this.e0 = 6;
        }
        this.s0.r(n8);
        n8 = this.e0;
        if (n9 != n8 && (a8 = this.g0) != null) {
            a8.d(n8);
        }
    }

    @Override
    public void f() {
        this.N(true, true, true);
    }

    @Override
    public void g(float f8) {
        if (this.s0.j() && Build.VERSION.SDK_INT < 23) {
            this.o0 = 1.0f;
            return;
        }
        this.o0 = f8;
        if (this.s0.i()) {
            if (!this.s0.j()) {
                this.s0.w(f8);
                return;
            }
            if (this.s0.k()) {
                this.s0.w(f8);
            }
        }
    }

    @Override
    public int getState() {
        return this.e0;
    }

    @Override
    public void h(boolean bl) {
        if (this.c0 != bl) {
            this.c0 = bl;
            this.Q(true);
            this.s0 = new d(this.q, true ^ this.c0);
        }
    }

    @Override
    public String i() {
        return this.m0;
    }

    @Override
    public int j() {
        if (this.s0.i()) {
            return this.s0.d();
        }
        return this.j0;
    }

    @Override
    public void k(int n8) {
        this.j0 = n8;
    }

    @Override
    public void l(f.a a8) {
        this.g0 = a8;
    }

    @Override
    public boolean n() {
        return this.f0 || this.s0.i() && this.s0.k();
        {
        }
    }

    public void onAudioFocusChange(int n8) {
        String string = B0;
        ax.S4.b.a(string, "onAudioFocusChange. focusChange=", n8);
        if (n8 == 1) {
            this.p0 = 2;
        } else if (n8 != -1 && n8 != -2 && n8 != -3) {
            ax.S4.b.c(string, "onAudioFocusChange: Ignoring unsupported focusChange: ", n8);
        } else {
            int n9 = n8 == -3 ? 1 : 0;
            this.p0 = n9;
            if (n8 == -1) {
                this.f0 = false;
            } else if (this.e0 == 3 && n8 == -2) {
                this.f0 = true;
            }
        }
        this.G();
    }

    public void onCompletion(MediaPlayer object) {
        ax.S4.b.a(B0, "onCompletion from MediaPlayer");
        this.e(0);
        object = this.g0;
        if (object != null) {
            object.c();
        }
    }

    public boolean onError(MediaPlayer object, int n8, int n9) {
        object = B0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Media player error: what=");
        stringBuilder.append(n8);
        stringBuilder.append(", extra=");
        stringBuilder.append(n9);
        ax.S4.b.c((String)object, stringBuilder.toString());
        object = this.g0;
        if (object != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("MediaPlayer error ");
            stringBuilder.append(n8);
            stringBuilder.append(" (");
            stringBuilder.append(n9);
            stringBuilder.append(")");
            object.b(stringBuilder.toString(), false, 0, null);
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        ax.S4.b.a(B0, "onPrepared from MediaPlayer");
        this.r0 = true;
        this.G();
    }

    public void onSeekComplete(MediaPlayer object) {
        ax.S4.b.a(B0, "onSeekComplete from MediaPlayer:", object.getCurrentPosition());
        this.j0 = object.getCurrentPosition();
        if (this.e0 == 6) {
            this.s0.n();
            this.e0 = 3;
            this.O();
        }
        if ((object = this.g0) != null) {
            object.d(this.e0);
        }
    }
}


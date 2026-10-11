package ax.R4;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import androidx.media3.exoplayer.ExoPlayer;
import ax.P0.C0894c;
import ax.P0.C0915y;
import ax.P0.H;
import ax.P0.V;
import ax.Y0.C1178d;
import ax.i1.r;
import ax.q1.C2854n;
import ax.r7.j0;
import java.io.IOException;

/* loaded from: classes.dex */
public class d {
    private Context a;
    private boolean b;
    private MediaPlayer c;
    private ExoPlayer d;
    private boolean e;

    public d(Context context, boolean z) {
        this.b = z;
        this.a = context;
    }

    public String a() {
        if (this.b) {
            return "audio";
        }
        j0<V.a> it = this.d.X().a().iterator();
        String str = null;
        while (it.hasNext()) {
            V.a next = it.next();
            if (next.d() == 1 && next.a > 0) {
                str = next.b(0).o;
            }
        }
        return str;
    }

    public int b() {
        return this.b ? this.c.getAudioSessionId() : this.d.b();
    }

    String c() {
        C0915y y;
        if (this.b || (y = this.d.y()) == null) {
            return null;
        }
        return y.a;
    }

    public int d() {
        return this.b ? this.c.getCurrentPosition() : (int) this.d.s0();
    }

    public long e() {
        return this.b ? this.c.getDuration() : this.d.g0();
    }

    public float f() {
        PlaybackParams playbackParams;
        float speed;
        if (!this.b) {
            return this.d.h().a;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 1.0f;
        }
        try {
            playbackParams = this.c.getPlaybackParams();
            speed = playbackParams.getSpeed();
            return speed;
        } catch (IllegalStateException unused) {
            return 1.0f;
        }
    }

    public boolean g() {
        if (this.b) {
            return true;
        }
        j0<V.a> it = this.d.X().a().iterator();
        while (it.hasNext()) {
            V.a next = it.next();
            if (next.d() == 1 && next.g()) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        if (this.b) {
            try {
                this.c = new MediaPlayer();
                return;
            } catch (NullPointerException e) {
                ax.Ha.c.i(this.a).d("MEDIA PLAYER CREATE INSTANCE ERROR").l(e).h();
                throw new IllegalStateException(e);
            }
        }
        C1178d c1178d = new C1178d(this.a);
        if (this.e) {
            c1178d.p(2);
        } else {
            c1178d.p(1);
        }
        c1178d.o(true);
        this.d = new ExoPlayer.b(this.a, c1178d).j(new r(this.a, new C2854n().m(true))).h();
    }

    public boolean i() {
        return this.b ? this.c != null : this.d != null;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        return this.b ? this.c.isPlaying() : this.d.n();
    }

    public boolean l() {
        if (this.b) {
            return true;
        }
        return this.d.W();
    }

    public void m() {
        if (this.b) {
            this.c.pause();
        } else {
            this.d.f();
        }
    }

    public void n() {
        if (this.b) {
            this.c.start();
        } else {
            this.d.m();
        }
    }

    public void o() {
        if (this.b) {
            this.c.prepareAsync();
        } else {
            this.d.k();
        }
    }

    public void p() {
        try {
            if (this.b) {
                this.c.release();
            } else {
                this.d.d();
            }
        } catch (IllegalArgumentException unused) {
        }
        if (this.b) {
            this.c = null;
        } else {
            this.d = null;
        }
    }

    public void q() {
        if (this.b) {
            this.c.reset();
            return;
        }
        this.d.S(false);
        this.d.stop();
        this.d.x();
    }

    public void r(int i) {
        if (this.b) {
            this.c.seekTo(i);
        } else {
            this.d.t(i);
        }
    }

    public void s() {
        if (!this.b) {
            this.d.G(new C0894c.e().c(1).b(2).a(), false);
            return;
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1).setContentType(2);
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setHapticChannelsMuted(false);
        }
        this.c.setAudioAttributes(builder.build());
    }

    public void t(String str, Uri uri) throws IOException {
        if (this.b) {
            this.c.setDataSource(this.a, uri);
        } else {
            this.d.U(new C0915y.c().f(uri).c(str).a());
        }
    }

    public void u() {
        this.e = true;
    }

    public void v(e eVar, H.d dVar) {
        if (!this.b) {
            this.d.N(dVar);
            return;
        }
        this.c.setOnPreparedListener(eVar);
        this.c.setOnCompletionListener(eVar);
        this.c.setOnErrorListener(eVar);
        this.c.setOnSeekCompleteListener(eVar);
    }

    public void w(float f) {
        PlaybackParams playbackParams;
        PlaybackParams speed;
        if (!this.b) {
            this.d.g(f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                MediaPlayer mediaPlayer = this.c;
                playbackParams = mediaPlayer.getPlaybackParams();
                speed = playbackParams.setSpeed(f);
                mediaPlayer.setPlaybackParams(speed);
            } catch (IllegalArgumentException | IllegalStateException unused) {
            }
        }
    }

    public void x(float f) {
        if (this.b) {
            this.c.setVolume(f, f);
        } else {
            this.d.l(f);
        }
    }

    public void y(boolean z) {
        if (this.b) {
            this.c.setWakeMode(this.a.getApplicationContext(), 1);
        } else if (z) {
            this.d.a(1);
        } else {
            this.d.a(2);
        }
    }

    public void z() {
        if (this.b) {
            this.c.stop();
        } else {
            this.d.stop();
        }
    }
}

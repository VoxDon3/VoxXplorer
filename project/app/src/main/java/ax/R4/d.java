/*
 * Decompiled with CFR 0.152.
 */
package ax.R4;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import androidx.media3.exoplayer.ExoPlayer;
import ax.P0.H;
import ax.P0.V;
import ax.P0.c;
import ax.P0.y;
import ax.R4.a;
import ax.R4.b;
import ax.R4.c;
import ax.R4.e;
import ax.a1.O;
import ax.a1.Y;
import ax.i1.F;
import ax.i1.r;
import ax.q1.n;
import ax.q1.x;
import ax.r7.j0;
import java.io.IOException;

public class d {
    private Context a;
    private boolean b;
    private MediaPlayer c;
    private ExoPlayer d;
    private boolean e;

    public d(Context context, boolean bl) {
        this.b = bl;
        this.a = context;
    }

    public String a() {
        if (this.b) {
            return "audio";
        }
        j0<V.a> j02 = this.d.X().a().n();
        String string = null;
        while (j02.hasNext()) {
            V.a a8 = (V.a)j02.next();
            if (a8.d() != 1 || a8.a <= 0) continue;
            string = a8.b((int)0).o;
        }
        return string;
    }

    public int b() {
        if (this.b) {
            return this.c.getAudioSessionId();
        }
        return this.d.b();
    }

    String c() {
        if (this.b) {
            return null;
        }
        y y8 = this.d.y();
        if (y8 != null) {
            return y8.a;
        }
        return null;
    }

    public int d() {
        if (this.b) {
            return this.c.getCurrentPosition();
        }
        return (int)this.d.s0();
    }

    public long e() {
        if (this.b) {
            return this.c.getDuration();
        }
        return this.d.g0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float f() {
        if (!this.b) return this.d.h().a;
        if (Build.VERSION.SDK_INT < 23) return 1.0f;
        try {
            return O.a(ax.R4.a.a(this.c));
        }
        catch (IllegalStateException illegalStateException) {
            return 1.0f;
        }
    }

    public boolean g() {
        if (this.b) {
            return true;
        }
        j0<V.a> j02 = this.d.X().a().n();
        while (j02.hasNext()) {
            V.a a8 = (V.a)j02.next();
            if (a8.d() != 1 || !a8.g()) continue;
            return true;
        }
        return false;
    }

    public void h() {
        if (this.b) {
            try {
                MediaPlayer mediaPlayer;
                this.c = mediaPlayer = new MediaPlayer();
                return;
            }
            catch (NullPointerException nullPointerException) {
                ax.Ha.c.i(this.a).d("MEDIA PLAYER CREATE INSTANCE ERROR").l(nullPointerException).h();
                throw new IllegalStateException(nullPointerException);
            }
        }
        ax.Y0.d d8 = new ax.Y0.d(this.a);
        if (this.e) {
            d8.p(2);
        } else {
            d8.p(1);
        }
        d8.o(true);
        Object object = new n().m(true);
        object = new r(this.a, (x)object);
        this.d = new ExoPlayer.b(this.a, d8).j((F.a)object).h();
    }

    public boolean i() {
        if (this.b) {
            return this.c != null;
        }
        return this.d != null;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        if (this.b) {
            return this.c.isPlaying();
        }
        return this.d.n();
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
            return;
        }
        this.d.f();
    }

    public void n() {
        if (this.b) {
            this.c.start();
            return;
        }
        this.d.m();
    }

    public void o() {
        if (this.b) {
            this.c.prepareAsync();
            return;
        }
        this.d.k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p() {
        block4: {
            try {
                if (this.b) {
                    this.c.release();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            break block4;
            this.d.d();
        }
        if (this.b) {
            this.c = null;
            return;
        }
        this.d = null;
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

    public void r(int n8) {
        if (this.b) {
            this.c.seekTo(n8);
            return;
        }
        this.d.t(n8);
    }

    public void s() {
        if (this.b) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(1).setContentType(2);
            if (Build.VERSION.SDK_INT >= 29) {
                ax.R4.b.a(builder, false);
            }
            this.c.setAudioAttributes(builder.build());
            return;
        }
        ax.P0.c c8 = new c.e().c(1).b(2).a();
        this.d.G(c8, false);
    }

    public void t(String object, Uri uri) throws IOException {
        if (this.b) {
            this.c.setDataSource(this.a, uri);
            return;
        }
        object = new y.c().f(uri).c((String)object).a();
        this.d.U((y)object);
    }

    public void u() {
        this.e = true;
    }

    public void v(e e8, H.d d8) {
        if (this.b) {
            this.c.setOnPreparedListener((MediaPlayer.OnPreparedListener)e8);
            this.c.setOnCompletionListener((MediaPlayer.OnCompletionListener)e8);
            this.c.setOnErrorListener((MediaPlayer.OnErrorListener)e8);
            this.c.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener)e8);
            return;
        }
        this.d.N(d8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void w(float f8) {
        if (!this.b) {
            this.d.g(f8);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) return;
        try {
            MediaPlayer mediaPlayer = this.c;
            ax.R4.c.a(mediaPlayer, Y.a(ax.R4.a.a(mediaPlayer), f8));
            return;
        }
        catch (IllegalArgumentException | IllegalStateException runtimeException) {
            return;
        }
    }

    public void x(float f8) {
        if (this.b) {
            this.c.setVolume(f8, f8);
            return;
        }
        this.d.l(f8);
    }

    public void y(boolean bl) {
        if (this.b) {
            this.c.setWakeMode(this.a.getApplicationContext(), 1);
            return;
        }
        if (bl) {
            this.d.a(1);
            return;
        }
        this.d.a(2);
    }

    public void z() {
        if (this.b) {
            this.c.stop();
            return;
        }
        this.d.stop();
    }
}


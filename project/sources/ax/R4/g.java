package ax.R4;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import ax.R4.f;

/* loaded from: classes.dex */
public class g implements f.a {
    private static final String o = ax.S4.b.f(g.class);
    private ax.Q4.b a;
    private h b;
    private Resources c;
    private f d;
    private c e;
    private String g;
    private int h;
    private int i;
    private boolean k;
    private boolean m;
    private float j = 1.0f;
    Handler l = new Handler(Looper.getMainLooper());
    private Runnable n = new a();
    private b f = new b(this, null);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.K();
            g.this.m = false;
        }
    }

    private class b extends MediaSessionCompat.b {
        private b() {
        }

        private void E(Uri uri, Bundle bundle) {
            int i;
            ax.Q4.c cVar = new ax.Q4.c();
            String a = cVar.a(uri, bundle);
            g.this.a.o(cVar);
            g.this.k = cVar.d();
            g.this.g = ax.S4.c.a(a, new String[0]);
            if (bundle != null) {
                i = bundle.getInt("PLAY_RESUME_POSITION", -1);
                g.this.d.h(bundle.getInt("PLAYER_ENGINE") != 1);
            } else {
                i = -1;
            }
            if (i != -1) {
                g.this.d.d(g.this.g, i);
            }
            g.this.b.u(g.this.g);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void A() {
            g.this.L();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void B(long j) {
            if (g.this.b.n()) {
                return;
            }
            ax.S4.b.a(g.o, "OnSkipToQueueItem:" + j);
            g.this.b.s(j);
            g.this.z();
            g.this.b.y();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void C() {
            ax.S4.b.a(g.o, "stop. current state=" + g.this.d.getState());
            g.this.A(null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(String str, Bundle bundle) {
            String f;
            if (!"com.example.android.uamp.THUMBS_UP".equals(str)) {
                ax.S4.b.c(g.o, "Unsupported action: ", str);
                return;
            }
            ax.S4.b.d(g.o, "onCustomAction: favorite for current track");
            MediaSessionCompat.QueueItem i = g.this.b.i();
            if (i != null && (f = i.c().f()) != null) {
                String b = ax.S4.c.b(f);
                g.this.a.r(b, true ^ g.this.a.k(b));
            }
            g.this.N(null, 0, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h() {
            ax.S4.b.a(g.o, "pause. current state=" + g.this.d.getState());
            g.this.y();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i() {
            ax.S4.b.a(g.o, "play");
            if (g.this.b.i() != null) {
                g.this.z();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(String str, Bundle bundle) {
            if (g.this.b.n()) {
                return;
            }
            ax.S4.b.a(g.o, "playFromMediaId mediaId:", str, "  extras=", bundle);
            g.this.b.v(str);
            g.this.z();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void l(Uri uri, Bundle bundle) {
            E(uri, bundle);
            g.this.z();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void p(Uri uri, Bundle bundle) {
            E(uri, bundle);
            g.this.N(null, 0, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(long j) {
            ax.S4.b.a(g.o, "onSeekTo:", Long.valueOf(j));
            g.this.d.e((int) j);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void u(float f) {
            g.this.G(f);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void x(int i) {
            g.this.H(i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void y(int i) {
            g.this.I(i);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void z() {
            g.this.J();
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }
    }

    public interface c {
        void a(f fVar, boolean z);

        void b() throws ax.S4.a;

        void c(PlaybackStateCompat playbackStateCompat);

        void d();

        void e(f fVar, String str, boolean z, boolean z2);

        void g(float f);

        void j(int i);

        void p(int i);
    }

    public g(c cVar, Resources resources, ax.Q4.b bVar, h hVar, f fVar) {
        this.a = bVar;
        this.e = cVar;
        this.c = resources;
        this.b = hVar;
        this.d = fVar;
        fVar.l(this);
    }

    private boolean D() {
        String str = this.g;
        return str != null && str.equals(this.b.h());
    }

    private void E() {
        this.l.postDelayed(this.n, 1000L);
        this.m = true;
    }

    private void F(PlaybackStateCompat.d dVar) {
        MediaSessionCompat.QueueItem i = this.b.i();
        if (i == null) {
            return;
        }
        i.c().f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f) {
        this.j = f;
        N(null, 0, null);
        this.d.g(f);
        this.e.g(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i) {
        this.i = i;
        this.e.j(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i) {
        this.h = i;
        this.b.w(i);
        this.e.p(i);
        this.g = this.b.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.b.n()) {
            return;
        }
        ax.S4.b.a(o, "skipToNext");
        if (this.b.x(1)) {
            z();
        } else {
            A("Cannot skip");
        }
        this.b.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        J();
        if (this.i == 0 && D()) {
            M(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.b.n()) {
            return;
        }
        int g = this.b.g();
        if (this.b.x(-1)) {
            if (g == this.b.g()) {
                this.d.e(0);
            }
            z();
        } else {
            A("Cannot skip");
        }
        this.b.y();
    }

    private void M(boolean z) {
        A(null);
        if (z) {
            this.b.p();
        }
    }

    private void s() {
        if (this.m) {
            this.l.removeCallbacks(this.n);
            this.m = false;
        }
    }

    private long t() {
        return this.d.n() ? 2362678L : 2362677L;
    }

    public void A(String str) {
        s();
        ax.S4.b.a(o, "handleStopRequest: mState=" + this.d.getState() + " error=", str);
        this.d.c(true);
        this.e.a(this.d, false);
        if (str != null) {
            N(str, 0, null);
        }
    }

    public boolean B() {
        return this.k;
    }

    public void C(int i, int i2) {
        H(i2);
        I(i);
    }

    public void N(String str, int i, String str2) {
        int i2;
        ax.S4.b.a(o, "updatePlaybackState, playback state=" + this.d.getState());
        f fVar = this.d;
        long j = (fVar == null || !fVar.a()) ? -1L : this.d.j();
        PlaybackStateCompat.d b2 = new PlaybackStateCompat.d().b(t());
        F(b2);
        int state = this.d.getState();
        if (str != null) {
            b2.d(str);
            if (i != 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("SUB_ERROR_CODE", i);
                bundle.putString("SUB_ERROR_MSG", str2);
                b2.e(bundle);
            }
            i2 = 7;
        } else {
            i2 = state;
        }
        b2.f(i2, j, this.j, SystemClock.elapsedRealtime());
        MediaSessionCompat.QueueItem i3 = this.b.i();
        if (i3 != null) {
            b2.c(i3.d());
        }
        this.e.c(b2.a());
        if (i2 == 3 || i2 == 2) {
            try {
                this.e.b();
            } catch (ax.S4.a unused) {
                if (i2 == 3) {
                    y();
                }
            }
        }
    }

    @Override // ax.R4.f.a
    public void a(String str, long j) {
        this.b.z(str, j);
    }

    @Override // ax.R4.f.a
    public void b(String str, boolean z, int i, String str2) {
        boolean z2;
        N(str, i, str2);
        if (z) {
            if (D()) {
                z2 = true;
                this.e.e(this.d, str, z, z2);
            }
            E();
        }
        z2 = false;
        this.e.e(this.d, str, z, z2);
    }

    @Override // ax.R4.f.a
    public void c() {
        int i = this.i;
        if (i == 1) {
            this.d.k(0);
            z();
            this.b.y();
        } else {
            if (i == 3) {
                M(true);
                return;
            }
            if (!this.b.x(1)) {
                A(null);
                return;
            }
            if (this.i == 0 && D()) {
                M(true);
            } else {
                if (D()) {
                    this.d.k(0);
                }
                z();
            }
            this.b.y();
        }
    }

    @Override // ax.R4.f.a
    public void d(int i) {
        N(null, 0, null);
    }

    public int u() {
        return this.b.f();
    }

    public int v() {
        return this.b.j();
    }

    public MediaSessionCompat.b w() {
        return this.f;
    }

    public f x() {
        return this.d;
    }

    public void y() {
        s();
        ax.S4.b.a(o, "handlePauseRequest: mState=" + this.d.getState());
        if (this.d.n()) {
            this.d.f();
            this.e.a(this.d, true);
        }
    }

    public void z() {
        s();
        ax.S4.b.a(o, "handlePlayRequest: mState=" + this.d.getState());
        MediaSessionCompat.QueueItem i = this.b.i();
        if (i != null) {
            this.e.d();
            this.d.b(i);
        }
    }
}

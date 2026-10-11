/*
 * Decompiled with CFR 0.152.
 */
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
import ax.R4.h;
import ax.S4.a;

public class g
implements f.a {
    private static final String o = ax.S4.b.f(g.class);
    private ax.Q4.b a;
    private h b;
    private Resources c;
    private f d;
    private c e;
    private b f;
    private String g;
    private int h;
    private int i;
    private float j = 1.0f;
    private boolean k;
    Handler l = new Handler(Looper.getMainLooper());
    private boolean m;
    private Runnable n = new Runnable(this){
        final g q;
        {
            this.q = g8;
        }

        @Override
        public void run() {
            this.q.K();
            ax.R4.g.g(this.q, false);
        }
    };

    public g(c c8, Resources resources, ax.Q4.b b8, h h8, f f8) {
        this.a = b8;
        this.e = c8;
        this.c = resources;
        this.b = h8;
        this.f = new b(this);
        this.d = f8;
        f8.l(this);
    }

    private boolean D() {
        String string = this.g;
        return string != null && string.equals(this.b.h());
    }

    private void E() {
        this.l.postDelayed(this.n, 1000L);
        this.m = true;
    }

    private void F(PlaybackStateCompat.d object) {
        object = this.b.i();
        if (object == null) {
            return;
        }
        ((MediaSessionCompat.QueueItem)object).c().f();
    }

    private void G(float f8) {
        this.j = f8;
        this.N(null, 0, null);
        this.d.g(f8);
        this.e.g(f8);
    }

    private void H(int n8) {
        this.i = n8;
        this.e.j(n8);
    }

    private void I(int n8) {
        this.h = n8;
        this.b.w(n8);
        this.e.p(n8);
        this.g = this.b.h();
    }

    private void J() {
        if (this.b.n()) {
            return;
        }
        ax.S4.b.a(o, "skipToNext");
        if (this.b.x(1)) {
            this.z();
        } else {
            this.A("Cannot skip");
        }
        this.b.y();
    }

    private void K() {
        this.J();
        if (this.i == 0 && this.D()) {
            this.M(false);
        }
    }

    private void L() {
        if (this.b.n()) {
            return;
        }
        int n8 = this.b.g();
        if (this.b.x(-1)) {
            if (n8 == this.b.g()) {
                this.d.e(0);
            }
            this.z();
        } else {
            this.A("Cannot skip");
        }
        this.b.y();
    }

    private void M(boolean bl) {
        this.A(null);
        if (bl) {
            this.b.p();
        }
    }

    static /* synthetic */ boolean g(g g8, boolean bl) {
        g8.m = bl;
        return bl;
    }

    static /* synthetic */ boolean o(g g8, boolean bl) {
        g8.k = bl;
        return bl;
    }

    static /* synthetic */ String q(g g8, String string) {
        g8.g = string;
        return string;
    }

    private void s() {
        if (this.m) {
            this.l.removeCallbacks(this.n);
            this.m = false;
        }
    }

    private long t() {
        if (this.d.n()) {
            return 2362678L;
        }
        return 2362677L;
    }

    public void A(String string) {
        this.s();
        String string2 = o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleStopRequest: mState=");
        stringBuilder.append(this.d.getState());
        stringBuilder.append(" error=");
        ax.S4.b.a(string2, stringBuilder.toString(), string);
        this.d.c(true);
        this.e.a(this.d, false);
        if (string != null) {
            this.N(string, 0, null);
        }
    }

    public boolean B() {
        return this.k;
    }

    public void C(int n8, int n9) {
        this.H(n9);
        this.I(n8);
    }

    public void N(String object, int n8, String string) {
        block7: {
            Object object2 = o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("updatePlaybackState, playback state=");
            stringBuilder.append(this.d.getState());
            ax.S4.b.a((String)object2, stringBuilder.toString());
            object2 = this.d;
            long l8 = object2 != null && object2.a() ? (long)this.d.j() : -1L;
            object2 = new PlaybackStateCompat.d().b(this.t());
            this.F((PlaybackStateCompat.d)object2);
            int n9 = this.d.getState();
            if (object != null) {
                ((PlaybackStateCompat.d)object2).d((CharSequence)object);
                if (n8 != 0) {
                    object = new Bundle();
                    object.putInt("SUB_ERROR_CODE", n8);
                    object.putString("SUB_ERROR_MSG", string);
                    ((PlaybackStateCompat.d)object2).e((Bundle)object);
                }
                n8 = 7;
            } else {
                n8 = n9;
            }
            ((PlaybackStateCompat.d)object2).f(n8, l8, this.j, SystemClock.elapsedRealtime());
            object = this.b.i();
            if (object != null) {
                ((PlaybackStateCompat.d)object2).c(((MediaSessionCompat.QueueItem)object).d());
            }
            this.e.c(((PlaybackStateCompat.d)object2).a());
            if (n8 == 3 || n8 == 2) {
                try {
                    this.e.b();
                    return;
                }
                catch (a a8) {
                    if (n8 != 3) break block7;
                    this.y();
                }
            }
        }
    }

    @Override
    public void a(String string, long l8) {
        this.b.z(string, l8);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void b(String var1_1, boolean var2_2, int var3_3, String var4_4) {
        this.N(var1_1, var3_3, var4_4);
        if (!var2_2) ** GOTO lbl7
        if (this.D()) {
            var5_5 = true;
        } else {
            this.E();
lbl7:
            // 2 sources

            var5_5 = false;
        }
        this.e.e(this.d, var1_1, var2_2, var5_5);
    }

    @Override
    public void c() {
        int n8 = this.i;
        if (n8 == 1) {
            this.d.k(0);
            this.z();
            this.b.y();
            return;
        }
        if (n8 == 3) {
            this.M(true);
            return;
        }
        if (this.b.x(1)) {
            if (this.i == 0 && this.D()) {
                this.M(true);
            } else {
                if (this.D()) {
                    this.d.k(0);
                }
                this.z();
            }
            this.b.y();
            return;
        }
        this.A(null);
    }

    @Override
    public void d(int n8) {
        this.N(null, 0, null);
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
        this.s();
        String string = o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handlePauseRequest: mState=");
        stringBuilder.append(this.d.getState());
        ax.S4.b.a(string, stringBuilder.toString());
        if (this.d.n()) {
            this.d.f();
            this.e.a(this.d, true);
        }
    }

    public void z() {
        this.s();
        Object object = o;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handlePlayRequest: mState=");
        stringBuilder.append(this.d.getState());
        ax.S4.b.a((String)object, stringBuilder.toString());
        object = this.b.i();
        if (object != null) {
            this.e.d();
            this.d.b((MediaSessionCompat.QueueItem)object);
        }
    }

    private class b
    extends MediaSessionCompat.b {
        final g f;

        private b(g g8) {
            this.f = g8;
        }

        private void E(Uri object, Bundle bundle) {
            int n8;
            Object object2 = new ax.Q4.c();
            object = ((ax.Q4.c)object2).a((Uri)object, bundle);
            this.f.a.o((ax.Q4.c)object2);
            ax.R4.g.o(this.f, ((ax.Q4.c)object2).d());
            object2 = this.f;
            boolean bl = false;
            ax.R4.g.q((g)object2, ax.S4.c.a((String)object, new String[0]));
            if (bundle != null) {
                n8 = bundle.getInt("PLAY_RESUME_POSITION", -1);
                object = this.f.d;
                if (bundle.getInt("PLAYER_ENGINE") != 1) {
                    bl = true;
                }
                object.h(bl);
            } else {
                n8 = -1;
            }
            if (n8 != -1) {
                this.f.d.d(this.f.g, n8);
            }
            this.f.b.u(this.f.g);
        }

        @Override
        public void A() {
            this.f.L();
        }

        @Override
        public void B(long l8) {
            if (this.f.b.n()) {
                return;
            }
            String string = o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnSkipToQueueItem:");
            stringBuilder.append(l8);
            ax.S4.b.a(string, stringBuilder.toString());
            this.f.b.s(l8);
            this.f.z();
            this.f.b.y();
        }

        @Override
        public void C() {
            String string = o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("stop. current state=");
            stringBuilder.append(this.f.d.getState());
            ax.S4.b.a(string, stringBuilder.toString());
            this.f.A(null);
        }

        @Override
        public void e(String object, Bundle bundle) {
            if ("com.example.android.uamp.THUMBS_UP".equals(object)) {
                ax.S4.b.d(o, "onCustomAction: favorite for current track");
                object = this.f.b.i();
                if (object != null && (object = ((MediaSessionCompat.QueueItem)object).c().f()) != null) {
                    object = ax.S4.c.b((String)object);
                    this.f.a.r((String)object, true ^ this.f.a.k((String)object));
                }
                this.f.N(null, 0, null);
                return;
            }
            ax.S4.b.c(o, "Unsupported action: ", object);
        }

        @Override
        public void h() {
            String string = o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("pause. current state=");
            stringBuilder.append(this.f.d.getState());
            ax.S4.b.a(string, stringBuilder.toString());
            this.f.y();
        }

        @Override
        public void i() {
            ax.S4.b.a(o, "play");
            if (this.f.b.i() != null) {
                this.f.z();
            }
        }

        @Override
        public void j(String string, Bundle bundle) {
            if (this.f.b.n()) {
                return;
            }
            ax.S4.b.a(o, "playFromMediaId mediaId:", string, "  extras=", bundle);
            this.f.b.v(string);
            this.f.z();
        }

        @Override
        public void l(Uri uri, Bundle bundle) {
            this.E(uri, bundle);
            this.f.z();
        }

        @Override
        public void p(Uri uri, Bundle bundle) {
            this.E(uri, bundle);
            this.f.N(null, 0, null);
        }

        @Override
        public void s(long l8) {
            ax.S4.b.a(o, "onSeekTo:", l8);
            this.f.d.e((int)l8);
        }

        @Override
        public void u(float f8) {
            this.f.G(f8);
        }

        @Override
        public void x(int n8) {
            this.f.H(n8);
        }

        @Override
        public void y(int n8) {
            this.f.I(n8);
        }

        @Override
        public void z() {
            this.f.J();
        }
    }

    public static interface c {
        public void a(f var1, boolean var2);

        public void b() throws a;

        public void c(PlaybackStateCompat var1);

        public void d();

        public void e(f var1, String var2, boolean var3, boolean var4);

        public void g(float var1);

        public void j(int var1);

        public void p(int var1);
    }
}


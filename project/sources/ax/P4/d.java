package ax.P4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import ax.P.l;
import ax.P.p;
import ax.P4.a;
import com.example.android.uamp.MusicService;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class d extends BroadcastReceiver {
    private static final String s = ax.S4.b.f(d.class);
    private final MusicService a;
    private MediaSessionCompat.Token b;
    private MediaControllerCompat c;
    private MediaControllerCompat.e d;
    private PlaybackStateCompat e;
    private MediaMetadataCompat f;
    private final p g;
    private PendingIntent h;
    private PendingIntent i;
    private PendingIntent j;
    private PendingIntent k;
    private PendingIntent l;
    private PendingIntent m;
    private PendingIntent n;
    private boolean o;
    private boolean p = false;
    private boolean q = false;
    private final MediaControllerCompat.a r = new a();

    class a extends MediaControllerCompat.a {
        a() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            d.this.f = mediaMetadataCompat;
            ax.S4.b.a(d.s, "Received new metadata ", mediaMetadataCompat);
            Notification j = d.this.j(true);
            if (j != null) {
                try {
                    d.this.g.f(412, j);
                } catch (RuntimeException unused) {
                    d.this.g.f(412, d.this.j(false));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void e(PlaybackStateCompat playbackStateCompat) {
            d.this.e = playbackStateCompat;
            ax.S4.b.a(d.s, "Received new playback state", playbackStateCompat);
            if (playbackStateCompat == null) {
                return;
            }
            if (playbackStateCompat.j() == 1) {
                d.this.u();
                return;
            }
            if (playbackStateCompat.j() == 7) {
                if (ax.P4.b.a()) {
                    return;
                }
                d.this.u();
            } else if (playbackStateCompat.j() == 0) {
                if (ax.P4.b.a()) {
                    return;
                }
                d.this.u();
            } else {
                Notification j = d.this.j(true);
                if (j != null) {
                    try {
                        d.this.g.f(412, j);
                    } catch (RuntimeException unused) {
                        d.this.g.f(412, d.this.j(false));
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void i() {
            super.i();
            ax.S4.b.a(d.s, "Session was destroyed, resetting to the new session token");
            try {
                d.this.v();
            } catch (RemoteException e) {
                ax.S4.b.b(d.s, e, "could not connect media controller");
            }
        }
    }

    class b extends a.AbstractC0170a {
        final /* synthetic */ l.d a;

        b(l.d dVar) {
            this.a = dVar;
        }

        @Override // ax.P4.a.AbstractC0170a
        public void c(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            if (d.this.f == null || d.this.f.e().d() == null || !d.this.f.e().d().toString().equals(str)) {
                return;
            }
            ax.S4.b.a(d.s, "fetchBitmapFromURLAsync: set bitmap to ", str);
            this.a.n(bitmap2);
            try {
                d.this.g.f(412, this.a.c());
            } catch (RuntimeException unused) {
            }
        }
    }

    public d(MusicService musicService) throws RemoteException {
        this.a = musicService;
        v();
        p d = p.d(musicService);
        this.g = d;
        try {
            d.b(412);
        } catch (SecurityException unused) {
        }
    }

    private void h(l.d dVar) {
        String string;
        int i;
        PendingIntent pendingIntent;
        ax.S4.b.a(s, "updatePlayPauseAction");
        PlaybackStateCompat playbackStateCompat = this.e;
        if (playbackStateCompat == null || playbackStateCompat.j() != 3) {
            string = this.a.getString(i.g);
            i = h.e;
            pendingIntent = this.i;
        } else {
            string = this.a.getString(i.f);
            i = h.d;
            pendingIntent = this.h;
        }
        dVar.b(new l.a(i, string, pendingIntent));
    }

    private PendingIntent i(MediaDescriptionCompat mediaDescriptionCompat, String str) {
        Intent intent = new Intent("com.example.android.uamp.open_ui");
        intent.setPackage(this.a.getPackageName());
        intent.setFlags(536870912);
        intent.putExtra("com.example.android.uamp.EXTRA_START_FULLSCREEN", true);
        if (str != null) {
            intent.putExtra("PLAY_FOLDER_URI", str);
        }
        return PendingIntent.getActivity(this.a, 100, intent, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Notification j(boolean z) {
        int i;
        String str;
        Bitmap bitmap;
        ax.S4.b.a(s, "updateNotificationMetadata. mMetadata=" + this.f);
        if (this.f != null && this.e != null) {
            n();
            l.d dVar = new l.d(this.a, "music_player");
            if ((this.e.b() & 16) != 0) {
                dVar.a(h.g, this.a.getString(i.h), this.j);
                i = 1;
            } else {
                i = 0;
            }
            PlaybackStateCompat playbackStateCompat = this.e;
            boolean z2 = playbackStateCompat != null && playbackStateCompat.j() == 3;
            h(dVar);
            int i2 = i + 1;
            if ((this.e.b() & 32) != 0) {
                dVar.a(h.f, this.a.getString(i.e), this.k);
                i2 = i + 2;
            }
            if (ax.P4.b.b() && (this.e.b() & 1) != 0) {
                dVar.a(h.h, this.a.getString(i.i), this.n);
                i2++;
            }
            try {
                MediaDescriptionCompat b2 = k.b(this.f);
                if (b2.d() != null) {
                    str = b2.d().toString();
                    bitmap = ax.P4.a.i().j(str);
                    if (bitmap == null) {
                        bitmap = BitmapFactory.decodeResource(this.a.getResources(), h.a);
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                    bitmap = null;
                }
                dVar.w(new ax.N0.c().k(true).h(this.m).j(i2 == 1 ? new int[]{0} : i2 == 2 ? new int[]{0, 1} : i2 == 3 ? new int[]{0, 1, 2} : null).i(this.b)).k(this.l).v(h.c).p(z2).u(true).t(false).q(true).z(1).y(true).h(i(b2, this.f.d().getString("__SOURCE_FOLDER__"))).j(b2.i()).i(b2.g());
                if (z) {
                    dVar.n(bitmap);
                }
                dVar.m(1);
                s(dVar);
                if (str != null) {
                    m(str, dVar);
                }
                return dVar.c();
            } catch (RuntimeException e) {
                ax.Ha.c.i(this.a).f().b("MEDIA NOTIFICATION ERROR").l(e).h();
            }
        }
        return null;
    }

    private Notification k() {
        String string = this.a.getString(i.j);
        l.d dVar = new l.d(this.a, "music_player");
        dVar.v(h.c).j(string).i(HttpUrl.FRAGMENT_ENCODE_SET).m(2);
        return dVar.c();
    }

    private void m(String str, l.d dVar) {
        ax.P4.a.i().f(this.a.getApplicationContext(), str, new b(dVar));
    }

    private void n() {
        if (this.o) {
            return;
        }
        int i = Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456;
        try {
            String packageName = this.a.getPackageName();
            this.h = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.pause").setPackage(packageName), i);
            this.i = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.play").setPackage(packageName), i);
            this.j = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.prev").setPackage(packageName), i);
            this.k = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.next").setPackage(packageName), i);
            this.l = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.delete").setPackage(packageName), i);
            this.m = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.cancel").setPackage(packageName), i);
            this.n = PendingIntent.getBroadcast(this.a, 100, new Intent("com.example.android.uamp.stop").setPackage(packageName), i);
            this.o = true;
        } catch (SecurityException unused) {
        }
    }

    private void q(Notification notification) {
        if (ax.P4.b.a()) {
            this.a.startForeground(412, notification, 2);
        } else {
            this.a.startForeground(412, notification);
        }
        this.q = true;
    }

    private void s(l.d dVar) {
        String str = s;
        ax.S4.b.a(str, "updateNotificationPlaybackState. mPlaybackState=" + this.e);
        PlaybackStateCompat playbackStateCompat = this.e;
        if (playbackStateCompat == null) {
            ax.S4.b.a(str, "updateNotificationPlaybackState. cancelling notification!");
            return;
        }
        if (playbackStateCompat.j() != 3 || this.e.i() < 0) {
            ax.S4.b.a(str, "updateNotificationPlaybackState. hiding playback position");
            dVar.A(0L).t(false).y(false);
        } else {
            ax.S4.b.a(str, "updateNotificationPlaybackState. updating playback position to ", Long.valueOf((System.currentTimeMillis() - this.e.i()) / 1000), " seconds");
            dVar.A(System.currentTimeMillis() - this.e.i()).t(true).y(true);
        }
        dVar.p(this.e.j() == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() throws RemoteException {
        MediaSessionCompat.Token i = this.a.i();
        MediaSessionCompat.Token token = this.b;
        if ((token != null || i == null) && (token == null || token.equals(i))) {
            return;
        }
        MediaControllerCompat mediaControllerCompat = this.c;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.m(this.r);
        }
        this.b = i;
        if (i != null) {
            MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.a, i);
            this.c = mediaControllerCompat2;
            this.d = mediaControllerCompat2.i();
            if (this.p) {
                this.c.j(this.r);
            }
        }
    }

    public void l() {
        if (!this.p) {
            q(k());
            return;
        }
        Notification j = j(true);
        if (j == null) {
            q(k());
            return;
        }
        try {
            q(j);
        } catch (RuntimeException unused) {
            q(j(false));
        }
    }

    public boolean o() {
        return this.q;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        String str;
        action = intent.getAction();
        str = s;
        ax.S4.b.a(str, "Received intent with action " + action);
        action.getClass();
        switch (action) {
            case "com.example.android.uamp.pause":
                this.d.a();
                break;
            case "com.example.android.uamp.next":
                this.d.i();
                break;
            case "com.example.android.uamp.play":
                this.d.b();
                break;
            case "com.example.android.uamp.prev":
                this.d.j();
                break;
            case "com.example.android.uamp.stop":
            case "com.example.android.uamp.cancel":
                this.d.k();
                break;
            case "com.example.android.uamp.delete":
                if (this.e != null) {
                    ax.S4.b.a(str, "Notification deleted : current state = " + this.e.j());
                    int j = this.e.j();
                    if (j != 2 && j != 7 && j != 0) {
                        if (j != 1) {
                            ax.S4.b.c(str, "Notification deleted in playing : current state = " + this.e.j());
                            break;
                        }
                    } else {
                        this.d.k();
                        break;
                    }
                }
                break;
            default:
                ax.S4.b.j(str, "Unknown intent ignored. Action=", action);
                break;
        }
    }

    public boolean p() {
        return this.p;
    }

    public void r(boolean z) {
        if (o()) {
            this.a.stopForeground(z);
            this.q = false;
        }
    }

    public void t() throws ax.S4.a {
        if (this.p) {
            if (o()) {
                return;
            }
            this.f = this.c.d();
            this.e = this.c.e();
            try {
                l();
                return;
            } catch (IllegalStateException e) {
                ax.Ha.c.i(this.a).f().b("MUSIC START NOTIFICATION ERROR").l(e).h();
                throw new ax.S4.a(e);
            }
        }
        this.f = this.c.d();
        this.e = this.c.e();
        Notification j = j(true);
        if (j != null) {
            this.c.j(this.r);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.example.android.uamp.next");
            intentFilter.addAction("com.example.android.uamp.pause");
            intentFilter.addAction("com.example.android.uamp.play");
            intentFilter.addAction("com.example.android.uamp.prev");
            intentFilter.addAction("com.example.android.uamp.delete");
            intentFilter.addAction("com.example.android.uamp.cancel");
            intentFilter.addAction("com.example.android.uamp.stop");
            ax.Q.b.i(this.a, this, intentFilter, 2);
            try {
                q(j);
            } catch (RuntimeException unused) {
                try {
                    q(j(false));
                } catch (RuntimeException e2) {
                    ax.Ha.c.h().f().b("media notification runtime error").l(e2).h();
                }
            }
            this.p = true;
        }
    }

    public void u() {
        if (this.p) {
            this.p = false;
            this.c.m(this.r);
            try {
                this.a.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            this.g.b(412);
        } catch (Exception unused2) {
        }
        try {
            r(true);
        } catch (Exception unused3) {
        }
    }
}

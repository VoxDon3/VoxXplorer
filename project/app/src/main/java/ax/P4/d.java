/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
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
import ax.P4.b;
import ax.P4.c;
import ax.P4.h;
import ax.P4.i;
import ax.P4.k;
import com.example.android.uamp.MusicService;

public class d
extends BroadcastReceiver {
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
    private final MediaControllerCompat.a r = new MediaControllerCompat.a(this){
        final d d;
        {
            this.d = d8;
        }

        @Override
        public void d(MediaMetadataCompat mediaMetadataCompat) {
            ax.P4.d.f(this.d, mediaMetadataCompat);
            ax.S4.b.a(s, "Received new metadata ", mediaMetadataCompat);
            mediaMetadataCompat = this.d.j(true);
            if (mediaMetadataCompat != null) {
                try {
                    this.d.g.f(412, (Notification)mediaMetadataCompat);
                    return;
                }
                catch (RuntimeException runtimeException) {
                    Notification notification = this.d.j(false);
                    this.d.g.f(412, notification);
                }
            }
        }

        @Override
        public void e(PlaybackStateCompat playbackStateCompat) {
            ax.P4.d.a(this.d, playbackStateCompat);
            ax.S4.b.a(s, "Received new playback state", playbackStateCompat);
            if (playbackStateCompat != null) {
                if (playbackStateCompat.j() == 1) {
                    this.d.u();
                    return;
                }
                if (playbackStateCompat.j() == 7) {
                    if (!ax.P4.b.a()) {
                        this.d.u();
                        return;
                    }
                } else if (playbackStateCompat.j() == 0) {
                    if (!ax.P4.b.a()) {
                        this.d.u();
                        return;
                    }
                } else {
                    playbackStateCompat = this.d.j(true);
                    if (playbackStateCompat != null) {
                        try {
                            this.d.g.f(412, (Notification)playbackStateCompat);
                            return;
                        }
                        catch (RuntimeException runtimeException) {
                            Notification notification = this.d.j(false);
                            this.d.g.f(412, notification);
                        }
                    }
                }
            }
        }

        @Override
        public void i() {
            super.i();
            ax.S4.b.a(s, "Session was destroyed, resetting to the new session token");
            try {
                this.d.v();
                return;
            }
            catch (RemoteException remoteException) {
                ax.S4.b.b(s, remoteException, "could not connect media controller");
                return;
            }
        }
    };

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public d(MusicService object) throws RemoteException {
        this.a = object;
        this.v();
        this.g = object = ax.P.p.d((Context)object);
        try {
            ((p)object).b(412);
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    static /* synthetic */ PlaybackStateCompat a(d d8, PlaybackStateCompat playbackStateCompat) {
        d8.e = playbackStateCompat;
        return playbackStateCompat;
    }

    static /* synthetic */ MediaMetadataCompat f(d d8, MediaMetadataCompat mediaMetadataCompat) {
        d8.f = mediaMetadataCompat;
        return mediaMetadataCompat;
    }

    private void h(l.d d8) {
        int n8;
        String string;
        ax.S4.b.a(s, "updatePlayPauseAction");
        PlaybackStateCompat playbackStateCompat = this.e;
        if (playbackStateCompat != null && playbackStateCompat.j() == 3) {
            string = this.a.getString(ax.P4.i.f);
            n8 = ax.P4.h.d;
            playbackStateCompat = this.h;
        } else {
            string = this.a.getString(ax.P4.i.g);
            n8 = ax.P4.h.e;
            playbackStateCompat = this.i;
        }
        d8.b(new l.a(n8, (CharSequence)string, (PendingIntent)playbackStateCompat));
    }

    private PendingIntent i(MediaDescriptionCompat mediaDescriptionCompat, String string) {
        mediaDescriptionCompat = new Intent("com.example.android.uamp.open_ui");
        mediaDescriptionCompat.setPackage(this.a.getPackageName());
        mediaDescriptionCompat.setFlags(0x20000000);
        mediaDescriptionCompat.putExtra("com.example.android.uamp.EXTRA_START_FULLSCREEN", true);
        if (string != null) {
            mediaDescriptionCompat.putExtra("PLAY_FOLDER_URI", string);
        }
        int n8 = Build.VERSION.SDK_INT >= 31 ? 0x12000000 : 0x10000000;
        return PendingIntent.getActivity((Context)this.a, (int)100, (Intent)mediaDescriptionCompat, (int)n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Notification j(boolean bl) {
        RuntimeException runtimeException2;
        block12: {
            Bitmap bitmap;
            MediaDescriptionCompat mediaDescriptionCompat;
            boolean bl2;
            int n8;
            l.d d8;
            Object object;
            String string;
            block11: {
                block9: {
                    block10: {
                        string = s;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("updateNotificationMetadata. mMetadata=");
                        ((StringBuilder)object).append(this.f);
                        ax.S4.b.a(string, ((StringBuilder)object).toString());
                        if (this.f == null) return null;
                        if (this.e == null) {
                            return null;
                        }
                        this.n();
                        d8 = new l.d((Context)this.a, "music_player");
                        if ((this.e.b() & 0x10L) != 0L) {
                            d8.a(ax.P4.h.g, this.a.getString(ax.P4.i.h), this.j);
                            n8 = 1;
                        } else {
                            n8 = 0;
                        }
                        object = this.e;
                        bl2 = object != null && ((PlaybackStateCompat)object).j() == 3;
                        this.h(d8);
                        int n9 = n8 + 1;
                        if ((this.e.b() & 0x20L) != 0L) {
                            d8.a(ax.P4.h.f, this.a.getString(ax.P4.i.e), this.k);
                            n9 = n8 + 2;
                        }
                        n8 = n9;
                        if (ax.P4.b.b()) {
                            n8 = n9;
                            if ((this.e.b() & 1L) != 0L) {
                                d8.a(ax.P4.h.h, this.a.getString(ax.P4.i.i), this.n);
                                n8 = n9 + 1;
                            }
                        }
                        try {
                            mediaDescriptionCompat = ax.P4.k.b(this.f);
                            if (mediaDescriptionCompat.d() == null) break block9;
                            string = mediaDescriptionCompat.d().toString();
                            bitmap = ax.P4.a.i().j(string);
                            if (bitmap != null) break block10;
                            bitmap = BitmapFactory.decodeResource((Resources)this.a.getResources(), (int)ax.P4.h.a);
                            break block11;
                        }
                        catch (RuntimeException runtimeException2) {
                            break block12;
                        }
                    }
                    string = null;
                    break block11;
                }
                string = null;
                bitmap = null;
            }
            object = n8 == 1 ? (Object)new int[]{0} : (n8 == 2 ? (Object)new int[]{0, 1} : (n8 == 3 ? (Object)new int[]{0, 1, 2} : null));
            ax.N0.c c8 = new ax.N0.c();
            d8.w(c8.k(true).h(this.m).j((int[])object).i(this.b)).k(this.l).v(ax.P4.h.c).p(bl2).u(true).t(false).q(true).z(1).y(true).h(this.i(mediaDescriptionCompat, this.f.d().getString("__SOURCE_FOLDER__"))).j(mediaDescriptionCompat.i()).i(mediaDescriptionCompat.g());
            if (bl) {
                d8.n(bitmap);
            }
            d8.m(1);
            this.s(d8);
            if (string == null) return d8.c();
            this.m(string, d8);
            return d8.c();
        }
        ax.Ha.c.i((Context)this.a).f().b("MEDIA NOTIFICATION ERROR").l(runtimeException2).h();
        return null;
    }

    private Notification k() {
        String string = this.a.getString(ax.P4.i.j);
        l.d d8 = new l.d((Context)this.a, "music_player");
        d8.v(ax.P4.h.c).j(string).i("").m(2);
        return d8.c();
    }

    private void m(String string, l.d d8) {
        ax.P4.a.i().f(this.a.getApplicationContext(), string, new a.a(this, d8){
            final l.d a;
            final d b;
            {
                this.b = d8;
                this.a = d9;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void c(String string, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
                if (this.b.f == null) return;
                if (this.b.f.e().d() == null) return;
                if (!this.b.f.e().d().toString().equals(string)) return;
                ax.S4.b.a(s, "fetchBitmapFromURLAsync: set bitmap to ", string);
                this.a.n(bitmap2);
                try {
                    this.b.g.f(412, this.a.c());
                    return;
                }
                catch (RuntimeException runtimeException) {
                    return;
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        if (this.o) {
            return;
        }
        int n8 = Build.VERSION.SDK_INT >= 31 ? 0x12000000 : 0x10000000;
        try {
            String string = this.a.getPackageName();
            MusicService musicService = this.a;
            Intent intent = new Intent("com.example.android.uamp.pause");
            this.h = PendingIntent.getBroadcast((Context)musicService, (int)100, (Intent)intent.setPackage(string), (int)n8);
            musicService = this.a;
            Intent intent2 = new Intent("com.example.android.uamp.play");
            this.i = PendingIntent.getBroadcast((Context)musicService, (int)100, (Intent)intent2.setPackage(string), (int)n8);
            musicService = this.a;
            Intent intent3 = new Intent("com.example.android.uamp.prev");
            this.j = PendingIntent.getBroadcast((Context)musicService, (int)100, (Intent)intent3.setPackage(string), (int)n8);
            MusicService musicService2 = this.a;
            musicService = new Intent("com.example.android.uamp.next");
            this.k = PendingIntent.getBroadcast((Context)musicService2, (int)100, (Intent)musicService.setPackage(string), (int)n8);
            MusicService musicService3 = this.a;
            musicService = new Intent("com.example.android.uamp.delete");
            this.l = PendingIntent.getBroadcast((Context)musicService3, (int)100, (Intent)musicService.setPackage(string), (int)n8);
            MusicService musicService4 = this.a;
            musicService = new Intent("com.example.android.uamp.cancel");
            this.m = PendingIntent.getBroadcast((Context)musicService4, (int)100, (Intent)musicService.setPackage(string), (int)n8);
            MusicService musicService5 = this.a;
            musicService = new Intent("com.example.android.uamp.stop");
            this.n = PendingIntent.getBroadcast((Context)musicService5, (int)100, (Intent)musicService.setPackage(string), (int)n8);
            this.o = true;
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    private void q(Notification notification) {
        if (ax.P4.b.a()) {
            ax.P4.c.a(this.a, 412, notification, 2);
        } else {
            this.a.startForeground(412, notification);
        }
        this.q = true;
    }

    private void s(l.d d8) {
        String string = s;
        Object object = new StringBuilder();
        ((StringBuilder)object).append("updateNotificationPlaybackState. mPlaybackState=");
        ((StringBuilder)object).append(this.e);
        object = ((StringBuilder)object).toString();
        boolean bl = true;
        ax.S4.b.a(string, object);
        object = this.e;
        if (object == null) {
            ax.S4.b.a(string, "updateNotificationPlaybackState. cancelling notification!");
            return;
        }
        if (((PlaybackStateCompat)object).j() == 3 && this.e.i() >= 0L) {
            ax.S4.b.a(string, "updateNotificationPlaybackState. updating playback position to ", (System.currentTimeMillis() - this.e.i()) / 1000L, " seconds");
            d8.A(System.currentTimeMillis() - this.e.i()).t(true).y(true);
        } else {
            ax.S4.b.a(string, "updateNotificationPlaybackState. hiding playback position");
            d8.A(0L).t(false).y(false);
        }
        if (this.e.j() != 3) {
            bl = false;
        }
        d8.p(bl);
    }

    private void v() throws RemoteException {
        Object object = this.a.i();
        Object object2 = this.b;
        if (object2 == null && object != null || object2 != null && !((MediaSessionCompat.Token)object2).equals(object)) {
            object2 = this.c;
            if (object2 != null) {
                ((MediaControllerCompat)object2).m(this.r);
            }
            this.b = object;
            if (object != null) {
                this.c = object = new MediaControllerCompat((Context)this.a, (MediaSessionCompat.Token)object);
                this.d = ((MediaControllerCompat)object).i();
                if (this.p) {
                    this.c.j(this.r);
                }
            }
        }
    }

    public void l() {
        if (!this.p) {
            this.q(this.k());
            return;
        }
        Notification notification = this.j(true);
        if (notification != null) {
            try {
                this.q(notification);
                return;
            }
            catch (RuntimeException runtimeException) {
                this.q(this.j(false));
                return;
            }
        }
        this.q(this.k());
    }

    public boolean o() {
        return this.q;
    }

    public void onReceive(Context object, Intent object2) {
        String string = object2.getAction();
        object = s;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Received intent with action ");
        ((StringBuilder)object2).append(string);
        ax.S4.b.a((String)object, ((StringBuilder)object2).toString());
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case -883125030: {
                if (!string.equals("com.example.android.uamp.delete")) break;
                n8 = 6;
                break;
            }
            case -915391063: {
                if (!string.equals("com.example.android.uamp.cancel")) break;
                n8 = 5;
                break;
            }
            case -1301014799: {
                if (!string.equals("com.example.android.uamp.stop")) break;
                n8 = 4;
                break;
            }
            case -1301106398: {
                if (!string.equals("com.example.android.uamp.prev")) break;
                n8 = 3;
                break;
            }
            case -1301112285: {
                if (!string.equals("com.example.android.uamp.play")) break;
                n8 = 2;
                break;
            }
            case -1301177886: {
                if (!string.equals("com.example.android.uamp.next")) break;
                n8 = 1;
                break;
            }
            case -1680083737: {
                if (!string.equals("com.example.android.uamp.pause")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                ax.S4.b.j((String)object, "Unknown intent ignored. Action=", string);
                return;
            }
            case 6: {
                if (this.e != null) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Notification deleted : current state = ");
                    ((StringBuilder)object2).append(this.e.j());
                    ax.S4.b.a((String)object, ((StringBuilder)object2).toString());
                    n8 = this.e.j();
                    if (n8 != 2 && n8 != 7 && n8 != 0) {
                        if (n8 != 1) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Notification deleted in playing : current state = ");
                            ((StringBuilder)object2).append(this.e.j());
                            ax.S4.b.c((String)object, ((StringBuilder)object2).toString());
                            return;
                        }
                    } else {
                        this.d.k();
                    }
                }
                return;
            }
            case 4: 
            case 5: {
                this.d.k();
                return;
            }
            case 3: {
                this.d.j();
                return;
            }
            case 2: {
                this.d.b();
                return;
            }
            case 1: {
                this.d.i();
                return;
            }
            case 0: 
        }
        this.d.a();
    }

    public boolean p() {
        return this.p;
    }

    public void r(boolean bl) {
        if (this.o()) {
            this.a.stopForeground(bl);
            this.q = false;
        }
    }

    public void t() throws ax.S4.a {
        if (!this.p) {
            this.f = this.c.d();
            this.e = this.c.e();
            Notification notification = this.j(true);
            if (notification != null) {
                this.c.j(this.r);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.example.android.uamp.next");
                intentFilter.addAction("com.example.android.uamp.pause");
                intentFilter.addAction("com.example.android.uamp.play");
                intentFilter.addAction("com.example.android.uamp.prev");
                intentFilter.addAction("com.example.android.uamp.delete");
                intentFilter.addAction("com.example.android.uamp.cancel");
                intentFilter.addAction("com.example.android.uamp.stop");
                ax.Q.b.i((Context)this.a, this, intentFilter, 2);
                try {
                    this.q(notification);
                }
                catch (RuntimeException runtimeException) {
                    Notification notification2 = this.j(false);
                    try {
                        this.q(notification2);
                    }
                    catch (RuntimeException runtimeException2) {
                        ax.Ha.c.h().f().b("media notification runtime error").l(runtimeException2).h();
                    }
                }
                this.p = true;
            }
        } else if (!this.o()) {
            this.f = this.c.d();
            this.e = this.c.e();
            try {
                this.l();
                return;
            }
            catch (IllegalStateException illegalStateException) {
                ax.Ha.c.i((Context)this.a).f().b("MUSIC START NOTIFICATION ERROR").l(illegalStateException).h();
                throw new ax.S4.a(illegalStateException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u() {
        if (this.p) {
            this.p = false;
            this.c.m(this.r);
            try {
                this.a.unregisterReceiver(this);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        try {
            this.g.b(412);
        }
        catch (Exception exception) {}
        try {
            this.r(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}


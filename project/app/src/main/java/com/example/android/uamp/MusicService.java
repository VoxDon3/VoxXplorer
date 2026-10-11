/*
 * Decompiled with CFR 0.152.
 */
package com.example.android.uamp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.session.MediaButtonReceiver;
import ax.M0.c;
import ax.P4.d;
import ax.P4.i;
import ax.P4.k;
import ax.R4.e;
import ax.R4.f;
import ax.R4.g;
import ax.R4.h;
import ax.S4.a;
import java.lang.ref.WeakReference;
import java.util.List;

public class MusicService
extends c
implements g.c {
    private static final String r = ax.S4.b.f(MusicService.class);
    private static boolean s = false;
    private static int t = 0;
    private static boolean u = false;
    private static boolean v = false;
    private ax.Q4.b j;
    private g k;
    private MediaSessionCompat l;
    private d m;
    private final b n = new b(this);
    private ax.P4.g o;
    private boolean p;
    private boolean q;

    private static int E(Context context) {
        return context.getSharedPreferences("musicplayer", 0).getInt("repeatmode", 0);
    }

    private static int F(Context context) {
        return context.getSharedPreferences("musicplayer", 0).getInt("shufflemode", 0);
    }

    public static boolean G() {
        return s;
    }

    public static boolean H() {
        return s && v;
    }

    public static boolean I() {
        return s && t == 3 && u;
    }

    private static void J(Context context, int n8) {
        if ((context = context.getSharedPreferences("musicplayer", 0)).getInt("repeatmode", 0) != n8) {
            context.edit().putInt("repeatmode", n8).apply();
        }
    }

    private static void K(Context context, int n8) {
        if ((context = context.getSharedPreferences("musicplayer", 0)).getInt("shufflemode", 0) != n8) {
            context.edit().putInt("shufflemode", n8).apply();
        }
    }

    public static void L(Context context) {
        Intent intent = new Intent("local.intent.action.LOCAL_PLAYLIST_SAVE");
        ax.L0.a.b(context).d(intent);
    }

    public static void M(Context context) {
        Intent intent = new Intent("local.intent.action.LOCAL_PLAYLIST_CLEAR");
        ax.L0.a.b(context).d(intent);
    }

    public static void N(Context context, String string, String string2, int n8) {
        Intent intent = new Intent("local.intent.action.LOCAL_PLAYLIST_SAVE");
        intent.putExtra("folder_uri", string);
        intent.putExtra("media_id", string2);
        intent.putExtra("current_position", n8);
        ax.L0.a.b(context).d(intent);
    }

    private void O(boolean bl, boolean bl2) {
        this.p = bl;
        this.q = bl2;
    }

    @Override
    public void a(f f8, boolean bl) {
        d d8;
        this.O(false, bl);
        this.n.removeCallbacksAndMessages(null);
        if (bl) {
            this.n.sendEmptyMessageDelayed(1, 1800000L);
        } else {
            this.n.sendEmptyMessageDelayed(0, 30000L);
        }
        if (ax.P4.b.a()) {
            d8 = this.m;
            if (d8 != null) {
                d8.r(bl ^ true);
            }
        } else {
            d8 = this.m;
            if (d8 != null) {
                d8.r(bl ^ true);
            }
        }
        d8 = new Intent("local.intent.action.LOCAL_PLAYBACK_STOP");
        if (bl) {
            d8.putExtra("state", 2);
        } else {
            d8.putExtra("state", 1);
        }
        ax.L0.a.b((Context)this).d((Intent)d8);
        if (bl) {
            MusicService.N((Context)this, this.j.d(), f8.i(), f8.j());
        }
    }

    @Override
    public void b() throws a {
        d d8 = this.m;
        if (d8 != null) {
            d8.t();
        }
    }

    @Override
    public void c(PlaybackStateCompat playbackStateCompat) {
        playbackStateCompat.j();
        t = playbackStateCompat.j();
        v = this.j.j();
        u = this.k.B();
        MediaSessionCompat mediaSessionCompat = this.l;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.m(playbackStateCompat);
        }
    }

    @Override
    public void d() {
        this.O(true, false);
        if (!this.l.e()) {
            this.l.g(true);
        }
        this.n.removeCallbacksAndMessages(null);
        Intent intent = new Intent(this.getApplicationContext(), MusicService.class);
        try {
            ax.P4.k.d((Context)this, intent);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            ax.Ha.c.i((Context)this).f().b("MUSIC SERVICE START FOREGROUND ERROR").l(illegalStateException).h();
            return;
        }
    }

    @Override
    public void e(f object, String string, boolean bl, boolean bl2) {
        this.O(false, false);
        if (string != null) {
            if (this.k.x() instanceof e) {
                ((e)this.k.x()).I();
            }
            if ((object = this.m) != null && !((d)((Object)object)).p() && this.m.o()) {
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 9500L);
                if (!ax.P4.b.a()) {
                    this.m.r(true);
                }
            } else {
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 30000L);
            }
            if (bl2) {
                MusicService.M((Context)this);
            }
        }
    }

    @Override
    public void g(float f8) {
    }

    @Override
    public void j(int n8) {
        this.l.p(n8);
        MusicService.J((Context)this, n8);
    }

    @Override
    public void m(String string, Bundle bundle, c.l<Bundle> l8) {
        super.m(string, bundle, l8);
    }

    @Override
    public c.e n(String string, int n8, Bundle object) {
        String string2 = r;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnGetRoot: clientPackageName=");
        stringBuilder.append(string);
        String string3 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("; clientUid=");
        stringBuilder.append(n8);
        stringBuilder.append(" ; rootHints=");
        ax.S4.b.a(string2, string3, stringBuilder.toString(), object);
        if (this.o == null) {
            this.o = new ax.P4.g((Context)this);
        }
        if (!this.o.a((Context)this, string, n8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("OnGetRoot: IGNORING request from untrusted package ");
            ((StringBuilder)object).append(string);
            ax.S4.b.j(string2, ((StringBuilder)object).toString());
            return null;
        }
        return new c.e("__ROOT__", null);
    }

    @Override
    public void o(String string, c.l<List<MediaBrowserCompat.MediaItem>> l8) {
        ax.S4.b.a(r, "OnLoadChildren: parentMediaId=", string);
        l8.f(this.j.c(string, this.getResources()));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ax.S4.b.a(r, "onCreate");
        s = true;
        this.j = new ax.Q4.b();
        h h8 = new h((Context)this, this.j, this.getResources(), new h.b(this){
            final MusicService a;
            {
                this.a = musicService;
            }

            @Override
            public void a() {
                this.a.k.N(this.a.getString(i.d), 0, null);
            }

            @Override
            public void b(int n8) {
                this.a.k.z();
            }

            @Override
            public void c(String string, List<MediaSessionCompat.QueueItem> list) {
                this.a.l.n(list);
                this.a.l.o(string);
            }

            @Override
            public void u(MediaMetadataCompat mediaMetadataCompat) {
                this.a.l.l(mediaMetadataCompat);
                mediaMetadataCompat = new Bundle();
                mediaMetadataCompat.putInt("file.manager.music.player.QUEUE_POSITION", this.a.k.u());
                mediaMetadataCompat.putInt("file.manager.music.player.QUEUE_SIZE", this.a.k.v());
                this.a.l.j((Bundle)mediaMetadataCompat);
            }
        });
        Object object = new e((Context)this, this.j);
        this.k = new g(this, this.getResources(), this.j, h8, (f)object);
        try {
            this.l = object = new MediaSessionCompat((Context)this, "MusicService");
        }
        catch (SecurityException securityException) {
            this.stopSelf();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.l = new MediaSessionCompat((Context)this, "MusicService", new ComponentName(this.getPackageName(), MediaButtonReceiver.class.getCanonicalName()), null);
        }
        int n8 = MusicService.E((Context)this);
        int n9 = MusicService.F((Context)this);
        this.k.C(n9, n8);
        this.A(this.l.c());
        this.l.h(this.k.w());
        this.l.k(3);
        this.k.N(null, 0, null);
        try {
            object = new d(this);
            this.m = object;
            return;
        }
        catch (RemoteException remoteException) {
            throw new IllegalStateException("Could not create a MediaNotificationManager", remoteException);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ax.S4.b.a(r, "onDestroy");
        s = false;
        t = 0;
        v = false;
        u = false;
        this.k.A(null);
        Object object = this.m;
        if (object != null) {
            ((d)((Object)object)).u();
        }
        this.n.removeCallbacksAndMessages(null);
        object = this.l;
        if (object != null) {
            ((MediaSessionCompat)object).f();
        }
    }

    public int onStartCommand(Intent object, int n8, int n9) {
        Object object2;
        block12: {
            if (object == null) {
                object = this.m;
                if (object != null) {
                    object.r(true);
                }
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 10000L);
                return 2;
            }
            if (object.hasExtra("START_FOREGROUND")) {
                try {
                    object2 = this.m;
                    if (object2 == null) break block12;
                }
                catch (IllegalStateException illegalStateException) {
                    ax.Ha.b b8 = ax.Ha.c.i((Context)this).f().b("MUSIC SERVICE START BACKGROUND");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("intent:");
                    stringBuilder.append(object.getAction());
                    b8.g(stringBuilder.toString()).h();
                    this.n.removeCallbacksAndMessages(null);
                    this.n.sendEmptyMessageDelayed(0, 10000L);
                    return 2;
                }
                ((d)((Object)object2)).l();
            }
        }
        object2 = object.getAction();
        String string = object.getStringExtra("CMD_NAME");
        if ("com.example.android.uamp.ACTION_CMD".equals(object2)) {
            if ("CMD_PAUSE".equals(string)) {
                this.k.y();
                return 2;
            }
        } else {
            MediaButtonReceiver.c(this.l, object);
        }
        if (!this.p && (this.n.hasMessages(1) || this.n.hasMessages(0))) {
            if (this.q && (object = this.m) != null && object.o()) {
                this.m.r(false);
            }
        } else {
            this.n.removeCallbacksAndMessages(null);
            this.n.sendEmptyMessageDelayed(0, 30000L);
        }
        return 2;
    }

    @Override
    public void p(int n8) {
        this.l.q(n8);
        MusicService.K((Context)this, n8);
    }

    private static class b
    extends Handler {
        private final WeakReference<MusicService> a;

        private b(MusicService musicService) {
            this.a = new WeakReference<MusicService>(musicService);
        }

        public void handleMessage(Message object) {
            object = (MusicService)this.a.get();
            if (object != null && ((MusicService)object).k.x() != null) {
                if (((MusicService)object).k.x().n()) {
                    ax.S4.b.a(r, "Ignoring delayed stop since the media player is in use.");
                    return;
                }
                ax.S4.b.a(r, "Stopping service with delay handler.");
                object.stopSelf();
            }
        }
    }
}


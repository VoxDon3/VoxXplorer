package com.example.android.uamp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class MusicService extends c implements g.c {
    private static final String r = ax.S4.b.f(MusicService.class);
    private static boolean s = false;
    private static int t = 0;
    private static boolean u = false;
    private static boolean v = false;
    private ax.Q4.b j;
    private g k;
    private MediaSessionCompat l;
    private d m;
    private final b n = new b(this, null);
    private ax.P4.g o;
    private boolean p;
    private boolean q;

    class a implements h.b {
        a() {
        }

        @Override // ax.R4.h.b
        public void a() {
            MusicService.this.k.N(MusicService.this.getString(i.d), 0, null);
        }

        @Override // ax.R4.h.b
        public void b(int i) {
            MusicService.this.k.z();
        }

        @Override // ax.R4.h.b
        public void c(String str, List<MediaSessionCompat.QueueItem> list) {
            MusicService.this.l.n(list);
            MusicService.this.l.o(str);
        }

        @Override // ax.R4.h.b
        public void u(MediaMetadataCompat mediaMetadataCompat) {
            MusicService.this.l.l(mediaMetadataCompat);
            Bundle bundle = new Bundle();
            bundle.putInt("file.manager.music.player.QUEUE_POSITION", MusicService.this.k.u());
            bundle.putInt("file.manager.music.player.QUEUE_SIZE", MusicService.this.k.v());
            MusicService.this.l.j(bundle);
        }
    }

    private static class b extends Handler {
        private final WeakReference<MusicService> a;

        /* synthetic */ b(MusicService musicService, a aVar) {
            this(musicService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MusicService musicService = this.a.get();
            if (musicService == null || musicService.k.x() == null) {
                return;
            }
            if (musicService.k.x().n()) {
                ax.S4.b.a(MusicService.r, "Ignoring delayed stop since the media player is in use.");
            } else {
                ax.S4.b.a(MusicService.r, "Stopping service with delay handler.");
                musicService.stopSelf();
            }
        }

        private b(MusicService musicService) {
            this.a = new WeakReference<>(musicService);
        }
    }

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

    private static void J(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("musicplayer", 0);
        if (sharedPreferences.getInt("repeatmode", 0) != i) {
            sharedPreferences.edit().putInt("repeatmode", i).apply();
        }
    }

    private static void K(Context context, int i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("musicplayer", 0);
        if (sharedPreferences.getInt("shufflemode", 0) != i) {
            sharedPreferences.edit().putInt("shufflemode", i).apply();
        }
    }

    public static void L(Context context) {
        ax.L0.a.b(context).d(new Intent("local.intent.action.LOCAL_PLAYLIST_SAVE"));
    }

    public static void M(Context context) {
        ax.L0.a.b(context).d(new Intent("local.intent.action.LOCAL_PLAYLIST_CLEAR"));
    }

    public static void N(Context context, String str, String str2, int i) {
        Intent intent = new Intent("local.intent.action.LOCAL_PLAYLIST_SAVE");
        intent.putExtra("folder_uri", str);
        intent.putExtra("media_id", str2);
        intent.putExtra("current_position", i);
        ax.L0.a.b(context).d(intent);
    }

    private void O(boolean z, boolean z2) {
        this.p = z;
        this.q = z2;
    }

    @Override // ax.R4.g.c
    public void a(f fVar, boolean z) {
        O(false, z);
        this.n.removeCallbacksAndMessages(null);
        if (z) {
            this.n.sendEmptyMessageDelayed(1, 1800000L);
        } else {
            this.n.sendEmptyMessageDelayed(0, 30000L);
        }
        if (ax.P4.b.a()) {
            d dVar = this.m;
            if (dVar != null) {
                dVar.r(!z);
            }
        } else {
            d dVar2 = this.m;
            if (dVar2 != null) {
                dVar2.r(!z);
            }
        }
        Intent intent = new Intent("local.intent.action.LOCAL_PLAYBACK_STOP");
        if (z) {
            intent.putExtra("state", 2);
        } else {
            intent.putExtra("state", 1);
        }
        ax.L0.a.b(this).d(intent);
        if (z) {
            N(this, this.j.d(), fVar.i(), fVar.j());
        }
    }

    @Override // ax.R4.g.c
    public void b() throws ax.S4.a {
        d dVar = this.m;
        if (dVar != null) {
            dVar.t();
        }
    }

    @Override // ax.R4.g.c
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

    @Override // ax.R4.g.c
    public void d() {
        O(true, false);
        if (!this.l.e()) {
            this.l.g(true);
        }
        this.n.removeCallbacksAndMessages(null);
        try {
            k.d(this, new Intent(getApplicationContext(), (Class<?>) MusicService.class));
        } catch (IllegalStateException e) {
            ax.Ha.c.i(this).f().b("MUSIC SERVICE START FOREGROUND ERROR").l(e).h();
        }
    }

    @Override // ax.R4.g.c
    public void e(f fVar, String str, boolean z, boolean z2) {
        O(false, false);
        if (str != null) {
            if (this.k.x() instanceof e) {
                ((e) this.k.x()).I();
            }
            d dVar = this.m;
            if (dVar == null || dVar.p() || !this.m.o()) {
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 30000L);
            } else {
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 9500L);
                if (!ax.P4.b.a()) {
                    this.m.r(true);
                }
            }
            if (z2) {
                M(this);
            }
        }
    }

    @Override // ax.R4.g.c
    public void g(float f) {
    }

    @Override // ax.R4.g.c
    public void j(int i) {
        this.l.p(i);
        J(this, i);
    }

    @Override // ax.M0.c
    public void m(String str, Bundle bundle, c.l<Bundle> lVar) {
        super.m(str, bundle, lVar);
    }

    @Override // ax.M0.c
    public c.e n(String str, int i, Bundle bundle) {
        String str2 = r;
        ax.S4.b.a(str2, "OnGetRoot: clientPackageName=" + str, "; clientUid=" + i + " ; rootHints=", bundle);
        if (this.o == null) {
            this.o = new ax.P4.g(this);
        }
        if (this.o.a(this, str, i)) {
            return new c.e("__ROOT__", null);
        }
        ax.S4.b.j(str2, "OnGetRoot: IGNORING request from untrusted package " + str);
        return null;
    }

    @Override // ax.M0.c
    public void o(String str, c.l<List<MediaBrowserCompat.MediaItem>> lVar) {
        ax.S4.b.a(r, "OnLoadChildren: parentMediaId=", str);
        lVar.f(this.j.c(str, getResources()));
    }

    @Override // ax.M0.c, android.app.Service
    public void onCreate() {
        super.onCreate();
        ax.S4.b.a(r, "onCreate");
        s = true;
        this.j = new ax.Q4.b();
        this.k = new g(this, getResources(), this.j, new h(this, this.j, getResources(), new a()), new e(this, this.j));
        try {
            this.l = new MediaSessionCompat(this, "MusicService");
        } catch (IllegalArgumentException unused) {
            this.l = new MediaSessionCompat(this, "MusicService", new ComponentName(getPackageName(), MediaButtonReceiver.class.getCanonicalName()), null);
        } catch (SecurityException unused2) {
            stopSelf();
            return;
        }
        this.k.C(F(this), E(this));
        A(this.l.c());
        this.l.h(this.k.w());
        this.l.k(3);
        this.k.N(null, 0, null);
        try {
            this.m = new d(this);
        } catch (RemoteException e) {
            throw new IllegalStateException("Could not create a MediaNotificationManager", e);
        }
    }

    @Override // ax.M0.c, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ax.S4.b.a(r, "onDestroy");
        s = false;
        t = 0;
        v = false;
        u = false;
        this.k.A(null);
        d dVar = this.m;
        if (dVar != null) {
            dVar.u();
        }
        this.n.removeCallbacksAndMessages(null);
        MediaSessionCompat mediaSessionCompat = this.l;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.f();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        d dVar;
        if (intent == null) {
            d dVar2 = this.m;
            if (dVar2 != null) {
                dVar2.r(true);
            }
            this.n.removeCallbacksAndMessages(null);
            this.n.sendEmptyMessageDelayed(0, 10000L);
            return 2;
        }
        if (intent.hasExtra("START_FOREGROUND")) {
            try {
                d dVar3 = this.m;
                if (dVar3 != null) {
                    dVar3.l();
                }
            } catch (IllegalStateException unused) {
                ax.Ha.c.i(this).f().b("MUSIC SERVICE START BACKGROUND").g("intent:" + intent.getAction()).h();
                this.n.removeCallbacksAndMessages(null);
                this.n.sendEmptyMessageDelayed(0, 10000L);
                return 2;
            }
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("CMD_NAME");
        if (!"com.example.android.uamp.ACTION_CMD".equals(action)) {
            MediaButtonReceiver.c(this.l, intent);
        } else if ("CMD_PAUSE".equals(stringExtra)) {
            this.k.y();
            return 2;
        }
        if (this.p || !(this.n.hasMessages(1) || this.n.hasMessages(0))) {
            this.n.removeCallbacksAndMessages(null);
            this.n.sendEmptyMessageDelayed(0, 30000L);
        } else if (this.q && (dVar = this.m) != null && dVar.o()) {
            this.m.r(false);
        }
        return 2;
    }

    @Override // ax.R4.g.c
    public void p(int i) {
        this.l.q(i);
        K(this, i);
    }
}

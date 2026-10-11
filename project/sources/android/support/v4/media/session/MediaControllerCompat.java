package android.support.v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import ax.M0.l;
import ax.x2.C3403a;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    private final b a;
    private final MediaSessionCompat.Token b;
    private final Set<a> c;

    static class MediaControllerImplApi21 implements b {
        protected final MediaController a;
        final Object b = new Object();
        private final List<a> c = new ArrayList();
        private HashMap<a, a> d = new HashMap<>();
        final MediaSessionCompat.Token e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> q;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.q = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.q.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    mediaControllerImplApi21.e.f(b.a.r(ax.P.g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.e.g(C3403a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.f();
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void U0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void Z0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void Z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void k0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void m0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void u(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            this.a = new MediaController(context, (MediaSession.Token) token.e());
            if (token.c() == null) {
                g();
            }
        }

        static MediaControllerCompat e(Activity activity) {
            MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.a(mediaController.getSessionToken()));
        }

        private void g() {
            h("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        static void j(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.g().e()) : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void a(a aVar) {
            this.a.unregisterCallback(aVar.a);
            synchronized (this.b) {
                if (this.e.c() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.c = null;
                            this.e.c().v0(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean b(KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public e c() {
            MediaController.TransportControls transportControls = this.a.getTransportControls();
            int i = Build.VERSION.SDK_INT;
            return i >= 29 ? new i(transportControls) : i >= 24 ? new h(transportControls) : i >= 23 ? new g(transportControls) : new f(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void d(a aVar, Handler handler) {
            this.a.registerCallback(aVar.a, handler);
            synchronized (this.b) {
                if (this.e.c() != null) {
                    a aVar2 = new a(aVar);
                    this.d.put(aVar, aVar2);
                    aVar.c = aVar2;
                    try {
                        this.e.c().H(aVar2);
                        aVar.m(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    aVar.c = null;
                    this.c.add(aVar);
                }
            }
        }

        void f() {
            if (this.e.c() == null) {
                return;
            }
            for (a aVar : this.c) {
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.c = aVar2;
                try {
                    this.e.c().H(aVar2);
                    aVar.m(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.a.sendCommand(str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PlaybackStateCompat i() {
            if (this.e.c() != null) {
                try {
                    return this.e.c().i();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.a(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int o() {
            if (this.e.c() == null) {
                return -1;
            }
            try {
                return this.e.c().o();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public MediaMetadataCompat s() {
            MediaMetadata metadata = this.a.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.b(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public int x() {
            if (this.e.c() == null) {
                return -1;
            }
            try {
                return this.e.c().x();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e);
                return -1;
            }
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        final MediaController.Callback a = new C0000a(this);
        b b;
        android.support.v4.media.session.a c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        private static class C0000a extends MediaController.Callback {
            private final WeakReference<a> a;

            C0000a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.a.get();
                if (aVar == null || aVar.c != null) {
                    return;
                }
                aVar.e(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    if (aVar.c == null || Build.VERSION.SDK_INT >= 23) {
                        aVar.j(str, bundle);
                    }
                }
            }
        }

        private class b extends Handler {
            boolean a;

            b(Looper looper) {
                super(looper);
                this.a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            a.this.j((String) message.obj, data);
                            break;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            a.this.a((d) message.obj);
                            break;
                        case 5:
                            a.this.f((List) message.obj);
                            break;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            a.this.c(bundle);
                            break;
                        case 8:
                            a.this.i();
                            break;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.k();
                            break;
                    }
                }
            }
        }

        private static class c extends a.AbstractBinderC0002a {
            private final WeakReference<a> e;

            c(a aVar) {
                this.e = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void A(String str, Bundle bundle) throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void G0(boolean z) throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void T0(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.a
            public void V1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void j0() throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void o1(int i) throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void v(int i) throws RemoteException {
                a aVar = this.e.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i), null);
                }
            }
        }

        public void a(d dVar) {
        }

        public void b(boolean z) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m(8, null, null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i) {
        }

        void m(int i, Object obj, Bundle bundle) {
            b bVar = this.b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.b = bVar;
                bVar.a = true;
            } else {
                b bVar2 = this.b;
                if (bVar2 != null) {
                    bVar2.a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.b = null;
                }
            }
        }
    }

    interface b {
        void a(a aVar);

        boolean b(KeyEvent keyEvent);

        e c();

        void d(a aVar, Handler handler);

        Bundle getExtras();

        PlaybackStateCompat i();

        int o();

        MediaMetadataCompat s();

        int x();
    }

    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static final class d {
        private final int a;
        private final AudioAttributesCompat b;
        private final int c;
        private final int d;
        private final int e;

        d(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.a = i;
            this.b = audioAttributesCompat;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class e {
        e() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c(Uri uri, Bundle bundle);

        public abstract void d(Uri uri, Bundle bundle);

        public abstract void e(long j);

        public abstract void f(float f);

        public abstract void g(int i);

        public abstract void h(int i);

        public abstract void i();

        public abstract void j();

        public abstract void k();
    }

    static class f extends e {
        protected final MediaController.TransportControls a;

        f(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void a() {
            this.a.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void b() {
            this.a.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void c(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            l("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void d(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            l("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void e(long j) {
            this.a.seekTo(j);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void f(float f) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
            l("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void g(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
            l("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void h(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", i);
            l("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void i() {
            this.a.skipToNext();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void j() {
            this.a.skipToPrevious();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.e
        public void k() {
            this.a.stop();
        }

        public void l(String str, Bundle bundle) {
            MediaControllerCompat.n(str, bundle);
            this.a.sendCustomAction(str, bundle);
        }
    }

    static class g extends f {
        g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.e
        public void c(Uri uri, Bundle bundle) {
            this.a.playFromUri(uri, bundle);
        }
    }

    static class h extends g {
        h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.e
        public void d(Uri uri, Bundle bundle) {
            this.a.prepareFromUri(uri, bundle);
        }
    }

    static class i extends h {
        i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.f, android.support.v4.media.session.MediaControllerCompat.e
        public void f(float f) {
            if (f == 0.0f) {
                throw new IllegalArgumentException("speed must not be zero");
            }
            this.a.setPlaybackSpeed(f);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }

    public static MediaControllerCompat c(Activity activity) {
        Object tag = activity.getWindow().getDecorView().getTag(l.a);
        return tag instanceof MediaControllerCompat ? (MediaControllerCompat) tag : MediaControllerImplApi21.e(activity);
    }

    public static void l(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(l.a, mediaControllerCompat);
        MediaControllerImplApi21.j(activity, mediaControllerCompat);
    }

    static void n(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) {
            if (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle b() {
        return this.a.getExtras();
    }

    public MediaMetadataCompat d() {
        return this.a.s();
    }

    public PlaybackStateCompat e() {
        return this.a.i();
    }

    public int f() {
        return this.a.o();
    }

    public MediaSessionCompat.Token g() {
        return this.b;
    }

    public int h() {
        return this.a.x();
    }

    public e i() {
        return this.a.c();
    }

    public void j(a aVar) {
        k(aVar, null);
    }

    public void k(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.c.add(aVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.n(handler);
        this.a.d(aVar, handler);
    }

    public void m(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.c.remove(aVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.a(aVar);
        } finally {
            aVar.n(null);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        this.b = token;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new c(context, token);
        } else {
            this.a = new MediaControllerImplApi21(context, token);
        }
    }
}

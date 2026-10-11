/*
 * Decompiled with CFR 0.152.
 */
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
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import ax.M0.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MediaControllerCompat {
    private final b a;
    private final MediaSessionCompat.Token b;
    private final Set<a> c;

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.c = java.util.DesugarCollections.synchronizedSet(new HashSet());
            this.b = token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new c(context, token);
                return;
            }
            this.a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }

    public static MediaControllerCompat c(Activity activity) {
        Object object = activity.getWindow().getDecorView().getTag(l.a);
        if (object instanceof MediaControllerCompat) {
            return (MediaControllerCompat)object;
        }
        return MediaControllerImplApi21.e(activity);
    }

    public static void l(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(l.a, (Object)mediaControllerCompat);
        MediaControllerImplApi21.j(activity, mediaControllerCompat);
    }

    static void n(String string, Bundle object) {
        if (string == null || !string.equals("android.support.v4.media.session.action.FOLLOW") && !string.equals("android.support.v4.media.session.action.UNFOLLOW") || object != null && object.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(".");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
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

    public void j(a a8) {
        this.k(a8, null);
    }

    public void k(a a8, Handler handler) {
        if (a8 != null) {
            if (!this.c.add(a8)) {
                Log.w((String)"MediaControllerCompat", (String)"the callback has already been registered");
                return;
            }
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler();
            }
            a8.n(handler2);
            this.a.d(a8, handler2);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void m(a a8) {
        if (a8 != null) {
            if (!this.c.remove(a8)) {
                Log.w((String)"MediaControllerCompat", (String)"the callback has never been registered");
                return;
            }
            try {
                this.a.a(a8);
                return;
            }
            finally {
                a8.n(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    static class MediaControllerImplApi21
    implements b {
        protected final MediaController a;
        final Object b = new Object();
        private final List<android.support.v4.media.session.MediaControllerCompat$a> c = new ArrayList<android.support.v4.media.session.MediaControllerCompat$a>();
        private HashMap<android.support.v4.media.session.MediaControllerCompat$a, a> d = new HashMap();
        final MediaSessionCompat.Token e;

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            this.a = new MediaController(context, (MediaSession.Token)token.e());
            if (token.c() == null) {
                this.g();
            }
        }

        static MediaControllerCompat e(Activity activity) {
            MediaController mediaController = activity.getMediaController();
            if (mediaController == null) {
                return null;
            }
            return new MediaControllerCompat((Context)activity, MediaSessionCompat.Token.a(mediaController.getSessionToken()));
        }

        private void g() {
            this.h("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        static void j(Activity activity, MediaControllerCompat mediaControllerCompat) {
            mediaControllerCompat = mediaControllerCompat != null ? new MediaController((Context)activity, (MediaSession.Token)mediaControllerCompat.g().e()) : null;
            activity.setMediaController((MediaController)mediaControllerCompat);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void a(android.support.v4.media.session.MediaControllerCompat$a a8) {
            this.a.unregisterCallback(a8.a);
            Object object = this.b;
            synchronized (object) {
                Throwable throwable2;
                block8: {
                    block7: {
                        block6: {
                            try {
                                Object object2 = this.e.c();
                                if (object2 == null) break block6;
                                try {
                                    object2 = this.d.remove(a8);
                                    if (object2 != null) {
                                        a8.c = null;
                                        this.e.c().v0((android.support.v4.media.session.a)object2);
                                    }
                                    break block7;
                                }
                                catch (RemoteException remoteException) {
                                    Log.e((String)"MediaControllerCompat", (String)"Dead object in unregisterCallback.", (Throwable)remoteException);
                                }
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        this.c.remove(a8);
                    }
                    return;
                }
                throw throwable2;
            }
        }

        @Override
        public boolean b(KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override
        public e c() {
            MediaController.TransportControls transportControls = this.a.getTransportControls();
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 29) {
                return new i(transportControls);
            }
            if (n8 >= 24) {
                return new h(transportControls);
            }
            if (n8 >= 23) {
                return new g(transportControls);
            }
            return new f(transportControls);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public final void d(android.support.v4.media.session.MediaControllerCompat$a a8, Handler object) {
            this.a.registerCallback(a8.a, object);
            object = this.b;
            synchronized (object) {
                Throwable throwable2;
                block7: {
                    block6: {
                        block5: {
                            try {
                                if (this.e.c() == null) break block5;
                                a a9 = new a(a8);
                                this.d.put(a8, a9);
                                a8.c = a9;
                                try {
                                    this.e.c().H(a9);
                                    a8.m(13, null, null);
                                }
                                catch (RemoteException remoteException) {
                                    Log.e((String)"MediaControllerCompat", (String)"Dead object in registerCallback.", (Throwable)remoteException);
                                }
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        a8.c = null;
                        this.c.add(a8);
                    }
                    return;
                }
                throw throwable2;
            }
        }

        void f() {
            if (this.e.c() == null) {
                return;
            }
            for (android.support.v4.media.session.MediaControllerCompat$a a8 : this.c) {
                a a9 = new a(a8);
                this.d.put(a8, a9);
                a8.c = a9;
                try {
                    this.e.c().H(a9);
                    a8.m(13, null, null);
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in registerCallback.", (Throwable)remoteException);
                    break;
                }
            }
            this.c.clear();
        }

        @Override
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        public void h(String string, Bundle bundle, ResultReceiver resultReceiver) {
            this.a.sendCommand(string, bundle, resultReceiver);
        }

        @Override
        public PlaybackStateCompat i() {
            Object object;
            if (this.e.c() != null) {
                try {
                    PlaybackStateCompat playbackStateCompat = this.e.c().i();
                    return playbackStateCompat;
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in getPlaybackState.", (Throwable)remoteException);
                }
            }
            object = (object = this.a.getPlaybackState()) != null ? PlaybackStateCompat.a(object) : null;
            return object;
        }

        @Override
        public int o() {
            if (this.e.c() != null) {
                try {
                    int n8 = this.e.c().o();
                    return n8;
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in getRepeatMode.", (Throwable)remoteException);
                }
            }
            return -1;
        }

        @Override
        public MediaMetadataCompat s() {
            MediaMetadata mediaMetadata = this.a.getMetadata();
            if (mediaMetadata != null) {
                return MediaMetadataCompat.b(mediaMetadata);
            }
            return null;
        }

        @Override
        public int x() {
            if (this.e.c() != null) {
                try {
                    int n8 = this.e.c().x();
                    return n8;
                }
                catch (RemoteException remoteException) {
                    Log.e((String)"MediaControllerCompat", (String)"Dead object in getShuffleMode.", (Throwable)remoteException);
                }
            }
            return -1;
        }

        private static class ExtraBinderRequestResultReceiver
        extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> q;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.q = new WeakReference<MediaControllerImplApi21>(mediaControllerImplApi21);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            protected void onReceiveResult(int n8, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21)this.q.get();
                if (mediaControllerImplApi21 == null) return;
                if (bundle == null) {
                    return;
                }
                Object object = mediaControllerImplApi21.b;
                synchronized (object) {
                    mediaControllerImplApi21.e.f(b.a.r(ax.P.g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.e.g((ax.x2.b)ax.x2.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.f();
                    return;
                }
            }
        }

        private static class a
        extends a.c {
            a(android.support.v4.media.session.MediaControllerCompat$a a8) {
                super(a8);
            }

            @Override
            public void U0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void Z0() throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void Z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void k0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void m0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void u(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }
    }

    public static abstract class android.support.v4.media.session.MediaControllerCompat$a
    implements IBinder.DeathRecipient {
        final MediaController.Callback a = new a(this);
        b b;
        android.support.v4.media.session.a c;

        public void a(d d8) {
        }

        public void b(boolean bl) {
        }

        public void binderDied() {
            this.m(8, null, null);
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

        public void h(int n8) {
        }

        public void i() {
        }

        public void j(String string, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int n8) {
        }

        void m(int n8, Object object, Bundle bundle) {
            b b8 = this.b;
            if (b8 != null) {
                object = b8.obtainMessage(n8, object);
                object.setData(bundle);
                object.sendToTarget();
            }
        }

        void n(Handler handler) {
            if (handler == null) {
                handler = this.b;
                if (handler != null) {
                    handler.a = false;
                    handler.removeCallbacksAndMessages(null);
                    this.b = null;
                }
                return;
            }
            handler = new b(this, handler.getLooper());
            this.b = handler;
            handler.a = true;
        }

        private static class a
        extends MediaController.Callback {
            private final WeakReference<android.support.v4.media.session.MediaControllerCompat$a> a;

            a(android.support.v4.media.session.MediaControllerCompat$a a8) {
                this.a = new WeakReference<android.support.v4.media.session.MediaControllerCompat$a>(a8);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null && a8.c == null) {
                    a8.e(PlaybackStateCompat.a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null) {
                    a8.i();
                }
            }

            public void onSessionEvent(String string, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.a.get();
                if (a8 != null && (a8.c == null || Build.VERSION.SDK_INT >= 23)) {
                    a8.j(string, bundle);
                }
            }
        }

        private class b
        extends Handler {
            boolean a;
            final android.support.v4.media.session.MediaControllerCompat$a b;

            b(android.support.v4.media.session.MediaControllerCompat$a a8, Looper looper) {
                this.b = a8;
                super(looper);
                this.a = false;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public void handleMessage(Message message) {
                if (!this.a) return;
                switch (message.what) {
                    default: {
                        return;
                    }
                    case 13: {
                        this.b.k();
                        return;
                    }
                    case 12: {
                        this.b.l((Integer)message.obj);
                        return;
                    }
                    case 11: {
                        this.b.b((Boolean)message.obj);
                        return;
                    }
                    case 9: {
                        this.b.h((Integer)message.obj);
                        return;
                    }
                    case 8: {
                        this.b.i();
                        return;
                    }
                    case 7: {
                        message = (Bundle)message.obj;
                        MediaSessionCompat.a((Bundle)message);
                        this.b.c((Bundle)message);
                        return;
                    }
                    case 6: {
                        this.b.g((CharSequence)message.obj);
                        return;
                    }
                    case 5: {
                        this.b.f((List)message.obj);
                        return;
                    }
                    case 4: {
                        this.b.a((d)message.obj);
                        return;
                    }
                    case 3: {
                        this.b.d((MediaMetadataCompat)message.obj);
                        return;
                    }
                    case 2: {
                        this.b.e((PlaybackStateCompat)message.obj);
                        return;
                    }
                    case 1: 
                }
                Bundle bundle = message.getData();
                MediaSessionCompat.a(bundle);
                this.b.j((String)message.obj, bundle);
            }
        }

        private static class c
        extends a.a {
            private final WeakReference<android.support.v4.media.session.MediaControllerCompat$a> e;

            c(android.support.v4.media.session.MediaControllerCompat$a a8) {
                this.e = new WeakReference<android.support.v4.media.session.MediaControllerCompat$a>(a8);
            }

            @Override
            public void A(String string, Bundle bundle) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(1, string, bundle);
                }
            }

            @Override
            public void G0(boolean bl) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(11, bl, null);
                }
            }

            @Override
            public void T0(boolean bl) throws RemoteException {
            }

            @Override
            public void V1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(2, playbackStateCompat, null);
                }
            }

            @Override
            public void j0() throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(13, null, null);
                }
            }

            @Override
            public void o1(int n8) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(12, n8, null);
                }
            }

            @Override
            public void v(int n8) throws RemoteException {
                android.support.v4.media.session.MediaControllerCompat$a a8 = (android.support.v4.media.session.MediaControllerCompat$a)this.e.get();
                if (a8 != null) {
                    a8.m(9, n8, null);
                }
            }
        }
    }

    static interface b {
        public void a(a var1);

        public boolean b(KeyEvent var1);

        public e c();

        public void d(a var1, Handler var2);

        public Bundle getExtras();

        public PlaybackStateCompat i();

        public int o();

        public MediaMetadataCompat s();

        public int x();
    }

    static class c
    extends MediaControllerImplApi21 {
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

        d(int n8, AudioAttributesCompat audioAttributesCompat, int n9, int n10, int n11) {
            this.a = n8;
            this.b = audioAttributesCompat;
            this.c = n9;
            this.d = n10;
            this.e = n11;
        }
    }

    public static abstract class e {
        e() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c(Uri var1, Bundle var2);

        public abstract void d(Uri var1, Bundle var2);

        public abstract void e(long var1);

        public abstract void f(float var1);

        public abstract void g(int var1);

        public abstract void h(int var1);

        public abstract void i();

        public abstract void j();

        public abstract void k();
    }

    static class f
    extends e {
        protected final MediaController.TransportControls a;

        f(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }

        @Override
        public void a() {
            this.a.pause();
        }

        @Override
        public void b() {
            this.a.play();
        }

        @Override
        public void c(Uri uri, Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals((Object)uri)) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", (Parcelable)uri);
                bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
                this.l("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override
        public void d(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", (Parcelable)uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            this.l("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }

        @Override
        public void e(long l8) {
            this.a.seekTo(l8);
        }

        @Override
        public void f(float f8) {
            if (f8 != 0.0f) {
                Bundle bundle = new Bundle();
                bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f8);
                this.l("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }

        @Override
        public void g(int n8) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", n8);
            this.l("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        @Override
        public void h(int n8) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", n8);
            this.l("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
        }

        @Override
        public void i() {
            this.a.skipToNext();
        }

        @Override
        public void j() {
            this.a.skipToPrevious();
        }

        @Override
        public void k() {
            this.a.stop();
        }

        public void l(String string, Bundle bundle) {
            MediaControllerCompat.n(string, bundle);
            this.a.sendCustomAction(string, bundle);
        }
    }

    static class g
    extends f {
        g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override
        public void c(Uri uri, Bundle bundle) {
            ax.g.a.a(this.a, uri, bundle);
        }
    }

    static class h
    extends g {
        h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override
        public void d(Uri uri, Bundle bundle) {
            ax.g.b.a(this.a, uri, bundle);
        }
    }

    static class i
    extends h {
        i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }

        @Override
        public void f(float f8) {
            if (f8 != 0.0f) {
                ax.g.c.a(this.a, f8);
                return;
            }
            throw new IllegalArgumentException("speed must not be zero");
        }
    }
}


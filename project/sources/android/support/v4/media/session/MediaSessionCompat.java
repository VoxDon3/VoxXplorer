package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import ax.x2.C3403a;
import ax.x2.InterfaceC3404b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    static int d;
    private final c a;
    private final MediaControllerCompat b;
    private final ArrayList<h> c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        private final long c0;
        private MediaSession.QueueItem d0;
        private final MediaDescriptionCompat q;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        public static QueueItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.q;
        }

        public long d() {
            return this.c0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem = this.d0;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem a2 = b.a((MediaDescription) this.q.e(), this.c0);
            this.d0 = a2;
            return a2;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.q + ", Id=" + this.c0 + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.q.writeToParcel(parcel, i);
            parcel.writeLong(this.c0);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.q = mediaDescriptionCompat;
            this.c0 = j;
            this.d0 = queueItem;
        }

        QueueItem(Parcel parcel) {
            this.q = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.c0 = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        ResultReceiver q;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.q = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.q.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        private final Object c0;
        private android.support.v4.media.session.b d0;
        private InterfaceC3404b e0;
        private final Object q;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public static Token a(Object obj) {
            return b(obj, null);
        }

        public static Token b(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public android.support.v4.media.session.b c() {
            android.support.v4.media.session.b bVar;
            synchronized (this.q) {
                bVar = this.d0;
            }
            return bVar;
        }

        public InterfaceC3404b d() {
            InterfaceC3404b interfaceC3404b;
            synchronized (this.q) {
                interfaceC3404b = this.e0;
            }
            return interfaceC3404b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.c0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.c0;
            if (obj2 == null) {
                return token.c0 == null;
            }
            Object obj3 = token.c0;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public void f(android.support.v4.media.session.b bVar) {
            synchronized (this.q) {
                this.d0 = bVar;
            }
        }

        public void g(InterfaceC3404b interfaceC3404b) {
            synchronized (this.q) {
                this.e0 = interfaceC3404b;
            }
        }

        public int hashCode() {
            Object obj = this.c0;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.c0, i);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, InterfaceC3404b interfaceC3404b) {
            this.q = new Object();
            this.c0 = obj;
            this.d0 = bVar;
            this.e0 = interfaceC3404b;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {
        private boolean c;
        a e;
        final Object a = new Object();
        final MediaSession.Callback b = new C0001b();
        WeakReference<c> d = new WeakReference<>(null);

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.a) {
                        cVar = b.this.d.get();
                        bVar = b.this;
                        aVar = bVar.e;
                    }
                    if (cVar == null || bVar != cVar.m() || aVar == null) {
                        return;
                    }
                    cVar.k((ax.M0.d) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.k(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        private class C0001b extends MediaSession.Callback {
            C0001b() {
            }

            private void a(c cVar) {
                cVar.k(null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.a) {
                    dVar = (d) b.this.d.get();
                }
                if (dVar == null || b.this != dVar.m()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String g = cVar.g();
                if (TextUtils.isEmpty(g)) {
                    g = "android.media.session.MediaController";
                }
                cVar.k(new ax.M0.d(g, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token c = b.c();
                        android.support.v4.media.session.b c2 = c.c();
                        if (c2 != null) {
                            asBinder = c2.asBinder();
                        }
                        ax.P.g.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        C3403a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", c.d());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        b.this.q((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        b.this.d(str, bundle, resultReceiver);
                    } else if (b.i != null) {
                        int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        if (i >= 0 && i < b.i.size()) {
                            queueItem = b.i.get(i);
                        }
                        if (queueItem != null) {
                            b.this.q(queueItem.c());
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        b.this.l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        b.this.p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        b.this.w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.f();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d b = b();
                if (b == null) {
                    return false;
                }
                c(b);
                boolean g = b.this.g(intent);
                a(b);
                return g || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.h();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.i();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.j(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.k(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.l(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.m();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.n(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.o(str, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d b = b();
                if (b == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b);
                b.this.p(uri, bundle);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.r();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.s(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.u(f);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.v(RatingCompat.a(rating));
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.z();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.A();
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.B(j);
                a(b);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d b = b();
                if (b == null) {
                    return;
                }
                c(b);
                b.this.C();
                a(b);
            }
        }

        public void A() {
        }

        public void B(long j) {
        }

        public void C() {
        }

        void D(c cVar, Handler handler) {
            synchronized (this.a) {
                try {
                    this.d = new WeakReference<>(cVar);
                    a aVar = this.e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (cVar != null && handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.e = aVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void a(c cVar, Handler handler) {
            if (this.c) {
                this.c = false;
                handler.removeMessages(1);
                PlaybackStateCompat i = cVar.i();
                long b = i == null ? 0L : i.b();
                boolean z = i != null && i.j() == 3;
                boolean z2 = (516 & b) != 0;
                boolean z3 = (b & 514) != 0;
                if (z && z3) {
                    h();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.a) {
                cVar = this.d.get();
                aVar = this.e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            ax.M0.d t = cVar.t();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.c) {
                aVar.removeMessages(1);
                this.c = false;
                PlaybackStateCompat i = cVar.i();
                if (((i == null ? 0L : i.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, t), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j) {
        }

        public void t(boolean z) {
        }

        public void u(float f) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i) {
        }

        public void y(int i) {
        }

        public void z() {
        }
    }

    interface c {
        Token c();

        void d();

        boolean e();

        void f(int i);

        String g();

        void h(b bVar, Handler handler);

        PlaybackStateCompat i();

        void j(int i);

        void k(ax.M0.d dVar);

        void l(CharSequence charSequence);

        b m();

        void n(MediaMetadataCompat mediaMetadataCompat);

        void o(PendingIntent pendingIntent);

        void p(int i);

        void q(List<QueueItem> list);

        void r(boolean z);

        void s(PlaybackStateCompat playbackStateCompat);

        void setExtras(Bundle bundle);

        ax.M0.d t();
    }

    static class d implements c {
        final MediaSession a;
        final a b;
        final Token c;
        Bundle e;
        PlaybackStateCompat h;
        List<QueueItem> i;
        MediaMetadataCompat j;
        int k;
        boolean l;
        int m;
        int n;
        b o;
        ax.M0.d p;
        final Object d = new Object();
        boolean f = false;
        final RemoteCallbackList<android.support.v4.media.session.a> g = new RemoteCallbackList<>();

        private static class a extends b.a {
            private final AtomicReference<d> e;

            a(d dVar) {
                this.e = new AtomicReference<>(dVar);
            }

            @Override // android.support.v4.media.session.b
            public void B0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void C0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D1(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void E0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void E1(boolean z) {
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo F1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H(android.support.v4.media.session.a aVar) {
                d dVar = this.e.get();
                if (dVar == null) {
                    return;
                }
                dVar.g.register(aVar, new ax.M0.d("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (dVar.d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean J() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void K(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void O(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void S(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean S0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String T1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean U() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void V0(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent W() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Y0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int a0() {
                d dVar = this.e.get();
                if (dVar != null) {
                    return dVar.k;
                }
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void a1(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f1(boolean z) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void g(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat i() {
                d dVar = this.e.get();
                if (dVar != null) {
                    return MediaSessionCompat.d(dVar.h, dVar.j);
                }
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void j(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String l() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void l1(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean m1() {
                d dVar = this.e.get();
                return dVar != null && dVar.l;
            }

            @Override // android.support.v4.media.session.b
            public CharSequence n0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int o() {
                d dVar = this.e.get();
                if (dVar != null) {
                    return dVar.m;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public void p(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void s1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void t(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle u0() {
                d dVar = this.e.get();
                if (dVar.e == null) {
                    return null;
                }
                return new Bundle(dVar.e);
            }

            @Override // android.support.v4.media.session.b
            public void v0(android.support.v4.media.session.a aVar) {
                d dVar = this.e.get();
                if (dVar == null) {
                    return;
                }
                dVar.g.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (dVar.d) {
                }
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> v1() {
                return null;
            }

            public void w() {
                this.e.set(null);
            }

            @Override // android.support.v4.media.session.b
            public int x() {
                d dVar = this.e.get();
                if (dVar != null) {
                    return dVar.n;
                }
                return -1;
            }

            @Override // android.support.v4.media.session.b
            public void x0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long y() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void y1() {
                throw new AssertionError();
            }
        }

        d(Context context, String str, InterfaceC3404b interfaceC3404b, Bundle bundle) {
            MediaSession a2 = a(context, str, bundle);
            this.a = a2;
            a aVar = new a(this);
            this.b = aVar;
            this.c = new Token(a2.getSessionToken(), aVar, interfaceC3404b);
            this.e = bundle;
            f(3);
        }

        public MediaSession a(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token c() {
            return this.c;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void d() {
            this.f = true;
            this.g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.a.setCallback(null);
            this.b.w();
            this.a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean e() {
            return this.a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        @SuppressLint({"WrongConstant"})
        public void f(int i) {
            this.a.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String g() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", null).invoke(this.a, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void h(b bVar, Handler handler) {
            synchronized (this.d) {
                try {
                    this.o = bVar;
                    this.a.setCallback(bVar == null ? null : bVar.b, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat i() {
            return this.h;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(int i) {
            if (this.m != i) {
                this.m = i;
                synchronized (this.d) {
                    for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.g.getBroadcastItem(beginBroadcast).v(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void k(ax.M0.d dVar) {
            synchronized (this.d) {
                this.p = dVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(CharSequence charSequence) {
            this.a.setQueueTitle(charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b m() {
            b bVar;
            synchronized (this.d) {
                bVar = this.o;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(MediaMetadataCompat mediaMetadataCompat) {
            this.j = mediaMetadataCompat;
            this.a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.g());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(int i) {
            if (this.n != i) {
                this.n = i;
                synchronized (this.d) {
                    for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.g.getBroadcastItem(beginBroadcast).o1(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.g.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void q(List<QueueItem> list) {
            this.i = list;
            if (list == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().e());
            }
            this.a.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void r(boolean z) {
            this.a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void s(PlaybackStateCompat playbackStateCompat) {
            this.h = playbackStateCompat;
            synchronized (this.d) {
                for (int beginBroadcast = this.g.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.g.getBroadcastItem(beginBroadcast).V1(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.g.finishBroadcast();
            }
            this.a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.g());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public ax.M0.d t() {
            ax.M0.d dVar;
            synchronized (this.d) {
                dVar = this.p;
            }
            return dVar;
        }
    }

    static class e extends d {
        e(Context context, String str, InterfaceC3404b interfaceC3404b, Bundle bundle) {
            super(context, str, interfaceC3404b, bundle);
        }
    }

    static class g extends f {
        g(Context context, String str, InterfaceC3404b interfaceC3404b, Bundle bundle) {
            super(context, str, interfaceC3404b, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public MediaSession a(Context context, String str, Bundle bundle) {
            return ax.g.e.a(context, str, bundle);
        }
    }

    public interface h {
        void a();
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.i() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.j() != 3 && playbackStateCompat.j() != 4 && playbackStateCompat.j() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.e() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long f2 = ((long) (playbackStateCompat.f() * (elapsedRealtime - r0))) + playbackStateCompat.i();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.f("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.d(playbackStateCompat).f(playbackStateCompat.j(), (j < 0 || f2 <= j) ? f2 < 0 ? 0L : f2 : j, playbackStateCompat.f(), elapsedRealtime).a();
    }

    public static Bundle r(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.b;
    }

    public Token c() {
        return this.a.c();
    }

    public boolean e() {
        return this.a.e();
    }

    public void f() {
        this.a.d();
    }

    public void g(boolean z) {
        this.a.r(z);
        ArrayList<h> arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            h hVar = arrayList.get(i);
            i++;
            hVar.a();
        }
    }

    public void h(b bVar) {
        i(bVar, null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.a.h(null, null);
            return;
        }
        c cVar = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.h(bVar, handler);
    }

    public void j(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    public void k(int i) {
        this.a.f(i);
    }

    public void l(MediaMetadataCompat mediaMetadataCompat) {
        this.a.n(mediaMetadataCompat);
    }

    public void m(PlaybackStateCompat playbackStateCompat) {
        this.a.s(playbackStateCompat);
    }

    public void n(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.d()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.d(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.d()));
            }
        }
        this.a.q(list);
    }

    public void o(CharSequence charSequence) {
        this.a.l(charSequence);
    }

    public void p(int i) {
        this.a.j(i);
    }

    public void q(int i) {
        this.a.p(i);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, InterfaceC3404b interfaceC3404b) {
        this.c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = MediaButtonReceiver.a(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    this.a = new g(context, str, interfaceC3404b, bundle);
                } else if (i >= 28) {
                    this.a = new f(context, str, interfaceC3404b, bundle);
                } else if (i >= 22) {
                    this.a = new e(context, str, interfaceC3404b, bundle);
                } else {
                    this.a = new d(context, str, interfaceC3404b, bundle);
                }
                i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.a.o(pendingIntent);
                this.b = new MediaControllerCompat(context, this);
                if (d == 0) {
                    d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    static class f extends e {
        f(Context context, String str, InterfaceC3404b interfaceC3404b, Bundle bundle) {
            super(context, str, interfaceC3404b, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public final ax.M0.d t() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.a.getCurrentControllerInfo();
            return new ax.M0.d(currentControllerInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.c
        public void k(ax.M0.d dVar) {
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 */
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
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
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
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat {
    static int d;
    private final c a;
    private final MediaControllerCompat b;
    private final ArrayList<h> c = new ArrayList();

    public MediaSessionCompat(Context context, String string) {
        this(context, string, null, null);
    }

    public MediaSessionCompat(Context context, String string, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, string, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String string, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, string, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String string, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, ax.x2.b b8) {
        if (context != null) {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                int n8;
                ComponentName componentName2 = componentName;
                if (componentName == null) {
                    componentName2 = componentName = MediaButtonReceiver.a(context);
                    if (componentName == null) {
                        Log.w((String)"MediaSessionCompat", (String)"Couldn't find a unique registered media button receiver in the given context.");
                        componentName2 = componentName;
                    }
                }
                componentName = pendingIntent;
                if (componentName2 != null) {
                    componentName = pendingIntent;
                    if (pendingIntent == null) {
                        componentName = new Intent("android.intent.action.MEDIA_BUTTON");
                        componentName.setComponent(componentName2);
                        n8 = Build.VERSION.SDK_INT >= 31 ? 0x2000000 : 0;
                        componentName = PendingIntent.getBroadcast((Context)context, (int)0, (Intent)componentName, (int)n8);
                    }
                }
                this.a = (n8 = Build.VERSION.SDK_INT) >= 29 ? new g(context, string, b8, bundle) : (n8 >= 28 ? new f(context, string, b8, bundle) : (n8 >= 22 ? new e(context, string, b8, bundle) : new d(context, string, b8, bundle)));
                string = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
                string = new Handler((Looper)string);
                this.i(new b(this){
                    final MediaSessionCompat f;
                    {
                        this.f = mediaSessionCompat;
                    }
                }, (Handler)string);
                this.a.o((PendingIntent)componentName);
                this.b = new MediaControllerCompat(context, this);
                if (d == 0) {
                    d = (int)(TypedValue.applyDimension((int)1, (float)320.0f, (DisplayMetrics)context.getResources().getDisplayMetrics()) + 0.5f);
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat playbackStateCompat2;
        block7: {
            long l8;
            long l9;
            block9: {
                block8: {
                    playbackStateCompat2 = playbackStateCompat;
                    if (playbackStateCompat == null) break block7;
                    l9 = playbackStateCompat.i();
                    l8 = -1L;
                    if (l9 != -1L) break block8;
                    playbackStateCompat2 = playbackStateCompat;
                    break block7;
                }
                if (playbackStateCompat.j() == 3 || playbackStateCompat.j() == 4) break block9;
                playbackStateCompat2 = playbackStateCompat;
                if (playbackStateCompat.j() != 5) break block7;
            }
            l9 = playbackStateCompat.e();
            playbackStateCompat2 = playbackStateCompat;
            if (l9 > 0L) {
                long l10 = SystemClock.elapsedRealtime();
                long l11 = (long)(playbackStateCompat.f() * (float)(l10 - l9)) + playbackStateCompat.i();
                l9 = l8;
                if (mediaMetadataCompat != null) {
                    l9 = l8;
                    if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
                        l9 = mediaMetadataCompat.f("android.media.metadata.DURATION");
                    }
                }
                if (l9 < 0L || l11 <= l9) {
                    l9 = l11 < 0L ? 0L : l11;
                }
                playbackStateCompat2 = new PlaybackStateCompat.d(playbackStateCompat).f(playbackStateCompat.j(), l9, playbackStateCompat.f(), l10).a();
            }
        }
        return playbackStateCompat2;
    }

    public static Bundle r(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        MediaSessionCompat.a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        }
        catch (BadParcelableException badParcelableException) {
            Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the data.");
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

    public void g(boolean bl) {
        this.a.r(bl);
        ArrayList<h> arrayList = this.c;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            h h8 = arrayList.get(i8);
            h8.a();
        }
    }

    public void h(b b8) {
        this.i(b8, null);
    }

    public void i(b b8, Handler handler) {
        if (b8 == null) {
            this.a.h(null, null);
            return;
        }
        c c8 = this.a;
        if (handler == null) {
            handler = new Handler();
        }
        c8.h(b8, handler);
    }

    public void j(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    public void k(int n8) {
        this.a.f(n8);
    }

    public void l(MediaMetadataCompat mediaMetadataCompat) {
        this.a.n(mediaMetadataCompat);
    }

    public void m(PlaybackStateCompat playbackStateCompat) {
        this.a.s(playbackStateCompat);
    }

    public void n(List<QueueItem> list) {
        if (list != null) {
            HashSet<Long> hashSet = new HashSet<Long>();
            for (QueueItem queueItem : list) {
                if (queueItem != null) {
                    if (hashSet.contains(queueItem.d())) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Found duplicate queue id: ");
                        stringBuilder.append(queueItem.d());
                        Log.e((String)"MediaSessionCompat", (String)stringBuilder.toString(), (Throwable)new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(queueItem.d());
                    continue;
                }
                throw new IllegalArgumentException("queue shouldn't have null items");
            }
        }
        this.a.q(list);
    }

    public void o(CharSequence charSequence) {
        this.a.l(charSequence);
    }

    public void p(int n8) {
        this.a.j(n8);
    }

    public void q(int n8) {
        this.a.p(n8);
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static final class QueueItem
    implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>(){

            public QueueItem a(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public QueueItem[] b(int n8) {
                return new QueueItem[n8];
            }
        };
        private final long c0;
        private MediaSession.QueueItem d0;
        private final MediaDescriptionCompat q;

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long l8) {
            if (mediaDescriptionCompat != null) {
                if (l8 != -1L) {
                    this.q = mediaDescriptionCompat;
                    this.c0 = l8;
                    this.d0 = queueItem;
                    return;
                }
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            throw new IllegalArgumentException("Description cannot be null");
        }

        QueueItem(Parcel parcel) {
            this.q = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.c0 = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long l8) {
            this(null, mediaDescriptionCompat, l8);
        }

        public static QueueItem a(Object object) {
            if (object != null) {
                object = (MediaSession.QueueItem)object;
                return new QueueItem((MediaSession.QueueItem)object, MediaDescriptionCompat.a(b.b((MediaSession.QueueItem)object)), b.c((MediaSession.QueueItem)object));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> object) {
            if (object != null) {
                ArrayList<QueueItem> arrayList = new ArrayList<QueueItem>(object.size());
                object = object.iterator();
                while (object.hasNext()) {
                    arrayList.add(QueueItem.a(object.next()));
                }
                return arrayList;
            }
            return null;
        }

        public MediaDescriptionCompat c() {
            return this.q;
        }

        public long d() {
            return this.c0;
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem;
            MediaSession.QueueItem queueItem2 = queueItem = this.d0;
            if (queueItem == null) {
                this.d0 = queueItem2 = b.a((MediaDescription)this.q.e(), this.c0);
            }
            return queueItem2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.q);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.c0);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            this.q.writeToParcel(parcel, n8);
            parcel.writeLong(this.c0);
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long l8) {
                return new MediaSession.QueueItem(mediaDescription, l8);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    static final class ResultReceiverWrapper
    implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>(){

            public ResultReceiverWrapper a(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] b(int n8) {
                return new ResultReceiverWrapper[n8];
            }
        };
        ResultReceiver q;

        ResultReceiverWrapper(Parcel parcel) {
            this.q = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            this.q.writeToParcel(parcel, n8);
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static final class Token
    implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>(){

            public Token a(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            public Token[] b(int n8) {
                return new Token[n8];
            }
        };
        private final Object c0;
        private android.support.v4.media.session.b d0;
        private ax.x2.b e0;
        private final Object q = new Object();

        Token(Object object) {
            this(object, null, null);
        }

        Token(Object object, android.support.v4.media.session.b b8) {
            this(object, b8, null);
        }

        Token(Object object, android.support.v4.media.session.b b8, ax.x2.b b9) {
            this.c0 = object;
            this.d0 = b8;
            this.e0 = b9;
        }

        public static Token a(Object object) {
            return Token.b(object, null);
        }

        public static Token b(Object object, android.support.v4.media.session.b b8) {
            if (object != null) {
                if (object instanceof MediaSession.Token) {
                    return new Token(object, b8);
                }
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public android.support.v4.media.session.b c() {
            Object object = this.q;
            synchronized (object) {
                return this.d0;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public ax.x2.b d() {
            Object object = this.q;
            synchronized (object) {
                return this.e0;
            }
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            return this.c0;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Token)) {
                return false;
            }
            Object object2 = (Token)object;
            object = this.c0;
            if (object == null) {
                return ((Token)object2).c0 == null;
            }
            object2 = ((Token)object2).c0;
            if (object2 == null) {
                return false;
            }
            return object.equals(object2);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void f(android.support.v4.media.session.b b8) {
            Object object = this.q;
            synchronized (object) {
                this.d0 = b8;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void g(ax.x2.b b8) {
            Object object = this.q;
            synchronized (object) {
                this.e0 = b8;
                return;
            }
        }

        public int hashCode() {
            Object object = this.c0;
            if (object == null) {
                return 0;
            }
            return object.hashCode();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeParcelable((Parcelable)this.c0, n8);
        }
    }

    public static abstract class android.support.v4.media.session.MediaSessionCompat$b {
        final Object a = new Object();
        final MediaSession.Callback b = new b(this);
        private boolean c;
        WeakReference<c> d = new WeakReference<Object>(null);
        a e;

        public void A() {
        }

        public void B(long l8) {
        }

        public void C() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void D(c c8, Handler handler) {
            Object object = this.a;
            synchronized (object) {
                Throwable throwable2;
                block5: {
                    Object var4_6;
                    Object object2;
                    block4: {
                        try {
                            object2 = new Object(c8);
                            this.d = object2;
                            object2 = this.e;
                            var4_6 = null;
                            if (object2 == null) break block4;
                            object2.removeCallbacksAndMessages(null);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2 = var4_6;
                    if (c8 != null) {
                        object2 = handler == null ? var4_6 : new a(this, handler.getLooper());
                    }
                    this.e = object2;
                    return;
                }
                throw throwable2;
            }
        }

        void a(c object, Handler handler) {
            if (this.c) {
                boolean bl = false;
                this.c = false;
                handler.removeMessages(1);
                object = object.i();
                long l8 = object == null ? 0L : ((PlaybackStateCompat)object).b();
                boolean bl2 = object != null && ((PlaybackStateCompat)object).j() == 3;
                boolean bl3 = (0x204L & l8) != 0L;
                if ((l8 & 0x202L) != 0L) {
                    bl = true;
                }
                if (bl2 && bl) {
                    this.h();
                    return;
                }
                if (!bl2 && bl3) {
                    this.i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
        }

        public void d(String string, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String string, Bundle bundle) {
        }

        public void f() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean g(Intent object) {
            a a8;
            c c8;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            Object object2 = this.a;
            synchronized (object2) {
                c8 = (c)this.d.get();
                a8 = this.e;
            }
            if (c8 == null) return false;
            if (a8 == null) {
                return false;
            }
            if ((object = (KeyEvent)object.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) return false;
            if (object.getAction() != 0) {
                return false;
            }
            object2 = c8.t();
            int n8 = object.getKeyCode();
            if (n8 != 79 && n8 != 85) {
                this.a(c8, a8);
                return false;
            }
            if (object.getRepeatCount() != 0) {
                this.a(c8, a8);
                return true;
            }
            if (!this.c) {
                this.c = true;
                a8.sendMessageDelayed(a8.obtainMessage(1, object2), ViewConfiguration.getDoubleTapTimeout());
                return true;
            }
            a8.removeMessages(1);
            this.c = false;
            object = c8.i();
            long l8 = object == null ? 0L : ((PlaybackStateCompat)object).b();
            if ((l8 & 0x20L) == 0L) return true;
            this.z();
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String string, Bundle bundle) {
        }

        public void k(String string, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String string, Bundle bundle) {
        }

        public void o(String string, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long l8) {
        }

        public void t(boolean bl) {
        }

        public void u(float f8) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int n8) {
        }

        public void y(int n8) {
        }

        public void z() {
        }

        private class a
        extends Handler {
            final android.support.v4.media.session.MediaSessionCompat$b a;

            a(android.support.v4.media.session.MediaSessionCompat$b b8, Looper looper) {
                this.a = b8;
                super(looper);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void handleMessage(Message message) {
                a a8;
                android.support.v4.media.session.MediaSessionCompat$b b8;
                c c8;
                if (message.what != 1) return;
                Object object = this.a.a;
                synchronized (object) {
                    c8 = (c)this.a.d.get();
                    b8 = this.a;
                    a8 = b8.e;
                }
                if (c8 == null) return;
                if (b8 != c8.m()) return;
                if (a8 == null) {
                    return;
                }
                c8.k((ax.M0.d)message.obj);
                this.a.a(c8, a8);
                c8.k(null);
            }
        }

        private class b
        extends MediaSession.Callback {
            final android.support.v4.media.session.MediaSessionCompat$b a;

            b(android.support.v4.media.session.MediaSessionCompat$b b8) {
                this.a = b8;
            }

            private void a(c c8) {
                c8.k(null);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            private d b() {
                Object object = this.a.a;
                // MONITORENTER : object
                d d8 = (d)this.a.d.get();
                // MONITOREXIT : object
                if (d8 == null) return null;
                if (this.a != d8.m()) return null;
                return d8;
            }

            private void c(c c8) {
                String string;
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String string2 = string = c8.g();
                if (TextUtils.isEmpty((CharSequence)string)) {
                    string2 = "android.media.session.MediaController";
                }
                c8.k(new ax.M0.d(string2, -1, -1));
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCommand(String object, Bundle object2, ResultReceiver resultReceiver) {
                d d8;
                block11: {
                    d8 = this.b();
                    if (d8 == null) {
                        return;
                    }
                    MediaSessionCompat.a((Bundle)object2);
                    this.c(d8);
                    try {
                        boolean bl = ((String)object).equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
                        Bundle bundle = null;
                        Object var6_8 = null;
                        if (bl) {
                            bundle = new Bundle();
                            object2 = d8.c();
                            object = ((Token)object2).c();
                            object = object == null ? var6_8 : object.asBinder();
                            ax.P.g.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", (IBinder)object);
                            ax.x2.a.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", ((Token)object2).d());
                            resultReceiver.send(0, bundle);
                            break block11;
                        }
                        bl = ((String)object).equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
                        if (bl) {
                            this.a.b((MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                            break block11;
                        }
                        bl = ((String)object).equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
                        if (bl) {
                            this.a.c((MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), object2.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                            break block11;
                        }
                        if (((String)object).equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            this.a.q((MediaDescriptionCompat)object2.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                            break block11;
                        }
                        if (((String)object).equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            if (d8.i == null) break block11;
                            int n8 = object2.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            object = bundle;
                            if (n8 >= 0) {
                                object = bundle;
                                if (n8 < d8.i.size()) {
                                    object = d8.i.get(n8);
                                }
                            }
                            if (object != null) {
                                this.a.q(((QueueItem)object).c());
                            }
                            break block11;
                        }
                        this.a.d((String)object, (Bundle)object2, resultReceiver);
                    }
                    catch (BadParcelableException badParcelableException) {
                        Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the extra data.");
                    }
                }
                this.a(d8);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCustomAction(String object, Bundle bundle) {
                d d8;
                block14: {
                    d8 = this.b();
                    if (d8 == null) {
                        return;
                    }
                    MediaSessionCompat.a(bundle);
                    this.c(d8);
                    try {
                        boolean bl = ((String)object).equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                        if (bl) {
                            object = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            this.a.l((Uri)object, bundle);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.PREPARE")) {
                            this.a.m();
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            object = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            this.a.n((String)object, bundle);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            object = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            this.a.o((String)object, bundle);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            object = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            this.a.p((Uri)object, bundle);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            bl = bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                            this.a.t(bl);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            int n8 = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                            this.a.x(n8);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            int n9 = bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                            this.a.y(n9);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.SET_RATING")) {
                            object = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                            bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle);
                            this.a.w((RatingCompat)object, bundle);
                            break block14;
                        }
                        if (((String)object).equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            float f8 = bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                            this.a.u(f8);
                        } else {
                            this.a.e((String)object, bundle);
                        }
                    }
                    catch (BadParcelableException badParcelableException) {
                        Log.e((String)"MediaSessionCompat", (String)"Could not unparcel the data.");
                    }
                }
                this.a(d8);
            }

            public void onFastForward() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.f();
                this.a(d8);
            }

            public boolean onMediaButtonEvent(Intent intent) {
                d d8 = this.b();
                if (d8 == null) {
                    return false;
                }
                this.c(d8);
                boolean bl = this.a.g(intent);
                this.a(d8);
                return bl || super.onMediaButtonEvent(intent);
                {
                }
            }

            public void onPause() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.h();
                this.a(d8);
            }

            public void onPlay() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.i();
                this.a(d8);
            }

            public void onPlayFromMediaId(String string, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.j(string, bundle);
                this.a(d8);
            }

            public void onPlayFromSearch(String string, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.k(string, bundle);
                this.a(d8);
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.l(uri, bundle);
                this.a(d8);
            }

            public void onPrepare() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.m();
                this.a(d8);
            }

            public void onPrepareFromMediaId(String string, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.n(string, bundle);
                this.a(d8);
            }

            public void onPrepareFromSearch(String string, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.o(string, bundle);
                this.a(d8);
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                this.c(d8);
                this.a.p(uri, bundle);
                this.a(d8);
            }

            public void onRewind() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.r();
                this.a(d8);
            }

            public void onSeekTo(long l8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.s(l8);
                this.a(d8);
            }

            public void onSetPlaybackSpeed(float f8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.u(f8);
                this.a(d8);
            }

            public void onSetRating(Rating rating) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.v(RatingCompat.a(rating));
                this.a(d8);
            }

            public void onSkipToNext() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.z();
                this.a(d8);
            }

            public void onSkipToPrevious() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.A();
                this.a(d8);
            }

            public void onSkipToQueueItem(long l8) {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.B(l8);
                this.a(d8);
            }

            public void onStop() {
                d d8 = this.b();
                if (d8 == null) {
                    return;
                }
                this.c(d8);
                this.a.C();
                this.a(d8);
            }
        }
    }

    static interface c {
        public Token c();

        public void d();

        public boolean e();

        public void f(int var1);

        public String g();

        public void h(b var1, Handler var2);

        public PlaybackStateCompat i();

        public void j(int var1);

        public void k(ax.M0.d var1);

        public void l(CharSequence var1);

        public b m();

        public void n(MediaMetadataCompat var1);

        public void o(PendingIntent var1);

        public void p(int var1);

        public void q(List<QueueItem> var1);

        public void r(boolean var1);

        public void s(PlaybackStateCompat var1);

        public void setExtras(Bundle var1);

        public ax.M0.d t();
    }

    static class d
    implements c {
        final MediaSession a;
        final a b;
        final Token c;
        final Object d = new Object();
        Bundle e;
        boolean f = false;
        final RemoteCallbackList<android.support.v4.media.session.a> g = new RemoteCallbackList();
        PlaybackStateCompat h;
        List<QueueItem> i;
        MediaMetadataCompat j;
        int k;
        boolean l;
        int m;
        int n;
        b o;
        ax.M0.d p;

        d(Context context, String object, ax.x2.b b8, Bundle bundle) {
            context = this.a(context, (String)object, bundle);
            this.a = context;
            this.b = object = new a(this);
            this.c = new Token(context.getSessionToken(), (android.support.v4.media.session.b)object, b8);
            this.e = bundle;
            this.f(3);
        }

        public MediaSession a(Context context, String string, Bundle bundle) {
            return new MediaSession(context, string);
        }

        @Override
        public Token c() {
            return this.c;
        }

        @Override
        public void d() {
            block4: {
                this.f = true;
                this.g.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    Field field = this.a.getClass().getDeclaredField("mCallback");
                    ((AccessibleObject)field).setAccessible(true);
                    field = (Handler)field.get(this.a);
                    if (field == null) break block4;
                    try {
                        field.removeCallbacksAndMessages(null);
                    }
                    catch (Exception exception) {
                        Log.w((String)"MediaSessionCompat", (String)"Exception happened while accessing MediaSession.mCallback.", (Throwable)exception);
                    }
                }
            }
            this.a.setCallback(null);
            this.b.w();
            this.a.release();
        }

        @Override
        public boolean e() {
            return this.a.isActive();
        }

        @Override
        @SuppressLint(value={"WrongConstant"})
        public void f(int n8) {
            this.a.setFlags(n8 | 3);
        }

        @Override
        public String g() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                String string = (String)this.a.getClass().getMethod("getCallingPackage", null).invoke(this.a, null);
                return string;
            }
            catch (Exception exception) {
                Log.e((String)"MediaSessionCompat", (String)"Cannot execute MediaSession.getCallingPackage()", (Throwable)exception);
                return null;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void h(b b8, Handler handler) {
            Object object = this.d;
            synchronized (object) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            this.o = b8;
                            MediaSession mediaSession = this.a;
                            MediaSession.Callback callback = b8 == null ? null : b8.b;
                            mediaSession.setCallback(callback, handler);
                            if (b8 == null) break block3;
                            b8.D(this, handler);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        @Override
        public PlaybackStateCompat i() {
            return this.h;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void j(int n8) {
            if (this.m == n8) return;
            this.m = n8;
            Object object = this.d;
            synchronized (object) {
                try {
                    int n9 = this.g.beginBroadcast() - 1;
                    while (true) {
                        if (n9 >= 0) {
                            android.support.v4.media.session.a a8 = (android.support.v4.media.session.a)this.g.getBroadcastItem(n9);
                            a8.v(n8);
                        }
                        this.g.finishBroadcast();
                        return;
                        catch (RemoteException remoteException) {}
                        --n9;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void k(ax.M0.d d8) {
            Object object = this.d;
            synchronized (object) {
                this.p = d8;
                return;
            }
        }

        @Override
        public void l(CharSequence charSequence) {
            this.a.setQueueTitle(charSequence);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public b m() {
            Object object = this.d;
            synchronized (object) {
                return this.o;
            }
        }

        @Override
        public void n(MediaMetadataCompat mediaMetadataCompat) {
            this.j = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            mediaMetadataCompat = mediaMetadataCompat == null ? null : (MediaMetadata)mediaMetadataCompat.g();
            mediaSession.setMetadata((MediaMetadata)mediaMetadataCompat);
        }

        @Override
        public void o(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void p(int n8) {
            if (this.n == n8) return;
            this.n = n8;
            Object object = this.d;
            synchronized (object) {
                try {
                    int n9 = this.g.beginBroadcast() - 1;
                    while (true) {
                        if (n9 >= 0) {
                            android.support.v4.media.session.a a8 = (android.support.v4.media.session.a)this.g.getBroadcastItem(n9);
                            a8.o1(n8);
                        }
                        this.g.finishBroadcast();
                        return;
                        catch (RemoteException remoteException) {}
                        --n9;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        @Override
        public void q(List<QueueItem> object) {
            this.i = object;
            if (object == null) {
                this.a.setQueue(null);
                return;
            }
            ArrayList<MediaSession.QueueItem> arrayList = new ArrayList<MediaSession.QueueItem>(object.size());
            object = object.iterator();
            while (object.hasNext()) {
                arrayList.add((MediaSession.QueueItem)((QueueItem)object.next()).e());
            }
            this.a.setQueue(arrayList);
        }

        @Override
        public void r(boolean bl) {
            this.a.setActive(bl);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void s(PlaybackStateCompat playbackStateCompat) {
            this.h = playbackStateCompat;
            Object object = this.d;
            synchronized (object) {
                try {
                    int n8 = this.g.beginBroadcast() - 1;
                    while (true) {
                        if (n8 >= 0) {
                            android.support.v4.media.session.a a8 = (android.support.v4.media.session.a)this.g.getBroadcastItem(n8);
                            a8.V1(playbackStateCompat);
                        }
                        this.g.finishBroadcast();
                        // MONITOREXIT @DISABLED, blocks:[0, 4, 7] lbl13 : MonitorExitStatement: MONITOREXIT : var3_3
                        object = this.a;
                        playbackStateCompat = playbackStateCompat == null ? null : (PlaybackState)playbackStateCompat.g();
                        object.setPlaybackState((PlaybackState)playbackStateCompat);
                        return;
                        catch (RemoteException remoteException) {}
                        --n8;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        @Override
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public ax.M0.d t() {
            Object object = this.d;
            synchronized (object) {
                return this.p;
            }
        }

        private static class a
        extends b.a {
            private final AtomicReference<d> e;

            a(d d8) {
                this.e = new AtomicReference<d>(d8);
            }

            @Override
            public void B0(String string, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void C0() {
                throw new AssertionError();
            }

            @Override
            public void D1(long l8) {
                throw new AssertionError();
            }

            @Override
            public void E0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void E1(boolean bl) {
            }

            @Override
            public ParcelableVolumeInfo F1() {
                throw new AssertionError();
            }

            @Override
            public void G(String string, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void H(android.support.v4.media.session.a object) {
                d d8 = this.e.get();
                if (d8 == null) {
                    return;
                }
                ax.M0.d d9 = new ax.M0.d("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
                d8.g.register((IInterface)object, (Object)d9);
                object = d8.d;
                // MONITORENTER : object
                // MONITOREXIT : object
            }

            @Override
            public boolean J() {
                return false;
            }

            @Override
            public void K(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override
            public void M(int n8, int n9, String string) {
                throw new AssertionError();
            }

            @Override
            public void O(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void S(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override
            public boolean S0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override
            public String T1() {
                throw new AssertionError();
            }

            @Override
            public boolean U() {
                throw new AssertionError();
            }

            @Override
            public void V(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override
            public void V0(int n8, int n9, String string) {
                throw new AssertionError();
            }

            @Override
            public PendingIntent W() {
                throw new AssertionError();
            }

            @Override
            public void Y0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public int a0() {
                d d8 = this.e.get();
                if (d8 != null) {
                    return d8.k;
                }
                return 0;
            }

            @Override
            public void a1(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
                throw new AssertionError();
            }

            @Override
            public void c0(String string, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void f() {
                throw new AssertionError();
            }

            @Override
            public void f1(boolean bl) {
                throw new AssertionError();
            }

            @Override
            public void g(float f8) {
                throw new AssertionError();
            }

            @Override
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override
            public PlaybackStateCompat i() {
                d d8 = this.e.get();
                if (d8 != null) {
                    return MediaSessionCompat.d(d8.h, d8.j);
                }
                return null;
            }

            @Override
            public void j(int n8) {
                throw new AssertionError();
            }

            @Override
            public void k() throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public String l() {
                throw new AssertionError();
            }

            @Override
            public void l1(int n8) {
                throw new AssertionError();
            }

            @Override
            public void m() throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public boolean m1() {
                d d8 = this.e.get();
                return d8 != null && d8.l;
            }

            @Override
            public CharSequence n0() {
                throw new AssertionError();
            }

            @Override
            public void next() {
                throw new AssertionError();
            }

            @Override
            public int o() {
                d d8 = this.e.get();
                if (d8 != null) {
                    return d8.m;
                }
                return -1;
            }

            @Override
            public void p(int n8) throws RemoteException {
                throw new AssertionError();
            }

            @Override
            public void previous() {
                throw new AssertionError();
            }

            @Override
            public MediaMetadataCompat s() {
                throw new AssertionError();
            }

            @Override
            public void s0(String string, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public void s1(String string, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override
            public void stop() {
                throw new AssertionError();
            }

            @Override
            public void t(long l8) {
                throw new AssertionError();
            }

            @Override
            public Bundle u0() {
                d d8 = this.e.get();
                if (d8.e == null) {
                    return null;
                }
                return new Bundle(d8.e);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public void v0(android.support.v4.media.session.a object) {
                d d8 = this.e.get();
                if (d8 == null) {
                    return;
                }
                d8.g.unregister((IInterface)object);
                Binder.getCallingPid();
                Binder.getCallingUid();
                object = d8.d;
                // MONITORENTER : object
                // MONITOREXIT : object
            }

            @Override
            public List<QueueItem> v1() {
                return null;
            }

            public void w() {
                this.e.set(null);
            }

            @Override
            public int x() {
                d d8 = this.e.get();
                if (d8 != null) {
                    return d8.n;
                }
                return -1;
            }

            @Override
            public void x0(String string, Bundle bundle) {
                throw new AssertionError();
            }

            @Override
            public long y() {
                throw new AssertionError();
            }

            @Override
            public void y1() {
                throw new AssertionError();
            }
        }
    }

    static class e
    extends d {
        e(Context context, String string, ax.x2.b b8, Bundle bundle) {
            super(context, string, b8, bundle);
        }
    }

    static class f
    extends e {
        f(Context context, String string, ax.x2.b b8, Bundle bundle) {
            super(context, string, b8, bundle);
        }

        @Override
        public void k(ax.M0.d d8) {
        }

        @Override
        public final ax.M0.d t() {
            return new ax.M0.d(ax.g.d.a(this.a));
        }
    }

    static class g
    extends f {
        g(Context context, String string, ax.x2.b b8, Bundle bundle) {
            super(context, string, b8, bundle);
        }

        @Override
        public MediaSession a(Context context, String string, Bundle bundle) {
            return ax.g.e.a(context, string, bundle);
        }
    }

    public static interface h {
        public void a();
    }
}


package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import ax.h.C2140b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    private final d a;

    private static class CustomActionResultReceiver extends C2140b {
        @Override // ax.h.C2140b
        protected void a(int i, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends C2140b {
        @Override // ax.h.C2140b
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.r(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends C2140b {
        @Override // ax.h.C2140b
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.r(bundle);
            }
            if (i != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a {
        static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    private static class b extends Handler {
        private final WeakReference<h> a;
        private WeakReference<Messenger> b;

        b(h hVar) {
            this.a = new WeakReference<>(hVar);
        }

        void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            h hVar = this.a.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    hVar.d(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    return;
                }
                if (i == 2) {
                    hVar.h(messenger);
                    return;
                }
                if (i == 3) {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    hVar.e(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    return;
                }
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    hVar.h(messenger);
                }
            }
        }
    }

    public static class c {
        final MediaBrowser.ConnectionCallback a = new a();
        b b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.i();
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.j();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.f();
                }
                c.this.c();
            }
        }

        interface b {
            void f();

            void i();

            void j();
        }

        public void a() {
            throw null;
        }

        public void b() {
        }

        public void c() {
        }

        void d(b bVar) {
            this.b = bVar;
        }
    }

    interface d {
        boolean a();

        void b();

        MediaSessionCompat.Token c();

        void g();
    }

    static class e implements d, h, c.b {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final b d = new b(this);
        private final ax.B.a<String, j> e = new ax.B.a<>();
        protected int f;
        protected i g;
        protected Messenger h;
        private MediaSessionCompat.Token i;
        private Bundle j;

        e(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.d(this);
            this.b = new MediaBrowser(context, componentName, cVar.a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public boolean a() {
            return this.b.isConnected();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void b() {
            Messenger messenger;
            i iVar = this.g;
            if (iVar != null && (messenger = this.h) != null) {
                try {
                    iVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public MediaSessionCompat.Token c() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void d(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            j jVar = this.e.get(str);
            if (jVar == null) {
                if (MediaBrowserCompat.b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            k a = jVar.a(bundle);
            if (a != null) {
                if (bundle == null) {
                    if (list == null) {
                        a.c(str);
                        return;
                    }
                    this.j = bundle2;
                    a.a(str, list);
                    this.j = null;
                    return;
                }
                if (list == null) {
                    a.d(str, bundle);
                    return;
                }
                this.j = bundle2;
                a.b(str, list, bundle);
                this.j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void f() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void g() {
            this.b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void h(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void i() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f = extras.getInt("extra_service_version", 0);
                IBinder a = ax.P.g.a(extras, "extra_messenger");
                if (a != null) {
                    this.g = new i(a, this.c);
                    Messenger messenger = new Messenger(this.d);
                    this.h = messenger;
                    this.d.a(messenger);
                    try {
                        this.g.a(this.a, this.h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b r = b.a.r(ax.P.g.a(extras, "extra_session_binder"));
                if (r != null) {
                    this.i = MediaSessionCompat.Token.b(this.b.getSessionToken(), r);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void j() {
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    interface h {
        void d(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void e(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void h(Messenger messenger);
    }

    private static class i {
        private Messenger a;
        private Bundle b;

        public i(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            b(7, null, messenger);
        }
    }

    private static class j {
        private final List<k> a = new ArrayList();
        private final List<Bundle> b = new ArrayList();

        public k a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (ax.M0.b.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }

        public List<k> b() {
            return this.a;
        }

        public List<Bundle> c() {
            return this.b;
        }
    }

    public static abstract class k {
        final MediaBrowser.SubscriptionCallback a;
        final IBinder b = new Binder();
        WeakReference<j> c;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<j> weakReference = k.this.c;
                j jVar = weakReference == null ? null : weakReference.get();
                if (jVar == null) {
                    k.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.b(list);
                List<k> b2 = jVar.b();
                List<Bundle> c = jVar.c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        k.this.a(str, b);
                    } else {
                        k.this.b(str, a(b, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                k.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                k.this.b(str, MediaItem.b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                k.this.d(str, bundle);
            }
        }

        public k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = new b();
            } else {
                this.a = new a();
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.a = new g(context, componentName, cVar, bundle);
        } else if (i2 >= 23) {
            this.a = new f(context, componentName, cVar, bundle);
        } else {
            this.a = new e(context, componentName, cVar, bundle);
        }
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.a.g();
    }

    public void b() {
        this.a.b();
    }

    public MediaSessionCompat.Token c() {
        return this.a.c();
    }

    public boolean d() {
        return this.a.a();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final MediaDescriptionCompat c0;
        private final int q;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.q = i;
            this.c0 = mediaDescriptionCompat;
        }

        public static MediaItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> b(List<?> list) {
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

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.q + ", mDescription=" + this.c0 + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.q);
            this.c0.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

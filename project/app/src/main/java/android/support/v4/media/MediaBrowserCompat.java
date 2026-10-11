/*
 * Decompiled with CFR 0.152.
 */
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
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable((String)"MediaBrowserCompat", (int)3);
    private final d a;

    public MediaBrowserCompat(Context context, ComponentName componentName, c c8, Bundle bundle) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26) {
            this.a = new g(context, componentName, c8, bundle);
            return;
        }
        if (n8 >= 23) {
            this.a = new f(context, componentName, c8, bundle);
            return;
        }
        this.a = new e(context, componentName, c8, bundle);
    }

    public void a() {
        Log.d((String)"MediaBrowserCompat", (String)"Connecting to a MediaBrowserService.");
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

    private static class CustomActionResultReceiver
    extends ax.h.b {
        @Override
        protected void a(int n8, Bundle bundle) {
        }
    }

    private static class ItemReceiver
    extends ax.h.b {
        @Override
        protected void a(int n8, Bundle object) {
            Bundle bundle = object;
            if (object != null) {
                bundle = MediaSessionCompat.r(object);
            }
            if (n8 == 0 && bundle != null && bundle.containsKey("media_item")) {
                object = bundle.getParcelable("media_item");
                if (object != null && !(object instanceof MediaItem)) {
                    throw null;
                }
                object = (MediaItem)object;
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    public static class MediaItem
    implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>(){

            public MediaItem a(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public MediaItem[] b(int n8) {
                return new MediaItem[n8];
            }
        };
        private final MediaDescriptionCompat c0;
        private final int q;

        MediaItem(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty((CharSequence)mediaDescriptionCompat.f())) {
                    this.q = n8;
                    this.c0 = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem a(Object object) {
            if (object != null) {
                object = (MediaBrowser.MediaItem)object;
                int n8 = android.support.v4.media.MediaBrowserCompat$a.b((MediaBrowser.MediaItem)object);
                return new MediaItem(MediaDescriptionCompat.a(android.support.v4.media.MediaBrowserCompat$a.a((MediaBrowser.MediaItem)object)), n8);
            }
            return null;
        }

        public static List<MediaItem> b(List<?> object) {
            if (object != null) {
                ArrayList<MediaItem> arrayList = new ArrayList<MediaItem>(object.size());
                object = object.iterator();
                while (object.hasNext()) {
                    arrayList.add(MediaItem.a(object.next()));
                }
                return arrayList;
            }
            return null;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=");
            stringBuilder.append(this.q);
            stringBuilder.append(", mDescription=");
            stringBuilder.append(this.c0);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeInt(this.q);
            this.c0.writeToParcel(parcel, n8);
        }
    }

    private static class SearchResultReceiver
    extends ax.h.b {
        @Override
        protected void a(int n8, Bundle object) {
            Parcelable[] parcelableArray = object;
            if (object != null) {
                parcelableArray = MediaSessionCompat.r((Bundle)object);
            }
            if (n8 == 0 && parcelableArray != null && parcelableArray.containsKey("search_results")) {
                parcelableArray = parcelableArray.getParcelableArray("search_results");
                parcelableArray.getClass();
                object = new ArrayList(parcelableArray.length);
                int n9 = parcelableArray.length;
                for (n8 = 0; n8 < n9; ++n8) {
                    object.add((MediaItem)parcelableArray[n8]);
                }
                throw null;
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

    private static class b
    extends Handler {
        private final WeakReference<h> a;
        private WeakReference<Messenger> b;

        b(h h8) {
            this.a = new WeakReference<h>(h8);
        }

        void a(Messenger messenger) {
            this.b = new WeakReference<Messenger>(messenger);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void handleMessage(Message message) {
            h h8;
            Messenger messenger;
            block6: {
                messenger = this.b;
                if (messenger == null) return;
                if (messenger.get() == null) return;
                if (this.a.get() == null) {
                    return;
                }
                Object object = message.getData();
                MediaSessionCompat.a((Bundle)object);
                h8 = (h)this.a.get();
                messenger = (Messenger)this.b.get();
                try {
                    int n8 = message.what;
                    if (n8 == 1) {
                        Bundle bundle = object.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle);
                        h8.d(messenger, object.getString("data_media_item_id"), (MediaSessionCompat.Token)object.getParcelable("data_media_session_token"), bundle);
                        return;
                    }
                    if (n8 == 2) {
                        h8.h(messenger);
                        return;
                    }
                    if (n8 != 3) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unhandled message: ");
                        ((StringBuilder)object).append(message);
                        ((StringBuilder)object).append("\n  Client version: ");
                        ((StringBuilder)object).append(1);
                        ((StringBuilder)object).append("\n  Service version: ");
                        ((StringBuilder)object).append(message.arg1);
                        Log.w((String)"MediaBrowserCompat", (String)((StringBuilder)object).toString());
                        return;
                    }
                }
                catch (BadParcelableException badParcelableException) {
                    break block6;
                }
                Bundle bundle = object.getBundle("data_options");
                MediaSessionCompat.a(bundle);
                Bundle bundle2 = object.getBundle("data_notify_children_changed_options");
                MediaSessionCompat.a(bundle2);
                h8.e(messenger, object.getString("data_media_item_id"), object.getParcelableArrayList("data_media_item_list"), bundle, bundle2);
                return;
            }
            Log.e((String)"MediaBrowserCompat", (String)"Could not unparcel the data.");
            if (message.what != 1) return;
            h8.h(messenger);
        }
    }

    public static class c {
        final MediaBrowser.ConnectionCallback a = new a(this);
        b b;

        public void a() {
            throw null;
        }

        public void b() {
        }

        public void c() {
        }

        void d(b b8) {
            this.b = b8;
        }

        private class a
        extends MediaBrowser.ConnectionCallback {
            final c a;

            a(c c8) {
                this.a = c8;
            }

            public void onConnected() {
                b b8 = this.a.b;
                if (b8 != null) {
                    b8.i();
                }
                this.a.a();
            }

            public void onConnectionFailed() {
                b b8 = this.a.b;
                if (b8 != null) {
                    b8.j();
                }
                this.a.b();
            }

            public void onConnectionSuspended() {
                b b8 = this.a.b;
                if (b8 != null) {
                    b8.f();
                }
                this.a.c();
            }
        }

        static interface b {
            public void f();

            public void i();

            public void j();
        }
    }

    static interface d {
        public boolean a();

        public void b();

        public MediaSessionCompat.Token c();

        public void g();
    }

    static class e
    implements d,
    h,
    c.b {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final b d = new b(this);
        private final ax.B.a<String, j> e = new ax.B.a();
        protected int f;
        protected i g;
        protected Messenger h;
        private MediaSessionCompat.Token i;
        private Bundle j;

        e(Context context, ComponentName componentName, c c8, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            c8.d(this);
            this.b = new MediaBrowser(context, componentName, c8.a, bundle2);
        }

        @Override
        public boolean a() {
            return this.b.isConnected();
        }

        @Override
        public void b() {
            Messenger messenger;
            i i8 = this.g;
            if (i8 != null && (messenger = this.h) != null) {
                try {
                    i8.c(messenger);
                }
                catch (RemoteException remoteException) {
                    Log.i((String)"MediaBrowserCompat", (String)"Remote error unregistering client messenger.");
                }
            }
            this.b.disconnect();
        }

        @Override
        public MediaSessionCompat.Token c() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override
        public void d(Messenger messenger, String string, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override
        public void e(Messenger object, String string, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.h == object) {
                object = this.e.get((Object)string);
                if (object == null) {
                    if (b) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("onLoadChildren for id that isn't subscribed id=");
                        ((StringBuilder)object).append(string);
                        Log.d((String)"MediaBrowserCompat", (String)((StringBuilder)object).toString());
                        return;
                    }
                } else if ((object = ((j)object).a(bundle)) != null) {
                    if (bundle == null) {
                        if (list == null) {
                            ((k)object).c(string);
                            return;
                        }
                        this.j = bundle2;
                        ((k)object).a(string, list);
                        this.j = null;
                        return;
                    }
                    if (list == null) {
                        ((k)object).d(string, bundle);
                        return;
                    }
                    this.j = bundle2;
                    ((k)object).b(string, list, bundle);
                    this.j = null;
                }
            }
        }

        @Override
        public void f() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override
        public void g() {
            this.b.connect();
        }

        @Override
        public void h(Messenger messenger) {
        }

        @Override
        public void i() {
            block6: {
                Object object;
                try {
                    object = this.b.getExtras();
                    if (object == null) break block6;
                }
                catch (IllegalStateException illegalStateException) {
                    Log.e((String)"MediaBrowserCompat", (String)"Unexpected IllegalStateException", (Throwable)illegalStateException);
                    return;
                }
                this.f = object.getInt("extra_service_version", 0);
                IBinder iBinder = ax.P.g.a(object, "extra_messenger");
                if (iBinder != null) {
                    this.g = new i(iBinder, this.c);
                    iBinder = new Messenger((Handler)this.d);
                    this.h = iBinder;
                    this.d.a((Messenger)iBinder);
                    try {
                        this.g.a(this.a, this.h);
                    }
                    catch (RemoteException remoteException) {
                        Log.i((String)"MediaBrowserCompat", (String)"Remote error registering client messenger.");
                    }
                }
                if ((object = b.a.r(ax.P.g.a(object, "extra_session_binder"))) != null) {
                    this.i = MediaSessionCompat.Token.b(this.b.getSessionToken(), (android.support.v4.media.session.b)object);
                }
            }
        }

        @Override
        public void j() {
        }
    }

    static class f
    extends e {
        f(Context context, ComponentName componentName, c c8, Bundle bundle) {
            super(context, componentName, c8, bundle);
        }
    }

    static class g
    extends f {
        g(Context context, ComponentName componentName, c c8, Bundle bundle) {
            super(context, componentName, c8, bundle);
        }
    }

    static interface h {
        public void d(Messenger var1, String var2, MediaSessionCompat.Token var3, Bundle var4);

        public void e(Messenger var1, String var2, List<MediaItem> var3, Bundle var4, Bundle var5);

        public void h(Messenger var1);
    }

    private static class i {
        private Messenger a;
        private Bundle b;

        public i(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void b(int n8, Bundle bundle, Messenger messenger) throws RemoteException {
            Message message = Message.obtain();
            message.what = n8;
            message.arg1 = 1;
            message.setData(bundle);
            message.replyTo = messenger;
            this.a.send(message);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            this.b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            this.b(7, null, messenger);
        }
    }

    private static class j {
        private final List<k> a = new ArrayList<k>();
        private final List<Bundle> b = new ArrayList<Bundle>();

        public k a(Bundle bundle) {
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (!ax.M0.b.a(this.b.get(i8), bundle)) continue;
                return this.a.get(i8);
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

        public k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = new b(this);
                return;
            }
            this.a = new a(this);
        }

        public void a(String string, List<MediaItem> list) {
        }

        public void b(String string, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String string) {
        }

        public void d(String string, Bundle bundle) {
        }

        private class a
        extends MediaBrowser.SubscriptionCallback {
            final k a;

            a(k k8) {
                this.a = k8;
            }

            List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int n8 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int n9 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (n8 == -1 && n9 == -1) {
                    return list;
                }
                int n10 = n9 * n8;
                int n11 = n10 + n9;
                if (n8 >= 0 && n9 >= 1 && n10 < list.size()) {
                    n9 = n11;
                    if (n11 > list.size()) {
                        n9 = list.size();
                    }
                    return list.subList(n10, n9);
                }
                return Collections.EMPTY_LIST;
            }

            public void onChildrenLoaded(String string, List<MediaBrowser.MediaItem> list) {
                Bundle bundle = this.a.c;
                bundle = bundle == null ? null : (j)bundle.get();
                if (bundle == null) {
                    this.a.a(string, MediaItem.b(list));
                    return;
                }
                List<MediaItem> list2 = MediaItem.b(list);
                list = bundle.b();
                List<Bundle> list3 = bundle.c();
                for (int i8 = 0; i8 < list.size(); ++i8) {
                    bundle = list3.get(i8);
                    if (bundle == null) {
                        this.a.a(string, list2);
                        continue;
                    }
                    this.a.b(string, this.a(list2, bundle), bundle);
                }
            }

            public void onError(String string) {
                this.a.c(string);
            }
        }

        private class b
        extends a {
            final k b;

            b(k k8) {
                this.b = k8;
                super(k8);
            }

            public void onChildrenLoaded(String string, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.b.b(string, MediaItem.b(list), bundle);
            }

            public void onError(String string, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.b.d(string, bundle);
            }
        }
    }
}


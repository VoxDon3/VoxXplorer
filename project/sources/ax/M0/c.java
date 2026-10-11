package ax.M0;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import ax.b0.C1442c;
import ax.h.C2140b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends Service {
    static final boolean i = Log.isLoggable("MBServiceCompat", 3);
    private g a;
    f f;
    MediaSessionCompat.Token h;
    private final n b = new n();
    final f c = new f("android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<f> d = new ArrayList<>();
    final ax.B.a<IBinder, f> e = new ax.B.a<>();
    final q g = new q(this);

    class a extends l<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ f f;
        final /* synthetic */ String g;
        final /* synthetic */ Bundle h;
        final /* synthetic */ Bundle i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f = fVar;
            this.g = str;
            this.h = bundle;
            this.i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.M0.c.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if (c.this.e.get(this.f.f.asBinder()) != this.f) {
                if (c.i) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f.a + " id=" + this.g);
                    return;
                }
                return;
            }
            if ((a() & 1) != 0) {
                list = c.this.h(list, this.h);
            }
            try {
                this.f.f.a(this.g, list, this.h, this.i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.g + " package=" + this.f.a);
            }
        }
    }

    class b extends l<MediaBrowserCompat.MediaItem> {
        final /* synthetic */ C2140b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, C2140b c2140b) {
            super(obj);
            this.f = c2140b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.M0.c.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(MediaBrowserCompat.MediaItem mediaItem) {
            if ((a() & 2) != 0) {
                this.f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f.b(0, bundle);
        }
    }

    /* renamed from: ax.M0.c$c, reason: collision with other inner class name */
    class C0146c extends l<List<MediaBrowserCompat.MediaItem>> {
        final /* synthetic */ C2140b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0146c(Object obj, C2140b c2140b) {
            super(obj);
            this.f = c2140b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.M0.c.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List<MediaBrowserCompat.MediaItem> list) {
            if ((a() & 4) != 0 || list == null) {
                this.f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f.b(0, bundle);
        }
    }

    class d extends l<Bundle> {
        final /* synthetic */ C2140b f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, C2140b c2140b) {
            super(obj);
            this.f = c2140b;
        }

        @Override // ax.M0.c.l
        void c(Bundle bundle) {
            this.f.b(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.M0.c.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(Bundle bundle) {
            this.f.b(0, bundle);
        }
    }

    public static final class e {
        private final String a;
        private final Bundle b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.a = str;
            this.b = bundle;
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    private class f implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final ax.M0.d d;
        public final Bundle e;
        public final o f;
        public final HashMap<String, List<C1442c<IBinder, Bundle>>> g = new HashMap<>();
        public e h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                c.this.e.remove(fVar.f.asBinder());
            }
        }

        f(String str, int i, int i2, Bundle bundle, o oVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = new ax.M0.d(str, i, i2);
            this.e = bundle;
            this.f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            c.this.g.post(new a());
        }
    }

    interface g {
        void a();

        IBinder b(Intent intent);

        void c(MediaSessionCompat.Token token);
    }

    class h implements g {
        final List<Bundle> a = new ArrayList();
        MediaBrowserService b;
        Messenger c;

        class a implements Runnable {
            final /* synthetic */ MediaSessionCompat.Token q;

            a(MediaSessionCompat.Token token) {
                this.q = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f(this.q);
            }
        }

        class b extends l<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ax.M0.c.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                List list2;
                if (list == null) {
                    list2 = Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    list2 = arrayList;
                }
                this.f.b(list2);
            }
        }

        /* renamed from: ax.M0.c$h$c, reason: collision with other inner class name */
        class C0147c extends MediaBrowserService {
            C0147c(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                e d = h.this.d(str, i, bundle == null ? null : new Bundle(bundle));
                if (d == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(d.a, d.b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.e(str, new m<>(result));
            }
        }

        h() {
        }

        @Override // ax.M0.c.g
        public void a() {
            C0147c c0147c = new C0147c(c.this);
            this.b = c0147c;
            c0147c.onCreate();
        }

        @Override // ax.M0.c.g
        public IBinder b(Intent intent) {
            return this.b.onBind(intent);
        }

        @Override // ax.M0.c.g
        public void c(MediaSessionCompat.Token token) {
            c.this.g.a(new a(token));
        }

        public e d(String str, int i, Bundle bundle) {
            Bundle bundle2;
            int i2;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i2 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.c = new Messenger(c.this.g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                ax.P.g.b(bundle2, "extra_messenger", this.c.getBinder());
                MediaSessionCompat.Token token = c.this.h;
                if (token != null) {
                    android.support.v4.media.session.b c = token.c();
                    ax.P.g.b(bundle2, "extra_session_binder", c == null ? null : c.asBinder());
                } else {
                    this.a.add(bundle2);
                }
                int i3 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i2 = i3;
            }
            f fVar = c.this.new f(str, i2, i, bundle, null);
            c cVar = c.this;
            cVar.f = fVar;
            e n = cVar.n(str, i, bundle);
            c cVar2 = c.this;
            cVar2.f = null;
            if (n == null) {
                return null;
            }
            if (this.c != null) {
                cVar2.d.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = n.c();
            } else if (n.c() != null) {
                bundle2.putAll(n.c());
            }
            return new e(n.d(), bundle2);
        }

        public void e(String str, m<List<Parcel>> mVar) {
            b bVar = new b(str, mVar);
            c cVar = c.this;
            cVar.f = cVar.c;
            cVar.o(str, bVar);
            c.this.f = null;
        }

        void f(MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                android.support.v4.media.session.b c = token.c();
                if (c != null) {
                    Iterator<Bundle> it = this.a.iterator();
                    while (it.hasNext()) {
                        ax.P.g.b(it.next(), "extra_session_binder", c.asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession.Token) token.e());
        }
    }

    class i extends h {

        class a extends l<MediaBrowserCompat.MediaItem> {
            final /* synthetic */ m f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar) {
                super(obj);
                this.f = mVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ax.M0.c.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f.b(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f.b(obtain);
            }
        }

        class b extends h.C0147c {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.g(str, new m<>(result));
            }
        }

        i() {
            super();
        }

        @Override // ax.M0.c.h, ax.M0.c.g
        public void a() {
            b bVar = new b(c.this);
            this.b = bVar;
            bVar.onCreate();
        }

        public void g(String str, m<Parcel> mVar) {
            a aVar = new a(str, mVar);
            c cVar = c.this;
            cVar.f = cVar.c;
            cVar.r(str, aVar);
            c.this.f = null;
        }
    }

    class j extends i {

        class a extends l<List<MediaBrowserCompat.MediaItem>> {
            final /* synthetic */ m f;
            final /* synthetic */ Bundle g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f = mVar;
                this.g = bundle;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // ax.M0.c.l
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f.b(null);
                    return;
                }
                if ((a() & 1) != 0) {
                    list = c.this.h(list, this.g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem mediaItem : list) {
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f.b(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                c cVar = c.this;
                cVar.f = cVar.c;
                jVar.h(str, new m<>(result), bundle);
                c.this.f = null;
            }
        }

        j() {
            super();
        }

        @Override // ax.M0.c.i, ax.M0.c.h, ax.M0.c.g
        public void a() {
            b bVar = new b(c.this);
            this.b = bVar;
            bVar.onCreate();
        }

        public void h(String str, m<List<Parcel>> mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            c cVar = c.this;
            cVar.f = cVar.c;
            cVar.q(str, aVar, bundle);
            c.this.f = null;
        }
    }

    class k extends j {
        k() {
            super();
        }
    }

    public static class l<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        l(Object obj) {
            this.a = obj;
        }

        int a() {
            return this.e;
        }

        boolean b() {
            return this.b || this.c || this.d;
        }

        void c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        void d(T t) {
            throw null;
        }

        public void e(Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
        }

        public void f(T t) {
            if (!this.c && !this.d) {
                this.c = true;
                d(t);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
        }

        void g(int i) {
            this.e = i;
        }
    }

    static class m<T> {
        MediaBrowserService.Result a;

        m(MediaBrowserService.Result result) {
            this.a = result;
        }

        List<MediaBrowser.MediaItem> a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(T t) {
            if (t instanceof List) {
                this.a.sendResult(a((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    private class n {

        class a implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ int d0;
            final /* synthetic */ int e0;
            final /* synthetic */ Bundle f0;
            final /* synthetic */ o q;

            a(o oVar, String str, int i, int i2, Bundle bundle) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = i;
                this.e0 = i2;
                this.f0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.q.asBinder();
                c.this.e.remove(asBinder);
                f fVar = c.this.new f(this.c0, this.d0, this.e0, this.f0, this.q);
                c cVar = c.this;
                cVar.f = fVar;
                e n = cVar.n(this.c0, this.e0, this.f0);
                fVar.h = n;
                c cVar2 = c.this;
                cVar2.f = null;
                if (n != null) {
                    try {
                        cVar2.e.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (c.this.h != null) {
                            this.q.c(fVar.h.d(), c.this.h, fVar.h.c());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.c0);
                        c.this.e.remove(asBinder);
                        return;
                    }
                }
                Log.i("MBServiceCompat", "No root for client " + this.c0 + " from service " + getClass().getName());
                try {
                    this.q.b();
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.c0);
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ o q;

            b(o oVar) {
                this.q = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = c.this.e.remove(this.q.asBinder());
                if (remove != null) {
                    remove.f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* renamed from: ax.M0.c$n$c, reason: collision with other inner class name */
        class RunnableC0148c implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ IBinder d0;
            final /* synthetic */ Bundle e0;
            final /* synthetic */ o q;

            RunnableC0148c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = iBinder;
                this.e0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = c.this.e.get(this.q.asBinder());
                if (fVar != null) {
                    c.this.f(this.c0, fVar, this.d0, this.e0);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.c0);
            }
        }

        class d implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ IBinder d0;
            final /* synthetic */ o q;

            d(o oVar, String str, IBinder iBinder) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = c.this.e.get(this.q.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.c0);
                    return;
                }
                if (c.this.z(this.c0, fVar, this.d0)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.c0 + " which is not subscribed");
            }
        }

        class e implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ C2140b d0;
            final /* synthetic */ o q;

            e(o oVar, String str, C2140b c2140b) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = c2140b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = c.this.e.get(this.q.asBinder());
                if (fVar != null) {
                    c.this.x(this.c0, fVar, this.d0);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.c0);
            }
        }

        class f implements Runnable {
            final /* synthetic */ int c0;
            final /* synthetic */ String d0;
            final /* synthetic */ int e0;
            final /* synthetic */ Bundle f0;
            final /* synthetic */ o q;

            f(o oVar, int i, String str, int i2, Bundle bundle) {
                this.q = oVar;
                this.c0 = i;
                this.d0 = str;
                this.e0 = i2;
                this.f0 = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder asBinder = this.q.asBinder();
                c.this.e.remove(asBinder);
                Iterator<f> it = c.this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.c == this.c0) {
                        fVar = (TextUtils.isEmpty(this.d0) || this.e0 <= 0) ? c.this.new f(next.a, next.b, next.c, this.f0, this.q) : null;
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = c.this.new f(this.d0, this.e0, this.c0, this.f0, this.q);
                }
                c.this.e.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        class g implements Runnable {
            final /* synthetic */ o q;

            g(o oVar) {
                this.q = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.q.asBinder();
                f remove = c.this.e.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        class h implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ Bundle d0;
            final /* synthetic */ C2140b e0;
            final /* synthetic */ o q;

            h(o oVar, String str, Bundle bundle, C2140b c2140b) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = bundle;
                this.e0 = c2140b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = c.this.e.get(this.q.asBinder());
                if (fVar != null) {
                    c.this.y(this.c0, this.d0, fVar, this.e0);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.c0);
            }
        }

        class i implements Runnable {
            final /* synthetic */ String c0;
            final /* synthetic */ Bundle d0;
            final /* synthetic */ C2140b e0;
            final /* synthetic */ o q;

            i(o oVar, String str, Bundle bundle, C2140b c2140b) {
                this.q = oVar;
                this.c0 = str;
                this.d0 = bundle;
                this.e0 = c2140b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = c.this.e.get(this.q.asBinder());
                if (fVar != null) {
                    c.this.v(this.c0, this.d0, fVar, this.e0);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.c0 + ", extras=" + this.d0);
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            c.this.g.a(new RunnableC0148c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i2, int i3, Bundle bundle, o oVar) {
            if (c.this.l(str, i3)) {
                c.this.g.a(new a(oVar, str, i2, i3, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + str);
        }

        public void c(o oVar) {
            c.this.g.a(new b(oVar));
        }

        public void d(String str, C2140b c2140b, o oVar) {
            if (TextUtils.isEmpty(str) || c2140b == null) {
                return;
            }
            c.this.g.a(new e(oVar, str, c2140b));
        }

        public void e(o oVar, String str, int i2, int i3, Bundle bundle) {
            c.this.g.a(new f(oVar, i3, str, i2, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            c.this.g.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, C2140b c2140b, o oVar) {
            if (TextUtils.isEmpty(str) || c2140b == null) {
                return;
            }
            c.this.g.a(new h(oVar, str, bundle, c2140b));
        }

        public void h(String str, Bundle bundle, C2140b c2140b, o oVar) {
            if (TextUtils.isEmpty(str) || c2140b == null) {
                return;
            }
            c.this.g.a(new i(oVar, str, bundle, c2140b));
        }

        public void i(o oVar) {
            c.this.g.a(new g(oVar));
        }
    }

    private interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    private static class p implements o {
        final Messenger a;

        p(Messenger messenger) {
            this.a = messenger;
        }

        private void d(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.a.send(obtain);
        }

        @Override // ax.M0.c.o
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }

        @Override // ax.M0.c.o
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override // ax.M0.c.o
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // ax.M0.c.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    private static final class q extends Handler {
        private c a;

        q(c cVar) {
            this.a = cVar;
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void b() {
            this.a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar = this.a;
            if (cVar != null) {
                cVar.k(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j);
        }
    }

    public void A(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.h = token;
        this.a.c(token);
    }

    void f(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<C1442c<IBinder, Bundle>> list = fVar.g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C1442c<IBinder, Bundle> c1442c : list) {
            if (iBinder == c1442c.a && ax.M0.b.a(bundle, c1442c.b)) {
                return;
            }
        }
        list.add(new C1442c<>(iBinder, bundle));
        fVar.g.put(str, list);
        w(str, fVar, bundle, null);
        this.f = fVar;
        t(str, bundle);
        this.f = null;
    }

    List<MediaBrowserCompat.MediaItem> h(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public MediaSessionCompat.Token i() {
        return this.h;
    }

    void k(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                Bundle bundle = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle);
                this.b.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                break;
            case 2:
                this.b.c(new p(message.replyTo));
                break;
            case 3:
                Bundle bundle2 = data.getBundle("data_options");
                MediaSessionCompat.a(bundle2);
                this.b.a(data.getString("data_media_item_id"), ax.P.g.a(data, "data_callback_token"), bundle2, new p(message.replyTo));
                break;
            case 4:
                this.b.f(data.getString("data_media_item_id"), ax.P.g.a(data, "data_callback_token"), new p(message.replyTo));
                break;
            case 5:
                this.b.d(data.getString("data_media_item_id"), (C2140b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 6:
                Bundle bundle3 = data.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle3);
                this.b.e(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                break;
            case 7:
                this.b.i(new p(message.replyTo));
                break;
            case 8:
                Bundle bundle4 = data.getBundle("data_search_extras");
                MediaSessionCompat.a(bundle4);
                this.b.g(data.getString("data_search_query"), bundle4, (C2140b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 9:
                Bundle bundle5 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.a(bundle5);
                this.b.h(data.getString("data_custom_action"), bundle5, (C2140b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    boolean l(String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void m(String str, Bundle bundle, l<Bundle> lVar) {
        lVar.e(null);
    }

    public abstract e n(String str, int i2, Bundle bundle);

    public abstract void o(String str, l<List<MediaBrowserCompat.MediaItem>> lVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a.b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.a = new k();
        } else if (i2 >= 26) {
            this.a = new j();
        } else if (i2 >= 23) {
            this.a = new i();
        } else {
            this.a = new h();
        }
        this.a.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.g.b();
    }

    public void q(String str, l<List<MediaBrowserCompat.MediaItem>> lVar, Bundle bundle) {
        lVar.g(1);
        o(str, lVar);
    }

    public void r(String str, l<MediaBrowserCompat.MediaItem> lVar) {
        lVar.g(2);
        lVar.f(null);
    }

    public void s(String str, Bundle bundle, l<List<MediaBrowserCompat.MediaItem>> lVar) {
        lVar.g(4);
        lVar.f(null);
    }

    void v(String str, Bundle bundle, f fVar, C2140b c2140b) {
        d dVar = new d(str, c2140b);
        this.f = fVar;
        m(str, bundle, dVar);
        this.f = null;
        if (dVar.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void w(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f = fVar;
        if (bundle == null) {
            o(str, aVar);
        } else {
            q(str, aVar, bundle);
        }
        this.f = null;
        if (aVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.a + " id=" + str);
    }

    void x(String str, f fVar, C2140b c2140b) {
        b bVar = new b(str, c2140b);
        this.f = fVar;
        r(str, bVar);
        this.f = null;
        if (bVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void y(String str, Bundle bundle, f fVar, C2140b c2140b) {
        C0146c c0146c = new C0146c(str, c2140b);
        this.f = fVar;
        s(str, bundle, c0146c);
        this.f = null;
        if (c0146c.b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean z(String str, f fVar, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<C1442c<IBinder, Bundle>> list = fVar.g.get(str);
                if (list != null) {
                    Iterator<C1442c<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.g.remove(str);
                    }
                }
            } else if (fVar.g.remove(str) != null) {
                z = true;
            }
            return z;
        } finally {
            this.f = fVar;
            u(str);
            this.f = null;
        }
    }

    public void u(String str) {
    }

    public void t(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}

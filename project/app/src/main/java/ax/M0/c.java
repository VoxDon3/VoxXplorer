/*
 * Decompiled with CFR 0.152.
 */
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
import ax.B.a;
import ax.M0.b;
import ax.M0.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class c
extends Service {
    static final boolean i = Log.isLoggable((String)"MBServiceCompat", (int)3);
    private g a;
    private final n b = new n(this);
    final f c = new f(this, "android.media.session.MediaController", -1, -1, null, null);
    final ArrayList<f> d = new ArrayList();
    final a<IBinder, f> e = new a();
    f f;
    final q g = new q(this);
    MediaSessionCompat.Token h;

    public void A(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.h == null) {
                this.h = token;
                this.a.c(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
    }

    void f(String string, f f8, IBinder iBinder, Bundle bundle) {
        List<ax.b0.c<IBinder, Bundle>> object2;
        List<ax.b0.c<IBinder, Bundle>> list = object2 = f8.g.get(string);
        if (object2 == null) {
            list = new ArrayList<ax.b0.c<IBinder, Bundle>>();
        }
        for (ax.b0.c<IBinder, Bundle> c8 : list) {
            if (iBinder != c8.a || !ax.M0.b.a(bundle, (Bundle)c8.b)) continue;
            return;
        }
        list.add(new ax.b0.c<IBinder, Bundle>(iBinder, bundle));
        f8.g.put(string, list);
        this.w(string, f8, bundle, null);
        this.f = f8;
        this.t(string, bundle);
        this.f = null;
    }

    List<MediaBrowserCompat.MediaItem> h(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    public MediaSessionCompat.Token i() {
        return this.h;
    }

    void k(Message message) {
        Object object = message.getData();
        switch (message.what) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unhandled message: ");
                ((StringBuilder)object).append(message);
                ((StringBuilder)object).append("\n  Service version: ");
                ((StringBuilder)object).append(2);
                ((StringBuilder)object).append("\n  Client version: ");
                ((StringBuilder)object).append(message.arg1);
                Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                return;
            }
            case 9: {
                Bundle bundle = object.getBundle("data_custom_action_extras");
                MediaSessionCompat.a(bundle);
                this.b.h(object.getString("data_custom_action"), bundle, (ax.h.b)object.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 8: {
                Bundle bundle = object.getBundle("data_search_extras");
                MediaSessionCompat.a(bundle);
                this.b.g(object.getString("data_search_query"), bundle, (ax.h.b)object.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 7: {
                this.b.i(new p(message.replyTo));
                return;
            }
            case 6: {
                Bundle bundle = object.getBundle("data_root_hints");
                MediaSessionCompat.a(bundle);
                this.b.e(new p(message.replyTo), object.getString("data_package_name"), object.getInt("data_calling_pid"), object.getInt("data_calling_uid"), bundle);
                return;
            }
            case 5: {
                this.b.d(object.getString("data_media_item_id"), (ax.h.b)object.getParcelable("data_result_receiver"), new p(message.replyTo));
                return;
            }
            case 4: {
                this.b.f(object.getString("data_media_item_id"), ax.P.g.a((Bundle)object, "data_callback_token"), new p(message.replyTo));
                return;
            }
            case 3: {
                Bundle bundle = object.getBundle("data_options");
                MediaSessionCompat.a(bundle);
                this.b.a(object.getString("data_media_item_id"), ax.P.g.a((Bundle)object, "data_callback_token"), bundle, new p(message.replyTo));
                return;
            }
            case 2: {
                this.b.c(new p(message.replyTo));
                return;
            }
            case 1: 
        }
        Bundle bundle = object.getBundle("data_root_hints");
        MediaSessionCompat.a(bundle);
        this.b.b(object.getString("data_package_name"), object.getInt("data_calling_pid"), object.getInt("data_calling_uid"), bundle, new p(message.replyTo));
    }

    boolean l(String string, int n8) {
        if (string == null) {
            return false;
        }
        String[] stringArray = this.getPackageManager().getPackagesForUid(n8);
        int n9 = stringArray.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (!stringArray[n8].equals(string)) continue;
            return true;
        }
        return false;
    }

    public void m(String string, Bundle bundle, l<Bundle> l8) {
        l8.e(null);
    }

    public abstract e n(String var1, int var2, Bundle var3);

    public abstract void o(String var1, l<List<MediaBrowserCompat.MediaItem>> var2);

    public IBinder onBind(Intent intent) {
        return this.a.b(intent);
    }

    public void onCreate() {
        super.onCreate();
        int n8 = Build.VERSION.SDK_INT;
        this.a = n8 >= 28 ? new k(this) : (n8 >= 26 ? new j(this) : (n8 >= 23 ? new i(this) : new h(this)));
        this.a.a();
    }

    public void onDestroy() {
        this.g.b();
    }

    public void q(String string, l<List<MediaBrowserCompat.MediaItem>> l8, Bundle bundle) {
        l8.g(1);
        this.o(string, l8);
    }

    public void r(String string, l<MediaBrowserCompat.MediaItem> l8) {
        l8.g(2);
        l8.f(null);
    }

    public void s(String string, Bundle bundle, l<List<MediaBrowserCompat.MediaItem>> l8) {
        l8.g(4);
        l8.f(null);
    }

    public void t(String string, Bundle bundle) {
    }

    public void u(String string) {
    }

    void v(String string, Bundle bundle, f object, ax.h.b object2) {
        object2 = new l<Bundle>(this, (Object)string, (ax.h.b)object2){
            final ax.h.b f;
            final c g;
            {
                this.g = c8;
                this.f = b8;
                super(object);
            }

            @Override
            void c(Bundle bundle) {
                this.f.b(-1, bundle);
            }

            void h(Bundle bundle) {
                this.f.b(0, bundle);
            }
        };
        this.f = object;
        this.m(string, bundle, (l<Bundle>)object2);
        this.f = null;
        if (((l)object2).b()) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" extras=");
        ((StringBuilder)object).append(bundle);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    void w(String string, f f8, Bundle object, Bundle object2) {
        object2 = new l<List<MediaBrowserCompat.MediaItem>>(this, (Object)string, f8, string, (Bundle)object, (Bundle)object2){
            final f f;
            final String g;
            final Bundle h;
            final Bundle i;
            final c j;
            {
                this.j = c8;
                this.f = f8;
                this.g = string;
                this.h = bundle;
                this.i = bundle2;
                super(object);
            }

            void h(List<MediaBrowserCompat.MediaItem> object) {
                if (this.j.e.get((Object)this.f.f.asBinder()) != this.f) {
                    if (i) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        ((StringBuilder)object).append(this.f.a);
                        ((StringBuilder)object).append(" id=");
                        ((StringBuilder)object).append(this.g);
                        Log.d((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                        return;
                    }
                } else {
                    List<MediaBrowserCompat.MediaItem> list = object;
                    if ((this.a() & 1) != 0) {
                        list = this.j.h((List<MediaBrowserCompat.MediaItem>)object, this.h);
                    }
                    try {
                        this.f.f.a(this.g, list, this.h, this.i);
                        return;
                    }
                    catch (RemoteException remoteException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Calling onLoadChildren() failed for id=");
                        stringBuilder.append(this.g);
                        stringBuilder.append(" package=");
                        stringBuilder.append(this.f.a);
                        Log.w((String)"MBServiceCompat", (String)stringBuilder.toString());
                    }
                }
            }
        };
        this.f = f8;
        if (object == null) {
            this.o(string, (l<List<MediaBrowserCompat.MediaItem>>)object2);
        } else {
            this.q(string, (l<List<MediaBrowserCompat.MediaItem>>)object2, (Bundle)object);
        }
        this.f = null;
        if (((l)object2).b()) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("onLoadChildren must call detach() or sendResult() before returning for package=");
        ((StringBuilder)object).append(f8.a);
        ((StringBuilder)object).append(" id=");
        ((StringBuilder)object).append(string);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    void x(String string, f object, ax.h.b object2) {
        object2 = new l<MediaBrowserCompat.MediaItem>(this, (Object)string, (ax.h.b)object2){
            final ax.h.b f;
            final c g;
            {
                this.g = c8;
                this.f = b8;
                super(object);
            }

            void h(MediaBrowserCompat.MediaItem mediaItem) {
                if ((this.a() & 2) != 0) {
                    this.f.b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (Parcelable)mediaItem);
                this.f.b(0, bundle);
            }
        };
        this.f = object;
        this.r(string, (l<MediaBrowserCompat.MediaItem>)object2);
        this.f = null;
        if (((l)object2).b()) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("onLoadItem must call detach() or sendResult() before returning for id=");
        ((StringBuilder)object).append(string);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    void y(String string, Bundle object, f f8, ax.h.b object2) {
        object2 = new l<List<MediaBrowserCompat.MediaItem>>(this, (Object)string, (ax.h.b)object2){
            final ax.h.b f;
            final c g;
            {
                this.g = c8;
                this.f = b8;
                super(object);
            }

            void h(List<MediaBrowserCompat.MediaItem> list) {
                if ((this.a() & 4) == 0 && list != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("search_results", (Parcelable[])list.toArray(new MediaBrowserCompat.MediaItem[0]));
                    this.f.b(0, bundle);
                    return;
                }
                this.f.b(-1, null);
            }
        };
        this.f = f8;
        this.s(string, (Bundle)object, (l<List<MediaBrowserCompat.MediaItem>>)object2);
        this.f = null;
        if (((l)object2).b()) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("onSearch must call detach() or sendResult() before returning for query=");
        ((StringBuilder)object).append(string);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean z(String var1_1, f var2_2, IBinder var3_3) {
        block6: {
            block5: {
                var5_5 = false;
                var4_6 = false;
                if (var3_3 /* !! */  != null) ** GOTO lbl16
                try {
                    var3_3 /* !! */  = var2_2.g.remove(var1_1);
                    if (var3_3 /* !! */  == null) break block5;
                    var4_6 = true;
                }
                catch (Throwable var3_4) {}
            }
lbl9:
            // 4 sources

            while (true) {
                this.f = var2_2;
                this.u(var1_1);
                this.f = null;
                return var4_6;
            }
            {
                break block6;
lbl16:
                // 1 sources

                var7_7 = var2_2.g.get(var1_1);
                if (var7_7 == null) ** GOTO lbl9
                var6_8 = var7_7.iterator();
                while (var6_8.hasNext()) {
                    if (var3_3 /* !! */  != var6_8.next().a) continue;
                    var6_8.remove();
                    var5_5 = true;
                }
                var4_6 = var5_5;
                if (var7_7.size() != 0) ** GOTO lbl9
                var2_2.g.remove(var1_1);
                var4_6 = var5_5;
                ** continue;
            }
        }
        this.f = var2_2;
        this.u(var1_1);
        this.f = null;
        throw var3_4;
    }

    public static final class e {
        private final String a;
        private final Bundle b;

        public e(String string, Bundle bundle) {
            if (string != null) {
                this.a = string;
                this.b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    private class f
    implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final d d;
        public final Bundle e;
        public final o f;
        public final HashMap<String, List<ax.b0.c<IBinder, Bundle>>> g;
        public e h;
        final c i;

        f(c c8, String string, int n8, int n9, Bundle bundle, o o8) {
            this.i = c8;
            this.g = new HashMap();
            this.a = string;
            this.b = n8;
            this.c = n9;
            this.d = new d(string, n8, n9);
            this.e = bundle;
            this.f = o8;
        }

        public void binderDied() {
            this.i.g.post(new Runnable(this){
                final f q;
                {
                    this.q = f8;
                }

                @Override
                public void run() {
                    f f8 = this.q;
                    f8.i.e.remove((Object)f8.f.asBinder());
                }
            });
        }
    }

    static interface g {
        public void a();

        public IBinder b(Intent var1);

        public void c(MediaSessionCompat.Token var1);
    }

    class h
    implements g {
        final List<Bundle> a;
        MediaBrowserService b;
        Messenger c;
        final ax.M0.c d;

        h(ax.M0.c c8) {
            this.d = c8;
            this.a = new ArrayList<Bundle>();
        }

        @Override
        public void a() {
            c c8 = new c(this, (Context)this.d);
            this.b = c8;
            c8.onCreate();
        }

        @Override
        public IBinder b(Intent intent) {
            return this.b.onBind(intent);
        }

        @Override
        public void c(MediaSessionCompat.Token token) {
            this.d.g.a(new Runnable(){
                final h c0;
                final MediaSessionCompat.Token q;
                {
                    this.c0 = h8;
                    this.q = token;
                }

                @Override
                public void run() {
                    this.c0.f(this.q);
                }
            });
        }

        public e d(String object, int n8, Bundle object2) {
            int n9;
            Object object3;
            f f8;
            if (object2 != null && object2.getInt("extra_client_version", 0) != 0) {
                object2.remove("extra_client_version");
                this.c = new Messenger((Handler)this.d.g);
                f8 = new Bundle();
                f8.putInt("extra_service_version", 2);
                ax.P.g.b((Bundle)f8, "extra_messenger", this.c.getBinder());
                object3 = this.d.h;
                if (object3 != null) {
                    object3 = (object3 = ((MediaSessionCompat.Token)object3).c()) == null ? null : object3.asBinder();
                    ax.P.g.b((Bundle)f8, "extra_session_binder", (IBinder)object3);
                } else {
                    this.a.add((Bundle)f8);
                }
                n9 = object2.getInt("extra_calling_pid", -1);
                object2.remove("extra_calling_pid");
                object3 = f8;
            } else {
                object3 = null;
                n9 = -1;
            }
            f8 = new f(this.d, (String)object, n9, n8, (Bundle)object2, null);
            ax.M0.c c8 = this.d;
            c8.f = f8;
            object2 = c8.n((String)object, n8, (Bundle)object2);
            object = this.d;
            ((ax.M0.c)((Object)object)).f = null;
            if (object2 == null) {
                return null;
            }
            if (this.c != null) {
                ((ax.M0.c)((Object)object)).d.add(f8);
            }
            if (object3 == null) {
                object = ((e)object2).c();
            } else {
                object = object3;
                if (((e)object2).c() != null) {
                    object3.putAll(((e)object2).c());
                    object = object3;
                }
            }
            return new e(((e)object2).d(), (Bundle)object);
        }

        public void e(String string, m<List<Parcel>> object) {
            l<List<MediaBrowserCompat.MediaItem>> l8 = new l<List<MediaBrowserCompat.MediaItem>>(this, (Object)string, object){
                final m f;
                final h g;
                {
                    this.g = h8;
                    this.f = m8;
                    super(object);
                }

                void h(List<MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        list = Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST;
                    } else {
                        ArrayList<Parcel> arrayList = new ArrayList<Parcel>(list.size());
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel parcel = Parcel.obtain();
                            mediaItem.writeToParcel(parcel, 0);
                            arrayList.add(parcel);
                        }
                        list = arrayList;
                    }
                    this.f.b(list);
                }
            };
            object = this.d;
            ((ax.M0.c)((Object)object)).f = ((ax.M0.c)((Object)object)).c;
            ((ax.M0.c)((Object)object)).o(string, l8);
            this.d.f = null;
        }

        void f(MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                android.support.v4.media.session.b b8 = token.c();
                if (b8 != null) {
                    Iterator<Bundle> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ax.P.g.b(iterator.next(), "extra_session_binder", b8.asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession.Token)token.e());
        }

        class c
        extends MediaBrowserService {
            final h a;

            c(h h8, Context context) {
                this.a = h8;
                this.attachBaseContext(context);
            }

            public MediaBrowserService.BrowserRoot onGetRoot(String object, int n8, Bundle object2) {
                MediaSessionCompat.a(object2);
                h h8 = this.a;
                object2 = object2 == null ? null : new Bundle(object2);
                object = h8.d((String)object, n8, (Bundle)object2);
                if (object == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(((e)object).a, ((e)object).b);
            }

            public void onLoadChildren(String string, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                this.a.e(string, new m<List<Parcel>>(result));
            }
        }
    }

    class i
    extends h {
        final c e;

        i(c c8) {
            this.e = c8;
            super(c8);
        }

        @Override
        public void a() {
            b b8 = new b(this, (Context)this.e);
            this.b = b8;
            b8.onCreate();
        }

        public void g(String string, m<Parcel> object) {
            l<MediaBrowserCompat.MediaItem> l8 = new l<MediaBrowserCompat.MediaItem>(this, (Object)string, object){
                final m f;
                final i g;
                {
                    this.g = i8;
                    this.f = m8;
                    super(object);
                }

                void h(MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        this.f.b(null);
                        return;
                    }
                    Parcel parcel = Parcel.obtain();
                    mediaItem.writeToParcel(parcel, 0);
                    this.f.b(parcel);
                }
            };
            object = this.e;
            ((c)((Object)object)).f = ((c)((Object)object)).c;
            ((c)((Object)object)).r(string, l8);
            this.e.f = null;
        }

        class b
        extends h.c {
            final i b;

            b(i i8, Context context) {
                this.b = i8;
                super(i8, context);
            }

            public void onLoadItem(String string, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                this.b.g(string, new m<Parcel>(result));
            }
        }
    }

    class j
    extends i {
        final c f;

        j(c c8) {
            this.f = c8;
            super(c8);
        }

        @Override
        public void a() {
            b b8 = new b(this, (Context)this.f);
            this.b = b8;
            b8.onCreate();
        }

        public void h(String string, m<List<Parcel>> object, Bundle bundle) {
            l<List<MediaBrowserCompat.MediaItem>> l8 = new l<List<MediaBrowserCompat.MediaItem>>(this, (Object)string, object, bundle){
                final m f;
                final Bundle g;
                final j h;
                {
                    this.h = j8;
                    this.f = m8;
                    this.g = bundle;
                    super(object);
                }

                void h(List<MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        this.f.b(null);
                        return;
                    }
                    Object object = list;
                    if ((this.a() & 1) != 0) {
                        object = this.h.f.h(list, this.g);
                    }
                    list = new ArrayList<MediaBrowserCompat.MediaItem>(object.size());
                    Iterator<MediaBrowserCompat.MediaItem> iterator = object.iterator();
                    while (iterator.hasNext()) {
                        object = iterator.next();
                        Parcel parcel = Parcel.obtain();
                        ((MediaBrowserCompat.MediaItem)object).writeToParcel(parcel, 0);
                        list.add((MediaBrowserCompat.MediaItem)parcel);
                    }
                    this.f.b(list);
                }
            };
            object = this.f;
            ((c)((Object)object)).f = ((c)((Object)object)).c;
            ((c)((Object)object)).q(string, l8, bundle);
            this.f.f = null;
        }

        class b
        extends i.b {
            final j c;

            b(j j8, Context context) {
                this.c = j8;
                super(j8, context);
            }

            public void onLoadChildren(String string, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j j8 = this.c;
                c c8 = j8.f;
                c8.f = c8.c;
                j8.h(string, new m<List<Parcel>>(result), bundle);
                this.c.f.f = null;
            }
        }
    }

    class k
    extends j {
        final c g;

        k(c c8) {
            this.g = c8;
            super(c8);
        }
    }

    public static class l<T> {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        l(Object object) {
            this.a = object;
        }

        int a() {
            return this.e;
        }

        boolean b() {
            return this.b || this.c || this.d;
            {
            }
        }

        void c(Bundle object) {
            object = new StringBuilder();
            ((StringBuilder)object).append("It is not supported to send an error for ");
            ((StringBuilder)object).append(this.a);
            throw new UnsupportedOperationException(((StringBuilder)object).toString());
        }

        void d(T t8) {
            throw null;
        }

        public void e(Bundle object) {
            if (!this.c && !this.d) {
                this.d = true;
                this.c((Bundle)object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("sendError() called when either sendResult() or sendError() had already been called for: ");
            ((StringBuilder)object).append(this.a);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        public void f(T object) {
            if (!this.c && !this.d) {
                this.c = true;
                this.d(object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            ((StringBuilder)object).append(this.a);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }

        void g(int n8) {
            this.e = n8;
        }
    }

    static class m<T> {
        MediaBrowserService.Result a;

        m(MediaBrowserService.Result result) {
            this.a = result;
        }

        List<MediaBrowser.MediaItem> a(List<Parcel> parcel2) {
            if (parcel2 == null) {
                return null;
            }
            ArrayList<MediaBrowser.MediaItem> arrayList = new ArrayList<MediaBrowser.MediaItem>(parcel2.size());
            for (Parcel parcel2 : parcel2) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
            return arrayList;
        }

        public void b(T object) {
            if (object instanceof List) {
                this.a.sendResult(this.a((List)object));
                return;
            }
            if (object instanceof Parcel) {
                object = (Parcel)object;
                object.setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(object));
                object.recycle();
                return;
            }
            this.a.sendResult(null);
        }
    }

    private class n {
        final c a;

        n(c c8) {
            this.a = c8;
        }

        public void a(String string, IBinder iBinder, Bundle bundle, o o8) {
            this.a.g.a(new Runnable(){
                final String c0;
                final IBinder d0;
                final Bundle e0;
                final n f0;
                final o q;
                {
                    this.f0 = n8;
                    this.q = o8;
                    this.c0 = string;
                    this.d0 = iBinder;
                    this.e0 = bundle;
                }

                @Override
                public void run() {
                    Object object = this.q.asBinder();
                    if ((object = this.f0.a.e.get(object)) == null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("addSubscription for callback that isn't registered id=");
                        ((StringBuilder)object).append(this.c0);
                        Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                        return;
                    }
                    this.f0.a.f(this.c0, (f)object, this.d0, this.e0);
                }
            });
        }

        public void b(String string, int n8, int n9, Bundle object, o o8) {
            if (this.a.l(string, n9)) {
                this.a.g.a(new Runnable(){
                    final String c0;
                    final int d0;
                    final int e0;
                    final Bundle f0;
                    final n g0;
                    final o q;
                    {
                        this.g0 = n8;
                        this.q = o8;
                        this.c0 = string;
                        this.d0 = n9;
                        this.e0 = n10;
                        this.f0 = bundle;
                    }

                    @Override
                    public void run() {
                        Object object = this.q.asBinder();
                        this.g0.a.e.remove(object);
                        f f8 = new f(this.g0.a, this.c0, this.d0, this.e0, this.f0, this.q);
                        Object object2 = this.g0.a;
                        object2.f = f8;
                        object2 = object2.n(this.c0, this.e0, this.f0);
                        f8.h = object2;
                        c c8 = this.g0.a;
                        c8.f = null;
                        if (object2 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("No root for client ");
                            ((StringBuilder)object).append(this.c0);
                            ((StringBuilder)object).append(" from service ");
                            ((StringBuilder)object).append(this.getClass().getName());
                            Log.i((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                            try {
                                this.q.b();
                                return;
                            }
                            catch (RemoteException remoteException) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                                stringBuilder.append(this.c0);
                                Log.w((String)"MBServiceCompat", (String)stringBuilder.toString());
                            }
                        } else {
                            try {
                                c8.e.put((IBinder)object, f8);
                                object.linkToDeath((IBinder.DeathRecipient)f8, 0);
                                if (this.g0.a.h != null) {
                                    this.q.c(f8.h.d(), this.g0.a.h, f8.h.c());
                                    return;
                                }
                            }
                            catch (RemoteException remoteException) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Calling onConnect() failed. Dropping client. pkg=");
                                stringBuilder.append(this.c0);
                                Log.w((String)"MBServiceCompat", (String)stringBuilder.toString());
                                this.g0.a.e.remove(object);
                            }
                        }
                    }
                });
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Package/uid mismatch: uid=");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(" package=");
            ((StringBuilder)object).append(string);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        public void c(o o8) {
            this.a.g.a(new Runnable(){
                final n c0;
                final o q;
                {
                    this.c0 = n8;
                    this.q = o8;
                }

                @Override
                public void run() {
                    Object object = this.q.asBinder();
                    if ((object = this.c0.a.e.remove(object)) != null) {
                        object.f.asBinder().unlinkToDeath((IBinder.DeathRecipient)object, 0);
                    }
                }
            });
        }

        public void d(String string, ax.h.b b8, o o8) {
            if (!TextUtils.isEmpty((CharSequence)string) && b8 != null) {
                this.a.g.a(new Runnable(){
                    final String c0;
                    final ax.h.b d0;
                    final n e0;
                    final o q;
                    {
                        this.e0 = n8;
                        this.q = o8;
                        this.c0 = string;
                        this.d0 = b8;
                    }

                    @Override
                    public void run() {
                        Object object = this.q.asBinder();
                        if ((object = this.e0.a.e.get(object)) == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("getMediaItem for callback that isn't registered id=");
                            ((StringBuilder)object).append(this.c0);
                            Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                            return;
                        }
                        this.e0.a.x(this.c0, (f)object, this.d0);
                    }
                });
            }
        }

        public void e(o o8, String string, int n8, int n9, Bundle bundle) {
            this.a.g.a(new Runnable(){
                final int c0;
                final String d0;
                final int e0;
                final Bundle f0;
                final n g0;
                final o q;
                {
                    this.g0 = n8;
                    this.q = o8;
                    this.c0 = n9;
                    this.d0 = string;
                    this.e0 = n10;
                    this.f0 = bundle;
                }

                @Override
                public void run() {
                    f f8;
                    f f9;
                    IBinder iBinder;
                    block7: {
                        Iterator<f> iterator;
                        block9: {
                            f f10;
                            block8: {
                                iBinder = this.q.asBinder();
                                this.g0.a.e.remove((Object)iBinder);
                                iterator = this.g0.a.d.iterator();
                                do {
                                    boolean bl = iterator.hasNext();
                                    f9 = null;
                                    f8 = null;
                                    if (!bl) break block7;
                                    f10 = iterator.next();
                                } while (f10.c != this.c0);
                                if (TextUtils.isEmpty((CharSequence)this.d0)) break block8;
                                f9 = f8;
                                if (this.e0 > 0) break block9;
                            }
                            f9 = new f(this.g0.a, f10.a, f10.b, f10.c, this.f0, this.q);
                        }
                        iterator.remove();
                    }
                    f8 = f9;
                    if (f9 == null) {
                        f8 = new f(this.g0.a, this.d0, this.e0, this.c0, this.f0, this.q);
                    }
                    this.g0.a.e.put(iBinder, f8);
                    try {
                        iBinder.linkToDeath(f8, 0);
                        return;
                    }
                    catch (RemoteException remoteException) {
                        Log.w((String)"MBServiceCompat", (String)"IBinder is already dead.");
                        return;
                    }
                }
            });
        }

        public void f(String string, IBinder iBinder, o o8) {
            this.a.g.a(new Runnable(){
                final String c0;
                final IBinder d0;
                final n e0;
                final o q;
                {
                    this.e0 = n8;
                    this.q = o8;
                    this.c0 = string;
                    this.d0 = iBinder;
                }

                @Override
                public void run() {
                    Object object = this.q.asBinder();
                    if ((object = this.e0.a.e.get(object)) == null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("removeSubscription for callback that isn't registered id=");
                        ((StringBuilder)object).append(this.c0);
                        Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                        return;
                    }
                    if (!this.e0.a.z(this.c0, (f)object, this.d0)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("removeSubscription called for ");
                        ((StringBuilder)object).append(this.c0);
                        ((StringBuilder)object).append(" which is not subscribed");
                        Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                    }
                }
            });
        }

        public void g(String string, Bundle bundle, ax.h.b b8, o o8) {
            if (!TextUtils.isEmpty((CharSequence)string) && b8 != null) {
                this.a.g.a(new Runnable(){
                    final String c0;
                    final Bundle d0;
                    final ax.h.b e0;
                    final n f0;
                    final o q;
                    {
                        this.f0 = n8;
                        this.q = o8;
                        this.c0 = string;
                        this.d0 = bundle;
                        this.e0 = b8;
                    }

                    @Override
                    public void run() {
                        Object object = this.q.asBinder();
                        if ((object = this.f0.a.e.get(object)) == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("search for callback that isn't registered query=");
                            ((StringBuilder)object).append(this.c0);
                            Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                            return;
                        }
                        this.f0.a.y(this.c0, this.d0, (f)object, this.e0);
                    }
                });
            }
        }

        public void h(String string, Bundle bundle, ax.h.b b8, o o8) {
            if (!TextUtils.isEmpty((CharSequence)string) && b8 != null) {
                this.a.g.a(new Runnable(){
                    final String c0;
                    final Bundle d0;
                    final ax.h.b e0;
                    final n f0;
                    final o q;
                    {
                        this.f0 = n8;
                        this.q = o8;
                        this.c0 = string;
                        this.d0 = bundle;
                        this.e0 = b8;
                    }

                    @Override
                    public void run() {
                        Object object = this.q.asBinder();
                        if ((object = this.f0.a.e.get(object)) == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("sendCustomAction for callback that isn't registered action=");
                            ((StringBuilder)object).append(this.c0);
                            ((StringBuilder)object).append(", extras=");
                            ((StringBuilder)object).append(this.d0);
                            Log.w((String)"MBServiceCompat", (String)((StringBuilder)object).toString());
                            return;
                        }
                        this.f0.a.v(this.c0, this.d0, (f)object, this.e0);
                    }
                });
            }
        }

        public void i(o o8) {
            this.a.g.a(new Runnable(){
                final n c0;
                final o q;
                {
                    this.c0 = n8;
                    this.q = o8;
                }

                @Override
                public void run() {
                    IBinder iBinder = this.q.asBinder();
                    f f8 = this.c0.a.e.remove((Object)iBinder);
                    if (f8 != null) {
                        iBinder.unlinkToDeath((IBinder.DeathRecipient)f8, 0);
                    }
                }
            });
        }
    }

    private static interface o {
        public void a(String var1, List<MediaBrowserCompat.MediaItem> var2, Bundle var3, Bundle var4) throws RemoteException;

        public IBinder asBinder();

        public void b() throws RemoteException;

        public void c(String var1, MediaSessionCompat.Token var2, Bundle var3) throws RemoteException;
    }

    private static class p
    implements o {
        final Messenger a;

        p(Messenger messenger) {
            this.a = messenger;
        }

        private void d(int n8, Bundle bundle) throws RemoteException {
            Message message = Message.obtain();
            message.what = n8;
            message.arg1 = 2;
            message.setData(bundle);
            this.a.send(message);
        }

        @Override
        public void a(String arrayList, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", (String)((Object)arrayList));
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                arrayList = list instanceof ArrayList ? (ArrayList)list : new ArrayList<MediaBrowserCompat.MediaItem>(list);
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            this.d(3, bundle3);
        }

        @Override
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override
        public void b() throws RemoteException {
            this.d(2, null);
        }

        @Override
        public void c(String string, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt("extra_service_version", 2);
            bundle = new Bundle();
            bundle.putString("data_media_item_id", string);
            bundle.putParcelable("data_media_session_token", (Parcelable)token);
            bundle.putBundle("data_root_hints", bundle2);
            this.d(1, bundle);
        }
    }

    private static final class q
    extends Handler {
        private c a;

        q(c c8) {
            this.a = c8;
        }

        public void a(Runnable runnable2) {
            if (Thread.currentThread() == this.getLooper().getThread()) {
                runnable2.run();
                return;
            }
            this.post(runnable2);
        }

        public void b() {
            this.a = null;
        }

        public void handleMessage(Message message) {
            c c8 = this.a;
            if (c8 != null) {
                c8.k(message);
                return;
            }
            this.removeCallbacksAndMessages(null);
        }

        public boolean sendMessageAtTime(Message message, long l8) {
            Bundle bundle = message.getData();
            bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            bundle.putInt("data_calling_uid", Binder.getCallingUid());
            int n8 = Binder.getCallingPid();
            if (n8 > 0) {
                bundle.putInt("data_calling_pid", n8);
            } else if (!bundle.containsKey("data_calling_pid")) {
                bundle.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, l8);
        }
    }
}


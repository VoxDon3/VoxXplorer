package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.E3.h;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1491f;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1815c;
import ax.c3.C1819g;
import ax.c3.d0;
import ax.c3.k0;
import ax.d5.C1940a;
import ax.d5.C1941b;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3204v;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxBookmark;
import com.box.androidsdk.content.models.BoxDownload;
import com.box.androidsdk.content.models.BoxError;
import com.box.androidsdk.content.models.BoxFolder;
import com.box.androidsdk.content.models.BoxItem;
import com.box.androidsdk.content.models.BoxIteratorItems;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequestItemUpdate;
import com.box.androidsdk.content.requests.BoxRequestUpload;
import com.box.androidsdk.content.requests.BoxRequestsFile$CopyFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadFile;
import com.box.androidsdk.content.requests.BoxRequestsFile$DownloadThumbnail;
import com.box.androidsdk.content.requests.BoxRequestsFolder$DeleteFolder;
import com.box.androidsdk.content.requests.BoxRequestsFolder$GetFolderItems;
import com.box.androidsdk.content.requests.BoxRequestsSearch$Search;
import com.box.androidsdk.content.requests.BoxResponse;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* renamed from: com.voxdon.xplorer.file.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3585d extends AbstractC3594m {
    private static final Logger q = Logger.getLogger("FileManager.BoxFileHelper");
    private static f r;
    private BoxSession h;
    private ax.E3.b i;
    private ax.E3.c j;
    private ax.E3.d k;
    private ax.E3.e l;
    private ConcurrentHashMap<String, C1815c> m = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> n = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> o = new ConcurrentHashMap<>();
    private final Object p = new Object();

    /* renamed from: com.voxdon.xplorer.file.d$a */
    class a implements h.b<BoxDownload> {
        final /* synthetic */ C1941b a;
        final /* synthetic */ g b;

        a(C1941b c1941b, g gVar) {
            this.a = c1941b;
            this.b = gVar;
        }

        @Override // ax.E3.h.b
        public void a(BoxResponse<BoxDownload> boxResponse) {
            try {
                try {
                    if (boxResponse.c()) {
                        this.a.flush();
                    } else {
                        this.b.m(boxResponse.a());
                    }
                    this.a.close();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                this.a.close();
            } catch (Throwable th) {
                try {
                    this.a.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$b */
    class b implements h.b<BoxDownload> {
        final /* synthetic */ C1941b a;
        final /* synthetic */ g b;

        b(C1941b c1941b, g gVar) {
            this.a = c1941b;
            this.b = gVar;
        }

        @Override // ax.E3.h.b
        public void a(BoxResponse<BoxDownload> boxResponse) {
            try {
                try {
                    C3585d.q.fine("download complete :" + boxResponse.c());
                    if (boxResponse.c()) {
                        this.a.flush();
                    } else {
                        this.b.m(boxResponse.a());
                    }
                    this.a.close();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                this.a.close();
            } catch (Throwable th) {
                try {
                    this.a.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$c */
    class c implements ax.F3.b {
        final /* synthetic */ ax.g3.i a;
        final /* synthetic */ long b;
        final /* synthetic */ InterfaceC3185c c;
        final /* synthetic */ InputStream d;

        c(ax.g3.i iVar, long j, InterfaceC3185c interfaceC3185c, InputStream inputStream) {
            this.a = iVar;
            this.b = j;
            this.c = interfaceC3185c;
            this.d = inputStream;
        }

        @Override // ax.F3.b
        public void a(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                iVar.a(j, this.b);
            }
            InterfaceC3185c interfaceC3185c = this.c;
            if (interfaceC3185c == null || !interfaceC3185c.isCancelled()) {
                return;
            }
            try {
                this.d.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$d, reason: collision with other inner class name */
    class C0522d implements BoxAuthentication.e {
        final /* synthetic */ AtomicBoolean c0;
        final /* synthetic */ AtomicInteger d0;
        final /* synthetic */ InterfaceC3584c.a e0;
        final /* synthetic */ BoxSession q;

        /* renamed from: com.voxdon.xplorer.file.d$d$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0522d.this.e0.T(true, null);
            }
        }

        /* renamed from: com.voxdon.xplorer.file.d$d$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0522d.this.e0.T(false, null);
            }
        }

        C0522d(BoxSession boxSession, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, InterfaceC3584c.a aVar) {
            this.q = boxSession;
            this.c0 = atomicBoolean;
            this.d0 = atomicInteger;
            this.e0 = aVar;
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exc) {
            C3585d.q.fine("Box : onAuthFailure");
            if (!this.c0.get()) {
                this.c0.set(true);
                this.d0.set(2);
                C3585d.this.f0(new b());
            } else {
                int i = this.d0.get();
                ax.Ha.c.h().f().d("Box onConnectResult Twice 2").g("called:" + i).h();
            }
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            C3585d.q.fine("Box : onRefreshed");
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            C3585d.this.y0(this.q);
            if (!this.c0.get()) {
                this.c0.set(true);
                this.d0.set(1);
                C3585d.this.f0(new a());
            } else {
                int i = this.d0.get();
                ax.Ha.c.h().f().d("Box onConnectResult Twice 1").g("called:" + i).h();
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$e */
    class e implements h.b<BoxSession> {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ AtomicInteger b;
        final /* synthetic */ InterfaceC3584c.a c;

        /* renamed from: com.voxdon.xplorer.file.d$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.c.T(false, null);
            }
        }

        e(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, InterfaceC3584c.a aVar) {
            this.a = atomicBoolean;
            this.b = atomicInteger;
            this.c = aVar;
        }

        @Override // ax.E3.h.b
        public void a(BoxResponse<BoxSession> boxResponse) {
            if (this.a.get()) {
                return;
            }
            this.a.set(true);
            this.b.set(3);
            if (C3585d.this.a()) {
                return;
            }
            C3585d.this.f0(new a());
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$f */
    public static class f extends T {
        Context a;

        /* renamed from: com.voxdon.xplorer.file.d$f$a */
        class a implements BoxAuthentication.e {
            final /* synthetic */ ax.g3.k q;

            /* renamed from: com.voxdon.xplorer.file.d$f$a$a, reason: collision with other inner class name */
            class RunnableC0523a implements Runnable {
                final /* synthetic */ int q;

                RunnableC0523a(int i) {
                    this.q = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.q.c(ax.Q2.f.S0, this.q);
                }
            }

            /* renamed from: com.voxdon.xplorer.file.d$f$a$b */
            class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.q.a(ax.Q2.f.S0, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, null);
                }
            }

            a(ax.g3.k kVar) {
                this.q = kVar;
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
            public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exc) {
                C3585d.q.fine("Box : onAuthFailure");
                new Handler(Looper.getMainLooper()).post(new b());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
            public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
                C3585d.q.fine("Box : onRefreshed");
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
            public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
                C3585d.q.fine("Box : onAuthCreated");
                String G = boxAuthenticationInfo.K().G();
                int m = f.this.m();
                int l = f.this.l(G);
                if (l >= 0) {
                    m = l;
                }
                f.this.o(m, boxAuthenticationInfo);
                new Handler(Looper.getMainLooper()).post(new RunnableC0523a(m));
            }
        }

        public f(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("BoxCloudPrefs", 0).edit().remove("accountid_" + i).remove("email_" + i).remove("display_name_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("BoxCloudPrefs", 0);
            String string = sharedPreferences.getString("email_" + i, null);
            ax.Q2.f fVar = ax.Q2.f.S0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), string, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("BoxCloudPrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("BoxCloudPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(com.voxdon.xplorer.activity.a aVar, ax.g3.k kVar) {
            kVar.b(ax.Q2.f.S0);
            C3585d.u0(aVar);
            BoxSession boxSession = new BoxSession(aVar, null);
            boxSession.R(new a(kVar));
            boxSession.l(aVar);
        }

        int l(String str) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("BoxCloudPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.contains("accountid_" + i2) && !TextUtils.isEmpty(str)) {
                    if (str.equals(sharedPreferences.getString("accountid_" + i2, null))) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        int m() {
            return this.a.getSharedPreferences("BoxCloudPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> n() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("BoxCloudPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("email_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void o(int i, BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            BoxUser K = boxAuthenticationInfo.K();
            String I = K.I();
            String G = K.G();
            String J = K.J();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("BoxCloudPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("accountid_" + i, G).putString("display_name_" + i, I).putString("email_" + i, J).putString("location_name_" + i, ax.Q2.f.S0.M(this.a));
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
        }
    }

    /* renamed from: com.voxdon.xplorer.file.d$g */
    protected static class g extends C1940a {
        Throwable j0;

        protected g(int i) {
            super(i);
        }

        public void m(Throwable th) {
            this.j0 = th;
        }

        @Override // ax.d5.C1940a, java.io.InputStream
        public synchronized int read() throws IOException {
            int read;
            try {
                if (this.j0 != null) {
                    throw new IOException("Error raised", this.j0);
                }
                read = super.read();
                if (this.j0 != null) {
                    throw new IOException("Error raised", this.j0);
                }
            } catch (Throwable th) {
                throw th;
            }
            return read;
        }
    }

    private C1495j n0(String str, BoxException boxException) {
        BoxException.ErrorType c2 = boxException.c();
        BoxError b2 = boxException.b();
        String D = b2 != null ? b2.D() : null;
        String C = b2 != null ? b2.C() : null;
        int e2 = boxException.e();
        if (c2 == BoxException.ErrorType.NETWORK_ERROR) {
            return new ax.b3.q(boxException);
        }
        if (c2 == BoxException.ErrorType.ACCESS_DENIED) {
            return new C1490e(boxException);
        }
        if (e2 == 404 && "not_found".equals(C)) {
            return new ax.b3.t(boxException);
        }
        if (e2 == 403 && "access_denied_insufficient_permissions".equals(C)) {
            return new C1490e(str, boxException);
        }
        if (e2 == 403 && "storage_limit_exceeded".equals(C)) {
            return new ax.b3.s(str, boxException);
        }
        if (e2 == 403 && "file_size_limit_exceeded".equals(C)) {
            return new ax.b3.D(str, boxException);
        }
        if (e2 == 409 && ("conflict".equals(C) || "item_name_in_use".equals(C))) {
            return new C1491f(false);
        }
        if ("Couldn't connect to the Box API due to a network error".equals(boxException.getMessage())) {
            return new ax.b3.q(boxException);
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (C != null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET + " code:" + C;
        }
        if (D != null) {
            str2 = str2 + " error:" + D;
        }
        if (e2 != 0) {
            str2 = str2 + " responseCode:" + e2;
        }
        return C1489d.b(str + str2, boxException);
    }

    private void o0(AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        try {
            w0(abstractC3595n.E());
            if (!abstractC3595n.isDirectory()) {
                this.i.d(abstractC3595n.t()).x();
                return;
            }
            BoxRequestsFolder$DeleteFolder d = this.j.d(abstractC3595n.t());
            if (z) {
                d.E(true);
            } else {
                d.E(false);
            }
            d.x();
        } catch (BoxException e2) {
            throw n0("deleteFile", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BoxItem p0(String str, String str2) throws C1495j {
        System.currentTimeMillis();
        int i = 0;
        while (true) {
            try {
                BoxRequestsFolder$GetFolderItems h = this.j.h(str);
                h.E(q0());
                h.F(1000);
                if (i > 0) {
                    h.G(i);
                }
                BoxIteratorItems boxIteratorItems = (BoxIteratorItems) h.x();
                Iterator<E> it = boxIteratorItems.iterator();
                while (it.hasNext()) {
                    BoxItem boxItem = (BoxItem) it.next();
                    if (str2.equals(boxItem.M())) {
                        return boxItem;
                    }
                }
                int longValue = (int) (boxIteratorItems.J().longValue() + 1000);
                if (boxIteratorItems.C().longValue() < longValue) {
                    return null;
                }
                i = longValue;
            } catch (BoxException e2) {
                throw n0("getChildItem", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String[] q0() {
        return new String[]{"name", "size", "modified_at", "content_modified_at", "item_status", "parent", "permissions"};
    }

    public static f r0(Context context) {
        if (r == null) {
            r = new f(context.getApplicationContext());
        }
        return r;
    }

    private String s0(C1815c c1815c) throws C1495j {
        String g0 = c1815c.g0();
        if (g0 != null) {
            return g0;
        }
        C1815c c1815c2 = (C1815c) z(c1815c.T());
        if (c1815c2.n()) {
            return c1815c2.t();
        }
        return null;
    }

    private String[] t0() {
        return new String[]{"name", "size", "modified_at", "content_modified_at", "item_status", "parent", "path_collection", "permissions"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u0(Context context) {
        C1819g c2 = C1819g.c(context);
        ax.Q2.f fVar = ax.Q2.f.S0;
        ax.E3.g.c = c2.a(fVar);
        ax.E3.g.d = C1819g.c(context).b(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<BoxItem> v0(String str, String[] strArr) throws BoxException {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            BoxRequestsFolder$GetFolderItems h = this.j.h(str);
            h.E(strArr);
            h.F(1000);
            if (i > 0) {
                h.G(i);
            }
            BoxIteratorItems boxIteratorItems = (BoxIteratorItems) h.x();
            Iterator<E> it = boxIteratorItems.iterator();
            while (it.hasNext()) {
                arrayList.add((BoxItem) it.next());
            }
            int longValue = (int) (boxIteratorItems.J().longValue() + 1000);
            if (boxIteratorItems.C().longValue() < longValue) {
                return arrayList;
            }
            i = longValue;
        }
    }

    private void w0(String str) {
        for (String str2 : this.m.keySet()) {
            if (str2.startsWith(str)) {
                this.m.remove(str2);
                String remove = this.o.remove(str2);
                if (remove != null) {
                    this.n.remove(remove);
                }
            }
        }
    }

    private void x0(C1815c c1815c) {
        this.m.put(c1815c.E(), c1815c);
        this.n.put(c1815c.t(), c1815c.E());
        this.o.put(c1815c.E(), c1815c.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(BoxSession boxSession) {
        synchronized (this.p) {
            this.h = boxSession;
            this.i = new ax.E3.b(boxSession);
            this.j = new ax.E3.c(boxSession);
            this.k = new ax.E3.d(boxSession);
            this.l = new ax.E3.e(boxSession);
        }
    }

    private void z0(AbstractC3595n abstractC3595n, ax.c3.G g2, long j, Long l, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        BoxException boxException;
        String s0;
        BoxRequestUpload o;
        try {
            s0 = s0((C1815c) abstractC3595n);
        } catch (BoxException e2) {
            e = e2;
        }
        try {
            if (s0 == null) {
                throw new C1495j("Target parent does not exist");
            }
            InputStream b2 = g2.b();
            if (z) {
                try {
                    o = ((C1815c) abstractC3595n).f0() != null ? this.i.o(b2, abstractC3595n.t()) : this.i.p(b2, abstractC3595n.B(), s0);
                } catch (BoxException e3) {
                    boxException = e3;
                    throw n0("writeFile", boxException);
                }
            } else {
                o = this.i.p(b2, abstractC3595n.B(), s0);
            }
            BoxRequestUpload boxRequestUpload = o;
            if (l != null && l.longValue() >= 0) {
                boxRequestUpload.H(new Date(l.longValue()));
            }
            boxRequestUpload.I(new c(iVar, j, interfaceC3185c, b2));
            boxRequestUpload.x();
        } catch (BoxException e4) {
            e = e4;
            boxException = e;
            throw n0("writeFile", boxException);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) throws IOException {
        String decode;
        if (str3 != null) {
            try {
                if (str3.startsWith("fileid=")) {
                    decode = Uri.decode(str3.substring(7));
                    g gVar = new g(Http2.INITIAL_MAX_FRAME_SIZE);
                    C1941b c1941b = new C1941b(gVar);
                    BoxRequestsFile$DownloadThumbnail f2 = this.i.f(c1941b, decode);
                    f2.O(128);
                    ax.E3.h<E> D = f2.D();
                    D.a(new a(c1941b, gVar));
                    C3204v.f(AbstractC3199q.e.NORMAL).execute(D);
                    return gVar;
                }
            } catch (C1495j unused) {
                return null;
            }
        }
        C1815c c1815c = (C1815c) z(str2);
        if (c1815c != null && !c1815c.n()) {
            return null;
        }
        decode = c1815c.t();
        g gVar2 = new g(Http2.INITIAL_MAX_FRAME_SIZE);
        C1941b c1941b2 = new C1941b(gVar2);
        BoxRequestsFile$DownloadThumbnail f22 = this.i.f(c1941b2, decode);
        f22.O(128);
        ax.E3.h<E> D2 = f22.D();
        D2.a(new a(c1941b2, gVar2));
        C3204v.f(AbstractC3199q.e.NORMAL).execute(D2);
        return gVar2;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (this.j == null) {
            C1495j c1495j = new C1495j("FolderApi == null:connected = " + a() + ":" + (this.j == null));
            ax.Q2.d.b(c1495j);
            throw c1495j;
        }
        C3184b.c(abstractC3595n.isDirectory());
        try {
            ArrayList arrayList = new ArrayList();
            for (BoxItem boxItem : v0(abstractC3595n.t(), q0())) {
                if (!(boxItem instanceof BoxBookmark)) {
                    arrayList.add(new C1815c(this, abstractC3595n.t(), boxItem, d0.Q(abstractC3595n.E(), boxItem.M())));
                }
            }
            return arrayList;
        } catch (BoxException e2) {
            throw n0("listChildren", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        z0(abstractC3595n, g2, j, l, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        boolean equals = abstractC3595n.T().equals(abstractC3595n2.T());
        boolean equals2 = abstractC3595n.B().equals(abstractC3595n2.B());
        if (abstractC3595n.isDirectory()) {
            w0(abstractC3595n.E());
        }
        try {
            BoxRequestItemUpdate i = abstractC3595n.isDirectory() ? this.j.i(abstractC3595n.t()) : this.i.n(abstractC3595n.t());
            if (!equals) {
                i.G(s0((C1815c) abstractC3595n2));
            }
            if (!equals2) {
                i.F(abstractC3595n2.B());
            }
            i.x();
        } catch (BoxException e2) {
            throw n0("moveFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        try {
            boolean equals = abstractC3595n.B().equals(abstractC3595n2.B());
            String s0 = s0((C1815c) abstractC3595n2);
            if (s0 == null) {
                throw new C1495j("Target parent does not exist");
            }
            long p = abstractC3595n.p();
            BoxRequestsFile$CopyFile c2 = this.i.c(abstractC3595n.t(), s0);
            if (!equals) {
                c2.F(abstractC3595n2.B());
            }
            c2.x();
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (BoxException e2) {
            throw n0("copyFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (!C1808A.J(abstractC3595n)) {
            return null;
        }
        return C1809B.a0(abstractC3595n, "fileid=" + Uri.encode(abstractC3595n.t()));
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        o0(abstractC3595n, true);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (!a()) {
            throw new C1493h("Box is not connected!");
        }
        try {
            g gVar = new g(Http2.INITIAL_MAX_FRAME_SIZE);
            C1941b c1941b = new C1941b(gVar);
            BoxRequestsFile$DownloadFile e2 = this.i.e(c1941b, abstractC3595n.t());
            if (j > 0) {
                e2.H(j, abstractC3595n.p());
            }
            ax.E3.h<E> D = e2.D();
            D.a(new b(c1941b, gVar));
            C3204v.f(AbstractC3199q.e.NORMAL).execute(D);
            return gVar;
        } catch (IOException e3) {
            e3.printStackTrace();
            throw new C1495j(e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        int t = t();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        SharedPreferences sharedPreferences = p().getSharedPreferences("BoxCloudPrefs", 0);
        String string = sharedPreferences.getString("accountid_" + t, null);
        String string2 = sharedPreferences.getString("email_" + t, null);
        u0(activity);
        try {
            BoxSession boxSession = new BoxSession(p(), string);
            boxSession.O(string2);
            boxSession.R(new C0522d(boxSession, atomicBoolean, atomicInteger, aVar));
            boxSession.l(p()).a(new e(atomicBoolean, atomicInteger, aVar));
            aVar.B();
        } catch (RuntimeException e2) {
            ax.Q2.d.c("box init", e2);
            aVar.T(false, null);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            String T = abstractC3595n.T();
            String B = abstractC3595n.B();
            C1815c c1815c = (C1815c) z(T);
            if (!c1815c.n()) {
                return false;
            }
            return true;
        } catch (C1495j | BoxException unused) {
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return l(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        o0(abstractC3595n, false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        boolean z;
        synchronized (this.p) {
            z = this.h != null;
        }
        return z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        this.m.clear();
        this.o.clear();
        this.n.clear();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean g0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        z0(abstractC3595n, g2, j, l, true, interfaceC3185c, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        if (!z2) {
            o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
            return;
        }
        try {
            String s0 = s0((C1815c) abstractC3595n);
            BoxRequestsSearch$Search c2 = this.k.c(str);
            c2.G(new String[]{BoxRequestsSearch$Search.f0});
            c2.F(new String[]{s0});
            c2.E(t0());
            c2.I(200);
            BoxIteratorItems boxIteratorItems = (BoxIteratorItems) c2.x();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = boxIteratorItems.iterator();
            while (it.hasNext()) {
                BoxItem boxItem = (BoxItem) it.next();
                String str2 = "/";
                Iterator<BoxFolder> it2 = boxItem.O().iterator();
                while (it2.hasNext()) {
                    BoxFolder next = it2.next();
                    if (next.G() != "0") {
                        str2 = d0.Q(str2, next.M());
                    }
                }
                arrayList.add(new C1815c(this, boxItem.N().G(), boxItem, d0.Q(str2, boxItem.M())));
            }
            if (hVar != null) {
                hVar.Y(arrayList, true);
            }
        } catch (BoxException e2) {
            throw n0("search", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        try {
            BoxUser boxUser = (BoxUser) this.l.d().x();
            if (boxUser.K() == null || boxUser.M() == null) {
                return null;
            }
            return new k0(boxUser.K().longValue(), boxUser.M().longValue());
        } catch (BoxException e2) {
            if (this.h.D() == null || this.h.D().K() == null || this.h.D().M() == null) {
                throw n0("getStorageSpace", e2);
            }
            return new k0(this.h.D().K().longValue(), this.h.D().M().longValue());
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        if (!a()) {
            throw new C1493h("Box is not connected!");
        }
        if (this.m.containsKey(str)) {
            return this.m.get(str);
        }
        if (d0.a.equals(str)) {
            return new C1815c(this, str);
        }
        C1815c c1815c = (C1815c) z(d0.r(str));
        String h = d0.h(str);
        if (!c1815c.n() || !c1815c.isDirectory()) {
            return new C1815c(this, str);
        }
        BoxItem p0 = p0(c1815c.t(), h);
        if (p0 == null) {
            return new C1815c(this, c1815c, str);
        }
        C1815c c1815c2 = new C1815c(this, c1815c.t(), p0, str);
        if (c1815c2.isDirectory()) {
            x0(c1815c2);
        }
        return c1815c2;
    }
}

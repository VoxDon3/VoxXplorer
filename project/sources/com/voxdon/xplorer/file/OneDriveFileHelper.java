package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.Fragment;
import ax.N9.A;
import ax.N9.InterfaceC0836b0;
import ax.N9.InterfaceC0842e0;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1491f;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1819g;
import ax.c3.C1835x;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.k0;
import ax.d3.C1911a0;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.extensions.FileSystemInfo;
import com.microsoft.graph.extensions.Folder;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.extensions.IDriveItemSearchCollectionPage;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.Quota;
import com.microsoft.graph.extensions.User;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class OneDriveFileHelper extends AbstractC3594m {
    static j m;
    private final AtomicReference<InterfaceC0842e0> h = new AtomicReference<>();
    private final Map<String, String> i = new HashMap();
    private final Map<String, String> j = new HashMap();
    private Drive k;
    private static final Logger l = Logger.getLogger("FileManager.OneDriveFileHelper");
    static int n = 1048576;
    static int o = 5242880;

    public static class MyDriveItem extends DriveItem {

        @InterfaceC3059a
        @InterfaceC3061c("@microsoft.graph.conflictBehavior")
        public String U;
    }

    public static class MyDriveItemUploadableProperties extends DriveItemUploadableProperties {

        @InterfaceC3059a
        @InterfaceC3061c("@microsoft.graph.conflictBehavior")
        public String h;
    }

    class b implements ax.L9.c<InterfaceC0842e0> {
        final /* synthetic */ Fragment a;
        final /* synthetic */ InterfaceC3584c.a b;
        final /* synthetic */ AtomicBoolean c;
        final /* synthetic */ AtomicInteger d;

        class a implements ax.L9.c<Drive> {
            final /* synthetic */ InterfaceC0842e0 a;

            /* renamed from: com.voxdon.xplorer.file.OneDriveFileHelper$b$a$a, reason: collision with other inner class name */
            class RunnableC0515a implements Runnable {
                RunnableC0515a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (!b.this.c.get()) {
                        b.this.c.set(true);
                        b.this.d.set(1);
                        b.this.b.T(true, null);
                    } else {
                        int i = b.this.d.get();
                        ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 1").g("called:" + i).h();
                    }
                }
            }

            /* renamed from: com.voxdon.xplorer.file.OneDriveFileHelper$b$a$b, reason: collision with other inner class name */
            class RunnableC0516b implements Runnable {
                final /* synthetic */ ax.M9.d q;

                RunnableC0516b(ax.M9.d dVar) {
                    this.q = dVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (!b.this.c.get()) {
                        b.this.c.set(true);
                        b.this.d.set(2);
                        b.this.b.T(false, null);
                        ax.Ha.c.h().f().b("OneDrive get Drive failed").l(this.q).h();
                        return;
                    }
                    int i = b.this.d.get();
                    ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 2").g("called:" + i).h();
                }
            }

            a(InterfaceC0842e0 interfaceC0842e0) {
                this.a = interfaceC0842e0;
            }

            @Override // ax.L9.c
            public void b(ax.M9.d dVar) {
                C3180B.a0(new RunnableC0516b(dVar));
            }

            @Override // ax.L9.c
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(Drive drive) {
                OneDriveFileHelper.this.k = drive;
                b bVar = b.this;
                OneDriveFileHelper.this.V0(this.a, (C1911a0) bVar.a);
                if (b.this.b != null) {
                    C3180B.a0(new RunnableC0515a());
                }
            }
        }

        /* renamed from: com.voxdon.xplorer.file.OneDriveFileHelper$b$b, reason: collision with other inner class name */
        class RunnableC0517b implements Runnable {
            RunnableC0517b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!b.this.c.get()) {
                    b.this.c.set(true);
                    b.this.d.set(2);
                    b.this.b.T(false, null);
                } else {
                    int i = b.this.d.get();
                    ax.Ha.c.h().f().d("OneDrive onConnectResult Twice 3").g("called:" + i).h();
                }
            }
        }

        b(Fragment fragment, InterfaceC3584c.a aVar, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
            this.a = fragment;
            this.b = aVar;
            this.c = atomicBoolean;
            this.d = atomicInteger;
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
            if (this.b != null) {
                C3180B.a0(new RunnableC0517b());
            }
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(InterfaceC0842e0 interfaceC0842e0) {
            OneDriveFileHelper.this.h.set(interfaceC0842e0);
            OneDriveFileHelper.this.Y0(interfaceC0842e0);
            interfaceC0842e0.d().l().a().c(new a(interfaceC0842e0));
        }
    }

    class d implements ax.L9.e<DriveItem> {
        final /* synthetic */ ax.g3.i a;
        final /* synthetic */ ax.L9.f b;
        final /* synthetic */ AtomicBoolean c;
        final /* synthetic */ AtomicReference d;

        d(ax.g3.i iVar, ax.L9.f fVar, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
            this.a = iVar;
            this.b = fVar;
            this.c = atomicBoolean;
            this.d = atomicReference;
        }

        @Override // ax.L9.e
        public void a(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                iVar.a(j, j2);
            }
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
            this.c.set(false);
            this.d.set(dVar);
            this.b.a();
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(DriveItem driveItem) {
            this.b.a();
            this.c.set(true);
        }
    }

    class e extends ax.P9.b {
        e(String str, ax.M9.f fVar, List list, Class cls) {
            super(str, fVar, list, cls);
        }
    }

    class f implements ax.L9.e<DriveItem> {
        final /* synthetic */ ax.g3.i a;
        final /* synthetic */ AtomicReference b;

        f(ax.g3.i iVar, AtomicReference atomicReference) {
            this.a = iVar;
            this.b = atomicReference;
        }

        @Override // ax.L9.e
        public void a(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                iVar.a(j, j2);
            }
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
            this.b.set(dVar);
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(DriveItem driveItem) {
        }
    }

    class g extends ax.K9.b {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str) {
            super(context);
            this.c = str;
        }

        @Override // ax.K9.b
        public String e() {
            return this.c;
        }

        @Override // ax.K9.b
        public String[] g() {
            return new String[]{"offline_access", "Files.ReadWrite.All", "User.Read"};
        }
    }

    class h implements ax.L9.c<Void> {
        final /* synthetic */ ax.L9.c a;
        final /* synthetic */ InterfaceC0842e0 b;
        final /* synthetic */ Context c;
        final /* synthetic */ Activity d;
        final /* synthetic */ String e;

        class a implements ax.L9.c<Void> {
            final /* synthetic */ InterfaceC0842e0 a;

            a(InterfaceC0842e0 interfaceC0842e0) {
                this.a = interfaceC0842e0;
            }

            @Override // ax.L9.c
            public void b(ax.M9.d dVar) {
                h.this.a.b(dVar);
            }

            @Override // ax.L9.c
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(Void r2) {
                h.this.a.c(this.a);
            }
        }

        h(ax.L9.c cVar, InterfaceC0842e0 interfaceC0842e0, Context context, Activity activity, String str) {
            this.a = cVar;
            this.b = interfaceC0842e0;
            this.c = context;
            this.d = activity;
            this.e = str;
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
            OneDriveFileHelper.X0(this.c);
            InterfaceC0842e0 v0 = OneDriveFileHelper.v0(this.c);
            ax.K9.b bVar = (ax.K9.b) v0.c();
            Activity activity = this.d;
            if (activity == null) {
                this.a.b(null);
            } else {
                bVar.i(activity, this.e, new a(v0));
            }
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Void r2) {
            this.a.c(this.b);
        }
    }

    public static class j extends T {
        private Context a;
        c0 b = new c0(ax.Q2.f.P0);

        class a implements ax.L9.c<InterfaceC0842e0> {
            final /* synthetic */ ax.g3.k a;

            /* renamed from: com.voxdon.xplorer.file.OneDriveFileHelper$j$a$a, reason: collision with other inner class name */
            class RunnableC0518a implements Runnable {
                final /* synthetic */ int q;

                RunnableC0518a(int i) {
                    this.q = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a.c(ax.Q2.f.P0, this.q);
                }
            }

            class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a.a(ax.Q2.f.P0, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, null);
                }
            }

            a(ax.g3.k kVar) {
                this.a = kVar;
            }

            @Override // ax.L9.c
            public void b(ax.M9.d dVar) {
                if (this.a != null) {
                    C3180B.a0(new b());
                }
            }

            @Override // ax.L9.c
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(InterfaceC0842e0 interfaceC0842e0) {
                String f = ((ax.K9.b) interfaceC0842e0.c()).f();
                int l = j.this.l();
                j.this.n(l, f, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                if (this.a != null) {
                    C3180B.a0(new RunnableC0518a(l));
                }
            }
        }

        public j(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("OneDrivePrefs", 0).edit().remove("version_" + i).remove("refresh_token_" + i).remove("display_name_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).remove("email_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("OneDrivePrefs", 0);
            String string = sharedPreferences.getString("display_name_" + i, null);
            String string2 = sharedPreferences.getString("email_" + i, null);
            String str = TextUtils.isEmpty(string2) ? string : string2;
            ax.Q2.f fVar = ax.Q2.f.P0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), str, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("OneDrivePrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("OneDrivePrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(Activity activity, ax.g3.k kVar) {
            kVar.b(ax.Q2.f.P0);
            OneDriveFileHelper.X0(this.a);
            OneDriveFileHelper.T0(this.a, activity, null, new a(kVar));
        }

        int l() {
            return this.a.getSharedPreferences("OneDrivePrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> m() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("OneDrivePrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("refresh_token_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void n(int i, String str, String str2, String str3) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("OneDrivePrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            c0 c0Var = this.b;
            ax.Y2.a a2 = ax.Y2.a.a();
            ax.Q2.f fVar = ax.Q2.f.P0;
            edit.putInt("version_" + i, 3).putString("refresh_token_" + i, c0Var.e(a2.b(fVar), str)).putString("display_name_" + i, str2).putString("email_" + i, str3).putString("location_name_" + i, fVar.M(this.a));
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

    public OneDriveFileHelper() {
        s0("/", "/drive/root");
    }

    private String A0(String str, boolean z) throws C1495j, ax.M9.d {
        String M0 = M0(str);
        String F0 = M0 == null ? "/drive/root" : F0(M0);
        return F0 == null ? (P0(str) && z) ? "/drive/root" : a1(str) : F0;
    }

    private String B0(String str) {
        String str2;
        synchronized (this.i) {
            str2 = this.i.get(str);
        }
        return str2;
    }

    private ItemReference C0(String str) throws C1495j {
        ItemReference itemReference = new ItemReference();
        String A0 = A0(str, false);
        if (!"/drive/root".equals(A0)) {
            itemReference.c = w0(A0);
            itemReference.g = A0 + ":" + O0(str);
            return itemReference;
        }
        itemReference.c = I0();
        String str2 = "/drives/" + itemReference.c + "/root:";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if ("/".equals(str)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        itemReference.g = sb.toString();
        return itemReference;
    }

    private ax.N9.U D0(ax.c3.T t, boolean z, boolean z2) throws C1495j {
        DriveItem f0 = t.f0();
        try {
            if (f0 != null) {
                return (f0.D == null || !z2) ? z0().e(f0.m.c).n(f0.c) : z0().e(f0.D.m.c).n(f0.D.h);
            }
            if (z) {
                throw new ax.b3.t("item not exist");
            }
            return E0(t.E(), true);
        } catch (NullPointerException e2) {
            ax.Ha.c.h().f().b("Item request builder").l(e2).h();
            throw new C1495j("no onedrive item", e2);
        }
    }

    private ax.N9.U E0(String str, boolean z) throws C1495j {
        ax.N9.U n2;
        String A0 = A0(str, z);
        if ("/drive/root".equals(A0)) {
            n2 = L0();
        } else {
            String w0 = w0(A0);
            n2 = z0().e(w0).n(x0(A0));
            str = O0(str);
        }
        if (str.isEmpty() || "/".equals(str)) {
            return n2;
        }
        if (d0.B(str)) {
            str = str.substring(1);
        }
        return n2.h(Uri.encode(str));
    }

    private String F0(String str) {
        String str2;
        synchronized (this.i) {
            str2 = this.j.get(str);
        }
        return str2;
    }

    public static j G0(Context context) {
        if (m == null) {
            m = new j(context.getApplicationContext());
        }
        return m;
    }

    private InterfaceC0836b0 K0() throws C1495j {
        return z0().e(I0());
    }

    private ax.N9.U L0() throws C1495j {
        return K0().g();
    }

    private String M0(String str) {
        C3184b.c(d0.B(str));
        String[] split = str.split("/");
        if (split.length < 2) {
            return null;
        }
        return split[1];
    }

    private String O0(String str) {
        C3184b.c(d0.B(str));
        int indexOf = str.indexOf("/", 1);
        return indexOf < 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str.substring(indexOf);
    }

    private boolean P0(String str) {
        return str.split("/").length == 2;
    }

    private boolean Q0(DriveItem driveItem) throws C1495j {
        ItemReference itemReference = driveItem.m;
        if (itemReference != null) {
            String str = itemReference.g;
            if (str == null) {
                return I0().equals(driveItem.m.c);
            }
            if (str.startsWith("/drive/root:")) {
                return true;
            }
            return driveItem.m.g.startsWith("/drives/") && driveItem.m.g.contains("/root:");
        }
        if (!driveItem.l.equals("root") && driveItem.E == null) {
            C3184b.e("no parent not root? : " + driveItem.l);
        }
        return true;
    }

    private List<AbstractC3595n> R0(ax.c3.T t) throws C1495j {
        ArrayList arrayList = new ArrayList();
        boolean E = d0.E(t);
        boolean z = true;
        try {
            IDriveItemCollectionPage iDriveItemCollectionPage = D0(t, true, true).b().a().f("thumbnails").get();
            if (iDriveItemCollectionPage == null) {
                z = false;
            }
            C3184b.c(z);
            do {
                for (DriveItem driveItem : iDriveItemCollectionPage.b()) {
                    arrayList.add(new ax.c3.T(this, driveItem, d0.Q(t.E(), driveItem.l)));
                    if (E) {
                        t0(driveItem);
                    }
                }
                iDriveItemCollectionPage = iDriveItemCollectionPage.a() != null ? ((ax.N9.N) iDriveItemCollectionPage.a()).a().get() : null;
            } while (iDriveItemCollectionPage != null);
            return arrayList;
        } catch (ax.M9.d e2) {
            throw u0("listchildren", e2);
        } catch (NullPointerException e3) {
            ax.Ha.c.h().f().d("!! OneDrive listChildren NullPointError").l(e3).g("path:" + t.E()).h();
            throw new C1495j(e3);
        } catch (OutOfMemoryError e4) {
            int size = arrayList.size();
            arrayList.clear();
            ax.Ha.c.h().f().b("!! OneDrive listChildren OOM").l(e4).g("children:" + size).h();
            throw new C1495j(e4);
        }
    }

    private void S0() {
        String a2;
        SharedPreferences sharedPreferences = p().getSharedPreferences("OneDrivePrefs", 0);
        ax.Q2.f fVar = ax.Q2.f.P0;
        c0 c0Var = new c0(fVar);
        int i2 = sharedPreferences.getInt("version_" + t(), 0);
        if (i2 == 0) {
            a2 = sharedPreferences.getString("refresh_token_" + t(), null);
        } else {
            a2 = c0Var.a(i2, ax.Y2.a.a().b(fVar), sharedPreferences.getString("refresh_token_" + t(), null));
        }
        p().getSharedPreferences("com.microsoft.live", 0).edit().putString("refresh_token", a2).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void T0(Context context, Activity activity, String str, ax.L9.c<InterfaceC0842e0> cVar) {
        synchronized (OneDriveFileHelper.class) {
            Context applicationContext = context.getApplicationContext();
            InterfaceC0842e0 v0 = v0(applicationContext);
            ((ax.K9.b) v0.c()).j(new h(cVar, v0, applicationContext, activity, str));
        }
    }

    private String U0(String str, String str2) throws C1495j {
        return z0().e(str).n(str2).a().get().m.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(InterfaceC0842e0 interfaceC0842e0, C1911a0 c1911a0) {
        interfaceC0842e0.d().a().c(new a(c1911a0));
    }

    private void W0(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.i) {
            try {
                String remove = this.j.remove(str);
                if (remove != null) {
                    this.i.remove(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X0(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.microsoft.live", 0).edit();
        edit.remove("refresh_token");
        edit.remove("cookies");
        edit.commit();
        try {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(context.getApplicationContext());
            CookieManager.getInstance().removeAllCookies(null);
            createInstance.sync();
        } catch (AndroidRuntimeException | UnsupportedOperationException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(InterfaceC0842e0 interfaceC0842e0) {
        String f2 = ((ax.K9.b) interfaceC0842e0.c()).f();
        int t = t();
        ax.Q2.f fVar = ax.Q2.f.P0;
        c0 c0Var = new c0(fVar);
        p().getSharedPreferences("OneDrivePrefs", 0).edit().putInt("version_" + t, 3).putString("refresh_token_" + t, c0Var.e(ax.Y2.a.a().b(fVar), f2)).commit();
    }

    private void Z0(ax.c3.T t, long j2) throws C1495j {
        int i2 = 0;
        while (true) {
            try {
                DriveItem driveItem = new DriveItem();
                FileSystemInfo fileSystemInfo = new FileSystemInfo();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j2);
                fileSystemInfo.e = calendar;
                driveItem.w = fileSystemInfo;
                D0(t, false, true).a().j(driveItem);
                return;
            } catch (ax.M9.d e2) {
                if (e2.getMessage() == null || !e2.getMessage().contains("409 :") || (i2 = i2 + 1) >= 3) {
                    throw u0("setLastModified", e2);
                }
                try {
                    Thread.sleep(i2 * 500);
                } catch (Exception unused) {
                }
            }
        }
        throw u0("setLastModified", e2);
    }

    private String a1(String str) throws C1495j, ax.M9.d {
        String M0 = M0(str);
        if (M0 != null) {
            return t0(L0().h(Uri.encode(M0)).a().get());
        }
        C3184b.f();
        return "/drive/root";
    }

    private void b1(ax.N9.U u, ax.c3.G g2, long j2, Long l2, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        AtomicReference atomicReference = new AtomicReference();
        MyDriveItemUploadableProperties myDriveItemUploadableProperties = new MyDriveItemUploadableProperties();
        if (z) {
            myDriveItemUploadableProperties.h = "replace";
        } else {
            myDriveItemUploadableProperties.h = "fail";
        }
        if (l2 != null) {
            FileSystemInfo fileSystemInfo = new FileSystemInfo();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l2.longValue());
            fileSystemInfo.e = calendar;
            myDriveItemUploadableProperties.d = fileSystemInfo;
        }
        try {
            try {
                new E(u.m(myDriveItemUploadableProperties).a().e(), z0(), g2, j2, DriveItem.class).a(new ArrayList(), interfaceC3185c, new f(iVar, atomicReference), o);
                if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                    throw new C1486a();
                }
                if (atomicReference.get() != null) {
                    throw u0("onedrive uploadFile 2", (ax.M9.d) atomicReference.get());
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                throw C1489d.b("onedrive chunked upload", e2);
            }
        } catch (ax.M9.d e3) {
            throw u0("uploadChunk", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        if (r8.get() == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        throw u0("onedrive uploadFile", (ax.M9.d) r8.get());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
    
        throw new ax.b3.C1495j("onedrive uploadFile");
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c1(ax.N9.Y r18, ax.c3.G r19, long r20, boolean r22, ax.u3.InterfaceC3185c r23, ax.g3.i r24) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.OneDriveFileHelper.c1(ax.N9.Y, ax.c3.G, long, boolean, ax.u3.c, ax.g3.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d1(java.lang.String r7, long r8, ax.g3.i r10) {
        /*
            r6 = this;
        L0:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            r0.<init>(r7)     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L41
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = ax.c3.F.i(r1, r2)     // Catch: java.lang.Throwable -> L41
            ax.r8.i r1 = ax.r8.C3005n.d(r1)     // Catch: java.lang.Throwable -> L41
            ax.r8.l r1 = r1.h()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "percentageComplete"
            ax.r8.o r1 = r1.w(r2)     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L31
            r0.disconnect()     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            goto L5f
        L29:
            r7 = move-exception
            goto L5c
        L2b:
            r7 = move-exception
            goto L5c
        L2d:
            r7 = move-exception
            goto L5c
        L2f:
            r7 = move-exception
            goto L5c
        L31:
            int r1 = r1.s()     // Catch: java.lang.Throwable -> L41
            if (r10 == 0) goto L43
            long r2 = (long) r1     // Catch: java.lang.Throwable -> L41
            long r2 = r2 * r8
            r4 = 100
            long r2 = r2 / r4
            r10.a(r2, r8)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r7 = move-exception
            goto L58
        L43:
            r2 = 100
            if (r1 < r2) goto L4b
            r0.disconnect()     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            goto L6b
        L4b:
            r2 = 50
            if (r1 >= r2) goto L54
            r1 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L54
        L54:
            r0.disconnect()     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            goto L0
        L58:
            r0.disconnect()     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
            throw r7     // Catch: java.lang.NullPointerException -> L29 java.lang.IllegalStateException -> L2b java.lang.NumberFormatException -> L2d java.io.IOException -> L2f
        L5c:
            r7.printStackTrace()
        L5f:
            r0 = 1250(0x4e2, double:6.176E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L65
            goto L66
        L65:
        L66:
            if (r10 == 0) goto L6b
            r10.a(r8, r8)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.OneDriveFileHelper.d1(java.lang.String, long, ax.g3.i):void");
    }

    private void e1(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j2, Long l2, boolean z, boolean z2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        File file;
        try {
            if (!k0(abstractC3595n.T(), false).n()) {
                throw new C1495j("parentPath doesn't exist");
            }
            ax.c3.T t = (ax.c3.T) abstractC3595n;
            ax.N9.U D0 = D0(t, false, true);
            if (j2 != -1) {
                if (j2 >= n) {
                    b1(D0, g2, j2, l2, z2, interfaceC3185c, iVar);
                    return;
                }
                c1(D0.k(), g2, j2, z2, interfaceC3185c, iVar);
                if (l2 != null) {
                    Z0(t, l2.longValue());
                    return;
                }
                return;
            }
            InputStream inputStream = null;
            try {
                InputStream b2 = g2.b();
                try {
                    file = new File(ax.Z2.a.l(p(), abstractC3595n), abstractC3595n.B() + System.currentTimeMillis() + ".tmp");
                    try {
                        ax.c3.F.f(b2, file, -1L, interfaceC3185c);
                        try {
                            C3596o f2 = C1835x.f(file);
                            AbstractC3595n z3 = f2.z(file.getAbsolutePath());
                            long p = z3.p();
                            ax.c3.G x = f2.x(z3);
                            if (p == 0) {
                                c1(D0.k(), x, p, z2, interfaceC3185c, iVar);
                                if (l2 != null) {
                                    Z0(t, l2.longValue());
                                }
                            } else {
                                b1(D0, x, p, l2, z2, interfaceC3185c, iVar);
                            }
                            ax.c3.F.a(null);
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Throwable th) {
                            th = th;
                            ax.c3.F.a(inputStream);
                            if (file != null && file.exists()) {
                                file.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = b2;
                        ax.c3.F.a(inputStream);
                        if (file != null) {
                            file.delete();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    file = null;
                }
            } catch (Throwable th4) {
                th = th4;
                file = null;
            }
        } catch (ax.M9.d e2) {
            throw u0("writeFileInternal", e2);
        } catch (IOException e3) {
            throw C1489d.b("onedrive upload", e3);
        } catch (Throwable th5) {
            throw th5;
        }
    }

    private ax.c3.T k0(String str, boolean z) throws C1495j {
        try {
            ax.O9.x a2 = E0(str, false).a();
            if (z) {
                a2 = a2.f("thumbnails");
            }
            return new ax.c3.T(this, a2.get(), str);
        } catch (ax.M9.d e2) {
            if (e2.a(ax.M9.e.ItemNotFound) || (e2.getMessage() != null && e2.getMessage().contains("404 :"))) {
                return new ax.c3.T(this, str);
            }
            if (e2.getMessage() != null && e2.getMessage().contains("400 :") && str.endsWith(".")) {
                throw new ax.b3.o("onedrive getfileinfo", e2);
            }
            e2.printStackTrace();
            throw u0("onedrive getfileinfo", e2);
        }
    }

    private void s0(String str, String str2) {
        synchronized (this.i) {
            this.j.put(str, str2);
            this.i.put(str2, str);
        }
    }

    private String t0(DriveItem driveItem) {
        String str;
        if (driveItem.D != null) {
            str = "/drives/" + driveItem.D.m.c + "/items/" + driveItem.D.h;
        } else {
            str = "/drive/root";
        }
        s0(driveItem.l, str);
        return str;
    }

    private C1495j u0(String str, ax.M9.d dVar) {
        return dVar.a(ax.M9.e.ItemNotFound) ? new ax.b3.t(dVar) : dVar.a(ax.M9.e.AccessDenied) ? new C1490e(str, dVar) : dVar.a(ax.M9.e.QuotaLimitReached) ? new ax.b3.s(str, dVar) : dVar.a(ax.M9.e.NameAlreadyExists) ? new C1491f(false, dVar) : (dVar.getMessage() == null || !dVar.getMessage().contains("404 :")) ? (dVar.getMessage() == null || !dVar.getMessage().contains("507 :")) ? (dVar.getMessage() == null || !dVar.getMessage().contains("409 :")) ? (dVar.getMessage() == null || !dVar.getMessage().contains("403 : Forbidden")) ? C1489d.b(str, dVar) : new C1490e(str, dVar) : new C1491f(false, dVar) : new ax.b3.s(str, dVar) : new ax.b3.t(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0842e0 v0(Context context) {
        return new A.a().d(ax.c3.S.f(context, new g(context, C1819g.c(context).a(ax.Q2.f.P0)))).b();
    }

    private String y0() {
        return p().getSharedPreferences("OneDrivePrefs", 0).getString("email_" + t(), null);
    }

    private InterfaceC0842e0 z0() throws C1493h {
        InterfaceC0842e0 interfaceC0842e0 = this.h.get();
        if (interfaceC0842e0 != null) {
            return interfaceC0842e0;
        }
        throw new C1493h("OneDrive client is null");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        String decode;
        if (str3 != null) {
            try {
                if (str3.startsWith("url=")) {
                    decode = Uri.decode(str3.substring(4));
                    return new URL(decode).openStream();
                }
            } catch (C1495j e2) {
                e = e2;
                e.printStackTrace();
                return null;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                return null;
            }
        }
        ax.c3.T t = (ax.c3.T) z(str2);
        if (t.g0() == null) {
            return null;
        }
        decode = t.g0();
        return new URL(decode).openStream();
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
        C3184b.c(abstractC3595n.isDirectory());
        ax.c3.T t = (ax.c3.T) abstractC3595n;
        C3184b.c(t.f0() != null);
        return R0(t);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j2, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        e1(abstractC3595n, g2, str, j2, l2, z, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1495j("Operation cancelled");
        }
        try {
            DriveItem driveItem = new DriveItem();
            if (abstractC3595n.T().equals(abstractC3595n2.T())) {
                driveItem.l = abstractC3595n2.B();
            } else {
                String T = abstractC3595n2.T();
                if (!k0(T, false).n()) {
                    throw new C1495j("Target parent does not exist");
                }
                driveItem.l = abstractC3595n2.B();
                driveItem.m = C0(T);
            }
            D0((ax.c3.T) abstractC3595n, true, false).a().j(driveItem);
            if (iVar != null) {
                long p = abstractC3595n.p();
                iVar.a(p, p);
            }
        } catch (ax.M9.d e2) {
            throw u0("move", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t("not existing source file");
        }
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1486a();
        }
        long p = abstractC3595n.p();
        try {
            DriveItem e2 = D0((ax.c3.T) abstractC3595n, true, true).j(abstractC3595n2.B(), C0(abstractC3595n2.T())).a().e();
            if (e2 != null && e2.l == null) {
                String str = e2.n;
                if (str != null) {
                    d1(str, p, iVar);
                    return;
                } else {
                    C3184b.f();
                    return;
                }
            }
            try {
                Thread.sleep(1250L);
            } catch (InterruptedException unused) {
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (ax.M9.d e3) {
            throw u0("copy", e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        ax.c3.T t = (ax.c3.T) abstractC3595n;
        if (t.g0() == null) {
            return null;
        }
        return C1809B.a0(abstractC3595n, "url=" + Uri.encode(t.g0()));
    }

    Drive H0() throws C1493h {
        Drive drive = this.k;
        if (drive != null) {
            return drive;
        }
        C3184b.f();
        throw new C1493h("MyDrive is null");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            D0((ax.c3.T) abstractC3595n, true, false).a().delete();
        } catch (ax.M9.d e2) {
            throw u0("deleteRecursively", e2);
        }
    }

    String I0() throws C1493h {
        return H0().c;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j2) throws C1495j {
        try {
            ax.N9.X a2 = D0((ax.c3.T) abstractC3595n, true, true).k().a();
            if (j2 != 0) {
                a2.k("Range", "bytes=" + j2 + "-");
            }
            return a2.get();
        } catch (ax.M9.d e2) {
            throw u0("getInputStream", e2);
        }
    }

    String J0(String str) throws ax.b3.J {
        try {
            String B0 = B0(str);
            if (B0 == null) {
                b0(z("/"));
                B0 = B0(str);
                if (B0 == null) {
                    ax.Ha.c.h().f().d("ONEDRIVE LOCAL PATH NULL").g("remoteDrivePath : " + B0).h();
                    throw new ax.b3.J();
                }
            }
            if ("/".equals(B0)) {
                return "/";
            }
            return "/" + B0;
        } catch (C1495j unused) {
            throw new ax.b3.J();
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        if (aVar != null) {
            aVar.B();
        }
        S0();
        T0(p(), activity, y0(), new b(fragment, aVar, new AtomicBoolean(false), new AtomicInteger(0)));
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            String T = abstractC3595n.T();
            if (!k0(T, false).n()) {
                return false;
            }
            String B = abstractC3595n.B();
            MyDriveItem myDriveItem = new MyDriveItem();
            myDriveItem.l = B;
            myDriveItem.x = new Folder();
            myDriveItem.U = "fail";
            E0(T, false).b().a().b(myDriveItem);
            return true;
        } catch (ax.M9.d | C1495j e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        try {
            E0(abstractC3595n.T(), false).b().e(Uri.encode(abstractC3595n.B())).k().c(Collections.singletonList(new ax.S9.d("@microsoft.graph.conflictBehavior", "fail"))).i(null);
            return true;
        } catch (ax.M9.d | C1495j e2) {
            e2.printStackTrace();
            return false;
        }
    }

    String N0(HashMap<String, String> hashMap, DriveItem driveItem) throws C1495j, ax.b3.J {
        ItemReference itemReference = driveItem.m;
        if ((itemReference == null || itemReference.e == null) && driveItem.l.equals("root")) {
            return "/";
        }
        if (driveItem.m == null) {
            C3184b.e("this case is not implemented yet");
            return "/" + driveItem.l;
        }
        if (Q0(driveItem)) {
            ItemReference itemReference2 = driveItem.m;
            String str = itemReference2.g;
            if (str == null) {
                if (hashMap != null) {
                    str = hashMap.get(itemReference2.e);
                    if (str == null) {
                        str = U0(driveItem.m.c, driveItem.c);
                        hashMap.put(driveItem.m.e, str);
                    }
                } else {
                    str = U0(itemReference2.c, driveItem.c);
                }
            }
            if (str == null) {
                C3184b.e("this case is not implemented yet");
                return "/" + driveItem.l;
            }
            return Uri.decode(str.substring(str.indexOf("/root:") + 6)) + "/" + driveItem.l;
        }
        String str2 = driveItem.m.g;
        if (str2 != null && str2.startsWith("/drives")) {
            int indexOf = driveItem.m.g.indexOf(":");
            return J0(driveItem.m.g.substring(0, indexOf)) + driveItem.m.g.substring(indexOf + 1) + "/" + driveItem.l;
        }
        ItemReference itemReference3 = driveItem.m;
        if (itemReference3.g != null || itemReference3.e != null || I0().equals(driveItem.m.c)) {
            C3184b.e("this case is not implemented yet");
            return "/" + driveItem.l;
        }
        return J0("/drives/" + driveItem.m.c + "/items/" + driveItem.c);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        I(abstractC3595n);
        if (P0(abstractC3595n.E())) {
            W0(M0(abstractC3595n.E()));
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        ax.Q2.f P = abstractC3595n.P();
        ax.Q2.f fVar = ax.Q2.f.P0;
        if (P == fVar && abstractC3595n2.P() == fVar) {
            try {
                return A0(abstractC3595n.E(), false).equals(A0(abstractC3595n2.E(), true));
            } catch (ax.M9.d | C1495j unused) {
            }
        }
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return (this.h.get() == null || this.k == null) ? false : true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        if (this.h.get() != null) {
            try {
                ((ax.K9.b) this.h.get().c()).l(new c());
                this.h.set(null);
                this.k = null;
            } catch (AndroidRuntimeException e2) {
                ax.Ha.c.h().f().b("ONEDRIVE DISCONNECT").l(e2).h();
            }
        }
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
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j2, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        e1(abstractC3595n, g2, str, j2, l2, z, true, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        if (!z2) {
            o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
            return;
        }
        try {
            IDriveItemSearchCollectionPage iDriveItemSearchCollectionPage = D0((ax.c3.T) abstractC3595n, true, true).f(str).a().get();
            ArrayList arrayList = new ArrayList();
            HashMap<String, String> hashMap = new HashMap<>();
            do {
                for (DriveItem driveItem : iDriveItemSearchCollectionPage.b()) {
                    try {
                        arrayList.add(new ax.c3.T(this, driveItem, N0(hashMap, driveItem)));
                    } catch (ax.b3.J unused) {
                    }
                }
                iDriveItemSearchCollectionPage = iDriveItemSearchCollectionPage.a() != null ? ((ax.N9.W) iDriveItemSearchCollectionPage.a()).a().get() : null;
            } while (iDriveItemSearchCollectionPage != null);
            hVar.Y(arrayList, true);
        } catch (ax.M9.d e2) {
            throw u0("search", e2);
        }
    }

    public String w0(String str) {
        C3184b.c(str.startsWith("/drives/"));
        String substring = str.substring(8);
        return substring.substring(0, substring.indexOf("/"));
    }

    public String x0(String str) {
        int indexOf = str.indexOf("/items/");
        if (indexOf >= 0) {
            return str.substring(indexOf + 7);
        }
        C3184b.g("invalid path:" + str);
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        Quota quota;
        Long l2;
        try {
            Drive drive = K0().a().get();
            if (drive != null && (quota = drive.u) != null && (l2 = quota.f) != null && quota.d != null) {
                return new k0(l2.longValue(), drive.u.f.longValue() - drive.u.d.longValue());
            }
            return null;
        } catch (ax.M9.d e2) {
            throw u0("getStorageSpace", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        return k0(str, true);
    }

    public static class i {
        InputStream a;
        long b;
        InterfaceC3185c c;
        ax.L9.e d;

        public i(InputStream inputStream, long j, InterfaceC3185c interfaceC3185c) {
            this.a = inputStream;
            this.b = j;
            this.c = interfaceC3185c;
        }

        public i(InputStream inputStream, long j, InterfaceC3185c interfaceC3185c, ax.L9.e eVar) {
            this.a = inputStream;
            this.b = j;
            this.c = interfaceC3185c;
            this.d = eVar;
        }
    }

    class a implements ax.L9.c<User> {
        final /* synthetic */ C1911a0 a;

        a(C1911a0 c1911a0) {
            this.a = c1911a0;
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(User user) {
            C1911a0 c1911a0;
            if (user == null) {
                ax.Ha.c.h().f().d("OneDrive Null User").h();
                return;
            }
            boolean z = false;
            SharedPreferences sharedPreferences = OneDriveFileHelper.this.p().getSharedPreferences("OneDrivePrefs", 0);
            String string = sharedPreferences.getString("display_name_" + OneDriveFileHelper.this.t(), null);
            String string2 = sharedPreferences.getString("email_" + OneDriveFileHelper.this.t(), null);
            String str = user.q;
            boolean z2 = true;
            if (str != null && !str.equals(string)) {
                sharedPreferences.edit().putString("display_name_" + OneDriveFileHelper.this.t(), user.q).commit();
                z = true;
            }
            String str2 = user.M;
            if (str2 == null || str2.equals(string2)) {
                z2 = z;
            } else {
                sharedPreferences.edit().putString("email_" + OneDriveFileHelper.this.t(), user.M).commit();
            }
            if (!z2 || (c1911a0 = this.a) == null) {
                return;
            }
            c1911a0.ta();
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
        }
    }

    class c implements ax.L9.c<Void> {
        c() {
        }

        @Override // ax.L9.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(Void r1) {
        }

        @Override // ax.L9.c
        public void b(ax.M9.d dVar) {
        }
    }
}

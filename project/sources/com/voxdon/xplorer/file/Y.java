package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Sa.g;
import ax.Va.c;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1491f;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1819g;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.k0;
import ax.d3.D0;
import ax.j3.C2311c;
import ax.j3.DialogC2310b;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Y extends AbstractC3594m {
    private static final Logger l = Logger.getLogger("FileManager.YandexFileHelper");
    private static e m;
    private volatile ax.Sa.i h;
    private volatile boolean i;
    private AbstractC3199q<Object, Void, Boolean> j;
    private AbstractC3595n k;

    class a implements ax.Sa.k {
        final /* synthetic */ ax.c3.G a;
        final /* synthetic */ long b;

        a(ax.c3.G g, long j) {
            this.a = g;
            this.b = j;
        }

        @Override // ax.Sa.k
        public InputStream a(long j) throws IOException {
            try {
                return this.a.c(j);
            } catch (C1495j e) {
                throw new IOException(e);
            }
        }

        @Override // ax.Sa.k
        public long length() {
            return this.b;
        }
    }

    class b implements ax.Sa.d {
        final /* synthetic */ ax.g3.i a;
        final /* synthetic */ InterfaceC3185c b;

        b(ax.g3.i iVar, InterfaceC3185c interfaceC3185c) {
            this.a = iVar;
            this.b = interfaceC3185c;
        }

        @Override // ax.Sa.d
        public boolean a() {
            InterfaceC3185c interfaceC3185c = this.b;
            return interfaceC3185c != null && interfaceC3185c.isCancelled();
        }

        @Override // ax.Sa.d
        public void b(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                iVar.a(j, j2);
            }
        }
    }

    class c implements ValueCallback<Boolean> {
        final /* synthetic */ Activity a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ Fragment d;
        final /* synthetic */ InterfaceC3584c.a e;

        class a implements DialogC2310b.d {
            a() {
            }

            @Override // ax.j3.DialogC2310b.d
            public void a() {
                c.this.e.T(false, null);
            }

            @Override // ax.j3.DialogC2310b.d
            public void b(Bundle bundle) {
                CookieSyncManager.getInstance().sync();
                String string = bundle.getString("access_token");
                if (!Y.u0(string, bundle.getString("expires_in"))) {
                    Y.l.severe("OAUTH : FAILED TO RECEIVE ACCESS TOKEN 2");
                    c.this.e.T(false, null);
                    return;
                }
                Y.t0(Y.this.p()).n(c.this.c, string, HttpUrl.FRAGMENT_ENCODE_SET);
                Y y = Y.this;
                Context p = Y.this.p();
                c cVar = c.this;
                Activity activity = cVar.a;
                Fragment fragment = cVar.d;
                Y y2 = Y.this;
                y.j = new d(p, activity, fragment, y2, y2.t(), c.this.e);
                Y.this.j.i(new Object[0]);
            }

            @Override // ax.j3.DialogC2310b.d
            public void c(C2311c c2311c) {
                Y.l.severe("OAUTH ERROR 2:" + c2311c.getMessage());
                c.this.e.T(false, null);
            }
        }

        c(Activity activity, String str, int i, Fragment fragment, InterfaceC3584c.a aVar) {
            this.a = activity;
            this.b = str;
            this.c = i;
            this.d = fragment;
            this.e = aVar;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            Y.x0(this.a, this.b, new a());
        }
    }

    private static class d extends AbstractC3199q<Object, Void, Boolean> {
        Context h;
        InterfaceC3584c.a i;
        String j;
        String k;
        Y l;
        boolean m;
        int n;
        D0 o;
        boolean p;
        Activity q;

        public d(Context context, Activity activity, Fragment fragment, Y y, int i, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = context;
            this.q = activity;
            this.l = y;
            this.i = aVar;
            this.n = i;
            this.o = (D0) fragment;
            SharedPreferences sharedPreferences = context.getSharedPreferences("YandexDiskPrefs", 0);
            ax.Q2.f fVar = ax.Q2.f.Q0;
            c0 c0Var = new c0(fVar);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            if (i2 == 0) {
                this.k = sharedPreferences.getString("access_token_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.k = c0Var.a(i2, ax.Y2.a.a().b(fVar), sharedPreferences.getString("access_token_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            }
            this.j = sharedPreferences.getString("account_name_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            InterfaceC3584c.a aVar = this.i;
            if (aVar != null) {
                aVar.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Object... objArr) {
            try {
                ax.Sa.i iVar = new ax.Sa.i(new ax.Sa.a(this.j, this.k));
                ax.Va.b c = iVar.c();
                if (TextUtils.isEmpty(this.j) && c.c() != null) {
                    String a = c.c().a();
                    this.j = a;
                    if (TextUtils.isEmpty(a)) {
                        this.j = c.c().b();
                    }
                    if (!TextUtils.isEmpty(this.j)) {
                        this.h.getSharedPreferences("YandexDiskPrefs", 0).edit().putString("account_name_" + this.n, this.j).apply();
                        this.m = true;
                    }
                }
                Y y = this.l;
                if (y != null) {
                    y.w0(iVar);
                }
                return Boolean.TRUE;
            } catch (ax.Ua.g e) {
                this.p = e.a() == 401;
                return Boolean.FALSE;
            } catch (Exception e2) {
                e2.printStackTrace();
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            Activity activity;
            D0 d0;
            if (this.m && (d0 = this.o) != null) {
                d0.ua();
            }
            if (!this.p) {
                InterfaceC3584c.a aVar = this.i;
                if (aVar != null) {
                    aVar.T(bool.booleanValue(), null);
                    return;
                }
                return;
            }
            Y y = this.l;
            if (y != null && (activity = this.q) != null) {
                y.z0(activity, this.o, this.j, this.n, this.i);
                return;
            }
            InterfaceC3584c.a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.T(false, null);
            }
        }
    }

    public static class e extends T {
        Context a;

        class a implements ValueCallback<Boolean> {
            final /* synthetic */ Activity a;
            final /* synthetic */ ax.g3.k b;

            /* renamed from: com.voxdon.xplorer.file.Y$e$a$a, reason: collision with other inner class name */
            class C0520a implements DialogC2310b.d {
                C0520a() {
                }

                @Override // ax.j3.DialogC2310b.d
                public void a() {
                }

                @Override // ax.j3.DialogC2310b.d
                public void b(Bundle bundle) {
                    CookieSyncManager.getInstance().sync();
                    String string = bundle.getString("access_token");
                    if (!Y.u0(string, bundle.getString("expires_in"))) {
                        Y.l.severe("OAUTH : FAILED TO RECEIVE ACCESS TOKEN");
                        ax.g3.k kVar = a.this.b;
                        if (kVar != null) {
                            kVar.a(ax.Q2.f.Q0, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, null);
                            return;
                        }
                        return;
                    }
                    int l = e.this.l();
                    e.this.n(l, string, HttpUrl.FRAGMENT_ENCODE_SET);
                    ax.g3.k kVar2 = a.this.b;
                    if (kVar2 != null) {
                        kVar2.c(ax.Q2.f.Q0, l);
                    }
                }

                @Override // ax.j3.DialogC2310b.d
                public void c(C2311c c2311c) {
                    Y.l.severe("OAUTH ERROR :" + c2311c.getMessage());
                    ax.g3.k kVar = a.this.b;
                    if (kVar != null) {
                        kVar.a(ax.Q2.f.Q0, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, null);
                    }
                }
            }

            a(Activity activity, ax.g3.k kVar) {
                this.a = activity;
                this.b = kVar;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(Boolean bool) {
                Y.x0(this.a, null, new C0520a());
            }
        }

        public e(Context context) {
            this.a = context;
        }

        private void o(Activity activity, ax.g3.k kVar) {
            CookieSyncManager.createInstance(activity);
            C3180B.X(new a(activity, kVar));
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("YandexDiskPrefs", 0).edit().remove("version_" + i).remove("access_token_" + i).remove("account_name_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("YandexDiskPrefs", 0);
            String string = sharedPreferences.getString("account_name_" + i, null);
            ax.Q2.f fVar = ax.Q2.f.Q0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), string, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("YandexDiskPrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("YandexDiskPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(com.voxdon.xplorer.activity.a aVar, ax.g3.k kVar) {
            kVar.b(ax.Q2.f.Q0);
            o(aVar, kVar);
        }

        int l() {
            return this.a.getSharedPreferences("YandexDiskPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> m() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("YandexDiskPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("access_token_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void n(int i, String str, String str2) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("YandexDiskPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            ax.Q2.f fVar = ax.Q2.f.Q0;
            c0 c0Var = new c0(fVar);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("access_token_" + i, c0Var.e(ax.Y2.a.a().b(fVar), str)).putString("account_name_" + i, str2).putString("location_name_" + i, fVar.M(this.a));
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

    private void A0(ax.Va.c cVar, InterfaceC3185c interfaceC3185c) throws Exception, C1486a {
        ax.Va.d g;
        if (cVar == null || cVar == ax.Va.c.e || cVar.b() == c.b.done || TextUtils.isEmpty(cVar.a())) {
            return;
        }
        while (true) {
            y0(interfaceC3185c);
            g = s0().g(cVar);
            if (!g.b()) {
                break;
            }
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IOException(e2);
            }
        }
        if (g.c()) {
            return;
        }
        throw new C1495j("Yandex operation failed: " + g.a());
    }

    private void B0(AbstractC3595n abstractC3595n, ax.c3.G g, long j, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        y0(interfaceC3185c);
        try {
            s0().m(s0().i(abstractC3595n.E(), z), new a(g, j), new b(iVar, interfaceC3185c));
        } catch (Exception e2) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a(e2);
            }
            if (!(e2 instanceof IOException) || !(e2.getCause() instanceof C1495j)) {
                throw p0("yandex writeFile", e2);
            }
            throw ((C1495j) e2.getCause());
        }
    }

    private static void o0(AbstractC3595n abstractC3595n, InterfaceC3185c interfaceC3185c) throws ax.b3.t, C1486a {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        y0(interfaceC3185c);
    }

    private C1495j p0(String str, Exception exc) {
        if (exc instanceof C1495j) {
            return (C1495j) exc;
        }
        if (!(exc instanceof ax.Ua.g)) {
            return C1489d.b(str, exc);
        }
        ax.Ua.g gVar = (ax.Ua.g) exc;
        int a2 = gVar.a();
        if (a2 != 401) {
            if (a2 == 409) {
                return new C1491f(false, exc);
            }
            if (a2 == 413) {
                return new ax.b3.D(exc);
            }
            if (a2 != 429 && a2 != 500) {
                if (a2 == 507) {
                    return new ax.b3.s(exc);
                }
                if (a2 != 403) {
                    if (a2 == 404) {
                        return new ax.b3.t(exc);
                    }
                    switch (a2) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return new C1495j(exc);
                    }
                }
            }
            return new ax.b3.y(String.valueOf(gVar.a()), exc);
        }
        return new C1490e(exc);
    }

    private void q0(AbstractC3595n abstractC3595n) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        try {
            A0(s0().b(abstractC3595n.E(), false), null);
        } catch (C1486a e2) {
            throw new C1495j(e2);
        } catch (Exception e3) {
            throw p0("yandex deleteFile", e3);
        }
    }

    private static String r0(Context context) {
        String a2 = C1819g.c(context).a(ax.Q2.f.Q0);
        if ("ru".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return "https://oauth.yandex.ru/authorize?response_type=token&client_id=" + a2;
        }
        return "https://oauth.yandex.com/authorize?response_type=token&client_id=" + a2;
    }

    private ax.Sa.i s0() throws C1493h {
        ax.Sa.i iVar = this.h;
        if (!this.i || iVar == null) {
            throw new C1493h("Not connected : yandex");
        }
        return iVar;
    }

    public static e t0(Context context) {
        if (m == null) {
            m = new e(context.getApplicationContext());
        }
        return m;
    }

    static boolean u0(String str, String str2) {
        long currentTimeMillis = (str2 == null || str2.equals("0")) ? 0L : System.currentTimeMillis() + (Integer.parseInt(str2) * 1000);
        if (str != null) {
            return currentTimeMillis == 0 || System.currentTimeMillis() < currentTimeMillis;
        }
        return false;
    }

    private static void v0(ax.g3.i iVar, long j) {
        if (iVar != null) {
            iVar.a(j, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(ax.Sa.i iVar) {
        this.h = iVar;
        this.i = iVar != null;
        this.k = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static void x0(Activity activity, String str, DialogC2310b.d dVar) {
        String r0 = r0(activity);
        if (!TextUtils.isEmpty(str)) {
            r0 = r0 + "&login_hint=" + str;
        }
        try {
            DialogC2310b.D(activity, r0, null, null, null, "https://yxb31d3cb91f694e99bc65b2ed68322b14.oauth.yandex.ru/auth/finish?platform=android", dVar).show();
        } catch (AndroidRuntimeException unused) {
            Toast.makeText(activity, R.string.error, 1).show();
        } catch (NullPointerException e2) {
            ax.Ha.c.h().d("WEBVIEW CREATE").l(e2).h();
            Toast.makeText(activity, R.string.error, 1).show();
        }
    }

    private static void y0(InterfaceC3185c interfaceC3185c) throws C1486a {
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1486a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0003, B:19:0x000c, B:10:0x0043, B:3:0x0016, B:7:0x003c), top: B:15:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream A(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            r3 = 0
            if (r5 == 0) goto L16
            java.lang.String r0 = "url="
            boolean r0 = r5.startsWith(r0)     // Catch: java.lang.Exception -> L4d
            if (r0 != 0) goto Lc
            goto L16
        Lc:
            r4 = 4
            java.lang.String r4 = r5.substring(r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch: java.lang.Exception -> L4d
            goto L40
        L16:
            ax.Sa.i r5 = r2.s0()     // Catch: java.lang.Exception -> L4d
            ax.Sa.g$b r0 = new ax.Sa.g$b     // Catch: java.lang.Exception -> L4d
            r0.<init>()     // Catch: java.lang.Exception -> L4d
            ax.Sa.g$b r4 = r0.d(r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = "S"
            ax.Sa.g$b r4 = r4.e(r0)     // Catch: java.lang.Exception -> L4d
            ax.Sa.g r4 = r4.a()     // Catch: java.lang.Exception -> L4d
            ax.Va.e r4 = r5.h(r4)     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = r4.h()     // Catch: java.lang.Exception -> L4d
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L4d
            if (r5 == 0) goto L3c
            return r3
        L3c:
            java.lang.String r4 = r4.h()     // Catch: java.lang.Exception -> L4d
        L40:
            if (r4 != 0) goto L43
            return r3
        L43:
            ax.Sa.i r5 = r2.s0()     // Catch: java.lang.Exception -> L4d
            r0 = 0
            java.io.InputStream r3 = r5.f(r4, r0)     // Catch: java.lang.Exception -> L4d
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Y.A(java.lang.String, java.lang.String, java.lang.String):java.io.InputStream");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        ax.Va.f i;
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            try {
                i = s0().h(new g.b().d(abstractC3595n.E()).b(1000).c(Integer.valueOf(i2)).e("S").a()).i();
                List<ax.Va.e> a2 = i == null ? null : i.a();
                if (a2 == null || a2.isEmpty()) {
                    break;
                }
                for (ax.Va.e eVar : a2) {
                    if (eVar != null && eVar.g() != null) {
                        arrayList.add(new Z(this, eVar, null));
                    }
                }
                i2 += a2.size();
            } catch (Exception e2) {
                throw p0("yandex listChildren", e2);
            }
        } while (i.b() > i2);
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        B0(abstractC3595n, g, j, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        o0(abstractC3595n, interfaceC3185c);
        C3184b.a(abstractC3595n2.n());
        try {
            ax.Va.c l2 = s0().l(abstractC3595n.E(), abstractC3595n2.E(), false);
            if (l2 == null || l2.a() == null) {
                throw new C1495j("response body null error");
            }
            A0(l2, interfaceC3185c);
            v0(iVar, abstractC3595n.p());
        } catch (C1486a e2) {
            throw e2;
        } catch (Exception e3) {
            throw p0("yandex moveFile", e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        o0(abstractC3595n, interfaceC3185c);
        try {
            ax.Va.c a2 = s0().a(abstractC3595n.E(), abstractC3595n2.E(), false);
            if (a2 == null || a2.a() == null) {
                throw new C1495j("response body null error");
            }
            A0(a2, interfaceC3185c);
            v0(iVar, abstractC3595n.p());
        } catch (C1486a e2) {
            throw e2;
        } catch (Exception e3) {
            throw p0("yandex copyFile", e3);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        String f0;
        if (abstractC3595n instanceof Z) {
            Z z = (Z) abstractC3595n;
            if (!z.g0() || (f0 = z.f0()) == null) {
                return null;
            }
            return C1809B.a0(abstractC3595n, "url=" + Uri.encode(f0));
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        q0(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        try {
            return s0().e(abstractC3595n.E(), j);
        } catch (Exception e2) {
            throw p0("yandex getInputStream", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.app.Activity r10, androidx.fragment.app.Fragment r11, com.voxdon.xplorer.file.InterfaceC3584c.a r12) {
        /*
            r9 = this;
            r1 = 0
            ax.u3.q<java.lang.Object, java.lang.Void, java.lang.Boolean> r0 = r9.j     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L16
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L16
            ax.u3.q<java.lang.Object, java.lang.Void, java.lang.Boolean> r0 = r9.j     // Catch: java.lang.Exception -> L11
            r0.e()     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r0 = move-exception
            r10 = r0
            r6 = r9
            r8 = r12
            goto L36
        L16:
            com.voxdon.xplorer.file.Y$d r2 = new com.voxdon.xplorer.file.Y$d     // Catch: java.lang.Exception -> L32
            android.content.Context r3 = r9.p()     // Catch: java.lang.Exception -> L32
            int r7 = r9.t()     // Catch: java.lang.Exception -> L32
            r6 = r9
            r4 = r10
            r5 = r11
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2f
            r6.j = r2     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2f
            r2.i(r10)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r0 = move-exception
        L30:
            r10 = r0
            goto L36
        L32:
            r0 = move-exception
            r6 = r9
            r8 = r12
            goto L30
        L36:
            if (r8 == 0) goto L42
            r8.B()
            java.lang.String r10 = r10.getMessage()
            r8.T(r1, r10)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Y.K(android.app.Activity, androidx.fragment.app.Fragment, com.voxdon.xplorer.file.c$a):void");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.n()) {
            return false;
        }
        try {
            ax.Va.c k = s0().k(abstractC3595n.E());
            if (k != null) {
                if (k.a() != null) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
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
        q0(abstractC3595n);
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
        return this.i && this.h != null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        this.i = false;
        this.k = null;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l2, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        B0(abstractC3595n, g, j, true, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        try {
            ax.Va.b c2 = s0().c();
            return new k0(c2.a(), c2.b());
        } catch (Exception e2) {
            throw p0("yandex getStorageSpace", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        AbstractC3595n abstractC3595n;
        String U = d0.U(str);
        boolean equals = d0.a.equals(U);
        if (equals && (abstractC3595n = this.k) != null) {
            return abstractC3595n;
        }
        try {
            Z z = new Z(this, s0().h(new g.b().d(U).e("S").a()), U);
            if (!equals) {
                return z;
            }
            this.k = z;
            return z;
        } catch (ax.Ua.g e2) {
            if (e2.a() == 404) {
                return new Z(this, null, U);
            }
            throw p0("yandex getFileInfo", e2);
        } catch (Exception e3) {
            throw p0("yandex getFileInfo", e3);
        }
    }

    void z0(Activity activity, Fragment fragment, String str, int i, InterfaceC3584c.a aVar) {
        C3180B.X(new c(activity, str, i, fragment, aVar));
    }
}

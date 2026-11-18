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
import ax.a3.U;
import ax.b3.C1489d;
import ax.b3.C1495j;
import ax.c3.c0;
import ax.c3.k0;
import ax.j3.C2311c;
import ax.j3.DialogC2309a;
import ax.j3.DialogC2310b;
import ax.r8.C3003l;
import ax.r8.C3005n;
import ax.r8.C3006o;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.voxdon.xplorer.R;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class D extends W {
    private static final Logger x = Logger.getLogger("FileManager.NextCloudFileHelper");
    static c y;
    private String w;

    class a implements ValueCallback<Boolean> {
        final /* synthetic */ Activity a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;
        final /* synthetic */ Fragment d;
        final /* synthetic */ InterfaceC3584c.a e;

        /* renamed from: com.voxdon.xplorer.file.D$a$a, reason: collision with other inner class name */
        class C0513a implements DialogC2310b.d {
            C0513a() {
            }

            @Override // ax.j3.DialogC2310b.d
            public void a() {
                a.this.e.T(false, null);
            }

            @Override // ax.j3.DialogC2310b.d
            public void b(Bundle bundle) {
                CookieSyncManager.getInstance().sync();
                String string = bundle.getString("user");
                String string2 = bundle.getString("password");
                boolean z = bundle.getBoolean("invalid_cert");
                String str = (string == null || !string.contains("@")) ? string : HttpUrl.FRAGMENT_ENCODE_SET;
                c a1 = D.a1(D.this.p());
                a aVar = a.this;
                a1.m(aVar.c, aVar.b, string2, string, str, z);
                Fragment fragment = a.this.d;
                if (fragment instanceof ax.d3.W) {
                    ((ax.d3.W) fragment).ua();
                }
                a aVar2 = a.this;
                if (aVar2.e != null) {
                    D d = D.this;
                    Context p = D.this.p();
                    a aVar3 = a.this;
                    Activity activity = aVar3.a;
                    Fragment fragment2 = aVar3.d;
                    D d2 = D.this;
                    d.o = new b(p, activity, fragment2, d2, d2.t(), a.this.e);
                    D.this.o.i(new Object[0]);
                }
            }

            @Override // ax.j3.DialogC2310b.d
            public void c(C2311c c2311c) {
                D.x.severe("OAUTH ERROR 2:" + c2311c.getMessage());
                a.this.e.T(false, c2311c);
            }
        }

        a(Activity activity, String str, int i, Fragment fragment, InterfaceC3584c.a aVar) {
            this.a = activity;
            this.b = str;
            this.c = i;
            this.d = fragment;
            this.e = aVar;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            D.j1(this.a, this.b, new C0513a());
        }
    }

    private static class b extends AbstractC3199q<Object, Void, Boolean> {
        Context h;
        InterfaceC3584c.a i;
        String j;
        String k;
        String l;
        D m;
        int n;
        ax.d3.W o;
        Activity p;
        String q;
        boolean r;
        boolean s;
        Exception t;

        public b(Context context, Activity activity, Fragment fragment, D d, int i, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = context;
            this.p = activity;
            this.m = d;
            this.i = aVar;
            this.n = i;
            this.o = (ax.d3.W) fragment;
            SharedPreferences sharedPreferences = context.getSharedPreferences("NextCloudPrefs", 0);
            ax.Q2.f fVar = ax.Q2.f.T0;
            c0 c0Var = new c0(fVar);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            this.j = sharedPreferences.getString("login_name_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            if (i2 == 0) {
                this.q = sharedPreferences.getString("access_token_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                this.q = c0Var.a(i2, ax.Y2.a.a().b(fVar), sharedPreferences.getString("access_token_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            }
            this.r = sharedPreferences.getBoolean("ignorecert_" + i, false);
            this.l = sharedPreferences.getString("server_address_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            this.k = sharedPreferences.getString("user_name_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
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
            W.J0(this.h);
            ax.Ka.a b = ax.Ia.b.b(ServerType.TYPE_NEXTCLOUD, this.j, this.q, this.r, 15000L);
            try {
                String c1 = D.c1(b, this.l);
                if (TextUtils.isEmpty(this.k)) {
                    try {
                        String k = new C3005n().a(c1).h().t("ocs").h().t("data").h().t("id").i().k();
                        if (k != null) {
                            this.k = k;
                            this.h.getSharedPreferences("NextCloudPrefs", 0).edit().putString("user_name_" + this.n, this.k).apply();
                        } else {
                            ax.Ha.c.h().f().b("INVALID NEXT JSON FORMAT").h();
                            this.k = this.j;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.k = this.j;
                    }
                }
                String h1 = D.h1(this.l, this.k);
                if (this.m != null) {
                    this.m.R0(h1, Uri.parse(h1).getPath());
                    this.m.P0(b);
                    this.m.i1(this.l);
                    this.m.Q0(ServerType.TYPE_NEXTCLOUD);
                }
                return Boolean.TRUE;
            } catch (ax.Ja.a e2) {
                this.t = e2;
                if (e2.b() == 401) {
                    this.s = true;
                }
                e2.printStackTrace();
                return Boolean.FALSE;
            } catch (IOException e3) {
                this.t = e3;
                e3.printStackTrace();
                return Boolean.FALSE;
            } catch (NullPointerException e4) {
                this.t = e4;
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            Activity activity;
            if (!this.s) {
                InterfaceC3584c.a aVar = this.i;
                if (aVar != null) {
                    aVar.T(bool.booleanValue(), this.t);
                    return;
                }
                return;
            }
            D d = this.m;
            if (d == null || (activity = this.p) == null) {
                this.i.T(false, this.t);
            } else {
                d.k1(activity, this.o, this.l, this.n, this.i);
            }
        }
    }

    public static class c extends T {
        Context a;

        class a implements ValueCallback<Boolean> {
            final /* synthetic */ com.voxdon.xplorer.activity.a a;
            final /* synthetic */ String b;
            final /* synthetic */ ax.g3.k c;

            /* renamed from: com.voxdon.xplorer.file.D$c$a$a, reason: collision with other inner class name */
            class C0514a implements DialogC2310b.d {
                C0514a() {
                }

                @Override // ax.j3.DialogC2310b.d
                public void a() {
                }

                @Override // ax.j3.DialogC2310b.d
                public void b(Bundle bundle) {
                    CookieSyncManager.getInstance().sync();
                    String string = bundle.getString("user");
                    String string2 = bundle.getString("password");
                    boolean z = bundle.getBoolean("invalid_cert");
                    String str = (string == null || !string.contains("@")) ? string : HttpUrl.FRAGMENT_ENCODE_SET;
                    int l = c.this.l();
                    a aVar = a.this;
                    c.this.m(l, aVar.b, string2, string, str, z);
                    ax.g3.k kVar = a.this.c;
                    if (kVar != null) {
                        kVar.c(ax.Q2.f.T0, l);
                    }
                }

                @Override // ax.j3.DialogC2310b.d
                public void c(C2311c c2311c) {
                    D.x.severe("NextCloud login error :" + c2311c.getMessage());
                    ax.g3.k kVar = a.this.c;
                    if (kVar != null) {
                        kVar.a(ax.Q2.f.T0, HttpUrl.FRAGMENT_ENCODE_SET, 0, HttpUrl.FRAGMENT_ENCODE_SET, c2311c.getMessage());
                    }
                }
            }

            a(com.voxdon.xplorer.activity.a aVar, String str, ax.g3.k kVar) {
                this.a = aVar;
                this.b = str;
                this.c = kVar;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(Boolean bool) {
                D.j1(this.a, this.b, new C0514a());
            }
        }

        public c(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("NextCloudPrefs", 0).edit().remove("version_" + i).remove("server_address_" + i).remove("login_name_" + i).remove("user_name_" + i).remove("access_token_" + i).remove("ignorecert_" + i).remove("location_name_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("NextCloudPrefs", 0);
            String string = sharedPreferences.getString("login_name_" + i, null);
            ax.Q2.f fVar = ax.Q2.f.T0;
            return new ax.Z2.s(fVar, i, sharedPreferences.getString("location_name_" + i, fVar.M(this.a)), string, null, null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void g(int i, String str) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("NextCloudPrefs", 0).edit();
            edit.putString("location_name_" + i, str);
            edit.commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("NextCloudPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        public void k(com.voxdon.xplorer.activity.a aVar, String str, ax.g3.k kVar) {
            kVar.b(ax.Q2.f.T0);
            CookieSyncManager.createInstance(aVar);
            C3180B.X(new a(aVar, str, kVar));
        }

        int l() {
            return this.a.getSharedPreferences("NextCloudPrefs", 0).getInt("count", 0);
        }

        void m(int i, String str, String str2, String str3, String str4, boolean z) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("NextCloudPrefs", 0);
            boolean z2 = i >= sharedPreferences.getInt("count", 0);
            ax.Q2.f fVar = ax.Q2.f.T0;
            c0 c0Var = new c0(fVar);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("access_token_" + i, c0Var.e(ax.Y2.a.a().b(fVar), str2)).putBoolean("ignorecert_" + i, z).putString("server_address_" + i, str).putString("login_name_" + i, str3).putString("user_name_" + i, str4).putString("location_name_" + i, fVar.M(this.a));
            if (z2) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (z2) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
        }

        public void n(com.voxdon.xplorer.activity.a aVar) {
            C3180B.d0(aVar.getSupportFragmentManager(), ax.a3.U.l3(ax.Q2.f.T0), "serveraddress", true);
        }
    }

    public static U.d X0(Context context, String str, boolean z) {
        W.J0(context);
        try {
            C3003l h = C3005n.d(d1(ax.Ia.b.a(z, 15000L), str)).h();
            C3006o w = h.w("installed");
            C3006o w2 = h.w("version");
            C3006o w3 = h.w("versionstring");
            if (w != null) {
                if ((w2 != null) & (w3 != null)) {
                    return U.d.SUCCESS;
                }
            }
            return U.d.ERROR;
        } catch (Exception e) {
            return C1489d.b("test", e) instanceof ax.b3.q ? U.d.NETWORK_ERROR : e instanceof ax.Ja.a ? ((ax.Ja.a) e).b() == 403 ? U.d.ERROR_ACCESS_DENIED : U.d.ERROR : U.d.ERROR;
        }
    }

    public static String Y0(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("/remote.php")) >= 0) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    private static String Z0(String str) {
        return str + "/index.php/login/flow";
    }

    public static c a1(Context context) {
        if (y == null) {
            y = new c(context.getApplicationContext());
        }
        return y;
    }

    public static k0 b1(ax.Ia.a aVar, String str) throws C1495j {
        try {
            C3003l h = new C3005n().a(c1(aVar, str)).h().t("ocs").h().t("data").h().t("quota").h();
            return new k0(h.t("total").i().t(), h.t("used").i().t());
        } catch (Exception e) {
            e.printStackTrace();
            throw new C1495j(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c1(ax.Ia.a aVar, String str) throws ax.Ja.a, IOException {
        HashMap hashMap = new HashMap();
        hashMap.put("OCS-APIRequest", "true");
        return new String(ax.c3.F.h(aVar.u(g1(str), hashMap), 2048));
    }

    private static String d1(ax.Ia.a aVar, String str) throws ax.Ja.a, IOException {
        HashMap hashMap = new HashMap();
        hashMap.put("OCS-APIRequest", "true");
        return new String(ax.c3.F.h(aVar.u(e1(str), hashMap), 2048));
    }

    private static String e1(String str) {
        return str + "/status.php";
    }

    public static String f1(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        return str + "/apps/files/api/v1/thumbnail/" + i + "/" + i + Uri.encode(str2, "/");
    }

    private static String g1(String str) {
        return str + "/ocs/v1.php/cloud/user?format=json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h1(String str, String str2) {
        return str + "/remote.php/dav/files/" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(String str) {
        this.w = str;
    }

    static void j1(Activity activity, String str, DialogC2310b.d dVar) {
        String Z0 = Z0(str);
        try {
            W.J0(activity);
            DialogC2309a.F(activity, Z0, "nc://login/server", dVar).show();
        } catch (AndroidRuntimeException unused) {
            Toast.makeText(activity, R.string.error, 1).show();
        } catch (NullPointerException e) {
            ax.Ha.c.h().d("WEBVIEW CREATE").l(e).h();
            Toast.makeText(activity, R.string.error, 1).show();
        }
    }

    @Override // com.voxdon.xplorer.file.W
    protected String A0() {
        return this.w;
    }

    void k1(Activity activity, Fragment fragment, String str, int i, InterfaceC3584c.a aVar) {
        CookieSyncManager.createInstance(activity);
        C3180B.X(new a(activity, str, i, fragment, aVar));
    }

    @Override // com.voxdon.xplorer.file.W
    protected AbstractC3199q r0(Activity activity, Fragment fragment, W w, int i, InterfaceC3584c.a aVar) {
        return new b(p(), activity, fragment, this, t(), aVar);
    }
}

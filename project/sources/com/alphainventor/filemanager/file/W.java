package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1835x;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.e0;
import ax.c3.g0;
import ax.c3.k0;
import ax.i3.C2265a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class W extends AbstractC3594m {
    private static final Logger u = Logger.getLogger("FileManager.WebDAVFileHelper");
    private static c v;
    boolean h;
    String i;
    String j;
    boolean k;
    String l;
    String m;
    ax.Ia.a n;
    protected AbstractC3199q o;
    AbstractC3595n p;
    int q;
    private boolean r;
    private Integer s;
    private Boolean t;

    public static class a {
        public boolean a;
        public X509Certificate b;

        /* renamed from: com.voxdon.xplorer.file.W$a$a, reason: collision with other inner class name */
        class C0519a implements X509TrustManager {
            C0519a() {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
                a aVar = a.this;
                X509Certificate x509Certificate = x509CertificateArr[0];
                aVar.b = x509Certificate;
                try {
                    x509Certificate.checkValidity();
                } catch (Exception unused) {
                    throw new CertificateException("Certificate not valid or trusted.");
                }
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        public void a(Context context, ax.Z2.o oVar) {
            W.J0(context);
            String str = W.I0(oVar) + "/";
            try {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                    httpsURLConnection.connect();
                    this.a = true;
                    Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                    int length = serverCertificates.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Certificate certificate = serverCertificates[i];
                        if (certificate instanceof X509Certificate) {
                            this.b = (X509Certificate) certificate;
                            break;
                        }
                        i++;
                    }
                    httpsURLConnection.disconnect();
                } catch (SSLHandshakeException | SSLPeerUnverifiedException unused) {
                    this.a = false;
                    TrustManager[] trustManagerArr = {new C0519a()};
                    SSLContext sSLContext = Build.VERSION.SDK_INT <= 28 ? SSLContext.getInstance("TLSv1.2") : SSLContext.getInstance("TLSv1.3");
                    sSLContext.init(null, trustManagerArr, new SecureRandom());
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(str).openConnection();
                    httpsURLConnection2.setSSLSocketFactory(sSLContext.getSocketFactory());
                    httpsURLConnection2.connect();
                    httpsURLConnection2.disconnect();
                } catch (IOException unused2) {
                    this.a = false;
                }
            } catch (Exception unused3) {
            }
        }
    }

    public static class c extends g0 {
        Context a;
        b b;
        c0 c = new c0(ax.Q2.f.K0);

        class a implements InterfaceC3584c.a {
            final /* synthetic */ ax.g3.k a;
            final /* synthetic */ int b;
            final /* synthetic */ ax.Z2.o c;

            a(ax.g3.k kVar, int i, ax.Z2.o oVar) {
                this.a = kVar;
                this.b = i;
                this.c = oVar;
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void B() {
                this.a.b(ax.Q2.f.K0);
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void T(boolean z, Object obj) {
                if (!z) {
                    this.a.a(ax.Q2.f.K0, this.c.d(), this.c.h(), this.c.k(), obj instanceof Exception ? ((Exception) obj).getMessage() : null);
                    return;
                }
                c.this.p(this.b, this.c);
                ax.Q2.f fVar = ax.Q2.f.K0;
                C3596o d = C1835x.d(fVar, this.b);
                if (d.a()) {
                    ((W) d.u()).O0(false);
                    ((W) d.u()).o0();
                    ax.Z2.b.k().s(d.T(), d.V());
                }
                this.a.c(fVar, this.b);
            }
        }

        c(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("WebDAVPrefs", 0).edit().remove("version_" + i).remove("name_" + i).remove("host_" + i).remove("port_" + i).remove("username_" + i).remove("password_" + i).remove("initialPath_" + i).remove("encryption_" + i).remove("ignorecert_" + i).remove("created_" + i).remove("sortindex_" + i).remove("expectcontinue_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("WebDAVPrefs", 0);
            return new ax.Z2.s(ax.Q2.f.K0, i, sharedPreferences.getString("name_" + i, null), sharedPreferences.getString("username_" + i, "anonymous"), sharedPreferences.getString("host_" + i, null), null, sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("WebDAVPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        @Override // ax.c3.g0
        public ax.Z2.o k(int i) {
            ax.Z2.o oVar = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("WebDAVPrefs", 0);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            String string = sharedPreferences.getString("host_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            oVar.s(string);
            oVar.z(sharedPreferences.getInt("port_" + i, 443));
            oVar.D(sharedPreferences.getString("username_" + i, "anonymous"));
            oVar.y(this.c.a(i2, string, sharedPreferences.getString("password_" + i, HttpUrl.FRAGMENT_ENCODE_SET)));
            oVar.v(sharedPreferences.getString("initialPath_" + i, null));
            if (sharedPreferences.getInt("encryption_" + i, 1) == 1) {
                oVar.C(true);
            } else {
                oVar.C(false);
            }
            oVar.u(sharedPreferences.getBoolean("ignorecert_" + i, false));
            oVar.q(sharedPreferences.getString("name_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            return oVar;
        }

        @Override // ax.c3.g0
        public void l(int i, ax.Z2.o oVar, ax.g3.k kVar, boolean z) {
            int m = m(i);
            if (!z) {
                p(m, oVar);
                kVar.c(ax.Q2.f.K0, m);
            } else {
                b bVar = new b(this.a, oVar, new a(kVar, m, oVar));
                this.b = bVar;
                bVar.h(new Object[0]);
            }
        }

        int m(int i) {
            return i == -100 ? n() : i;
        }

        int n() {
            return this.a.getSharedPreferences("WebDAVPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> o() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("WebDAVPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("host_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void p(int i, ax.Z2.o oVar) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("WebDAVPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("host_" + i, oVar.d()).putInt("port_" + i, oVar.h()).putString("username_" + i, oVar.k()).putString("password_" + i, this.c.e(oVar.d(), oVar.g())).putString("name_" + i, oVar.b()).putString("initialPath_" + i, oVar.f()).putInt("encryption_" + i, oVar.o() ? 1 : 0).putBoolean("ignorecert_" + i, oVar.l());
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

    private boolean D0() {
        return p().getSharedPreferences("WebDAVPrefs", 0).getBoolean("expectcontinue_" + t(), v0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String I0(ax.Z2.o oVar) {
        String n0 = n0(oVar);
        if (TextUtils.isEmpty(oVar.f())) {
            return n0;
        }
        return n0 + d0.U(oVar.f());
    }

    protected static void J0(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC3594m.X(context);
        }
    }

    private boolean M0(int i) {
        return i == ServerType.TYPE_COMMON || i == ServerType.TYPE_NGINX;
    }

    private void N0(boolean z) {
        p().getSharedPreferences("WebDAVPrefs", 0).edit().putBoolean("expectcontinue_" + t(), z).apply();
    }

    private void S0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar, boolean z2) throws C1495j, C1486a {
        boolean z3;
        C3184b.a(abstractC3595n.n());
        ax.Ia.a F0 = F0(j);
        if (F0 == null) {
            F0 = u0();
        }
        try {
            z3 = z2;
            try {
                F0.p(G0(abstractC3595n), new e0(g.b(), 0L, j, interfaceC3185c, iVar), str, z3, j, l);
                if (D0() != z3) {
                    N0(z3);
                }
                this.r = true;
            } catch (ax.Ja.a e) {
                e = e;
                if (e.getCause() instanceof C1486a) {
                    throw ((C1486a) e.getCause());
                }
                if ((e.b() == 408 || (e.getCause() instanceof SocketTimeoutException)) && !this.r) {
                    this.r = true;
                    S0(abstractC3595n, g, str, j, l, z, interfaceC3185c, iVar, !z3);
                } else {
                    if (e.getCause() != null && (e.getCause().getCause() instanceof C1486a)) {
                        throw ((C1486a) e.getCause().getCause());
                    }
                    throw p0("webdav writeFile", e);
                }
            }
        } catch (ax.Ja.a e2) {
            e = e2;
            z3 = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n0(ax.Z2.o oVar) {
        if (oVar.o()) {
            return "https://" + oVar.d() + ":" + oVar.h();
        }
        return "http://" + oVar.d() + ":" + oVar.h();
    }

    private int t0(String str) {
        return str.indexOf("/", str.indexOf("://") + 3);
    }

    private boolean v0() {
        String str = this.i;
        return str == null || !str.startsWith("https://magentacloud.de");
    }

    public static int w0() {
        return 443;
    }

    public static c z0(Context context) {
        if (v == null) {
            v = new c(context.getApplicationContext());
        }
        return v;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        if (this.q != ServerType.TYPE_NEXTCLOUD || str3 == null || !str3.equalsIgnoreCase("haspreview=true")) {
            return w(str, str2);
        }
        try {
            String f1 = D.f1(A0(), E0(), str2);
            if (f1 != null) {
                return y0(f1, 0L);
            }
            return null;
        } catch (C1495j unused) {
            return null;
        }
    }

    protected String A0() {
        return D.Y0(this.i);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    protected String B0(AbstractC3595n abstractC3595n) {
        return C0(abstractC3595n.E(), abstractC3595n.isDirectory());
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        try {
            ArrayList arrayList = new ArrayList();
            ax.Ia.a u0 = u0();
            if (u0 == null) {
                ax.Ha.c.h().f().b("NULL DAV CLIENT!").j().g("connected:" + a()).h();
                throw new C1493h("No dav client is available");
            }
            for (ax.Ia.c cVar : L0(u0, abstractC3595n.E(), 1, true)) {
                if (!abstractC3595n.E().equals(q0(cVar.k()))) {
                    try {
                        arrayList.add(new X(this, cVar));
                    } catch (C1495j unused) {
                    }
                }
            }
            return arrayList;
        } catch (ax.Ja.a e) {
            throw p0("webdav listChildren", e);
        }
    }

    protected String C0(String str, boolean z) {
        String str2 = this.l + str;
        if (z) {
            str2 = d0.O(str2);
        }
        return x0(str2);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        S0(abstractC3595n, g, str, j, l, z, interfaceC3185c, iVar, D0());
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        try {
            long p = abstractC3595n.p();
            ax.Ia.a u0 = u0();
            if (this.m == null) {
                u0.r(G0(abstractC3595n), H0(abstractC3595n2.E(), abstractC3595n.isDirectory()), false);
            } else {
                u0.r(G0(abstractC3595n), C0(abstractC3595n2.E(), abstractC3595n.isDirectory()), false);
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (ax.Ja.a e) {
            throw p0("webdav moveFile", e);
        }
    }

    protected int E0() {
        if (this.s == null) {
            this.s = Integer.valueOf((int) (C3180B.s(p()) * 128.0f));
        }
        return this.s.intValue();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n2.n());
        try {
            long p = abstractC3595n.p();
            ax.Ia.a u0 = u0();
            if (this.m == null) {
                u0.q(G0(abstractC3595n), G0(abstractC3595n2), abstractC3595n.q(), false);
            } else {
                u0.q(G0(abstractC3595n), B0(abstractC3595n2), abstractC3595n.q(), false);
            }
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (ax.Ja.a e) {
            throw p0("webdav copyFile", e);
        }
    }

    protected ax.Ia.a F0(long j) {
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    protected String G0(AbstractC3595n abstractC3595n) {
        return H0(abstractC3595n.E(), abstractC3595n.isDirectory());
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (this.q != ServerType.TYPE_NEXTCLOUD) {
            if (Z(abstractC3595n)) {
                return AbstractC3594m.S(abstractC3595n);
            }
            return null;
        }
        if (!C1808A.J(abstractC3595n)) {
            return null;
        }
        if (((X) abstractC3595n).g0()) {
            return C1809B.a0(abstractC3595n, "haspreview=true");
        }
        if (C2265a.e(p()).m()) {
            return C1809B.Y(abstractC3595n);
        }
        return null;
    }

    protected String H0(String str, boolean z) {
        String str2 = this.i + str;
        if (z) {
            str2 = d0.O(str2);
        }
        return x0(str2);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            u0().h(G0(abstractC3595n));
        } catch (ax.Ja.a e) {
            if ((e.getCause() instanceof ProtocolException) && e.getCause().getMessage() != null && (e.getCause().getMessage().contains("HTTP 204") || e.getCause().getMessage().contains("HTTP 205"))) {
                return;
            }
            e.printStackTrace();
            throw p0("webdav deleteRecursively", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        return y0(G0(abstractC3595n), j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.app.Activity r9, androidx.fragment.app.Fragment r10, com.voxdon.xplorer.file.InterfaceC3584c.a r11) {
        /*
            r8 = this;
            r1 = 0
            ax.u3.q r0 = r8.o     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L16
            boolean r0 = r0.isCancelled()     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L16
            ax.u3.q r0 = r8.o     // Catch: java.lang.Exception -> L11
            r0.e()     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r0 = move-exception
            r9 = r0
            r2 = r8
            r7 = r11
            goto L32
        L16:
            int r6 = r8.t()     // Catch: java.lang.Exception -> L2e
            r5 = r8
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            ax.u3.q r9 = r2.r0(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L2b
            r9.i(r10)     // Catch: java.lang.Exception -> L2b
            r2.o = r9     // Catch: java.lang.Exception -> L2b
            return
        L2b:
            r0 = move-exception
        L2c:
            r9 = r0
            goto L32
        L2e:
            r0 = move-exception
            r2 = r8
            r7 = r11
            goto L2c
        L32:
            r9.printStackTrace()
            if (r7 == 0) goto L41
            r7.B()
            java.lang.String r9 = r9.getMessage()
            r7.T(r1, r9)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.W.K(android.app.Activity, androidx.fragment.app.Fragment, com.voxdon.xplorer.file.c$a):void");
    }

    public boolean K0() {
        String str = this.i;
        if (str == null) {
            return false;
        }
        if (this.t == null) {
            this.t = Boolean.valueOf(str.startsWith("https://webdav.pcloud.com") || this.i.startsWith("https://ewebdav.pcloud.com"));
        }
        return this.t.booleanValue();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    protected List<ax.Ia.c> L0(ax.Ia.a aVar, String str, int i, boolean z) throws ax.Ja.a {
        if (i != 0 || !K0() || "/".equals(str)) {
            return aVar.s(H0(str, z), i);
        }
        ArrayList arrayList = new ArrayList();
        List<ax.Ia.c> s = aVar.s(H0(d0.r(str), z), 1);
        if (s != null) {
            for (ax.Ia.c cVar : s) {
                if (cVar.k() != null) {
                    try {
                        String q0 = q0(cVar.k());
                        if (q0 != null && q0.equals(str)) {
                            arrayList.add(cVar);
                        }
                    } catch (C1495j e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            u0().n(H0(abstractC3595n.E(), true));
            return true;
        } catch (ax.Ja.a e) {
            e.printStackTrace();
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

    void O0(boolean z) {
        this.h = z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        I(abstractC3595n);
    }

    void P0(ax.Ia.a aVar) {
        O0(true);
        this.n = aVar;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    void Q0(int i) {
        this.q = i;
    }

    void R0(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return this.q == ServerType.TYPE_NEXTCLOUD;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.h;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean c0() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    protected boolean l(AbstractC3595n abstractC3595n) {
        return super.l(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    public void o0() {
        p().getSharedPreferences("WebDAVPrefs", 0).edit().remove("expectcontinue_" + t()).apply();
        this.r = false;
    }

    protected C1495j p0(String str, ax.Ja.a aVar) {
        int b2 = aVar.b();
        if (b2 == 0) {
            return C1489d.b(str, aVar);
        }
        if (b2 == 413) {
            return new ax.b3.D(aVar);
        }
        if (b2 == 507) {
            return new ax.b3.s(aVar);
        }
        switch (b2) {
            case 401:
            case 402:
            case 403:
                return new C1490e(aVar);
            case 404:
                return new ax.b3.t(aVar);
            default:
                return new C1495j(aVar);
        }
    }

    protected String q0(String str) throws C1495j {
        String path;
        try {
            path = new URI(str).getPath();
        } catch (URISyntaxException unused) {
            path = Uri.parse(str).getPath();
        }
        if (path == null) {
            ax.Ha.c.h().f().b("WEBDAV PATH NULL").g("url:" + str + ",prefix:" + this.i + "," + this.j);
            throw new C1495j();
        }
        String str2 = this.m;
        if (str2 != null) {
            if (!path.startsWith(str2)) {
                ax.Ha.c.h().f().d("WEBDAV PATH ERROR 1").g("url:" + str + ",prefix:" + this.j + ",rawPath:" + path);
                throw new C1495j("Unknown URL");
            }
            path = path.substring(this.m.length());
        } else if (!TextUtils.isEmpty(this.j)) {
            if (!path.startsWith(this.j)) {
                ax.Ha.c.h().f().d("WEBDAV PATH ERROR 2").g("url:" + str + ",prefix:" + this.j + ",rawPath:" + path);
                throw new C1495j("Unknown URL");
            }
            path = path.substring(this.j.length());
        }
        return d0.U(path);
    }

    protected AbstractC3199q<Object, Void, Boolean> r0(Activity activity, Fragment fragment, W w, int i, InterfaceC3584c.a aVar) {
        return new b(p(), this, t(), aVar);
    }

    protected void s0(String str, String str2, String str3) {
        String path;
        try {
            path = new URI(str).getPath();
        } catch (URISyntaxException unused) {
            path = Uri.parse(str).getPath();
        }
        if (path == null) {
            ax.Ha.c.h().f().b("WEBDAV PATH NULL DETCT PROXY").g("url:" + str + ",prefix:" + this.i + "," + this.j);
            return;
        }
        int lastIndexOf = path.lastIndexOf(str3);
        if (lastIndexOf < 0) {
            return;
        }
        if (str2 == null || !path.startsWith(str2)) {
            String substring = path.substring(0, lastIndexOf);
            if (TextUtils.isEmpty(substring)) {
                if (TextUtils.isEmpty(str2)) {
                    u.fine("case 1");
                    this.m = null;
                } else {
                    u.fine("case 2");
                    this.m = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            } else if (substring.equals(str2)) {
                u.fine("case 3");
                this.m = null;
            } else {
                u.fine("case 4");
                this.m = substring;
            }
            if (this.m != null) {
                u.fine("WebDAV proxy detected : " + str2 + " -> " + this.m);
                if (TextUtils.isEmpty(this.j)) {
                    this.l = this.i + this.m;
                    return;
                }
                this.l = this.i.substring(0, this.i.lastIndexOf(this.j)) + this.m;
            }
        }
    }

    protected ax.Ia.a u0() {
        return this.n;
    }

    protected String x0(String str) {
        int t0 = t0(str);
        String substring = str.substring(0, t0);
        String substring2 = str.substring(t0);
        Uri parse = Uri.parse(substring);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.encodedAuthority(parse.getEncodedAuthority());
        builder.path(substring2);
        return builder.build().toString();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        if (this.q != ServerType.TYPE_NEXTCLOUD) {
            return null;
        }
        ax.Ia.a u0 = u0();
        if (u0 != null) {
            return D.b1(u0, A0());
        }
        throw new C1493h("Not connected : webdav");
    }

    protected InputStream y0(String str, long j) throws C1495j {
        HashMap hashMap;
        if (j != 0) {
            hashMap = new HashMap();
            hashMap.put("Range", "bytes=" + j + "-");
        } else {
            hashMap = null;
        }
        ax.Ia.a u0 = u0();
        if (u0 == null) {
            throw new C1493h("Not connected : webdav");
        }
        try {
            return hashMap != null ? u0.u(str, hashMap) : u0.i(str);
        } catch (ax.Ja.a e) {
            throw p0("webdav getinputstream", e);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        String k;
        AbstractC3595n abstractC3595n;
        boolean equals = str.equals("/");
        if (equals && (abstractC3595n = this.p) != null) {
            return abstractC3595n;
        }
        try {
            ax.Ia.a u0 = u0();
            if (u0 == null) {
                throw new C1493h("Not connected : webdav");
            }
            List<ax.Ia.c> L0 = L0(u0, str, 0, false);
            if (L0.size() == 0) {
                return new X(this, str);
            }
            if (!this.k) {
                if (M0(this.q) && (k = L0.get(0).k()) != null) {
                    s0(k, this.j, str);
                }
                this.k = true;
            }
            X x = new X(this, L0.get(0));
            if (equals) {
                this.p = x;
            }
            return x;
        } catch (ax.Ja.a e) {
            if (e.b() == 404) {
                return new X(this, str);
            }
            throw p0("webdav getfileinfo", e);
        }
    }

    private static class b extends AbstractC3199q<Object, Void, Boolean> {
        InterfaceC3584c.a h;
        String i;
        int j;
        String k;
        String l;
        boolean m;
        String n;
        boolean o;
        W p;
        Context q;
        ax.Ja.a r;
        ax.Z2.o s;

        public b(Context context, W w, int i, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.p = w;
            this.h = aVar;
            y(W.z0(context).k(i));
            this.q = context;
        }

        private void y(ax.Z2.o oVar) {
            this.s = oVar;
            this.i = oVar.d();
            this.j = oVar.h();
            this.k = oVar.k();
            this.l = oVar.g();
            this.n = oVar.f();
            this.m = oVar.o();
            this.o = oVar.l();
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            InterfaceC3584c.a aVar = this.h;
            if (aVar != null) {
                aVar.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Object... objArr) {
            String str;
            W w = this.p;
            if (w != null) {
                w.i();
            }
            W.J0(this.q);
            try {
                ax.Ka.a b = ax.Ia.b.b(ServerType.TYPE_COMMON, this.k, this.l, this.o, 12000L);
                String n0 = W.n0(this.s);
                if (TextUtils.isEmpty(this.n)) {
                    str = null;
                } else {
                    str = d0.U(this.n);
                    if (!"/".equals(str)) {
                        n0 = n0 + str;
                    }
                }
                String str2 = n0 + "/";
                try {
                    if (HttpUrl.parse(str2) == null) {
                        Boolean bool = Boolean.FALSE;
                        W w2 = this.p;
                        if (w2 != null) {
                            w2.j();
                        }
                        return bool;
                    }
                    int t = b.t(str2);
                    b.o(t);
                    W.u.fine("detected server type : " + t);
                    W w3 = this.p;
                    if (w3 != null) {
                        w3.R0(n0, str);
                        this.p.P0(b);
                        this.p.Q0(t);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    W w4 = this.p;
                    if (w4 != null) {
                        w4.j();
                    }
                    return bool2;
                } catch (ax.Ja.a e) {
                    this.r = e;
                    e.printStackTrace();
                    Boolean bool3 = Boolean.FALSE;
                    W w5 = this.p;
                    if (w5 != null) {
                        w5.j();
                    }
                    return bool3;
                } catch (RuntimeException e2) {
                    this.r = new ax.Ja.a(e2);
                    Boolean bool4 = Boolean.FALSE;
                    W w6 = this.p;
                    if (w6 != null) {
                        w6.j();
                    }
                    return bool4;
                }
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            InterfaceC3584c.a aVar = this.h;
            if (aVar != null) {
                aVar.T(bool.booleanValue(), this.r);
            }
        }

        public b(Context context, ax.Z2.o oVar, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = aVar;
            y(oVar);
            this.q = context;
        }
    }
}

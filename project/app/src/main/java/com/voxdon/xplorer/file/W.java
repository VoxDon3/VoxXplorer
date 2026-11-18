/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.Z2.s;
import ax.b3.d;
import ax.b3.e;
import ax.b3.j;
import ax.b3.t;
import ax.c3.A;
import ax.c3.B;
import ax.c3.G;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.e0;
import ax.c3.g0;
import ax.c3.k0;
import ax.c3.x;
import ax.g3.h;
import ax.g3.i;
import ax.g3.k;
import ax.u3.q;
import com.voxdon.xplorer.file.D;
import com.voxdon.xplorer.file.X;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.p;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
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

public class W
extends m {
    private static final Logger u = Logger.getLogger("FileManager.WebDAVFileHelper");
    private static c v;
    boolean h;
    String i;
    String j;
    boolean k;
    String l;
    String m;
    ax.Ia.a n;
    protected q o;
    n p;
    int q;
    private boolean r;
    private Integer s;
    private Boolean t;

    private boolean D0() {
        SharedPreferences sharedPreferences = this.p().getSharedPreferences("WebDAVPrefs", 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expectcontinue_");
        stringBuilder.append(this.t());
        return sharedPreferences.getBoolean(stringBuilder.toString(), this.v0());
    }

    private static String I0(ax.Z2.o object) {
        String string = W.n0((ax.Z2.o)object);
        if (!TextUtils.isEmpty((CharSequence)((ax.Z2.o)object).f())) {
            String string2 = d0.U(((ax.Z2.o)object).f());
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        return string;
    }

    protected static void J0(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            com.voxdon.xplorer.file.m.X(context);
        }
    }

    private boolean M0(int n8) {
        return n8 == ServerType.TYPE_COMMON || n8 == ServerType.TYPE_NGINX;
        {
        }
    }

    private void N0(boolean bl) {
        SharedPreferences.Editor editor = this.p().getSharedPreferences("WebDAVPrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expectcontinue_");
        stringBuilder.append(this.t());
        editor.putBoolean(stringBuilder.toString(), bl).apply();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void S0(n n8, G g8, String string, long l8, Long l9, boolean bl, ax.u3.c c8, i i8, boolean bl2) throws j, ax.b3.a {
        ax.Ja.a var11_14;
        block8: {
            block9: {
                String string2;
                ax.u3.b.a(n8.n());
                Object object = this.F0(l8);
                ax.Ia.a a8 = object;
                if (object == null) {
                    a8 = this.u0();
                }
                try {
                    InputStream inputStream = g8.b();
                    string2 = this.G0(n8);
                    object = new e0(inputStream, 0L, l8, c8, i8);
                }
                catch (ax.Ja.a a9) {
                    // empty catch block
                    break block8;
                }
                try {
                    a8.p(string2, (InputStream)object, string, bl2, l8, l9);
                    if (this.D0() == bl2) break block9;
                    this.N0(bl2);
                }
                catch (ax.Ja.a a10) {
                    break block8;
                }
            }
            this.r = true;
            return;
        }
        if (var11_14.getCause() instanceof ax.b3.a) {
            throw (ax.b3.a)var11_14.getCause();
        }
        if ((var11_14.b() == 408 || var11_14.getCause() instanceof SocketTimeoutException) && !this.r) {
            this.r = true;
            this.S0(n8, g8, string, l8, l9, bl, c8, i8, bl2 ^ true);
            return;
        }
        if (var11_14.getCause() != null && var11_14.getCause().getCause() instanceof ax.b3.a) {
            throw (ax.b3.a)var11_14.getCause().getCause();
        }
        throw this.p0("webdav writeFile", (ax.Ja.a)var11_14);
    }

    static /* synthetic */ String k0(ax.Z2.o o8) {
        return W.n0(o8);
    }

    static /* synthetic */ Logger l0() {
        return u;
    }

    private static String n0(ax.Z2.o o8) {
        if (o8.o()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://");
            stringBuilder.append(o8.d());
            stringBuilder.append(":");
            stringBuilder.append(o8.h());
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://");
        stringBuilder.append(o8.d());
        stringBuilder.append(":");
        stringBuilder.append(o8.h());
        return stringBuilder.toString();
    }

    private int t0(String string) {
        return string.indexOf("/", string.indexOf("://") + 3);
    }

    private boolean v0() {
        String string = this.i;
        return string == null || !string.startsWith("https://magentacloud.de");
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream A(String object, String string, String string2) {
        if (this.q != ServerType.TYPE_NEXTCLOUD) return this.w((String)object, string);
        if (string2 == null) return this.w((String)object, string);
        if (!string2.equalsIgnoreCase("haspreview=true")) return this.w((String)object, string);
        string2 = null;
        try {
            string = D.f1(this.A0(), this.E0(), string);
            object = string2;
            if (string == null) return object;
        }
        catch (j j8) {
            return string2;
        }
        return this.y0(string, 0L);
    }

    protected String A0() {
        return D.Y0(this.i);
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    protected String B0(n n8) {
        return this.C0(n8.E(), n8.isDirectory());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n object, m.f object2) throws j {
        Object object3;
        if (!object.n()) throw new t();
        ax.u3.b.c(object.isDirectory());
        try {
            object2 = new ArrayList();
            object3 = this.u0();
            if (object3 == null) {
                object2 = ax.Ha.c.h().f().b("NULL DAV CLIENT!").j();
                object = new StringBuilder();
                ((StringBuilder)object).append("connected:");
                ((StringBuilder)object).append(this.a());
                ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                object = new ax.b3.h("No dav client is available");
                throw object;
            }
            object3 = this.L0((ax.Ia.a)object3, ((n)object).E(), 1, true).iterator();
        }
        catch (ax.Ja.a a8) {
            throw this.p0("webdav listChildren", a8);
        }
        while (object3.hasNext()) {
            ax.Ia.c c8 = (ax.Ia.c)object3.next();
            Object object4 = this.q0(c8.k());
            boolean bl = ((n)object).E().equals(object4);
            if (bl) continue;
            try {
                object4 = new X(this, c8);
                ((ArrayList)object2).add(object4);
            }
            catch (j j8) {}
        }
        return object2;
    }

    protected String C0(String charSequence, boolean bl) {
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(this.l);
        charSequence2.append((String)charSequence);
        charSequence2 = charSequence2.toString();
        charSequence = charSequence2;
        if (bl) {
            charSequence = d0.O((String)charSequence2);
        }
        return this.x0((String)charSequence);
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.S0(n8, g8, string, l8, l9, bl, c8, i8, this.D0());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n n8, n n9, ax.u3.c object, i i8) throws j {
        long l8;
        block3: {
            block2: {
                ax.u3.b.a(n9.n());
                try {
                    l8 = n8.p();
                    object = this.u0();
                    if (this.m != null) break block2;
                    object.r(this.G0(n8), this.H0(n9.E(), n8.isDirectory()), false);
                    break block3;
                }
                catch (ax.Ja.a a8) {
                    throw this.p0("webdav moveFile", a8);
                }
            }
            object.r(this.G0(n8), this.C0(n9.E(), n8.isDirectory()), false);
        }
        if (i8 == null) return;
        i8.a(l8, l8);
    }

    protected int E0() {
        if (this.s == null) {
            this.s = (int)(ax.u3.B.s(this.p()) * 128.0f);
        }
        return this.s;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n n8, n n9, ax.u3.c object, i i8) throws j, ax.b3.a {
        long l8;
        block3: {
            block2: {
                ax.u3.b.a(n9.n());
                try {
                    l8 = n8.p();
                    object = this.u0();
                    if (this.m != null) break block2;
                    object.q(this.G0(n8), this.G0(n9), n8.q(), false);
                    break block3;
                }
                catch (ax.Ja.a a8) {
                    throw this.p0("webdav copyFile", a8);
                }
            }
            object.q(this.G0(n8), this.B0(n9), n8.q(), false);
        }
        if (i8 == null) return;
        i8.a(l8, l8);
    }

    protected ax.Ia.a F0(long l8) {
        return null;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    protected String G0(n n8) {
        return this.H0(n8.E(), n8.isDirectory());
    }

    @Override
    public String H(n n8) {
        if (this.q == ServerType.TYPE_NEXTCLOUD) {
            if (!A.J(n8)) {
                return null;
            }
            if (((X)n8).g0()) {
                return B.a0(n8, "haspreview=true");
            }
            if (ax.i3.a.e(this.p()).m()) {
                return B.Y(n8);
            }
            return null;
        }
        if (!this.Z(n8)) {
            return null;
        }
        return com.voxdon.xplorer.file.m.S(n8);
    }

    protected String H0(String charSequence, boolean bl) {
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append(this.i);
        charSequence2.append((String)charSequence);
        charSequence2 = charSequence2.toString();
        charSequence = charSequence2;
        if (bl) {
            charSequence = d0.O((String)charSequence2);
        }
        return this.x0((String)charSequence);
    }

    @Override
    public void I(n n8) throws j {
        try {
            this.u0().h(this.G0(n8));
            return;
        }
        catch (ax.Ja.a a8) {
            if (a8.getCause() instanceof ProtocolException && a8.getCause().getMessage() != null && (a8.getCause().getMessage().contains("HTTP 204") || a8.getCause().getMessage().contains("HTTP 205"))) {
                return;
            }
            a8.printStackTrace();
            throw this.p0("webdav deleteRecursively", a8);
        }
    }

    @Override
    public InputStream J(n n8, long l8) throws j {
        return this.y0(this.G0(n8), l8);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        RuntimeException var1_4;
        block9: {
            block8: {
                q q8;
                try {
                    q8 = this.o;
                    if (q8 == null) break block8;
                }
                catch (Exception exception) {}
                try {
                    if (q8.isCancelled()) break block8;
                    this.o.e();
                }
                catch (Exception exception) {
                    break block9;
                }
            }
            int n8 = this.t();
            try {
                object = this.r0((Activity)object, fragment, this, n8, a8);
                ((q)object).i(new Object[0]);
                this.o = object;
                return;
            }
            catch (Exception exception) {}
        }
        var1_4.printStackTrace();
        if (a8 != null) {
            a8.B();
            a8.T(false, var1_4.getMessage());
        }
    }

    public boolean K0() {
        String string = this.i;
        boolean bl = false;
        if (string == null) {
            return false;
        }
        if (this.t == null) {
            if (string.startsWith("https://webdav.pcloud.com") || this.i.startsWith("https://ewebdav.pcloud.com")) {
                bl = true;
            }
            this.t = bl;
        }
        return this.t;
    }

    @Override
    public boolean L() {
        return false;
    }

    protected List<ax.Ia.c> L0(ax.Ia.a iterator, String string, int n8, boolean bl) throws ax.Ja.a {
        if (n8 == 0 && this.K0() && !"/".equals(string)) {
            ArrayList<ax.Ia.c> arrayList = new ArrayList<ax.Ia.c>();
            if ((iterator = iterator.s(this.H0(d0.r(string), bl), 1)) != null) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    ax.Ia.c c8 = (ax.Ia.c)iterator.next();
                    if (c8.k() == null) continue;
                    String string2 = this.q0(c8.k());
                    if (string2 == null) continue;
                    try {
                        if (!string2.equals(string)) continue;
                        arrayList.add(c8);
                    }
                    catch (j j8) {
                        j8.printStackTrace();
                    }
                }
            }
            return arrayList;
        }
        return iterator.s(this.H0(string, bl), n8);
    }

    @Override
    public boolean M(n n8) {
        try {
            this.u0().n(this.H0(n8.E(), true));
            return true;
        }
        catch (ax.Ja.a a8) {
            a8.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean N(n n8) {
        return this.l(n8);
    }

    @Override
    public boolean O() {
        return true;
    }

    void O0(boolean bl) {
        this.h = bl;
    }

    @Override
    public void P(n n8) throws j {
        this.I(n8);
    }

    void P0(ax.Ia.a a8) {
        this.O0(true);
        this.n = a8;
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    void Q0(int n8) {
        this.q = n8;
    }

    void R0(String string, String string2) {
        this.i = string;
        this.j = string2;
    }

    @Override
    public boolean Y() {
        return this.q == ServerType.TYPE_NEXTCLOUD;
    }

    @Override
    public boolean a() {
        return this.h;
    }

    @Override
    public void b() {
    }

    @Override
    public boolean c0() {
        return false;
    }

    @Override
    protected boolean l(n n8) {
        return super.l(n8);
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) throws j {
        this.o(n8, string, bl, bl2, h8, c8);
    }

    public void o0() {
        SharedPreferences.Editor editor = this.p().getSharedPreferences("WebDAVPrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expectcontinue_");
        stringBuilder.append(this.t());
        editor.remove(stringBuilder.toString()).apply();
        this.r = false;
    }

    protected j p0(String string, ax.Ja.a a8) {
        int n8 = a8.b();
        if (n8 != 0) {
            if (n8 != 413) {
                if (n8 != 507) {
                    switch (n8) {
                        default: {
                            return new j(a8);
                        }
                        case 404: {
                            return new t(a8);
                        }
                        case 401: 
                        case 402: 
                        case 403: 
                    }
                    return new e(a8);
                }
                return new ax.b3.s(a8);
            }
            return new ax.b3.D(a8);
        }
        return d.b(string, a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected String q0(String string) throws j {
        Object object;
        try {
            object = new URI(string);
            object = ((URI)object).getPath();
        }
        catch (URISyntaxException uRISyntaxException) {
            object = Uri.parse((String)string).getPath();
        }
        if (object == null) {
            object = ax.Ha.c.h().f().b("WEBDAV PATH NULL");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("url:");
            stringBuilder.append(string);
            stringBuilder.append(",prefix:");
            stringBuilder.append(this.i);
            stringBuilder.append(",");
            stringBuilder.append(this.j);
            ((ax.Ha.b)object).g(stringBuilder.toString());
            throw new j();
        }
        Object object2 = this.m;
        if (object2 != null) {
            if (((String)object).startsWith((String)object2)) {
                object2 = ((String)object).substring(this.m.length());
                return d0.U((String)object2);
            }
            ax.Ha.b b8 = ax.Ha.c.h().f().d("WEBDAV PATH ERROR 1");
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("url:");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(",prefix:");
            ((StringBuilder)object2).append(this.j);
            ((StringBuilder)object2).append(",rawPath:");
            ((StringBuilder)object2).append((String)object);
            b8.g(((StringBuilder)object2).toString());
            throw new j("Unknown URL");
        }
        object2 = object;
        if (TextUtils.isEmpty((CharSequence)this.j)) return d0.U((String)object2);
        if (((String)object).startsWith(this.j)) {
            object2 = ((String)object).substring(this.j.length());
            return d0.U((String)object2);
        }
        ax.Ha.b b9 = ax.Ha.c.h().f().d("WEBDAV PATH ERROR 2");
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("url:");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(",prefix:");
        ((StringBuilder)object2).append(this.j);
        ((StringBuilder)object2).append(",rawPath:");
        ((StringBuilder)object2).append((String)object);
        b9.g(((StringBuilder)object2).toString());
        throw new j("Unknown URL");
    }

    protected q<Object, Void, Boolean> r0(Activity activity, Fragment fragment, W w8, int n8, c.a a8) {
        return new b(this.p(), this, this.t(), a8);
    }

    protected void s0(String object, String object2, String charSequence) {
        Object object3;
        try {
            object3 = new URI((String)object);
            object3 = ((URI)object3).getPath();
        }
        catch (URISyntaxException uRISyntaxException) {
            object3 = Uri.parse((String)object).getPath();
        }
        if (object3 == null) {
            object2 = ax.Ha.c.h().f().b("WEBDAV PATH NULL DETCT PROXY");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("url:");
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(",prefix:");
            ((StringBuilder)charSequence).append(this.i);
            ((StringBuilder)charSequence).append(",");
            ((StringBuilder)charSequence).append(this.j);
            ((ax.Ha.b)object2).g(((StringBuilder)charSequence).toString());
            return;
        }
        int n8 = ((String)object3).lastIndexOf((String)charSequence);
        if (!(n8 < 0 || object2 != null && ((String)object3).startsWith((String)object2))) {
            object = ((String)object3).substring(0, n8);
            if (TextUtils.isEmpty((CharSequence)object)) {
                if (TextUtils.isEmpty((CharSequence)object2)) {
                    u.fine("case 1");
                    this.m = null;
                } else {
                    u.fine("case 2");
                    this.m = "";
                }
            } else if (((String)object).equals(object2)) {
                u.fine("case 3");
                this.m = null;
            } else {
                u.fine("case 4");
                this.m = object;
            }
            if (this.m != null) {
                object = u;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("WebDAV proxy detected : ");
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append(" -> ");
                ((StringBuilder)charSequence).append(this.m);
                ((Logger)object).fine(((StringBuilder)charSequence).toString());
                if (!TextUtils.isEmpty((CharSequence)this.j)) {
                    n8 = this.i.lastIndexOf(this.j);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.i.substring(0, n8));
                    ((StringBuilder)object).append(this.m);
                    this.l = ((StringBuilder)object).toString();
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.i);
                    ((StringBuilder)object).append(this.m);
                    this.l = ((StringBuilder)object).toString();
                }
            }
        }
    }

    protected ax.Ia.a u0() {
        return this.n;
    }

    protected String x0(String string) {
        int n8 = this.t0(string);
        String string2 = string.substring(0, n8);
        string = string.substring(n8);
        Uri uri = Uri.parse((String)string2);
        string2 = new Uri.Builder();
        string2.scheme(uri.getScheme());
        string2.encodedAuthority(uri.getEncodedAuthority());
        string2.path(string);
        return string2.build().toString();
    }

    @Override
    public k0 y() throws j {
        if (this.q == ServerType.TYPE_NEXTCLOUD) {
            ax.Ia.a a8 = this.u0();
            if (a8 != null) {
                return D.b1(a8, this.A0());
            }
            throw new ax.b3.h("Not connected : webdav");
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected InputStream y0(String object, long l8) throws j {
        Object object2;
        HashMap<String, String> hashMap;
        if (l8 != 0L) {
            hashMap = new HashMap<String, String>();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("bytes=");
            ((StringBuilder)object2).append(l8);
            ((StringBuilder)object2).append("-");
            hashMap.put("Range", ((StringBuilder)object2).toString());
        } else {
            hashMap = null;
        }
        object2 = this.u0();
        if (object2 == null) throw new ax.b3.h("Not connected : webdav");
        if (hashMap == null) return object2.i((String)object);
        try {
            return object2.u((String)object, hashMap);
        }
        catch (ax.Ja.a a8) {
            throw this.p0("webdav getinputstream", a8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public n z(String string) throws j {
        ax.Ja.a a82;
        block7: {
            Object object;
            List<ax.Ia.c> list;
            boolean bl = string.equals("/");
            if (bl && (list = this.p) != null) {
                return list;
            }
            try {
                list = this.u0();
                if (list == null) {
                    list = new List<ax.Ia.c>("Not connected : webdav");
                    throw list;
                }
                if ((list = this.L0((ax.Ia.a)((Object)list), string, 0, false)).size() == 0) {
                    return new X(this, string);
                }
            }
            catch (ax.Ja.a a82) {
                break block7;
            }
            if (!this.k) {
                if (this.M0(this.q) && (object = list.get(0).k()) != null) {
                    this.s0((String)object, this.j, string);
                }
                this.k = true;
            }
            object = new X(this, list.get(0));
            if (!bl) return object;
            this.p = object;
            return object;
        }
        if (a82.b() != 404) throw this.p0("webdav getfileinfo", a82);
        return new X(this, string);
    }

    public static class a {
        public boolean a;
        public X509Certificate b;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void a(Context object, ax.Z2.o object2) {
            W.J0((Context)object);
            object = new StringBuilder();
            ((StringBuilder)object).append(W.I0((ax.Z2.o)object2));
            ((StringBuilder)object).append("/");
            object2 = ((StringBuilder)object).toString();
            object = new URL((String)object2);
            object = (HttpsURLConnection)((URL)object).openConnection();
            ((URLConnection)object).connect();
            this.a = true;
            for (Certificate certificate : ((HttpsURLConnection)object).getServerCertificates()) {
                if (!(certificate instanceof X509Certificate)) continue;
                this.b = (X509Certificate)certificate;
                break;
            }
            try {
                try {
                    ((HttpURLConnection)object).disconnect();
                    return;
                }
                catch (IOException iOException) {
                    this.a = false;
                    return;
                }
                catch (SSLHandshakeException | SSLPeerUnverifiedException sSLException) {
                    this.a = false;
                    Object object3 = new X509TrustManager(this){
                        final a a;
                        {
                            this.a = a8;
                        }

                        @Override
                        public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(X509Certificate[] object, String object2) throws CertificateException {
                            object2 = this.a;
                            ((a)object2).b = object = object[0];
                            try {
                                ((X509Certificate)object).checkValidity();
                                return;
                            }
                            catch (Exception exception) {
                                throw new CertificateException("Certificate not valid or trusted.");
                            }
                        }

                        @Override
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }
                    };
                    SSLContext sSLContext = Build.VERSION.SDK_INT <= 28 ? SSLContext.getInstance("TLSv1.2") : SSLContext.getInstance("TLSv1.3");
                    SecureRandom secureRandom = new SecureRandom();
                    sSLContext.init(null, new TrustManager[]{object3}, secureRandom);
                    object3 = new URL((String)object2);
                    object2 = (HttpsURLConnection)((URL)object3).openConnection();
                    ((HttpsURLConnection)object2).setSSLSocketFactory(sSLContext.getSocketFactory());
                    ((URLConnection)object2).connect();
                    ((HttpURLConnection)object2).disconnect();
                }
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    private static class b
    extends q<Object, Void, Boolean> {
        c.a h;
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

        public b(Context context, ax.Z2.o o8, c.a a8) {
            super(q.e.c0);
            this.h = a8;
            this.y(o8);
            this.q = context;
        }

        public b(Context context, W w8, int n8, c.a a8) {
            super(q.e.c0);
            this.p = w8;
            this.h = a8;
            this.y(W.z0(context).k(n8));
            this.q = context;
        }

        private void y(ax.Z2.o o8) {
            this.s = o8;
            this.i = o8.d();
            this.j = o8.h();
            this.k = o8.k();
            this.l = o8.g();
            this.n = o8.f();
            this.m = o8.o();
            this.o = o8.l();
        }

        @Override
        protected void r() {
            c.a a8 = this.h;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Object ... var1_1) {
            block19: {
                block20: {
                    block17: {
                        block18: {
                            var1_1 = this.p;
                            if (var1_1 != null) {
                                var1_1.i();
                            }
                            W.J0(this.q);
                            try {
                                var7_4 = ax.Ia.b.b(ServerType.TYPE_COMMON, this.k, this.l, this.o, 12000L);
                                var5_5 = W.k0(this.s);
                                var3_6 = TextUtils.isEmpty((CharSequence)this.n);
                                if (!var3_6) {
                                    var6_7 = d0.U(this.n);
                                    var1_1 = var5_5;
                                    var4_8 = var6_7;
                                    if (!"/".equals(var6_7)) {
                                        var1_1 = new StringBuilder();
                                        var1_1.append((String)var5_5);
                                        var1_1.append((String)var6_7);
                                        var1_1 = var1_1.toString();
                                        var4_8 = var6_7;
                                    }
                                } else {
                                    var4_8 = null;
                                    var1_1 = var5_5;
                                }
                                var5_5 = new StringBuilder();
                                var5_5.append((String)var1_1);
                                var5_5.append("/");
                                var5_5 = var5_5.toString();
                                try {
                                    if (HttpUrl.parse((String)var5_5) == null) {
                                        var4_8 = Boolean.FALSE;
                                        var1_1 = this.p;
                                        if (var1_1 == null) break block17;
                                        break block18;
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (RuntimeException var4_10) {
                                    ** GOTO lbl-1000
                                }
                                catch (ax.Ja.a var1_2) {
                                    ** GOTO lbl-1000
                                }
                            }
                            catch (Throwable var4_9) {
                                break block19;
                            }
                        }
                        var1_1.j();
                    }
                    return var4_8;
lbl-1000:
                    // 1 sources

                    {
                        var2_12 = var7_4.t((String)var5_5);
                        var7_4.o(var2_12);
                        var5_5 = W.l0();
                        var6_7 = new StringBuilder();
                        var6_7.append("detected server type : ");
                        var6_7.append(var2_12);
                        var5_5.fine(var6_7.toString());
                        var5_5 = this.p;
                        if (var5_5 != null) {
                            var5_5.R0((String)var1_1, (String)var4_8);
                            this.p.P0(var7_4);
                            this.p.Q0(var2_12);
                        }
                        var4_8 = Boolean.TRUE;
                        var1_1 = this.p;
                        if (var1_1 == null) break block20;
                    }
                    var1_1.j();
                }
                return var4_8;
lbl-1000:
                // 1 sources

                {
                    this.r = var1_1 = new ax.Ja.a(var4_10);
                    var1_1 = Boolean.FALSE;
                    var4_11 = this.p;
                    if (var4_11 != null) {
                        var4_11.j();
                    }
                    return var1_1;
                }
lbl-1000:
                // 1 sources

                {
                    this.r = var1_2;
                    var1_2.printStackTrace();
                    var4_8 = Boolean.FALSE;
                    var1_3 = this.p;
                    if (var1_3 != null) {
                        var1_3.j();
                    }
                    return var4_8;
                }
            }
            var1_1 = this.p;
            if (var1_1 != null) {
                var1_1.j();
            }
            throw var4_9;
        }

        protected void x(Boolean bl) {
            c.a a8 = this.h;
            if (a8 != null) {
                a8.T(bl, this.r);
            }
        }
    }

    public static class c
    extends g0 {
        Context a;
        b b;
        c0 c;

        c(Context context) {
            this.a = context;
            this.c = new c0(f.K0);
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("WebDAVPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("name_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("port_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("username_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("password_");
            stringBuilder.append(n8);
            object = object.remove(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialPath_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("encryption_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("ignorecert_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("created_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("expectcontinue_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            Object object = this.a.getSharedPreferences("WebDAVPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("name_");
            charSequence.append(n8);
            charSequence = object.getString(charSequence.toString(), null);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            charSequence2 = object.getString(charSequence2.toString(), "anonymous");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            long l9 = object.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            object = object.getString(stringBuilder.toString(), null);
            return new s(f.K0, n8, (String)charSequence, (String)charSequence2, (String)object, null, l8, l9);
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("WebDAVPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        @Override
        public ax.Z2.o k(int n8) {
            ax.Z2.o o8 = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("WebDAVPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("version_");
            ((StringBuilder)charSequence).append(n8);
            int n9 = sharedPreferences.getInt(((StringBuilder)charSequence).toString(), 0);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("host_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = sharedPreferences.getString(((StringBuilder)charSequence).toString(), "");
            o8.s((String)charSequence);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("port_");
            charSequence2.append(n8);
            o8.z(sharedPreferences.getInt(charSequence2.toString(), 443));
            charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            o8.D(sharedPreferences.getString(charSequence2.toString(), "anonymous"));
            charSequence2 = new StringBuilder();
            charSequence2.append("password_");
            charSequence2.append(n8);
            charSequence2 = sharedPreferences.getString(charSequence2.toString(), "");
            o8.y(this.c.a(n9, (String)charSequence, (String)charSequence2));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("initialPath_");
            ((StringBuilder)charSequence).append(n8);
            o8.v(sharedPreferences.getString(((StringBuilder)charSequence).toString(), null));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("encryption_");
            ((StringBuilder)charSequence).append(n8);
            if (sharedPreferences.getInt(((StringBuilder)charSequence).toString(), 1) == 1) {
                o8.C(true);
            } else {
                o8.C(false);
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("ignorecert_");
            ((StringBuilder)charSequence).append(n8);
            o8.u(sharedPreferences.getBoolean(((StringBuilder)charSequence).toString(), false));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name_");
            ((StringBuilder)charSequence).append(n8);
            o8.q(sharedPreferences.getString(((StringBuilder)charSequence).toString(), ""));
            return o8;
        }

        @Override
        public void l(int n8, ax.Z2.o object, k k8, boolean bl) {
            n8 = this.m(n8);
            if (bl) {
                this.b = object = new b(this.a, (ax.Z2.o)object, new c.a(){
                    final k a;
                    final int b;
                    final ax.Z2.o c;
                    final c d;
                    {
                        this.d = c8;
                        this.a = k8;
                        this.b = n8;
                        this.c = o8;
                    }

                    @Override
                    public void B() {
                        this.a.b(f.K0);
                    }

                    @Override
                    public void T(boolean bl, Object object) {
                        if (bl) {
                            this.d.p(this.b, this.c);
                            f f8 = f.K0;
                            object = x.d(f8, this.b);
                            if (((o)object).a()) {
                                ((W)((o)object).u()).O0(false);
                                ((W)((o)object).u()).o0();
                                ax.Z2.b.k().s(((o)object).T(), ((o)object).V());
                            }
                            this.a.c(f8, this.b);
                            return;
                        }
                        object = object instanceof Exception ? ((Exception)object).getMessage() : null;
                        this.a.a(f.K0, this.c.d(), this.c.h(), this.c.k(), (String)object);
                    }
                });
                ((q)object).h(new Object[0]);
                return;
            }
            this.p(n8, (ax.Z2.o)object);
            k8.c(f.K0, n8);
        }

        int m(int n8) {
            int n9 = n8;
            if (n8 == -100) {
                n9 = this.n();
            }
            return n9;
        }

        int n() {
            return this.a.getSharedPreferences("WebDAVPrefs", 0).getInt("count", 0);
        }

        public List<s> o() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("WebDAVPrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("host_");
                stringBuilder.append(i8);
                if (context.getString(stringBuilder.toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        void p(int n8, ax.Z2.o object) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("WebDAVPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = context.putInt(stringBuilder.toString(), 3);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("host_");
            stringBuilder2.append(n8);
            stringBuilder = stringBuilder.putString(stringBuilder2.toString(), ((ax.Z2.o)object).d());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("port_");
            stringBuilder2.append(n8);
            stringBuilder = stringBuilder.putInt(stringBuilder2.toString(), ((ax.Z2.o)object).h());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("username_");
            stringBuilder2.append(n8);
            stringBuilder = stringBuilder.putString(stringBuilder2.toString(), ((ax.Z2.o)object).k());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("password_");
            stringBuilder2.append(n8);
            stringBuilder2 = stringBuilder.putString(stringBuilder2.toString(), this.c.e(((ax.Z2.o)object).d(), ((ax.Z2.o)object).g()));
            stringBuilder = new StringBuilder();
            stringBuilder.append("name_");
            stringBuilder.append(n8);
            stringBuilder2 = stringBuilder2.putString(stringBuilder.toString(), ((ax.Z2.o)object).b());
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialPath_");
            stringBuilder.append(n8);
            stringBuilder = stringBuilder2.putString(stringBuilder.toString(), ((ax.Z2.o)object).f());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("encryption_");
            stringBuilder2.append(n8);
            stringBuilder = stringBuilder.putInt(stringBuilder2.toString(), ((ax.Z2.o)object).o() ? 1 : 0);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ignorecert_");
            stringBuilder2.append(n8);
            stringBuilder.putBoolean(stringBuilder2.toString(), ((ax.Z2.o)object).l());
            if (bl) {
                object = new StringBuilder();
                ((StringBuilder)object).append("created_");
                ((StringBuilder)object).append(n8);
                context.putLong(((StringBuilder)object).toString(), System.currentTimeMillis());
                object = new StringBuilder();
                ((StringBuilder)object).append("sortindex_");
                ((StringBuilder)object).append(n8);
                context.putLong(((StringBuilder)object).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }
    }
}


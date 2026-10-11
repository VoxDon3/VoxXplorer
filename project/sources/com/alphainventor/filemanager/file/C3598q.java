package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1491f;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.b3.C1496k;
import ax.c3.C1811D;
import ax.c3.C1821i;
import ax.c3.C1822j;
import ax.c3.C1835x;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.i0;
import ax.u3.AbstractC3199q;
import ax.u3.AbstractC3202t;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3598q extends AbstractC3594m implements i0 {
    static g v;
    private SimpleDateFormat h;
    private d i;
    private ax.Sc.e j;
    private e l;
    private String m;
    private String n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private int s;
    private static final Logger u = Logger.getLogger("FileManager.FtpFileHelper");
    private static int w = 0;
    private static int x = 1;
    private static int y = 2;
    private final Object k = new Object();
    private boolean t = false;

    /* renamed from: com.voxdon.xplorer.file.q$a */
    class a implements ax.Sc.l {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // ax.Sc.l
        public boolean a(ax.Sc.i iVar) {
            if (iVar == null) {
                return false;
            }
            return iVar.b().trim().equals(this.a);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$b */
    class b implements ax.g3.i {
        final /* synthetic */ ax.g3.i a;

        b(ax.g3.i iVar) {
            this.a = iVar;
        }

        @Override // ax.g3.i
        public void a(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                iVar.a(j / 2, j2);
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$c */
    class c implements ax.g3.i {
        final /* synthetic */ ax.g3.i a;

        c(ax.g3.i iVar) {
            this.a = iVar;
        }

        @Override // ax.g3.i
        public void a(long j, long j2) {
            ax.g3.i iVar = this.a;
            if (iVar != null) {
                if (j == j2) {
                    iVar.a(j2, j2);
                } else {
                    iVar.a((j2 / 2) + (j / 2), j2);
                }
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$e */
    class e extends AbstractC3202t<ax.Sc.e> {
        e() {
        }

        public ax.Sc.e f() throws ax.b3.K {
            ax.Sc.e eVar = (ax.Sc.e) super.a();
            return (eVar == null || eVar.w()) ? eVar : d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3202t
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(ax.Sc.e eVar) {
            C3598q.v0(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3202t
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public ax.Sc.e d() throws ax.b3.K {
            try {
                d dVar = new d(C3598q.this.p(), null, C3598q.this.t(), null);
                if (dVar.h(new Object[0]).l().booleanValue()) {
                    return dVar.z();
                }
                if (!dVar.B()) {
                    ax.Ha.c.h().f().c("FTP CHANNEL OPEN ERROR 1").g("msg:" + dVar.y()).h();
                }
                throw new ax.b3.K("Could not create transfer connection");
            } catch (ax.b3.K e) {
                throw e;
            } catch (Exception e2) {
                ax.Ha.c.h().f().d("FTP CHANNEL OPEN ERROR 2").l(e2).h();
                e2.printStackTrace();
                throw new ax.b3.K("Could not create transfer connection", e2);
            }
        }

        public void i(ax.Sc.e eVar) {
            if (eVar == null) {
                C3598q.u.severe("Try to release null ftpclient");
            } else if (eVar.w()) {
                super.e(eVar);
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$f */
    class f extends ax.c3.H {
        ax.Sc.e c0;
        boolean d0;

        f(ax.Sc.e eVar, InputStream inputStream) {
            super(inputStream);
            this.c0 = eVar;
        }

        @Override // ax.c3.H, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.d0) {
                return;
            }
            super.close();
            this.d0 = true;
            if (this.c0.w()) {
                this.c0.A0();
                this.c0.C0();
                if (this.c0 != C3598q.this.j) {
                    C3598q.this.l.i(this.c0);
                }
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$g */
    public static class g extends g0 {
        Context a;
        d b;
        int d = 100000000;
        HashMap<Integer, k> e = new HashMap<>();
        c0 c = new c0(ax.Q2.f.H0);

        /* renamed from: com.voxdon.xplorer.file.q$g$a */
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
                this.a.b(ax.Q2.f.H0);
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void T(boolean z, Object obj) {
                if (!z) {
                    this.a.a(ax.Q2.f.H0, this.c.d(), this.c.h(), this.c.k(), obj instanceof String ? (String) obj : null);
                    return;
                }
                g.this.s(this.b, this.c);
                ax.Q2.f fVar = ax.Q2.f.H0;
                C3596o d = C1835x.d(fVar, this.b);
                new AbstractC3594m.d(d.u()).i(new Long[0]);
                ax.Z2.b.k().s(d.T(), d.V());
                this.a.c(fVar, this.b);
            }
        }

        g(Context context) {
            this.a = context;
        }

        private int o(ax.o3.o oVar) {
            String e = oVar.e();
            InetAddress g = oVar.g();
            int i = oVar.i();
            for (Map.Entry<Integer, k> entry : this.e.entrySet()) {
                ax.Z2.o oVar2 = entry.getValue().a;
                if (C3180B.j(oVar2.b(), e) && C3180B.j(oVar2.d(), g.getHostAddress()) && oVar2.h() == i) {
                    return entry.getKey().intValue();
                }
            }
            return 0;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("FTPPrefs", 0).edit().remove("version_" + i).remove("name_" + i).remove("host_" + i).remove("port_" + i).remove("username_" + i).remove("password_" + i).remove("initialPath_" + i).remove("mode_" + i).remove("security_" + i).remove("charset_" + i).remove("created_" + i).remove("sortindex_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            if (C3598q.D0(i)) {
                ax.Z2.o k = k(i);
                return k == null ? new ax.Z2.s(ax.Q2.f.H0, i, null, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0L, 0L) : new ax.Z2.s(ax.Q2.f.H0, i, k.b(), HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0L, 0L);
            }
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("FTPPrefs", 0);
            return new ax.Z2.s(ax.Q2.f.H0, i, sharedPreferences.getString("name_" + i, null), sharedPreferences.getString("username_" + i, "anonymous"), sharedPreferences.getString("host_" + i, null), sharedPreferences.getString("initialPath_" + i, null), sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("FTPPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        @Override // ax.c3.g0
        public ax.Z2.o k(int i) {
            if (C3598q.D0(i)) {
                k kVar = this.e.get(Integer.valueOf(i));
                if (kVar != null) {
                    return kVar.a;
                }
                return null;
            }
            ax.Z2.o oVar = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("FTPPrefs", 0);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            oVar.q(sharedPreferences.getString("name_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            String string = sharedPreferences.getString("host_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            oVar.s(string);
            oVar.z(sharedPreferences.getInt("port_" + i, 21));
            oVar.D(sharedPreferences.getString("username_" + i, "anonymous"));
            oVar.y(this.c.a(i2, string, sharedPreferences.getString("password_" + i, HttpUrl.FRAGMENT_ENCODE_SET)));
            oVar.v(sharedPreferences.getString("initialPath_" + i, null));
            oVar.w(sharedPreferences.getBoolean("mode_" + i, false));
            oVar.p(sharedPreferences.getString("charset_" + i, null));
            int i3 = sharedPreferences.getInt("security_" + i, -1);
            if (i3 < 0) {
                oVar.C(false);
                return oVar;
            }
            oVar.C(true);
            oVar.x(i3 > 0);
            return oVar;
        }

        @Override // ax.c3.g0
        public void l(int i, ax.Z2.o oVar, ax.g3.k kVar, boolean z) {
            if (i == -100) {
                i = n();
            }
            if (!z) {
                s(i, oVar);
                kVar.c(ax.Q2.f.H0, i);
            } else {
                d dVar = new d(this.a, oVar, new a(kVar, i, oVar));
                this.b = dVar;
                dVar.h(new Object[0]);
            }
        }

        public void m(int i) {
            k kVar = this.e.get(Integer.valueOf(i));
            if (kVar != null) {
                kVar.c = false;
            }
        }

        int n() {
            return this.a.getSharedPreferences("FTPPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> p() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("FTPPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("host_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        public int q(ax.o3.o oVar) {
            k kVar;
            String h = oVar.h();
            int o = o(oVar);
            if (o == 0 || (kVar = this.e.get(Integer.valueOf(o))) == null || !C3180B.j(h, kVar.b) || !kVar.c) {
                return 0;
            }
            return o;
        }

        public int r(ax.o3.o oVar, String str, String str2) {
            k kVar;
            String e = oVar.e();
            InetAddress g = oVar.g();
            int i = oVar.i();
            String h = oVar.h();
            boolean m = oVar.m();
            int o = o(oVar);
            if (o != 0 && (kVar = this.e.get(Integer.valueOf(o))) != null) {
                if (C3180B.j(kVar.a.k(), str) && C3180B.j(kVar.a.g(), str2)) {
                    if (!C3180B.j(h, kVar.b)) {
                        kVar.b = h;
                        kVar.c = false;
                    }
                    return o;
                }
                kVar.a.D(str);
                kVar.a.y(str2);
                kVar.b = h;
                kVar.c = false;
                return o;
            }
            int i2 = this.d;
            this.d = i2 + 1;
            ax.Z2.o oVar2 = new ax.Z2.o();
            oVar2.q(e);
            oVar2.s(g.getHostAddress());
            oVar2.z(i);
            oVar2.D(str);
            oVar2.y(str2);
            oVar2.w(false);
            oVar2.p(null);
            oVar2.C(m);
            this.e.put(Integer.valueOf(i2), new k(oVar2, h));
            return i2;
        }

        void s(int i, ax.Z2.o oVar) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("FTPPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("host_" + i, oVar.d()).putInt("port_" + i, oVar.h()).putString("username_" + i, oVar.k()).putString("password_" + i, this.c.e(oVar.d(), oVar.g())).putString("name_" + i, oVar.b()).putString("initialPath_" + i, oVar.f()).putString("charset_" + i, oVar.a()).putBoolean("mode_" + i, oVar.m());
            if (z) {
                edit.putLong("created_" + i, System.currentTimeMillis());
                edit.putLong("sortindex_" + i, System.currentTimeMillis());
            }
            if (oVar.o()) {
                edit.putInt("security_" + i, oVar.n() ? 1 : 0);
            } else {
                edit.putInt("security_" + i, -1);
            }
            if (z) {
                edit.putInt("count", i + 1);
            }
            edit.commit();
        }

        public void t(int i) {
            k kVar = this.e.get(Integer.valueOf(i));
            if (kVar != null) {
                kVar.c = true;
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$h */
    interface h {
        void a(int i);

        void b(int i);

        int c();

        String d();

        boolean e();

        void g() throws IOException;
    }

    /* renamed from: com.voxdon.xplorer.file.q$i */
    static class i extends ax.Sc.e implements h {
        boolean g0;
        int h0;
        String i0;
        int j0;

        i() {
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void a(int i) {
            this.g0 = true;
            this.h0 = i;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void b(int i) {
            this.j0 = i;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public int c() {
            return this.j0;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public String d() {
            return this.i0;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public boolean e() {
            try {
                E();
                return true;
            } catch (SocketTimeoutException | IOException unused) {
                return false;
            }
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void g() throws IOException {
            if (Z0("UTF8") || Z0("UTF-8")) {
                m0("UTF-8");
                this.x = new ax.Uc.a(new InputStreamReader(this.e, O()));
                this.y = new BufferedWriter(new OutputStreamWriter(this.f, O()));
            }
        }

        @Override // ax.Sc.e, ax.Rc.e
        protected void i() throws IOException {
            super.i();
            if (R() == 220) {
                this.i0 = S();
            }
        }

        @Override // ax.Sc.e
        protected Socket v0(String str, String str2) throws IOException {
            int i;
            try {
                Socket v0 = super.v0(str, str2);
                if (v0 == null) {
                    return null;
                }
                if (v0.getSendBufferSize() > 1048576) {
                    v0.setSendBufferSize(524288);
                }
                if (this.g0 && (i = this.h0) > 0) {
                    v0.setSoLinger(true, i);
                    C3598q.u.fine("set so linger:" + v0.getSoLinger());
                }
                return v0;
            } catch (StringIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$k */
    public static class k {
        final ax.Z2.o a;
        String b;
        boolean c;

        public k(ax.Z2.o oVar, String str) {
            this.a = oVar;
            this.b = str;
        }
    }

    protected static void A0(Context context) {
        if (G0()) {
            AbstractC3594m.X(context);
        }
    }

    private boolean C0(int i2) {
        return ax.Sc.t.a(i2) || ax.Sc.t.b(i2);
    }

    public static boolean D0(int i2) {
        return i2 >= 100000000;
    }

    private static boolean G0() {
        return Build.VERSION.SDK_INT > 28;
    }

    public static ax.Sc.i H0(String str, String str2) throws IOException {
        if (str.charAt(0) != ' ') {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (str.startsWith("250-modify")) {
                return ax.Tc.g.g(str.substring(4));
            }
            if (lowerCase.startsWith("250 end")) {
                return null;
            }
            if (str.length() >= 2) {
                if (str.endsWith("; ") && str.startsWith("Size=") && "/".equals(str2)) {
                    String[] split = str.split(" ", 2);
                    if (split.length == 2 && split[1].length() == 0) {
                        str = str + str2;
                    }
                }
                ax.Sc.i g2 = ax.Tc.g.g(str);
                if (g2 != null) {
                    return g2;
                }
            }
        }
        if (str.equals(" /") && "/".equals(str2)) {
            ax.Sc.i iVar = new ax.Sc.i();
            iVar.q(1);
            iVar.l(str2);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            iVar.n(str);
            iVar.p(calendar);
            return iVar;
        }
        if (str.charAt(0) != ' ') {
            str = " " + str;
        }
        if (str.length() >= 3) {
            return ax.Tc.g.g(str.replaceAll("^\\s+", HttpUrl.FRAGMENT_ENCODE_SET));
        }
        throw new ax.Rc.a("Invalid server reply (MLST): '" + str + "'");
    }

    private void I0() {
        b();
        o0();
    }

    private boolean L0(ax.Sc.e eVar, AbstractC3595n abstractC3595n, long j2, boolean z) {
        if (j2 <= 0) {
            return false;
        }
        try {
            if (!O0() || !eVar.w()) {
                return false;
            }
            if (z) {
                eVar.X(abstractC3595n.E(), y0(j2));
                return true;
            }
            eVar.X(abstractC3595n.B(), y0(j2));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean N0() {
        return this.s != x;
    }

    private boolean O0() throws IOException {
        return this.j.Z0("MFMT");
    }

    private boolean P0() throws IOException {
        return this.j.Z0("MLSD") || this.j.Z0("MLST");
    }

    private boolean Q0() throws IOException {
        return this.j.Z0("MLST");
    }

    private void R0() {
        boolean z;
        boolean z2;
        synchronized (this.k) {
            try {
                z = true;
                z2 = (a() && this.j.v()) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            o0();
            return;
        }
        synchronized (this.k) {
            try {
                z = true ^ this.j.v1();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            if (z) {
                I0();
            }
        }
    }

    private void o0() {
        try {
            new d(p(), this, t(), null).h(new Object[0]).l();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean p0(String str) throws IOException {
        if (str.equals(this.n)) {
            return true;
        }
        return ax.Sc.t.c(q0(this.j, str));
    }

    private int q0(ax.Sc.e eVar, String str) throws IOException {
        boolean B0 = eVar.B0(d0.O(str));
        int R = eVar.R();
        if (B0) {
            if (eVar == this.j) {
                this.n = str;
                return R;
            }
        } else if (R == 550 && "/".equals(str)) {
            do {
                try {
                    String q1 = eVar.q1();
                    if (q1 == null) {
                        break;
                    }
                    if ("/".equals(q1)) {
                        return 250;
                    }
                } catch (IOException unused) {
                }
            } while (ax.Sc.t.c(eVar.I()));
        }
        return R;
    }

    private boolean r0(String str) throws IOException {
        if ("/".equals(str)) {
            return true;
        }
        return str != null && str.equals(this.m) && ax.Sc.t.c(q0(this.j, str));
    }

    private C1495j s0(String str, IOException iOException) {
        return iOException instanceof ax.Sc.h ? new ax.b3.q(iOException) : C1489d.b(str, iOException);
    }

    private C1495j t0(String str, int i2, String str2, boolean z) {
        String str3 = str + " (" + str2 + ")";
        if (i2 != 550) {
            if (i2 == 452) {
                return new ax.b3.s(str3);
            }
            if (i2 == 552) {
                return new ax.b3.s(str3);
            }
            if (i2 != 553) {
                return i2 == 425 ? new ax.b3.q(str3) : i2 == 426 ? new ax.b3.q(str3) : new C1495j(str3);
            }
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                if (lowerCase.contains("access") || lowerCase.contains("permission")) {
                    return new C1490e(str3);
                }
                if (lowerCase.contains("name")) {
                    return new ax.b3.o(str3);
                }
            }
            return new C1490e(str3);
        }
        if (str2 == null) {
            return z ? new ax.b3.t(str3) : new C1490e(str3);
        }
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase2.contains("no such") || lowerCase2.contains("not found")) {
            return new ax.b3.t(str3);
        }
        if (lowerCase2.contains("access") || lowerCase2.contains("permission")) {
            return new C1490e(str3);
        }
        if (lowerCase2.contains("not empty")) {
            return new C1496k(str3);
        }
        if (lowerCase2.contains("already exist")) {
            return new C1491f(false);
        }
        C3184b.e(str2);
        return z ? new ax.b3.t(str3) : new C1490e(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v0(ax.Sc.e eVar) {
        if (eVar == null || !eVar.w()) {
            return;
        }
        try {
            eVar.o();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static int w0() {
        return 21;
    }

    private ax.Sc.i x0(String str) throws IOException {
        if ("/".equals(str)) {
            return null;
        }
        String h2 = d0.h(str);
        int q0 = q0(this.j, d0.r(str));
        if (!ax.Sc.t.c(q0)) {
            if (q0 == 550) {
                return null;
            }
            throw new IOException("ChangeWorkingDirectory Error :" + this.j.R());
        }
        try {
            ax.Sc.i[] k1 = this.j.k1(null, new a(h2));
            if (k1.length == 0) {
                return null;
            }
            return k1[0];
        } catch (IllegalStateException e2) {
            ax.Ha.c.h().f().d("FTP ILLEGALSTATE").l(e2).g("mode: " + this.j.K0()).h();
            throw new IOException("IllegalState : " + e2.getMessage());
        }
    }

    private String y0(long j2) {
        if (this.h == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            this.h = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }
        return this.h.format(new Date(j2));
    }

    public static g z0(Context context) {
        if (v == null) {
            v = new g(context.getApplicationContext());
        }
        return v;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        if (this.q) {
            return null;
        }
        return w(str, str2);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    boolean B0() {
        return this.j instanceof j;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3184b.c(abstractC3595n.isDirectory());
        R0();
        String B = abstractC3595n.B();
        String E = abstractC3595n.E();
        try {
            synchronized (this.k) {
                try {
                    if (N0()) {
                        this.j.z1(true);
                    }
                    int q0 = q0(this.j, E);
                    if (!ax.Sc.t.c(q0)) {
                        throw t0("FTP listChildren CWD", q0, this.j.S(), false);
                    }
                    if (P0()) {
                        try {
                            List<AbstractC3595n> E0 = E0(B, E, true);
                            if (E0 != null) {
                                return E0;
                            }
                        } catch (ax.Tc.n e2) {
                            e = e2;
                            e.printStackTrace();
                            return E0(B, E, false);
                        } catch (C1495j e3) {
                            e = e3;
                            e.printStackTrace();
                            return E0(B, E, false);
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            e.printStackTrace();
                            return E0(B, E, false);
                        } catch (IllegalStateException e5) {
                            e = e5;
                            e.printStackTrace();
                            return E0(B, E, false);
                        } catch (NullPointerException e6) {
                            e = e6;
                            e.printStackTrace();
                            return E0(B, E, false);
                        } catch (StringIndexOutOfBoundsException e7) {
                            e = e7;
                            e.printStackTrace();
                            return E0(B, E, false);
                        }
                    }
                    return E0(B, E, false);
                } finally {
                }
            }
        } catch (ax.Tc.n e8) {
            ax.Ha.c.h().d("PARSER ERROR").l(e8).h();
            throw new C1495j(e8);
        } catch (IOException e9) {
            throw s0("FTP listchildren FTPS=" + B0(), e9);
        } catch (IllegalArgumentException e10) {
            throw new C1495j(e10);
        } catch (IllegalStateException e11) {
            throw new C1495j(e11);
        } catch (NullPointerException e12) {
            throw new C1495j(e12);
        } catch (StringIndexOutOfBoundsException e13) {
            throw new C1495j(e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0183, code lost:
    
        if (r7 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0185, code lost:
    
        r7.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047 A[Catch: all -> 0x0029, IOException -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #27 {IOException -> 0x002e, all -> 0x0029, blocks: (B:11:0x0047, B:166:0x0026), top: B:165:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(com.voxdon.xplorer.file.AbstractC3595n r15, ax.c3.G r16, java.lang.String r17, long r18, java.lang.Long r20, com.voxdon.xplorer.file.C3597p r21, boolean r22, ax.u3.InterfaceC3185c r23, ax.g3.i r24) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3598q.D(com.voxdon.xplorer.file.n, ax.c3.G, java.lang.String, long, java.lang.Long, com.voxdon.xplorer.file.p, boolean, ax.u3.c, ax.g3.i):void");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        R0();
        C3184b.a(abstractC3595n2.n());
        try {
            synchronized (this.k) {
                try {
                    long p = abstractC3595n.p();
                    if (!this.j.s1(abstractC3595n.E(), abstractC3595n2.E())) {
                        throw t0("FTP moveFile", this.j.R(), this.j.S(), true);
                    }
                    if (iVar != null) {
                        iVar.a(p, p);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException e2) {
            throw s0("FTP moveFile", e2);
        }
    }

    List<AbstractC3595n> E0(String str, String str2, boolean z) throws IOException, C1495j {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (z) {
            ax.Sc.i[] n1 = this.j.n1();
            int R = this.j.R();
            if (!ax.Sc.t.c(R)) {
                if (R == 425 || R == 426) {
                    I0();
                }
                return null;
            }
            for (ax.Sc.i iVar : n1) {
                if (iVar != null && !d0.C(iVar.b()) && !iVar.b().startsWith("/")) {
                    if (TextUtils.isEmpty(iVar.b().trim())) {
                        ax.Ha.c.h().f().d("FTP EMPTY FILE NAME 1").g("name:" + iVar.b() + ",size:" + iVar.d() + ",dir:" + iVar.g()).h();
                    } else {
                        arrayList.add(new C1811D(this, this.j, iVar, d0.Q(str2, iVar.b()), false));
                    }
                }
            }
        } else {
            ax.Sc.s d1 = this.j.d1(null, null);
            int R2 = this.j.R();
            if (R2 == 425 || R2 == 426) {
                I0();
                throw t0(B0() ? "FTP List data channel: Cannot support session reuse" : "FTP List data channel", R2, this.j.S(), false);
            }
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            while (d1.g()) {
                if (!this.j.w()) {
                    throw new IOException("FTP disconnected while operation");
                }
                ax.Sc.i[] f2 = d1.f(1);
                if (f2.length > 0) {
                    ax.Sc.i iVar2 = f2[0];
                    if (iVar2 != null) {
                        arrayList2.add(iVar2);
                    } else {
                        z2 = true;
                    }
                }
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                ax.Sc.i iVar3 = (ax.Sc.i) arrayList2.get(i3);
                if (iVar3 == null || d0.C(iVar3.b())) {
                    i2 = size;
                } else if (TextUtils.isEmpty(iVar3.b().trim())) {
                    i2 = size;
                    ax.Ha.c.h().f().d("FTP EMPTY FILE NAME 2").g("name:" + iVar3.b() + ",size:" + iVar3.d() + ",dir:" + iVar3.g()).h();
                } else {
                    i2 = size;
                    arrayList.add(new C1811D(this, this.j, iVar3, d0.Q(str2, iVar3.b().trim()), true));
                }
                i3 = i4;
                size = i2;
            }
            if (arrayList.size() == 0) {
                if (C0(R2)) {
                    throw t0("FTP List", R2, this.j.S(), false);
                }
                if (z2) {
                    try {
                        Field declaredField = ax.Sc.s.class.getDeclaredField("a");
                        declaredField.setAccessible(true);
                        List<String> list = (List) declaredField.get(d1);
                        StringBuilder sb = new StringBuilder();
                        if (list != null) {
                            for (String str3 : list) {
                                if (str3 != null && !str3.endsWith(" .") && !str3.endsWith(" ..") && !str3.equals("..") && !str3.equals("\ufeff")) {
                                    sb.append(str3);
                                    sb.append("\n");
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb.toString().trim())) {
                            ax.Ha.c.h().f().b("FTP PARSE ERROR").g(((Object) sb) + ",welcome:" + this.o + ",system:" + this.p).h();
                            throw new C1495j("FTP Parse error");
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (!this.q) {
            D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
            return;
        }
        File Z = abstractC3595n.Z();
        C3596o f2 = C1835x.f(Z);
        AbstractC3595n z = f2.z(Z.getAbsolutePath());
        boolean n = z.n();
        f2.D(z, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, new b(iVar));
        AbstractC3595n z2 = f2.z(Z.getAbsolutePath());
        D(abstractC3595n2, f2.x(z2), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, new c(iVar));
        if (n) {
            return;
        }
        try {
            f2.P(z2);
        } catch (C1495j unused) {
        }
    }

    public ax.Sc.i F0(ax.Sc.e eVar, String str) throws IOException {
        if (!ax.Sc.t.c(eVar.k0(ax.Sc.g.MLST, str))) {
            return null;
        }
        String[] T = eVar.T();
        if (T.length < 2) {
            u.severe("invalid reply : " + eVar.S());
            return null;
        }
        String str2 = T[1];
        if (!str2.startsWith("550")) {
            return H0(str2, str);
        }
        try {
            String X0 = eVar.X0();
            if (eVar.R() == 250) {
                u.severe("Invalid getStatus reply : " + X0);
                eVar.P();
            }
        } catch (IOException unused) {
            I0();
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (!this.q && Z(abstractC3595n)) {
            return AbstractC3594m.S(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j2) throws C1495j {
        ax.Sc.e eVar;
        f fVar;
        e eVar2 = this.l;
        if (eVar2 == null) {
            throw new C1493h("Not connected : ftp");
        }
        try {
            if (this.q) {
                R0();
                eVar = this.j;
            } else {
                try {
                    eVar = eVar2.f();
                    this.r = true;
                } catch (ax.b3.K e2) {
                    if (this.r) {
                        throw new C1495j(e2.getMessage(), e2);
                    }
                    M0(true);
                    R0();
                    eVar = this.j;
                }
            }
            synchronized ((eVar == this.j ? this.k : eVar)) {
                try {
                    if (((h) eVar).c() != 2) {
                        if (eVar.y1(2)) {
                            ((h) eVar).b(2);
                        } else {
                            ((h) eVar).b(0);
                        }
                    }
                    eVar.B1(j2);
                    if (!eVar.w()) {
                        throw new ax.b3.q("FTP client is not connected");
                    }
                    InputStream u1 = eVar.u1(abstractC3595n.E());
                    if (u1 == null) {
                        throw t0("FTP getInputStream", eVar.R(), eVar.S(), true);
                    }
                    fVar = new f(eVar, u1);
                } finally {
                }
            }
            return fVar;
        } catch (IOException e3) {
            throw s0("FTP getinputstream", e3);
        }
    }

    void J0(ax.Sc.e eVar) {
        this.j = eVar;
        this.l = new e();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        try {
            d dVar = this.i;
            if (dVar != null && !dVar.isCancelled()) {
                this.i.e();
            }
            d dVar2 = new d(p(), this, t(), aVar);
            dVar2.i(new Object[0]);
            this.i = dVar2;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (aVar != null) {
                aVar.B();
                aVar.T(false, e2.getMessage());
            }
        }
    }

    public void K0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.m = x();
        } else {
            this.m = str;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        boolean m1;
        R0();
        try {
            synchronized (this.k) {
                m1 = this.j.m1(abstractC3595n.E());
            }
            return m1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    void M0(boolean z) {
        this.q = z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return l(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        R0();
        try {
            synchronized (this.k) {
                try {
                    if (!p0(abstractC3595n.T())) {
                        throw new C1495j("deleteFile - CWD not successful");
                    }
                    if (abstractC3595n.isDirectory()) {
                        if (!this.j.r1(abstractC3595n.B())) {
                            throw t0("FTP deleteFile", this.j.R(), this.j.S(), true);
                        }
                    } else if (!this.j.E0(abstractC3595n.B())) {
                        throw t0("FTP deleteFile", this.j.R(), this.j.S(), true);
                    }
                } finally {
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            throw s0("FTP deleteFile", e2);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean V() {
        return this.t;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        ax.Sc.e eVar = this.j;
        return eVar != null && eVar.w();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        synchronized (this.k) {
            try {
                this.n = null;
                v0(this.j);
                e eVar = this.l;
                if (eVar != null) {
                    eVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.c3.i0
    public boolean d(AbstractC3595n abstractC3595n, long j2) {
        boolean L0;
        if (j2 < 0 || !(abstractC3595n instanceof C1811D)) {
            return false;
        }
        R0();
        synchronized (this.k) {
            L0 = L0(this.j, abstractC3595n, j2, true);
        }
        return L0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean i0() {
        return !this.q;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    synchronized void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        try {
            o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
        } catch (Throwable th) {
            th = th;
            while (true) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public String r() {
        return this.m;
    }

    void u0(String str, String str2) {
        this.o = str;
        this.p = str2;
        this.s = w;
        if (str != null) {
            if (str.contains("FileZilla Server")) {
                this.s = x;
                return;
            }
            if (str.contains("ESP8266")) {
                this.s = y;
                M0(true);
            } else if (str.contains("lima-city.de")) {
                this.t = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #8 {all -> 0x0014, blocks: (B:33:0x000c, B:12:0x0091, B:15:0x00c1, B:16:0x00ca, B:28:0x00a5, B:31:0x00ba, B:42:0x001f, B:38:0x0023, B:40:0x002e, B:36:0x006c), top: B:8:0x000a, inners: #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1 A[Catch: all -> 0x0014, TryCatch #8 {all -> 0x0014, blocks: (B:33:0x000c, B:12:0x0091, B:15:0x00c1, B:16:0x00ca, B:28:0x00a5, B:31:0x00ba, B:42:0x001f, B:38:0x0023, B:40:0x002e, B:36:0x006c), top: B:8:0x000a, inners: #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[Catch: all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x00db, blocks: (B:7:0x0006, B:20:0x00cc, B:26:0x0097, B:29:0x00b0), top: B:6:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x00db, blocks: (B:7:0x0006, B:20:0x00cc, B:26:0x0097, B:29:0x00b0), top: B:6:0x0006 }] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.voxdon.xplorer.file.AbstractC3595n z(java.lang.String r9) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3598q.z(java.lang.String):com.voxdon.xplorer.file.n");
    }

    /* renamed from: com.voxdon.xplorer.file.q$j */
    static class j extends ax.Sc.u implements h {
        int A0;
        Object B0;
        Object C0;
        int D0;
        private int w0;
        String x0;
        boolean y0;
        int z0;

        j(boolean z, int i) {
            super(z);
            this.D0 = i;
        }

        private boolean T1(Socket socket) {
            if (Build.VERSION.SDK_INT <= 28) {
                return true;
            }
            if (socket == null) {
                return false;
            }
            String name = ((SSLSocket) socket).getSession().getClass().getName();
            if ("com.android.org.conscrypt.Java8ExtendedSSLSession".equals(name)) {
                return false;
            }
            if ("com.google.android.gms.org.conscrypt.Java8ExtendedSSLSession".equals(name)) {
                return true;
            }
            C3184b.e("new session class detected");
            return name.contains("gms");
        }

        private void U1(SSLContext sSLContext) {
            try {
                Socket createSocket = sSLContext.getSocketFactory().createSocket();
                if (T1(createSocket)) {
                    this.w0 = 1;
                } else {
                    this.w0 = 2;
                }
                createSocket.close();
            } catch (IOException unused) {
            }
        }

        private boolean V1(SSLSocket sSLSocket) {
            Object obj;
            Socket socket = this.b;
            if (socket == null) {
                return false;
            }
            SSLSession session = ((SSLSocket) socket).getSession();
            if (!session.isValid()) {
                return false;
            }
            SSLSessionContext sessionContext = session.getSessionContext();
            try {
                Field declaredField = sessionContext.getClass().getDeclaredField("sessionsByHostAndPort");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(sessionContext);
                int peerPort = session.getPeerPort();
                Set keySet = ((HashMap) obj2).keySet();
                if (keySet.size() == 0) {
                    C3598q.u.severe("invalid SSL session 1");
                    return false;
                }
                Field declaredField2 = keySet.toArray()[0].getClass().getDeclaredField("port");
                declaredField2.setAccessible(true);
                int i = 0;
                while (i < keySet.size() && ((Integer) declaredField2.get(keySet.toArray()[i])).intValue() != peerPort) {
                    i++;
                }
                int size = keySet.size();
                Class<?> cls = Integer.TYPE;
                if (i >= size) {
                    if (this.B0 == null || (obj = this.C0) == null) {
                        C3598q.u.severe("invalid SSL session 2");
                        return false;
                    }
                    Constructor<?> declaredConstructor = obj.getClass().getDeclaredConstructor(String.class, cls);
                    declaredConstructor.setAccessible(true);
                    Object newInstance = declaredConstructor.newInstance(sSLSocket.getInetAddress().getHostName(), Integer.valueOf(sSLSocket.getPort()));
                    Object newInstance2 = declaredConstructor.newInstance(sSLSocket.getInetAddress().getHostAddress(), Integer.valueOf(sSLSocket.getPort()));
                    Method declaredMethod = obj2.getClass().getDeclaredMethod("put", Object.class, Object.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj2, newInstance, this.B0);
                    declaredMethod.invoke(obj2, newInstance2, this.B0);
                    return true;
                }
                Object obj3 = keySet.toArray()[i];
                Constructor<?> declaredConstructor2 = obj3.getClass().getDeclaredConstructor(String.class, cls);
                declaredConstructor2.setAccessible(true);
                Object newInstance3 = declaredConstructor2.newInstance(sSLSocket.getInetAddress().getHostName(), Integer.valueOf(sSLSocket.getPort()));
                Object newInstance4 = declaredConstructor2.newInstance(sSLSocket.getInetAddress().getHostAddress(), Integer.valueOf(sSLSocket.getPort()));
                Object obj4 = ((HashMap) obj2).get(obj3);
                if (obj4 instanceof ArrayList) {
                    this.C0 = obj3;
                    this.B0 = new ArrayList((ArrayList) obj4);
                }
                Method declaredMethod2 = obj2.getClass().getDeclaredMethod("put", Object.class, Object.class);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(obj2, newInstance3, obj4);
                declaredMethod2.invoke(obj2, newInstance4, obj4);
                return true;
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
                C3598q.u.severe("This device is not supported!!!! : api " + Build.VERSION.SDK_INT);
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                C3598q.u.severe("Session reuse : unknown exception");
                e2.printStackTrace();
                return false;
            }
        }

        private boolean W1() {
            return this.w0 == 2;
        }

        private boolean X1() {
            return this.w0 == 1;
        }

        @Override // ax.Sc.u
        protected void E1(Socket socket) throws IOException {
            int i;
            if (socket == null) {
                return;
            }
            if ((socket instanceof SSLSocket) && X1()) {
                V1((SSLSocket) socket);
            }
            if (socket.getSendBufferSize() > 1048576) {
                socket.setSendBufferSize(524288);
            }
            if (!this.y0 || (i = this.z0) <= 0) {
                return;
            }
            socket.setSoLinger(true, i);
        }

        @Override // ax.Sc.u
        protected Socket I1() throws IOException {
            return W1() ? new C1822j(new Socket()) : super.I1();
        }

        @Override // ax.Sc.u
        protected void J1() throws IOException {
            if (R() == 220) {
                this.x0 = S();
            }
            super.J1();
        }

        @Override // ax.Sc.e
        public String Q0() {
            String str = this.c;
            return str != null ? str : super.Q0();
        }

        @Override // ax.Sc.u
        protected Socket Q1(String str, String str2) throws IOException {
            Socket Q1 = super.Q1(str, str2);
            if (!W1() || !(Q1 instanceof C1822j) || N1() == null) {
                return Q1;
            }
            C1821i c1821i = new C1821i((SSLSocket) N1().getSocketFactory().createSocket(Q1, this.c, this.D0, true), Q1);
            c1821i.a(this.D0);
            return c1821i;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void a(int i) {
            this.y0 = true;
            this.z0 = i;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void b(int i) {
            this.A0 = i;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public int c() {
            return this.A0;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public String d() {
            return this.x0;
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public boolean e() {
            try {
                E();
                return true;
            } catch (SocketTimeoutException | IOException unused) {
                return false;
            }
        }

        @Override // com.voxdon.xplorer.file.C3598q.h
        public void g() throws IOException {
            if (Z0("UTF8") || Z0("UTF-8")) {
                m0("UTF-8");
                this.x = new ax.Uc.a(new InputStreamReader(this.b.getInputStream(), O()));
                this.y = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream(), O()));
            }
        }

        @Override // ax.Sc.u, ax.Sc.e
        protected Socket v0(String str, String str2) throws IOException {
            Socket v0 = super.v0(str, str2);
            if (W1() && (v0 instanceof C1821i)) {
                ((C1821i) v0).a(0);
            }
            return v0;
        }

        j(boolean z, SSLContext sSLContext, int i) {
            super(z, sSLContext);
            this.D0 = i;
            U1(sSLContext);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.q$d */
    private static class d extends AbstractC3199q<Object, Void, Boolean> {
        InterfaceC3584c.a h;
        String i;
        int j;
        String k;
        String l;
        boolean m;
        boolean n;
        boolean o;
        ax.Sc.e p;
        boolean q;
        String r;
        String s;
        C3598q t;
        ax.Z2.o u;
        String v;
        boolean w;
        Context x;

        public d(Context context, C3598q c3598q, int i, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.x = context;
            this.t = c3598q;
            this.h = aVar;
            this.q = false;
            ax.Z2.o k = C3598q.z0(context).k(i);
            if (k != null) {
                E(k);
                return;
            }
            throw new IllegalArgumentException("No remote info for index : " + i);
        }

        private SSLContext A() {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, new TrustManager[]{ax.Vc.g.a()}, null);
                return sSLContext;
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private void E(ax.Z2.o oVar) {
            this.i = oVar.d();
            this.j = oVar.h();
            this.k = oVar.k();
            this.l = oVar.g();
            this.r = oVar.f();
            this.m = oVar.m();
            this.n = oVar.o();
            this.o = oVar.n();
            this.s = oVar.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x00db A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:22:0x00ac, B:24:0x00b5, B:26:0x00b8, B:29:0x00c0, B:31:0x00c3, B:35:0x00ca, B:39:0x00d3, B:40:0x00e4, B:42:0x00f0, B:105:0x00db), top: B:21:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d3 A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:22:0x00ac, B:24:0x00b5, B:26:0x00b8, B:29:0x00c0, B:31:0x00c3, B:35:0x00ca, B:39:0x00d3, B:40:0x00e4, B:42:0x00f0, B:105:0x00db), top: B:21:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f0 A[Catch: Exception -> 0x00cd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cd, blocks: (B:22:0x00ac, B:24:0x00b5, B:26:0x00b8, B:29:0x00c0, B:31:0x00c3, B:35:0x00ca, B:39:0x00d3, B:40:0x00e4, B:42:0x00f0, B:105:0x00db), top: B:21:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean w(boolean r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 668
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3598q.d.w(boolean, boolean):boolean");
        }

        boolean B() {
            return this.w;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.h != null) {
                if (!bool.booleanValue()) {
                    C3598q c3598q = this.t;
                    if (c3598q != null && C3598q.D0(c3598q.t())) {
                        C3598q.z0(this.x).m(this.t.t());
                    }
                    this.h.T(bool.booleanValue(), this.v);
                    return;
                }
                C3598q c3598q2 = this.t;
                if (c3598q2 != null && C3598q.D0(c3598q2.t())) {
                    C3598q.z0(this.x).t(this.t.t());
                }
                if (!TextUtils.isEmpty(this.r)) {
                    this.r = d0.U(this.r);
                }
                this.h.T(bool.booleanValue(), this.r);
            }
        }

        String D(String str) {
            int indexOf = str.indexOf("\"");
            if (indexOf < 0) {
                return str;
            }
            try {
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (int i = indexOf + 1; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != '\"') {
                        if (z) {
                            return sb.toString();
                        }
                        sb.append(charAt);
                    } else if (z) {
                        sb.append(charAt);
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return z ? sb.toString() : str;
            } catch (IndexOutOfBoundsException unused) {
                return str;
            }
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
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Boolean g(Object... objArr) {
            C3598q c3598q = this.t;
            if (c3598q != null) {
                c3598q.i();
            }
            try {
                if (this.q && !this.n) {
                    if (w(true, true) && this.u != null) {
                        C3598q.u.fine("FTPS detected!!!");
                        this.u.C(true);
                        return Boolean.TRUE;
                    }
                    C3598q.u.fine("FTPS not detected, try FTP");
                }
                Boolean valueOf = Boolean.valueOf(w(this.n, false));
                C3598q c3598q2 = this.t;
                if (c3598q2 != null) {
                    c3598q2.j();
                }
                return valueOf;
            } finally {
                C3598q c3598q3 = this.t;
                if (c3598q3 != null) {
                    c3598q3.j();
                }
            }
        }

        String y() {
            return this.v;
        }

        public ax.Sc.e z() {
            return this.p;
        }

        public d(Context context, ax.Z2.o oVar, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.x = context;
            this.h = aVar;
            this.q = true;
            this.u = oVar;
            E(oVar);
        }
    }
}

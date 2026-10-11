package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.i0;
import ax.c3.k0;
import ax.i9.C2291c;
import ax.jb.C2346b;
import ax.l3.AbstractC2465a;
import ax.nb.C2644g;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Q extends AbstractC3594m implements i0 {
    public static final String n = null;
    private static final Logger o = Logger.getLogger("FileManager.SmbFileHelper");
    private static b p;
    private P h;
    private boolean i;
    private String j;
    S k;
    N l;
    O m;

    public static class b extends g0 {
        Context a;
        c0 b = new c0(ax.Q2.f.J0);

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
                this.a.b(ax.Q2.f.J0);
            }

            @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
            public void T(boolean z, Object obj) {
                if (!z) {
                    this.a.a(ax.Q2.f.J0, this.c.d(), this.c.h(), this.c.k(), obj instanceof String ? (String) obj : null);
                    return;
                }
                b.this.o(this.b, this.c);
                ax.Q2.f fVar = ax.Q2.f.J0;
                C3596o d = C1835x.d(fVar, this.b);
                if (d.a()) {
                    ((Q) d.u()).C0(false);
                    ((Q) d.u()).q0();
                    ax.Z2.b.k().s(d.T(), d.V());
                }
                this.a.c(fVar, this.b);
            }
        }

        b(Context context) {
            this.a = context;
        }

        @Override // com.voxdon.xplorer.file.T
        public void a(int i) {
            this.a.getSharedPreferences("SMBPrefs", 0).edit().remove("version_" + i).remove("name_" + i).remove("domain_" + i).remove("host_" + i).remove("port_" + i).remove("username_" + i).remove("password_" + i).remove("initialPath_" + i).remove("created_" + i).remove("sortindex_" + i).remove("protocol_" + i).remove("lastResolvedIp_" + i).remove("hostConcatDomain_" + i).commit();
        }

        @Override // com.voxdon.xplorer.file.T
        public ax.Z2.s f(int i) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SMBPrefs", 0);
            return new ax.Z2.s(ax.Q2.f.J0, i, sharedPreferences.getString("name_" + i, null), sharedPreferences.getString("username_" + i, "anonymous"), sharedPreferences.getString("host_" + i, null), sharedPreferences.getString("initialPath_" + i, null), sharedPreferences.getLong("created_" + i, 0L), sharedPreferences.getLong("sortindex_" + i, 0L));
        }

        @Override // com.voxdon.xplorer.file.T
        public void j(int i, long j) {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("SMBPrefs", 0).edit();
            edit.putLong("sortindex_" + i, j);
            edit.apply();
        }

        @Override // ax.c3.g0
        public ax.Z2.o k(int i) {
            ax.Z2.o oVar = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SMBPrefs", 0);
            int i2 = sharedPreferences.getInt("version_" + i, 0);
            oVar.r(sharedPreferences.getString("domain_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            String string = sharedPreferences.getString("host_" + i, HttpUrl.FRAGMENT_ENCODE_SET);
            oVar.s(string);
            oVar.z(sharedPreferences.getInt("port_" + i, 0));
            oVar.D(sharedPreferences.getString("username_" + i, "anonymous"));
            oVar.y(this.b.a(i2, string, sharedPreferences.getString("password_" + i, HttpUrl.FRAGMENT_ENCODE_SET)));
            oVar.v(sharedPreferences.getString("initialPath_" + i, null));
            oVar.q(sharedPreferences.getString("name_" + i, HttpUrl.FRAGMENT_ENCODE_SET));
            oVar.B(sharedPreferences.getString("protocol_" + i, Q.n));
            return oVar;
        }

        @Override // ax.c3.g0
        public void l(int i, ax.Z2.o oVar, ax.g3.k kVar, boolean z) {
            if (i == -100) {
                i = m();
            }
            if (z) {
                new a(this.a, oVar, new a(kVar, i, oVar)).i(new String[0]);
            } else {
                o(i, oVar);
                kVar.c(ax.Q2.f.J0, i);
            }
        }

        int m() {
            return this.a.getSharedPreferences("SMBPrefs", 0).getInt("count", 0);
        }

        public List<ax.Z2.s> n() {
            ArrayList arrayList = new ArrayList();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SMBPrefs", 0);
            int i = sharedPreferences.getInt("count", 0);
            for (int i2 = 0; i2 < i; i2++) {
                if (sharedPreferences.getString("host_" + i2, null) != null) {
                    arrayList.add(f(i2));
                }
            }
            return arrayList;
        }

        void o(int i, ax.Z2.o oVar) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SMBPrefs", 0);
            boolean z = i >= sharedPreferences.getInt("count", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("version_" + i, 3).putString("domain_" + i, oVar.c()).putString("host_" + i, oVar.d()).putString("username_" + i, oVar.k()).putString("password_" + i, this.b.e(oVar.d(), oVar.g())).putString("initialPath_" + i, oVar.f()).putString("protocol_" + i, oVar.j()).putString("name_" + i, oVar.b());
            if (oVar.h() > 0) {
                edit.putInt("port_" + i, oVar.h());
            } else {
                edit.remove("port_" + i);
            }
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

    public enum c {
        SMB1,
        SMB1AND2,
        SMB2AND3
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0() {
        return p().getSharedPreferences("SMBPrefs", 0).getBoolean("hostConcatDomain_" + t(), false);
    }

    public static boolean B0(String str) {
        return !"/".equals(str) && str.startsWith("/") && str.indexOf("/", 1) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(boolean z) {
        SharedPreferences.Editor edit = p().getSharedPreferences("SMBPrefs", 0).edit();
        edit.putBoolean("hostConcatDomain_" + t(), z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(String str) {
        SharedPreferences.Editor edit = p().getSharedPreferences("SMBPrefs", 0).edit();
        edit.putString("lastResolvedIp_" + t(), str);
        edit.apply();
    }

    private boolean H0() {
        c cVar = this.h.a;
        return cVar == c.SMB1 || cVar == c.SMB1AND2;
    }

    private boolean I0() {
        c cVar = this.h.a;
        return cVar == c.SMB2AND3 || cVar == c.SMB1AND2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J0(com.voxdon.xplorer.file.AbstractC3595n r9, ax.c3.G r10, long r11, java.lang.Long r13, boolean r14, ax.u3.InterfaceC3185c r15, ax.g3.i r16) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            r8 = this;
            r1 = 0
            boolean r0 = r8.H0()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L14
            if (r0 == 0) goto L18
            com.voxdon.xplorer.file.N r0 = r8.l     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L14
            java.io.OutputStream r14 = r0.h(r9, r14)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L14
        Ld:
            r3 = r14
            goto L1f
        Lf:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L8e
        L14:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L56
        L18:
            com.voxdon.xplorer.file.O r0 = r8.m     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L14
            java.io.OutputStream r14 = r0.q(r9, r14)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L14
            goto Ld
        L1f:
            java.io.InputStream r2 = r10.b()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
            r4 = r11
            r6 = r15
            r7 = r16
            ax.c3.F.c(r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L30
            goto L35
        L30:
            r0 = move-exception
            r10 = r0
            r10.printStackTrace()
        L35:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3b
            goto L3c
        L3b:
        L3c:
            if (r13 == 0) goto L45
            long r10 = r13.longValue()
            r8.d(r9, r10)
        L45:
            return
        L46:
            r0 = move-exception
            r9 = r0
        L48:
            r1 = r3
            goto L8e
        L4a:
            r0 = move-exception
            r9 = r0
        L4c:
            r1 = r3
            goto L56
        L4e:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L48
        L52:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L4c
        L56:
            boolean r10 = r9 instanceof ax.pb.C2794a0     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L74
            java.lang.String r10 = "smb1 writeFile"
            r11 = r9
            ax.pb.a0 r11 = (ax.pb.C2794a0) r11     // Catch: java.lang.Throwable -> L71
            ax.b3.j r10 = com.voxdon.xplorer.file.N.a(r10, r11)     // Catch: java.lang.Throwable -> L71
            java.lang.Class<ax.b3.j> r11 = ax.b3.C1495j.class
            java.lang.Class r12 = r10.getClass()     // Catch: java.lang.Throwable -> L71
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L70
            goto L74
        L70:
            throw r10     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            r9 = r0
            goto L8e
        L74:
            boolean r10 = r8.H0()     // Catch: java.lang.Throwable -> L71
            if (r10 != 0) goto L87
            java.lang.Throwable r10 = r9.getCause()     // Catch: java.lang.Throwable -> L71
            boolean r10 = r10 instanceof ax.Q8.F     // Catch: java.lang.Throwable -> L71
            if (r10 == 0) goto L87
            ax.b3.j r9 = com.voxdon.xplorer.file.O.g(r9)     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        L87:
            java.lang.String r10 = "smb write file"
            ax.b3.j r9 = r8.p0(r10, r9)     // Catch: java.lang.Throwable -> L71
            throw r9     // Catch: java.lang.Throwable -> L71
        L8e:
            if (r1 == 0) goto L99
            r1.close()     // Catch: java.io.IOException -> L94
            goto L99
        L94:
            r0 = move-exception
            r10 = r0
            r10.printStackTrace()
        L99:
            if (r2 == 0) goto L9e
            r2.close()     // Catch: java.io.IOException -> L9e
        L9e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Q.J0(com.voxdon.xplorer.file.n, ax.c3.G, long, java.lang.Long, boolean, ax.u3.c, ax.g3.i):void");
    }

    private C1495j p0(String str, IOException iOException) {
        Throwable cause = iOException.getCause();
        while (cause != null) {
            if (cause instanceof TimeoutException) {
                return new ax.b3.q(str, iOException);
            }
            cause = cause != cause.getCause() ? cause.getCause() : null;
        }
        return C1489d.b(str, iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        O o2 = this.m;
        if (o2 != null) {
            o2.l();
        }
    }

    public static b t0(Context context) {
        if (p == null) {
            p = new b(context.getApplicationContext());
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String v0() {
        return p().getSharedPreferences("SMBPrefs", 0).getString("lastResolvedIp_" + t(), null);
    }

    private static String w0(String str) {
        int indexOf = str.indexOf("/", 1);
        return indexOf == -1 ? str.substring(1) : str.substring(1, indexOf);
    }

    static String z0(String str, String str2) {
        return str + str2;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        return w(str, str2);
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
        return H0() ? this.l.n(abstractC3595n) : this.m.w(abstractC3595n);
    }

    void C0(boolean z) {
        this.i = z;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.a(abstractC3595n.n());
        J0(abstractC3595n, g, j, l, false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        long p2 = abstractC3595n.p();
        if (H0()) {
            this.l.o(abstractC3595n, abstractC3595n2);
        } else {
            this.m.x(abstractC3595n, abstractC3595n2);
        }
        if (iVar != null) {
            iVar.a(p2, p2);
        }
    }

    public void E0(String str) {
        if (TextUtils.isEmpty(str)) {
            this.j = x();
            this.k = null;
        } else {
            this.j = str;
            this.k = null;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    void G0(P p2) {
        C0(true);
        this.h = p2;
        c cVar = p2.a;
        if (cVar == c.SMB1 || cVar == c.SMB1AND2) {
            this.l.q(p2.c, p2.d);
        }
        O o2 = this.m;
        if (o2 != null) {
            o2.F(p2.h, p2.g, p2.i);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (Z(abstractC3595n)) {
            return AbstractC3594m.S(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        if (x0() == null) {
            throw new C1493h("Not connected to server");
        }
        if (!I0()) {
            return this.l.f(abstractC3595n, j);
        }
        try {
            return this.m.p(abstractC3595n, j);
        } catch (C1495j e) {
            if (H0()) {
                return this.l.f(abstractC3595n, j);
            }
            throw e;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        try {
            new a(p(), this, aVar, t()).i(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
            if (aVar != null) {
                aVar.B();
                aVar.T(false, e.getMessage());
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        return H0() ? this.l.c(abstractC3595n) : this.m.i(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        return H0() ? this.l.b(abstractC3595n) : this.m.h(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        if (H0()) {
            this.l.d(abstractC3595n);
        } else {
            this.m.k(abstractC3595n);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        ax.Q2.f P = abstractC3595n.P();
        ax.Q2.f fVar = ax.Q2.f.J0;
        if (P == fVar && abstractC3595n2.P() == fVar) {
            String T = abstractC3595n.T();
            String T2 = abstractC3595n2.T();
            if (!"/".equals(T) && !"/".equals(T2)) {
                return w0(T).equals(w0(T2));
            }
        }
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void W(Context context, ax.c3.K k) {
        super.W(context, k);
        this.l = new N(this);
        if (ax.X2.Q.i()) {
            this.m = new O(this);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.i;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean a0(AbstractC3595n abstractC3595n) {
        return (abstractC3595n == null || d0.E(abstractC3595n)) ? false : true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        C0(false);
        q0();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean c0() {
        return false;
    }

    @Override // ax.c3.i0
    public boolean d(AbstractC3595n abstractC3595n, long j) {
        if (j < 0 || !(abstractC3595n instanceof S)) {
            return false;
        }
        try {
            if (H0()) {
                this.l.p(abstractC3595n, j);
                return true;
            }
            this.m.E(abstractC3595n, j);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public AbstractC2465a e0(String str, int i) throws C1495j {
        if (!a()) {
            throw new C1493h("Not connected to server");
        }
        if (!H0()) {
            return this.m.D(str, i);
        }
        C3184b.g("SMB1 does not support proxy file :" + this.h.a + "," + d0.f(str));
        throw new ax.b3.t("SMB1 does not support proxy file.");
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean g0() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean h0() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        J0(abstractC3595n, g, j, l, true, interfaceC3185c, iVar);
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
        return this.j;
    }

    String r0() {
        return this.h.d;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public S z(String str) throws C1495j {
        S s;
        if (str == null) {
            ax.Ha.c.h().d("SMBGFI!!!:").j().g("smbtype:" + this.h.a.name()).h();
        }
        boolean equals = str.equals(this.j);
        if (equals && (s = this.k) != null) {
            return s;
        }
        if (x0() != null) {
            S e = H0() ? this.l.e(str) : this.m.o(str);
            if (equals) {
                this.k = e;
            }
            return e;
        }
        String f = d0.f(str);
        ax.Ha.c.h().f().b("NOT CONNECT CALL GET FILE INFO").j().g("ext:" + f).h();
        throw new C1493h("Not connected to server");
    }

    public k0 u0(AbstractC3595n abstractC3595n) throws C1495j {
        return H0() ? this.l.i(abstractC3595n) : this.m.s(abstractC3595n);
    }

    P x0() {
        return this.h;
    }

    String y0(String str) {
        return z0(r0(), str);
    }

    private static class a extends AbstractC3199q<String, Void, Boolean> {
        Context h;
        WifiManager i;
        String j;
        String k;
        int l;
        String m;
        String n;
        InterfaceC3584c.a o;
        Q p;
        String q;
        String r;
        String s;

        public a(Context context, Q q, InterfaceC3584c.a aVar, int i) {
            super(AbstractC3199q.e.CONNECT);
            this.h = context;
            this.p = q;
            this.o = aVar;
            E(Q.t0(context).k(i));
            this.i = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }

        private C2346b C(Q q, String str, String str2) throws UnknownHostException {
            String str3;
            DhcpInfo dhcpInfo;
            WifiManager wifiManager = this.i;
            boolean z = wifiManager == null || wifiManager.getWifiState() != 3 || (dhcpInfo = this.i.getDhcpInfo()) == null || dhcpInfo.ipAddress == 0 || z(dhcpInfo.dns1);
            C2644g.A(str);
            C2346b.l(z);
            if (TextUtils.isEmpty(str2)) {
                return D(str, true);
            }
            if (q == null || !q.A0()) {
                str3 = str + "." + str2;
            } else {
                str3 = str;
                str = str + "." + str2;
            }
            try {
                return D(str, true);
            } catch (UnknownHostException unused) {
                C2346b D = D(str3, true);
                if (q != null) {
                    q.D0(!q.A0());
                }
                return D;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private ax.jb.C2346b D(java.lang.String r12, boolean r13) throws java.net.UnknownHostException {
            /*
                r11 = this;
                ax.jb.b[] r12 = ax.jb.C2346b.c(r12, r13)
                int r13 = r12.length
                if (r13 == 0) goto L93
                int r13 = r12.length
                r0 = 1
                r1 = 0
                if (r13 <= r0) goto L90
                android.content.Context r13 = r11.h
                byte[] r13 = ax.i3.C2265a.f(r13)
                int r2 = r13.length
                r3 = 4
                if (r2 < r3) goto L2d
                r2 = r13[r1]
                if (r2 == 0) goto L2d
                java.net.InetAddress r2 = java.net.InetAddress.getByAddress(r13)
                boolean r4 = r2.isAnyLocalAddress()
                if (r4 != 0) goto L2d
                boolean r2 = r2.isLoopbackAddress()
                if (r2 == 0) goto L2b
                goto L2d
            L2b:
                r2 = 1
                goto L2e
            L2d:
                r2 = 0
            L2e:
                int r4 = r12.length
                int r4 = r4 - r0
                r5 = 0
                r6 = r5
            L32:
                if (r4 < 0) goto L8a
                r7 = r12[r4]
                if (r7 == 0) goto L87
                java.lang.Object r8 = r7.b()
                boolean r8 = r8 instanceof java.net.Inet6Address
                if (r8 == 0) goto L41
                goto L87
            L41:
                java.lang.Object r8 = r7.b()
                if (r5 != 0) goto L64
                boolean r9 = r8 instanceof ax.nb.C2644g
                if (r9 == 0) goto L63
                r9 = r8
                ax.nb.g r9 = (ax.nb.C2644g) r9
                java.net.InetAddress r9 = r9.s()
                boolean r10 = r9.isLoopbackAddress()
                if (r10 == 0) goto L59
                goto L87
            L59:
                boolean r9 = r9.isLinkLocalAddress()
                if (r9 == 0) goto L63
                if (r6 != 0) goto L64
                r6 = r7
                goto L64
            L63:
                r5 = r7
            L64:
                if (r2 == 0) goto L87
                boolean r9 = r8 instanceof ax.nb.C2644g
                if (r9 == 0) goto L87
                ax.nb.g r8 = (ax.nb.C2644g) r8
                byte[] r8 = r8.h()
                int r9 = r8.length
                if (r9 < r3) goto L87
                r9 = r8[r1]
                r10 = r13[r1]
                if (r9 != r10) goto L87
                r9 = r8[r0]
                r10 = r13[r0]
                if (r9 != r10) goto L87
                r9 = 2
                r8 = r8[r9]
                r9 = r13[r9]
                if (r8 != r9) goto L87
                return r7
            L87:
                int r4 = r4 + (-1)
                goto L32
            L8a:
                if (r5 == 0) goto L8d
                return r5
            L8d:
                if (r6 == 0) goto L90
                return r6
            L90:
                r12 = r12[r1]
                return r12
            L93:
                ax.u3.C3184b.f()
                java.net.UnknownHostException r12 = new java.net.UnknownHostException
                java.lang.String r13 = "No matched ip address"
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Q.a.D(java.lang.String, boolean):ax.jb.b");
        }

        private void E(ax.Z2.o oVar) {
            this.j = oVar.c();
            this.k = oVar.d();
            this.l = oVar.h();
            this.m = oVar.k();
            this.n = oVar.g();
            this.q = oVar.f();
            this.r = oVar.j();
        }

        private P F(c cVar, C2291c c2291c, boolean z, C2346b c2346b, String str) throws ax.b3.L {
            P G = G(cVar, c2291c, z, c2346b, str, this.l, "?", "GUEST", HttpUrl.FRAGMENT_ENCODE_SET);
            if (G != null) {
                return G;
            }
            P G2 = G(cVar, c2291c, z, c2346b, str, this.l, "?", "Guest", HttpUrl.FRAGMENT_ENCODE_SET);
            if (G2 != null) {
                return G2;
            }
            P G3 = G(cVar, c2291c, z, c2346b, str, this.l, "?", "guest", HttpUrl.FRAGMENT_ENCODE_SET);
            return G3 == null ? G(cVar, c2291c, z, c2346b, str, this.l, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) : G3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0114 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: IOException -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0073, blocks: (B:55:0x006b, B:56:0x006f, B:66:0x0094, B:61:0x00bb), top: B:40:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.voxdon.xplorer.file.P G(com.voxdon.xplorer.file.Q.c r5, ax.i9.C2291c r6, boolean r7, ax.jb.C2346b r8, java.lang.String r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws ax.b3.L {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Q.a.G(com.voxdon.xplorer.file.Q$c, ax.i9.c, boolean, ax.jb.b, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):com.voxdon.xplorer.file.P");
        }

        private P H(c cVar, C2291c c2291c, boolean z, C2346b c2346b, String str, String str2) throws ax.b3.L {
            String str3;
            boolean z2;
            String str4 = this.m.length() > 0 ? this.m : null;
            String str5 = this.n.length() > 0 ? this.n : null;
            if (this.j.length() > 0) {
                str3 = this.j;
                z2 = false;
            } else {
                str3 = str2;
                z2 = true;
            }
            P G = G(cVar, c2291c, z, c2346b, str, this.l, str3, str4, str5);
            return (G == null && z2) ? G(cVar, c2291c, z, c2346b, str, this.l, null, str4, str5) : G;
        }

        private void w(String str) {
            if (this.s == null) {
                this.s = str;
                return;
            }
            this.s += "," + str;
        }

        /* JADX WARN: Removed duplicated region for block: B:136:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0229 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0213 A[Catch: L | d | IOException | IllegalArgumentException -> 0x021b, TryCatch #13 {L | d | IOException | IllegalArgumentException -> 0x021b, blocks: (B:30:0x0207, B:32:0x0213, B:35:0x021d), top: B:29:0x0207 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x021d A[Catch: L | d | IOException | IllegalArgumentException -> 0x021b, TRY_LEAVE, TryCatch #13 {L | d | IOException | IllegalArgumentException -> 0x021b, blocks: (B:30:0x0207, B:32:0x0213, B:35:0x021d), top: B:29:0x0207 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x01e2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.voxdon.xplorer.file.P x(java.lang.String r17, java.lang.String r18, java.lang.String r19, ax.jb.C2346b r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 570
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Q.a.x(java.lang.String, java.lang.String, java.lang.String, ax.jb.b, boolean):com.voxdon.xplorer.file.P");
        }

        public boolean A(ax.Q8.g gVar) {
            return gVar == ax.Q8.g.SMB_2_1 || gVar == ax.Q8.g.SMB_2_0_2 || gVar == ax.Q8.g.SMB_2XX;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (this.o != null) {
                if (!bool.booleanValue()) {
                    this.o.T(false, this.s);
                    return;
                }
                if (!TextUtils.isEmpty(this.q)) {
                    this.q = d0.U(this.q);
                }
                this.o.T(true, this.q);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            InterfaceC3584c.a aVar = this.o;
            if (aVar != null) {
                aVar.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't wrap try/catch for region: R(22:4|5|(3:110|111|(19:113|8|9|(2:11|12)(1:109)|13|14|15|16|(2:18|(1:22))(1:95)|23|24|25|(1:27)(2:87|(1:89)(8:90|91|92|(2:83|84)|30|31|(3:33|(1:35)|36)(3:72|73|74)|(4:38|39|(1:41)|42)(10:44|(6:58|59|60|(1:62)(1:69)|63|(1:67))|46|(1:48)(1:57)|49|(1:51)|52|53|(1:55)|56)))|28|(0)|30|31|(0)(0)|(0)(0)))|7|8|9|(0)(0)|13|14|15|16|(0)(0)|23|24|25|(0)(0)|28|(0)|30|31|(0)(0)|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(1:3)|4|5|(3:110|111|(19:113|8|9|(2:11|12)(1:109)|13|14|15|16|(2:18|(1:22))(1:95)|23|24|25|(1:27)(2:87|(1:89)(8:90|91|92|(2:83|84)|30|31|(3:33|(1:35)|36)(3:72|73|74)|(4:38|39|(1:41)|42)(10:44|(6:58|59|60|(1:62)(1:69)|63|(1:67))|46|(1:48)(1:57)|49|(1:51)|52|53|(1:55)|56)))|28|(0)|30|31|(0)(0)|(0)(0)))|7|8|9|(0)(0)|13|14|15|16|(0)(0)|23|24|25|(0)(0)|28|(0)|30|31|(0)(0)|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x006c, code lost:
        
            if (android.text.TextUtils.isEmpty(r2) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x006e, code lost:
        
            r0.printStackTrace();
            w("Unknown Host : " + r0.getMessage());
            r10 = java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x008b, code lost:
        
            r0 = r9.p;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x008d, code lost:
        
            if (r0 != null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x008f, code lost:
        
            r0.j();
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0092, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0066, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0067, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0060, code lost:
        
            if (android.text.TextUtils.isEmpty(r0) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x005a, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:111:0x001a, B:11:0x002f, B:14:0x0036, B:16:0x0040, B:18:0x004a, B:20:0x004e, B:22:0x0054, B:27:0x0099, B:84:0x00b0, B:33:0x00b9, B:35:0x00c2, B:89:0x00a3, B:91:0x00a6, B:95:0x005c, B:101:0x006e), top: B:110:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x0024, UnknownHostException -> 0x005a, TryCatch #0 {UnknownHostException -> 0x005a, blocks: (B:16:0x0040, B:18:0x004a, B:20:0x004e, B:22:0x0054, B:95:0x005c), top: B:15:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: all -> 0x0024, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:111:0x001a, B:11:0x002f, B:14:0x0036, B:16:0x0040, B:18:0x004a, B:20:0x004e, B:22:0x0054, B:27:0x0099, B:84:0x00b0, B:33:0x00b9, B:35:0x00c2, B:89:0x00a3, B:91:0x00a6, B:95:0x005c, B:101:0x006e), top: B:110:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #1 {all -> 0x0024, blocks: (B:111:0x001a, B:11:0x002f, B:14:0x0036, B:16:0x0040, B:18:0x004a, B:20:0x004e, B:22:0x0054, B:27:0x0099, B:84:0x00b0, B:33:0x00b9, B:35:0x00c2, B:89:0x00a3, B:91:0x00a6, B:95:0x005c, B:101:0x006e), top: B:110:0x001a }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #4 {all -> 0x00dc, blocks: (B:38:0x00d2, B:44:0x00e0, B:59:0x00e6, B:62:0x00ee, B:63:0x012d, B:65:0x0139, B:67:0x013f, B:69:0x0114, B:46:0x0142, B:48:0x0146, B:49:0x016c, B:51:0x0170, B:52:0x017a, B:57:0x015d, B:74:0x00cc), top: B:73:0x00cc }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x00dc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00dc, blocks: (B:38:0x00d2, B:44:0x00e0, B:59:0x00e6, B:62:0x00ee, B:63:0x012d, B:65:0x0139, B:67:0x013f, B:69:0x0114, B:46:0x0142, B:48:0x0146, B:49:0x016c, B:51:0x0170, B:52:0x017a, B:57:0x015d, B:74:0x00cc), top: B:73:0x00cc }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x009d A[Catch: all -> 0x0184, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:5:0x0009, B:8:0x002a, B:25:0x0093, B:31:0x00b5, B:87:0x009d, B:99:0x0068), top: B:4:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x005c A[Catch: all -> 0x0024, UnknownHostException -> 0x005a, TRY_LEAVE, TryCatch #0 {UnknownHostException -> 0x005a, blocks: (B:16:0x0040, B:18:0x004a, B:20:0x004e, B:22:0x0054, B:95:0x005c), top: B:15:0x0040 }] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean g(java.lang.String... r10) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.Q.a.g(java.lang.String[]):java.lang.Boolean");
        }

        boolean z(int i) {
            try {
                InetAddress byAddress = InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
                if (!byAddress.isSiteLocalAddress() && !byAddress.isAnyLocalAddress()) {
                    if (!byAddress.isLoopbackAddress()) {
                        return false;
                    }
                }
                return true;
            } catch (UnknownHostException unused) {
                return false;
            }
        }

        public a(Context context, ax.Z2.o oVar, InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = context;
            E(oVar);
            this.o = aVar;
            this.i = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Q2.f;
import ax.Q8.F;
import ax.Q8.g;
import ax.Z2.s;
import ax.b3.L;
import ax.b3.d;
import ax.b3.j;
import ax.b3.t;
import ax.c3.G;
import ax.c3.K;
import ax.c3.c0;
import ax.c3.d0;
import ax.c3.g0;
import ax.c3.k0;
import ax.c3.x;
import ax.g3.h;
import ax.g3.i;
import ax.g3.k;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.i0;
import ax.pb.r;
import ax.u3.B;
import ax.u3.q;
import com.voxdon.xplorer.file.N;
import com.voxdon.xplorer.file.O;
import com.voxdon.xplorer.file.P;
import com.voxdon.xplorer.file.S;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.p;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

public class Q
extends m
implements ax.c3.i0 {
    public static final String n;
    private static final Logger o;
    private static b p;
    private P h;
    private boolean i;
    private String j;
    S k;
    N l;
    O m;

    static {
        o = Logger.getLogger("FileManager.SmbFileHelper");
    }

    private boolean A0() {
        SharedPreferences sharedPreferences = this.p().getSharedPreferences("SMBPrefs", 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hostConcatDomain_");
        stringBuilder.append(this.t());
        return sharedPreferences.getBoolean(stringBuilder.toString(), false);
    }

    public static boolean B0(String string) {
        if ("/".equals(string)) {
            return false;
        }
        if (!string.startsWith("/")) {
            return false;
        }
        return string.indexOf("/", 1) < 0;
    }

    private void D0(boolean bl) {
        SharedPreferences.Editor editor = this.p().getSharedPreferences("SMBPrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hostConcatDomain_");
        stringBuilder.append(this.t());
        editor.putBoolean(stringBuilder.toString(), bl);
        editor.apply();
    }

    private void F0(String string) {
        SharedPreferences.Editor editor = this.p().getSharedPreferences("SMBPrefs", 0).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lastResolvedIp_");
        stringBuilder.append(this.t());
        editor.putString(stringBuilder.toString(), string);
        editor.apply();
    }

    private boolean H0() {
        c c8 = this.h.a;
        return c8 == c.q || c8 == c.c0;
        {
        }
    }

    private boolean I0() {
        c c8 = this.h.a;
        return c8 == c.d0 || c8 == c.c0;
        {
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J0(n var1_1, G var2_4, long var3_6, Long var5_7, boolean var6_17, ax.u3.c var7_18, i var8_20) throws j, ax.b3.a {
        block29: {
            block26: {
                block25: {
                    var9_21 = null;
                    var10_22 = null;
                    try {
                        var9_21 = this.H0() != false ? (var11_23 = this.l.h((n)var1_1, var6_17)) : (var11_24 = this.m.q((n)var1_1, var6_17));
                    }
                    catch (Throwable var5_8) {
                        var2_4 = null;
                        var1_1 = var9_21;
                        ** GOTO lbl29
                    }
                    catch (IOException var5_9) {
                        var2_4 = null;
                        var1_1 = var10_22;
                        break block25;
                    }
                    var2_4 = var2_4.b();
                    break block26;
                }
lbl17:
                // 2 sources

                while (true) {
                    block28: {
                        block27: {
                            try {
                                if (!(var5_13 instanceof a0)) break block27;
                                var7_18 = N.a("smb1 writeFile", (a0)var5_13);
                                if (j.class.equals(var7_18.getClass()) == false) throw var7_18;
                            }
                            catch (Throwable var5_16) {
                                break block28;
                            }
                        }
                        if (this.H0() != false) throw this.p0("smb write file", (IOException)var5_13);
                        if (var5_13.getCause() instanceof F == false) throw this.p0("smb write file", (IOException)var5_13);
                        throw O.g((Exception)var5_13);
                    }
lbl30:
                    // 2 sources

                    while (true) {
                        if (var1_1 != null) {
                            try {
                                var1_1.close();
                            }
                            catch (IOException var1_2) {
                                var1_2.printStackTrace();
                            }
                        }
                        if (var2_4 == null) throw var5_11;
                        try {
                            var2_4.close();
                            throw var5_11;
                        }
                        catch (IOException var1_3) {
                            throw var5_11;
                        }
                        break;
                    }
                    break;
                }
            }
            ax.c3.F.c((InputStream)var2_4, var9_21, var3_6, (ax.u3.c)var7_18, var8_20);
            if (var9_21 == null) break block29;
            try {
                var9_21.close();
            }
            catch (IOException var7_19) {
                var7_19.printStackTrace();
            }
        }
        if (var2_4 != null) {
            try {
                var2_4.close();
            }
            catch (IOException var2_5) {
                // empty catch block
            }
        }
        if (var5_7 == null) return;
        this.d((n)var1_1, var5_7);
        return;
        catch (Throwable var5_10) lbl-1000:
        // 2 sources

        {
            while (true) {
                var1_1 = var9_21;
                ** continue;
                break;
            }
        }
        catch (IOException var5_12) lbl-1000:
        // 2 sources

        {
            while (true) {
                var1_1 = var9_21;
                ** continue;
                break;
            }
        }
        catch (Throwable var5_14) {
            var2_4 = null;
            ** continue;
        }
        catch (IOException var5_15) {
            var2_4 = null;
            ** continue;
        }
    }

    static /* synthetic */ String n0(Q q8) {
        return q8.v0();
    }

    static /* synthetic */ void o0(Q q8, String string) {
        q8.F0(string);
    }

    private j p0(String string, IOException iOException) {
        Throwable throwable = iOException.getCause();
        while (throwable != null) {
            if (throwable instanceof TimeoutException) {
                return new ax.b3.q(string, iOException);
            }
            if (throwable != throwable.getCause()) {
                throwable = throwable.getCause();
                continue;
            }
            throwable = null;
        }
        return d.b(string, iOException);
    }

    private void q0() {
        O o8 = this.m;
        if (o8 != null) {
            o8.l();
        }
    }

    public static b t0(Context context) {
        if (p == null) {
            p = new b(context.getApplicationContext());
        }
        return p;
    }

    private String v0() {
        SharedPreferences sharedPreferences = this.p().getSharedPreferences("SMBPrefs", 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lastResolvedIp_");
        stringBuilder.append(this.t());
        return sharedPreferences.getString(stringBuilder.toString(), null);
    }

    private static String w0(String string) {
        int n8 = string.indexOf("/", 1);
        if (n8 == -1) {
            return string.substring(1);
        }
        return string.substring(1, n8);
    }

    static String z0(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Override
    public InputStream A(String string, String string2, String string3) {
        return this.w(string, string2);
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n n8, m.f f8) throws j {
        if (n8.n()) {
            ax.u3.b.c(n8.isDirectory());
            if (this.H0()) {
                return this.l.n(n8);
            }
            return this.m.w(n8);
        }
        throw new t();
    }

    void C0(boolean bl) {
        this.i = bl;
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.u3.b.a(n8.n());
        this.J0(n8, g8, l8, l9, false, c8, i8);
    }

    @Override
    public void E(n n8, n n9, ax.u3.c c8, i i8) throws j {
        ax.u3.b.a(n9.n());
        long l8 = n8.p();
        if (this.H0()) {
            this.l.o(n8, n9);
        } else {
            this.m.x(n8, n9);
        }
        if (i8 != null) {
            i8.a(l8, l8);
        }
    }

    public void E0(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.j = this.x();
            this.k = null;
            return;
        }
        this.j = string;
        this.k = null;
    }

    @Override
    public void F(n n8, n n9, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    void G0(P p8) {
        this.C0(true);
        this.h = p8;
        Object object = p8.a;
        if (object == c.q || object == c.c0) {
            this.l.q(p8.c, p8.d);
        }
        if ((object = this.m) != null) {
            ((O)object).F(p8.h, p8.g, p8.i);
        }
    }

    @Override
    public String H(n n8) {
        if (!this.Z(n8)) {
            return null;
        }
        return com.voxdon.xplorer.file.m.S(n8);
    }

    @Override
    public void I(n n8) throws j {
        ax.u3.b.g("not support delete file recursively");
    }

    @Override
    public InputStream J(n n8, long l8) throws j {
        if (this.x0() != null) {
            if (!this.I0()) {
                return this.l.f(n8, l8);
            }
            try {
                InputStream inputStream = this.m.p(n8, l8);
                return inputStream;
            }
            catch (j j8) {
                if (this.H0()) {
                    return this.l.f(n8, l8);
                }
                throw j8;
            }
        }
        throw new ax.b3.h("Not connected to server");
    }

    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        try {
            object = new a(this.p(), this, a8, this.t());
            ((q)object).i(new String[0]);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            if (a8 != null) {
                a8.B();
                a8.T(false, exception.getMessage());
            }
            return;
        }
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public boolean M(n n8) {
        if (this.H0()) {
            return this.l.c(n8);
        }
        return this.m.i(n8);
    }

    @Override
    public boolean N(n n8) {
        if (this.H0()) {
            return this.l.b(n8);
        }
        return this.m.h(n8);
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void P(n n8) throws j {
        if (this.H0()) {
            this.l.d(n8);
            return;
        }
        this.m.k(n8);
    }

    @Override
    public boolean Q(n object, n object2) {
        f f8;
        f f9 = ((n)object).P();
        if (f9 == (f8 = f.J0) && ((n)object2).P() == f8) {
            object = ((n)object).T();
            object2 = ((n)object2).T();
            if (!"/".equals(object) && !"/".equals(object2)) {
                return Q.w0((String)object).equals(Q.w0((String)object2));
            }
        }
        return false;
    }

    @Override
    public void W(Context context, K k8) {
        super.W(context, k8);
        this.l = new N(this);
        if (ax.X2.Q.i()) {
            this.m = new O(this);
        }
    }

    @Override
    public boolean a() {
        return this.i;
    }

    @Override
    public boolean a0(n n8) {
        if (n8 == null) {
            return false;
        }
        return !d0.E(n8);
    }

    @Override
    public void b() {
        this.C0(false);
        this.q0();
    }

    @Override
    public boolean c0() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean d(n n8, long l8) {
        Exception exception2;
        block5: {
            if (l8 < 0L) {
                return false;
            }
            if (!(n8 instanceof S)) {
                return false;
            }
            try {
                if (this.H0()) {
                    this.l.p(n8, l8);
                    return true;
                }
            }
            catch (Exception exception2) {
                break block5;
            }
            this.m.E(n8, l8);
            return true;
        }
        exception2.printStackTrace();
        return false;
    }

    @Override
    public ax.l3.a e0(String charSequence, int n8) throws j {
        if (this.a()) {
            if (!this.H0()) {
                return this.m.D((String)charSequence, n8);
            }
            String string = d0.f((String)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("SMB1 does not support proxy file :");
            ((StringBuilder)charSequence).append((Object)this.h.a);
            ((StringBuilder)charSequence).append(",");
            ((StringBuilder)charSequence).append(string);
            ax.u3.b.g(((StringBuilder)charSequence).toString());
            throw new t("SMB1 does not support proxy file.");
        }
        throw new ax.b3.h("Not connected to server");
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.J0(n8, g8, l8, l9, true, c8, i8);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) throws j {
        synchronized (this) {
            try {
                this.o(n8, string, bl, bl2, h8, c8);
                return;
            }
            catch (Throwable throwable) {
                while (true) {
                    RuntimeException var1_3;
                    try {}
                    catch (Throwable throwable2) {
                        continue;
                    }
                    throw var1_3;
                }
            }
        }
    }

    @Override
    public String r() {
        return this.j;
    }

    String r0() {
        return this.h.d;
    }

    public S s0(String object) throws j {
        boolean bl;
        Object object2;
        Object object3;
        if (object == null) {
            object3 = ax.Ha.c.h().d("SMBGFI!!!:").j();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("smbtype:");
            ((StringBuilder)object2).append(this.h.a.name());
            ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
        }
        if ((bl = ((String)object).equals(this.j)) && (object2 = this.k) != null) {
            return object2;
        }
        if (this.x0() != null) {
            object = this.H0() ? this.l.e((String)object) : this.m.o((String)object);
            if (bl) {
                this.k = object;
            }
            return object;
        }
        object3 = d0.f((String)object);
        object2 = ax.Ha.c.h().f().b("NOT CONNECT CALL GET FILE INFO").j();
        object = new StringBuilder();
        ((StringBuilder)object).append("ext:");
        ((StringBuilder)object).append((String)object3);
        ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
        throw new ax.b3.h("Not connected to server");
    }

    public k0 u0(n n8) throws j {
        if (this.H0()) {
            return this.l.i(n8);
        }
        return this.m.s(n8);
    }

    P x0() {
        return this.h;
    }

    String y0(String string) {
        return Q.z0(this.r0(), string);
    }

    private static class a
    extends q<String, Void, Boolean> {
        Context h;
        WifiManager i;
        String j;
        String k;
        int l;
        String m;
        String n;
        c.a o;
        Q p;
        String q;
        String r;
        String s;

        public a(Context context, ax.Z2.o o8, c.a a8) {
            super(q.e.c0);
            this.h = context;
            this.E(o8);
            this.o = a8;
            this.i = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        }

        public a(Context context, Q q8, c.a a8, int n8) {
            super(q.e.c0);
            this.h = context;
            this.p = q8;
            this.o = a8;
            this.E(Q.t0(context).k(n8));
            this.i = (WifiManager)context.getApplicationContext().getSystemService("wifi");
        }

        private ax.jb.b C(Q q8, String object, String string) throws UnknownHostException {
            Object object2 = this.i;
            boolean bl = object2 == null || object2.getWifiState() != 3 || (object2 = this.i.getDhcpInfo()) == null || ((DhcpInfo)object2).ipAddress == 0 || this.z(((DhcpInfo)object2).dns1);
            ax.nb.g.A((String)object);
            ax.jb.b.l(bl);
            if (TextUtils.isEmpty((CharSequence)string)) {
                return this.D((String)object, true);
            }
            if (q8 != null && q8.A0()) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(".");
                ((StringBuilder)object2).append(string);
                object2 = ((StringBuilder)object2).toString();
                string = object;
            } else {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(".");
                ((StringBuilder)object2).append(string);
                string = ((StringBuilder)object2).toString();
                object2 = object;
            }
            try {
                object = this.D((String)object2, true);
                return object;
            }
            catch (UnknownHostException unknownHostException) {
                ax.jb.b b8 = this.D(string, true);
                if (q8 != null) {
                    q8.D0(q8.A0() ^ true);
                }
                return b8;
            }
        }

        /*
         * Unable to fully structure code
         */
        private ax.jb.b D(String var1_1, boolean var2_2) throws UnknownHostException {
            block14: {
                block15: {
                    var11_3 = ax.jb.b.c((String)var1_1, var2_2);
                    if (var11_3.length == 0) break block14;
                    if (var11_3.length <= 1) break block15;
                    var12_4 = ax.i3.a.f(this.h);
                    var3_5 = var12_4.length >= 4 && var12_4[0] != 0 && !(var1_1 = InetAddress.getByAddress(var12_4)).isAnyLocalAddress() && !var1_1.isLoopbackAddress();
                    var6_7 = null;
                    var1_1 = null;
                    for (var4_6 = var11_3.length - 1; var4_6 >= 0; --var4_6) {
                        block16: {
                            block17: {
                                var8_10 = var11_3[var4_6];
                                var10_12 = var6_7;
                                var9_11 = var1_1;
                                if (var8_10 == null) break block16;
                                if (!(var8_10.b() instanceof Inet6Address)) break block17;
                                var10_12 = var6_7;
                                var9_11 = var1_1;
                                break block16;
                            }
                            var13_13 = var8_10.b();
                            var7_9 = var6_7;
                            var5_8 = var1_1;
                            if (var6_7 != null) ** GOTO lbl37
                            if (!(var13_13 instanceof ax.nb.g)) ** GOTO lbl-1000
                            var5_8 = ((ax.nb.g)var13_13).s();
                            if (var5_8.isLoopbackAddress()) {
                                var10_12 = var6_7;
                                var9_11 = var1_1;
                            } else {
                                if (var5_8.isLinkLocalAddress()) {
                                    var7_9 = var6_7;
                                    var5_8 = var1_1;
                                    if (var1_1 == null) {
                                        var5_8 = var8_10;
                                        var7_9 = var6_7;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var7_9 = var8_10;
                                    var5_8 = var1_1;
                                }
lbl37:
                                // 3 sources

                                var10_12 = var7_9;
                                var9_11 = var5_8;
                                if (var3_5) {
                                    var10_12 = var7_9;
                                    var9_11 = var5_8;
                                    if (var13_13 instanceof ax.nb.g) {
                                        var1_1 = ((ax.nb.g)var13_13).h();
                                        var10_12 = var7_9;
                                        var9_11 = var5_8;
                                        if (((Object)var1_1).length >= 4) {
                                            var10_12 = var7_9;
                                            var9_11 = var5_8;
                                            if (var1_1[0] == var12_4[0]) {
                                                var10_12 = var7_9;
                                                var9_11 = var5_8;
                                                if (var1_1[1] == var12_4[1]) {
                                                    var10_12 = var7_9;
                                                    var9_11 = var5_8;
                                                    if (var1_1[2] == var12_4[2]) {
                                                        return var8_10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var6_7 = var10_12;
                        var1_1 = var9_11;
                    }
                    if (var6_7 != null) {
                        return var6_7;
                    }
                    if (var1_1 != null) {
                        return var1_1;
                    }
                }
                return var11_3[0];
            }
            ax.u3.b.f();
            throw new UnknownHostException("No matched ip address");
        }

        private void E(ax.Z2.o o8) {
            this.j = o8.c();
            this.k = o8.d();
            this.l = o8.h();
            this.m = o8.k();
            this.n = o8.g();
            this.q = o8.f();
            this.r = o8.j();
        }

        private P F(c c8, ax.i9.c c9, boolean bl, ax.jb.b b8, String string) throws L {
            P p8;
            P p9 = p8 = this.G(c8, c9, bl, b8, string, this.l, "?", "GUEST", "");
            if (p8 == null) {
                p9 = p8 = this.G(c8, c9, bl, b8, string, this.l, "?", "Guest", "");
                if (p8 == null) {
                    p9 = p8 = this.G(c8, c9, bl, b8, string, this.l, "?", "guest", "");
                    if (p8 == null) {
                        p9 = this.G(c8, c9, bl, b8, string, this.l, "", "", "");
                    }
                }
            }
            return p9;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private P G(c var1_1, ax.i9.c var2_10, boolean var3_14, ax.jb.b var4_15, String var5_18, int var6_19, String var7_20, String var8_21, String var9_22) throws L {
            block44: {
                block42: {
                    block41: {
                        block40: {
                            block36: {
                                var15_23 = TextUtils.isEmpty((CharSequence)var7_20) != false && TextUtils.isEmpty((CharSequence)var8_21) != false && TextUtils.isEmpty((CharSequence)var9_22) != false ? ax.pb.r.q0 : new r((String)var7_20, (String)var8_21, (String)var9_22);
                                var17_24 = c.c0;
                                var16_25 = null;
                                var11_26 = false;
                                var10_27 = false;
                                var12_28 = false;
                                if (var1_1 != var17_24 && var1_1 != c.d0) {
                                    var1_1 = null;
                                } else {
                                    if ("?".equals(var7_20)) {
                                        var7_20 = var8_21;
                                        if ("GUEST".equals(var8_21)) {
                                            var7_20 = "SMB2GUESTTESTACCOUNT";
                                        }
                                        var7_20 = O.n("", (String)var7_20, (String)var9_22);
                                    } else {
                                        var7_20 = O.n((String)var7_20, (String)var8_21, (String)var9_22);
                                    }
                                    var8_21 = O.d((ax.i9.c)var2_10, var3_14, var5_18, var6_19, (ax.j9.b)var7_20);
                                    var12_28 = true;
                                    var13_29 = true;
                                    var10_27 = true;
                                    var14_30 = true;
                                    var11_26 = true;
                                    var2_10 = var8_21;
                                    break block36;
                                }
lbl26:
                                // 6 sources

                                while (true) {
                                    block43: {
                                        if (var4_15 != null) {
                                            block39: {
                                                block38: {
                                                    block37: {
                                                        if (var6_19 > 0) {
                                                            try {
                                                                i0.c(var4_15, var6_19, var15_23);
                                                                break block37;
                                                            }
                                                            catch (RuntimeException var2_12) {
                                                                break block38;
                                                            }
                                                            catch (a0 var4_17) {
                                                                break block39;
                                                            }
                                                        }
                                                        i0.d(var4_15, var15_23);
                                                    }
                                                    if (var10_27 == false) return new P(var15_23);
                                                    return new P((ax.j9.b)var1_1, var5_18, var6_19, var15_23);
                                                }
                                                ax.Ha.c.h().d("SMB1 LOGON!!").l(var2_12).h();
                                                break block43;
                                            }
                                            var2_10 = new StringBuilder();
                                            var2_10.append("SMB1 : ");
                                            var2_10.append(var4_17.getMessage());
                                            this.w(var2_10.toString());
                                            var4_17.printStackTrace();
                                        }
                                    }
                                    if (var10_27 == false) return null;
                                    var1_1 = new P((ax.j9.b)var1_1, var5_18, var6_19);
                                    var1_1.c = var15_23;
                                    return var1_1;
                                }
                            }
                            if (var1_1 != c.d0) break block40;
                            var2_10 = var8_21;
                            var2_10 = var8_21;
                            var1_1 = new P((ax.j9.b)var7_20, var5_18, var6_19);
                            var2_10 = var8_21;
                            var1_1.c = var15_23;
                            if (var8_21 == null) return var1_1;
                            var8_21.j().close();
                            return var1_1;
                            catch (Throwable var4_16) {
                                var1_1 = var2_10;
                                var2_10 = var4_16;
                            }
lbl71:
                            // 2 sources

                            while (true) {
                                if (var1_1 == null) throw var2_10;
                                try {
                                    var1_1.j().close();
                                    throw var2_10;
                                }
                                catch (IOException var1_9) {
                                    throw var2_10;
                                }
                                break;
                            }
                            catch (RuntimeException var1_2) {
                                var11_26 = var13_29;
                                break block41;
                            }
                            catch (IOException var1_3) {
                                var11_26 = var10_27;
                                break block42;
                            }
                            catch (ax.k9.d var1_4) {
                                var11_26 = var10_27;
                                break block42;
                            }
                        }
                        var10_27 = var14_30;
                        var1_1 = var7_20;
                        if (var8_21 == null) ** GOTO lbl26
                        var10_27 = var12_28;
                        try {}
                        catch (IOException var1_5) {
                            var1_1 = var7_20;
                        }
                        break block44;
lbl97:
                        // 3 sources

                        while (true) {
                            var10_27 = var11_26;
                            var1_1.close();
                            var10_27 = var11_26;
                            var1_1 = var7_20;
                            ** GOTO lbl26
                            break;
                        }
                    }
lbl104:
                    // 2 sources

                    while (true) {
                        var2_10 = var8_21;
                        {
                            var1_1.printStackTrace();
                            var2_10 = var8_21;
                            ax.Ha.c.h().f().b("SMB2 AUTH RUNTIME EXCEPTION").l((Throwable)var1_1).h();
                            var10_27 = var11_26;
                            var1_1 = var7_20;
                            if (var8_21 == null) ** GOTO lbl26
                            var10_27 = var11_26;
                        }
                        {
                            var1_1 = var8_21.j();
                            ** GOTO lbl97
                        }
                        break;
                    }
                }
lbl116:
                // 2 sources

                while (true) {
                    var2_10 = var8_21;
                    {
                        var2_10 = var8_21;
                        var9_22 = new StringBuilder();
                        var2_10 = var8_21;
                        var9_22.append("SMB2 : ");
                        var2_10 = var8_21;
                        var9_22.append(var1_1.getMessage());
                        var2_10 = var8_21;
                        this.w(var9_22.toString());
                        var2_10 = var8_21;
                        var1_1.printStackTrace();
                        var10_27 = var11_26;
                        var1_1 = var7_20;
                        if (var8_21 != null) ** break;
                        ** continue;
                        var10_27 = var11_26;
                    }
                    {
                        var1_1 = var8_21.j();
                        ** GOTO lbl97
                    }
                    break;
                }
                catch (IOException var2_13) {
                    return var1_1;
                }
                catch (Throwable var2_11) {
                    var1_1 = var16_25;
                    ** continue;
                }
                catch (RuntimeException var1_6) {
                    var8_21 = null;
                    var11_26 = var12_28;
                    ** continue;
                }
                catch (IOException var1_7) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_21 = null;
                        ** continue;
                        break;
                    }
                }
            }
            var1_1 = var8_21.j();
            ** while (true)
            catch (ax.k9.d var1_8) {
                ** continue;
            }
        }

        private P H(c c8, ax.i9.c c9, boolean bl, ax.jb.b b8, String string, String object) throws L {
            int n8 = this.m.length();
            String string2 = null;
            String string3 = n8 > 0 ? this.m : null;
            if (this.n.length() > 0) {
                string2 = this.n;
            }
            if (this.j.length() > 0) {
                object = this.j;
                n8 = 0;
            } else {
                n8 = 1;
            }
            object = this.G(c8, c9, bl, b8, string, this.l, (String)object, string3, string2);
            if (object == null && n8 != 0) {
                return this.G(c8, c9, bl, b8, string, this.l, null, string3, string2);
            }
            return object;
        }

        private void w(String string) {
            if (this.s == null) {
                this.s = string;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.s);
            stringBuilder.append(",");
            stringBuilder.append(string);
            this.s = stringBuilder.toString();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private P x(String var1_1, String var2_4, String var3_7, ax.jb.b var4_9, boolean var5_10) {
            block76: {
                block77: {
                    block62: {
                        block71: {
                            block70: {
                                block68: {
                                    block67: {
                                        block63: {
                                            block73: {
                                                block75: {
                                                    block65: {
                                                        block64: {
                                                            block74: {
                                                                block58: {
                                                                    block60: {
                                                                        block59: {
                                                                            block72: {
                                                                                var11_11 = "SMB1".equals(var1_1);
                                                                                var6_12 = true;
                                                                                var8_13 = true;
                                                                                var10_14 = true;
                                                                                var7_15 = true;
                                                                                var9_16 = true;
                                                                                var19_17 = null;
                                                                                if (!var11_11) break block72;
                                                                                var15_18 = c.q;
                                                                                break block73;
                                                                            }
                                                                            var13_45 = "SMB2".equals(var1_1);
                                                                            var11_11 = false;
                                                                            var12_46 = false;
                                                                            if (!var13_45 && !"SMB3".equals(var1_1) || !ax.X2.Q.i() || TextUtils.isEmpty((CharSequence)var3_7)) break block74;
                                                                            var15_18 = O.j((String)var1_1, true, true);
                                                                            try {
                                                                                var14_20 = O.f((ax.i9.c)var15_18, (String)var3_7, this.l);
                                                                                var16_36 /* !! */  = var15_18;
                                                                                break block58;
                                                                            }
                                                                            catch (IllegalArgumentException var14_21) {
                                                                                break block59;
                                                                            }
                                                                            catch (IOException var14_22) {
                                                                                break block59;
                                                                            }
                                                                            catch (ax.k9.d var14_23) {
                                                                                break block59;
                                                                            }
                                                                            catch (IllegalArgumentException var14_24) {}
                                                                            ** GOTO lbl-1000
                                                                            catch (IOException var14_25) {
                                                                                ** GOTO lbl-1000
                                                                            }
                                                                            catch (ax.k9.d var14_26) {}
lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                var15_18 = null;
                                                                            }
                                                                        }
                                                                        if (var14_20.getMessage() != null && var14_20.getMessage().contains("EOF while reading packet")) {
                                                                            block61: {
                                                                                var17_43 /* !! */  = O.j((String)var1_1, false, true);
                                                                                try {
                                                                                    var16_36 /* !! */  = O.f(var17_43 /* !! */ , (String)var3_7, this.l);
                                                                                    var8_13 = var12_46;
                                                                                    var15_18 = var17_43 /* !! */ ;
                                                                                    break block60;
                                                                                }
                                                                                catch (ax.k9.d | IOException | IllegalArgumentException var15_19) {
                                                                                    var8_13 = false;
                                                                                    var15_18 = var17_43 /* !! */ ;
                                                                                    break block61;
                                                                                }
                                                                                catch (ax.k9.d | IOException | IllegalArgumentException var16_37) {
                                                                                    var8_13 = var9_16;
                                                                                }
                                                                            }
                                                                            var16_36 /* !! */  = null;
                                                                            var6_12 = false;
                                                                        } else {
                                                                            var16_36 /* !! */  = null;
                                                                            var6_12 = false;
                                                                            var8_13 = true;
                                                                        }
                                                                    }
                                                                    if (!var6_12) {
                                                                        if (var14_20 instanceof SocketTimeoutException) {
                                                                            this.w("SMB2 timeout");
                                                                            return null;
                                                                        }
                                                                        var14_20.printStackTrace();
                                                                        var1_1 = new StringBuilder();
                                                                        var1_1.append("Protocol not supported : ");
                                                                        var1_1.append(var14_20.getMessage());
                                                                        this.w(var1_1.toString());
                                                                        return null;
                                                                    }
                                                                    var14_20 = var16_36 /* !! */ ;
                                                                    var16_36 /* !! */  = var15_18;
                                                                }
                                                                if (var14_20 != null && var14_20.s0() != null && (var15_18 = var14_20.s0().a()) != null && (!var15_18.j() && "SMB3".equals(var1_1) || !this.A((g)var15_18) && "SMB2".equals(var1_1))) {
                                                                    var14_20.close();
                                                                    break block62;
                                                                }
                                                                var15_18 = c.d0;
                                                                break block67;
                                                            }
                                                            if (!ax.X2.Q.i() || TextUtils.isEmpty((CharSequence)var3_7)) break block75;
                                                            var16_36 /* !! */  = O.j((String)var1_1, true, true);
                                                            var17_43 /* !! */  = O.f((ax.i9.c)var16_36 /* !! */ , (String)var3_7, this.l);
                                                            try {
                                                                var15_18 = c.d0;
                                                                var14_20 = var17_43 /* !! */ ;
                                                                break block63;
                                                            }
                                                            catch (IllegalArgumentException var14_27) {
                                                                var15_18 = var17_43 /* !! */ ;
                                                                break block64;
                                                            }
                                                            catch (IOException var14_28) {
                                                                var15_18 = var17_43 /* !! */ ;
                                                                break block64;
                                                            }
                                                            catch (ax.k9.d var14_29) {
                                                                var15_18 = var17_43 /* !! */ ;
                                                                break block64;
                                                            }
                                                            catch (IllegalArgumentException var14_30) {}
                                                            ** GOTO lbl-1000
                                                            catch (IOException var14_31) {
                                                                ** GOTO lbl-1000
                                                            }
                                                            catch (ax.k9.d var14_32) {}
lbl-1000:
                                                            // 3 sources

                                                            {
                                                                var15_18 = null;
                                                                break block64;
                                                            }
                                                            catch (IllegalArgumentException var14_33) {}
                                                            ** GOTO lbl-1000
                                                            catch (IOException var14_34) {
                                                                ** GOTO lbl-1000
                                                            }
                                                            catch (ax.k9.d var14_35) {}
lbl-1000:
                                                            // 3 sources

                                                            {
                                                                var15_18 = null;
                                                                var16_36 /* !! */  = null;
                                                            }
                                                        }
                                                        if (var14_20.getMessage() != null && var14_20.getMessage().contains("EOF while reading packet")) {
                                                            block66: {
                                                                var18_47 = O.j((String)var1_1, false, true);
                                                                try {
                                                                    var17_43 /* !! */  = O.f(var18_47, (String)var3_7, this.l);
                                                                    var6_12 = var7_15;
                                                                    var8_13 = var11_11;
                                                                    var16_36 /* !! */  = var18_47;
                                                                    break block65;
                                                                }
                                                                catch (ax.k9.d | IOException | IllegalArgumentException var16_38) {
                                                                    var8_13 = false;
                                                                    var16_36 /* !! */  = var18_47;
                                                                    break block66;
                                                                }
                                                                catch (ax.k9.d | IOException | IllegalArgumentException var17_44) {
                                                                    var8_13 = var10_14;
                                                                }
                                                            }
                                                            var6_12 = false;
                                                            var17_43 /* !! */  = var15_18;
                                                        } else {
                                                            var6_12 = false;
                                                            var8_13 = true;
                                                            var17_43 /* !! */  = var15_18;
                                                        }
                                                    }
                                                    if (var6_12) {
                                                        var15_18 = c.d0;
                                                        var14_20 = var17_43 /* !! */ ;
                                                        break block67;
                                                    } else {
                                                        var14_20.printStackTrace();
                                                        var15_18 = c.q;
                                                        var14_20 = var17_43 /* !! */ ;
                                                    }
                                                    break block67;
                                                }
                                                var15_18 = c.q;
                                            }
                                            var14_20 = null;
                                            var16_36 /* !! */  = null;
                                        }
                                        var8_13 = true;
                                    }
                                    if (var15_18 == c.q) {
                                        block69: {
                                            try {
                                                N.r(var4_9, this.l);
                                                break block68;
                                            }
                                            catch (NullPointerException var1_2) {
                                            }
                                            catch (IOException var1_3) {
                                                break block69;
                                            }
                                            var2_4 = new StringBuilder();
                                            var2_4.append("Cannot connect to the SMB1 server : ");
                                            var2_4.append(var4_9);
                                            var2_4.append(" : ");
                                            var2_4.append(var1_2.getMessage());
                                            this.w(var2_4.toString());
                                            return null;
                                        }
                                        if (var1_3 instanceof ax.rb.d && (var2_4 = (ax.rb.d)var1_3).a() != null) {
                                            var2_4 = var2_4.a();
                                            var3_7 = new StringBuilder();
                                            var3_7.append("Cannot connect to the SMB1 server : ");
                                            var3_7.append(var4_9);
                                            var3_7.append(" : ");
                                            var3_7.append(var1_3.getMessage());
                                            var3_7.append(" : ");
                                            var3_7.append(var2_4.getMessage());
                                            this.w(var3_7.toString());
                                            return null;
                                        }
                                        var2_4 = new StringBuilder();
                                        var2_4.append("Cannot connect to the SMB1 server : ");
                                        var2_4.append(var4_9);
                                        var2_4.append(" : ");
                                        var2_4.append(var1_3.getMessage());
                                        this.w(var2_4.toString());
                                        return null;
                                    }
                                }
                                if (var5_10) {
                                    try {
                                        var2_4 = var16_36 /* !! */  = this.F((c)var15_18, (ax.i9.c)var16_36 /* !! */ , true, var4_9, (String)var3_7);
                                        break block70;
                                    }
                                    catch (L var16_39) {
                                        break block71;
                                    }
                                }
                                try {
                                    var2_4 = var16_36 /* !! */  = this.H((c)var15_18, (ax.i9.c)var16_36 /* !! */ , true, var4_9, (String)var3_7, (String)var2_4);
                                }
                                catch (L var16_40) {
                                    // empty catch block
                                }
                            }
                            var5_10 = true;
                            break block76;
                        }
                        var16_41 = var14_20;
                        if (var14_20 == null) break block77;
                        var14_20.close();
                        var16_41 = null;
                        catch (Exception var2_6) {}
                    }
                    var2_4 = new StringBuilder();
                    var2_4.append("Protocol does not match (");
                    var2_4.append((String)var1_1);
                    var2_4.append(" != ");
                    var2_4.append(var15_18);
                    var2_4.append(")");
                    this.w(var2_4.toString());
                    return null;
                    catch (Exception var16_42) {
                        var16_41 = var14_20;
                    }
                }
                var14_20 = var16_41;
                try {
                    var17_43 /* !! */  = O.j((String)var1_1, var8_13, false);
                    var14_20 = var16_41;
                    var16_41 = O.f(var17_43 /* !! */ , (String)var3_7, this.l);
                    if (var5_10) {
                        var14_20 = var16_41;
                        var2_4 = this.F((c)var15_18, var17_43 /* !! */ , false, var4_9, (String)var3_7);
                    } else {
                        var14_20 = var16_41;
                        var2_4 = this.H((c)var15_18, var17_43 /* !! */ , false, var4_9, (String)var3_7, (String)var2_4);
                    }
                    var14_20 = var16_41;
                }
                catch (L | ax.k9.d | IOException | IllegalArgumentException var2_5) {
                    var2_4 = var19_17;
                }
                var5_10 = false;
            }
            if (var14_20 != null) {
                try {
                    var14_20.close();
                }
                catch (Exception var3_8) {
                    var3_8.printStackTrace();
                }
            }
            if (var2_4 == null) return var2_4;
            var2_4.g = var8_13;
            var2_4.h = var1_1;
            var2_4.i = var5_10;
            return var2_4;
        }

        public boolean A(g g8) {
            return g8 == g.e0 || g8 == g.d0 || g8 == g.f0;
            {
            }
        }

        protected void B(Boolean bl) {
            if (this.o != null) {
                if (bl.booleanValue()) {
                    if (!TextUtils.isEmpty((CharSequence)this.q)) {
                        this.q = d0.U(this.q);
                    }
                    this.o.T(true, this.q);
                    return;
                }
                this.o.T(false, this.s);
            }
        }

        @Override
        protected void r() {
            c.a a8 = this.o;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean y(String ... var1_1) {
            block54: {
                block53: {
                    block61: {
                        block60: {
                            block57: {
                                block56: {
                                    block55: {
                                        block52: {
                                            block51: {
                                                block59: {
                                                    block50: {
                                                        block49: {
                                                            block48: {
                                                                block47: {
                                                                    block46: {
                                                                        block58: {
                                                                            block45: {
                                                                                block44: {
                                                                                    var1_1 = this.p;
                                                                                    if (var1_1 != null) {
                                                                                        var1_1.i();
                                                                                    }
                                                                                    try {
                                                                                        ax.jb.a.j("jcifs.smb.client.disablePlainTextPasswords", "false");
                                                                                        var3_7 = "anonymous".equals(this.m);
                                                                                        if (!var3_7) break block44;
                                                                                    }
                                                                                    catch (Throwable var1_6) {}
                                                                                    var3_7 = TextUtils.isEmpty((CharSequence)this.n);
                                                                                    if (!var3_7) break block44;
                                                                                    var3_7 = true;
                                                                                    break block45;
                                                                                }
                                                                                var3_7 = false;
                                                                            }
                                                                            var1_1 = this.p;
                                                                            var8_9 = null;
                                                                            if (var1_1 == null) ** GOTO lbl25
                                                                            var5_8 = Q.n0((Q)var1_1);
                                                                            break block58;
lbl25:
                                                                            // 1 sources

                                                                            var5_8 = null;
                                                                        }
                                                                        var1_1 = this.C(this.p, this.k, this.j);
                                                                        try {
                                                                            var6_10 = var1_1.f();
                                                                            if (TextUtils.isEmpty((CharSequence)var6_10)) break block46;
                                                                            if (this.p != null && !var6_10.equals(var5_8)) {
                                                                                Q.o0(this.p, (String)var6_10);
                                                                            }
                                                                            break block47;
                                                                        }
                                                                        catch (UnknownHostException var6_11) {
                                                                            break block48;
                                                                        }
                                                                    }
                                                                    var4_14 = TextUtils.isEmpty((CharSequence)var6_10);
                                                                    if (var4_14) break block49;
                                                                }
                                                                var5_8 = var6_10;
                                                                break block49;
                                                                catch (UnknownHostException var6_12) {
                                                                    var1_1 = null;
                                                                }
                                                            }
                                                            var4_14 = TextUtils.isEmpty((CharSequence)var5_8);
                                                            if (!var4_14) break block49;
                                                            var6_10.printStackTrace();
                                                            var1_1 = new StringBuilder();
                                                            var1_1.append("Unknown Host : ");
                                                            var1_1.append(var6_10.getMessage());
                                                            this.w(var1_1.toString());
                                                            var5_8 = Boolean.FALSE;
                                                            var1_1 = this.p;
                                                            if (var1_1 != null) {
                                                                var1_1.j();
                                                            }
                                                            return var5_8;
                                                        }
                                                        var4_14 = TextUtils.isEmpty((CharSequence)var5_8);
                                                        if (!var4_14) break block50;
                                                        var6_10 = this.k;
                                                        ** GOTO lbl75
                                                    }
                                                    var4_14 = B.I((String)var5_8);
                                                    if (var4_14) ** GOTO lbl79
                                                    var6_10 = this.k;
lbl75:
                                                    // 2 sources

                                                    var7_15 = var6_10;
                                                    var6_10 = var1_1;
                                                    var1_1 = var7_15;
                                                    break block59;
lbl79:
                                                    // 1 sources

                                                    try {
                                                        var1_1 = var6_10 = ax.jb.b.d((String)var5_8);
                                                    }
                                                    catch (UnknownHostException var6_13) {}
                                                    var7_15 = var5_8;
                                                    var6_10 = var1_1;
                                                    var1_1 = var7_15;
                                                }
                                                var7_15 = var6_10;
                                                if (var6_10 != null) break block51;
                                                try {
                                                    var7_15 = ax.jb.b.d((String)var5_8);
                                                }
                                                catch (UnknownHostException var7_16) {
                                                    var7_15 = var6_10;
                                                }
                                            }
                                            var6_10 = this.r;
                                            if (var6_10 != null) break block52;
                                            try {
                                                var9_17 /* !! */  = this.x("SMB2", (String)var1_1, (String)var5_8, (ax.jb.b)var7_15, var3_7);
                                                var6_10 = var9_17 /* !! */ ;
                                                if (var9_17 /* !! */  == null) {
                                                    var6_10 = this.x(Q.n, (String)var1_1, (String)var5_8, (ax.jb.b)var7_15, var3_7);
                                                }
                                                ** GOTO lbl109
                                            }
                                            catch (Throwable var1_2) {}
                                            break block54;
                                        }
                                        try {
                                            var6_10 = this.x((String)var6_10, (String)var1_1, (String)var5_8, (ax.jb.b)var7_15, var3_7);
lbl109:
                                            // 2 sources

                                            if (var6_10 == null) {
                                                var1_1 = Boolean.FALSE;
                                                var5_8 = this.p;
                                                if (var5_8 != null) {
                                                    var5_8.j();
                                                }
                                                return var1_1;
                                            }
                                            var7_15 = var6_10.a;
                                            var9_17 /* !! */  = c.q;
                                            var5_8 = var1_1;
                                            if (var7_15 != var9_17 /* !! */ ) break block53;
                                            ** try [egrp 19[TRYBLOCK] [26 : 464->621)] { 
lbl120:
                                            // 1 sources

                                        }
                                        catch (Throwable var1_3) {
                                            break block54;
                                        }
                                        {
                                            var2_18 = this.l;
                                            if (var2_18 <= 0) break block55;
                                            var7_15 = new StringBuilder();
                                            var7_15.append("smb://");
                                            var7_15.append((String)var1_1);
                                            var7_15.append(":");
                                            var7_15.append(this.l);
                                            var7_15.append("/");
                                            var5_8 = new b0(var7_15.toString(), var6_10.c);
                                            break block56;
                                        }
lbl138:
                                        // 1 sources

                                        catch (Exception var1_5) {
                                            break block57;
                                        }
                                    }
                                    var5_8 = new StringBuilder();
                                    var5_8.append("smb://");
                                    var5_8.append((String)var1_1);
                                    var5_8.append("/");
                                    var5_8 = new b0(var5_8.toString(), var6_10.c);
                                }
                                var7_15 = var5_8.s();
                                break block60;
                            }
                            var1_1 = null;
                            var7_15 = var8_9;
                        }
                        if (var7_15 == null) break block61;
                        var5_8 = var1_1;
                        if (var7_15.booleanValue()) break block53;
                    }
                    var5_8 = this.k;
                }
                if ((var2_18 = this.l) > 0) {
                    var6_10.a(String.format(Locale.US, "smb://%s:%s", new Object[]{var5_8, var2_18}));
                } else {
                    var6_10.a(String.format(Locale.US, "smb://%s", new Object[]{var5_8}));
                }
                var1_1 = this.p;
                if (var1_1 != null) {
                    var1_1.G0((P)var6_10);
                    this.p.E0(this.q);
                }
                var1_1 = Boolean.TRUE;
                var5_8 = this.p;
                if (var5_8 != null) {
                    var5_8.j();
                }
                return var1_1;
            }
            var5_8 = this.p;
            if (var5_8 != null) {
                var5_8.j();
            }
            throw var1_4;
        }

        boolean z(int n8) {
            byte by = (byte)(n8 & 0xFF);
            byte by2 = (byte)(n8 >> 8 & 0xFF);
            byte by3 = (byte)(n8 >> 16 & 0xFF);
            byte by4 = (byte)(n8 >> 24 & 0xFF);
            try {
                boolean bl;
                InetAddress inetAddress = InetAddress.getByAddress(new byte[]{by, by2, by3, by4});
                return inetAddress.isSiteLocalAddress() || inetAddress.isAnyLocalAddress() || (bl = inetAddress.isLoopbackAddress());
                {
                }
            }
            catch (UnknownHostException unknownHostException) {
                return false;
            }
        }
    }

    public static class b
    extends g0 {
        Context a;
        c0 b;

        b(Context context) {
            this.a = context;
            this.b = new c0(f.J0);
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("SMBPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("name_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("domain_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("host_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("port_");
            ((StringBuilder)object).append(n8);
            object = stringBuilder.remove(((StringBuilder)object).toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("username_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("password_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("initialPath_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("created_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("protocol_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("lastResolvedIp_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("hostConcatDomain_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            Object object = this.a.getSharedPreferences("SMBPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("name_");
            charSequence.append(n8);
            charSequence = object.getString(charSequence.toString(), null);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            charSequence2 = object.getString(charSequence2.toString(), "anonymous");
            CharSequence charSequence3 = new StringBuilder();
            charSequence3.append("initialPath_");
            charSequence3.append(n8);
            charSequence3 = object.getString(charSequence3.toString(), null);
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
            return new s(f.J0, n8, (String)charSequence, (String)charSequence2, (String)object, (String)charSequence3, l8, l9);
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("SMBPrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        @Override
        public ax.Z2.o k(int n8) {
            ax.Z2.o o8 = new ax.Z2.o();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("SMBPrefs", 0);
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("version_");
            ((StringBuilder)charSequence).append(n8);
            int n9 = sharedPreferences.getInt(((StringBuilder)charSequence).toString(), 0);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("domain_");
            ((StringBuilder)charSequence).append(n8);
            o8.r(sharedPreferences.getString(((StringBuilder)charSequence).toString(), ""));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("host_");
            ((StringBuilder)charSequence).append(n8);
            charSequence = sharedPreferences.getString(((StringBuilder)charSequence).toString(), "");
            o8.s((String)charSequence);
            CharSequence charSequence2 = new StringBuilder();
            charSequence2.append("port_");
            charSequence2.append(n8);
            o8.z(sharedPreferences.getInt(charSequence2.toString(), 0));
            charSequence2 = new StringBuilder();
            charSequence2.append("username_");
            charSequence2.append(n8);
            o8.D(sharedPreferences.getString(charSequence2.toString(), "anonymous"));
            charSequence2 = new StringBuilder();
            charSequence2.append("password_");
            charSequence2.append(n8);
            charSequence2 = sharedPreferences.getString(charSequence2.toString(), "");
            o8.y(this.b.a(n9, (String)charSequence, (String)charSequence2));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("initialPath_");
            ((StringBuilder)charSequence).append(n8);
            o8.v(sharedPreferences.getString(((StringBuilder)charSequence).toString(), null));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name_");
            ((StringBuilder)charSequence).append(n8);
            o8.q(sharedPreferences.getString(((StringBuilder)charSequence).toString(), ""));
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("protocol_");
            ((StringBuilder)charSequence).append(n8);
            o8.B(sharedPreferences.getString(((StringBuilder)charSequence).toString(), n));
            return o8;
        }

        @Override
        public void l(int n8, ax.Z2.o o8, k k8, boolean bl) {
            int n9 = n8;
            if (n8 == -100) {
                n9 = this.m();
            }
            if (bl) {
                new a(this.a, o8, new c.a(){
                    final k a;
                    final int b;
                    final ax.Z2.o c;
                    final b d;
                    {
                        this.d = b8;
                        this.a = k8;
                        this.b = n8;
                        this.c = o8;
                    }

                    @Override
                    public void B() {
                        this.a.b(f.J0);
                    }

                    @Override
                    public void T(boolean bl, Object object) {
                        if (bl) {
                            this.d.o(this.b, this.c);
                            f f8 = f.J0;
                            object = x.d(f8, this.b);
                            if (((o)object).a()) {
                                ((Q)((o)object).u()).C0(false);
                                ((Q)((o)object).u()).q0();
                                ax.Z2.b.k().s(((o)object).T(), ((o)object).V());
                            }
                            this.a.c(f8, this.b);
                            return;
                        }
                        object = object instanceof String ? (String)object : null;
                        this.a.a(f.J0, this.c.d(), this.c.h(), this.c.k(), (String)object);
                    }
                }).i(new String[0]);
                return;
            }
            this.o(n9, o8);
            k8.c(f.J0, n9);
        }

        int m() {
            return this.a.getSharedPreferences("SMBPrefs", 0).getInt("count", 0);
        }

        public List<s> n() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("SMBPrefs", 0);
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

        void o(int n8, ax.Z2.o object) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("SMBPrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("version_");
            stringBuilder.append(n8);
            stringBuilder = context.putInt(stringBuilder.toString(), 3);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("domain_");
            stringBuilder2.append(n8);
            stringBuilder2 = stringBuilder.putString(stringBuilder2.toString(), ((ax.Z2.o)object).c());
            stringBuilder = new StringBuilder();
            stringBuilder.append("host_");
            stringBuilder.append(n8);
            stringBuilder = stringBuilder2.putString(stringBuilder.toString(), ((ax.Z2.o)object).d());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("username_");
            stringBuilder2.append(n8);
            stringBuilder2 = stringBuilder.putString(stringBuilder2.toString(), ((ax.Z2.o)object).k());
            stringBuilder = new StringBuilder();
            stringBuilder.append("password_");
            stringBuilder.append(n8);
            stringBuilder2 = stringBuilder2.putString(stringBuilder.toString(), this.b.e(((ax.Z2.o)object).d(), ((ax.Z2.o)object).g()));
            stringBuilder = new StringBuilder();
            stringBuilder.append("initialPath_");
            stringBuilder.append(n8);
            stringBuilder2 = stringBuilder2.putString(stringBuilder.toString(), ((ax.Z2.o)object).f());
            stringBuilder = new StringBuilder();
            stringBuilder.append("protocol_");
            stringBuilder.append(n8);
            stringBuilder = stringBuilder2.putString(stringBuilder.toString(), ((ax.Z2.o)object).j());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("name_");
            stringBuilder2.append(n8);
            stringBuilder.putString(stringBuilder2.toString(), ((ax.Z2.o)object).b());
            if (((ax.Z2.o)object).h() > 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("port_");
                stringBuilder.append(n8);
                context.putInt(stringBuilder.toString(), ((ax.Z2.o)object).h());
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append("port_");
                ((StringBuilder)object).append(n8);
                context.remove(((StringBuilder)object).toString());
            }
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

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}


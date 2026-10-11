/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.jb.b;
import ax.kb.f;
import ax.pb.A;
import ax.pb.C;
import ax.pb.D;
import ax.pb.G;
import ax.pb.H;
import ax.pb.I;
import ax.pb.J;
import ax.pb.M;
import ax.pb.P;
import ax.pb.Q;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.c0;
import ax.pb.d;
import ax.pb.d0;
import ax.pb.e;
import ax.pb.e0;
import ax.pb.f0;
import ax.pb.g;
import ax.pb.g0;
import ax.pb.h;
import ax.pb.i;
import ax.pb.j;
import ax.pb.k;
import ax.pb.k0;
import ax.pb.l;
import ax.pb.l0;
import ax.pb.m;
import ax.pb.m0;
import ax.pb.n;
import ax.pb.n0;
import ax.pb.o0;
import ax.pb.p;
import ax.pb.r;
import ax.pb.r0;
import ax.pb.s;
import ax.pb.s0;
import ax.pb.t0;
import ax.pb.u;
import ax.pb.u0;
import ax.pb.v;
import ax.pb.v0;
import ax.pb.w;
import ax.pb.w0;
import ax.pb.x;
import ax.pb.y;
import ax.pb.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;

public class b0
extends URLConnection
implements Z {
    static ax.qb.e A0 = ax.qb.e.a();
    static long B0 = 0L;
    static boolean C0 = false;
    protected static d D0;
    static final int y0 = 46;
    static final int z0 = 1472;
    private String c0;
    private long d0;
    private long e0;
    private int f0;
    private long g0;
    private long h0;
    private long i0;
    private boolean j0;
    private int k0;
    private v l0;
    private e m0;
    r n0;
    l0 o0;
    String p0;
    private String q;
    int q0;
    int r0;
    boolean s0;
    int t0;
    String u0;
    String v0;
    b[] w0;
    int x0;

    static {
        try {
            String string = a.c;
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        B0 = a.f("jcifs.smb.client.attrExpirationPeriod", 5000L);
        C0 = a.a("jcifs.smb.client.ignoreCopyToException", true);
        D0 = new d();
    }

    b0(b0 object, String charSequence, int n8, int n9, long l8, long l9, long l10) throws MalformedURLException, UnknownHostException {
        boolean bl = ((b0)object).J();
        Object object2 = "/";
        if (bl) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("smb://");
            ((StringBuilder)object2).append((String)charSequence);
            ((StringBuilder)object2).append("/");
            object2 = new URL(null, ((StringBuilder)object2).toString(), i.a);
        } else {
            URL uRL = ((URLConnection)object).url;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            if ((n9 & 0x10) <= 0) {
                object2 = "";
            }
            stringBuilder.append((String)object2);
            object2 = new URL(uRL, stringBuilder.toString());
        }
        this((URL)object2);
        this.n0 = ((b0)object).n0;
        if (((b0)object).c0 != null) {
            this.o0 = ((b0)object).o0;
            this.m0 = ((b0)object).m0;
        }
        int n10 = ((String)charSequence).length() - 1;
        object2 = charSequence;
        if (((String)charSequence).charAt(n10) == '/') {
            object2 = ((String)charSequence).substring(0, n10);
        }
        if (((b0)object).c0 == null) {
            this.p0 = "\\";
        } else if (((b0)object).p0.equals("\\")) {
            object = new StringBuilder();
            ((StringBuilder)object).append('\\');
            ((StringBuilder)object).append((String)object2);
            this.p0 = ((StringBuilder)object).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(((b0)object).p0);
            ((StringBuilder)charSequence).append('\\');
            ((StringBuilder)charSequence).append((String)object2);
            this.p0 = ((StringBuilder)charSequence).toString();
        }
        this.r0 = n8;
        this.f0 = n9;
        this.d0 = l8;
        this.e0 = l9;
        this.h0 = l10;
        this.j0 = true;
        this.i0 = l8 = System.currentTimeMillis() + B0;
        this.g0 = l8;
    }

    public b0(String string) throws MalformedURLException {
        this(new URL(null, string, i.a));
    }

    public b0(String string, r r8) throws MalformedURLException {
        this(new URL(null, string, i.a), r8);
    }

    public b0(String string, r r8, int n8) throws MalformedURLException {
        this(new URL(null, string, i.a), r8);
        if ((n8 & 0xFFFFFFF8) == 0) {
            this.k0 = n8;
            return;
        }
        throw new RuntimeException("Illegal shareAccess parameter");
    }

    public b0(URL uRL) {
        this(uRL, new r(uRL.getUserInfo()));
    }

    public b0(URL uRL, r r8) {
        super(uRL);
        this.k0 = 7;
        this.l0 = null;
        this.m0 = null;
        this.o0 = null;
        r r9 = r8;
        if (r8 == null) {
            r9 = new r(uRL.getUserInfo());
        }
        this.n0 = r9;
        this.D();
    }

    private long T(int n8) throws a0 {
        s0 s02 = new s0(n8);
        this.Y(new r0(n8), s02);
        if (this.r0 == 8) {
            this.h0 = s02.Z0.b();
            this.i0 = System.currentTimeMillis() + B0;
        }
        return s02.Z0.a();
    }

    static String U(String object, String string) {
        int n8;
        object = ((String)object).toCharArray();
        int n9 = 0;
        int n10 = 0;
        for (n8 = 0; n8 < ((Object)object).length; ++n8) {
            int n11;
            Object object2 = object[n8];
            if (object2 == 38) {
                if (n9 > n10 && new String((char[])object, n10, n9 - n10).equalsIgnoreCase(string)) {
                    n10 = n9 + 1;
                    return new String((char[])object, n10, n8 - n10);
                }
                n11 = n8 + 1;
            } else {
                n11 = n10;
                if (object2 == 61) {
                    n9 = n8;
                    n11 = n10;
                }
            }
            n10 = n11;
        }
        if (n9 > n10 && new String((char[])object, n10, n9 - n10).equalsIgnoreCase(string)) {
            n8 = n9 + 1;
            return new String((char[])object, n8, ((Object)object).length - n8);
        }
        return null;
    }

    private v a() {
        if (this.l0 == null) {
            this.l0 = new v();
        }
        return this.l0;
    }

    public String A() {
        String string;
        String string2 = string = this.url.getHost();
        if (string.length() == 0) {
            string2 = null;
        }
        return string2;
    }

    String B() {
        e e8 = this.m0;
        if (e8 != null) {
            return e8.f0;
        }
        return this.A();
    }

    public int C() throws a0 {
        block3: {
            block6: {
                int n8;
                b b8;
                block5: {
                    block4: {
                        if (this.r0 != 0) break block3;
                        if (this.D().length() <= 1) break block4;
                        this.r0 = 1;
                        break block3;
                    }
                    if (this.c0 == null) break block5;
                    this.g();
                    this.r0 = this.c0.equals("IPC$") ? 16 : (this.o0.d.equals("LPT1:") ? 32 : (this.o0.d.equals("COMM") ? 64 : 8));
                    break block3;
                }
                if (this.url.getAuthority() == null || this.url.getAuthority().length() == 0) break block6;
                try {
                    b8 = this.t();
                }
                catch (UnknownHostException unknownHostException) {
                    throw new a0(this.url.toString(), (Throwable)unknownHostException);
                }
                if (b8.b() instanceof ax.nb.g && ((n8 = ((ax.nb.g)b8.b()).v()) == 29 || n8 == 27)) {
                    this.r0 = 2;
                    return 2;
                }
                this.r0 = 4;
                break block3;
            }
            this.r0 = 2;
        }
        return this.r0;
    }

    /*
     * Unable to fully structure code
     */
    String D() {
        if (this.p0 == null) {
            var9_1 = this.url.getPath().toCharArray();
            var8_2 = new char[((char[])var9_1).length];
            var6_3 = ((char[])var9_1).length;
            var2_5 = 0;
            var3_6 = 0;
            block0: for (var4_4 = 0; var4_4 < var6_3; ++var4_4) {
                if (var3_6 != 0) {
                    if (var3_6 != 1) {
                        var5_8 = var3_6;
                        if (var3_6 != 2) {
                            continue;
                        }
                    } else {
                        var7_9 = var9_1[var4_4];
                        if (var7_9 == '/') continue;
                        if (var7_9 == '.' && ((var5_8 = var4_4 + 1) >= var6_3 || var9_1[var5_8] == 47)) {
                            var4_4 = var5_8;
                            continue;
                        }
                        var5_8 = var4_4 + 1;
                        if (var5_8 < var6_3 && var7_9 == '.' && var9_1[var5_8] == 46 && ((var5_8 = var4_4 + 2) >= var6_3 || var9_1[var5_8] == 47)) {
                            var4_4 = var2_5;
                            if (var2_5 == 1) {
                                while (true) {
                                    var4_4 = var5_8;
                                    continue block0;
                                    break;
                                }
                            }
                            while (true) {
                                if ((var2_5 = var4_4 - 1) <= 1 || var8_2[var4_4 - 2] == '/') ** continue;
                                var4_4 = var2_5;
                            }
                        }
                        var5_8 = 2;
                    }
                    var1_7 = var9_1[var4_4];
                    var3_6 = var5_8;
                    if (var1_7 == '/') {
                        var3_6 = 1;
                    }
                    var8_2[var2_5] = var1_7;
                    ++var2_5;
                    continue;
                }
                var1_7 = var9_1[var4_4];
                if (var1_7 != '/') {
                    return null;
                }
                var8_2[var2_5] = var1_7;
                ++var2_5;
                var3_6 = 1;
            }
            var9_1 = new String((char[])var8_2, 0, var2_5);
            this.q = var9_1;
            if (var2_5 > 1) {
                var3_6 = var2_5 - 1;
                var4_4 = var9_1.indexOf(47, 1);
                if (var4_4 < 0) {
                    this.c0 = this.q.substring(1);
                    this.p0 = "\\";
                } else if (var4_4 == var3_6) {
                    this.c0 = this.q.substring(1, var4_4);
                    this.p0 = "\\";
                } else {
                    this.c0 = this.q.substring(1, var4_4);
                    var9_1 = this.q;
                    if (var8_2[var3_6] == '/') {
                        var2_5 = var3_6;
                    }
                    var8_2 = var9_1.substring(var4_4, var2_5);
                    this.p0 = var8_2;
                    this.p0 = var8_2.replace('/', '\\');
                }
            } else {
                this.c0 = null;
                this.p0 = "\\";
            }
        }
        return this.p0;
    }

    boolean E() {
        return this.x0 < this.w0.length;
    }

    boolean F() {
        l0 l02 = this.o0;
        return l02 != null && l02.a == 2;
    }

    public boolean G() throws a0 {
        if (this.D().length() == 1) {
            return true;
        }
        if (!this.s()) {
            return false;
        }
        return (this.f0 & 0x10) == 16;
    }

    public boolean H() throws a0 {
        if (this.c0 == null) {
            return false;
        }
        if (this.D().length() == 1) {
            return this.c0.endsWith("$");
        }
        this.s();
        return (this.f0 & 2) == 2;
    }

    boolean I() {
        return this.s0 && this.F() && this.t0 == this.o0.i;
    }

    boolean J() throws UnknownHostException {
        if (this.r0 != 2 && this.url.getHost().length() != 0) {
            this.D();
            if (this.c0 == null) {
                int n8;
                b b8 = this.t();
                if (b8.b() instanceof ax.nb.g && ((n8 = ((ax.nb.g)b8.b()).v()) == 29 || n8 == 27)) {
                    this.r0 = 2;
                    return true;
                }
                this.r0 = 4;
            }
            return false;
        }
        this.r0 = 2;
        return true;
    }

    public long K() throws a0 {
        if (this.D().length() > 1) {
            this.s();
            return this.e0;
        }
        return 0L;
    }

    public long L() throws a0 {
        if (this.i0 > System.currentTimeMillis()) {
            return this.h0;
        }
        if (this.C() == 8) {
            s0 s02 = new s0(1);
            this.Y(new r0(1), s02);
            this.h0 = s02.Z0.b();
        } else {
            this.h0 = this.D().length() > 1 && this.r0 != 16 ? this.V(this.D(), 258).getSize() : 0L;
        }
        this.i0 = System.currentTimeMillis() + B0;
        return this.h0;
    }

    public b0[] M() throws a0 {
        return this.N("*", 22, null, null);
    }

    b0[] N(String string, int n8, f0 f02, c0 c02) throws a0 {
        ArrayList arrayList = new ArrayList();
        this.m(arrayList, true, string, n8, f02, c02);
        return arrayList.toArray(new b0[arrayList.size()]);
    }

    public void O() throws a0 {
        String string = this.D();
        if (string.length() != 1) {
            if (ax.qb.e.c0 >= 3) {
                ax.qb.e e8 = A0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mkdir: ");
                stringBuilder.append(string);
                e8.println(stringBuilder.toString());
            }
            this.Y(new x(string), this.a());
            this.i0 = 0L;
            this.g0 = 0L;
            return;
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    boolean P(s object) {
        if (this.o0 == null) {
            return true;
        }
        String string = ((s)object).x0;
        if (string == null) {
            return false;
        }
        byte by = ((s)object).d0;
        String string2 = "A:";
        object = by != 37 && by != 50 ? string2 : ((((P)object).Y0 & 0xFF) != 16 ? string2 : null);
        if (this.u0 != object) {
            return true;
        }
        object = this.v0;
        return object == null ? string != null : !((String)object).equals(string);
    }

    void Q(int n8, int n9, int n10, int n11) throws a0 {
        if (this.I()) {
            return;
        }
        this.q0 = this.R(n8, n9, n10, n11);
        this.s0 = true;
        this.t0 = this.o0.i;
    }

    int R(int n8, int n9, int n10, int n11) throws a0 {
        Object object;
        Object object2;
        this.g();
        if (ax.qb.e.c0 >= 3) {
            object2 = A0;
            object = new StringBuilder();
            ((StringBuilder)object).append("open0: ");
            ((StringBuilder)object).append(this.p0);
            ((PrintStream)object2).println(((StringBuilder)object).toString());
        }
        if (this.o0.f.h.u(16)) {
            object = new D();
            object2 = new C(this.p0, n8, n9, this.k0, n10, n11, null);
            if (this instanceof g0) {
                ((C)object2).O0 |= 0x16;
                ((C)object2).P0 |= 0x20000;
                ((D)object).S0 = true;
            }
            this.Y((s)object2, (s)object);
            n8 = ((D)object).G0;
            this.f0 = ((D)object).I0 & Short.MAX_VALUE;
            this.g0 = System.currentTimeMillis() + B0;
            this.j0 = true;
            return n8;
        }
        object = new H();
        this.Y(new G(this.p0, n9, n8, null), (s)object);
        return ((H)object).F0;
    }

    protected boolean S(String string, String string2) {
        int n8 = string.lastIndexOf(47);
        int n9 = string2.lastIndexOf(47);
        int n10 = string.length() - n8;
        int n11 = string2.length() - n9;
        if (n10 > 1 && string.charAt(n8 + 1) == '.') {
            return true;
        }
        if (n11 > 1 && string2.charAt(n9 + 1) == '.') {
            return true;
        }
        return n10 == n11 && string.regionMatches(true, n8, string2, n9, n10);
    }

    j V(String string, int n8) throws a0 {
        Object object;
        this.g();
        if (ax.qb.e.c0 >= 3) {
            ax.qb.e e8 = A0;
            object = new StringBuilder();
            ((StringBuilder)object).append("queryPath: ");
            ((StringBuilder)object).append(string);
            e8.println(((StringBuilder)object).toString());
        }
        if (this.o0.f.h.u(16)) {
            object = new u0(n8);
            this.Y(new t0(string, n8), (s)object);
            return ((u0)object).Z0;
        }
        object = new J((long)(this.o0.f.h.w0.n * 1000) * 60L);
        this.Y(new I(string), (s)object);
        return object;
    }

    public void W(b0 b02) throws a0 {
        if (this.D().length() != 1 && b02.D().length() != 1) {
            if (this.p0 == null || this.o0 == null) {
                this.X(null);
            }
            if (b02.p0 == null || b02.o0 == null) {
                b02.X(null);
            }
            if (this.o0.equals(b02.o0)) {
                if (ax.qb.e.c0 >= 3) {
                    ax.qb.e e8 = A0;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("renameTo: ");
                    stringBuilder.append(this.p0);
                    stringBuilder.append(" -> ");
                    stringBuilder.append(b02.p0);
                    e8.println(stringBuilder.toString());
                }
                this.i0 = 0L;
                this.g0 = 0L;
                b02.g0 = 0L;
                this.Y(new M(this.p0, b02.p0), this.a());
                return;
            }
            throw new a0("Invalid operation for workgroups, servers, or shares");
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void X(s s8) throws a0 {
        boolean bl;
        block21: {
            Object object;
            String string;
            int n8;
            Object var9_7;
            e e8;
            Object object2;
            Object object3;
            block23: {
                block22: {
                    bl = s8 instanceof w;
                    if (bl) {
                        return;
                    }
                    this.g();
                    object3 = D0;
                    object2 = this.o0;
                    e8 = ((d)object3).f(((l0)object2).f.h.E0, ((l0)object2).c, this.p0, this.n0);
                    if (e8 == null) break block21;
                    var9_7 = null;
                    if (s8 == null) break block22;
                    n8 = s8.d0;
                    string = "A:";
                    if (n8 != 37 && n8 != 50 || (((P)s8).Y0 & 0xFF) != 16) break block23;
                }
                string = null;
            }
            object2 = e8;
            do {
                IOException iOException2;
                block20: {
                    block19: {
                        try {
                            if (ax.qb.e.c0 < 2) break block19;
                            object3 = A0;
                            object = new StringBuilder();
                            ((StringBuilder)object).append("DFS redirect: ");
                            ((StringBuilder)object).append(object2);
                            ((PrintStream)object3).println(((StringBuilder)object).toString());
                        }
                        catch (IOException iOException2) {
                            break block20;
                        }
                    }
                    object3 = ax.pb.k0.s(b.d(((e)object2).f0), this.url.getPort());
                    ((k0)object3).n();
                    this.o0 = ((k0)object3).r(this.n0).a(((e)object2).g0, string);
                    object = object2;
                    object3 = var9_7;
                    if (object2 == e8) break;
                    String string2 = ((e)object2).n0;
                    object = object2;
                    object3 = var9_7;
                    if (string2 == null) break;
                    ((e)object2).m0.put(string2, object2);
                    object = object2;
                    object3 = var9_7;
                    break;
                }
                object3 = iOException2 instanceof a0 ? (a0)iOException2 : new a0(((e)object2).f0, (Throwable)iOException2);
                object2 = object = ((e)object2).l0;
            } while (object != e8);
            if (object3 != null) throw object3;
            if (ax.qb.e.c0 >= 3) {
                A0.println(object);
            }
            this.m0 = object;
            n8 = ((e)object).d0;
            if (n8 < 0) {
                ((e)object).d0 = 0;
            } else if (n8 > this.p0.length()) {
                ((e)object).d0 = this.p0.length();
            }
            object3 = object2 = this.p0.substring(((e)object).d0);
            if (((String)object2).equals("")) {
                object3 = "\\";
            }
            object2 = object3;
            if (!((e)object).i0.equals("")) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("\\");
                ((StringBuilder)object2).append(((e)object).i0);
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
            }
            this.p0 = object2;
            object3 = object2;
            if (s8 != null) {
                string = s8.x0;
                object3 = object2;
                if (string != null) {
                    object3 = object2;
                    if (string.endsWith("\\")) {
                        object3 = object2;
                        if (!((String)object2).endsWith("\\")) {
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append("\\");
                            object3 = ((StringBuilder)object3).toString();
                        }
                    }
                }
            }
            if (s8 == null) return;
            s8.x0 = object3;
            s8.j0 |= 0x1000;
            return;
        }
        if (this.o0.h && !bl) {
            if (!(s8 instanceof A)) throw new a0(-1073741275, false);
        }
        if (s8 == null) return;
        s8.j0 &= 0xFFFFEFFF;
    }

    void Y(s s8, s s9) throws a0 {
        while (true) {
            if (this.P(s8)) {
                this.c0(s8);
                this.X(s8);
            }
            try {
                this.o0.b(s8, s9);
                return;
            }
            catch (e e8) {
                if (!e8.j0) {
                    s8.s();
                    continue;
                }
                throw e8;
            }
            break;
        }
    }

    public void Z(int n8) throws a0 {
        if (this.D().length() != 1) {
            this.b0(n8 & 0x30A7, 0L, 0L);
            return;
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    public void a0(long l8) throws a0 {
        if (this.D().length() != 1) {
            this.b0(0, 0L, l8);
            return;
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    public boolean b() throws a0 {
        if (this.C() == 16) {
            return true;
        }
        return this.s();
    }

    void b0(int n8, long l8, long l9) throws a0 {
        this.s();
        int n9 = this.f0 & 0x10;
        int n10 = n9 != 0 ? 1 : 64;
        n10 = this.R(1, 256, n9, n10);
        this.Y(new v0(n10, n8 | n9, l8, l9), new w0());
        this.e(n10, 0L);
        this.g0 = 0L;
    }

    public boolean c() throws a0 {
        if (this.C() == 16) {
            return true;
        }
        return this.s() && (this.f0 & 1) == 0;
    }

    void c0(s s8) {
        String string;
        block3: {
            block2: {
                if (s8 == null) break block2;
                byte by = s8.d0;
                string = "A:";
                if (by != 37 && by != 50 || (((P)s8).Y0 & 0xFF) != 16) break block3;
            }
            string = null;
        }
        this.u0 = string;
        this.v0 = s8.x0;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void connect() throws IOException {
        if (this.F()) {
            l0 l02 = this.o0;
            if (l02.f.h.E0 == null) {
                l02.d(true);
            }
        }
        if (this.F()) return;
        this.D();
        this.x();
        while (true) {
            try {
                this.k();
                return;
            }
            catch (a0 a02) {
                if (this.y() == null) throw a02;
                if (ax.qb.e.c0 < 3) continue;
                a02.printStackTrace(A0);
                continue;
            }
            break;
        }
        catch (u u8) {
            throw u8;
        }
    }

    void d() throws a0 {
        this.f(0L);
    }

    public void d0() throws a0 {
        this.Z(this.u() & 0xFFFFFFFE);
    }

    void e(int n8, long l8) throws a0 {
        if (ax.qb.e.c0 >= 3) {
            ax.qb.e e8 = A0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("close: ");
            stringBuilder.append(n8);
            e8.println(stringBuilder.toString());
        }
        this.Y(new w(n8, l8), this.a());
    }

    public boolean equals(Object object) {
        if (object instanceof b0) {
            b0 b02 = (b0)object;
            if (this == b02) {
                return true;
            }
            if (this.S(this.url.getPath(), b02.url.getPath())) {
                this.D();
                b02.D();
                if (this.q.equalsIgnoreCase(b02.q)) {
                    try {
                        boolean bl = this.t().equals(b02.t());
                        return bl;
                    }
                    catch (UnknownHostException unknownHostException) {
                        return this.A().equalsIgnoreCase(b02.A());
                    }
                }
            }
        }
        return false;
    }

    void f(long l8) throws a0 {
        if (!this.I()) {
            return;
        }
        this.e(this.q0, l8);
        this.s0 = false;
    }

    void g() throws a0 {
        try {
            this.connect();
            return;
        }
        catch (IOException iOException) {
            throw new a0("Failed to connect to server", (Throwable)iOException);
        }
        catch (a0 a02) {
            throw a02;
        }
        catch (UnknownHostException unknownHostException) {
            throw new a0("Failed to connect to server", (Throwable)unknownHostException);
        }
    }

    @Override
    public int getContentLength() {
        long l8;
        try {
            l8 = this.L();
        }
        catch (a0 a02) {
            return 0;
        }
        return (int)(l8 & 0xFFFFFFFFL);
    }

    @Override
    public long getDate() {
        try {
            long l8 = this.K();
            return l8;
        }
        catch (a0 a02) {
            return 0L;
        }
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new d0(this);
    }

    @Override
    public long getLastModified() {
        try {
            long l8 = this.K();
            return l8;
        }
        catch (a0 a02) {
            return 0L;
        }
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return new e0(this);
    }

    public void h() throws a0 {
        if (this.D().length() != 1) {
            this.e(this.R(51, 0, 128, 0), 0L);
            return;
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    public int hashCode() {
        int n8;
        try {
            n8 = this.t().hashCode();
        }
        catch (UnknownHostException unknownHostException) {
            n8 = this.A().toUpperCase().hashCode();
        }
        this.D();
        return n8 + this.q.toUpperCase().hashCode();
    }

    public void i() throws a0 {
        this.s();
        this.D();
        this.j(this.p0);
    }

    void j(String string) throws a0 {
        block7: {
            block9: {
                block8: {
                    a0 a022;
                    block6: {
                        b0[] b0Array;
                        if (this.D().length() == 1) break block7;
                        long l8 = System.currentTimeMillis();
                        long l9 = this.g0;
                        int n8 = 0;
                        if (l8 > l9) {
                            this.f0 = 17;
                            this.d0 = 0L;
                            this.e0 = 0L;
                            this.j0 = false;
                            b0Array = this.V(this.D(), 257);
                            this.f0 = b0Array.b();
                            this.d0 = b0Array.a();
                            this.e0 = b0Array.c();
                            this.g0 = System.currentTimeMillis() + B0;
                            this.j0 = true;
                        }
                        if ((1 & this.f0) != 0) {
                            this.d0();
                        }
                        if (ax.qb.e.c0 >= 3) {
                            b0Array = A0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("delete: ");
                            stringBuilder.append(string);
                            b0Array.println(stringBuilder.toString());
                        }
                        if ((this.f0 & 0x10) == 0) break block8;
                        try {
                            b0Array = this.N("*", 22, null, null);
                            while (n8 < b0Array.length) {
                                b0Array[n8].i();
                                ++n8;
                            }
                        }
                        catch (a0 a022) {
                            if (a022.c() != -1073741809) break block6;
                        }
                        this.Y(new z(string), this.a());
                        break block9;
                    }
                    throw a022;
                }
                this.Y(new y(string), this.a());
            }
            this.i0 = 0L;
            this.g0 = 0L;
            return;
        }
        throw new a0("Invalid operation for workgroups, servers, or shares");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void k() throws IOException {
        u u82;
        boolean bl;
        boolean bl2;
        Object object;
        String string;
        Object object2;
        block10: {
            block9: {
                b b8 = this.t();
                object2 = this.o0;
                if (object2 != null) {
                    object2 = ((l0)object2).f.h;
                } else {
                    object2 = ax.pb.k0.s(b8, this.url.getPort());
                    this.o0 = ((k0)object2).r(this.n0).a(this.c0, null);
                }
                string = this.B();
                object = this.o0;
                Serializable serializable = D0.f(string, ((l0)object).c, null, this.n0);
                bl2 = false;
                bl = serializable != null;
                ((l0)object).h = bl;
                object = this.o0;
                if (((l0)object).h) {
                    ((l0)object).a = 2;
                }
                try {
                    if (ax.qb.e.c0 < 3) break block9;
                    object = A0;
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("doConnect: ");
                    ((StringBuilder)serializable).append(b8);
                    ((PrintStream)object).println(((StringBuilder)serializable).toString());
                }
                catch (u u82) {
                    break block10;
                }
            }
            this.o0.c(null, null);
            return;
        }
        if (this.c0 == null) {
            this.o0 = object2 = ((k0)object2).r(r.q0).a(null, null);
            ((l0)object2).c(null, null);
            return;
        }
        object = p.a(this.url.toString(), u82);
        if (object == null) {
            if (ax.qb.e.c0 < 1) throw u82;
            if (!this.E()) throw u82;
            u82.printStackTrace(A0);
            throw u82;
        }
        this.n0 = object;
        this.o0 = object2 = ((k0)object2).r((r)object).a(this.c0, null);
        bl = bl2;
        if (D0.f(string, ((l0)object2).c, null, this.n0) != null) {
            bl = true;
        }
        ((l0)object2).h = bl;
        object2 = this.o0;
        if (((l0)object2).h) {
            ((l0)object2).a = 2;
        }
        ((l0)object2).c(null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    h[] l() throws IOException {
        Throwable throwable2;
        h[] hArray;
        Object object;
        block7: {
            object = new StringBuilder();
            ((StringBuilder)object).append("ncacn_np:");
            ((StringBuilder)object).append(this.t().f());
            ((StringBuilder)object).append("[\\PIPE\\netdfs]");
            object = f.e(((StringBuilder)object).toString(), this.n0);
            try {
                hArray = new ax.lb.a(this.A());
                ((f)object).g((ax.kb.g)hArray);
                if (hArray.h != 0) break block7;
                hArray = hArray.j();
            }
            catch (Throwable throwable2) {}
            try {
                ((f)object).b();
                return hArray;
            }
            catch (IOException iOException) {
                if (ax.qb.e.c0 < 4) return hArray;
                iOException.printStackTrace(A0);
                return hArray;
            }
        }
        a0 a02 = new a0(hArray.h, true);
        throw a02;
        try {
            ((f)object).b();
            throw throwable2;
        }
        catch (IOException iOException) {
            if (ax.qb.e.c0 < 4) throw throwable2;
            iOException.printStackTrace(A0);
        }
        throw throwable2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void m(ArrayList arrayList, boolean bl, String string, int n8, f0 f02, c0 c02) throws a0 {
        Throwable var1_7;
        Throwable var1_5;
        int n9;
        String string2;
        block13: {
            string2 = string;
            n9 = n8;
            if (c02 != null) {
                string2 = string;
                n9 = n8;
                if (c02 instanceof g) {
                    g g8 = (g)c02;
                    string2 = g8.a;
                    if (string2 != null) {
                        string = string2;
                    }
                    n9 = g8.b;
                    string2 = string;
                }
            }
            try {
                n8 = this.url.getHost().length();
                if (n8 == 0) break block13;
            }
            catch (MalformedURLException malformedURLException) {
                throw new a0(this.url.toString(), (Throwable)var1_5);
            }
            catch (UnknownHostException unknownHostException) {
                throw new a0(this.url.toString(), (Throwable)var1_7);
            }
            try {
                if (this.C() == 2) break block13;
                if (this.c0 == null) {
                    this.r(arrayList, bl, string2, n9, f02, c02);
                    return;
                }
            }
            catch (MalformedURLException malformedURLException) {
                throw new a0(this.url.toString(), (Throwable)var1_5);
            }
            catch (UnknownHostException unknownHostException) {
                throw new a0(this.url.toString(), (Throwable)var1_7);
            }
            this.n(arrayList, bl, string2, n9, f02, c02);
            return;
        }
        try {
            this.p(arrayList, bl, string2, n9, f02, c02);
            return;
        }
        catch (MalformedURLException malformedURLException) {
            throw new a0(this.url.toString(), (Throwable)var1_5);
        }
        catch (UnknownHostException unknownHostException) {
            throw new a0(this.url.toString(), (Throwable)var1_7);
        }
    }

    void n(ArrayList object, boolean bl, String object2, int n8, f0 f02, c0 c02) throws a0, UnknownHostException, MalformedURLException {
        Object object3 = this.D();
        Object object4 = this.url.getPath();
        if (((String)object4).lastIndexOf(47) == ((String)object4).length() - 1) {
            Object object5;
            object4 = new m0((String)object3, (String)object2, n8);
            object3 = new n0();
            if (ax.qb.e.c0 >= 3) {
                object5 = A0;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("doFindFirstNext: ");
                ((StringBuilder)object2).append(((s)object4).x0);
                ((PrintStream)object5).println(((StringBuilder)object2).toString());
            }
            this.Y((s)object4, (s)object3);
            n8 = ((n0)object3).Y0;
            object2 = new o0(n8, ((n0)object3).e1, ((n0)object3).d1);
            ((Q)object3).R0 = (byte)2;
            while (true) {
                int n9;
                for (int i8 = 0; i8 < (n9 = ((Q)object3).W0); ++i8) {
                    object5 = ((Q)object3).X0[i8];
                    object4 = object5.getName();
                    if (((String)object4).length() < 3 && ((n9 = ((String)object4).hashCode()) == y0 || n9 == z0) && (((String)object4).equals(".") || ((String)object4).equals("..")) || f02 != null && !f02.a(this, (String)object4) || ((String)object4).length() <= 0) continue;
                    object5 = new b0(this, (String)object4, 1, object5.b(), object5.c(), object5.h(), object5.length());
                    if (c02 != null && !c02.a((b0)object5)) continue;
                    if (bl) {
                        ((ArrayList)object).add(object5);
                        continue;
                    }
                    ((ArrayList)object).add(object4);
                }
                if (((n0)object3).Z0 || n9 == 0) break;
                ((P)object2).E(((n0)object3).e1, ((n0)object3).d1);
                ((Q)object3).s();
                this.Y((s)object2, (s)object3);
            }
            try {
                object = new A(n8);
                this.Y((s)object, this.a());
                return;
            }
            catch (a0 a02) {
                if (ax.qb.e.c0 >= 4) {
                    a02.printStackTrace(A0);
                }
                return;
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.url.toString());
        ((StringBuilder)object).append(" directory must end with '/'");
        throw new a0(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    h[] o() throws IOException {
        Throwable throwable2;
        Object object;
        h[] hArray;
        block7: {
            hArray = new ax.lb.b(this.url.getHost());
            object = new StringBuilder();
            ((StringBuilder)object).append("ncacn_np:");
            ((StringBuilder)object).append(this.t().f());
            ((StringBuilder)object).append("[\\PIPE\\srvsvc]");
            object = f.e(((StringBuilder)object).toString(), this.n0);
            try {
                ((f)object).g((ax.kb.g)hArray);
                if (hArray.h != 0) break block7;
                hArray = hArray.j();
            }
            catch (Throwable throwable2) {}
            try {
                ((f)object).b();
                return hArray;
            }
            catch (IOException iOException) {
                if (ax.qb.e.c0 < 4) return hArray;
                iOException.printStackTrace(A0);
                return hArray;
            }
        }
        a0 a02 = new a0(hArray.h, true);
        throw a02;
        try {
            ((f)object).b();
            throw throwable2;
        }
        catch (IOException iOException) {
            if (ax.qb.e.c0 < 4) throw throwable2;
            iOException.printStackTrace(A0);
        }
        throw throwable2;
    }

    void p(ArrayList serializable, boolean bl, String object, int n8, f0 f02, c0 c02) throws a0, UnknownHostException, MalformedURLException {
        block10: {
            boolean bl2;
            l l8;
            block9: {
                block8: {
                    n8 = this.url.getHost().length() == 0 ? 0 : this.C();
                    if (n8 != 0) break block8;
                    this.g();
                    object = new k(this.o0.f.h.w0.e, Integer.MIN_VALUE);
                    l8 = new l();
                    break block9;
                }
                if (n8 != 2) break block10;
                object = new k(this.url.getHost(), -1);
                l8 = new l();
            }
            do {
                int n9;
                this.Y((s)object, l8);
                n8 = l8.V0;
                if (n8 != 0 && n8 != 234) {
                    throw new a0(l8.V0, true);
                }
                bl2 = n8 == 234;
                n8 = n9 = l8.W0;
                if (bl2) {
                    n8 = n9 - 1;
                }
                for (n9 = 0; n9 < n8; ++n9) {
                    Object object2 = l8.X0[n9];
                    String string = object2.getName();
                    if (f02 != null && !f02.a(this, string) || string.length() <= 0) continue;
                    object2 = new b0(this, string, object2.a(), 17, 0L, 0L, 0L);
                    if (c02 != null && !c02.a((b0)object2)) continue;
                    if (bl) {
                        ((ArrayList)serializable).add(object2);
                        continue;
                    }
                    ((ArrayList)serializable).add(string);
                }
                if (this.C() != 2) break;
                ((P)object).Y0 = (byte)-41;
                ((P)object).E(0, l8.a1);
                l8.s();
            } while (bl2);
            return;
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("The requested list operations is invalid: ");
        ((StringBuilder)serializable).append(this.url.toString());
        throw new a0(((StringBuilder)serializable).toString());
    }

    h[] q() throws a0 {
        m m8 = new m();
        n n8 = new n();
        this.Y(m8, n8);
        if (n8.V0 == 0) {
            return n8.X0;
        }
        throw new a0(n8.V0, true);
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void r(ArrayList var1_1, boolean var2_2, String var3_3, int var4_6, f0 var5_7, c0 var6_8) throws a0, UnknownHostException, MalformedURLException {
        block21: {
            block22: {
                block20: {
                    var3_3 = this.url.getPath();
                    if (var3_3.lastIndexOf(47) != var3_3.length() - 1) {
                        var1_1 = new StringBuilder();
                        var1_1.append(this.url.toString());
                        var1_1.append(" directory must end with '/'");
                        throw new a0(var1_1.toString());
                    }
                    if (this.C() != 4) {
                        var1_1 = new StringBuilder();
                        var1_1.append("The requested list operations is invalid: ");
                        var1_1.append(this.url.toString());
                        throw new a0(var1_1.toString());
                    }
                    var8_9 = new HashMap<h[], h[]>();
                    if (!b0.D0.e(this.A(), this.n0)) break block21;
                    try {
                        var3_3 = this.l();
                        var4_6 = 0;
lbl21:
                        // 2 sources

                        while (var4_6 < ((Object)var3_3).length) {
                            var7_10 = var3_3[var4_6];
                            if (var8_9.containsKey(var7_10)) break block20;
                            var8_9.put(var7_10, var7_10);
                            break block20;
                        }
                        break block21;
                    }
                    catch (IOException var3_4) {
                        break block22;
                    }
                }
                ++var4_6;
                ** GOTO lbl21
            }
            if (ax.qb.e.c0 >= 4) {
                var3_4.printStackTrace(b0.A0);
            }
        }
        var7_10 = this.x();
        var3_3 = null;
        while (var7_10 != null) {
            block23: {
                this.k();
                {
                    catch (IOException var3_5) {}
                }
                try {
                    var7_10 = this.o();
                }
                catch (IOException var7_11) {
                    if (ax.qb.e.c0 >= 3) {
                        var7_11.printStackTrace(b0.A0);
                    }
                    var7_10 = this.q();
                    break block23;
                    if (ax.qb.e.c0 >= 3) {
                        var3_5.printStackTrace(b0.A0);
                    }
                    var7_10 = this.y();
                    continue;
                }
            }
            for (var4_6 = 0; var4_6 < ((h[])var7_10).length; ++var4_6) {
                var9_12 = var7_10[var4_6];
                if (var8_9.containsKey(var9_12)) continue;
                var8_9.put(var9_12, var9_12);
            }
        }
        if (var3_3 != null && var8_9.isEmpty()) {
            if (!(var3_3 instanceof a0)) {
                throw new a0(this.url.toString(), (Throwable)var3_3);
            }
            throw (a0)var3_3;
        }
        var3_3 = var8_9.keySet().iterator();
        while (true) {
            if (!var3_3.hasNext()) {
                return;
            }
            var8_9 = (h)var3_3.next();
            var7_10 = var8_9.getName();
            if (var5_7 != null && !var5_7.a(this, (String)var7_10) || var7_10.length() <= 0) continue;
            var8_9 = new b0(this, (String)var7_10, var8_9.a(), 17, 0L, 0L, 0L);
            if (var6_8 != null && !var6_8.a((b0)var8_9)) continue;
            if (var2_2) {
                var1_1.add(var8_9);
                continue;
            }
            var1_1.add(var7_10);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean s() throws a0 {
        block13: {
            a0 a02222;
            block12: {
                block9: {
                    block10: {
                        block11: {
                            if (this.g0 > System.currentTimeMillis()) {
                                return this.j0;
                            }
                            this.f0 = 17;
                            this.d0 = 0L;
                            this.e0 = 0L;
                            this.j0 = false;
                            try {
                                if (this.url.getHost().length() == 0) break block9;
                                if (this.c0 != null) break block10;
                                if (this.C() != 2) break block11;
                                b.e(this.url.getHost(), true);
                                break block9;
                            }
                            catch (a0 a02222) {
                                break block12;
                            }
                        }
                        b.d(this.url.getHost()).g();
                        break block9;
                    }
                    if (this.D().length() != 1 && !this.c0.equalsIgnoreCase("IPC$")) {
                        j j8 = this.V(this.D(), 257);
                        this.f0 = j8.b();
                        this.d0 = j8.a();
                        this.e0 = j8.c();
                    } else {
                        this.g();
                    }
                }
                this.j0 = true;
                break block13;
            }
            switch (a02222.c()) {
                default: {
                    throw a02222;
                }
                case -1073741809: 
                case -1073741773: 
                case -1073741772: 
                case -1073741766: 
            }
            break block13;
            catch (UnknownHostException unknownHostException) {}
        }
        this.g0 = System.currentTimeMillis() + B0;
        return this.j0;
    }

    b t() throws UnknownHostException {
        int n8 = this.x0;
        if (n8 == 0) {
            return this.x();
        }
        return this.w0[n8 - 1];
    }

    @Override
    public String toString() {
        return this.url.toString();
    }

    public int u() throws a0 {
        if (this.D().length() == 1) {
            return 0;
        }
        this.s();
        return this.f0 & Short.MAX_VALUE;
    }

    public String v() {
        CharSequence charSequence = this.url.getAuthority();
        this.D();
        if (((String)charSequence).length() > 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("smb://");
            ((StringBuilder)charSequence).append(this.url.getAuthority());
            ((StringBuilder)charSequence).append(this.q);
            return ((StringBuilder)charSequence).toString();
        }
        return "smb://";
    }

    public long w() throws a0 {
        if (this.C() != 8 && this.r0 != 1) {
            return 0L;
        }
        try {
            long l8 = this.T(1007);
            return l8;
        }
        catch (a0 a02) {
            int n8 = a02.c();
            if (n8 != -1073741823 && n8 != -1073741821) {
                throw a02;
            }
            return this.T(1);
        }
    }

    b x() throws UnknownHostException {
        this.x0 = 0;
        b[] bArray = this.url.getHost();
        b[] bArray2 = this.url.getPath();
        String string = this.url.getQuery();
        if (string != null) {
            Object object = b0.U(string, "server");
            if (object != null && ((String)object).length() > 0) {
                bArray = new b[1];
                this.w0 = bArray;
                bArray[0] = b.d((String)object);
                return this.y();
            }
            object = b0.U(string, "address");
            if (object != null && ((String)object).length() > 0) {
                object = InetAddress.getByName((String)object).getAddress();
                bArray2 = new b[1];
                this.w0 = bArray2;
                bArray2[0] = new b(InetAddress.getByAddress((String)bArray, (byte[])object));
                return this.y();
            }
        }
        if (bArray.length() == 0) {
            try {
                bArray2 = ax.nb.g.n("\u0001\u0002__MSBROWSE__\u0002", 1, null);
                bArray = new b[1];
                this.w0 = bArray;
                bArray[0] = b.d(bArray2.q());
            }
            catch (UnknownHostException unknownHostException) {
                r.o();
                if (!r.n0.equals("?")) {
                    this.w0 = b.c(r.n0, true);
                }
                throw unknownHostException;
            }
        } else {
            this.w0 = bArray2.length() != 0 && !bArray2.equals("/") ? b.c((String)bArray, false) : b.c((String)bArray, true);
        }
        return this.y();
    }

    b y() {
        int n8 = this.x0;
        b[] bArray = this.w0;
        if (n8 < bArray.length) {
            this.x0 = n8 + 1;
            return bArray[n8];
        }
        return null;
    }

    public String z() {
        return this.url.toString();
    }
}


package ax.pb;

import ax.jb.C2345a;
import ax.jb.C2346b;
import ax.lb.C2495a;
import ax.lb.C2496b;
import ax.nb.C2644g;
import ax.qb.C2897e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ax.pb.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2796b0 extends URLConnection implements Z {
    static C2897e A0 = C2897e.a();
    static long B0 = 0;
    static boolean C0 = false;
    protected static C2799d D0 = null;
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
    private C2821v l0;
    private C2801e m0;
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
    C2346b[] w0;
    int x0;

    static {
        try {
            String str = C2345a.c;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        B0 = C2345a.f("jcifs.smb.client.attrExpirationPeriod", 5000L);
        C0 = C2345a.a("jcifs.smb.client.ignoreCopyToException", true);
        D0 = new C2799d();
    }

    public C2796b0(String str) throws MalformedURLException {
        this(new URL((URL) null, str, C2809i.a));
    }

    private long T(int i) throws C2794a0 {
        s0 s0Var = new s0(i);
        Y(new r0(i), s0Var);
        if (this.r0 == 8) {
            this.h0 = s0Var.Z0.b();
            this.i0 = System.currentTimeMillis() + B0;
        }
        return s0Var.Z0.a();
    }

    static String U(String str, String str2) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c = charArray[i3];
            if (c == '&') {
                if (i > i2 && new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
                    int i4 = i + 1;
                    return new String(charArray, i4, i3 - i4);
                }
                i2 = i3 + 1;
            } else if (c == '=') {
                i = i3;
            }
        }
        if (i <= i2 || !new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
            return null;
        }
        int i5 = i + 1;
        return new String(charArray, i5, charArray.length - i5);
    }

    private C2821v a() {
        if (this.l0 == null) {
            this.l0 = new C2821v();
        }
        return this.l0;
    }

    public String A() {
        String host = ((URLConnection) this).url.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    String B() {
        C2801e c2801e = this.m0;
        return c2801e != null ? c2801e.f0 : A();
    }

    public int C() throws C2794a0 {
        int v;
        if (this.r0 == 0) {
            if (D().length() > 1) {
                this.r0 = 1;
            } else if (this.c0 != null) {
                g();
                if (this.c0.equals("IPC$")) {
                    this.r0 = 16;
                } else if (this.o0.d.equals("LPT1:")) {
                    this.r0 = 32;
                } else if (this.o0.d.equals("COMM")) {
                    this.r0 = 64;
                } else {
                    this.r0 = 8;
                }
            } else if (((URLConnection) this).url.getAuthority() == null || ((URLConnection) this).url.getAuthority().length() == 0) {
                this.r0 = 2;
            } else {
                try {
                    C2346b t = t();
                    if ((t.b() instanceof C2644g) && ((v = ((C2644g) t.b()).v()) == 29 || v == 27)) {
                        this.r0 = 2;
                        return 2;
                    }
                    this.r0 = 4;
                } catch (UnknownHostException e) {
                    throw new C2794a0(((URLConnection) this).url.toString(), e);
                }
            }
        }
        return this.r0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String D() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.C2796b0.D():java.lang.String");
    }

    boolean E() {
        return this.x0 < this.w0.length;
    }

    boolean F() {
        l0 l0Var = this.o0;
        return l0Var != null && l0Var.a == 2;
    }

    public boolean G() throws C2794a0 {
        if (D().length() == 1) {
            return true;
        }
        return s() && (this.f0 & 16) == 16;
    }

    public boolean H() throws C2794a0 {
        if (this.c0 == null) {
            return false;
        }
        if (D().length() == 1) {
            return this.c0.endsWith("$");
        }
        s();
        return (this.f0 & 2) == 2;
    }

    boolean I() {
        return this.s0 && F() && this.t0 == this.o0.i;
    }

    boolean J() throws UnknownHostException {
        int v;
        if (this.r0 == 2 || ((URLConnection) this).url.getHost().length() == 0) {
            this.r0 = 2;
            return true;
        }
        D();
        if (this.c0 != null) {
            return false;
        }
        C2346b t = t();
        if ((t.b() instanceof C2644g) && ((v = ((C2644g) t.b()).v()) == 29 || v == 27)) {
            this.r0 = 2;
            return true;
        }
        this.r0 = 4;
        return false;
    }

    public long K() throws C2794a0 {
        if (D().length() <= 1) {
            return 0L;
        }
        s();
        return this.e0;
    }

    public long L() throws C2794a0 {
        if (this.i0 > System.currentTimeMillis()) {
            return this.h0;
        }
        if (C() == 8) {
            s0 s0Var = new s0(1);
            Y(new r0(1), s0Var);
            this.h0 = s0Var.Z0.b();
        } else if (D().length() <= 1 || this.r0 == 16) {
            this.h0 = 0L;
        } else {
            this.h0 = V(D(), 258).getSize();
        }
        this.i0 = System.currentTimeMillis() + B0;
        return this.h0;
    }

    public C2796b0[] M() throws C2794a0 {
        return N("*", 22, null, null);
    }

    C2796b0[] N(String str, int i, InterfaceC2804f0 interfaceC2804f0, InterfaceC2798c0 interfaceC2798c0) throws C2794a0 {
        ArrayList arrayList = new ArrayList();
        m(arrayList, true, str, i, interfaceC2804f0, interfaceC2798c0);
        return (C2796b0[]) arrayList.toArray(new C2796b0[arrayList.size()]);
    }

    public void O() throws C2794a0 {
        String D = D();
        if (D.length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        if (C2897e.c0 >= 3) {
            A0.println("mkdir: " + D);
        }
        Y(new C2823x(D), a());
        this.i0 = 0L;
        this.g0 = 0L;
    }

    boolean P(AbstractC2818s abstractC2818s) {
        if (this.o0 == null) {
            return true;
        }
        String str = abstractC2818s.x0;
        if (str == null) {
            return false;
        }
        byte b = abstractC2818s.d0;
        String str2 = "A:";
        if ((b == 37 || b == 50) && (((P) abstractC2818s).Y0 & 255) == 16) {
            str2 = null;
        }
        if (this.u0 != str2) {
            return true;
        }
        String str3 = this.v0;
        if (str3 == null) {
            if (str != null) {
                return true;
            }
        } else if (!str3.equals(str)) {
            return true;
        }
        return false;
    }

    void Q(int i, int i2, int i3, int i4) throws C2794a0 {
        if (I()) {
            return;
        }
        this.q0 = R(i, i2, i3, i4);
        this.s0 = true;
        this.t0 = this.o0.i;
    }

    int R(int i, int i2, int i3, int i4) throws C2794a0 {
        g();
        if (C2897e.c0 >= 3) {
            A0.println("open0: " + this.p0);
        }
        if (!this.o0.f.h.u(16)) {
            H h = new H();
            Y(new G(this.p0, i2, i, null), h);
            return h.F0;
        }
        C2791D c2791d = new C2791D();
        C2790C c2790c = new C2790C(this.p0, i, i2, this.k0, i3, i4, null);
        if (this instanceof C2806g0) {
            c2790c.O0 |= 22;
            c2790c.P0 |= 131072;
            c2791d.S0 = true;
        }
        Y(c2790c, c2791d);
        int i5 = c2791d.G0;
        this.f0 = c2791d.I0 & 32767;
        this.g0 = System.currentTimeMillis() + B0;
        this.j0 = true;
        return i5;
    }

    protected boolean S(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str2.lastIndexOf(47);
        int length = str.length() - lastIndexOf;
        int length2 = str2.length() - lastIndexOf2;
        if (length > 1 && str.charAt(lastIndexOf + 1) == '.') {
            return true;
        }
        if (length2 <= 1 || str2.charAt(lastIndexOf2 + 1) != '.') {
            return length == length2 && str.regionMatches(true, lastIndexOf, str2, lastIndexOf2, length);
        }
        return true;
    }

    InterfaceC2810j V(String str, int i) throws C2794a0 {
        g();
        if (C2897e.c0 >= 3) {
            A0.println("queryPath: " + str);
        }
        if (this.o0.f.h.u(16)) {
            u0 u0Var = new u0(i);
            Y(new t0(str, i), u0Var);
            return u0Var.Z0;
        }
        J j = new J(this.o0.f.h.w0.n * 1000 * 60);
        Y(new I(str), j);
        return j;
    }

    public void W(C2796b0 c2796b0) throws C2794a0 {
        if (D().length() == 1 || c2796b0.D().length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        if (this.p0 == null || this.o0 == null) {
            X(null);
        }
        if (c2796b0.p0 == null || c2796b0.o0 == null) {
            c2796b0.X(null);
        }
        if (!this.o0.equals(c2796b0.o0)) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        if (C2897e.c0 >= 3) {
            A0.println("renameTo: " + this.p0 + " -> " + c2796b0.p0);
        }
        this.i0 = 0L;
        this.g0 = 0L;
        c2796b0.g0 = 0L;
        Y(new M(this.p0, c2796b0.p0), a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 != 50) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0038, code lost:
    
        if ((((ax.pb.P) r9).Y0 & 255) != 16) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void X(ax.pb.AbstractC2818s r9) throws ax.pb.C2794a0 {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.C2796b0.X(ax.pb.s):void");
    }

    void Y(AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) throws C2794a0 {
        while (true) {
            if (P(abstractC2818s)) {
                c0(abstractC2818s);
                X(abstractC2818s);
            }
            try {
                this.o0.b(abstractC2818s, abstractC2818s2);
                return;
            } catch (C2801e e) {
                if (e.j0) {
                    throw e;
                }
                abstractC2818s.s();
            }
        }
    }

    public void Z(int i) throws C2794a0 {
        if (D().length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        b0(i & 12455, 0L, 0L);
    }

    public void a0(long j) throws C2794a0 {
        if (D().length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        b0(0, 0L, j);
    }

    public boolean b() throws C2794a0 {
        if (C() == 16) {
            return true;
        }
        return s();
    }

    void b0(int i, long j, long j2) throws C2794a0 {
        s();
        int i2 = this.f0 & 16;
        int R = R(1, 256, i2, i2 != 0 ? 1 : 64);
        Y(new v0(R, i | i2, j, j2), new w0());
        e(R, 0L);
        this.g0 = 0L;
    }

    public boolean c() throws C2794a0 {
        if (C() == 16) {
            return true;
        }
        return s() && (this.f0 & 1) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if ((((ax.pb.P) r4).Y0 & 255) != 16) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 != 50) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void c0(ax.pb.AbstractC2818s r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L1b
            byte r0 = r4.d0
            r1 = 37
            java.lang.String r2 = "A:"
            if (r0 == r1) goto Lf
            r1 = 50
            if (r0 == r1) goto Lf
            goto L1c
        Lf:
            r0 = r4
            ax.pb.P r0 = (ax.pb.P) r0
            byte r0 = r0.Y0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 16
            if (r0 == r1) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r3.u0 = r2
            java.lang.String r4 = r4.x0
            r3.v0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.C2796b0.c0(ax.pb.s):void");
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        if (F()) {
            l0 l0Var = this.o0;
            if (l0Var.f.h.E0 == null) {
                l0Var.d(true);
            }
        }
        if (F()) {
            return;
        }
        D();
        x();
        while (true) {
            try {
                k();
                return;
            } catch (C2820u e) {
                throw e;
            } catch (C2794a0 e2) {
                if (y() == null) {
                    throw e2;
                }
                if (C2897e.c0 >= 3) {
                    e2.printStackTrace(A0);
                }
            }
        }
    }

    void d() throws C2794a0 {
        f(0L);
    }

    public void d0() throws C2794a0 {
        Z(u() & (-2));
    }

    void e(int i, long j) throws C2794a0 {
        if (C2897e.c0 >= 3) {
            A0.println("close: " + i);
        }
        Y(new C2822w(i, j), a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2796b0)) {
            return false;
        }
        C2796b0 c2796b0 = (C2796b0) obj;
        if (this == c2796b0) {
            return true;
        }
        if (!S(((URLConnection) this).url.getPath(), ((URLConnection) c2796b0).url.getPath())) {
            return false;
        }
        D();
        c2796b0.D();
        if (!this.q.equalsIgnoreCase(c2796b0.q)) {
            return false;
        }
        try {
            return t().equals(c2796b0.t());
        } catch (UnknownHostException unused) {
            return A().equalsIgnoreCase(c2796b0.A());
        }
    }

    void f(long j) throws C2794a0 {
        if (I()) {
            e(this.q0, j);
            this.s0 = false;
        }
    }

    void g() throws C2794a0 {
        try {
            connect();
        } catch (C2794a0 e) {
            throw e;
        } catch (UnknownHostException e2) {
            throw new C2794a0("Failed to connect to server", e2);
        } catch (IOException e3) {
            throw new C2794a0("Failed to connect to server", e3);
        }
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        try {
            return (int) (L() & 4294967295L);
        } catch (C2794a0 unused) {
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public long getDate() {
        try {
            return K();
        } catch (C2794a0 unused) {
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return new C2800d0(this);
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        try {
            return K();
        } catch (C2794a0 unused) {
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return new C2802e0(this);
    }

    public void h() throws C2794a0 {
        if (D().length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        e(R(51, 0, 128, 0), 0L);
    }

    public int hashCode() {
        int hashCode;
        try {
            hashCode = t().hashCode();
        } catch (UnknownHostException unused) {
            hashCode = A().toUpperCase().hashCode();
        }
        D();
        return hashCode + this.q.toUpperCase().hashCode();
    }

    public void i() throws C2794a0 {
        s();
        D();
        j(this.p0);
    }

    void j(String str) throws C2794a0 {
        if (D().length() == 1) {
            throw new C2794a0("Invalid operation for workgroups, servers, or shares");
        }
        if (System.currentTimeMillis() > this.g0) {
            this.f0 = 17;
            this.d0 = 0L;
            this.e0 = 0L;
            this.j0 = false;
            InterfaceC2810j V = V(D(), 257);
            this.f0 = V.b();
            this.d0 = V.a();
            this.e0 = V.c();
            this.g0 = System.currentTimeMillis() + B0;
            this.j0 = true;
        }
        if ((1 & this.f0) != 0) {
            d0();
        }
        if (C2897e.c0 >= 3) {
            A0.println("delete: " + str);
        }
        if ((this.f0 & 16) != 0) {
            try {
                for (C2796b0 c2796b0 : N("*", 22, null, null)) {
                    c2796b0.i();
                }
            } catch (C2794a0 e) {
                if (e.c() != -1073741809) {
                    throw e;
                }
            }
            Y(new C2825z(str), a());
        } else {
            Y(new C2824y(str), a());
        }
        this.i0 = 0L;
        this.g0 = 0L;
    }

    void k() throws IOException {
        k0 s;
        C2346b t = t();
        l0 l0Var = this.o0;
        if (l0Var != null) {
            s = l0Var.f.h;
        } else {
            s = k0.s(t, ((URLConnection) this).url.getPort());
            this.o0 = s.r(this.n0).a(this.c0, null);
        }
        String B = B();
        l0 l0Var2 = this.o0;
        l0Var2.h = D0.f(B, l0Var2.c, null, this.n0) != null;
        l0 l0Var3 = this.o0;
        if (l0Var3.h) {
            l0Var3.a = 2;
        }
        try {
            if (C2897e.c0 >= 3) {
                A0.println("doConnect: " + t);
            }
            this.o0.c(null, null);
        } catch (C2820u e) {
            if (this.c0 == null) {
                l0 a = s.r(r.q0).a(null, null);
                this.o0 = a;
                a.c(null, null);
                return;
            }
            r a2 = AbstractC2816p.a(((URLConnection) this).url.toString(), e);
            if (a2 == null) {
                if (C2897e.c0 >= 1 && E()) {
                    e.printStackTrace(A0);
                }
                throw e;
            }
            this.n0 = a2;
            l0 a3 = s.r(a2).a(this.c0, null);
            this.o0 = a3;
            a3.h = D0.f(B, a3.c, null, this.n0) != null;
            l0 l0Var4 = this.o0;
            if (l0Var4.h) {
                l0Var4.a = 2;
            }
            l0Var4.c(null, null);
        }
    }

    InterfaceC2807h[] l() throws IOException {
        ax.kb.f e = ax.kb.f.e("ncacn_np:" + t().f() + "[\\PIPE\\netdfs]", this.n0);
        try {
            C2495a c2495a = new C2495a(A());
            e.g(c2495a);
            if (c2495a.h != 0) {
                throw new C2794a0(c2495a.h, true);
            }
            InterfaceC2807h[] j = c2495a.j();
            try {
                return j;
            } catch (IOException e2) {
                return j;
            }
        } finally {
            try {
                e.b();
            } catch (IOException e22) {
                if (C2897e.c0 >= 4) {
                    e22.printStackTrace(A0);
                }
            }
        }
    }

    void m(ArrayList arrayList, boolean z, String str, int i, InterfaceC2804f0 interfaceC2804f0, InterfaceC2798c0 interfaceC2798c0) throws C2794a0 {
        C2796b0 c2796b0;
        UnknownHostException unknownHostException;
        MalformedURLException malformedURLException;
        if (interfaceC2798c0 != null && (interfaceC2798c0 instanceof C2805g)) {
            C2805g c2805g = (C2805g) interfaceC2798c0;
            String str2 = c2805g.a;
            if (str2 != null) {
                str = str2;
            }
            i = c2805g.b;
        }
        String str3 = str;
        int i2 = i;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                try {
                    if (C() != 2) {
                        if (this.c0 == null) {
                            r(arrayList, z, str3, i2, interfaceC2804f0, interfaceC2798c0);
                            return;
                        } else {
                            n(arrayList, z, str3, i2, interfaceC2804f0, interfaceC2798c0);
                            return;
                        }
                    }
                } catch (MalformedURLException e) {
                    malformedURLException = e;
                    c2796b0 = this;
                    throw new C2794a0(((URLConnection) c2796b0).url.toString(), malformedURLException);
                } catch (UnknownHostException e2) {
                    unknownHostException = e2;
                    c2796b0 = this;
                    throw new C2794a0(((URLConnection) c2796b0).url.toString(), unknownHostException);
                }
            }
            c2796b0 = this;
            try {
                c2796b0.p(arrayList, z, str3, i2, interfaceC2804f0, interfaceC2798c0);
            } catch (MalformedURLException e3) {
                e = e3;
                malformedURLException = e;
                throw new C2794a0(((URLConnection) c2796b0).url.toString(), malformedURLException);
            } catch (UnknownHostException e4) {
                e = e4;
                unknownHostException = e;
                throw new C2794a0(((URLConnection) c2796b0).url.toString(), unknownHostException);
            }
        } catch (MalformedURLException e5) {
            e = e5;
            c2796b0 = this;
        } catch (UnknownHostException e6) {
            e = e6;
            c2796b0 = this;
        }
    }

    void n(ArrayList arrayList, boolean z, String str, int i, InterfaceC2804f0 interfaceC2804f0, InterfaceC2798c0 interfaceC2798c0) throws C2794a0, UnknownHostException, MalformedURLException {
        int i2;
        int i3;
        o0 o0Var;
        int i4;
        int hashCode;
        InterfaceC2804f0 interfaceC2804f02 = interfaceC2804f0;
        String D = D();
        if (((URLConnection) this).url.getPath().lastIndexOf(47) != r2.length() - 1) {
            throw new C2794a0(((URLConnection) this).url.toString() + " directory must end with '/'");
        }
        AbstractC2818s m0Var = new m0(D, str, i);
        n0 n0Var = new n0();
        int i5 = 3;
        if (C2897e.c0 >= 3) {
            A0.println("doFindFirstNext: " + m0Var.x0);
        }
        Y(m0Var, n0Var);
        int i6 = n0Var.Y0;
        o0 o0Var2 = new o0(i6, n0Var.e1, n0Var.d1);
        n0Var.R0 = (byte) 2;
        while (true) {
            int i7 = 0;
            while (true) {
                i2 = n0Var.W0;
                if (i7 >= i2) {
                    break;
                }
                InterfaceC2807h interfaceC2807h = n0Var.X0[i7];
                o0 o0Var3 = o0Var2;
                String name = interfaceC2807h.getName();
                if ((name.length() >= i5 || !(((hashCode = name.hashCode()) == y0 || hashCode == z0) && (name.equals(".") || name.equals("..")))) && ((interfaceC2804f02 == null || interfaceC2804f02.a(this, name)) && name.length() > 0)) {
                    i3 = i7;
                    o0Var = o0Var3;
                    i4 = i6;
                    C2796b0 c2796b0 = new C2796b0(this, name, 1, interfaceC2807h.b(), interfaceC2807h.c(), interfaceC2807h.h(), interfaceC2807h.length());
                    if (interfaceC2798c0 == null || interfaceC2798c0.a(c2796b0)) {
                        if (z) {
                            arrayList.add(c2796b0);
                        } else {
                            arrayList.add(name);
                        }
                    }
                } else {
                    i4 = i6;
                    i3 = i7;
                    o0Var = o0Var3;
                }
                i7 = i3 + 1;
                o0Var2 = o0Var;
                i6 = i4;
                i5 = 3;
                interfaceC2804f02 = interfaceC2804f0;
            }
            int i8 = i6;
            o0 o0Var4 = o0Var2;
            if (n0Var.Z0 || i2 == 0) {
                try {
                    Y(new C2788A(i8), a());
                    return;
                } catch (C2794a0 e) {
                    if (C2897e.c0 >= 4) {
                        e.printStackTrace(A0);
                        return;
                    }
                    return;
                }
            }
            o0Var4.E(n0Var.e1, n0Var.d1);
            n0Var.s();
            Y(o0Var4, n0Var);
            o0Var2 = o0Var4;
            i6 = i8;
            i5 = 3;
            interfaceC2804f02 = interfaceC2804f0;
        }
    }

    InterfaceC2807h[] o() throws IOException {
        C2496b c2496b = new C2496b(((URLConnection) this).url.getHost());
        ax.kb.f e = ax.kb.f.e("ncacn_np:" + t().f() + "[\\PIPE\\srvsvc]", this.n0);
        try {
            e.g(c2496b);
            if (c2496b.h != 0) {
                throw new C2794a0(c2496b.h, true);
            }
            InterfaceC2807h[] j = c2496b.j();
            try {
                return j;
            } catch (IOException e2) {
                return j;
            }
        } finally {
            try {
                e.b();
            } catch (IOException e22) {
                if (C2897e.c0 >= 4) {
                    e22.printStackTrace(A0);
                }
            }
        }
    }

    void p(ArrayList arrayList, boolean z, String str, int i, InterfaceC2804f0 interfaceC2804f0, InterfaceC2798c0 interfaceC2798c0) throws C2794a0, UnknownHostException, MalformedURLException {
        C2811k c2811k;
        C2812l c2812l;
        int i2;
        int i3;
        C2811k c2811k2;
        C2812l c2812l2;
        int C = ((URLConnection) this).url.getHost().length() == 0 ? 0 : C();
        if (C == 0) {
            g();
            c2811k = new C2811k(this.o0.f.h.w0.e, Integer.MIN_VALUE);
            c2812l = new C2812l();
        } else {
            if (C != 2) {
                throw new C2794a0("The requested list operations is invalid: " + ((URLConnection) this).url.toString());
            }
            c2811k = new C2811k(((URLConnection) this).url.getHost(), -1);
            c2812l = new C2812l();
        }
        while (true) {
            Y(c2811k, c2812l);
            int i4 = c2812l.V0;
            if (i4 != 0 && i4 != 234) {
                throw new C2794a0(c2812l.V0, true);
            }
            boolean z2 = i4 == 234;
            int i5 = c2812l.W0;
            if (z2) {
                i5--;
            }
            int i6 = 0;
            while (i6 < i5) {
                InterfaceC2807h interfaceC2807h = c2812l.X0[i6];
                C2812l c2812l3 = c2812l;
                String name = interfaceC2807h.getName();
                if ((interfaceC2804f0 == null || interfaceC2804f0.a(this, name)) && name.length() > 0) {
                    i2 = i6;
                    i3 = i5;
                    c2811k2 = c2811k;
                    c2812l2 = c2812l3;
                    C2796b0 c2796b0 = new C2796b0(this, name, interfaceC2807h.a(), 17, 0L, 0L, 0L);
                    if (interfaceC2798c0 == null || interfaceC2798c0.a(c2796b0)) {
                        if (z) {
                            arrayList.add(c2796b0);
                        } else {
                            arrayList.add(name);
                        }
                    }
                } else {
                    c2811k2 = c2811k;
                    i3 = i5;
                    i2 = i6;
                    c2812l2 = c2812l3;
                }
                i6 = i2 + 1;
                c2811k = c2811k2;
                i5 = i3;
                c2812l = c2812l2;
            }
            C2811k c2811k3 = c2811k;
            C2812l c2812l4 = c2812l;
            if (C() != 2) {
                return;
            }
            c2811k3.Y0 = (byte) -41;
            c2811k3.E(0, c2812l4.a1);
            c2812l4.s();
            if (!z2) {
                return;
            }
            c2812l = c2812l4;
            c2811k = c2811k3;
        }
    }

    InterfaceC2807h[] q() throws C2794a0 {
        AbstractC2818s c2813m = new C2813m();
        C2814n c2814n = new C2814n();
        Y(c2813m, c2814n);
        if (c2814n.V0 == 0) {
            return c2814n.X0;
        }
        throw new C2794a0(c2814n.V0, true);
    }

    void r(ArrayList arrayList, boolean z, String str, int i, InterfaceC2804f0 interfaceC2804f0, InterfaceC2798c0 interfaceC2798c0) throws C2794a0, UnknownHostException, MalformedURLException {
        InterfaceC2807h[] q;
        if (((URLConnection) this).url.getPath().lastIndexOf(47) != r0.length() - 1) {
            throw new C2794a0(((URLConnection) this).url.toString() + " directory must end with '/'");
        }
        if (C() != 4) {
            throw new C2794a0("The requested list operations is invalid: " + ((URLConnection) this).url.toString());
        }
        HashMap hashMap = new HashMap();
        if (D0.e(A(), this.n0)) {
            try {
                for (InterfaceC2807h interfaceC2807h : l()) {
                    if (!hashMap.containsKey(interfaceC2807h)) {
                        hashMap.put(interfaceC2807h, interfaceC2807h);
                    }
                }
            } catch (IOException e) {
                if (C2897e.c0 >= 4) {
                    e.printStackTrace(A0);
                }
            }
        }
        C2346b x = x();
        IOException iOException = null;
        loop0: while (x != null) {
            try {
                k();
                try {
                    q = o();
                } catch (IOException e2) {
                    if (C2897e.c0 >= 3) {
                        e2.printStackTrace(A0);
                    }
                    q = q();
                }
                for (InterfaceC2807h interfaceC2807h2 : q) {
                    if (!hashMap.containsKey(interfaceC2807h2)) {
                        hashMap.put(interfaceC2807h2, interfaceC2807h2);
                    }
                }
                break loop0;
            } catch (IOException e3) {
                iOException = e3;
                if (C2897e.c0 >= 3) {
                    iOException.printStackTrace(A0);
                }
                x = y();
            }
        }
        if (iOException != null && hashMap.isEmpty()) {
            if (!(iOException instanceof C2794a0)) {
                throw new C2794a0(((URLConnection) this).url.toString(), iOException);
            }
            throw ((C2794a0) iOException);
        }
        for (InterfaceC2807h interfaceC2807h3 : hashMap.keySet()) {
            String name = interfaceC2807h3.getName();
            if (interfaceC2804f0 == null || interfaceC2804f0.a(this, name)) {
                if (name.length() > 0) {
                    C2796b0 c2796b0 = new C2796b0(this, name, interfaceC2807h3.a(), 17, 0L, 0L, 0L);
                    if (interfaceC2798c0 == null || interfaceC2798c0.a(c2796b0)) {
                        if (z) {
                            arrayList.add(c2796b0);
                        } else {
                            arrayList.add(name);
                        }
                    }
                }
            }
        }
    }

    public boolean s() throws C2794a0 {
        if (this.g0 > System.currentTimeMillis()) {
            return this.j0;
        }
        this.f0 = 17;
        this.d0 = 0L;
        this.e0 = 0L;
        this.j0 = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (this.c0 != null) {
                    if (D().length() != 1 && !this.c0.equalsIgnoreCase("IPC$")) {
                        InterfaceC2810j V = V(D(), 257);
                        this.f0 = V.b();
                        this.d0 = V.a();
                        this.e0 = V.c();
                    }
                    g();
                } else if (C() == 2) {
                    C2346b.e(((URLConnection) this).url.getHost(), true);
                } else {
                    C2346b.d(((URLConnection) this).url.getHost()).g();
                }
            }
            this.j0 = true;
        } catch (C2794a0 e) {
            switch (e.c()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e;
            }
        } catch (UnknownHostException unused) {
        }
        this.g0 = System.currentTimeMillis() + B0;
        return this.j0;
    }

    C2346b t() throws UnknownHostException {
        int i = this.x0;
        return i == 0 ? x() : this.w0[i - 1];
    }

    @Override // java.net.URLConnection
    public String toString() {
        return ((URLConnection) this).url.toString();
    }

    public int u() throws C2794a0 {
        if (D().length() == 1) {
            return 0;
        }
        s();
        return this.f0 & 32767;
    }

    public String v() {
        String authority = ((URLConnection) this).url.getAuthority();
        D();
        if (authority.length() <= 0) {
            return "smb://";
        }
        return "smb://" + ((URLConnection) this).url.getAuthority() + this.q;
    }

    public long w() throws C2794a0 {
        if (C() != 8 && this.r0 != 1) {
            return 0L;
        }
        try {
            return T(1007);
        } catch (C2794a0 e) {
            int c = e.c();
            if (c == -1073741823 || c == -1073741821) {
                return T(1);
            }
            throw e;
        }
    }

    C2346b x() throws UnknownHostException {
        this.x0 = 0;
        String host = ((URLConnection) this).url.getHost();
        String path = ((URLConnection) this).url.getPath();
        String query = ((URLConnection) this).url.getQuery();
        if (query != null) {
            String U = U(query, "server");
            if (U != null && U.length() > 0) {
                this.w0 = new C2346b[]{C2346b.d(U)};
                return y();
            }
            String U2 = U(query, "address");
            if (U2 != null && U2.length() > 0) {
                this.w0 = new C2346b[]{new C2346b(InetAddress.getByAddress(host, InetAddress.getByName(U2).getAddress()))};
                return y();
            }
        }
        if (host.length() == 0) {
            try {
                this.w0 = new C2346b[]{C2346b.d(C2644g.n("\u0001\u0002__MSBROWSE__\u0002", 1, null).q())};
            } catch (UnknownHostException e) {
                r.o();
                if (r.n0.equals("?")) {
                    throw e;
                }
                this.w0 = C2346b.c(r.n0, true);
            }
        } else if (path.length() == 0 || path.equals("/")) {
            this.w0 = C2346b.c(host, true);
        } else {
            this.w0 = C2346b.c(host, false);
        }
        return y();
    }

    C2346b y() {
        int i = this.x0;
        C2346b[] c2346bArr = this.w0;
        if (i >= c2346bArr.length) {
            return null;
        }
        this.x0 = i + 1;
        return c2346bArr[i];
    }

    public String z() {
        return ((URLConnection) this).url.toString();
    }

    public C2796b0(String str, r rVar) throws MalformedURLException {
        this(new URL((URL) null, str, C2809i.a), rVar);
    }

    public C2796b0(String str, r rVar, int i) throws MalformedURLException {
        this(new URL((URL) null, str, C2809i.a), rVar);
        if ((i & (-8)) == 0) {
            this.k0 = i;
            return;
        }
        throw new RuntimeException("Illegal shareAccess parameter");
    }

    public C2796b0(URL url) {
        this(url, new r(url.getUserInfo()));
    }

    public C2796b0(URL url, r rVar) {
        super(url);
        this.k0 = 7;
        this.l0 = null;
        this.m0 = null;
        this.o0 = null;
        this.n0 = rVar == null ? new r(url.getUserInfo()) : rVar;
        D();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    C2796b0(ax.pb.C2796b0 r6, java.lang.String r7, int r8, int r9, long r10, long r12, long r14) throws java.net.MalformedURLException, java.net.UnknownHostException {
        /*
            r5 = this;
            boolean r0 = r6.J()
            java.lang.String r1 = "/"
            if (r0 == 0) goto L25
            java.net.URL r0 = new java.net.URL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "smb://"
            r2.append(r3)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.net.URLStreamHandler r2 = ax.pb.C2809i.a
            r3 = 0
            r0.<init>(r3, r1, r2)
            goto L42
        L25:
            java.net.URL r0 = new java.net.URL
            java.net.URL r2 = r6.url
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r4 = r9 & 16
            if (r4 <= 0) goto L36
            goto L38
        L36:
            java.lang.String r1 = ""
        L38:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r2, r1)
        L42:
            r5.<init>(r0)
            ax.pb.r r0 = r6.n0
            r5.n0 = r0
            java.lang.String r0 = r6.c0
            if (r0 == 0) goto L55
            ax.pb.l0 r0 = r6.o0
            r5.o0 = r0
            ax.pb.e r0 = r6.m0
            r5.m0 = r0
        L55:
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            char r2 = r7.charAt(r0)
            r3 = 47
            if (r2 != r3) goto L68
            r2 = 0
            java.lang.String r7 = r7.substring(r2, r0)
        L68:
            java.lang.String r0 = r6.c0
            java.lang.String r2 = "\\"
            if (r0 != 0) goto L71
            r5.p0 = r2
            goto La3
        L71:
            java.lang.String r0 = r6.p0
            boolean r0 = r0.equals(r2)
            r2 = 92
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.p0 = r6
            goto La3
        L8d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.p0
            r0.append(r6)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            r5.p0 = r6
        La3:
            r5.r0 = r8
            r5.f0 = r9
            r5.d0 = r10
            r5.e0 = r12
            r5.h0 = r14
            r5.j0 = r1
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = ax.pb.C2796b0.B0
            long r6 = r6 + r8
            r5.i0 = r6
            r5.g0 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.C2796b0.<init>(ax.pb.b0, java.lang.String, int, int, long, long, long):void");
    }
}

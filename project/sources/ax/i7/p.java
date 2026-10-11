package ax.i7;

import ax.db.AbstractC1955a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public final class p {
    public static final String B;
    public static final String C;
    private l a;
    private i h;
    private final w i;
    private String j;
    private g k;
    private x o;
    private n p;
    private u q;
    private ax.m7.t r;
    private j s;
    private boolean x;
    private m b = new m();
    private m c = new m();
    private int d = 10;
    private int e = Http2.INITIAL_MAX_FRAME_SIZE;
    private boolean f = true;
    private boolean g = true;
    private int l = 20000;
    private int m = 20000;
    private int n = 0;
    private boolean t = true;
    private boolean u = false;
    private boolean v = true;

    @Deprecated
    private boolean w = false;
    private ax.m7.x y = ax.m7.x.a;
    private final ax.db.y z = C2276C.b();
    private boolean A = false;

    static {
        String q = q();
        B = q;
        C = "Google-HTTP-Java-Client/" + q + " (gzip)";
    }

    p(w wVar, String str) {
        this.i = wVar;
        z(str);
    }

    private static void a(ax.db.q qVar, String str, String str2) {
        if (str2 != null) {
            qVar.i(str, AbstractC1955a.b(str2));
        }
    }

    private static String q() {
        String str = "unknown-version";
        try {
            InputStream resourceAsStream = p.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    str = properties.getProperty("google-http-client.version");
                } finally {
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str;
    }

    public p A(u uVar) {
        this.q = uVar;
        return this;
    }

    public p B(boolean z) {
        this.A = z;
        return this;
    }

    public p C(boolean z) {
        this.v = z;
        return this;
    }

    public p D(x xVar) {
        this.o = xVar;
        return this;
    }

    public p E(g gVar) {
        this.k = (g) ax.m7.v.d(gVar);
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(9:(2:17|(24:19|(1:21)|22|(2:24|(1:26)(1:27))|28|(1:30)|31|(1:162)(1:35)|36|(8:38|(1:40)(1:160)|41|(1:43)(1:159)|44|(5:46|(2:48|(1:50))(1:157)|(2:52|(1:54))|55|(1:57))(1:158)|(1:59)|60)(1:161)|(2:62|(3:64|(1:66)|67))|(1:156)(1:70)|71|72|73|(1:75)|76|77|78|(3:110|111|(7:113|(1:115)(1:123)|(1:119)|120|(1:122)|83|(4:86|(1:88)(1:108)|89|(4:91|(1:93)|94|(1:106)(3:98|99|100))(1:107))(1:85)))|(1:81)(1:109)|82|83|(0)(0)))(1:164)|76|77|78|(0)|(0)(0)|82|83|(0)(0))|72|73|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0287, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a2, code lost:
    
        if (r24.w == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02af, code lost:
    
        r4.g(ax.i7.C2276C.a(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b9, code lost:
    
        r8.log(java.util.logging.Level.WARNING, "exception thrown while executing request", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02c0, code lost:
    
        r3.close();
        r3 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026e A[Catch: all -> 0x0284, IOException -> 0x0287, TRY_LEAVE, TryCatch #0 {IOException -> 0x0287, blocks: (B:73:0x0268, B:75:0x026e, B:131:0x0296, B:133:0x029c, B:134:0x029f), top: B:72:0x0268, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033f A[LOOP:0: B:5:0x002e->B:85:0x033f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r2v20, types: [ax.m7.r] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ax.i7.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.i7.s b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i7.p.b():ax.i7.s");
    }

    public i c() {
        return this.h;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.t;
    }

    public m f() {
        return this.b;
    }

    public n g() {
        return this.p;
    }

    public final ax.m7.t h() {
        return this.r;
    }

    public String i() {
        return this.j;
    }

    public m j() {
        return this.c;
    }

    public u k() {
        return this.q;
    }

    public boolean l() {
        return this.A;
    }

    public boolean m() {
        return this.v;
    }

    public w n() {
        return this.i;
    }

    public x o() {
        return this.o;
    }

    public g p() {
        return this.k;
    }

    public boolean r(int i, m mVar) {
        String r = mVar.r();
        if (!e() || !v.a(i) || r == null) {
            return false;
        }
        E(new g(this.k.z(r), this.u));
        if (i == 303) {
            z("GET");
            t(null);
        }
        this.b.D(null);
        this.b.J(null);
        this.b.L(null);
        this.b.K(null);
        this.b.N(null);
        this.b.M(null);
        return true;
    }

    public boolean s() {
        return this.f;
    }

    public p t(i iVar) {
        this.h = iVar;
        return this;
    }

    public p u(j jVar) {
        this.s = jVar;
        return this;
    }

    public p v(n nVar) {
        this.p = nVar;
        return this;
    }

    public p w(l lVar) {
        this.a = lVar;
        return this;
    }

    public p x(ax.m7.t tVar) {
        this.r = tVar;
        return this;
    }

    public p y(int i) {
        ax.m7.v.a(i >= 0);
        this.m = i;
        return this;
    }

    public p z(String str) {
        ax.m7.v.a(str == null || o.i(str));
        this.j = str;
        return this;
    }
}

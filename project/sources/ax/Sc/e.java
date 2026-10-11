package ax.Sc;

import j$.time.Duration;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class e extends ax.Sc.c implements ax.Sc.a {
    private static final Pattern f0 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    private Duration A;
    private int B;
    private String C;
    private final Random D;
    private int E;
    private int F;
    private InetAddress G;
    private InetAddress H;
    private InetAddress I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private long O;
    private ax.Tc.d P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private String V;
    private j W;
    private String X;
    private f Y;
    private boolean c0;
    private HashMap<String, Set<String>> d0;
    private int z;
    private Duration Z = Duration.ZERO;
    private Duration a0 = Duration.ofSeconds(1);
    private a b0 = new b(this);
    private boolean e0 = Boolean.parseBoolean(System.getProperty("org.apache.commons.net.ftp.ipAddressFromPasvResponse"));

    public interface a {
        String a(String str) throws UnknownHostException;
    }

    public static class b implements a {
        private final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        @Override // ax.Sc.e.a
        public String a(String str) throws UnknownHostException {
            if (!InetAddress.getByName(str).isSiteLocalAddress()) {
                return str;
            }
            InetAddress u = this.a.u();
            return !u.isSiteLocalAddress() ? u.getHostAddress() : str;
        }
    }

    private static class c {
        static final Properties a;

        static {
            Properties properties;
            InputStream resourceAsStream = e.class.getResourceAsStream("/systemType.properties");
            if (resourceAsStream != null) {
                properties = new Properties();
                try {
                    properties.load(resourceAsStream);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
                try {
                    resourceAsStream.close();
                } catch (IOException unused3) {
                }
            } else {
                properties = null;
            }
            a = properties;
        }
    }

    public e() {
        a1();
        this.A = Duration.ofMillis(-1L);
        this.N = true;
        this.P = new ax.Tc.c();
        this.Y = null;
        this.T = false;
        this.U = false;
        this.D = new Random();
        this.I = null;
    }

    private OutputStream C1(g gVar, String str) throws IOException {
        return z0(gVar.h(), str);
    }

    private InputStream I0(InputStream inputStream) {
        return this.Q > 0 ? new BufferedInputStream(inputStream, this.Q) : new BufferedInputStream(inputStream);
    }

    private OutputStream J0(OutputStream outputStream) {
        return this.Q > 0 ? new BufferedOutputStream(outputStream, this.Q) : new BufferedOutputStream(outputStream);
    }

    private static Properties P0() {
        return c.a;
    }

    private void a1() {
        this.z = 0;
        this.C = null;
        this.B = -1;
        this.G = null;
        this.H = null;
        this.E = 0;
        this.F = 0;
        this.J = 0;
        this.L = 7;
        this.K = 4;
        this.M = 10;
        this.O = 0L;
        this.V = null;
        this.W = null;
        this.X = HttpUrl.FRAGMENT_ENCODE_SET;
        this.d0 = null;
    }

    private boolean b1() throws IOException {
        String substring;
        String str;
        if (this.d0 == null) {
            int N = N();
            int i = 0;
            if (N == 530) {
                return false;
            }
            boolean c2 = t.c(N);
            this.d0 = new HashMap<>();
            if (!c2) {
                return false;
            }
            ArrayList<String> arrayList = this.q;
            int size = arrayList.size();
            while (i < size) {
                String str2 = arrayList.get(i);
                i++;
                String str3 = str2;
                if (str3.startsWith(" ")) {
                    int indexOf = str3.indexOf(32, 1);
                    if (indexOf > 0) {
                        substring = str3.substring(1, indexOf);
                        str = str3.substring(indexOf + 1);
                    } else {
                        substring = str3.substring(1);
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    ((Set) Map.EL.computeIfAbsent(this.d0, substring.toUpperCase(Locale.ENGLISH), new Function() { // from class: ax.Sc.d
                        public /* synthetic */ Function andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return e.t0((String) obj);
                        }

                        public /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    })).add(str);
                }
            }
        }
        return true;
    }

    private s c1(j jVar, String str) throws IOException {
        Socket u0 = u0(g.LIST, N0(str));
        s sVar = new s(jVar, this.Y);
        if (u0 == null) {
            return sVar;
        }
        try {
            sVar.i(u0.getInputStream(), O());
            ax.Uc.f.a(u0);
            C0();
            return sVar;
        } catch (Throwable th) {
            ax.Uc.f.a(u0);
            throw th;
        }
    }

    static String p1(String str) {
        String substring = str.substring(4);
        if (!substring.startsWith("\"")) {
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 1; i < substring.length(); i++) {
            char charAt = substring.charAt(i);
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
        return z ? sb.toString() : substring;
    }

    public static /* synthetic */ Set t0(String str) {
        return new HashSet();
    }

    public boolean A0() throws IOException {
        return t.c(G());
    }

    public void A1(ax.Tc.d dVar) {
        this.P = dVar;
    }

    public boolean B0(String str) throws IOException {
        return t.c(J(str));
    }

    public void B1(long j) {
        if (j >= 0) {
            this.O = j;
        }
    }

    public boolean C0() throws IOException {
        return t.c(P());
    }

    void D0(String str) throws IOException {
        String property;
        if (this.W == null || !(str == null || this.X.equals(str))) {
            if (str != null) {
                this.W = this.P.a(str);
                this.X = str;
                return;
            }
            f fVar = this.Y;
            if (fVar != null && fVar.e().length() > 0) {
                this.W = this.P.b(this.Y);
                this.X = this.Y.e();
                return;
            }
            String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
            if (property2 == null) {
                property2 = Y0();
                Properties P0 = P0();
                if (P0 != null && (property = P0.getProperty(property2)) != null) {
                    property2 = property;
                }
            }
            if (this.Y != null) {
                this.W = this.P.b(new f(property2, this.Y));
            } else {
                this.W = this.P.a(property2);
            }
            this.X = property2;
        }
    }

    public OutputStream D1(String str) throws IOException {
        return C1(g.STOR, str);
    }

    public boolean E0(String str) throws IOException {
        return t.c(K(str));
    }

    @Override // ax.Sc.c
    protected void F(Reader reader) throws IOException {
        super.F(reader);
        a1();
        if (this.c0) {
            ArrayList arrayList = new ArrayList(this.q);
            int i = this.p;
            if (Z0("UTF8") || Z0("UTF-8")) {
                m0("UTF-8");
                this.x = new ax.Uc.a(new InputStreamReader(this.e, O()));
                this.y = new BufferedWriter(new OutputStreamWriter(this.f, O()));
            }
            this.q.clear();
            this.q.addAll(arrayList);
            this.p = i;
            this.r = true;
        }
    }

    public void F0() {
        this.z = 0;
        this.C = null;
        this.B = -1;
    }

    public void G0() {
        this.z = 2;
        this.C = null;
        this.B = -1;
    }

    int H0() {
        int i;
        int i2 = this.E;
        if (i2 <= 0 || (i = this.F) < i2) {
            return 0;
        }
        return i == i2 ? i : this.D.nextInt((i - i2) + 1) + this.E;
    }

    public int K0() {
        return this.z;
    }

    public Duration L0() {
        return this.A;
    }

    InetAddress M0() {
        InetAddress inetAddress = this.G;
        return inetAddress != null ? inetAddress : s();
    }

    protected String N0(String str) {
        if (!O0()) {
            return str;
        }
        if (str == null) {
            return "-a";
        }
        StringBuilder sb = new StringBuilder(str.length() + 3);
        sb.append("-a ");
        sb.append(str);
        return sb.toString();
    }

    public boolean O0() {
        return this.T;
    }

    public String Q0() {
        return this.C;
    }

    public InetAddress R0() {
        return this.I;
    }

    public int S0() {
        return this.B;
    }

    public int T0() {
        return this.S;
    }

    InetAddress U0() {
        InetAddress inetAddress = this.H;
        return inetAddress != null ? inetAddress : M0();
    }

    public long V0() {
        return this.O;
    }

    public int W0() {
        return this.R;
    }

    public String X0() throws IOException {
        if (t.c(o0())) {
            return S();
        }
        return null;
    }

    public String Y0() throws IOException {
        if (this.V == null) {
            if (t.c(q0())) {
                this.V = this.q.get(r0.size() - 1).substring(4);
            } else {
                String property = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                if (property == null) {
                    throw new IOException("Unable to determine system type - response: " + S());
                }
                this.V = property;
            }
        }
        return this.V;
    }

    public boolean Z0(String str) throws IOException {
        if (b1()) {
            return this.d0.containsKey(str.toUpperCase(Locale.ENGLISH));
        }
        return false;
    }

    public s d1(String str, String str2) throws IOException {
        D0(str);
        return c1(this.W, str2);
    }

    public s e1(String str) throws IOException {
        Socket u0 = u0(g.MLSD, str);
        s sVar = new s(ax.Tc.g.e(), this.Y);
        if (u0 == null) {
            return sVar;
        }
        try {
            sVar.i(u0.getInputStream(), O());
            return sVar;
        } finally {
            ax.Uc.f.a(u0);
            C0();
        }
    }

    @Override // ax.Sc.a
    public void f(f fVar) {
        this.Y = fVar;
    }

    public boolean f1() {
        return this.e0;
    }

    public boolean g1() {
        return this.N;
    }

    public boolean h1() {
        return this.U;
    }

    @Override // ax.Rc.e
    protected void i() throws IOException {
        F(null);
    }

    public i[] i1() throws IOException {
        return j1(null);
    }

    public i[] j1(String str) throws IOException {
        return d1(null, str).d();
    }

    public i[] k1(String str, l lVar) throws IOException {
        return d1(null, str).e(lVar);
    }

    public boolean l1(String str, String str2) throws IOException {
        s0(str);
        if (t.c(this.p)) {
            return true;
        }
        if (t.d(this.p)) {
            return t.c(a0(str2));
        }
        return false;
    }

    public boolean m1(String str) throws IOException {
        return t.c(Y(str));
    }

    public i[] n1() throws IOException {
        return o1(null);
    }

    @Override // ax.Sc.c, ax.Rc.e
    public void o() throws IOException {
        super.o();
        a1();
    }

    public i[] o1(String str) throws IOException {
        return e1(str).d();
    }

    public String q1() throws IOException {
        if (d0() != 257) {
            return null;
        }
        return p1(this.q.get(r0.size() - 1));
    }

    public boolean r1(String str) throws IOException {
        return t.c(f0(str));
    }

    public boolean s1(String str, String str2) throws IOException {
        if (t.d(g0(str))) {
            return t.c(h0(str2));
        }
        return false;
    }

    protected boolean t1(long j) throws IOException {
        this.O = 0L;
        return t.d(e0(Long.toString(j)));
    }

    protected Socket u0(g gVar, String str) throws IOException {
        return v0(gVar.h(), str);
    }

    public InputStream u1(String str) throws IOException {
        return y0(g.RETR.h(), str);
    }

    protected Socket v0(String str, String str2) throws IOException {
        Socket socket;
        int i = this.z;
        if (i != 0 && i != 2) {
            return null;
        }
        boolean z = u() instanceof Inet6Address;
        int a2 = ax.Sc.b.a(this.A);
        if (this.z == 0) {
            ServerSocket createServerSocket = this.h.createServerSocket(H0(), 1, M0());
            try {
                if (z) {
                    if (!t.c(L(U0(), createServerSocket.getLocalPort()))) {
                        createServerSocket.close();
                        return null;
                    }
                } else if (!t.c(c0(U0(), createServerSocket.getLocalPort()))) {
                    createServerSocket.close();
                    return null;
                }
                long j = this.O;
                if (j > 0 && !t1(j)) {
                    if (createServerSocket != null) {
                        createServerSocket.close();
                    }
                    return null;
                }
                if (!t.e(l0(str, str2))) {
                    if (createServerSocket != null) {
                        createServerSocket.close();
                    }
                    return null;
                }
                if (a2 >= 0) {
                    createServerSocket.setSoTimeout(a2);
                }
                socket = createServerSocket.accept();
                if (a2 >= 0) {
                    socket.setSoTimeout(a2);
                }
                int i2 = this.S;
                if (i2 > 0) {
                    socket.setReceiveBufferSize(i2);
                }
                int i3 = this.R;
                if (i3 > 0) {
                    socket.setSendBufferSize(i3);
                }
                createServerSocket.close();
            } catch (Throwable th) {
                if (createServerSocket != null) {
                    try {
                        createServerSocket.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            if ((h1() || z) && M() == 229) {
                w0(this.q.get(0));
            } else {
                if (z || b0() != 227) {
                    return null;
                }
                x0(this.q.get(0));
            }
            Socket createSocket = this.g.createSocket();
            int i4 = this.S;
            if (i4 > 0) {
                createSocket.setReceiveBufferSize(i4);
            }
            int i5 = this.R;
            if (i5 > 0) {
                createSocket.setSendBufferSize(i5);
            }
            if (this.I != null) {
                createSocket.bind(new InetSocketAddress(this.I, 0));
            }
            if (a2 >= 0) {
                createSocket.setSoTimeout(a2);
            }
            createSocket.connect(new InetSocketAddress(this.C, this.B), this.i);
            long j2 = this.O;
            if (j2 > 0 && !t1(j2)) {
                createSocket.close();
                return null;
            }
            if (!t.e(l0(str, str2))) {
                createSocket.close();
                return null;
            }
            socket = createSocket;
        }
        if (!this.N || C(socket)) {
            return socket;
        }
        InetAddress inetAddress = socket.getInetAddress();
        socket.close();
        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + u().getHostAddress());
    }

    public boolean v1() throws IOException {
        return t.c(Z());
    }

    protected void w0(String str) throws ax.Rc.a {
        String trim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char charAt = trim.charAt(0);
        char charAt2 = trim.charAt(1);
        char charAt3 = trim.charAt(2);
        char charAt4 = trim.charAt(trim.length() - 1);
        if (charAt != charAt2 || charAt2 != charAt3 || charAt3 != charAt4) {
            throw new ax.Rc.a("Could not parse extended passive host information.\nServer Reply: " + trim);
        }
        try {
            int parseInt = Integer.parseInt(trim.substring(3, trim.length() - 1));
            this.C = u().getHostAddress();
            this.B = parseInt;
        } catch (NumberFormatException unused) {
            throw new ax.Rc.a("Could not parse extended passive host information.\nServer Reply: " + trim);
        }
    }

    public void w1(boolean z) {
        this.c0 = z;
    }

    protected void x0(String str) throws ax.Rc.a {
        Matcher matcher = f0.matcher(str);
        if (!matcher.find()) {
            throw new ax.Rc.a("Could not parse passive host information.\nServer Reply: " + str);
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.b.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int parseInt = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (f1()) {
                a aVar = this.b0;
                if (aVar != null) {
                    try {
                        String a2 = aVar.a(hostAddress);
                        if (!hostAddress.equals(a2)) {
                            q(0, "[Replacing PASV mode reply address " + this.C + " with " + a2 + "]\n");
                            hostAddress = a2;
                        }
                    } catch (UnknownHostException unused) {
                        throw new ax.Rc.a("Could not parse passive host information.\nServer Reply: " + str);
                    }
                }
            } else {
                Socket socket = this.b;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.C = hostAddress;
            this.B = parseInt;
        } catch (NumberFormatException unused2) {
            throw new ax.Rc.a("Could not parse passive port information.\nServer Reply: " + str);
        }
    }

    @Deprecated
    public void x1(int i) {
        this.A = Duration.ofMillis(i);
    }

    protected InputStream y0(String str, String str2) throws IOException {
        Socket v0 = v0(str, str2);
        if (v0 == null) {
            return null;
        }
        return new ax.Uc.c(v0, this.J == 0 ? new ax.Uc.b(I0(v0.getInputStream())) : v0.getInputStream());
    }

    public boolean y1(int i) throws IOException {
        if (!t.c(r0(i))) {
            return false;
        }
        this.J = i;
        this.K = 4;
        return true;
    }

    protected OutputStream z0(String str, String str2) throws IOException {
        Socket v0 = v0(str, str2);
        if (v0 == null) {
            return null;
        }
        return new ax.Uc.d(v0, this.J == 0 ? new ax.Uc.e(J0(v0.getOutputStream())) : v0.getOutputStream());
    }

    public void z1(boolean z) {
        this.T = z;
    }
}

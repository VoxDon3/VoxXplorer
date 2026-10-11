/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Sc.d;
import ax.Sc.f;
import ax.Sc.g;
import ax.Sc.i;
import ax.Sc.j;
import ax.Sc.l;
import ax.Sc.s;
import ax.Sc.t;
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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;

public class e
extends ax.Sc.c
implements ax.Sc.a {
    private static final Pattern f0 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");
    private j.Duration A;
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
    private j.Duration Z = j.Duration.ZERO;
    private j.Duration a0 = j.Duration.ofSeconds((long)1L);
    private a b0 = new b(this);
    private boolean c0;
    private HashMap<String, Set<String>> d0;
    private boolean e0 = Boolean.parseBoolean(System.getProperty("org.apache.commons.net.ftp.ipAddressFromPasvResponse"));
    private int z;

    public e() {
        this.a1();
        this.A = j.Duration.ofMillis((long)-1L);
        this.N = true;
        this.P = new ax.Tc.c();
        this.Y = null;
        this.T = false;
        this.U = false;
        this.D = new Random();
        this.I = null;
    }

    private OutputStream C1(g g8, String string) throws IOException {
        return this.z0(g8.h(), string);
    }

    private InputStream I0(InputStream inputStream) {
        if (this.Q > 0) {
            return new BufferedInputStream(inputStream, this.Q);
        }
        return new BufferedInputStream(inputStream);
    }

    private OutputStream J0(OutputStream outputStream) {
        if (this.Q > 0) {
            return new BufferedOutputStream(outputStream, this.Q);
        }
        return new BufferedOutputStream(outputStream);
    }

    private static Properties P0() {
        return ax.Sc.e$c.a;
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
        this.X = "";
        this.d0 = null;
    }

    private boolean b1() throws IOException {
        if (this.d0 == null) {
            int n8 = this.N();
            int n9 = 0;
            if (n8 == 530) {
                return false;
            }
            boolean bl = ax.Sc.t.c(n8);
            this.d0 = new HashMap();
            if (!bl) {
                return false;
            }
            ArrayList<String> arrayList = this.q;
            int n10 = arrayList.size();
            while (n9 < n10) {
                String string;
                String string2 = arrayList.get(n9);
                n9 = n8 = n9 + 1;
                if (!string2.startsWith(" ")) continue;
                n9 = string2.indexOf(32, 1);
                if (n9 > 0) {
                    string = string2.substring(1, n9);
                    string2 = string2.substring(n9 + 1);
                } else {
                    string = string2.substring(1);
                    string2 = "";
                }
                string = string.toUpperCase(Locale.ENGLISH);
                ((Set)j.Map._EL.computeIfAbsent(this.d0, (Object)string, (Function)new d())).add(string2);
                n9 = n8;
            }
        }
        return true;
    }

    private s c1(j object, String object2) throws IOException {
        object2 = this.u0(ax.Sc.g.m0, this.N0((String)object2));
        object = new s((j)object, this.Y);
        if (object2 == null) {
            return object;
        }
        ((s)object).i(((Socket)object2).getInputStream(), this.O());
        this.C0();
        return object;
        finally {
            ax.Uc.f.a((Socket)object2);
        }
    }

    static String p1(String string) {
        String string2;
        string = string2 = string.substring(4);
        if (string2.startsWith("\"")) {
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = false;
            for (int i8 = 1; i8 < string2.length(); ++i8) {
                char c8 = string2.charAt(i8);
                if (c8 == '\"') {
                    if (bl) {
                        stringBuilder.append(c8);
                        bl = false;
                        continue;
                    }
                    bl = true;
                    continue;
                }
                if (bl) {
                    return stringBuilder.toString();
                }
                stringBuilder.append(c8);
            }
            string = string2;
            if (bl) {
                string = stringBuilder.toString();
            }
        }
        return string;
    }

    public static /* synthetic */ Set t0(String string) {
        return new HashSet();
    }

    public boolean A0() throws IOException {
        return ax.Sc.t.c(this.G());
    }

    public void A1(ax.Tc.d d8) {
        this.P = d8;
    }

    public boolean B0(String string) throws IOException {
        return ax.Sc.t.c(this.J(string));
    }

    public void B1(long l8) {
        if (l8 >= 0L) {
            this.O = l8;
        }
    }

    public boolean C0() throws IOException {
        return ax.Sc.t.c(this.P());
    }

    void D0(String object) throws IOException {
        if (this.W != null && (object == null || this.X.equals(object))) {
            return;
        }
        if (object != null) {
            this.W = this.P.a((String)object);
            this.X = object;
            return;
        }
        object = this.Y;
        if (object != null && ((f)object).e().length() > 0) {
            this.W = this.P.b(this.Y);
            this.X = this.Y.e();
            return;
        }
        String string = System.getProperty("org.apache.commons.net.ftp.systemType");
        object = string;
        if (string == null) {
            string = this.Y0();
            Object object2 = ax.Sc.e.P0();
            object = string;
            if (object2 != null) {
                object2 = ((Properties)object2).getProperty(string);
                object = string;
                if (object2 != null) {
                    object = object2;
                }
            }
        }
        this.W = this.Y != null ? this.P.b(new f((String)object, this.Y)) : this.P.a((String)object);
        this.X = object;
    }

    public OutputStream D1(String string) throws IOException {
        return this.C1(ax.Sc.g.K0, string);
    }

    public boolean E0(String string) throws IOException {
        return ax.Sc.t.c(this.K(string));
    }

    @Override
    protected void F(Reader object) throws IOException {
        super.F((Reader)object);
        this.a1();
        if (this.c0) {
            object = new ArrayList<String>(this.q);
            int n8 = this.p;
            if (this.Z0("UTF8") || this.Z0("UTF-8")) {
                this.m0("UTF-8");
                this.x = new ax.Uc.a(new InputStreamReader(this.e, this.O()));
                this.y = new BufferedWriter(new OutputStreamWriter(this.f, this.O()));
            }
            this.q.clear();
            this.q.addAll((Collection<String>)object);
            this.p = n8;
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
        int n8;
        int n9 = this.E;
        if (n9 > 0 && (n8 = this.F) >= n9) {
            if (n8 == n9) {
                return n8;
            }
            return this.D.nextInt(n8 - n9 + 1) + this.E;
        }
        return 0;
    }

    public int K0() {
        return this.z;
    }

    public j.Duration L0() {
        return this.A;
    }

    InetAddress M0() {
        InetAddress inetAddress = this.G;
        if (inetAddress != null) {
            return inetAddress;
        }
        return this.s();
    }

    protected String N0(String string) {
        CharSequence charSequence = string;
        if (this.O0()) {
            if (string != null) {
                charSequence = new StringBuilder(string.length() + 3);
                ((StringBuilder)charSequence).append("-a ");
                ((StringBuilder)charSequence).append(string);
                return ((StringBuilder)charSequence).toString();
            }
            charSequence = "-a";
        }
        return charSequence;
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
        if (inetAddress != null) {
            return inetAddress;
        }
        return this.M0();
    }

    public long V0() {
        return this.O;
    }

    public int W0() {
        return this.R;
    }

    public String X0() throws IOException {
        if (ax.Sc.t.c(this.o0())) {
            return this.S();
        }
        return null;
    }

    public String Y0() throws IOException {
        if (this.V == null) {
            if (ax.Sc.t.c(this.q0())) {
                ArrayList<String> arrayList = this.q;
                this.V = arrayList.get(arrayList.size() - 1).substring(4);
            } else {
                CharSequence charSequence = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                if (charSequence != null) {
                    this.V = charSequence;
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("Unable to determine system type - response: ");
                    ((StringBuilder)charSequence).append(this.S());
                    throw new IOException(((StringBuilder)charSequence).toString());
                }
            }
        }
        return this.V;
    }

    public boolean Z0(String string) throws IOException {
        if (!this.b1()) {
            return false;
        }
        return this.d0.containsKey(string.toUpperCase(Locale.ENGLISH));
    }

    public s d1(String string, String string2) throws IOException {
        this.D0(string);
        return this.c1(this.W, string2);
    }

    public s e1(String object) throws IOException {
        object = this.u0(ax.Sc.g.q0, (String)object);
        s s8 = new s(ax.Tc.g.e(), this.Y);
        if (object == null) {
            return s8;
        }
        try {
            s8.i(((Socket)object).getInputStream(), this.O());
            return s8;
        }
        finally {
            ax.Uc.f.a((Socket)object);
            this.C0();
        }
    }

    @Override
    public void f(f f8) {
        this.Y = f8;
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

    @Override
    protected void i() throws IOException {
        this.F(null);
    }

    public i[] i1() throws IOException {
        return this.j1(null);
    }

    public i[] j1(String string) throws IOException {
        return this.d1(null, string).d();
    }

    public i[] k1(String string, l l8) throws IOException {
        return this.d1(null, string).e(l8);
    }

    public boolean l1(String string, String string2) throws IOException {
        this.s0(string);
        if (ax.Sc.t.c(this.p)) {
            return true;
        }
        if (!ax.Sc.t.d(this.p)) {
            return false;
        }
        return ax.Sc.t.c(this.a0(string2));
    }

    public boolean m1(String string) throws IOException {
        return ax.Sc.t.c(this.Y(string));
    }

    public i[] n1() throws IOException {
        return this.o1(null);
    }

    @Override
    public void o() throws IOException {
        super.o();
        this.a1();
    }

    public i[] o1(String string) throws IOException {
        return this.e1(string).d();
    }

    public String q1() throws IOException {
        if (this.d0() != 257) {
            return null;
        }
        ArrayList<String> arrayList = this.q;
        return ax.Sc.e.p1(arrayList.get(arrayList.size() - 1));
    }

    public boolean r1(String string) throws IOException {
        return ax.Sc.t.c(this.f0(string));
    }

    public boolean s1(String string, String string2) throws IOException {
        if (!ax.Sc.t.d(this.g0(string))) {
            return false;
        }
        return ax.Sc.t.c(this.h0(string2));
    }

    protected boolean t1(long l8) throws IOException {
        this.O = 0L;
        return ax.Sc.t.d(this.e0(Long.toString(l8)));
    }

    protected Socket u0(g g8, String string) throws IOException {
        return this.v0(g8.h(), string);
    }

    public InputStream u1(String string) throws IOException {
        return this.y0(ax.Sc.g.C0.h(), string);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Socket v0(String var1_1, String var2_3) throws IOException {
        block27: {
            block26: {
                block23: {
                    block25: {
                        block24: {
                            var3_5 = this.z;
                            if (var3_5 != 0 && var3_5 != 2) {
                                return null;
                            }
                            var5_6 = this.u() instanceof Inet6Address;
                            var3_5 = ax.Sc.b.a(this.A);
                            if (this.z != 0) break block26;
                            var8_7 = this.h.createServerSocket(this.H0(), 1, this.M0());
                            if (!var5_6) ** GOTO lbl-1000
                            try {
                                var5_6 = ax.Sc.t.c(this.L(this.U0(), var8_7.getLocalPort()));
                                if (!var5_6) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block23;
                            }
                            var8_7.close();
                            return null;
lbl-1000:
                            // 1 sources

                            {
                                var5_6 = ax.Sc.t.c(this.c0(this.U0(), var8_7.getLocalPort()));
                                if (var5_6) ** GOTO lbl-1000
                            }
                            var8_7.close();
                            return null;
lbl-1000:
                            // 2 sources

                            {
                                if ((var6_9 = this.O) <= 0L || (var5_6 = this.t1(var6_9))) ** GOTO lbl-1000
                                if (var8_7 == null) return null;
                            }
                            var8_7.close();
                            return null;
lbl-1000:
                            // 1 sources

                            {
                                var5_6 = ax.Sc.t.e(this.l0((String)var1_1, (String)var2_3));
                                if (var5_6) break block24;
                                if (var8_7 == null) return null;
                            }
                            var8_7.close();
                            return null;
                        }
                        if (var3_5 < 0) ** GOTO lbl34
                        {
                            var8_7.setSoTimeout(var3_5);
lbl34:
                            // 2 sources

                            var1_1 = var8_7.accept();
                            if (var3_5 >= 0) {
                                var1_1.setSoTimeout(var3_5);
                            }
                            if ((var3_5 = this.S) > 0) {
                                var1_1.setReceiveBufferSize(var3_5);
                            }
                            if ((var3_5 = this.R) <= 0) break block25;
                            var1_1.setSendBufferSize(var3_5);
                        }
                    }
                    var8_7.close();
                    break block27;
                }
                if (var8_7 == null) throw var1_2;
                try {
                    var8_7.close();
                    throw var1_2;
                }
                catch (Throwable var2_4) {
                    var1_2.addSuppressed(var2_4);
                }
                throw var1_2;
            }
            if ((this.h1() || var5_6) && this.M() == 229) {
                this.w0(this.q.get(0));
            } else {
                if (var5_6) {
                    return null;
                }
                if (this.b0() != 227) {
                    return null;
                }
                this.x0(this.q.get(0));
            }
            var8_8 = this.g.createSocket();
            var4_11 = this.S;
            if (var4_11 > 0) {
                var8_8.setReceiveBufferSize(var4_11);
            }
            if ((var4_11 = this.R) > 0) {
                var8_8.setSendBufferSize(var4_11);
            }
            if (this.I != null) {
                var8_8.bind(new InetSocketAddress(this.I, 0));
            }
            if (var3_5 >= 0) {
                var8_8.setSoTimeout(var3_5);
            }
            var8_8.connect(new InetSocketAddress(this.C, this.B), this.i);
            var6_10 = this.O;
            if (var6_10 > 0L && !this.t1(var6_10)) {
                var8_8.close();
                return null;
            }
            if (!ax.Sc.t.e(this.l0((String)var1_1, (String)var2_3))) {
                var8_8.close();
                return null;
            }
            var1_1 = var8_8;
        }
        if (this.N == false) return var1_1;
        if (this.C((Socket)var1_1)) {
            return var1_1;
        }
        var2_3 = var1_1.getInetAddress();
        var1_1.close();
        var1_1 = new StringBuilder();
        var1_1.append("Host attempting data connection ");
        var1_1.append(var2_3.getHostAddress());
        var1_1.append(" is not same as server ");
        var1_1.append(this.u().getHostAddress());
        throw new IOException(var1_1.toString());
    }

    public boolean v1() throws IOException {
        return ax.Sc.t.c(this.Z());
    }

    protected void w0(String string) throws ax.Rc.a {
        string = string.substring(string.indexOf(40) + 1, string.indexOf(41)).trim();
        int n8 = string.charAt(0);
        char c8 = string.charAt(1);
        char c9 = string.charAt(2);
        char c10 = string.charAt(string.length() - 1);
        if (n8 == c8 && c8 == c9 && c9 == c10) {
            try {
                n8 = Integer.parseInt(string.substring(3, string.length() - 1));
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not parse extended passive host information.\nServer Reply: ");
                stringBuilder.append(string);
                throw new ax.Rc.a(stringBuilder.toString());
            }
            this.C = this.u().getHostAddress();
            this.B = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not parse extended passive host information.\nServer Reply: ");
        stringBuilder.append(string);
        throw new ax.Rc.a(stringBuilder.toString());
    }

    public void w1(boolean bl) {
        this.c0 = bl;
    }

    /*
     * Unable to fully structure code
     */
    protected void x0(String var1_1) throws ax.Rc.a {
        var4_2 = ax.Sc.e.f0.matcher((CharSequence)var1_1);
        if (var4_2.find()) {
            var5_7 = "0,0,0,0".equals(var4_2.group(1)) != false ? this.b.getInetAddress().getHostAddress() : var4_2.group(1).replace(',', '.');
            try {
                var3_8 = Integer.parseInt(var4_2.group(2));
                var2_9 = Integer.parseInt(var4_2.group(3));
            }
            catch (NumberFormatException var4_5) {
                var4_6 = new StringBuilder();
                var4_6.append("Could not parse passive port information.\nServer Reply: ");
                var4_6.append((String)var1_1);
                throw new ax.Rc.a(var4_6.toString());
            }
            if (this.f1()) {
                var6_10 = this.b0;
                var4_2 = var5_7;
                if (var6_10 != null) {
                    try {
                        var6_10 = var6_10.a(var5_7);
                        var4_2 = var5_7;
                    }
                    catch (UnknownHostException var4_3) {
                        var4_4 = new StringBuilder();
                        var4_4.append("Could not parse passive host information.\nServer Reply: ");
                        var4_4.append((String)var1_1);
                        throw new ax.Rc.a(var4_4.toString());
                    }
                    if (var5_7.equals(var6_10)) ** GOTO lbl40
                    var4_2 = new StringBuilder();
                    var4_2.append("[Replacing PASV mode reply address ");
                    var4_2.append(this.C);
                    var4_2.append(" with ");
                    var4_2.append((String)var6_10);
                    var4_2.append("]\n");
                    this.q(0, var4_2.toString());
                    var4_2 = var6_10;
                }
            } else {
                var1_1 = this.b;
                var4_2 = var1_1 == null ? null : var1_1.getInetAddress().getHostAddress();
            }
lbl40:
            // 4 sources

            this.C = var4_2;
            this.B = var2_9 | var3_8 << 8;
            return;
        }
        var4_2 = new StringBuilder();
        var4_2.append("Could not parse passive host information.\nServer Reply: ");
        var4_2.append((String)var1_1);
        throw new ax.Rc.a(var4_2.toString());
    }

    @Deprecated
    public void x1(int n8) {
        this.A = j.Duration.ofMillis((long)n8);
    }

    protected InputStream y0(String object, String object2) throws IOException {
        if ((object2 = this.v0((String)object, (String)object2)) == null) {
            return null;
        }
        object = this.J == 0 ? new ax.Uc.b(this.I0(((Socket)object2).getInputStream())) : ((Socket)object2).getInputStream();
        return new ax.Uc.c((Socket)object2, (InputStream)object);
    }

    public boolean y1(int n8) throws IOException {
        if (ax.Sc.t.c(this.r0(n8))) {
            this.J = n8;
            this.K = 4;
            return true;
        }
        return false;
    }

    protected OutputStream z0(String object, String object2) throws IOException {
        if ((object2 = this.v0((String)object, (String)object2)) == null) {
            return null;
        }
        object = this.J == 0 ? new ax.Uc.e(this.J0(((Socket)object2).getOutputStream())) : ((Socket)object2).getOutputStream();
        return new ax.Uc.d((Socket)object2, (OutputStream)object);
    }

    public void z1(boolean bl) {
        this.T = bl;
    }

    public static interface a {
        public String a(String var1) throws UnknownHostException;
    }

    public static class b
    implements a {
        private final e a;

        public b(e e8) {
            this.a = e8;
        }

        @Override
        public String a(String string) throws UnknownHostException {
            String string2 = string;
            if (InetAddress.getByName(string).isSiteLocalAddress()) {
                InetAddress inetAddress = this.a.u();
                string2 = string;
                if (!inetAddress.isSiteLocalAddress()) {
                    string2 = inetAddress.getHostAddress();
                }
            }
            return string2;
        }
    }

    private static class c {
        static final Properties a;

        /*
         * Unable to fully structure code
         */
        static {
            var1 = e.class.getResourceAsStream("/systemType.properties");
            if (var1 != null) {
                var0_3 = new Properties();
                try {
                    var0_3.load(var1);
                }
                catch (Throwable var0_4) {
                    var1.close();
lbl13:
                    // 2 sources

                    throw var0_4;
                }
lbl6:
                // 2 sources

                while (true) {
                    var1.close();
                    break;
                }
            }
            var0_3 = null;
lbl16:
            // 2 sources

            while (true) {
                ax.Sc.e$c.a = var0_3;
                return;
            }
            catch (IOException var2_5) {
                ** continue;
            }
            catch (IOException var1_1) {}
            ** while (true)
            {
                catch (IOException var1_2) {
                    ** continue;
                }
            }
        }
    }
}


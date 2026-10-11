package ax.Sc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c extends ax.Rc.e {
    protected int p;
    protected ArrayList<String> q;
    protected boolean r;
    protected String s;
    protected String t;
    protected ax.Rc.d u;
    protected boolean v;
    private boolean w = true;
    protected BufferedReader x;
    protected BufferedWriter y;

    public c() {
        y(21);
        this.q = new ArrayList<>();
        this.r = false;
        this.s = null;
        this.t = "ISO-8859-1";
        this.u = new ax.Rc.d(this);
    }

    private String H(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        sb.append("\r\n");
        return sb.toString();
    }

    private int Q(boolean z) throws IOException {
        this.r = true;
        this.q.clear();
        String readLine = this.x.readLine();
        if (readLine == null) {
            throw new h("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new ax.Rc.a("Truncated server reply: " + readLine);
        }
        try {
            String substring = readLine.substring(0, 3);
            this.p = Integer.parseInt(substring);
            this.q.add(readLine);
            if (length > 3) {
                char charAt = readLine.charAt(3);
                if (charAt == '-') {
                    while (true) {
                        String readLine2 = this.x.readLine();
                        if (readLine2 == null) {
                            throw new h("Connection closed without indication.");
                        }
                        this.q.add(readLine2);
                        if (U()) {
                            if (!p0(readLine2, substring)) {
                                break;
                            }
                        } else if (!W(readLine2)) {
                            break;
                        }
                    }
                } else if (V()) {
                    if (length == 4) {
                        throw new ax.Rc.a("Truncated server reply: '" + readLine + "'");
                    }
                    if (charAt != ' ') {
                        throw new ax.Rc.a("Invalid server reply: '" + readLine + "'");
                    }
                }
            } else if (V()) {
                throw new ax.Rc.a("Truncated server reply: '" + readLine + "'");
            }
            if (z) {
                q(this.p, S());
            }
            int i = this.p;
            if (i != 421) {
                return i;
            }
            throw new h("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new ax.Rc.a("Could not parse response code.\nServer Reply: " + readLine);
        }
    }

    private boolean W(String str) {
        return str.length() <= 3 || str.charAt(3) == '-' || !Character.isDigit(str.charAt(0));
    }

    private void i0(String str) throws IOException, h, SocketException {
        try {
            this.y.write(str);
            this.y.flush();
        } catch (SocketException e) {
            if (!w()) {
                throw new h("Connection unexpectedly closed.");
            }
            throw e;
        }
    }

    private boolean p0(String str, String str2) {
        return (str.startsWith(str2) && str.charAt(3) == ' ') ? false : true;
    }

    protected void D() throws IOException {
        Q(false);
    }

    protected void E() throws IOException {
        i0(H(g.NOOP.h(), null));
        D();
    }

    protected void F(Reader reader) throws IOException {
        super.i();
        if (reader == null) {
            this.x = new ax.Uc.a(new InputStreamReader(this.e, O()));
        } else {
            this.x = new ax.Uc.a(reader);
        }
        this.y = new BufferedWriter(new OutputStreamWriter(this.f, O()));
        if (this.i <= 0) {
            P();
            if (t.e(this.p)) {
                P();
                return;
            }
            return;
        }
        int soTimeout = this.b.getSoTimeout();
        this.b.setSoTimeout(this.i);
        try {
            try {
                P();
                if (t.e(this.p)) {
                    P();
                }
            } catch (SocketTimeoutException e) {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(e);
                throw iOException;
            }
        } finally {
            this.b.setSoTimeout(soTimeout);
        }
    }

    public int G() throws IOException {
        return j0(g.ABOR);
    }

    public int I() throws IOException {
        return j0(g.CDUP);
    }

    public int J(String str) throws IOException {
        return k0(g.CWD, str);
    }

    public int K(String str) throws IOException {
        return k0(g.DELE, str);
    }

    public int L(InetAddress inetAddress, int i) throws IOException {
        StringBuilder sb = new StringBuilder();
        String hostAddress = inetAddress.getHostAddress();
        int indexOf = hostAddress.indexOf(37);
        if (indexOf > 0) {
            hostAddress = hostAddress.substring(0, indexOf);
        }
        sb.append("|");
        if (inetAddress instanceof Inet4Address) {
            sb.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb.append("2");
        }
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return k0(g.EPRT, sb.toString());
    }

    public int M() throws IOException {
        return j0(g.EPSV);
    }

    public int N() throws IOException {
        return j0(g.FEAT);
    }

    public String O() {
        return this.t;
    }

    public int P() throws IOException {
        return Q(true);
    }

    public int R() {
        return this.p;
    }

    public String S() {
        if (!this.r) {
            return this.s;
        }
        StringBuilder sb = new StringBuilder(256);
        ArrayList<String> arrayList = this.q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str);
            sb.append("\r\n");
        }
        this.r = false;
        String sb2 = sb.toString();
        this.s = sb2;
        return sb2;
    }

    public String[] T() {
        return (String[]) this.q.toArray(ax.Vc.c.a);
    }

    public boolean U() {
        return this.v;
    }

    public boolean V() {
        return this.w;
    }

    public int X(String str, String str2) throws IOException {
        return k0(g.MFMT, str2 + " " + str);
    }

    public int Y(String str) throws IOException {
        return k0(g.MKD, str);
    }

    public int Z() throws IOException {
        return j0(g.NOOP);
    }

    public int a0(String str) throws IOException {
        return k0(g.PASS, str);
    }

    public int b0() throws IOException {
        return j0(g.PASV);
    }

    public int c0(InetAddress inetAddress, int i) throws IOException {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return k0(g.PORT, sb.toString());
    }

    public int d0() throws IOException {
        return j0(g.PWD);
    }

    public int e0(String str) throws IOException {
        return k0(g.REST, str);
    }

    public int f0(String str) throws IOException {
        return k0(g.RMD, str);
    }

    public int g0(String str) throws IOException {
        return k0(g.RNFR, str);
    }

    public int h0(String str) throws IOException {
        return k0(g.RNTO, str);
    }

    public int j0(g gVar) throws IOException {
        return k0(gVar, null);
    }

    public int k0(g gVar, String str) throws IOException {
        return l0(gVar.h(), str);
    }

    public int l0(String str, String str2) throws IOException {
        if (this.y == null) {
            throw new IOException("Connection is not open");
        }
        String H = H(str, str2);
        i0(H);
        p(str, H);
        return P();
    }

    public void m0(String str) {
        this.t = str;
    }

    public void n0(boolean z) {
        this.w = z;
    }

    @Override // ax.Rc.e
    public void o() throws IOException {
        super.o();
        this.x = null;
        this.y = null;
        this.r = false;
        this.s = null;
    }

    public int o0() throws IOException {
        return j0(g.STAT);
    }

    public int q0() throws IOException {
        return j0(g.SYST);
    }

    @Override // ax.Rc.e
    protected ax.Rc.d r() {
        return this.u;
    }

    public int r0(int i) throws IOException {
        return k0(g.TYPE, "AEILNTCFRPSBC".substring(i, i + 1));
    }

    public int s0(String str) throws IOException {
        return k0(g.USER, str);
    }
}

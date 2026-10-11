/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Rc.a;
import ax.Rc.d;
import ax.Rc.e;
import ax.Sc.g;
import ax.Sc.h;
import ax.Sc.t;
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

public class c
extends e {
    protected int p;
    protected ArrayList<String> q;
    protected boolean r;
    protected String s;
    protected String t;
    protected d u;
    protected boolean v;
    private boolean w = true;
    protected BufferedReader x;
    protected BufferedWriter y;

    public c() {
        this.y(21);
        this.q = new ArrayList();
        this.r = false;
        this.s = null;
        this.t = "ISO-8859-1";
        this.u = new d(this);
    }

    private String H(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        if (string2 != null) {
            stringBuilder.append(' ');
            stringBuilder.append(string2);
        }
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }

    private int Q(boolean bl) throws IOException {
        block16: {
            String string;
            block17: {
                CharSequence charSequence;
                block20: {
                    int n8;
                    block15: {
                        block18: {
                            block19: {
                                this.r = true;
                                this.q.clear();
                                string = this.x.readLine();
                                if (string == null) break block16;
                                n8 = string.length();
                                if (n8 < 3) break block17;
                                try {
                                    charSequence = string.substring(0, 3);
                                    this.p = Integer.parseInt((String)charSequence);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Could not parse response code.\nServer Reply: ");
                                    stringBuilder.append(string);
                                    throw new a(stringBuilder.toString());
                                }
                                this.q.add(string);
                                if (n8 <= 3) break block18;
                                char c8 = string.charAt(3);
                                if (c8 == '-') {
                                    while ((string = this.x.readLine()) != null) {
                                        this.q.add(string);
                                        if (this.U()) {
                                            if (this.p0(string, (String)charSequence)) {
                                                continue;
                                            }
                                        } else if (this.W(string)) continue;
                                        break block15;
                                    }
                                    throw new h("Connection closed without indication.");
                                }
                                if (!this.V()) break block15;
                                if (n8 == 4) break block19;
                                if (c8 != ' ') {
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append("Invalid server reply: '");
                                    ((StringBuilder)charSequence).append(string);
                                    ((StringBuilder)charSequence).append("'");
                                    throw new a(((StringBuilder)charSequence).toString());
                                }
                                break block15;
                            }
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Truncated server reply: '");
                            ((StringBuilder)charSequence).append(string);
                            ((StringBuilder)charSequence).append("'");
                            throw new a(((StringBuilder)charSequence).toString());
                        }
                        if (this.V()) break block20;
                    }
                    if (bl) {
                        this.q(this.p, this.S());
                    }
                    if ((n8 = this.p) != 421) {
                        return n8;
                    }
                    throw new h("FTP response 421 received.  Server closed connection.");
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Truncated server reply: '");
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append("'");
                throw new a(((StringBuilder)charSequence).toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Truncated server reply: ");
            stringBuilder.append(string);
            throw new a(stringBuilder.toString());
        }
        throw new h("Connection closed without indication.");
    }

    private boolean W(String string) {
        return string.length() <= 3 || string.charAt(3) == '-' || !Character.isDigit(string.charAt(0));
        {
        }
    }

    private void i0(String string) throws IOException, h, SocketException {
        try {
            this.y.write(string);
            this.y.flush();
            return;
        }
        catch (SocketException socketException) {
            if (!this.w()) {
                throw new h("Connection unexpectedly closed.");
            }
            throw socketException;
        }
    }

    private boolean p0(String string, String string2) {
        return !string.startsWith(string2) || string.charAt(3) != ' ';
        {
        }
    }

    protected void D() throws IOException {
        this.Q(false);
    }

    protected void E() throws IOException {
        this.i0(this.H(ax.Sc.g.u0.h(), null));
        this.D();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    protected void F(Reader reader) throws IOException {
        Throwable throwable222;
        int n8;
        block6: {
            SocketTimeoutException socketTimeoutException2;
            block5: {
                super.i();
                this.x = reader == null ? new ax.Uc.a(new InputStreamReader(this.e, this.O())) : new ax.Uc.a(reader);
                this.y = new BufferedWriter(new OutputStreamWriter(this.f, this.O()));
                if (this.i <= 0) {
                    this.P();
                    if (!ax.Sc.t.e(this.p)) return;
                    this.P();
                    return;
                }
                n8 = this.b.getSoTimeout();
                this.b.setSoTimeout(this.i);
                try {
                    this.P();
                    if (!ax.Sc.t.e(this.p)) break block5;
                    this.P();
                }
                catch (Throwable throwable222) {
                    break block6;
                }
                catch (SocketTimeoutException socketTimeoutException2) {}
            }
            this.b.setSoTimeout(n8);
            return;
            {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(socketTimeoutException2);
                throw iOException;
            }
        }
        this.b.setSoTimeout(n8);
        throw throwable222;
    }

    public int G() throws IOException {
        return this.j0(ax.Sc.g.q);
    }

    public int I() throws IOException {
        return this.j0(ax.Sc.g.f0);
    }

    public int J(String string) throws IOException {
        return this.k0(ax.Sc.g.g0, string);
    }

    public int K(String string) throws IOException {
        return this.k0(ax.Sc.g.h0, string);
    }

    public int L(InetAddress inetAddress, int n8) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String string = inetAddress.getHostAddress();
        int n9 = string.indexOf(37);
        String string2 = string;
        if (n9 > 0) {
            string2 = string.substring(0, n9);
        }
        stringBuilder.append("|");
        if (inetAddress instanceof Inet4Address) {
            stringBuilder.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            stringBuilder.append("2");
        }
        stringBuilder.append("|");
        stringBuilder.append(string2);
        stringBuilder.append("|");
        stringBuilder.append(n8);
        stringBuilder.append("|");
        return this.k0(ax.Sc.g.i0, stringBuilder.toString());
    }

    public int M() throws IOException {
        return this.j0(ax.Sc.g.j0);
    }

    public int N() throws IOException {
        return this.j0(ax.Sc.g.k0);
    }

    public String O() {
        return this.t;
    }

    public int P() throws IOException {
        return this.Q(true);
    }

    public int R() {
        return this.p;
    }

    public String S() {
        if (!this.r) {
            return this.s;
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        Object object = this.q;
        int n8 = ((ArrayList)object).size();
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = ((ArrayList)object).get(i8);
            stringBuilder.append(string);
            stringBuilder.append("\r\n");
        }
        this.r = false;
        this.s = object = stringBuilder.toString();
        return object;
    }

    public String[] T() {
        return this.q.toArray(ax.Vc.c.a);
    }

    public boolean U() {
        return this.v;
    }

    public boolean V() {
        return this.w;
    }

    public int X(String string, String string2) throws IOException {
        g g8 = ax.Sc.g.o0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        return this.k0(g8, stringBuilder.toString());
    }

    public int Y(String string) throws IOException {
        return this.k0(ax.Sc.g.p0, string);
    }

    public int Z() throws IOException {
        return this.j0(ax.Sc.g.u0);
    }

    public int a0(String string) throws IOException {
        return this.k0(ax.Sc.g.v0, string);
    }

    public int b0() throws IOException {
        return this.j0(ax.Sc.g.w0);
    }

    public int c0(InetAddress inetAddress, int n8) throws IOException {
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append(inetAddress.getHostAddress().replace('.', ','));
        stringBuilder.append(',');
        stringBuilder.append(n8 >>> 8);
        stringBuilder.append(',');
        stringBuilder.append(n8 & 0xFF);
        return this.k0(ax.Sc.g.x0, stringBuilder.toString());
    }

    public int d0() throws IOException {
        return this.j0(ax.Sc.g.y0);
    }

    public int e0(String string) throws IOException {
        return this.k0(ax.Sc.g.B0, string);
    }

    public int f0(String string) throws IOException {
        return this.k0(ax.Sc.g.D0, string);
    }

    public int g0(String string) throws IOException {
        return this.k0(ax.Sc.g.E0, string);
    }

    public int h0(String string) throws IOException {
        return this.k0(ax.Sc.g.F0, string);
    }

    public int j0(g g8) throws IOException {
        return this.k0(g8, null);
    }

    public int k0(g g8, String string) throws IOException {
        return this.l0(g8.h(), string);
    }

    public int l0(String string, String string2) throws IOException {
        if (this.y != null) {
            string2 = this.H(string, string2);
            this.i0(string2);
            this.p(string, string2);
            return this.P();
        }
        throw new IOException("Connection is not open");
    }

    public void m0(String string) {
        this.t = string;
    }

    public void n0(boolean bl) {
        this.w = bl;
    }

    @Override
    public void o() throws IOException {
        super.o();
        this.x = null;
        this.y = null;
        this.r = false;
        this.s = null;
    }

    public int o0() throws IOException {
        return this.j0(ax.Sc.g.J0);
    }

    public int q0() throws IOException {
        return this.j0(ax.Sc.g.N0);
    }

    @Override
    protected d r() {
        return this.u;
    }

    public int r0(int n8) throws IOException {
        return this.k0(ax.Sc.g.O0, "AEILNTCFRPSBC".substring(n8, n8 + 1));
    }

    public int s0(String string) throws IOException {
        return this.k0(ax.Sc.g.P0, string);
    }
}


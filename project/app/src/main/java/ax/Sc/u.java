/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import ax.Sc.b;
import ax.Sc.e;
import ax.Sc.t;
import ax.Sc.v;
import ax.Sc.w;
import ax.Vc.d;
import ax.Vc.f;
import ax.Vc.g;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

public class u
extends e {
    private static final String[] v0 = new String[]{"C", "E", "S", "P"};
    private final boolean g0;
    private final String h0;
    private String i0 = "TLS";
    private SSLContext j0;
    private Socket k0;
    private boolean l0 = true;
    private boolean m0 = true;
    private boolean n0;
    private boolean o0;
    private String[] p0;
    private String[] q0;
    private TrustManager r0 = ax.Vc.g.b();
    private KeyManager s0;
    private HostnameVerifier t0;
    private boolean u0;

    public u() {
        this("TLS", false);
    }

    public u(String string, boolean bl) {
        this.h0 = string;
        this.g0 = bl;
        if (bl) {
            this.y(990);
        }
    }

    public u(boolean bl) {
        this("TLS", bl);
    }

    public u(boolean bl, SSLContext sSLContext) {
        this("TLS", bl);
        this.j0 = sSLContext;
    }

    private boolean F1(String string) {
        String[] stringArray = v0;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!stringArray[i8].equals(string)) continue;
            return true;
        }
        return false;
    }

    private void G1(Socket socket, Socket socket2) throws IOException {
        if (socket != null) {
            socket.close();
        }
        if (socket2 != null) {
            socket2.close();
        }
    }

    private SSLSocket H1(Socket socket) throws IOException {
        if (socket != null) {
            return (SSLSocket)this.j0.getSocketFactory().createSocket(socket, this.c, socket.getPort(), false);
        }
        return null;
    }

    private KeyManager M1() {
        return this.s0;
    }

    private void P1() throws IOException {
        if (this.j0 == null) {
            this.j0 = ax.Vc.d.a(this.h0, this.M1(), this.O1());
        }
    }

    protected void E1(Socket socket) throws IOException {
    }

    protected Socket I1() throws IOException {
        return this.g.createSocket();
    }

    protected void J1() throws SSLException, IOException {
        int n8 = this.l0("AUTH", this.i0);
        if (334 == n8 || 234 == n8) {
            return;
        }
        throw new SSLException(this.S());
    }

    public void K1(long l8) throws SSLException, IOException {
        if (l8 >= 0L && 0xFFFFFFFFL >= l8) {
            if (200 == this.l0("PBSZ", String.valueOf(l8))) {
                return;
            }
            throw new SSLException(this.S());
        }
        throw new IllegalArgumentException();
    }

    public void L1(String string) throws SSLException, IOException {
        String string2 = string;
        if (string == null) {
            string2 = "C";
        }
        if (this.F1(string2)) {
            if (200 == this.l0("PROT", string2)) {
                if ("C".equals(string2)) {
                    this.B(null);
                    this.A(null);
                    return;
                }
                this.B(new w(this.j0));
                this.A(new v(this.j0));
                this.P1();
                return;
            }
            throw new SSLException(this.S());
        }
        throw new IllegalArgumentException();
    }

    protected SSLContext N1() {
        return this.j0;
    }

    public TrustManager O1() {
        return this.r0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Socket Q1(String var1_1, String var2_3) throws IOException {
        block27: {
            block26: {
                block23: {
                    block25: {
                        block24: {
                            var3_5 = this.K0();
                            var5_6 = null;
                            if (var3_5 != 0 && this.K0() != 2) {
                                return null;
                            }
                            var4_7 = this.u() instanceof Inet6Address;
                            var3_5 = ax.Sc.b.a(this.L0());
                            if (this.K0() != 0) break block26;
                            var6_8 = this.h.createServerSocket(this.H0(), 1, this.M0());
                            if (!var4_7) ** GOTO lbl-1000
                            try {
                                var4_7 = ax.Sc.t.c(this.L(this.U0(), var6_8.getLocalPort()));
                                if (!var4_7) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var1_2) {
                                break block23;
                            }
                            var6_8.close();
                            return null;
lbl-1000:
                            // 1 sources

                            {
                                var4_7 = ax.Sc.t.c(this.c0(this.U0(), var6_8.getLocalPort()));
                                if (var4_7) ** GOTO lbl-1000
                            }
                            var6_8.close();
                            return null;
lbl-1000:
                            // 2 sources

                            {
                                if (this.V0() <= 0L || (var4_7 = this.t1(this.V0()))) ** GOTO lbl-1000
                                if (var6_8 == null) return null;
                            }
                            var6_8.close();
                            return null;
lbl-1000:
                            // 1 sources

                            {
                                var4_7 = ax.Sc.t.e(this.l0((String)var1_1, (String)var2_3));
                                if (var4_7) break block24;
                                if (var6_8 == null) return null;
                            }
                            var6_8.close();
                            return null;
                        }
                        if (var3_5 < 0) ** GOTO lbl35
                        {
                            var6_8.setSoTimeout(var3_5);
lbl35:
                            // 2 sources

                            var1_1 = var6_8.accept();
                            if (var3_5 >= 0) {
                                var1_1.setSoTimeout(var3_5);
                            }
                            if (this.T0() > 0) {
                                var1_1.setReceiveBufferSize(this.T0());
                            }
                            if (this.W0() <= 0) break block25;
                            var1_1.setSendBufferSize(this.W0());
                        }
                    }
                    var6_8.close();
                    var2_3 = var5_6;
                    break block27;
                }
                if (var6_8 == null) throw var1_2;
                try {
                    var6_8.close();
                    throw var1_2;
                }
                catch (Throwable var2_4) {
                    var1_2.addSuppressed(var2_4);
                }
                throw var1_2;
            }
            if ((this.h1() || var4_7) && this.M() == 229) {
                this.w0(this.q.get(0));
            } else {
                if (var4_7) {
                    return null;
                }
                if (this.b0() != 227) {
                    return null;
                }
                this.x0(this.q.get(0));
            }
            var5_6 = this.t() != null ? new Socket(this.t()) : this.I1();
            if (this.T0() > 0) {
                var5_6.setReceiveBufferSize(this.T0());
            }
            if (this.W0() > 0) {
                var5_6.setSendBufferSize(this.W0());
            }
            if (this.R0() != null) {
                var5_6.bind(new InetSocketAddress(this.R0(), 0));
            }
            if (var3_5 >= 0) {
                var5_6.setSoTimeout(var3_5);
            }
            var5_6.connect(new InetSocketAddress(this.Q0(), this.S0()), this.i);
            var6_9 = this.t() != null ? this.j0.getSocketFactory().createSocket((Socket)var5_6, this.Q0(), this.S0(), true) : null;
            if (this.V0() > 0L && !this.t1(this.V0())) {
                this.G1((Socket)var5_6, var6_9);
                return null;
            }
            if (!ax.Sc.t.e(this.l0((String)var1_1, (String)var2_3))) {
                this.G1((Socket)var5_6, var6_9);
                return null;
            }
            var1_1 = var5_6;
            var2_3 = var6_9;
        }
        if (this.g1() && !this.C((Socket)var1_1)) {
            var5_6 = var1_1.getInetAddress();
            this.G1((Socket)var1_1, (Socket)var2_3);
            var1_1 = new StringBuilder();
            var1_1.append("Host attempting data connection ");
            var1_1.append(var5_6.getHostAddress());
            var1_1.append(" is not same as server ");
            var1_1.append(this.u().getHostAddress());
            throw new IOException(var1_1.toString());
        }
        if (this.t() == null) return var1_1;
        return var2_3;
    }

    public void R1(TrustManager trustManager) {
        this.r0 = trustManager;
    }

    protected void S1() throws IOException {
        Object object;
        this.k0 = this.b;
        this.P1();
        SSLSocket sSLSocket = this.H1(this.b);
        sSLSocket.setEnableSessionCreation(this.l0);
        sSLSocket.setUseClientMode(this.m0);
        if (this.m0) {
            if (this.u0) {
                ax.Vc.f.a(sSLSocket);
            }
        } else {
            sSLSocket.setNeedClientAuth(this.n0);
            sSLSocket.setWantClientAuth(this.o0);
        }
        if ((object = this.q0) != null) {
            sSLSocket.setEnabledProtocols((String[])object);
        }
        if ((object = this.p0) != null) {
            sSLSocket.setEnabledCipherSuites((String[])object);
        }
        sSLSocket.startHandshake();
        this.b = sSLSocket;
        this.x = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.O()));
        this.y = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.O()));
        if (this.m0 && (object = this.t0) != null && !object.verify(this.c, sSLSocket.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    @Override
    protected void i() throws IOException {
        if (this.g0) {
            this.j();
            this.S1();
        }
        super.i();
        if (!this.g0) {
            this.J1();
            this.S1();
        }
    }

    @Override
    public int l0(String string, String string2) throws IOException {
        int n8 = super.l0(string, string2);
        if ("CCC".equals(string)) {
            if (200 == n8) {
                this.b.close();
                this.b = this.k0;
                this.x = new BufferedReader(new InputStreamReader(this.b.getInputStream(), this.O()));
                this.y = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream(), this.O()));
                return n8;
            }
            throw new SSLException(this.S());
        }
        return n8;
    }

    @Override
    public void o() throws IOException {
        super.o();
        Socket socket = this.k0;
        if (socket != null) {
            socket.close();
        }
        this.B(null);
        this.A(null);
    }

    @Override
    protected Socket v0(String object, String object2) throws IOException {
        object = this.Q1((String)object, (String)object2);
        this.E1((Socket)object);
        if (object instanceof SSLSocket) {
            String[] stringArray;
            object2 = (SSLSocket)object;
            ((SSLSocket)object2).setUseClientMode(this.m0);
            ((SSLSocket)object2).setEnableSessionCreation(this.l0);
            if (!this.m0) {
                ((SSLSocket)object2).setNeedClientAuth(this.n0);
                ((SSLSocket)object2).setWantClientAuth(this.o0);
            }
            if ((stringArray = this.p0) != null) {
                ((SSLSocket)object2).setEnabledCipherSuites(stringArray);
            }
            if ((stringArray = this.q0) != null) {
                ((SSLSocket)object2).setEnabledProtocols(stringArray);
            }
            ((SSLSocket)object2).startHandshake();
        }
        return object;
    }
}


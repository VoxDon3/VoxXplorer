package ax.Sc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* loaded from: classes3.dex */
public class u extends e {
    private static final String[] v0 = {"C", "E", "S", "P"};
    private final boolean g0;
    private final String h0;
    private String i0;
    private SSLContext j0;
    private Socket k0;
    private boolean l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private String[] p0;
    private String[] q0;
    private TrustManager r0;
    private KeyManager s0;
    private HostnameVerifier t0;
    private boolean u0;

    public u() {
        this("TLS", false);
    }

    private boolean F1(String str) {
        for (String str2 : v0) {
            if (str2.equals(str)) {
                return true;
            }
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
            return (SSLSocket) this.j0.getSocketFactory().createSocket(socket, this.c, socket.getPort(), false);
        }
        return null;
    }

    private KeyManager M1() {
        return this.s0;
    }

    private void P1() throws IOException {
        if (this.j0 == null) {
            this.j0 = ax.Vc.d.a(this.h0, M1(), O1());
        }
    }

    protected Socket I1() throws IOException {
        return this.g.createSocket();
    }

    protected void J1() throws SSLException, IOException {
        int l0 = l0("AUTH", this.i0);
        if (334 != l0 && 234 != l0) {
            throw new SSLException(S());
        }
    }

    public void K1(long j) throws SSLException, IOException {
        if (j < 0 || 4294967295L < j) {
            throw new IllegalArgumentException();
        }
        if (200 != l0("PBSZ", String.valueOf(j))) {
            throw new SSLException(S());
        }
    }

    public void L1(String str) throws SSLException, IOException {
        if (str == null) {
            str = "C";
        }
        if (!F1(str)) {
            throw new IllegalArgumentException();
        }
        if (200 != l0("PROT", str)) {
            throw new SSLException(S());
        }
        if ("C".equals(str)) {
            B(null);
            A(null);
        } else {
            B(new w(this.j0));
            A(new v(this.j0));
            P1();
        }
    }

    protected SSLContext N1() {
        return this.j0;
    }

    public TrustManager O1() {
        return this.r0;
    }

    protected Socket Q1(String str, String str2) throws IOException {
        Socket socket;
        Socket socket2 = null;
        if (K0() != 0 && K0() != 2) {
            return null;
        }
        boolean z = u() instanceof Inet6Address;
        int a = b.a(L0());
        if (K0() == 0) {
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
                if (V0() > 0 && !t1(V0())) {
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
                if (a >= 0) {
                    createServerSocket.setSoTimeout(a);
                }
                socket = createServerSocket.accept();
                if (a >= 0) {
                    socket.setSoTimeout(a);
                }
                if (T0() > 0) {
                    socket.setReceiveBufferSize(T0());
                }
                if (W0() > 0) {
                    socket.setSendBufferSize(W0());
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
            Socket socket3 = t() != null ? new Socket(t()) : I1();
            if (T0() > 0) {
                socket3.setReceiveBufferSize(T0());
            }
            if (W0() > 0) {
                socket3.setSendBufferSize(W0());
            }
            if (R0() != null) {
                socket3.bind(new InetSocketAddress(R0(), 0));
            }
            if (a >= 0) {
                socket3.setSoTimeout(a);
            }
            socket3.connect(new InetSocketAddress(Q0(), S0()), this.i);
            Socket createSocket = t() != null ? this.j0.getSocketFactory().createSocket(socket3, Q0(), S0(), true) : null;
            if (V0() > 0 && !t1(V0())) {
                G1(socket3, createSocket);
                return null;
            }
            if (!t.e(l0(str, str2))) {
                G1(socket3, createSocket);
                return null;
            }
            socket = socket3;
            socket2 = createSocket;
        }
        if (!g1() || C(socket)) {
            return t() != null ? socket2 : socket;
        }
        InetAddress inetAddress = socket.getInetAddress();
        G1(socket, socket2);
        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + u().getHostAddress());
    }

    public void R1(TrustManager trustManager) {
        this.r0 = trustManager;
    }

    protected void S1() throws IOException {
        HostnameVerifier hostnameVerifier;
        this.k0 = this.b;
        P1();
        SSLSocket H1 = H1(this.b);
        H1.setEnableSessionCreation(this.l0);
        H1.setUseClientMode(this.m0);
        if (!this.m0) {
            H1.setNeedClientAuth(this.n0);
            H1.setWantClientAuth(this.o0);
        } else if (this.u0) {
            ax.Vc.f.a(H1);
        }
        String[] strArr = this.q0;
        if (strArr != null) {
            H1.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.p0;
        if (strArr2 != null) {
            H1.setEnabledCipherSuites(strArr2);
        }
        H1.startHandshake();
        this.b = H1;
        this.x = new BufferedReader(new InputStreamReader(H1.getInputStream(), O()));
        this.y = new BufferedWriter(new OutputStreamWriter(H1.getOutputStream(), O()));
        if (this.m0 && (hostnameVerifier = this.t0) != null && !hostnameVerifier.verify(this.c, H1.getSession())) {
            throw new SSLHandshakeException("Hostname doesn't match certificate");
        }
    }

    @Override // ax.Sc.e, ax.Rc.e
    protected void i() throws IOException {
        if (this.g0) {
            j();
            S1();
        }
        super.i();
        if (this.g0) {
            return;
        }
        J1();
        S1();
    }

    @Override // ax.Sc.c
    public int l0(String str, String str2) throws IOException {
        int l0 = super.l0(str, str2);
        if (!"CCC".equals(str)) {
            return l0;
        }
        if (200 != l0) {
            throw new SSLException(S());
        }
        this.b.close();
        this.b = this.k0;
        this.x = new BufferedReader(new InputStreamReader(this.b.getInputStream(), O()));
        this.y = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream(), O()));
        return l0;
    }

    @Override // ax.Sc.e, ax.Sc.c, ax.Rc.e
    public void o() throws IOException {
        super.o();
        Socket socket = this.k0;
        if (socket != null) {
            socket.close();
        }
        B(null);
        A(null);
    }

    @Override // ax.Sc.e
    protected Socket v0(String str, String str2) throws IOException {
        Socket Q1 = Q1(str, str2);
        E1(Q1);
        if (Q1 instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) Q1;
            sSLSocket.setUseClientMode(this.m0);
            sSLSocket.setEnableSessionCreation(this.l0);
            if (!this.m0) {
                sSLSocket.setNeedClientAuth(this.n0);
                sSLSocket.setWantClientAuth(this.o0);
            }
            String[] strArr = this.p0;
            if (strArr != null) {
                sSLSocket.setEnabledCipherSuites(strArr);
            }
            String[] strArr2 = this.q0;
            if (strArr2 != null) {
                sSLSocket.setEnabledProtocols(strArr2);
            }
            sSLSocket.startHandshake();
        }
        return Q1;
    }

    public u(boolean z) {
        this("TLS", z);
    }

    public u(boolean z, SSLContext sSLContext) {
        this("TLS", z);
        this.j0 = sSLContext;
    }

    public u(String str, boolean z) {
        this.i0 = "TLS";
        this.l0 = true;
        this.m0 = true;
        this.r0 = ax.Vc.g.b();
        this.h0 = str;
        this.g0 = z;
        if (z) {
            y(990);
        }
    }

    protected void E1(Socket socket) throws IOException {
    }
}

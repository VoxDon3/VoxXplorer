package ax.Rc;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* loaded from: classes3.dex */
public abstract class e {
    private static final SocketFactory n = SocketFactory.getDefault();
    private static final ServerSocketFactory o = ServerSocketFactory.getDefault();
    private Proxy l;
    protected int i = 60000;
    private int j = -1;
    private int k = -1;
    private Charset m = Charset.defaultCharset();
    protected Socket b = null;
    protected String c = null;
    protected InputStream e = null;
    protected OutputStream f = null;
    protected int a = 0;
    protected int d = 0;
    protected SocketFactory g = n;
    protected ServerSocketFactory h = o;

    private void h(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException {
        Socket createSocket = this.g.createSocket();
        this.b = createSocket;
        int i3 = this.j;
        if (i3 != -1) {
            createSocket.setReceiveBufferSize(i3);
        }
        int i4 = this.k;
        if (i4 != -1) {
            this.b.setSendBufferSize(i4);
        }
        if (inetAddress2 != null) {
            this.b.bind(new InetSocketAddress(inetAddress2, i2));
        }
        this.b.connect(new InetSocketAddress(inetAddress, i), this.i);
        i();
    }

    private void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void l(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public void A(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this.h = o;
        } else {
            this.h = serverSocketFactory;
        }
    }

    public void B(SocketFactory socketFactory) {
        if (socketFactory == null) {
            this.g = n;
        } else {
            this.g = socketFactory;
        }
    }

    public boolean C(Socket socket) {
        return socket.getInetAddress().equals(u());
    }

    protected void i() throws IOException {
        j();
        this.e = this.b.getInputStream();
        this.f = this.b.getOutputStream();
    }

    protected void j() throws SocketException {
        this.b.setSoTimeout(this.a);
    }

    public void m(String str, int i) throws SocketException, IOException {
        this.c = str;
        h(InetAddress.getByName(str), i, null, -1);
    }

    public void n(InetAddress inetAddress, int i) throws SocketException, IOException {
        this.c = null;
        h(inetAddress, i, null, -1);
    }

    public void o() throws IOException {
        l(this.b);
        k(this.e);
        k(this.f);
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
    }

    protected void p(String str, String str2) {
        if (r().c() > 0) {
            r().a(str, str2);
        }
    }

    protected void q(int i, String str) {
        if (r().c() > 0) {
            r().b(i, str);
        }
    }

    protected abstract d r();

    public InetAddress s() {
        return this.b.getLocalAddress();
    }

    public Proxy t() {
        return this.l;
    }

    public InetAddress u() {
        return this.b.getInetAddress();
    }

    public boolean v() {
        if (w()) {
            try {
                if (this.b.getInetAddress() == null || this.b.getPort() == 0 || this.b.getRemoteSocketAddress() == null || this.b.isClosed() || this.b.isInputShutdown() || this.b.isOutputShutdown()) {
                    return false;
                }
                this.b.getInputStream();
                this.b.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean w() {
        Socket socket = this.b;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    public void x(int i) {
        this.i = i;
    }

    public void y(int i) {
        this.d = i;
    }

    public void z(int i) {
        this.a = i;
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package ax.Rc;

import ax.Rc.d;
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

public abstract class e {
    private static final SocketFactory n = SocketFactory.getDefault();
    private static final ServerSocketFactory o = ServerSocketFactory.getDefault();
    protected int a = 0;
    protected Socket b = null;
    protected String c = null;
    protected int d = 0;
    protected InputStream e = null;
    protected OutputStream f = null;
    protected SocketFactory g;
    protected ServerSocketFactory h;
    protected int i = 60000;
    private int j = -1;
    private int k = -1;
    private Proxy l;
    private Charset m = Charset.defaultCharset();

    public e() {
        this.g = n;
        this.h = o;
    }

    private void h(InetAddress inetAddress, int n8, InetAddress inetAddress2, int n9) throws SocketException, IOException {
        Socket socket;
        this.b = socket = this.g.createSocket();
        int n10 = this.j;
        if (n10 != -1) {
            socket.setReceiveBufferSize(n10);
        }
        if ((n10 = this.k) != -1) {
            this.b.setSendBufferSize(n10);
        }
        if (inetAddress2 != null) {
            this.b.bind(new InetSocketAddress(inetAddress2, n9));
        }
        this.b.connect(new InetSocketAddress(inetAddress, n8), this.i);
        this.i();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(Socket socket) {
        if (socket == null) return;
        try {
            socket.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public void A(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this.h = o;
            return;
        }
        this.h = serverSocketFactory;
    }

    public void B(SocketFactory socketFactory) {
        if (socketFactory == null) {
            this.g = n;
            return;
        }
        this.g = socketFactory;
    }

    public boolean C(Socket socket) {
        return socket.getInetAddress().equals(this.u());
    }

    protected void i() throws IOException {
        this.j();
        this.e = this.b.getInputStream();
        this.f = this.b.getOutputStream();
    }

    protected void j() throws SocketException {
        this.b.setSoTimeout(this.a);
    }

    public void m(String string, int n8) throws SocketException, IOException {
        this.c = string;
        this.h(InetAddress.getByName(string), n8, null, -1);
    }

    public void n(InetAddress inetAddress, int n8) throws SocketException, IOException {
        this.c = null;
        this.h(inetAddress, n8, null, -1);
    }

    public void o() throws IOException {
        this.l(this.b);
        this.k(this.e);
        this.k(this.f);
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
    }

    protected void p(String string, String string2) {
        if (this.r().c() > 0) {
            this.r().a(string, string2);
        }
    }

    protected void q(int n8, String string) {
        if (this.r().c() > 0) {
            this.r().b(n8, string);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean v() {
        if (!this.w()) return false;
        try {
            if (this.b.getInetAddress() == null) {
                return false;
            }
            if (this.b.getPort() == 0) {
                return false;
            }
            if (this.b.getRemoteSocketAddress() == null) {
                return false;
            }
            if (this.b.isClosed()) {
                return false;
            }
            if (this.b.isInputShutdown()) {
                return false;
            }
            if (this.b.isOutputShutdown()) {
                return false;
            }
            this.b.getInputStream();
            this.b.getOutputStream();
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public boolean w() {
        Socket socket = this.b;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    public void x(int n8) {
        this.i = n8;
    }

    public void y(int n8) {
        this.d = n8;
    }

    public void z(int n8) {
        this.a = n8;
    }
}


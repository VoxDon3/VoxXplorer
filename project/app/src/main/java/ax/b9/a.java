/*
 * Decompiled with CFR 0.152.
 */
package ax.b9;

import ax.Xd.d;
import ax.Xd.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import javax.net.SocketFactory;

public class a
extends SocketFactory {
    private static final d c = f.k(a.class);
    private Proxy a;
    private int b;

    public a() {
        this(Proxy.NO_PROXY, 5000);
    }

    public a(Proxy proxy, int n8) {
        this.a = proxy;
        this.b = n8;
    }

    private Socket a(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        Socket socket = new Socket(this.a);
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        c.s("Connecting to {}", inetSocketAddress);
        socket.connect(inetSocketAddress, this.b);
        return socket;
    }

    @Override
    public Socket createSocket() {
        return new Socket(this.a);
    }

    @Override
    public Socket createSocket(String string, int n8) throws IOException {
        return this.a(new InetSocketAddress(string, n8), null);
    }

    @Override
    public Socket createSocket(String string, int n8, InetAddress inetAddress, int n9) throws IOException {
        return this.a(new InetSocketAddress(string, n8), new InetSocketAddress(inetAddress, n9));
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n8) throws IOException {
        return this.a(new InetSocketAddress(inetAddress, n8), null);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n8, InetAddress inetAddress2, int n9) throws IOException {
        return this.a(new InetSocketAddress(inetAddress, n8), new InetSocketAddress(inetAddress2, n9));
    }
}


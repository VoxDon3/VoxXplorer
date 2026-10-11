package ax.b9;

import ax.Xd.d;
import ax.Xd.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import javax.net.SocketFactory;

/* renamed from: ax.b9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1725a extends SocketFactory {
    private static final d c = f.k(C1725a.class);
    private Proxy a;
    private int b;

    public C1725a() {
        this(Proxy.NO_PROXY, 5000);
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

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return new Socket(this.a);
    }

    public C1725a(Proxy proxy, int i) {
        this.a = proxy;
        this.b = i;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return a(new InetSocketAddress(str, i), null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return a(new InetSocketAddress(str, i), new InetSocketAddress(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a(new InetSocketAddress(inetAddress, i), null);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a(new InetSocketAddress(inetAddress, i), new InetSocketAddress(inetAddress2, i2));
    }
}

package ax.Sc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes3.dex */
public class w extends SocketFactory {
    private final SSLContext a;

    public w(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return this.a.getSocketFactory().createSocket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return this.a.getSocketFactory().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return this.a.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws UnknownHostException, IOException {
        return this.a.getSocketFactory().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws UnknownHostException, IOException {
        return this.a.getSocketFactory().createSocket(str, i, inetAddress, i2);
    }
}

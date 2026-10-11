package ax.Sc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* loaded from: classes3.dex */
public class v extends ServerSocketFactory {
    private final SSLContext a;

    public v(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    private SSLServerSocketFactory a() {
        return this.a.getServerSocketFactory();
    }

    public ServerSocket b(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() throws IOException {
        return b(a().createServerSocket());
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) throws IOException {
        return b(a().createServerSocket(i));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) throws IOException {
        return b(a().createServerSocket(i, i2));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) throws IOException {
        return b(a().createServerSocket(i, i2, inetAddress));
    }
}

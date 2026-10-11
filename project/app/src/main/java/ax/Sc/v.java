/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class v
extends ServerSocketFactory {
    private final SSLContext a;

    public v(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    private SSLServerSocketFactory a() {
        return this.a.getServerSocketFactory();
    }

    public ServerSocket b(ServerSocket serverSocket) {
        ((SSLServerSocket)serverSocket).setUseClientMode(true);
        return serverSocket;
    }

    @Override
    public ServerSocket createServerSocket() throws IOException {
        return this.b(this.a().createServerSocket());
    }

    @Override
    public ServerSocket createServerSocket(int n8) throws IOException {
        return this.b(this.a().createServerSocket(n8));
    }

    @Override
    public ServerSocket createServerSocket(int n8, int n9) throws IOException {
        return this.b(this.a().createServerSocket(n8, n9));
    }

    @Override
    public ServerSocket createServerSocket(int n8, int n9, InetAddress inetAddress) throws IOException {
        return this.b(this.a().createServerSocket(n8, n9, inetAddress));
    }
}


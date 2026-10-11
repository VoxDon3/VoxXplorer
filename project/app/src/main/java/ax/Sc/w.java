/*
 * Decompiled with CFR 0.152.
 */
package ax.Sc;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

public class w
extends SocketFactory {
    private final SSLContext a;

    public w(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    @Override
    public Socket createSocket() throws IOException {
        return this.a.getSocketFactory().createSocket();
    }

    @Override
    public Socket createSocket(String string, int n8) throws UnknownHostException, IOException {
        return this.a.getSocketFactory().createSocket(string, n8);
    }

    @Override
    public Socket createSocket(String string, int n8, InetAddress inetAddress, int n9) throws UnknownHostException, IOException {
        return this.a.getSocketFactory().createSocket(string, n8, inetAddress, n9);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n8) throws IOException {
        return this.a.getSocketFactory().createSocket(inetAddress, n8);
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int n8, InetAddress inetAddress2, int n9) throws IOException {
        return this.a.getSocketFactory().createSocket(inetAddress, n8, inetAddress2, n9);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.c3.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class i
extends SSLSocket
implements AutoCloseable {
    private final Socket c0;
    private int d0;
    private final SSLSocket q;

    public i(SSLSocket sSLSocket, Socket socket) {
        this.q = sSLSocket;
        this.c0 = socket;
    }

    public void a(int n8) {
        this.d0 = n8;
        Socket socket = this.c0;
        if (socket instanceof j) {
            ((j)socket).a(n8);
        }
    }

    @Override
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.q.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override
    public void bind(SocketAddress socketAddress) throws IOException {
        this.q.bind(socketAddress);
    }

    @Override
    public void close() throws IOException {
        this.q.close();
    }

    @Override
    public void connect(SocketAddress socketAddress) throws IOException {
        this.q.connect(socketAddress);
    }

    @Override
    public void connect(SocketAddress socketAddress, int n8) throws IOException {
        this.q.connect(socketAddress, n8);
    }

    @Override
    public SocketChannel getChannel() {
        return this.q.getChannel();
    }

    @Override
    public boolean getEnableSessionCreation() {
        return this.q.getEnableSessionCreation();
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return this.q.getEnabledCipherSuites();
    }

    @Override
    public String[] getEnabledProtocols() {
        return this.q.getEnabledProtocols();
    }

    @Override
    public InetAddress getInetAddress() {
        return this.q.getInetAddress();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.q.getInputStream();
    }

    @Override
    public InetAddress getLocalAddress() {
        return this.q.getLocalAddress();
    }

    @Override
    public int getLocalPort() {
        return this.q.getLocalPort();
    }

    @Override
    public boolean getNeedClientAuth() {
        return this.q.getNeedClientAuth();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.q.getOutputStream();
    }

    @Override
    public int getPort() {
        int n8 = this.d0;
        if (n8 > 0) {
            return n8;
        }
        return this.q.getPort();
    }

    @Override
    public SSLSession getSession() {
        return this.q.getSession();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return this.q.getSupportedCipherSuites();
    }

    @Override
    public String[] getSupportedProtocols() {
        return this.q.getSupportedProtocols();
    }

    @Override
    public boolean getUseClientMode() {
        return this.q.getUseClientMode();
    }

    @Override
    public boolean getWantClientAuth() {
        return this.q.getWantClientAuth();
    }

    @Override
    public boolean isClosed() {
        return this.q.isClosed();
    }

    @Override
    public boolean isConnected() {
        return this.q.isConnected();
    }

    @Override
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.q.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override
    public void setEnableSessionCreation(boolean bl) {
        this.q.setEnableSessionCreation(bl);
    }

    @Override
    public void setEnabledCipherSuites(String[] stringArray) {
        this.q.setEnabledCipherSuites(stringArray);
    }

    @Override
    public void setEnabledProtocols(String[] stringArray) {
        this.q.setEnabledProtocols(stringArray);
    }

    @Override
    public void setNeedClientAuth(boolean bl) {
        this.q.setNeedClientAuth(bl);
    }

    @Override
    public void setUseClientMode(boolean bl) {
        this.q.setUseClientMode(bl);
    }

    @Override
    public void setWantClientAuth(boolean bl) {
        this.q.setWantClientAuth(bl);
    }

    @Override
    public void shutdownInput() throws IOException {
        this.q.shutdownInput();
    }

    @Override
    public void shutdownOutput() throws IOException {
        this.q.shutdownOutput();
    }

    @Override
    public void startHandshake() throws IOException {
        this.q.startHandshake();
    }
}


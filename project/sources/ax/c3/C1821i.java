package ax.c3;

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

/* renamed from: ax.c3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1821i extends SSLSocket implements AutoCloseable {
    private final Socket c0;
    private int d0;
    private final SSLSocket q;

    public C1821i(SSLSocket sSLSocket, Socket socket) {
        this.q = sSLSocket;
        this.c0 = socket;
    }

    public void a(int i) {
        this.d0 = i;
        Socket socket = this.c0;
        if (socket instanceof C1822j) {
            ((C1822j) socket).a(i);
        }
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.q.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        this.q.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.q.connect(socketAddress);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.q.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return this.q.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        return this.q.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return this.q.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.q.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return this.q.getInputStream();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.q.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.q.getLocalPort();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return this.q.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return this.q.getOutputStream();
    }

    @Override // java.net.Socket
    public int getPort() {
        int i = this.d0;
        return i > 0 ? i : this.q.getPort();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.q.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.q.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.q.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return this.q.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return this.q.getWantClientAuth();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.q.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.q.isConnected();
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.q.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z) {
        this.q.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.q.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        this.q.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z) {
        this.q.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z) {
        this.q.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z) {
        this.q.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.q.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.q.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() throws IOException {
        this.q.startHandshake();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        this.q.connect(socketAddress, i);
    }
}

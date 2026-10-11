package ax.c3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

/* renamed from: ax.c3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1822j extends Socket implements AutoCloseable {
    private int c0;
    private final Socket q;

    public C1822j(Socket socket) {
        this.q = socket;
    }

    public void a(int i) {
        this.c0 = i;
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

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.q.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return this.q.getInputStream();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
        return this.q.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.q.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.q.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.q.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
        return this.q.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return this.q.getOutputStream();
    }

    @Override // java.net.Socket
    public int getPort() {
        int i = this.c0;
        return i > 0 ? i : this.q.getPort();
    }

    @Override // java.net.Socket
    public int getReceiveBufferSize() throws SocketException {
        return this.q.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.q.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
        return this.q.getReuseAddress();
    }

    @Override // java.net.Socket
    public int getSendBufferSize() throws SocketException {
        return this.q.getSendBufferSize();
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
        return this.q.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() throws SocketException {
        return this.q.getSoTimeout();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
        return this.q.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
        return this.q.getTrafficClass();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.q.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.q.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.q.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.q.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.q.isOutputShutdown();
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i) throws IOException {
        this.q.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z) throws SocketException {
        this.q.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z) throws SocketException {
        this.q.setOOBInline(z);
    }

    @Override // java.net.Socket
    public void setReceiveBufferSize(int i) throws SocketException {
        this.q.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z) throws SocketException {
        this.q.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public void setSendBufferSize(int i) throws SocketException {
        this.q.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z, int i) throws SocketException {
        this.q.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i) throws SocketException {
        this.q.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z) throws SocketException {
        this.q.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i) throws SocketException {
        this.q.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.q.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.q.shutdownOutput();
    }

    @Override // java.net.Socket
    public String toString() {
        return this.q.toString();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i) throws IOException {
        this.q.connect(socketAddress, i);
    }
}

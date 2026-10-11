/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;

public class j
extends Socket
implements AutoCloseable {
    private int c0;
    private final Socket q;

    public j(Socket socket) {
        this.q = socket;
    }

    public void a(int n8) {
        this.c0 = n8;
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
    public InetAddress getInetAddress() {
        return this.q.getInetAddress();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.q.getInputStream();
    }

    @Override
    public boolean getKeepAlive() throws SocketException {
        return this.q.getKeepAlive();
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
    public SocketAddress getLocalSocketAddress() {
        return this.q.getLocalSocketAddress();
    }

    @Override
    public boolean getOOBInline() throws SocketException {
        return this.q.getOOBInline();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return this.q.getOutputStream();
    }

    @Override
    public int getPort() {
        int n8 = this.c0;
        if (n8 > 0) {
            return n8;
        }
        return this.q.getPort();
    }

    @Override
    public int getReceiveBufferSize() throws SocketException {
        return this.q.getReceiveBufferSize();
    }

    @Override
    public SocketAddress getRemoteSocketAddress() {
        return this.q.getRemoteSocketAddress();
    }

    @Override
    public boolean getReuseAddress() throws SocketException {
        return this.q.getReuseAddress();
    }

    @Override
    public int getSendBufferSize() throws SocketException {
        return this.q.getSendBufferSize();
    }

    @Override
    public int getSoLinger() throws SocketException {
        return this.q.getSoLinger();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int getSoTimeout() throws SocketException {
        synchronized (this) {
            return this.q.getSoTimeout();
        }
    }

    @Override
    public boolean getTcpNoDelay() throws SocketException {
        return this.q.getTcpNoDelay();
    }

    @Override
    public int getTrafficClass() throws SocketException {
        return this.q.getTrafficClass();
    }

    @Override
    public boolean isBound() {
        return this.q.isBound();
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
    public boolean isInputShutdown() {
        return this.q.isInputShutdown();
    }

    @Override
    public boolean isOutputShutdown() {
        return this.q.isOutputShutdown();
    }

    @Override
    public void sendUrgentData(int n8) throws IOException {
        this.q.sendUrgentData(n8);
    }

    @Override
    public void setKeepAlive(boolean bl) throws SocketException {
        this.q.setKeepAlive(bl);
    }

    @Override
    public void setOOBInline(boolean bl) throws SocketException {
        this.q.setOOBInline(bl);
    }

    @Override
    public void setReceiveBufferSize(int n8) throws SocketException {
        this.q.setReceiveBufferSize(n8);
    }

    @Override
    public void setReuseAddress(boolean bl) throws SocketException {
        this.q.setReuseAddress(bl);
    }

    @Override
    public void setSendBufferSize(int n8) throws SocketException {
        this.q.setSendBufferSize(n8);
    }

    @Override
    public void setSoLinger(boolean bl, int n8) throws SocketException {
        this.q.setSoLinger(bl, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSoTimeout(int n8) throws SocketException {
        synchronized (this) {
            this.q.setSoTimeout(n8);
            return;
        }
    }

    @Override
    public void setTcpNoDelay(boolean bl) throws SocketException {
        this.q.setTcpNoDelay(bl);
    }

    @Override
    public void setTrafficClass(int n8) throws SocketException {
        this.q.setTrafficClass(n8);
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
    public String toString() {
        return this.q.toString();
    }
}


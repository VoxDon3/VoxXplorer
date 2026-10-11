package com.jcraft.jsch;

import j$.nio.file.Path;
import j$.nio.file.Paths;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* loaded from: classes3.dex */
public class SSHAgentConnector implements AgentConnector {
    private USocketFactory a;
    private Path b;

    public SSHAgentConnector() throws AgentProxyException {
        this(c(), b());
    }

    private static Path b() throws AgentProxyException {
        String n = Util.n("SSH_AUTH_SOCK");
        if (n != null) {
            return Paths.get(n, new String[0]);
        }
        throw new AgentProxyException("SSH_AUTH_SOCK is not defined.");
    }

    private static USocketFactory c() throws AgentProxyException {
        try {
            return new UnixDomainSocketFactory();
        } catch (AgentProxyException e) {
            try {
                return new JUnixSocketFactory();
            } catch (AgentProxyException e2) {
                e2.addSuppressed(e);
                throw e;
            } catch (NoClassDefFoundError e3) {
                AgentProxyException agentProxyException = new AgentProxyException("junixsocket library unavailable");
                agentProxyException.addSuppressed(e);
                agentProxyException.addSuppressed(e3);
                throw agentProxyException;
            }
        }
    }

    private SocketChannel d() throws IOException {
        return this.a.a(this.b);
    }

    private static int e(SocketChannel socketChannel, Buffer buffer, int i, int i2) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(buffer.b, i, i2);
        int i3 = i2;
        while (i3 > 0) {
            int read = socketChannel.read(wrap);
            if (read < 0) {
                return -1;
            }
            if (read > 0) {
                i3 -= read;
            }
        }
        return i2;
    }

    private static int f(SocketChannel socketChannel, Buffer buffer, int i, int i2) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(buffer.b, i, i2);
        int i3 = i2;
        while (i3 > 0) {
            int write = socketChannel.write(wrap);
            if (write < 0) {
                return -1;
            }
            if (write > 0) {
                i3 -= write;
            }
        }
        return i2;
    }

    @Override // com.jcraft.jsch.AgentConnector
    public void a(Buffer buffer) throws AgentProxyException {
        try {
            SocketChannel d = d();
            try {
                f(d, buffer, 0, buffer.j());
                buffer.B();
                e(d, buffer, 0, 4);
                int i = buffer.i();
                if (i <= 0 || i > 262144) {
                    throw new AgentProxyException("Illegal length: " + i);
                }
                buffer.B();
                buffer.a(i);
                e(d, buffer, 0, i);
                if (d != null) {
                    d.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw new AgentProxyException(e.toString(), e);
        }
    }

    public SSHAgentConnector(USocketFactory uSocketFactory, Path path) {
        this.a = uSocketFactory;
        this.b = path;
    }
}

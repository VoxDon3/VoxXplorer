/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentConnector;
import com.jcraft.jsch.AgentProxyException;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.JUnixSocketFactory;
import com.jcraft.jsch.USocketFactory;
import com.jcraft.jsch.UnixDomainSocketFactory;
import com.jcraft.jsch.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SSHAgentConnector
implements AgentConnector {
    private USocketFactory a;
    private j.Path b;

    public SSHAgentConnector() throws AgentProxyException {
        this(SSHAgentConnector.c(), SSHAgentConnector.b());
    }

    public SSHAgentConnector(USocketFactory uSocketFactory, j.Path path) {
        this.a = uSocketFactory;
        this.b = path;
    }

    private static j.Path b() throws AgentProxyException {
        String string = Util.n("SSH_AUTH_SOCK");
        if (string != null) {
            return j.Paths.get((String)string, (String[])new String[0]);
        }
        throw new AgentProxyException("SSH_AUTH_SOCK is not defined.");
    }

    private static USocketFactory c() throws AgentProxyException {
        try {
            UnixDomainSocketFactory unixDomainSocketFactory = new UnixDomainSocketFactory();
            return unixDomainSocketFactory;
        }
        catch (AgentProxyException agentProxyException) {
            NoClassDefFoundError noClassDefFoundError2;
            block6: {
                try {
                    JUnixSocketFactory jUnixSocketFactory = new JUnixSocketFactory();
                    return jUnixSocketFactory;
                }
                catch (AgentProxyException agentProxyException2) {
                }
                catch (NoClassDefFoundError noClassDefFoundError2) {
                    break block6;
                }
                agentProxyException2.addSuppressed(agentProxyException);
                throw agentProxyException;
            }
            AgentProxyException agentProxyException3 = new AgentProxyException("junixsocket library unavailable");
            agentProxyException3.addSuppressed(agentProxyException);
            agentProxyException3.addSuppressed(noClassDefFoundError2);
            throw agentProxyException3;
        }
    }

    private SocketChannel d() throws IOException {
        return this.a.a(this.b);
    }

    private static int e(SocketChannel socketChannel, Buffer object, int n8, int n9) throws IOException {
        object = ByteBuffer.wrap(((Buffer)object).b, n8, n9);
        n8 = n9;
        while (n8 > 0) {
            int n10 = socketChannel.read((ByteBuffer)object);
            if (n10 < 0) {
                return -1;
            }
            if (n10 <= 0) continue;
            n8 -= n10;
        }
        return n9;
    }

    private static int f(SocketChannel socketChannel, Buffer object, int n8, int n9) throws IOException {
        object = ByteBuffer.wrap(((Buffer)object).b, n8, n9);
        n8 = n9;
        while (n8 > 0) {
            int n10 = socketChannel.write((ByteBuffer)object);
            if (n10 < 0) {
                return -1;
            }
            if (n10 <= 0) continue;
            n8 -= n10;
        }
        return n9;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Buffer object) throws AgentProxyException {
        int n8;
        SocketChannel socketChannel;
        block9: {
            socketChannel = this.d();
            {
                catch (IOException iOException) {
                    throw new AgentProxyException(((Object)iOException).toString(), iOException);
                }
            }
            SSHAgentConnector.f(socketChannel, (Buffer)object, 0, ((Buffer)object).j());
            ((Buffer)object).B();
            SSHAgentConnector.e(socketChannel, (Buffer)object, 0, 4);
            n8 = ((Buffer)object).i();
            if (n8 <= 0 || n8 > 262144) break block9;
            ((Buffer)object).B();
            ((Buffer)object).a(n8);
            SSHAgentConnector.e(socketChannel, (Buffer)object, 0, n8);
            if (socketChannel == null) return;
            socketChannel.close();
            return;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal length: ");
            stringBuilder.append(n8);
            object = new AgentProxyException(stringBuilder.toString());
            throw object;
        }
        catch (Throwable throwable) {}
        if (socketChannel == null) throw throwable;
        try {
            socketChannel.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
            throw throwable;
        }
    }
}


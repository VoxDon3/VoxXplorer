/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentProxyException;
import com.jcraft.jsch.USocketFactory;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.AFUNIXSocketChannel;

public class JUnixSocketFactory
implements USocketFactory {
    /*
     * WARNING - void declaration
     */
    public JUnixSocketFactory() throws AgentProxyException {
        Throwable var1_4;
        block5: {
            block4: {
                AFUNIXSocketChannel aFUNIXSocketChannel = AFUNIXSocketChannel.open();
                if (aFUNIXSocketChannel == null) break block4;
                try {
                    aFUNIXSocketChannel.close();
                    return;
                }
                catch (NoClassDefFoundError noClassDefFoundError) {
                }
                catch (IOException iOException) {}
                break block5;
            }
            return;
        }
        throw new AgentProxyException("junixsocket library unavailable", (Throwable)var1_4);
    }

    @Override
    public SocketChannel a(j.Path path) throws IOException {
        AFUNIXSocketAddress aFUNIXSocketAddress = AFUNIXSocketAddress.of((j.Path)path);
        path = AFUNIXSocketChannel.open();
        path.configureBlocking(true);
        path.connect((SocketAddress)aFUNIXSocketAddress);
        return path;
    }
}


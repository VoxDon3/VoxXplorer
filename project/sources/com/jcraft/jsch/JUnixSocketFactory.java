package com.jcraft.jsch;

import j$.nio.file.Path;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.AFUNIXSocketChannel;

/* loaded from: classes3.dex */
public class JUnixSocketFactory implements USocketFactory {
    public JUnixSocketFactory() throws AgentProxyException {
        try {
            AFUNIXSocketChannel open = AFUNIXSocketChannel.open();
            if (open != null) {
                open.close();
            }
        } catch (IOException | NoClassDefFoundError e) {
            throw new AgentProxyException("junixsocket library unavailable", e);
        }
    }

    @Override // com.jcraft.jsch.USocketFactory
    public SocketChannel a(Path path) throws IOException {
        AFUNIXSocketAddress of = AFUNIXSocketAddress.of(path);
        AFUNIXSocketChannel open = AFUNIXSocketChannel.open();
        open.configureBlocking(true);
        open.connect(of);
        return open;
    }
}

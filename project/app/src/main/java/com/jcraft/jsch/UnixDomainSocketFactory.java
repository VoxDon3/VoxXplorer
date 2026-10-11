/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentProxyException;
import com.jcraft.jsch.USocketFactory;
import java.io.IOException;
import java.nio.channels.SocketChannel;

public class UnixDomainSocketFactory
implements USocketFactory {
    public UnixDomainSocketFactory() throws AgentProxyException {
        throw new AgentProxyException("UnixDomainSocketFactory requires Java16+.");
    }

    @Override
    public SocketChannel a(j.Path path) throws IOException {
        throw new UnsupportedOperationException("UnixDomainSocketFactory requires Java16+.");
    }
}


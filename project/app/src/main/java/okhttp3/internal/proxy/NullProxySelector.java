/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.proxy;

import ax.tb.o;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public final class NullProxySelector
extends ProxySelector {
    public static final NullProxySelector INSTANCE = new NullProxySelector();

    private NullProxySelector() {
    }

    @Override
    public void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
    }

    @Override
    public List<Proxy> select(URI uRI) {
        if (uRI != null) {
            return o.d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}


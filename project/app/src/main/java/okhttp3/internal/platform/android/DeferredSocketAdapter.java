/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.SocketAdapter;

public final class DeferredSocketAdapter
implements SocketAdapter {
    private SocketAdapter delegate;
    private final Factory socketAdapterFactory;

    public DeferredSocketAdapter(Factory factory2) {
        l.f(factory2, "socketAdapterFactory");
        this.socketAdapterFactory = factory2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final SocketAdapter getDelegate(SSLSocket object) {
        synchronized (this) {
            try {
                if (this.delegate != null) return this.delegate;
                if (!this.socketAdapterFactory.matchesSocket((SSLSocket)object)) return this.delegate;
                this.delegate = this.socketAdapterFactory.create((SSLSocket)object);
                return this.delegate;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<? extends Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        SocketAdapter socketAdapter = this.getDelegate(sSLSocket);
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, string, list);
        }
    }

    @Override
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        SocketAdapter socketAdapter = this.getDelegate(sSLSocket);
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public boolean isSupported() {
        return true;
    }

    @Override
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
    }

    @Override
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    public static interface Factory {
        public SocketAdapter create(SSLSocket var1);

        public boolean matchesSocket(SSLSocket var1);
    }
}


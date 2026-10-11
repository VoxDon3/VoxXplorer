/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.g;
import ax.Gb.l;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import org.conscrypt.Conscrypt;

public final class ConscryptSocketAdapter
implements SocketAdapter {
    public static final Companion Companion = new Companion(null);
    private static final DeferredSocketAdapter.Factory factory = new DeferredSocketAdapter.Factory(){

        public SocketAdapter create(SSLSocket sSLSocket) {
            l.f(sSLSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }

        public boolean matchesSocket(SSLSocket sSLSocket) {
            l.f(sSLSocket, "sslSocket");
            return ConscryptPlatform.Companion.isSupported() && Conscrypt.isConscrypt((SSLSocket)sSLSocket);
        }
    };

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<? extends Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        if (this.matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])((Collection)Platform.Companion.alpnProtocolNames(list)).toArray(new String[0]));
        }
    }

    @Override
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        if (this.matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol((SSLSocket)sSLSocket);
        }
        return null;
    }

    @Override
    public boolean isSupported() {
        return ConscryptPlatform.Companion.isSupported();
    }

    @Override
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt((SSLSocket)sSLSocket);
    }

    @Override
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final DeferredSocketAdapter.Factory getFactory() {
            return factory;
        }
    }
}


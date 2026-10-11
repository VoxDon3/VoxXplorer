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
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class BouncyCastleSocketAdapter
implements SocketAdapter {
    public static final Companion Companion = new Companion(null);
    private static final DeferredSocketAdapter.Factory factory = new DeferredSocketAdapter.Factory(){

        public SocketAdapter create(SSLSocket sSLSocket) {
            l.f(sSLSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }

        public boolean matchesSocket(SSLSocket sSLSocket) {
            l.f(sSLSocket, "sslSocket");
            BouncyCastlePlatform.Companion.isSupported();
            return false;
        }
    };

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<? extends Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        if (this.matchesSocket(sSLSocket)) {
            sSLSocket = (BCSSLSocket)sSLSocket;
            string = sSLSocket.getParameters();
            string.setApplicationProtocols(((Collection)Platform.Companion.alpnProtocolNames(list)).toArray(new String[0]));
            sSLSocket.setParameters((BCSSLParameters)string);
        }
    }

    @Override
    public String getSelectedProtocol(SSLSocket object) {
        l.f(object, "sslSocket");
        object = ((BCSSLSocket)object).getApplicationProtocol();
        boolean bl = object == null ? true : l.a(object, "");
        if (bl) {
            object = null;
        }
        return object;
    }

    @Override
    public boolean isSupported() {
        return BouncyCastlePlatform.Companion.isSupported();
    }

    @Override
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return false;
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


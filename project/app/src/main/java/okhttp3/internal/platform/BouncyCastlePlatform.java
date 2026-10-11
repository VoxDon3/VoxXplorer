/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import ax.Gb.g;
import ax.Gb.l;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

public final class BouncyCastlePlatform
extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider = (Provider)new BouncyCastleJsseProvider();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Companion companion;
        Companion = companion = new Companion(null);
        boolean bl = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        isSupported = bl;
    }

    private BouncyCastlePlatform() {
    }

    public /* synthetic */ BouncyCastlePlatform(g g8) {
        this();
    }

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        super.configureTlsExtensions(sSLSocket, string, list);
    }

    @Override
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        l.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager platformTrustManager() {
        Object object = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        ((TrustManagerFactory)object).init((KeyStore)null);
        Object object2 = ((TrustManagerFactory)object).getTrustManagers();
        l.c(object2);
        if (((TrustManager[])object2).length == 1 && (object = object2[0]) instanceof X509TrustManager) {
            l.d(object, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected default trust managers: ");
        object2 = Arrays.toString(object2);
        l.e(object2, "toString(this)");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        l.f(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final BouncyCastlePlatform buildIfSupported() {
            if (this.isSupported()) {
                return new BouncyCastlePlatform(null);
            }
            return null;
        }

        public final boolean isSupported() {
            return isSupported;
        }
    }
}


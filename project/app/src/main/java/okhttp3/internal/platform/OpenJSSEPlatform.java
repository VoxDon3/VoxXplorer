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
import org.openjsse.net.ssl.OpenJSSE;

public final class OpenJSSEPlatform
extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider = (Provider)new OpenJSSE();

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
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        isSupported = bl;
    }

    private OpenJSSEPlatform() {
    }

    public /* synthetic */ OpenJSSEPlatform(g g8) {
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
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.provider);
        l.e(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override
    public X509TrustManager platformTrustManager() {
        Object object;
        Object object2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.provider);
        object2.init((KeyStore)null);
        object2 = object2.getTrustManagers();
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final OpenJSSEPlatform buildIfSupported() {
            if (this.isSupported()) {
                return new OpenJSSEPlatform(null);
            }
            return null;
        }

        public final boolean isSupported() {
            return isSupported;
        }
    }
}


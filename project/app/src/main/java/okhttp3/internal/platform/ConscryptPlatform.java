/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import ax.Gb.g;
import ax.Gb.l;
import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

public final class ConscryptPlatform
extends Platform {
    public static final Companion Companion;
    private static final boolean isSupported;
    private final Provider provider;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        block3: {
            Companion companion;
            Companion = companion = new Companion(null);
            boolean bl2 = false;
            try {
                Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
                bl = bl2;
                if (!Conscrypt.isAvailable()) break block3;
                boolean bl3 = companion.atLeastVersion(2, 1, 0);
                bl = bl2;
                if (bl3) {
                    bl = true;
                }
            }
            catch (ClassNotFoundException | NoClassDefFoundError throwable) {
                bl = bl2;
            }
        }
        isSupported = bl;
    }

    private ConscryptPlatform() {
        Provider provider = Conscrypt.newProvider();
        l.e(provider, "newProvider()");
        this.provider = provider;
    }

    public /* synthetic */ ConscryptPlatform(g g8) {
        this();
    }

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        if (Conscrypt.isConscrypt((SSLSocket)sSLSocket)) {
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])((Collection)Platform.Companion.alpnProtocolNames(list)).toArray(new String[0]));
            return;
        }
        super.configureTlsExtensions(sSLSocket, string, list);
    }

    @Override
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt((SSLSocket)sSLSocket)) {
            return Conscrypt.getApplicationProtocol((SSLSocket)sSLSocket);
        }
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        l.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override
    public SSLSocketFactory newSslSocketFactory(X509TrustManager object) {
        l.f(object, "trustManager");
        SSLContext sSLContext = this.newSSLContext();
        sSLContext.init(null, new TrustManager[]{object}, null);
        object = sSLContext.getSocketFactory();
        l.e(object, "newSSLContext().apply {\n\u2026null)\n    }.socketFactory");
        return object;
    }

    @Override
    public X509TrustManager platformTrustManager() {
        Object object = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        ((TrustManagerFactory)object).init((KeyStore)null);
        Object object2 = ((TrustManagerFactory)object).getTrustManagers();
        l.c(object2);
        if (((TrustManager[])object2).length == 1 && (object = object2[0]) instanceof X509TrustManager) {
            l.d(object, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            object = (X509TrustManager)object;
            Conscrypt.setHostnameVerifier((TrustManager)object, (ConscryptHostnameVerifier)DisabledHostnameVerifier.INSTANCE);
            return object;
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
        return null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int n8, int n9, int n10, int n11, Object object) {
            if ((n11 & 2) != 0) {
                n9 = 0;
            }
            if ((n11 & 4) != 0) {
                n10 = 0;
            }
            return companion.atLeastVersion(n8, n9, n10);
        }

        public final boolean atLeastVersion(int n8, int n9, int n10) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != n8) {
                return version.major() > n8;
            }
            if (version.minor() != n9) {
                return version.minor() > n9;
            }
            return version.patch() >= n10;
        }

        public final ConscryptPlatform buildIfSupported() {
            if (this.isSupported()) {
                return new ConscryptPlatform(null);
            }
            return null;
        }

        public final boolean isSupported() {
            return isSupported;
        }
    }

    public static final class DisabledHostnameVerifier
    implements ConscryptHostnameVerifier {
        public static final DisabledHostnameVerifier INSTANCE = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }

        public final boolean verify(String string, SSLSession sSLSession) {
            return true;
        }

        public boolean verify(X509Certificate[] x509CertificateArray, String string, SSLSession sSLSession) {
            return true;
        }
    }
}


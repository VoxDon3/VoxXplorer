/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.tls;

import ax.Gb.g;
import ax.Gb.l;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;

public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);

    public abstract List<Certificate> clean(List<? extends Certificate> var1, String var2) throws SSLPeerUnverifiedException;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            l.f(x509TrustManager, "trustManager");
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        public final CertificateChainCleaner get(X509Certificate ... x509CertificateArray) {
            l.f(x509CertificateArray, "caCerts");
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex(Arrays.copyOf(x509CertificateArray, x509CertificateArray.length)));
        }
    }
}


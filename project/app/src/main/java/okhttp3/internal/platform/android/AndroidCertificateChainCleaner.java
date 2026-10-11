/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import ax.Gb.g;
import ax.Gb.l;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;

@SuppressSignatureCheck
public final class AndroidCertificateChainCleaner
extends CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);
    private final X509TrustManager trustManager;
    private final X509TrustManagerExtensions x509TrustManagerExtensions;

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        l.f(x509TrustManager, "trustManager");
        l.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.trustManager = x509TrustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions;
    }

    @Override
    @SuppressSignatureCheck
    public List<Certificate> clean(List<? extends Certificate> object, String object2) throws SSLPeerUnverifiedException {
        l.f(object, "chain");
        l.f(object2, "hostname");
        object = ((Collection)object).toArray(new X509Certificate[0]);
        try {
            object = this.x509TrustManagerExtensions.checkServerTrusted(object, "RSA", (String)object2);
            l.e(object, "x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)");
            return object;
        }
        catch (CertificateException certificateException) {
            object2 = new SSLPeerUnverifiedException(certificateException.getMessage());
            ((Throwable)object2).initCause(certificateException);
            throw object2;
        }
    }

    public boolean equals(Object object) {
        return object instanceof AndroidCertificateChainCleaner && ((AndroidCertificateChainCleaner)object).trustManager == this.trustManager;
    }

    public int hashCode() {
        return System.identityHashCode(this.trustManager);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        @SuppressSignatureCheck
        public final AndroidCertificateChainCleaner buildIfSupported(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            l.f(x509TrustManager, "trustManager");
            AndroidCertificateChainCleaner androidCertificateChainCleaner = null;
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                androidCertificateChainCleaner = new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
            }
            return androidCertificateChainCleaner;
        }
    }
}


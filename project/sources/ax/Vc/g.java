package ax.Vc;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class g {
    private static final X509TrustManager a = new a(false);
    private static final X509TrustManager b = new a(true);

    public static X509TrustManager a() {
        return a;
    }

    public static X509TrustManager b() {
        return b;
    }

    private static class a implements X509TrustManager {
        private final boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (this.a) {
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    x509Certificate.checkValidity();
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return c.c;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }
}

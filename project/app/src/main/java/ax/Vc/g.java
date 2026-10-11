/*
 * Decompiled with CFR 0.152.
 */
package ax.Vc;

import ax.Vc.c;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class g {
    private static final X509TrustManager a = new a(false);
    private static final X509TrustManager b = new a(true);

    public static X509TrustManager a() {
        return a;
    }

    public static X509TrustManager b() {
        return b;
    }

    private static class a
    implements X509TrustManager {
        private final boolean a;

        a(boolean bl) {
            this.a = bl;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
            if (this.a) {
                int n8 = x509CertificateArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    x509CertificateArray[i8].checkValidity();
                }
            }
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return c.c;
        }
    }
}


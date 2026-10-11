/*
 * Decompiled with CFR 0.152.
 */
package ax.ud;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

public class c {
    private ax.ud.a a = new ax.ud.b();

    public X509Certificate a(ax.td.b serializable) throws CertificateException {
        IOException iOException2;
        block3: {
            try {
                CertificateFactory certificateFactory = this.a.b("X.509");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((ax.td.b)serializable).getEncoded());
                serializable = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
                return serializable;
            }
            catch (NoSuchProviderException noSuchProviderException) {
            }
            catch (IOException iOException2) {
                break block3;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cannot find required provider:");
            stringBuilder.append(noSuchProviderException.getMessage());
            throw new a(this, stringBuilder.toString(), noSuchProviderException);
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("exception parsing certificate: ");
        ((StringBuilder)serializable).append(iOException2.getMessage());
        throw new b(this, ((StringBuilder)serializable).toString(), iOException2);
    }

    private class a
    extends CertificateException {
        final c c0;
        private Throwable q;

        public a(c c8, String string, Throwable throwable) {
            this.c0 = c8;
            super(string);
            this.q = throwable;
        }

        @Override
        public Throwable getCause() {
            return this.q;
        }
    }

    private class b
    extends CertificateParsingException {
        final c c0;
        private Throwable q;

        public b(c c8, String string, Throwable throwable) {
            this.c0 = c8;
            super(string);
            this.q = throwable;
        }

        @Override
        public Throwable getCause() {
            return this.q;
        }
    }
}


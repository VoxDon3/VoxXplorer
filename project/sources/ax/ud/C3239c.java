package ax.ud;

import ax.td.C3148b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* renamed from: ax.ud.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3239c {
    private AbstractC3237a a;

    /* renamed from: ax.ud.c$a */
    private class a extends CertificateException {
        private Throwable q;

        public a(String str, Throwable th) {
            super(str);
            this.q = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.q;
        }
    }

    /* renamed from: ax.ud.c$b */
    private class b extends CertificateParsingException {
        private Throwable q;

        public b(String str, Throwable th) {
            super(str);
            this.q = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.q;
        }
    }

    public C3239c() {
        this.a = new C3238b();
        this.a = new C3238b();
    }

    public X509Certificate a(C3148b c3148b) throws CertificateException {
        try {
            return (X509Certificate) this.a.b("X.509").generateCertificate(new ByteArrayInputStream(c3148b.getEncoded()));
        } catch (IOException e) {
            throw new b("exception parsing certificate: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new a("cannot find required provider:" + e2.getMessage(), e2);
        }
    }
}

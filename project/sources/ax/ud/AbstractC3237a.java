package ax.ud;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: ax.ud.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC3237a {
    AbstractC3237a() {
    }

    protected abstract CertificateFactory a(String str) throws CertificateException, NoSuchProviderException;

    public CertificateFactory b(String str) throws NoSuchProviderException, CertificateException {
        return a(str);
    }
}

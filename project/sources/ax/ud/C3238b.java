package ax.ud;

import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: ax.ud.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3238b extends AbstractC3237a {
    C3238b() {
    }

    @Override // ax.ud.AbstractC3237a
    protected CertificateFactory a(String str) throws CertificateException {
        return CertificateFactory.getInstance(str);
    }
}

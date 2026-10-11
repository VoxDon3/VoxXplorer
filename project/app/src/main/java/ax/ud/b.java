/*
 * Decompiled with CFR 0.152.
 */
package ax.ud;

import ax.ud.a;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

class b
extends a {
    b() {
    }

    @Override
    protected CertificateFactory a(String string) throws CertificateException {
        return CertificateFactory.getInstance(string);
    }
}


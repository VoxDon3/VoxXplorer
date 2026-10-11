/*
 * Decompiled with CFR 0.152.
 */
package ax.ud;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

abstract class a {
    a() {
    }

    protected abstract CertificateFactory a(String var1) throws CertificateException, NoSuchProviderException;

    public CertificateFactory b(String string) throws NoSuchProviderException, CertificateException {
        return this.a(string);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.tls;

import ax.Gb.l;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.TrustRootIndex;

public final class BasicTrustRootIndex
implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate ... x509CertificateArray) {
        l.f(x509CertificateArray, "caCerts");
        LinkedHashMap<X500Principal, Set<X509Certificate>> linkedHashMap = new LinkedHashMap<X500Principal, Set<X509Certificate>>();
        for (X509Certificate x509Certificate : x509CertificateArray) {
            Object v8;
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            l.e(x500Principal, "caCert.subjectX500Principal");
            Object object = v8 = linkedHashMap.get(x500Principal);
            if (v8 == null) {
                object = new LinkedHashSet();
                linkedHashMap.put(x500Principal, (Set<X509Certificate>)object);
            }
            ((Set)object).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object object) {
        return object == this || object instanceof BasicTrustRootIndex && l.a(((BasicTrustRootIndex)object).subjectToCaCerts, this.subjectToCaCerts);
        {
        }
    }

    @Override
    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        l.f(x509Certificate, "cert");
        Object object = x509Certificate.getIssuerX500Principal();
        object = this.subjectToCaCerts.get(object);
        Object var3_4 = null;
        if (object == null) {
            return null;
        }
        Iterator iterator = object.iterator();
        while (true) {
            object = var3_4;
            if (!iterator.hasNext()) break;
            object = iterator.next();
            X509Certificate x509Certificate2 = (X509Certificate)object;
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
        return (X509Certificate)object;
    }

    public int hashCode() {
        return ((Object)this.subjectToCaCerts).hashCode();
    }
}


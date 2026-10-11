/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.tls;

import ax.Gb.g;
import ax.Gb.l;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

public final class BasicCertificateChainCleaner
extends CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SIGNERS = 9;
    private final TrustRootIndex trustRootIndex;

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        l.f(trustRootIndex, "trustRootIndex");
        this.trustRootIndex = trustRootIndex;
    }

    private final boolean verifySignature(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!l.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return false;
        }
    }

    @Override
    public List<Certificate> clean(List<? extends Certificate> object, String object2) throws SSLPeerUnverifiedException {
        l.f(object, "chain");
        l.f(object2, "hostname");
        object2 = new ArrayDeque((Collection)object);
        object = new ArrayList<Certificate>();
        Object object3 = object2.removeFirst();
        l.e(object3, "queue.removeFirst()");
        object.add(object3);
        boolean bl = false;
        block0: for (int i8 = 0; i8 < 9; ++i8) {
            block10: {
                block9: {
                    Object object4;
                    block8: {
                        object3 = object.get(object.size() - 1);
                        l.d(object3, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        object3 = (X509Certificate)object3;
                        object4 = this.trustRootIndex.findByIssuerAndSignature((X509Certificate)object3);
                        if (object4 == null) break block8;
                        if (object.size() > 1 || !l.a(object3, object4)) {
                            object.add((Certificate)object4);
                        }
                        if (!this.verifySignature((X509Certificate)object4, (X509Certificate)object4)) {
                            bl = true;
                            continue;
                        }
                        break block9;
                    }
                    object4 = object2.iterator();
                    l.e(object4, "queue.iterator()");
                    while (object4.hasNext()) {
                        Object object5 = object4.next();
                        l.d(object5, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        if (!this.verifySignature((X509Certificate)object3, (X509Certificate)(object5 = (X509Certificate)object5))) continue;
                        object4.remove();
                        object.add(object5);
                        continue block0;
                    }
                    if (!bl) break block10;
                }
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to find a trusted cert that signed ");
            ((StringBuilder)object).append(object3);
            throw new SSLPeerUnverifiedException(((StringBuilder)object).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Certificate chain too long: ");
        ((StringBuilder)object2).append(object);
        throw new SSLPeerUnverifiedException(((StringBuilder)object2).toString());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof BasicCertificateChainCleaner && l.a(((BasicCertificateChainCleaner)object).trustRootIndex, this.trustRootIndex);
    }

    public int hashCode() {
        return this.trustRootIndex.hashCode();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}


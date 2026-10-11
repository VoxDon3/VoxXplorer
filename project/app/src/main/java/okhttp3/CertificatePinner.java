/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.z;
import ax.Ob.h;
import ax.tb.i;
import ax.tb.o;
import ax.xc.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        l.f(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int n8, g g8) {
        if ((n8 & 2) != 0) {
            certificateChainCleaner = null;
        }
        this(set, certificateChainCleaner);
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final ax.xc.h sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final ax.xc.h sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String string, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        l.f(string, "hostname");
        l.f(list, "peerCertificates");
        this.check$okhttp(string, (a<? extends List<? extends X509Certificate>>)new a<List<? extends X509Certificate>>(this, list, string){
            final String $hostname;
            final List<Certificate> $peerCertificates;
            final CertificatePinner this$0;
            {
                this.this$0 = certificatePinner;
                this.$peerCertificates = list;
                this.$hostname = string;
                super(0);
            }

            public final List<X509Certificate> invoke() {
                Object object;
                Object object2;
                block4: {
                    block3: {
                        object2 = this.this$0.getCertificateChainCleaner$okhttp();
                        if (object2 == null) break block3;
                        object = ((CertificateChainCleaner)object2).clean(this.$peerCertificates, this.$hostname);
                        object2 = object;
                        if (object != null) break block4;
                    }
                    object2 = this.$peerCertificates;
                }
                object = (List<Certificate>)object2;
                object2 = new ArrayList<Certificate>(o.s(object, 10));
                Iterator<T> iterator = object.iterator();
                while (iterator.hasNext()) {
                    object = (Certificate)iterator.next();
                    l.d(object, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    object2.add((Certificate)((X509Certificate)object));
                }
                return object2;
            }
        });
    }

    public final void check(String string, Certificate ... certificateArray) throws SSLPeerUnverifiedException {
        l.f(string, "hostname");
        l.f(certificateArray, "peerCertificates");
        this.check(string, i.E(certificateArray));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void check$okhttp(String object, a<? extends List<? extends X509Certificate>> object2) {
        l.f(object, "hostname");
        l.f(object2, "cleanedPeerCertificatesFn");
        List<Pin> list = this.findMatchingPins((String)object);
        if (list.isEmpty()) return;
        List list2 = (List)object2.invoke();
        for (X509Certificate x509Certificate : list2) {
            Iterator<Pin> iterator = list.iterator();
            Object var3_7 = null;
            object2 = null;
            while (iterator.hasNext()) {
                Pin pin;
                block8: {
                    pin = iterator.next();
                    String string = pin.getHashAlgorithm();
                    if (l.a(string, "sha256")) {
                        Object var4_16;
                        Object var3_6;
                        void var4_14 = var3_6;
                        if (var3_6 == null) {
                            ax.xc.h h8 = Companion.sha256Hash(x509Certificate);
                        }
                        void var3_8 = var4_16;
                        if (!l.a(pin.getHash(), var4_16)) continue;
                        return;
                    }
                    if (l.a(string, "sha1")) {
                        Object var4_19;
                        Object object3 = object2;
                        if (object2 == null) {
                            ax.xc.h h9 = Companion.sha1Hash(x509Certificate);
                        }
                        object2 = var4_19;
                        if (!l.a(pin.getHash(), var4_19)) continue;
                    }
                    break block8;
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("unsupported hashAlgorithm: ");
                ((StringBuilder)object).append(pin.getHashAlgorithm());
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Certificate pinning failure!");
        ((StringBuilder)object2).append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate : list2) {
            ((StringBuilder)object2).append("\n    ");
            ((StringBuilder)object2).append(Companion.pin(x509Certificate));
            ((StringBuilder)object2).append(": ");
            ((StringBuilder)object2).append(x509Certificate.getSubjectDN().getName());
        }
        ((StringBuilder)object2).append("\n  Pinned certificates for ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(":");
        for (Pin pin : list) {
            ((StringBuilder)object2).append("\n    ");
            ((StringBuilder)object2).append(pin);
        }
        object = ((StringBuilder)object2).toString();
        l.e(object, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException((String)object);
    }

    public boolean equals(Object object) {
        if (object instanceof CertificatePinner) {
            object = (CertificatePinner)object;
            if (l.a(((CertificatePinner)object).pins, this.pins) && l.a(((CertificatePinner)object).certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String string) {
        l.f(string, "hostname");
        Collection<Pin> collection = this.pins;
        Collection<Pin> collection2 = o.j();
        for (Object t8 : collection) {
            if (!((Pin)t8).matchesHostname(string)) continue;
            collection = collection2;
            if (collection2.isEmpty()) {
                collection = new ArrayList();
            }
            l.d(collection, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
            z.a(collection).add(t8);
            collection2 = collection;
        }
        return collection2;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int n8 = ((Object)this.pins).hashCode();
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        int n9 = certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0;
        return (1517 + n8) * 41 + n9;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        l.f(certificateChainCleaner, "certificateChainCleaner");
        if (l.a(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public static final class Builder {
        private final List<Pin> pins = new ArrayList<Pin>();

        public final Builder add(String string, String ... stringArray) {
            l.f(string, "pattern");
            l.f(stringArray, "pins");
            for (String string2 : stringArray) {
                this.pins.add(new Pin(string, string2));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(o.Y((Iterable)this.pins), null, 2, null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final String pin(Certificate certificate) {
            l.f(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sha256/");
                stringBuilder.append(this.sha256Hash((X509Certificate)certificate).d());
                return stringBuilder.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final ax.xc.h sha1Hash(X509Certificate object) {
            l.f(object, "<this>");
            h.a a8 = ax.xc.h.e0;
            object = ((Certificate)object).getPublicKey().getEncoded();
            l.e(object, "publicKey.encoded");
            return h.a.f(a8, (byte[])object, 0, 0, 3, null).E();
        }

        public final ax.xc.h sha256Hash(X509Certificate object) {
            l.f(object, "<this>");
            h.a a8 = ax.xc.h.e0;
            object = ((Certificate)object).getPublicKey().getEncoded();
            l.e(object, "publicKey.encoded");
            return h.a.f(a8, (byte[])object, 0, 0, 3, null).F();
        }
    }

    public static final class Pin {
        private final ax.xc.h hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String object, String charSequence) {
            l.f(object, "pattern");
            l.f(charSequence, "pin");
            if (h.H((String)object, "*.", false, 2, null) && h.V((CharSequence)object, "*", 1, false, 4, null) == -1 || h.H((String)object, "**.", false, 2, null) && h.V((CharSequence)object, "*", 2, false, 4, null) == -1 || h.V((CharSequence)object, "*", 0, false, 6, null) == -1) {
                Object object2 = HostnamesKt.toCanonicalHost((String)object);
                if (object2 != null) {
                    this.pattern = object2;
                    if (h.H((String)charSequence, "sha1/", false, 2, null)) {
                        this.hashAlgorithm = "sha1";
                        object2 = ax.xc.h.e0;
                        object = ((String)charSequence).substring(5);
                        l.e(object, "this as java.lang.String).substring(startIndex)");
                        object = ((h.a)object2).a((String)object);
                        if (object != null) {
                            this.hash = object;
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid pin hash: ");
                        ((StringBuilder)object).append((String)charSequence);
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    if (h.H((String)charSequence, "sha256/", false, 2, null)) {
                        this.hashAlgorithm = "sha256";
                        object2 = ax.xc.h.e0;
                        object = ((String)charSequence).substring(7);
                        l.e(object, "this as java.lang.String).substring(startIndex)");
                        object = ((h.a)object2).a((String)object);
                        if (object != null) {
                            this.hash = object;
                            return;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid pin hash: ");
                        ((StringBuilder)object).append((String)charSequence);
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("pins must start with 'sha256/' or 'sha1/': ");
                    ((StringBuilder)object).append((String)charSequence);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Invalid pattern: ");
                ((StringBuilder)charSequence).append((String)object);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unexpected pattern: ");
            ((StringBuilder)charSequence).append((String)object);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Pin)) {
                return false;
            }
            String string = this.pattern;
            object = (Pin)object;
            if (!l.a(string, ((Pin)object).pattern)) {
                return false;
            }
            if (!l.a(this.hashAlgorithm, ((Pin)object).hashAlgorithm)) {
                return false;
            }
            return l.a(this.hash, ((Pin)object).hash);
        }

        public final ax.xc.h getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (this.pattern.hashCode() * 31 + this.hashAlgorithm.hashCode()) * 31 + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            l.f(x509Certificate, "certificate");
            String string = this.hashAlgorithm;
            if (l.a(string, "sha256")) {
                return l.a(this.hash, Companion.sha256Hash(x509Certificate));
            }
            if (l.a(string, "sha1")) {
                return l.a(this.hash, Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String string) {
            l.f(string, "hostname");
            if (h.H(this.pattern, "**.", false, 2, null)) {
                int n8 = this.pattern.length() - 3;
                int n9 = string.length() - n8;
                return h.y(string, string.length() - n8, this.pattern, 3, n8, false, 16, null) && (n9 == 0 || string.charAt(n9 - 1) == '.');
            }
            if (h.H(this.pattern, "*.", false, 2, null)) {
                int n10 = this.pattern.length() - 1;
                int n11 = string.length();
                return h.y(string, string.length() - n10, this.pattern, 1, n10, false, 16, null) && h.Z(string, '.', n11 - n10 - 1, false, 4, null) == -1;
            }
            return l.a(string, this.pattern);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.hashAlgorithm);
            stringBuilder.append('/');
            stringBuilder.append(this.hash.d());
            return stringBuilder.toString();
        }
    }
}


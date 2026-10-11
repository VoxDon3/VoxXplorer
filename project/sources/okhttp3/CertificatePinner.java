package okhttp3;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.z;
import ax.Ob.s;
import ax.tb.C3133i;
import ax.tb.C3139o;
import ax.xc.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes3.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            l.f(str, "pattern");
            l.f(strArr, "pins");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(C3139o.Y(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            l.f(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).d();
        }

        public final h sha1Hash(X509Certificate x509Certificate) {
            l.f(x509Certificate, "<this>");
            h.a aVar = h.e0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l.e(encoded, "publicKey.encoded");
            return h.a.f(aVar, encoded, 0, 0, 3, null).E();
        }

        public final h sha256Hash(X509Certificate x509Certificate) {
            l.f(x509Certificate, "<this>");
            h.a aVar = h.e0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l.e(encoded, "publicKey.encoded");
            return h.a.f(aVar, encoded, 0, 0, 3, null).F();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        private final h hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
        
            if (ax.Ob.h.V(r5, "*", 1, false, 4, null) != (-1)) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(java.lang.String r12, java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return l.a(this.pattern, pin.pattern) && l.a(this.hashAlgorithm, pin.hashAlgorithm) && l.a(this.hash, pin.hash);
        }

        public final h getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            l.f(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (l.a(str, "sha256")) {
                return l.a(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (l.a(str, "sha1")) {
                return l.a(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            boolean x;
            boolean x2;
            l.f(str, "hostname");
            if (ax.Ob.h.H(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                x2 = s.x(str, str.length() - length, this.pattern, 3, length, (r12 & 16) != 0 ? false : false);
                return x2 && (length2 == 0 || str.charAt(length2 - 1) == '.');
            }
            if (!ax.Ob.h.H(this.pattern, "*.", false, 2, null)) {
                return l.a(str, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            int length4 = str.length() - length3;
            x = s.x(str, str.length() - length3, this.pattern, 1, length3, (r12 & 16) != 0 ? false : false);
            return x && ax.Ob.h.Z(str, '.', length4 + (-1), false, 4, null) == -1;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.d();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        l.f(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final h sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final h sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        l.f(str, "hostname");
        l.f(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, a<? extends List<? extends X509Certificate>> aVar) {
        l.f(str, "hostname");
        l.f(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            h hVar = null;
            h hVar2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (l.a(hashAlgorithm, "sha256")) {
                    if (hVar == null) {
                        hVar = Companion.sha256Hash(x509Certificate);
                    }
                    if (l.a(pin.getHash(), hVar)) {
                        return;
                    }
                } else {
                    if (!l.a(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (hVar2 == null) {
                        hVar2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (l.a(pin.getHash(), hVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return l.a(certificatePinner.pins, this.pins) && l.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String str) {
        l.f(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> j = C3139o.j();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (j.isEmpty()) {
                    j = new ArrayList<>();
                }
                l.d(j, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                z.a(j).add(obj);
            }
        }
        return j;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        l.f(certificateChainCleaner, "certificateChainCleaner");
        return l.a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        l.f(str, "hostname");
        l.f(certificateArr, "peerCertificates");
        check(str, C3133i.E(certificateArr));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, g gVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.sb.h;
import ax.sb.i;
import ax.tb.o;
import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.CipherSuite;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Handshake {
    public static final Companion Companion = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final h peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a<? extends List<? extends Certificate>> a8) {
        l.f((Object)tlsVersion, "tlsVersion");
        l.f(cipherSuite, "cipherSuite");
        l.f(list, "localCertificates");
        l.f(a8, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = i.a(new a<List<? extends Certificate>>(a8){
            final a<List<Certificate>> $peerCertificatesFn;
            {
                this.$peerCertificatesFn = a8;
                super(0);
            }

            public final List<Certificate> invoke() {
                try {
                    List<Certificate> list = this.$peerCertificatesFn.invoke();
                    return list;
                }
                catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
                    return o.j();
                }
            }
        });
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate object) {
        if (object instanceof X509Certificate) {
            return ((Object)((X509Certificate)object).getSubjectDN()).toString();
        }
        object = ((Certificate)object).getType();
        l.e(object, "type");
        return object;
    }

    public final CipherSuite -deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> -deprecated_localCertificates() {
        return this.localCertificates;
    }

    public final Principal -deprecated_localPrincipal() {
        return this.localPrincipal();
    }

    public final List<Certificate> -deprecated_peerCertificates() {
        return this.peerCertificates();
    }

    public final Principal -deprecated_peerPrincipal() {
        return this.peerPrincipal();
    }

    public final TlsVersion -deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object object) {
        if (object instanceof Handshake) {
            object = (Handshake)object;
            if (((Handshake)object).tlsVersion == this.tlsVersion && l.a(((Handshake)object).cipherSuite, this.cipherSuite) && l.a(((Handshake)object).peerCertificates(), this.peerCertificates()) && l.a(((Handshake)object).localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((527 + ((Object)((Object)this.tlsVersion)).hashCode()) * 31 + this.cipherSuite.hashCode()) * 31 + ((Object)this.peerCertificates()).hashCode()) * 31 + ((Object)this.localCertificates).hashCode();
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Certificate certificate = o.G(this.localCertificates);
        certificate = certificate instanceof X509Certificate ? (X509Certificate)certificate : null;
        if (certificate != null) {
            return ((X509Certificate)certificate).getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List)this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Certificate certificate = o.G(this.peerCertificates());
        certificate = certificate instanceof X509Certificate ? (X509Certificate)certificate : null;
        if (certificate != null) {
            return ((X509Certificate)certificate).getSubjectX500Principal();
        }
        return null;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        ArrayList<String> arrayList = this.peerCertificates();
        Serializable serializable = new ArrayList<String>(o.s(arrayList, 10));
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            serializable.add(this.getName((Certificate)arrayList.next()));
        }
        arrayList = serializable.toString();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Handshake{tlsVersion=");
        ((StringBuilder)serializable).append((Object)this.tlsVersion);
        ((StringBuilder)serializable).append(" cipherSuite=");
        ((StringBuilder)serializable).append(this.cipherSuite);
        ((StringBuilder)serializable).append(" peerCertificates=");
        ((StringBuilder)serializable).append((String)((Object)arrayList));
        ((StringBuilder)serializable).append(" localCertificates=");
        Object object = this.localCertificates;
        arrayList = new ArrayList<String>(o.s(object, 10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(this.getName((Certificate)object.next()));
        }
        ((StringBuilder)serializable).append(arrayList);
        ((StringBuilder)serializable).append('}');
        return ((StringBuilder)serializable).toString();
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArray) {
            if (certificateArray != null) {
                return Util.immutableListOf(Arrays.copyOf(certificateArray, certificateArray.length));
            }
            return o.j();
        }

        public final Handshake -deprecated_get(SSLSession sSLSession) throws IOException {
            l.f(sSLSession, "sslSession");
            return this.get(sSLSession);
        }

        public final Handshake get(SSLSession object) throws IOException {
            l.f(object, "<this>");
            Object object2 = object.getCipherSuite();
            if (object2 != null) {
                boolean bl = l.a(object2, "TLS_NULL_WITH_NULL_NULL") ? true : l.a(object2, "SSL_NULL_WITH_NULL_NULL");
                if (!bl) {
                    CipherSuite cipherSuite = CipherSuite.Companion.forJavaName((String)object2);
                    object2 = object.getProtocol();
                    if (object2 != null) {
                        if (!l.a("NONE", object2)) {
                            TlsVersion tlsVersion = TlsVersion.Companion.forJavaName((String)object2);
                            try {
                                object2 = this.toImmutableList(object.getPeerCertificates());
                            }
                            catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
                                object2 = o.j();
                            }
                            return new Handshake(tlsVersion, cipherSuite, this.toImmutableList(object.getLocalCertificates()), (a<? extends List<? extends Certificate>>)new a<List<? extends Certificate>>(object2){
                                final List<Certificate> $peerCertificatesCopy;
                                {
                                    this.$peerCertificatesCopy = list;
                                    super(0);
                                }

                                public final List<Certificate> invoke() {
                                    return this.$peerCertificatesCopy;
                                }
                            });
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null");
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("cipherSuite == ");
                ((StringBuilder)object).append((String)object2);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new IllegalStateException("cipherSuite == null");
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
            l.f((Object)tlsVersion, "tlsVersion");
            l.f(cipherSuite, "cipherSuite");
            l.f(list, "peerCertificates");
            l.f(list2, "localCertificates");
            list = Util.toImmutableList(list);
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(list2), (a<? extends List<? extends Certificate>>)new a<List<? extends Certificate>>(list){
                final List<Certificate> $peerCertificatesCopy;
                {
                    this.$peerCertificatesCopy = list;
                    super(0);
                }

                public final List<Certificate> invoke() {
                    return this.$peerCertificatesCopy;
                }
            });
        }
    }
}


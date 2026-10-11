/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.o;
import ax.vb.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.CipherSuite;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ConnectionSpec {
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final Companion Companion;
    public static final ConnectionSpec MODERN_TLS;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    static {
        Companion = new Companion(null);
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        Object object = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        Object object2 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        Object object3 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArray = new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, object, cipherSuite4, cipherSuite5, object2, object3, cipherSuite6};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArray;
        CipherSuite[] cipherSuiteArray2 = new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, object, cipherSuite4, cipherSuite5, object2, object3, cipherSuite6, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArray2;
        object = new Builder(true).cipherSuites(Arrays.copyOf(cipherSuiteArray, cipherSuiteArray.length));
        object2 = TlsVersion.TLS_1_3;
        object3 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = ((Builder)object).tlsVersions(new TlsVersion[]{object2, object3}).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites(Arrays.copyOf(cipherSuiteArray2, cipherSuiteArray2.length)).tlsVersions(new TlsVersion[]{object2, object3}).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites(Arrays.copyOf(cipherSuiteArray2, cipherSuiteArray2.length)).tlsVersions(new TlsVersion[]{object2, object3, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0}).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean bl, boolean bl2, String[] stringArray, String[] stringArray2) {
        this.isTls = bl;
        this.supportsTlsExtensions = bl2;
        this.cipherSuitesAsString = stringArray;
        this.tlsVersionsAsString = stringArray2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket object, boolean bl) {
        String[] stringArray;
        Object object2;
        if (this.cipherSuitesAsString != null) {
            object2 = ((SSLSocket)object).getEnabledCipherSuites();
            l.e(object2, "sslSocket.enabledCipherSuites");
            object2 = Util.intersect((String[])object2, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            object2 = ((SSLSocket)object).getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            stringArray = ((SSLSocket)object).getEnabledProtocols();
            l.e(stringArray, "sslSocket.enabledProtocols");
            stringArray = Util.intersect(stringArray, this.tlsVersionsAsString, a.b());
        } else {
            stringArray = ((SSLSocket)object).getEnabledProtocols();
        }
        String[] stringArray2 = ((SSLSocket)object).getSupportedCipherSuites();
        l.e(stringArray2, "supportedCipherSuites");
        int n8 = Util.indexOf(stringArray2, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        object = object2;
        if (bl) {
            object = object2;
            if (n8 != -1) {
                l.e(object2, "cipherSuitesIntersection");
                object = stringArray2[n8];
                l.e(object, "supportedCipherSuites[indexOfFallbackScsv]");
                object = Util.concat((String[])object2, (String)object);
            }
        }
        object2 = new Builder(this);
        l.e(object, "cipherSuitesIntersection");
        object = ((Builder)object2).cipherSuites(Arrays.copyOf(object, ((String[])object).length));
        l.e(stringArray, "tlsVersionsIntersection");
        return ((Builder)object).tlsVersions(Arrays.copyOf(stringArray, stringArray.length)).build();
    }

    public final List<CipherSuite> -deprecated_cipherSuites() {
        return this.cipherSuites();
    }

    public final boolean -deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<TlsVersion> -deprecated_tlsVersions() {
        return this.tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean bl) {
        l.f(sSLSocket, "sslSocket");
        ConnectionSpec connectionSpec = this.supportedSpec(sSLSocket, bl);
        if (connectionSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(connectionSpec.tlsVersionsAsString);
        }
        if (connectionSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpec.cipherSuitesAsString);
        }
    }

    public final List<CipherSuite> cipherSuites() {
        String[] stringArray = this.cipherSuitesAsString;
        if (stringArray != null) {
            ArrayList<CipherSuite> arrayList = new ArrayList<CipherSuite>(stringArray.length);
            for (String string : stringArray) {
                arrayList.add(CipherSuite.Companion.forJavaName(string));
            }
            return o.V(arrayList);
        }
        return null;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ConnectionSpec)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        boolean bl = this.isTls;
        object = (ConnectionSpec)object;
        if (bl != ((ConnectionSpec)object).isTls) {
            return false;
        }
        if (bl) {
            if (!Arrays.equals(this.cipherSuitesAsString, ((ConnectionSpec)object).cipherSuitesAsString)) {
                return false;
            }
            if (!Arrays.equals(this.tlsVersionsAsString, ((ConnectionSpec)object).tlsVersionsAsString)) {
                return false;
            }
            if (this.supportsTlsExtensions != ((ConnectionSpec)object).supportsTlsExtensions) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.isTls) {
            Object[] objectArray = this.cipherSuitesAsString;
            int n8 = 0;
            int n9 = objectArray != null ? Arrays.hashCode(objectArray) : 0;
            objectArray = this.tlsVersionsAsString;
            if (objectArray != null) {
                n8 = Arrays.hashCode(objectArray);
            }
            return ((527 + n9) * 31 + n8) * 31 + (this.supportsTlsExtensions ^ 1);
        }
        return 17;
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        l.f(sSLSocket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] stringArray = this.tlsVersionsAsString;
        if (stringArray != null && !Util.hasIntersection(stringArray, sSLSocket.getEnabledProtocols(), a.b())) {
            return false;
        }
        stringArray = this.cipherSuitesAsString;
        return stringArray == null || Util.hasIntersection(stringArray, sSLSocket.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp());
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<TlsVersion> tlsVersions() {
        String[] stringArray = this.tlsVersionsAsString;
        if (stringArray != null) {
            ArrayList<TlsVersion> arrayList = new ArrayList<TlsVersion>(stringArray.length);
            for (String string : stringArray) {
                arrayList.add(TlsVersion.Companion.forJavaName(string));
            }
            return o.V(arrayList);
        }
        return null;
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionSpec(cipherSuites=");
        stringBuilder.append(j.Objects.toString(this.cipherSuites(), (String)"[all enabled]"));
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(j.Objects.toString(this.tlsVersions(), (String)"[all enabled]"));
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(this.supportsTlsExtensions);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static final class Builder {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public Builder(ConnectionSpec connectionSpec) {
            l.f(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        public Builder(boolean bl) {
            this.tls = bl;
        }

        public final Builder allEnabledCipherSuites() {
            if (this.tls) {
                this.cipherSuites = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final Builder allEnabledTlsVersions() {
            if (this.tls) {
                this.tlsVersions = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final Builder cipherSuites(String ... stringArray) {
            l.f(stringArray, "cipherSuites");
            if (this.tls) {
                boolean bl = stringArray.length == 0;
                if (!bl) {
                    this.cipherSuites = (String[])stringArray.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final Builder cipherSuites(CipherSuite ... objectArray) {
            l.f(objectArray, "cipherSuites");
            if (this.tls) {
                ArrayList<String> arrayList = new ArrayList<String>(objectArray.length);
                int n8 = objectArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    arrayList.add(objectArray[i8].javaName());
                }
                objectArray = arrayList.toArray(new String[0]);
                return this.cipherSuites((String[])Arrays.copyOf(objectArray, objectArray.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(String[] stringArray) {
            this.cipherSuites = stringArray;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean bl) {
            this.supportsTlsExtensions = bl;
        }

        public final void setTls$okhttp(boolean bl) {
            this.tls = bl;
        }

        public final void setTlsVersions$okhttp(String[] stringArray) {
            this.tlsVersions = stringArray;
        }

        public final Builder supportsTlsExtensions(boolean bl) {
            if (this.tls) {
                this.supportsTlsExtensions = bl;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }

        public final Builder tlsVersions(String ... stringArray) {
            l.f(stringArray, "tlsVersions");
            if (this.tls) {
                boolean bl = stringArray.length == 0;
                if (!bl) {
                    this.tlsVersions = (String[])stringArray.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final Builder tlsVersions(TlsVersion ... objectArray) {
            l.f(objectArray, "tlsVersions");
            if (this.tls) {
                ArrayList<String> arrayList = new ArrayList<String>(objectArray.length);
                int n8 = objectArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    arrayList.add(objectArray[i8].javaName());
                }
                objectArray = arrayList.toArray(new String[0]);
                return this.tlsVersions((String[])Arrays.copyOf(objectArray, objectArray.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}


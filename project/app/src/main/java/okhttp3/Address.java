/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Authenticator;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String string, int n8, Dns object, SocketFactory object2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        l.f(string, "uriHost");
        l.f(object, "dns");
        l.f(object2, "socketFactory");
        l.f(authenticator, "proxyAuthenticator");
        l.f(list, "protocols");
        l.f(list2, "connectionSpecs");
        l.f(proxySelector, "proxySelector");
        this.dns = object;
        this.socketFactory = object2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        object2 = new HttpUrl.Builder();
        object = sSLSocketFactory != null ? "https" : "http";
        this.url = ((HttpUrl.Builder)object2).scheme((String)object).host(string).port(n8).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    public final CertificatePinner -deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> -deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns -deprecated_dns() {
        return this.dns;
    }

    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> -deprecated_protocols() {
        return this.protocols;
    }

    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector -deprecated_proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory -deprecated_socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HttpUrl -deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object object) {
        if (object instanceof Address) {
            HttpUrl httpUrl = this.url;
            object = (Address)object;
            if (l.a(httpUrl, ((Address)object).url) && this.equalsNonHost$okhttp((Address)object)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        l.f(address, "that");
        return l.a(this.dns, address.dns) && l.a(this.proxyAuthenticator, address.proxyAuthenticator) && l.a(this.protocols, address.protocols) && l.a(this.connectionSpecs, address.connectionSpecs) && l.a(this.proxySelector, address.proxySelector) && l.a(this.proxy, address.proxy) && l.a(this.sslSocketFactory, address.sslSocketFactory) && l.a(this.hostnameVerifier, address.hostnameVerifier) && l.a(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return (((((((((527 + this.url.hashCode()) * 31 + this.dns.hashCode()) * 31 + this.proxyAuthenticator.hashCode()) * 31 + ((Object)this.protocols).hashCode()) * 31 + ((Object)this.connectionSpecs).hashCode()) * 31 + this.proxySelector.hashCode()) * 31 + j.Objects.hashCode((Object)this.proxy)) * 31 + j.Objects.hashCode((Object)this.sslSocketFactory)) * 31 + j.Objects.hashCode((Object)this.hostnameVerifier)) * 31 + j.Objects.hashCode((Object)this.certificatePinner);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder var1_3;
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Address{");
        stringBuilder.append(this.url.host());
        stringBuilder.append(':');
        stringBuilder.append(this.url.port());
        stringBuilder.append(", ");
        if (this.proxy != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("proxy=");
            object = this.proxy;
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("proxySelector=");
            object = this.proxySelector;
        }
        var1_3.append(object);
        String string = var1_3.toString();
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }
}


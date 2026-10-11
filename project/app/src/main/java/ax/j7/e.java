/*
 * Decompiled with CFR 0.152.
 */
package ax.j7;

import ax.i7.w;
import ax.j7.a;
import ax.j7.b;
import ax.j7.c;
import ax.m7.v;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class e
extends w {
    private static final String[] g;
    private final a c;
    private final SSLSocketFactory d;
    private final HostnameVerifier e;
    private final boolean f;

    static {
        Object[] objectArray = new String[]{"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        g = objectArray;
        Arrays.sort(objectArray);
    }

    public e() {
        this(null, null, null, false);
    }

    e(a a8, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean bl) {
        this.c = this.i(a8);
        this.d = sSLSocketFactory;
        this.e = hostnameVerifier;
        this.f = bl;
    }

    private static Proxy h() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
    }

    private a i(a a8) {
        a a9 = a8;
        if (a8 == null) {
            if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
                return new b(ax.j7.e.h());
            }
            a9 = new b();
        }
        return a9;
    }

    @Override
    public boolean e() {
        return this.f;
    }

    @Override
    public boolean f(String string) {
        return Arrays.binarySearch(g, string) >= 0;
    }

    protected c g(String object, String object2) throws IOException {
        v.c(this.f((String)object), "HTTP method %s not supported", object);
        object2 = new URL((String)object2);
        object2 = this.c.a((URL)object2);
        ((HttpURLConnection)object2).setRequestMethod((String)object);
        if (object2 instanceof HttpsURLConnection) {
            object = (HttpsURLConnection)object2;
            Object object3 = this.e;
            if (object3 != null) {
                ((HttpsURLConnection)object).setHostnameVerifier((HostnameVerifier)object3);
            }
            if ((object3 = this.d) != null) {
                ((HttpsURLConnection)object).setSSLSocketFactory((SSLSocketFactory)object3);
            }
        }
        return new c((HttpURLConnection)object2);
    }
}


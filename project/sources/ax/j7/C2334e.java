package ax.j7;

import ax.i7.w;
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

/* renamed from: ax.j7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2334e extends w {
    private static final String[] g;
    private final InterfaceC2330a c;
    private final SSLSocketFactory d;
    private final HostnameVerifier e;
    private final boolean f;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        g = strArr;
        Arrays.sort(strArr);
    }

    public C2334e() {
        this(null, null, null, false);
    }

    private static Proxy h() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
    }

    private InterfaceC2330a i(InterfaceC2330a interfaceC2330a) {
        return interfaceC2330a == null ? System.getProperty("com.google.api.client.should_use_proxy") != null ? new C2331b(h()) : new C2331b() : interfaceC2330a;
    }

    @Override // ax.i7.w
    public boolean e() {
        return this.f;
    }

    @Override // ax.i7.w
    public boolean f(String str) {
        return Arrays.binarySearch(g, str) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i7.w
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2332c b(String str, String str2) throws IOException {
        v.c(f(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.c.a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            HostnameVerifier hostnameVerifier = this.e;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new C2332c(a);
    }

    C2334e(InterfaceC2330a interfaceC2330a, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean z) {
        this.c = i(interfaceC2330a);
        this.d = sSLSocketFactory;
        this.e = hostnameVerifier;
        this.f = z;
    }
}

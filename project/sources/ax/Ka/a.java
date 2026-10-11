package ax.Ka;

import android.os.Build;
import ax.Na.f;
import ax.Na.g;
import ax.Na.h;
import ax.m4.C2516b;
import ax.xc.C;
import ax.xc.InterfaceC3488f;
import ax.xc.p;
import com.socialnmobile.dav.gson.Multistatus;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes3.dex */
public class a implements ax.Ia.a {
    private static final Logger e = Logger.getLogger(ax.Ia.a.class.getName());
    private static Pattern f = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
    private static final Charset g;
    private static final Charset h;
    private static final Charset i;
    protected OkHttpClient a;
    private OkHttpClient.Builder b;
    private boolean c;
    private int d;

    /* renamed from: ax.Ka.a$a, reason: collision with other inner class name */
    class C0113a implements Interceptor {
        final /* synthetic */ e a;

        C0113a(e eVar) {
            this.a = eVar;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request;
            Request request2 = chain.request();
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "DavClient-okhttp3/0.1.0";
            }
            Request.Builder header = request2.newBuilder().header("User-Agent", property);
            e eVar = this.a;
            if (eVar == null || eVar.a() == null) {
                e eVar2 = this.a;
                if (eVar2 == null || eVar2.b() == null) {
                    request = null;
                } else {
                    request = this.a.b().a(null, header.build());
                }
            } else {
                header.header("Authorization", this.a.a());
                request = header.build();
            }
            if (request == null) {
                request = header.build();
            }
            return chain.proceed(request);
        }
    }

    class c implements HostnameVerifier {
        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
        
            if (r3.a.c != false) goto L15;
         */
        @Override // javax.net.ssl.HostnameVerifier
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean verify(java.lang.String r4, javax.net.ssl.SSLSession r5) {
            /*
                r3 = this;
                java.lang.String r0 = ":"
                boolean r0 = r4.contains(r0)     // Catch: java.lang.Exception -> L37
                r1 = 1
                if (r0 != 0) goto L17
                java.util.regex.Pattern r0 = ax.Ka.a.e()     // Catch: java.lang.Exception -> L37
                java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch: java.lang.Exception -> L37
                boolean r0 = r0.matches()     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L2e
            L17:
                java.net.InetAddress r0 = java.net.InetAddress.getByName(r4)     // Catch: java.lang.Exception -> L37
                boolean r2 = r0.isSiteLocalAddress()     // Catch: java.lang.Exception -> L37
                if (r2 != 0) goto L36
                boolean r2 = r0.isAnyLocalAddress()     // Catch: java.lang.Exception -> L37
                if (r2 != 0) goto L36
                boolean r0 = r0.isLoopbackAddress()     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L2e
                goto L36
            L2e:
                ax.Ka.a r0 = ax.Ka.a.this     // Catch: java.lang.Exception -> L37
                boolean r0 = ax.Ka.a.d(r0)     // Catch: java.lang.Exception -> L37
                if (r0 == 0) goto L37
            L36:
                return r1
            L37:
                okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
                boolean r4 = r0.verify(r4, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Ka.a.c.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
        }
    }

    class d extends RequestBody {
        MediaType a;
        InputStream b;
        long c;
        boolean d = false;

        d(MediaType mediaType, InputStream inputStream, long j) {
            this.a = mediaType;
            this.b = inputStream;
            this.c = j;
        }

        boolean a() {
            return this.d;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.c;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.a;
        }

        @Override // okhttp3.RequestBody
        public boolean isOneShot() {
            return true;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC3488f interfaceC3488f) throws IOException {
            if (this.d) {
                throw new IOException("RequestBody InputStream Repeated.");
            }
            this.d = true;
            C c = null;
            try {
                c = p.k(this.b);
                interfaceC3488f.M(c);
            } finally {
                Util.closeQuietly(c);
            }
        }
    }

    static class e implements Authenticator {
        C2516b a;
        String b;
        String c;
        String d;
        String e;
        String f;

        e(String str, String str2, String str3, String str4) {
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public String a() {
            return this.b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0119, code lost:
        
            if (r17.b != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x012a, code lost:
        
            if (r17.b.equals(r19.request().header("Authorization")) == false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
        
            return r19.request().newBuilder().header("Authorization", r17.b).build();
         */
        @Override // okhttp3.Authenticator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public okhttp3.Request authenticate(okhttp3.Route r18, okhttp3.Response r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.Ka.a.e.authenticate(okhttp3.Route, okhttp3.Response):okhttp3.Request");
        }

        public C2516b b() {
            return this.a;
        }

        public void c() {
            this.b = Credentials.basic(this.c, this.d, a.i);
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        g = forName;
        h = Charset.forName("ISO-8859-1");
        i = forName;
    }

    public a(boolean z, long j) {
        this.d = ServerType.TYPE_COMMON;
        OkHttpClient.Builder j2 = j(null, null, z, j);
        this.b = j2;
        j2.followRedirects(false);
        this.b.followSslRedirects(false);
        this.a = this.b.build();
    }

    private e y(String str, String str2, String str3, String str4) {
        return new e(str, str2, str3, str4);
    }

    public List<ax.Ia.c> A(String str, int i2, Set<QName> set) throws ax.Ja.a {
        return C(str, i2, g());
    }

    public List<ax.Ia.c> B(String str, int i2, boolean z) throws ax.Ja.a {
        return z ? C(str, i2, f()) : A(str, i2, Collections.EMPTY_SET);
    }

    protected List<ax.Ia.c> C(String str, int i2, String str2) throws ax.Ja.a {
        f fVar = new f(str);
        fVar.i(i2 < 0 ? "infinity" : Integer.toString(i2));
        fVar.g(str2);
        Multistatus multistatus = (Multistatus) k(fVar, new ax.La.a());
        List<com.socialnmobile.dav.gson.Response> response = multistatus.getResponse();
        if (response == null) {
            ax.Ha.c.h().f().d("INVALID MULTISTATUS RESPONSE!!!").g(multistatus.getResponseDescription()).h();
            throw new ax.Ja.a("Invalid multistaus response");
        }
        ArrayList arrayList = new ArrayList(response.size());
        for (com.socialnmobile.dav.gson.Response response2 : response) {
            try {
                arrayList.add(new ax.Ia.c(response2));
            } catch (URISyntaxException unused) {
                e.warning(String.format("Ignore resource with invalid URI %s", response2.getHref()));
            }
        }
        return arrayList;
    }

    public <T> T D(String str, RequestBody requestBody, Headers headers, ax.La.c<T> cVar) throws ax.Ja.a {
        g gVar = new g(str);
        gVar.f(requestBody);
        gVar.a(headers);
        try {
            return (T) k(gVar, cVar);
        } catch (ax.Ja.a e2) {
            if (e2.b() == 417) {
                gVar.d("Expect");
                if (z(requestBody)) {
                    return (T) k(gVar, cVar);
                }
            }
            throw e2;
        }
    }

    public void E(String str, RequestBody requestBody, String str2, boolean z, Long l) throws ax.Ja.a {
        Headers.Builder builder = new Headers.Builder();
        if (l != null && l.longValue() > 0) {
            int i2 = this.d;
            if (i2 == ServerType.TYPE_NEXTCLOUD || i2 == ServerType.TYPE_OWNCLOUD) {
                builder.add("X-OC-Mtime", String.valueOf(l.longValue() / 1000));
            } else if (i2 == ServerType.TYPE_NGINX) {
                builder.set("Date", new Date(l.longValue()));
            }
        }
        if (str2 != null) {
            builder.add("Content-Type", str2);
        }
        if (z) {
            builder.add("Expect", "100-continue");
        }
        F(str, requestBody, builder.build());
    }

    public void F(String str, RequestBody requestBody, Headers headers) throws ax.Ja.a {
        D(str, requestBody, headers, new ax.La.d());
    }

    public void G(boolean z) {
        this.c = z;
    }

    public void H() {
        this.b.protocols(Arrays.asList(Protocol.HTTP_1_1));
        this.a = this.b.build();
    }

    public String f() throws ax.Ja.b {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            Element createElementNS = newDocument.createElementNS("DAV:", "d:propfind");
            newDocument.appendChild(createElementNS);
            createElementNS.setAttribute("xmlns:d", "DAV:");
            createElementNS.appendChild(newDocument.createElementNS("DAV:", "d:allprop"));
            return ax.Oa.a.b(newDocument);
        } catch (ParserConfigurationException | TransformerException e2) {
            throw new ax.Ja.b(e2);
        }
    }

    public String g() throws ax.Ja.a {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Document newDocument = newInstance.newDocumentBuilder().newDocument();
            Element createElementNS = newDocument.createElementNS("DAV:", "d:propfind");
            createElementNS.setAttribute("xmlns:d", "DAV:");
            int i2 = this.d;
            if (i2 == ServerType.TYPE_YANDEX) {
                createElementNS.setAttribute("xmlns:m", "urn:yandex:disk:meta");
            } else if (i2 == ServerType.TYPE_NEXTCLOUD) {
                createElementNS.setAttribute("xmlns:nc", "http://nextcloud.org/ns");
            }
            newDocument.appendChild(createElementNS);
            Element createElementNS2 = newDocument.createElementNS("DAV:", "d:prop");
            createElementNS.appendChild(createElementNS2);
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:resourcetype"));
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:displayname"));
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:getcontentlength"));
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:getlastmodified"));
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:getetag"));
            createElementNS2.appendChild(newDocument.createElementNS("DAV:", "d:getcontenttype"));
            int i3 = this.d;
            if (i3 == ServerType.TYPE_YANDEX) {
                createElementNS2.appendChild(newDocument.createElementNS("urn:yandex:disk:meta", "m:readonly"));
                createElementNS2.appendChild(newDocument.createElementNS("urn:yandex:disk:meta", "m:visible"));
                createElementNS2.appendChild(newDocument.createElementNS("urn:yandex:disk:meta", "m:hasthumbnail"));
            } else if (i3 == ServerType.TYPE_NEXTCLOUD) {
                createElementNS2.appendChild(newDocument.createElementNS("http://nextcloud.org/ns", "nc:has-preview"));
            }
            return ax.Oa.a.b(newDocument);
        } catch (ParserConfigurationException e2) {
            e = e2;
            throw new ax.Ja.b(e);
        } catch (TransformerException e3) {
            e = e3;
            throw new ax.Ja.b(e);
        }
    }

    @Override // ax.Ia.a
    public void h(String str) throws ax.Ja.a {
        k(new ax.Na.b(str), new ax.La.d());
    }

    protected OkHttpClient.Builder j(ProxySelector proxySelector, e eVar, boolean z, long j) {
        SSLContext sSLContext;
        if (z) {
            G(true);
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (eVar != null) {
            builder.authenticator(eVar);
        }
        if (proxySelector != null) {
            builder.proxySelector(proxySelector);
        }
        if (j != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.connectTimeout(j, timeUnit);
            builder.readTimeout(j, timeUnit);
            builder.writeTimeout(j, timeUnit);
        }
        builder.addInterceptor(new C0113a(eVar));
        if (z) {
            try {
                b bVar = new b();
                TrustManager[] trustManagerArr = {bVar};
                if (Build.VERSION.SDK_INT <= 28) {
                    try {
                        sSLContext = SSLContext.getInstance("TLSv1.3");
                    } catch (NoSuchAlgorithmException unused) {
                        sSLContext = SSLContext.getInstance("TLSv1.2");
                    }
                } else {
                    sSLContext = SSLContext.getInstance("TLSv1.3");
                }
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                builder.sslSocketFactory(sSLContext.getSocketFactory(), bVar);
                builder.hostnameVerifier(new c());
            } catch (Exception unused2) {
            }
        }
        return builder;
    }

    protected <T> T k(h hVar, ax.La.c<T> cVar) throws ax.Ja.a {
        return (T) l(hVar, cVar, false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, okhttp3.Response] */
    protected <T> T l(h hVar, ax.La.c<T> cVar, boolean z) throws ax.Ja.a {
        try {
            ?? r0 = (T) this.a.newCall(hVar.b()).execute();
            return cVar == null ? r0 : cVar.a(r0);
        } catch (StreamResetException e2) {
            ErrorCode errorCode = e2.errorCode;
            if ((errorCode != ErrorCode.HTTP_1_1_REQUIRED && errorCode != ErrorCode.PROTOCOL_ERROR) || z) {
                throw new ax.Ja.a(e2);
            }
            H();
            return (T) l(hVar, cVar, true);
        } catch (IOException e3) {
            e = e3;
            throw new ax.Ja.a(e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new ax.Ja.a(e);
        }
    }

    protected Response m(h hVar) throws ax.Ja.a {
        return (Response) k(hVar, null);
    }

    @Override // ax.Ia.a
    public void n(String str) throws ax.Ja.a {
        k(new ax.Na.d(str), new ax.La.d());
    }

    @Override // ax.Ia.a
    public void o(int i2) {
        this.d = i2;
    }

    @Override // ax.Ia.a
    public void p(String str, InputStream inputStream, String str2, boolean z, long j, Long l) throws ax.Ja.a {
        E(str, new d(str2 == null ? h.c : MediaType.parse(str2), inputStream, j), str2, z, l);
    }

    @Override // ax.Ia.a
    public void q(String str, String str2, long j, boolean z) throws ax.Ja.a {
        ax.Na.a aVar = new ax.Na.a(str, str2, z);
        if ((j > 0 && this.d == ServerType.TYPE_NEXTCLOUD) || this.d == ServerType.TYPE_OWNCLOUD) {
            aVar.e("X-OC-Mtime", String.valueOf(j / 1000));
        }
        k(aVar, new ax.La.d());
    }

    @Override // ax.Ia.a
    public void r(String str, String str2, boolean z) throws ax.Ja.a {
        k(new ax.Na.e(str, str2, z), new ax.La.d());
    }

    @Override // ax.Ia.a
    public List<ax.Ia.c> s(String str, int i2) throws ax.Ja.a {
        return B(str, i2, false);
    }

    @Override // ax.Ia.a
    public int t(String str) throws ax.Ja.a {
        try {
            String f2 = f();
            f fVar = new f(str);
            fVar.i(Integer.toString(0));
            fVar.g(f2);
            return ((ServerType) k(fVar, new ax.La.b())).serverType;
        } catch (ax.Ja.b unused) {
            e.warning("detect type parse failed try list");
            s(str, 0);
            return this.d;
        }
    }

    @Override // ax.Ia.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ax.Ma.b i(String str) throws ax.Ja.a {
        return u(str, Collections.EMPTY_MAP);
    }

    @Override // ax.Ia.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public ax.Ma.b u(String str, Map<String, String> map) throws ax.Ja.a {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.add(entry.getKey(), entry.getValue());
        }
        return x(str, builder.build());
    }

    public ax.Ma.b x(String str, Headers headers) throws ax.Ja.a {
        ax.Na.c cVar = new ax.Na.c(str);
        cVar.a(headers);
        Response m = m(cVar);
        try {
            new ax.La.d().a(m);
            return new ax.Ma.b(new ax.Ma.c(m), Long.valueOf(m.body().contentLength()));
        } catch (IOException e2) {
            if (m != null) {
                m.close();
            }
            throw new ax.Ja.a(e2);
        }
    }

    boolean z(RequestBody requestBody) {
        return requestBody instanceof d ? !((d) requestBody).a() : requestBody == null || !requestBody.isOneShot();
    }

    public a(int i2, String str, String str2, ProxySelector proxySelector, boolean z, long j) {
        this.d = ServerType.TYPE_COMMON;
        e y = y(str, str2, null, null);
        if (i2 == ServerType.TYPE_NEXTCLOUD) {
            y.c();
        }
        this.d = i2;
        OkHttpClient.Builder j2 = j(proxySelector, y, z, j);
        this.b = j2;
        this.a = j2.build();
    }

    class b implements X509TrustManager {
        b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (a.this.c) {
                return;
            }
            try {
                x509CertificateArr[0].checkValidity();
            } catch (Exception unused) {
                throw new CertificateException("Certificate not valid or trusted.");
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }
}

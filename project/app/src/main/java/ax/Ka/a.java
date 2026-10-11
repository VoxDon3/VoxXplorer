/*
 * Decompiled with CFR 0.152.
 */
package ax.Ka;

import android.os.Build;
import ax.Ia.c;
import ax.Ka.b;
import ax.Na.f;
import ax.Na.g;
import ax.Na.h;
import ax.xc.C;
import ax.xc.p;
import com.socialnmobile.dav.gson.Multistatus;
import com.socialnmobile.dav.gson.ServerType;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
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
import javax.net.ssl.SSLSession;
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
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class a
implements ax.Ia.a {
    private static final Logger e;
    private static Pattern f;
    private static final Charset g;
    private static final Charset h;
    private static final Charset i;
    protected OkHttpClient a;
    private OkHttpClient.Builder b;
    private boolean c;
    private int d = ServerType.TYPE_COMMON;

    static {
        Charset charset;
        e = Logger.getLogger(ax.Ia.a.class.getName());
        f = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        g = charset = Charset.forName("UTF-8");
        h = Charset.forName("ISO-8859-1");
        i = charset;
    }

    public a(int n8, String object, String string, ProxySelector proxySelector, boolean bl, long l8) {
        object = this.y((String)object, string, null, null);
        if (n8 == ServerType.TYPE_NEXTCLOUD) {
            ((e)object).c();
        }
        this.d = n8;
        this.b = object = this.j(proxySelector, (e)object, bl, l8);
        this.a = ((OkHttpClient.Builder)object).build();
    }

    public a(boolean bl, long l8) {
        OkHttpClient.Builder builder;
        this.b = builder = this.j(null, null, bl, l8);
        builder.followRedirects(false);
        this.b.followSslRedirects(false);
        this.a = this.b.build();
    }

    private e y(String string, String string2, String string3, String string4) {
        return new e(string, string2, string3, string4);
    }

    public List<c> A(String string, int n8, Set<QName> set) throws ax.Ja.a {
        return this.C(string, n8, this.g());
    }

    public List<c> B(String string, int n8, boolean bl) throws ax.Ja.a {
        if (bl) {
            return this.C(string, n8, this.f());
        }
        return this.A(string, n8, Collections.EMPTY_SET);
    }

    protected List<c> C(String object, int n8, String object2) throws ax.Ja.a {
        Object object3 = new f((String)object);
        object = n8 < 0 ? "infinity" : Integer.toString(n8);
        ((f)object3).i((String)object);
        ((h)object3).g((String)object2);
        object = this.k((h)object3, new ax.La.a());
        object2 = ((Multistatus)object).getResponse();
        if (object2 != null) {
            object = new ArrayList<c>(object2.size());
            object3 = object2.iterator();
            while (object3.hasNext()) {
                object2 = (com.socialnmobile.dav.gson.Response)object3.next();
                try {
                    c c8 = new c((com.socialnmobile.dav.gson.Response)object2);
                    object.add((c)c8);
                }
                catch (URISyntaxException uRISyntaxException) {
                    e.warning(String.format("Ignore resource with invalid URI %s", ((com.socialnmobile.dav.gson.Response)object2).getHref()));
                }
            }
            return object;
        }
        ax.Ha.c.h().f().d("INVALID MULTISTATUS RESPONSE!!!").g(((Multistatus)object).getResponseDescription()).h();
        throw new ax.Ja.a("Invalid multistaus response");
    }

    public <T> T D(String object, RequestBody requestBody, Headers headers, ax.La.c<T> c8) throws ax.Ja.a {
        object = new g((String)object);
        ((h)object).f(requestBody);
        ((h)object).a(headers);
        try {
            headers = this.k((h)object, c8);
        }
        catch (ax.Ja.a a8) {
            if (a8.b() == 417) {
                ((h)object).d("Expect");
                if (this.z(requestBody)) {
                    return this.k((h)object, c8);
                }
            }
            throw a8;
        }
        return (T)headers;
    }

    public void E(String string, RequestBody requestBody, String string2, boolean bl, Long l8) throws ax.Ja.a {
        Headers.Builder builder = new Headers.Builder();
        if (l8 != null && l8 > 0L) {
            int n8 = this.d;
            if (n8 != ServerType.TYPE_NEXTCLOUD && n8 != ServerType.TYPE_OWNCLOUD) {
                if (n8 == ServerType.TYPE_NGINX) {
                    builder.set("Date", new Date(l8));
                }
            } else {
                builder.add("X-OC-Mtime", String.valueOf(l8 / 1000L));
            }
        }
        if (string2 != null) {
            builder.add("Content-Type", string2);
        }
        if (bl) {
            builder.add("Expect", "100-continue");
        }
        this.F(string, requestBody, builder.build());
    }

    public void F(String string, RequestBody requestBody, Headers headers) throws ax.Ja.a {
        this.D(string, requestBody, headers, new ax.La.d());
    }

    public void G(boolean bl) {
        this.c = bl;
    }

    public void H() {
        this.b.protocols(Arrays.asList(Protocol.HTTP_1_1));
        this.a = this.b.build();
    }

    /*
     * WARNING - void declaration
     */
    public String f() throws ax.Ja.b {
        Throwable var1_4;
        try {
            Object object = DocumentBuilderFactory.newInstance();
            ((DocumentBuilderFactory)object).setNamespaceAware(true);
            Document document = ((DocumentBuilderFactory)object).newDocumentBuilder().newDocument();
            object = document.createElementNS("DAV:", "d:propfind");
            document.appendChild((Node)object);
            object.setAttribute("xmlns:d", "DAV:");
            object.appendChild(document.createElementNS("DAV:", "d:allprop"));
            object = ax.Oa.a.b(document);
            return object;
        }
        catch (TransformerException transformerException) {
        }
        catch (ParserConfigurationException parserConfigurationException) {
            // empty catch block
        }
        throw new ax.Ja.b((Throwable)var1_4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String g() throws ax.Ja.a {
        int n8;
        Element element;
        Object object;
        block7: {
            int n9;
            block6: {
                Throwable var3_4;
                try {
                    object = DocumentBuilderFactory.newInstance();
                    ((DocumentBuilderFactory)object).setNamespaceAware(true);
                    object = ((DocumentBuilderFactory)object).newDocumentBuilder().newDocument();
                    element = object.createElementNS("DAV:", "d:propfind");
                    element.setAttribute("xmlns:d", "DAV:");
                    n9 = this.d;
                    n8 = ServerType.TYPE_YANDEX;
                    if (n9 != n8) break block6;
                    element.setAttribute("xmlns:m", "urn:yandex:disk:meta");
                    break block7;
                }
                catch (TransformerException transformerException) {
                    throw new ax.Ja.b((Throwable)var3_4);
                }
                catch (ParserConfigurationException parserConfigurationException) {
                    throw new ax.Ja.b((Throwable)var3_4);
                }
            }
            if (n9 == ServerType.TYPE_NEXTCLOUD) {
                element.setAttribute("xmlns:nc", "http://nextcloud.org/ns");
            }
        }
        object.appendChild(element);
        Element element2 = object.createElementNS("DAV:", "d:prop");
        element.appendChild(element2);
        element2.appendChild(object.createElementNS("DAV:", "d:resourcetype"));
        element2.appendChild(object.createElementNS("DAV:", "d:displayname"));
        element2.appendChild(object.createElementNS("DAV:", "d:getcontentlength"));
        element2.appendChild(object.createElementNS("DAV:", "d:getlastmodified"));
        element2.appendChild(object.createElementNS("DAV:", "d:getetag"));
        element2.appendChild(object.createElementNS("DAV:", "d:getcontenttype"));
        n8 = this.d;
        if (n8 == ServerType.TYPE_YANDEX) {
            element2.appendChild(object.createElementNS("urn:yandex:disk:meta", "m:readonly"));
            element2.appendChild(object.createElementNS("urn:yandex:disk:meta", "m:visible"));
            element2.appendChild(object.createElementNS("urn:yandex:disk:meta", "m:hasthumbnail"));
            return ax.Oa.a.b((Document)object);
        } else {
            if (n8 != ServerType.TYPE_NEXTCLOUD) return ax.Oa.a.b((Document)object);
            element2.appendChild(object.createElementNS("http://nextcloud.org/ns", "nc:has-preview"));
        }
        return ax.Oa.a.b((Document)object);
    }

    @Override
    public void h(String string) throws ax.Ja.a {
        this.k(new ax.Na.b(string), new ax.La.d());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected OkHttpClient.Builder j(ProxySelector object, e x509TrustManager, boolean bl, long l8) {
        if (bl) {
            this.G(true);
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (x509TrustManager != null) {
            builder.authenticator((Authenticator)((Object)x509TrustManager));
        }
        if (object != null) {
            builder.proxySelector((ProxySelector)object);
        }
        if (l8 != 0L) {
            object = TimeUnit.MILLISECONDS;
            builder.connectTimeout(l8, (TimeUnit)((Object)object));
            builder.readTimeout(l8, (TimeUnit)((Object)object));
            builder.writeTimeout(l8, (TimeUnit)((Object)object));
        }
        builder.addInterceptor(new Interceptor(){
            final e a;
            final a b;
            {
                this.b = a8;
                this.a = e8;
            }

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Object object;
                Object object2 = chain.request();
                Object object3 = object = System.getProperty("http.agent");
                if (object == null) {
                    object3 = "DavClient-okhttp3/0.1.0";
                }
                object2 = ((Request)object2).newBuilder().header("User-Agent", (String)object3);
                object3 = this.a;
                if (object3 != null && ((e)object3).a() != null) {
                    ((Request.Builder)object2).header("Authorization", this.a.a());
                    object3 = ((Request.Builder)object2).build();
                } else {
                    object3 = this.a;
                    if (object3 != null && ((e)object3).b() != null) {
                        object3 = ((Request.Builder)object2).build();
                        object3 = this.a.b().a(null, (Request)object3);
                    } else {
                        object3 = null;
                    }
                }
                object = object3;
                if (object3 == null) {
                    object = ((Request.Builder)object2).build();
                }
                return chain.proceed((Request)object);
            }
        });
        if (!bl) return builder;
        try {
            x509TrustManager = new X509TrustManager(this){
                final a a;
                {
                    this.a = a8;
                }

                @Override
                public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) throws CertificateException {
                    if (!this.a.c) {
                        try {
                            x509CertificateArray[0].checkValidity();
                            return;
                        }
                        catch (Exception exception) {
                            throw new CertificateException("Certificate not valid or trusted.");
                        }
                    }
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            int n8 = Build.VERSION.SDK_INT;
            if (n8 <= 28) {
                try {
                    object = SSLContext.getInstance("TLSv1.3");
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    object = SSLContext.getInstance("TLSv1.2");
                }
            } else {
                object = SSLContext.getInstance("TLSv1.3");
            }
            SecureRandom secureRandom = new SecureRandom();
            ((SSLContext)object).init(null, new TrustManager[]{x509TrustManager}, secureRandom);
            builder.sslSocketFactory(((SSLContext)object).getSocketFactory(), x509TrustManager);
            object = new HostnameVerifier(this){
                final a a;
                {
                    this.a = a8;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public boolean verify(String string, SSLSession sSLSession) {
                    block3: {
                        try {
                            boolean bl;
                            InetAddress inetAddress;
                            if ((!string.contains(":") && !f.matcher(string).matches() || !(inetAddress = InetAddress.getByName(string)).isSiteLocalAddress() && !inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress()) && !(bl = this.a.c)) break block3;
                            return true;
                        }
                        catch (Exception exception) {
                            return OkHostnameVerifier.INSTANCE.verify(string, sSLSession);
                        }
                    }
                    return OkHostnameVerifier.INSTANCE.verify(string, sSLSession);
                }
            };
            builder.hostnameVerifier((HostnameVerifier)object);
            return builder;
        }
        catch (Exception exception) {
            return builder;
        }
    }

    protected <T> T k(h h8, ax.La.c<T> c8) throws ax.Ja.a {
        return this.l(h8, c8, false);
    }

    /*
     * WARNING - void declaration
     */
    protected <T> T l(h h8, ax.La.c<T> c8, boolean bl) throws ax.Ja.a {
        StreamResetException streamResetException2;
        block10: {
            Throwable var1_5;
            block9: {
                Throwable throwable2;
                block8: {
                    Object object;
                    block7: {
                        object = h8.b();
                        object = this.a.newCall((Request)object).execute();
                        if (c8 != null) break block7;
                        return (T)object;
                    }
                    try {
                        object = c8.a((Response)object);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        break block9;
                    }
                    catch (IOException iOException) {
                        break block9;
                    }
                    catch (StreamResetException streamResetException2) {
                        break block10;
                    }
                    return (T)object;
                }
                throw throwable2;
            }
            throw new ax.Ja.a((Throwable)var1_5);
        }
        ErrorCode errorCode = streamResetException2.errorCode;
        if (!(errorCode != ErrorCode.HTTP_1_1_REQUIRED && errorCode != ErrorCode.PROTOCOL_ERROR || bl)) {
            this.H();
            return this.l(h8, c8, true);
        }
        throw new ax.Ja.a(streamResetException2);
    }

    protected Response m(h h8) throws ax.Ja.a {
        return (Response)this.k(h8, null);
    }

    @Override
    public void n(String string) throws ax.Ja.a {
        this.k(new ax.Na.d(string), new ax.La.d());
    }

    @Override
    public void o(int n8) {
        this.d = n8;
    }

    @Override
    public void p(String string, InputStream inputStream, String string2, boolean bl, long l8, Long l9) throws ax.Ja.a {
        MediaType mediaType = string2 == null ? ax.Na.h.c : MediaType.parse(string2);
        this.E(string, new d(this, mediaType, inputStream, l8), string2, bl, l9);
    }

    @Override
    public void q(String object, String string, long l8, boolean bl) throws ax.Ja.a {
        object = new ax.Na.a((String)object, string, bl);
        if (l8 > 0L && this.d == ServerType.TYPE_NEXTCLOUD || this.d == ServerType.TYPE_OWNCLOUD) {
            ((h)object).e("X-OC-Mtime", String.valueOf(l8 / 1000L));
        }
        this.k((h)object, new ax.La.d());
    }

    @Override
    public void r(String string, String string2, boolean bl) throws ax.Ja.a {
        this.k(new ax.Na.e(string, string2, bl), new ax.La.d());
    }

    @Override
    public List<c> s(String string, int n8) throws ax.Ja.a {
        return this.B(string, n8, false);
    }

    @Override
    public int t(String string) throws ax.Ja.a {
        try {
            Object object = this.f();
            f f8 = new f(string);
            f8.i(Integer.toString(0));
            f8.g((String)object);
            object = new ax.La.b();
            int n8 = ((ServerType)this.k((h)f8, object)).serverType;
            return n8;
        }
        catch (ax.Ja.b b8) {
            e.warning("detect type parse failed try list");
            this.s(string, 0);
            return this.d;
        }
    }

    public ax.Ma.b v(String string) throws ax.Ja.a {
        return this.w(string, Collections.EMPTY_MAP);
    }

    public ax.Ma.b w(String string, Map<String, String> object2) throws ax.Ja.a {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry entry : object2.entrySet()) {
            builder.add((String)entry.getKey(), (String)entry.getValue());
        }
        return this.x(string, builder.build());
    }

    public ax.Ma.b x(String object, Headers object2) throws ax.Ja.a {
        object = new ax.Na.c((String)object);
        ((h)object).a((Headers)object2);
        object = this.m((h)object);
        object2 = new ax.La.d();
        try {
            ((ax.La.d)object2).c((Response)object);
            object2 = ((Response)object).body();
            ax.Ma.c c8 = new ax.Ma.c((Response)object);
            object2 = new ax.Ma.b(c8, ((ResponseBody)object2).contentLength());
            return object2;
        }
        catch (IOException iOException) {
            if (object != null) {
                ((Response)object).close();
            }
            throw new ax.Ja.a(iOException);
        }
    }

    boolean z(RequestBody requestBody) {
        if (requestBody instanceof d) {
            return ((d)requestBody).a() ^ true;
        }
        return requestBody == null || !requestBody.isOneShot();
    }

    class d
    extends RequestBody {
        MediaType a;
        InputStream b;
        long c;
        boolean d;
        final a e;

        d(a a8, MediaType mediaType, InputStream inputStream, long l8) {
            this.e = a8;
            this.a = mediaType;
            this.b = inputStream;
            this.c = l8;
            this.d = false;
        }

        boolean a() {
            return this.d;
        }

        @Override
        public long contentLength() {
            return this.c;
        }

        @Override
        public MediaType contentType() {
            return this.a;
        }

        @Override
        public boolean isOneShot() {
            return true;
        }

        @Override
        public void writeTo(ax.xc.f f8) throws IOException {
            if (!this.d) {
                C c8;
                this.d = true;
                C c9 = null;
                try {
                    c9 = c8 = p.k(this.b);
                }
                catch (Throwable throwable) {
                    Util.closeQuietly(c9);
                    throw throwable;
                }
                f8.M(c8);
                Util.closeQuietly(c8);
                return;
            }
            throw new IOException("RequestBody InputStream Repeated.");
        }
    }

    static class e
    implements Authenticator {
        ax.m4.b a;
        String b;
        String c;
        String d;
        String e;
        String f;

        e(String string, String string2, String string3, String string4) {
            this.c = string;
            this.d = string2;
            this.e = string3;
            this.f = string4;
        }

        public String a() {
            return this.b;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Request authenticate(Route object, Response response) throws IOException {
            List<String> list = response.headers().values("WWW-Authenticate");
            for (Object object2 : list) {
                if (((String)object2).toLowerCase().startsWith("basic")) {
                    object = ((String)object2).toLowerCase();
                    if (((String)object).contains("utf-8")) {
                        this.b = Credentials.basic(this.c, this.d, g);
                        break;
                    }
                    if (((String)object).contains("8859-1")) {
                        this.b = Credentials.basic(this.c, this.d, h);
                        break;
                    }
                    this.b = Credentials.basic(this.c, this.d, i);
                    break;
                }
                if (((String)object2).toLowerCase().startsWith("digest")) {
                    if (this.a != null) return this.a.authenticate((Route)object, response);
                    this.a = new ax.m4.b(new ax.m4.a(this.c, this.d));
                    return this.a.authenticate((Route)object, response);
                }
                if (((String)object2).equals("NTLM")) {
                    try {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("NTLM ");
                        b b8 = new b();
                        ((StringBuilder)object2).append(b8.generateType1Msg(null, null));
                        object2 = ((StringBuilder)object2).toString();
                        return response.request().newBuilder().header("Authorization", (String)object2).build();
                    }
                    catch (Exception exception) {
                        continue;
                    }
                }
                if (!((String)object2).startsWith("NTLM")) continue;
                {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("NTLM ");
                    b b9 = new b();
                    ((StringBuilder)object2).append(b9.generateType3Msg(this.c, this.d, this.e, "android-device", list.get(0).substring(5)));
                    object2 = ((StringBuilder)object2).toString();
                    return response.request().newBuilder().header("Authorization", (String)object2).build();
                }
            }
            if (this.b == null) {
                return null;
            }
            object = response.request().header("Authorization");
            if (!this.b.equals(object)) return response.request().newBuilder().header("Authorization", this.b).build();
            return null;
        }

        public ax.m4.b b() {
            return this.a;
        }

        public void c() {
            this.b = Credentials.basic(this.c, this.d, i);
        }
    }
}


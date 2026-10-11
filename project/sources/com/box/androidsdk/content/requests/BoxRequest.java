package com.box.androidsdk.content.requests;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import ax.E3.g;
import ax.E3.h;
import ax.I3.d;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BlockedIPErrorActivity;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxSharedLinkSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.utils.SdkUtils;
import j$.net.URLEncoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class BoxRequest<T extends BoxObject, R extends BoxRequest<T, R>> implements Serializable {
    transient a c0;
    private transient WeakReference<b> d0;
    Class<T> mClazz;
    private String mIfMatchEtag;
    private String mIfNoneMatchEtag;
    protected Methods mRequestMethod;
    protected String mRequestUrlString;
    protected BoxSession mSession;
    private String mStringBody;
    protected int mTimeout;
    protected transient ax.F3.b q;
    protected HashMap<String, String> mQueryMap = new HashMap<>();
    protected LinkedHashMap<String, Object> mBodyMap = new LinkedHashMap<>();
    protected LinkedHashMap<String, String> mHeaderMap = new LinkedHashMap<>();
    protected ContentTypes mContentType = ContentTypes.JSON;
    protected boolean mRequiresSocket = false;

    public enum ContentTypes {
        JSON("application/json"),
        URL_ENCODED("application/x-www-form-urlencoded"),
        JSON_PATCH("application/json-patch+json"),
        APPLICATION_OCTET_STREAM("application/octet-stream");

        private String mName;

        ContentTypes(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public enum Methods {
        GET,
        POST,
        PUT,
        DELETE,
        OPTIONS
    }

    public static class a<R extends BoxRequest> {
        protected R a;
        protected int b = 0;
        private int c = 0;

        public a(R r) {
            this.a = r;
        }

        private boolean a(com.box.androidsdk.content.requests.b bVar) {
            return bVar != null && bVar.f() == 401;
        }

        protected static int c(com.box.androidsdk.content.requests.b bVar, int i) {
            String headerField = bVar.e().getHeaderField("Retry-After");
            if (!SdkUtils.k(headerField)) {
                try {
                    i = Integer.parseInt(headerField);
                } catch (NumberFormatException unused) {
                }
                if (i <= 0) {
                    i = 1;
                }
            }
            return i * 1000;
        }

        private boolean d(String str) {
            String str2;
            String[] split = str.split("=");
            return split.length == 2 && (str2 = split[0]) != null && split[1] != null && "error".equalsIgnoreCase(str2.trim()) && "invalid_token".equalsIgnoreCase(split[1].replace("\"", HttpUrl.FRAGMENT_ENCODE_SET).trim());
        }

        private boolean f(com.box.androidsdk.content.requests.b bVar) {
            if (bVar == null || 401 != bVar.f()) {
                return false;
            }
            String headerField = bVar.a.getHeaderField("WWW-Authenticate");
            if (!SdkUtils.l(headerField)) {
                for (String str : headerField.split(",")) {
                    if (d(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        protected void b(com.box.androidsdk.content.requests.b bVar) throws BoxException {
            try {
                bVar.e().disconnect();
            } catch (Exception e) {
                ax.H3.b.c("Interrupt disconnect", e);
            }
            throw new BoxException("Thread interrupted request cancelled ", new InterruptedException());
        }

        public boolean e(com.box.androidsdk.content.requests.b bVar) {
            int f = bVar.f();
            return (f >= 200 && f < 300) || f == 429;
        }

        public boolean g(BoxRequest boxRequest, com.box.androidsdk.content.requests.b bVar, BoxException boxException) throws BoxException.RefreshFailure {
            BoxException.ErrorType c;
            BoxSession l = boxRequest.l();
            if (f(bVar)) {
                try {
                    BoxResponse boxResponse = l.J().get();
                    if (boxResponse.c()) {
                        return true;
                    }
                    if (boxResponse.a() == null || !(boxResponse.a() instanceof BoxException.RefreshFailure)) {
                        return false;
                    }
                    throw ((BoxException.RefreshFailure) boxResponse.a());
                } catch (InterruptedException e) {
                    ax.H3.b.b("oauthRefresh", "Interrupted Exception", e);
                } catch (ExecutionException e2) {
                    ax.H3.b.b("oauthRefresh", "Interrupted Exception", e2);
                }
            } else if (a(bVar)) {
                BoxException.ErrorType c2 = boxException.c();
                if (!l.V()) {
                    Context q = l.q();
                    if (c2 == BoxException.ErrorType.IP_BLOCKED || c2 == BoxException.ErrorType.LOCATION_BLOCKED) {
                        Intent intent = new Intent(l.q(), (Class<?>) BlockedIPErrorActivity.class);
                        intent.addFlags(268435456);
                        q.startActivity(intent);
                        return false;
                    }
                    if (c2 == BoxException.ErrorType.TERMS_OF_SERVICE_REQUIRED) {
                        SdkUtils.t(q, d.q, 1);
                    }
                    try {
                        if (this.c <= 4) {
                            BoxResponse boxResponse2 = l.J().get();
                            if (boxResponse2.c()) {
                                this.c++;
                                return true;
                            }
                            if (boxResponse2.a() == null || !(boxResponse2.a() instanceof BoxException.RefreshFailure)) {
                                return false;
                            }
                            throw ((BoxException.RefreshFailure) boxResponse2.a());
                        }
                        String str = " Exceeded max refresh retries for " + boxRequest.getClass().getName() + " response code" + boxException.e() + " response " + bVar;
                        if (boxException.b() != null) {
                            str = str + boxException.b().A();
                        }
                        ax.H3.b.f("authFailed", str, boxException);
                        return false;
                    } catch (InterruptedException e3) {
                        ax.H3.b.b("oauthRefresh", "Interrupted Exception", e3);
                    } catch (ExecutionException e4) {
                        ax.H3.b.b("oauthRefresh", "Interrupted Exception", e4);
                    }
                }
            } else if (bVar != null && bVar.f() == 403 && ((c = boxException.c()) == BoxException.ErrorType.IP_BLOCKED || c == BoxException.ErrorType.LOCATION_BLOCKED)) {
                Context q2 = l.q();
                Intent intent2 = new Intent(l.q(), (Class<?>) BlockedIPErrorActivity.class);
                intent2.addFlags(268435456);
                q2.startActivity(intent2);
            }
            return false;
        }

        public <T extends BoxObject> T h(Class<T> cls, com.box.androidsdk.content.requests.b bVar) throws IllegalAccessException, InstantiationException, BoxException {
            if (bVar.f() == 429) {
                return (T) i(bVar);
            }
            if (Thread.currentThread().isInterrupted()) {
                b(bVar);
            }
            String d = bVar.d();
            T newInstance = cls.newInstance();
            if ((newInstance instanceof BoxJsonObject) && d.contains(ContentTypes.JSON.toString())) {
                ((BoxJsonObject) newInstance).k(bVar.g());
            }
            return newInstance;
        }

        protected <T extends BoxObject> T i(com.box.androidsdk.content.requests.b bVar) throws BoxException {
            int i = this.b;
            if (i >= 1) {
                throw new BoxException.RateLimitAttemptsExceeded("Max attempts exceeded", this.b, bVar);
            }
            this.b = i + 1;
            try {
                Thread.sleep(c(bVar, ((int) (Math.random() * 10.0d)) + 20));
                return (T) this.a.x();
            } catch (InterruptedException e) {
                throw new BoxException(e.getMessage(), e);
            }
        }
    }

    static class b extends SSLSocketFactory {
        public SSLSocketFactory a;
        private WeakReference<Socket> b;

        public b(SSLSocketFactory sSLSocketFactory) {
            this.a = sSLSocketFactory;
        }

        public Socket a() {
            WeakReference<Socket> weakReference = this.b;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        Socket b(Socket socket) {
            this.b = new WeakReference<>(socket);
            return socket;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return b(this.a.createSocket(socket, str, i, z));
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
            return b(this.a.createSocket(str, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
            return b(this.a.createSocket(str, i, inetAddress, i2));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return b(this.a.createSocket(inetAddress, i));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return b(this.a.createSocket(inetAddress, i, inetAddress2, i2));
        }
    }

    public static class c extends b {
        private final String[] c;

        public c() {
            super(BoxRequest.o());
            this.c = new String[]{"TLSv1.1", "TLSv1.2"};
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b
        public /* bridge */ /* synthetic */ Socket a() {
            return super.a();
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b
        Socket b(Socket socket) {
            if (socket instanceof SSLSocket) {
                ((SSLSocket) socket).setEnabledProtocols(this.c);
            }
            return super.b(socket);
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.SocketFactory
        public /* bridge */ /* synthetic */ Socket createSocket(String str, int i) throws IOException, UnknownHostException {
            return super.createSocket(str, i);
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.ssl.SSLSocketFactory
        public /* bridge */ /* synthetic */ String[] getDefaultCipherSuites() {
            return super.getDefaultCipherSuites();
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.ssl.SSLSocketFactory
        public /* bridge */ /* synthetic */ String[] getSupportedCipherSuites() {
            return super.getSupportedCipherSuites();
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.SocketFactory
        public /* bridge */ /* synthetic */ Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
            return super.createSocket(str, i, inetAddress, i2);
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.SocketFactory
        public /* bridge */ /* synthetic */ Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return super.createSocket(inetAddress, i);
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.SocketFactory
        public /* bridge */ /* synthetic */ Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return super.createSocket(inetAddress, i, inetAddress2, i2);
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest.b, javax.net.ssl.SSLSocketFactory
        public /* bridge */ /* synthetic */ Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return super.createSocket(socket, str, i, z);
        }
    }

    public BoxRequest(Class<T> cls, String str, BoxSession boxSession) {
        this.mClazz = cls;
        this.mRequestUrlString = str;
        this.mSession = boxSession;
        C(new a(this));
    }

    private void b(StringBuilder sb, HashMap<String, String> hashMap) {
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(hashMap.get(str));
        }
    }

    private boolean c(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (hashMap.size() != hashMap2.size()) {
            return false;
        }
        for (String str : hashMap.keySet()) {
            if (!hashMap2.containsKey(str) || !hashMap.get(str).equals(hashMap2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SSLSocketFactory o() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            ax.H3.b.c("Unable to create SSLContext", e);
            return null;
        }
    }

    private T p(a aVar, com.box.androidsdk.content.requests.b bVar, Exception exc) throws BoxException {
        if (!(exc instanceof BoxException)) {
            BoxException boxException = new BoxException("Couldn't connect to the Box API due to a network error.", exc);
            aVar.g(this, bVar, boxException);
            throw boxException;
        }
        BoxException boxException2 = (BoxException) exc;
        if (aVar.g(this, bVar, boxException2)) {
            return x();
        }
        throw boxException2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c0 = new a(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public R A(ContentTypes contentTypes) {
        this.mContentType = contentTypes;
        return this;
    }

    protected void B(com.box.androidsdk.content.requests.a aVar) {
        f();
        for (Map.Entry<String, String> entry : this.mHeaderMap.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
    }

    public R C(a aVar) {
        this.c0 = aVar;
        return this;
    }

    public h<T> D() {
        return new h<>(this.mClazz, this);
    }

    protected URL d() throws MalformedURLException, UnsupportedEncodingException {
        String j = j(this.mQueryMap);
        return TextUtils.isEmpty(j) ? new URL(this.mRequestUrlString) : new URL(String.format(Locale.ENGLISH, "%s?%s", this.mRequestUrlString, j));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BoxRequest)) {
            return false;
        }
        BoxRequest boxRequest = (BoxRequest) obj;
        return this.mRequestMethod == boxRequest.mRequestMethod && this.mRequestUrlString.equals(boxRequest.mRequestUrlString) && c(this.mHeaderMap, boxRequest.mHeaderMap) && c(this.mQueryMap, boxRequest.mQueryMap);
    }

    protected void f() {
        this.mHeaderMap.clear();
        BoxAuthentication.BoxAuthenticationInfo r = this.mSession.r();
        String C = r == null ? null : r.C();
        if (!SdkUtils.l(C)) {
            this.mHeaderMap.put("Authorization", String.format(Locale.ENGLISH, "Bearer %s", C));
        }
        this.mHeaderMap.put("User-Agent", this.mSession.E());
        this.mHeaderMap.put("Accept-Encoding", "gzip");
        this.mHeaderMap.put("Accept-Charset", "utf-8");
        ContentTypes contentTypes = this.mContentType;
        if (contentTypes != null) {
            this.mHeaderMap.put("Content-Type", contentTypes.toString());
        }
        String str = this.mIfMatchEtag;
        if (str != null) {
            this.mHeaderMap.put("If-Match", str);
        }
        String str2 = this.mIfNoneMatchEtag;
        if (str2 != null) {
            this.mHeaderMap.put("If-None-Match", str2);
        }
        BoxSession boxSession = this.mSession;
        if (boxSession instanceof BoxSharedLinkSession) {
            BoxSharedLinkSession boxSharedLinkSession = (BoxSharedLinkSession) boxSession;
            if (TextUtils.isEmpty(boxSharedLinkSession.Y())) {
                return;
            }
            Locale locale = Locale.ENGLISH;
            String format = String.format(locale, "shared_link=%s", boxSharedLinkSession.Y());
            if (!TextUtils.isEmpty(boxSharedLinkSession.X())) {
                format = format + String.format(locale, "&shared_link_password=%s", boxSharedLinkSession.X());
            }
            this.mHeaderMap.put("BoxApi", format);
        }
    }

    public int hashCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mRequestMethod);
        sb.append(this.mRequestUrlString);
        b(sb, this.mHeaderMap);
        b(sb, this.mQueryMap);
        return sb.toString().hashCode();
    }

    protected com.box.androidsdk.content.requests.a i() throws IOException, BoxException {
        com.box.androidsdk.content.requests.a aVar = new com.box.androidsdk.content.requests.a(d(), this.mRequestMethod, this.q);
        B(aVar);
        z(aVar);
        return aVar;
    }

    protected String j(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        String str = "%s=%s";
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(String.format(Locale.ENGLISH, str, URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8")));
            if (z) {
                str = "&" + str;
                z = false;
            }
        }
        return sb.toString();
    }

    public a k() {
        return this.c0;
    }

    public BoxSession l() {
        return this.mSession;
    }

    protected Socket m() {
        WeakReference<b> weakReference = this.d0;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.d0.get().a();
    }

    public String n() throws UnsupportedEncodingException {
        String str = this.mStringBody;
        if (str != null) {
            return str;
        }
        ContentTypes contentTypes = this.mContentType;
        if (contentTypes != null) {
            int ordinal = contentTypes.ordinal();
            if (ordinal == 0) {
                ax.O4.d dVar = new ax.O4.d();
                Iterator<Map.Entry<String, Object>> it = this.mBodyMap.entrySet().iterator();
                while (it.hasNext()) {
                    v(dVar, it.next());
                }
                this.mStringBody = dVar.toString();
            } else if (ordinal == 1) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : this.mBodyMap.entrySet()) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
                this.mStringBody = j(hashMap);
            } else if (ordinal == 2) {
                this.mStringBody = ((ax.G3.a) this.mBodyMap.get("json_object")).h();
            }
        }
        return this.mStringBody;
    }

    protected void q(BoxResponse<T> boxResponse) throws BoxException {
        g.a();
    }

    protected void r(com.box.androidsdk.content.requests.b bVar) throws BoxException {
        try {
            s();
            ax.H3.b.d("BoxContentSdk", String.format(Locale.ENGLISH, "Response (%s):  %s", Integer.valueOf(bVar.f()), bVar.g()));
        } catch (Exception e) {
            ax.H3.b.c("logDebug", e);
        }
    }

    protected void s() {
        String str;
        try {
            str = d().toString();
        } catch (UnsupportedEncodingException | MalformedURLException unused) {
            str = null;
        }
        Locale locale = Locale.ENGLISH;
        ax.H3.b.d("BoxContentSdk", String.format(locale, "Request (%s):  %s", this.mRequestMethod, str));
        ax.H3.b.e("BoxContentSdk", "Request Header", this.mHeaderMap);
        ContentTypes contentTypes = this.mContentType;
        if (contentTypes != null) {
            int ordinal = contentTypes.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : this.mBodyMap.entrySet()) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                    ax.H3.b.e("BoxContentSdk", "Request Form Data", hashMap);
                    return;
                }
                if (ordinal != 2) {
                    return;
                }
            }
            if (SdkUtils.k(this.mStringBody)) {
                return;
            }
            ax.H3.b.d("BoxContentSdk", String.format(locale, "Request JSON:  %s", this.mStringBody));
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:48:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected T t() throws com.box.androidsdk.content.BoxException {
        /*
            r6 = this;
            com.box.androidsdk.content.requests.BoxRequest$a r0 = r6.k()
            r1 = 0
            com.box.androidsdk.content.requests.a r2 = r6.i()     // Catch: java.lang.Throwable -> L68 com.box.androidsdk.content.BoxException -> L6a java.lang.IllegalAccessException -> L6d java.lang.InstantiationException -> L70 java.io.IOException -> L73
            java.net.HttpURLConnection r3 = r2.b()     // Catch: java.lang.Throwable -> L68 com.box.androidsdk.content.BoxException -> L6a java.lang.IllegalAccessException -> L6d java.lang.InstantiationException -> L70 java.io.IOException -> L73
            boolean r4 = r6.mRequiresSocket     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            if (r4 == 0) goto L3b
            boolean r4 = r3 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            if (r4 == 0) goto L3b
            r4 = r3
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            javax.net.ssl.SSLSocketFactory r4 = r4.getSSLSocketFactory()     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            com.box.androidsdk.content.requests.BoxRequest$b r5 = new com.box.androidsdk.content.requests.BoxRequest$b     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r6.d0 = r4     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r4 = r3
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r4.setSSLSocketFactory(r5)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            goto L3b
        L2f:
            r0 = move-exception
            r1 = r3
            goto L9e
        L33:
            r2 = move-exception
            goto L76
        L35:
            r2 = move-exception
            goto L80
        L37:
            r2 = move-exception
            goto L8a
        L39:
            r2 = move-exception
            goto L94
        L3b:
            int r4 = r6.mTimeout     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            if (r4 <= 0) goto L47
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            int r4 = r6.mTimeout     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r3.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
        L47:
            com.box.androidsdk.content.requests.b r1 = r6.y(r2, r3)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            r6.r(r1)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            boolean r2 = r0.e(r1)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            if (r2 == 0) goto L60
            java.lang.Class<T extends com.box.androidsdk.content.models.BoxObject> r2 = r6.mClazz     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            com.box.androidsdk.content.models.BoxObject r0 = r0.h(r2, r1)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            if (r3 == 0) goto L5f
            r3.disconnect()
        L5f:
            return r0
        L60:
            com.box.androidsdk.content.BoxException r2 = new com.box.androidsdk.content.BoxException     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            java.lang.String r4 = "An error occurred while sending the request"
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
            throw r2     // Catch: java.lang.Throwable -> L2f com.box.androidsdk.content.BoxException -> L33 java.lang.IllegalAccessException -> L35 java.lang.InstantiationException -> L37 java.io.IOException -> L39
        L68:
            r0 = move-exception
            goto L9e
        L6a:
            r2 = move-exception
            r3 = r1
            goto L76
        L6d:
            r2 = move-exception
            r3 = r1
            goto L80
        L70:
            r2 = move-exception
            r3 = r1
            goto L8a
        L73:
            r2 = move-exception
            r3 = r1
            goto L94
        L76:
            com.box.androidsdk.content.models.BoxObject r0 = r6.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L7f
            r3.disconnect()
        L7f:
            return r0
        L80:
            com.box.androidsdk.content.models.BoxObject r0 = r6.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L89
            r3.disconnect()
        L89:
            return r0
        L8a:
            com.box.androidsdk.content.models.BoxObject r0 = r6.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L93
            r3.disconnect()
        L93:
            return r0
        L94:
            com.box.androidsdk.content.models.BoxObject r0 = r6.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L9d
            r3.disconnect()
        L9d:
            return r0
        L9e:
            if (r1 == 0) goto La3
            r1.disconnect()
        La3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.box.androidsdk.content.requests.BoxRequest.t():com.box.androidsdk.content.models.BoxObject");
    }

    protected void u(BoxResponse<T> boxResponse) throws BoxException {
    }

    protected void v(ax.O4.d dVar, Map.Entry<String, Object> entry) {
        Object value = entry.getValue();
        if (value instanceof BoxJsonObject) {
            dVar.B(entry.getKey(), w(value));
            return;
        }
        if (value instanceof Double) {
            dVar.C(entry.getKey(), Double.toString(((Double) value).doubleValue()));
            return;
        }
        if ((value instanceof Enum) || (value instanceof Boolean)) {
            dVar.C(entry.getKey(), value.toString());
            return;
        }
        if (value instanceof ax.O4.a) {
            dVar.B(entry.getKey(), (ax.O4.a) value);
            return;
        }
        if (value instanceof Long) {
            dVar.B(entry.getKey(), ax.O4.g.x(((Long) value).longValue()));
            return;
        }
        if (value instanceof Integer) {
            dVar.B(entry.getKey(), ax.O4.g.w(((Integer) value).intValue()));
            return;
        }
        if (value instanceof Float) {
            dVar.B(entry.getKey(), ax.O4.g.u(((Float) value).floatValue()));
            return;
        }
        if (value instanceof String) {
            dVar.C(entry.getKey(), (String) value);
            return;
        }
        ax.H3.b.c("Unable to parse value " + value, new RuntimeException("Invalid value"));
    }

    protected ax.O4.g w(Object obj) {
        return ax.O4.g.t(((BoxJsonObject) obj).A());
    }

    public final T x() throws BoxException {
        Pattern compile = Pattern.compile(".*\\/\\.+.*");
        String str = this.mRequestUrlString;
        if (str != null && compile.matcher(str).matches()) {
            throw new BoxException("An invalid path parameter passed. Relative path parameters cannot be passed.");
        }
        T t = null;
        try {
            e = null;
            t = t();
        } catch (Exception e) {
            e = e;
        }
        u(new BoxResponse<>(t, e, this));
        if (e == null) {
            return t;
        }
        if (e instanceof BoxException) {
            throw ((BoxException) e);
        }
        throw new BoxException("unexpected exception ", e);
    }

    protected com.box.androidsdk.content.requests.b y(com.box.androidsdk.content.requests.a aVar, HttpURLConnection httpURLConnection) throws IOException, BoxException {
        com.box.androidsdk.content.requests.b bVar = new com.box.androidsdk.content.requests.b(httpURLConnection);
        bVar.i();
        return bVar;
    }

    protected void z(com.box.androidsdk.content.requests.a aVar) throws IOException {
        if (this.mBodyMap.isEmpty()) {
            return;
        }
        aVar.c(new ByteArrayInputStream(n().getBytes("UTF-8")));
    }
}

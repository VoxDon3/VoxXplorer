/*
 * Decompiled with CFR 0.152.
 */
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
import com.box.androidsdk.content.requests.BoxResponse;
import com.box.androidsdk.content.utils.SdkUtils;
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
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public abstract class BoxRequest<T extends BoxObject, R extends BoxRequest<T, R>>
implements Serializable {
    transient a c0;
    private transient WeakReference<b> d0;
    protected LinkedHashMap<String, Object> mBodyMap;
    Class<T> mClazz;
    protected ContentTypes mContentType;
    protected LinkedHashMap<String, String> mHeaderMap;
    private String mIfMatchEtag;
    private String mIfNoneMatchEtag;
    protected HashMap<String, String> mQueryMap = new HashMap();
    protected Methods mRequestMethod;
    protected String mRequestUrlString;
    protected boolean mRequiresSocket = false;
    protected BoxSession mSession;
    private String mStringBody;
    protected int mTimeout;
    protected transient ax.F3.b q;

    public BoxRequest(Class<T> clazz, String string, BoxSession boxSession) {
        this.mBodyMap = new LinkedHashMap();
        this.mHeaderMap = new LinkedHashMap();
        this.mContentType = ContentTypes.q;
        this.mClazz = clazz;
        this.mRequestUrlString = string;
        this.mSession = boxSession;
        this.C(new a<BoxRequest>(this));
    }

    private void b(StringBuilder stringBuilder, HashMap<String, String> hashMap) {
        for (String string : hashMap.keySet()) {
            stringBuilder.append(string);
            stringBuilder.append(hashMap.get(string));
        }
    }

    private boolean c(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (hashMap.size() != hashMap2.size()) {
            return false;
        }
        for (String string : hashMap.keySet()) {
            if (!hashMap2.containsKey(string)) {
                return false;
            }
            if (hashMap.get(string).equals(hashMap2.get(string))) continue;
            return false;
        }
        return true;
    }

    private static SSLSocketFactory o() {
        try {
            Object object = SSLContext.getInstance("TLS");
            ((SSLContext)object).init(null, null, null);
            object = ((SSLContext)object).getSocketFactory();
            return object;
        }
        catch (Exception exception) {
            ax.H3.b.c("Unable to create SSLContext", exception);
            return null;
        }
    }

    private T p(a a8, com.box.androidsdk.content.requests.b b8, Exception exception) throws BoxException {
        if (exception instanceof BoxException) {
            if (a8.g(this, b8, (BoxException)(exception = (BoxException)exception))) {
                return this.x();
            }
            throw exception;
        }
        exception = new BoxException("Couldn't connect to the Box API due to a network error.", exception);
        a8.g(this, b8, (BoxException)exception);
        throw exception;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.c0 = new a<BoxRequest>(this);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public R A(ContentTypes contentTypes) {
        this.mContentType = contentTypes;
        return (R)this;
    }

    protected void B(com.box.androidsdk.content.requests.a a8) {
        this.f();
        for (Map.Entry<String, String> entry : this.mHeaderMap.entrySet()) {
            a8.a(entry.getKey(), entry.getValue());
        }
    }

    public R C(a a8) {
        this.c0 = a8;
        return (R)this;
    }

    public h<T> D() {
        return new h<T>(this.mClazz, this);
    }

    protected URL d() throws MalformedURLException, UnsupportedEncodingException {
        String string = this.j(this.mQueryMap);
        if (TextUtils.isEmpty((CharSequence)string)) {
            return new URL(this.mRequestUrlString);
        }
        return new URL(String.format(Locale.ENGLISH, "%s?%s", this.mRequestUrlString, string));
    }

    public boolean equals(Object object) {
        if (!(object instanceof BoxRequest)) {
            return false;
        }
        object = (BoxRequest)object;
        return this.mRequestMethod == ((BoxRequest)object).mRequestMethod && this.mRequestUrlString.equals(((BoxRequest)object).mRequestUrlString) && this.c(this.mHeaderMap, ((BoxRequest)object).mHeaderMap) && this.c(this.mQueryMap, ((BoxRequest)object).mQueryMap);
    }

    protected void f() {
        BoxSharedLinkSession boxSharedLinkSession;
        this.mHeaderMap.clear();
        Object object = this.mSession.r();
        object = object == null ? null : ((BoxAuthentication.BoxAuthenticationInfo)object).C();
        if (!SdkUtils.l((String)object)) {
            ((AbstractMap)this.mHeaderMap).put("Authorization", String.format(Locale.ENGLISH, "Bearer %s", object));
        }
        ((AbstractMap)this.mHeaderMap).put("User-Agent", this.mSession.E());
        ((AbstractMap)this.mHeaderMap).put("Accept-Encoding", "gzip");
        ((AbstractMap)this.mHeaderMap).put("Accept-Charset", "utf-8");
        object = this.mContentType;
        if (object != null) {
            ((AbstractMap)this.mHeaderMap).put("Content-Type", ((ContentTypes)((Object)object)).toString());
        }
        if ((object = this.mIfMatchEtag) != null) {
            ((AbstractMap)this.mHeaderMap).put("If-Match", (String)object);
        }
        if ((object = this.mIfNoneMatchEtag) != null) {
            ((AbstractMap)this.mHeaderMap).put("If-None-Match", (String)object);
        }
        if ((object = this.mSession) instanceof BoxSharedLinkSession && !TextUtils.isEmpty((CharSequence)(boxSharedLinkSession = (BoxSharedLinkSession)object).Y())) {
            Locale locale = Locale.ENGLISH;
            String string = String.format(locale, "shared_link=%s", boxSharedLinkSession.Y());
            object = string;
            if (!TextUtils.isEmpty((CharSequence)boxSharedLinkSession.X())) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(String.format(locale, "&shared_link_password=%s", boxSharedLinkSession.X()));
                object = ((StringBuilder)object).toString();
            }
            ((AbstractMap)this.mHeaderMap).put("BoxApi", (String)object);
        }
    }

    public int hashCode() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.mRequestMethod);
        stringBuilder.append(this.mRequestUrlString);
        this.b(stringBuilder, this.mHeaderMap);
        this.b(stringBuilder, this.mQueryMap);
        return stringBuilder.toString().hashCode();
    }

    protected com.box.androidsdk.content.requests.a i() throws IOException, BoxException {
        com.box.androidsdk.content.requests.a a8 = new com.box.androidsdk.content.requests.a(this.d(), this.mRequestMethod, this.q);
        this.B(a8);
        this.z(a8);
        return a8;
    }

    protected String j(Map<String, String> object) throws UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, String>> iterator = object.entrySet().iterator();
        object = "%s=%s";
        boolean bl = true;
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            stringBuilder.append(String.format(Locale.ENGLISH, (String)object, j.URLEncoder.encode((String)object2.getKey(), (String)"UTF-8"), j.URLEncoder.encode((String)object2.getValue(), (String)"UTF-8")));
            if (!bl) continue;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("&");
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            bl = false;
        }
        return stringBuilder.toString();
    }

    public a k() {
        return this.c0;
    }

    public BoxSession l() {
        return this.mSession;
    }

    protected Socket m() {
        WeakReference<b> weakReference = this.d0;
        if (weakReference != null && weakReference.get() != null) {
            return ((b)this.d0.get()).a();
        }
        return null;
    }

    public String n() throws UnsupportedEncodingException {
        Object object = this.mStringBody;
        if (object != null) {
            return object;
        }
        object = this.mContentType;
        if (object != null) {
            int n8 = ((Enum)object).ordinal();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        this.mStringBody = ((ax.G3.a)this.mBodyMap.get("json_object")).h();
                    }
                } else {
                    object = new HashMap();
                    for (Map.Entry<String, Object> entry : this.mBodyMap.entrySet()) {
                        ((HashMap)object).put(entry.getKey(), (String)entry.getValue());
                    }
                    this.mStringBody = this.j((Map<String, String>)object);
                }
            } else {
                object = new ax.O4.d();
                Iterator<Map.Entry<String, Object>> iterator = this.mBodyMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    this.v((ax.O4.d)object, iterator.next());
                }
                this.mStringBody = ((ax.O4.g)object).toString();
            }
        }
        return this.mStringBody;
    }

    protected void q(BoxResponse<T> boxResponse) throws BoxException {
        g.a();
    }

    protected void r(com.box.androidsdk.content.requests.b b8) throws BoxException {
        try {
            this.s();
            ax.H3.b.d("BoxContentSdk", String.format(Locale.ENGLISH, "Response (%s):  %s", b8.f(), b8.g()));
            return;
        }
        catch (Exception exception) {
            ax.H3.b.c("logDebug", exception);
            return;
        }
    }

    protected void s() {
        block4: {
            Locale object3;
            block5: {
                Object object2;
                block6: {
                    try {
                        object2 = this.d().toString();
                    }
                    catch (UnsupportedEncodingException | MalformedURLException iOException) {
                        object2 = null;
                    }
                    object3 = Locale.ENGLISH;
                    ax.H3.b.d("BoxContentSdk", String.format(object3, "Request (%s):  %s", new Object[]{this.mRequestMethod, object2}));
                    ax.H3.b.e("BoxContentSdk", "Request Header", this.mHeaderMap);
                    object2 = this.mContentType;
                    if (object2 == null) break block4;
                    int n8 = ((Enum)object2).ordinal();
                    if (n8 == 0) break block5;
                    if (n8 == 1) break block6;
                    if (n8 == 2) break block5;
                    break block4;
                }
                object2 = new HashMap();
                for (Map.Entry<String, Object> entry : this.mBodyMap.entrySet()) {
                    ((HashMap)object2).put(entry.getKey(), (String)entry.getValue());
                }
                ax.H3.b.e("BoxContentSdk", "Request Form Data", (Map<String, String>)object2);
                break block4;
            }
            if (!SdkUtils.k(this.mStringBody)) {
                ax.H3.b.d("BoxContentSdk", String.format(object3, "Request JSON:  %s", this.mStringBody));
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected T t() throws BoxException {
        Object object;
        Object object2;
        block24: {
            block31: {
                HttpURLConnection httpURLConnection;
                Object object3;
                a a8;
                block28: {
                    block30: {
                        Object object4;
                        block27: {
                            block29: {
                                Object object5;
                                block26: {
                                    T t8;
                                    Object object6;
                                    block25: {
                                        Object object7;
                                        block22: {
                                            block23: {
                                                a8 = this.k();
                                                Object object8 = null;
                                                object7 = null;
                                                object2 = null;
                                                object = null;
                                                object5 = null;
                                                object4 = null;
                                                object3 = null;
                                                object6 = null;
                                                Object var11_20 = null;
                                                com.box.androidsdk.content.requests.a a9 = this.i();
                                                httpURLConnection = a9.b();
                                                object = httpURLConnection;
                                                object6 = var11_20;
                                                object5 = object8;
                                                object4 = object7;
                                                object3 = object2;
                                                if (this.mRequiresSocket) {
                                                    object = httpURLConnection;
                                                    object6 = var11_20;
                                                    object5 = object8;
                                                    object4 = object7;
                                                    object3 = object2;
                                                    if (httpURLConnection instanceof HttpsURLConnection) {
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        WeakReference<b> weakReference = ((HttpsURLConnection)httpURLConnection).getSSLSocketFactory();
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        b b8 = new b((SSLSocketFactory)((Object)weakReference));
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        weakReference = new WeakReference<b>(b8);
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        this.d0 = weakReference;
                                                        object = httpURLConnection;
                                                        object6 = var11_20;
                                                        object5 = object8;
                                                        object4 = object7;
                                                        object3 = object2;
                                                        ((HttpsURLConnection)httpURLConnection).setSSLSocketFactory(b8);
                                                    }
                                                }
                                                object = httpURLConnection;
                                                object6 = var11_20;
                                                object5 = object8;
                                                object4 = object7;
                                                object3 = object2;
                                                int n8 = this.mTimeout;
                                                if (n8 > 0) {
                                                    object = httpURLConnection;
                                                    object6 = var11_20;
                                                    object5 = object8;
                                                    object4 = object7;
                                                    object3 = object2;
                                                    httpURLConnection.setConnectTimeout(n8);
                                                    object = httpURLConnection;
                                                    object6 = var11_20;
                                                    object5 = object8;
                                                    object4 = object7;
                                                    object3 = object2;
                                                    httpURLConnection.setReadTimeout(this.mTimeout);
                                                }
                                                object = httpURLConnection;
                                                object6 = var11_20;
                                                object5 = object8;
                                                object4 = object7;
                                                object3 = object2;
                                                object2 = this.y(a9, httpURLConnection);
                                                object = httpURLConnection;
                                                object6 = object2;
                                                object5 = object2;
                                                object4 = object2;
                                                object3 = object2;
                                                this.r((com.box.androidsdk.content.requests.b)object2);
                                                object = httpURLConnection;
                                                object6 = object2;
                                                object5 = object2;
                                                object4 = object2;
                                                object3 = object2;
                                                if (!a8.e((com.box.androidsdk.content.requests.b)object2)) break block22;
                                                object = httpURLConnection;
                                                object6 = object2;
                                                object5 = object2;
                                                object4 = object2;
                                                object3 = object2;
                                                object2 = a8.h(this.mClazz, (com.box.androidsdk.content.requests.b)object2);
                                                if (httpURLConnection == null) break block23;
                                                httpURLConnection.disconnect();
                                            }
                                            return (T)object2;
                                        }
                                        object = httpURLConnection;
                                        object6 = object2;
                                        object5 = object2;
                                        object4 = object2;
                                        object3 = object2;
                                        try {
                                            object = httpURLConnection;
                                            object6 = object2;
                                            object5 = object2;
                                            object4 = object2;
                                            object3 = object2;
                                            object7 = new BoxException("An error occurred while sending the request", (com.box.androidsdk.content.requests.b)object2);
                                            object = httpURLConnection;
                                            object6 = object2;
                                            object5 = object2;
                                            object4 = object2;
                                            object3 = object2;
                                            throw object7;
                                            catch (Throwable throwable) {
                                                object2 = object6;
                                                break block24;
                                            }
                                            catch (BoxException boxException) {
                                                httpURLConnection = null;
                                                object6 = object;
                                                break block25;
                                            }
                                            catch (IllegalAccessException illegalAccessException) {
                                                httpURLConnection = null;
                                                break block26;
                                            }
                                            catch (InstantiationException instantiationException) {
                                                httpURLConnection = null;
                                                break block27;
                                            }
                                            catch (IOException iOException) {
                                                httpURLConnection = null;
                                                break block28;
                                            }
                                        }
                                        catch (Throwable throwable) {
                                            object2 = object;
                                            object = throwable;
                                            break block24;
                                        }
                                        catch (BoxException boxException) {
                                            break block25;
                                        }
                                        catch (IllegalAccessException illegalAccessException) {
                                            break block26;
                                        }
                                        catch (InstantiationException instantiationException) {
                                            break block27;
                                        }
                                        catch (IOException iOException) {
                                            break block28;
                                        }
                                    }
                                    object = httpURLConnection;
                                    t8 = this.p(a8, (com.box.androidsdk.content.requests.b)object6, (Exception)t8);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    return t8;
                                }
                                object = httpURLConnection;
                                {
                                    object2 = this.p(a8, (com.box.androidsdk.content.requests.b)object5, (Exception)object2);
                                    if (httpURLConnection == null) break block29;
                                    httpURLConnection.disconnect();
                                }
                            }
                            return (T)object2;
                        }
                        object = httpURLConnection;
                        {
                            object2 = this.p(a8, (com.box.androidsdk.content.requests.b)object4, (Exception)object2);
                            if (httpURLConnection == null) break block30;
                            httpURLConnection.disconnect();
                        }
                    }
                    return (T)object2;
                }
                object = httpURLConnection;
                {
                    object2 = this.p(a8, (com.box.androidsdk.content.requests.b)object3, (Exception)object2);
                    if (httpURLConnection == null) break block31;
                    httpURLConnection.disconnect();
                }
            }
            return (T)object2;
        }
        if (object2 != null) {
            ((HttpURLConnection)object2).disconnect();
        }
        throw object;
    }

    protected void u(BoxResponse<T> boxResponse) throws BoxException {
    }

    protected void v(ax.O4.d serializable, Map.Entry<String, Object> entry) {
        Object object = entry.getValue();
        if (object instanceof BoxJsonObject) {
            ((ax.O4.d)serializable).B(entry.getKey(), this.w(object));
            return;
        }
        if (object instanceof Double) {
            ((ax.O4.d)serializable).C(entry.getKey(), Double.toString((Double)object));
            return;
        }
        if (!(object instanceof Enum) && !(object instanceof Boolean)) {
            if (object instanceof ax.O4.a) {
                ((ax.O4.d)serializable).B(entry.getKey(), (ax.O4.a)object);
                return;
            }
            if (object instanceof Long) {
                ((ax.O4.d)serializable).B(entry.getKey(), ax.O4.g.x((Long)object));
                return;
            }
            if (object instanceof Integer) {
                ((ax.O4.d)serializable).B(entry.getKey(), ax.O4.g.w((Integer)object));
                return;
            }
            if (object instanceof Float) {
                ((ax.O4.d)serializable).B(entry.getKey(), ax.O4.g.u(((Float)object).floatValue()));
                return;
            }
            if (object instanceof String) {
                ((ax.O4.d)serializable).C(entry.getKey(), (String)object);
                return;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Unable to parse value ");
            ((StringBuilder)serializable).append(object);
            ax.H3.b.c(((StringBuilder)serializable).toString(), new RuntimeException("Invalid value"));
            return;
        }
        ((ax.O4.d)serializable).C(entry.getKey(), object.toString());
    }

    protected ax.O4.g w(Object object) {
        return ax.O4.g.t(((BoxJsonObject)object).A());
    }

    public final T x() throws BoxException {
        Pattern pattern = Pattern.compile(".*\\/\\.+.*");
        String string = this.mRequestUrlString;
        if (string != null && pattern.matcher(string).matches()) {
            throw new BoxException("An invalid path parameter passed. Relative path parameters cannot be passed.");
        }
        pattern = null;
        try {
            T t8 = this.t();
            string = null;
            pattern = t8;
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.u(new BoxResponse<Pattern>(pattern, (Exception)((Object)string), this));
        if (string != null) {
            if (string instanceof BoxException) {
                throw (BoxException)((Object)string);
            }
            throw new BoxException("unexpected exception ", (Throwable)((Object)string));
        }
        return (T)pattern;
    }

    protected com.box.androidsdk.content.requests.b y(com.box.androidsdk.content.requests.a object, HttpURLConnection httpURLConnection) throws IOException, BoxException {
        object = new com.box.androidsdk.content.requests.b(httpURLConnection);
        ((com.box.androidsdk.content.requests.b)object).i();
        return object;
    }

    protected void z(com.box.androidsdk.content.requests.a a8) throws IOException {
        if (!((AbstractMap)this.mBodyMap).isEmpty()) {
            a8.c(new ByteArrayInputStream(this.n().getBytes("UTF-8")));
        }
    }

    public static final class ContentTypes
    extends Enum<ContentTypes> {
        public static final /* enum */ ContentTypes c0;
        public static final /* enum */ ContentTypes d0;
        public static final /* enum */ ContentTypes e0;
        private static final ContentTypes[] f0;
        public static final /* enum */ ContentTypes q;
        private String mName;

        static {
            q = new ContentTypes("application/json");
            c0 = new ContentTypes("application/x-www-form-urlencoded");
            d0 = new ContentTypes("application/json-patch+json");
            e0 = new ContentTypes("application/octet-stream");
            f0 = ContentTypes.d();
        }

        private ContentTypes(String string2) {
            this.mName = string2;
        }

        private static /* synthetic */ ContentTypes[] d() {
            return new ContentTypes[]{q, c0, d0, e0};
        }

        public static ContentTypes valueOf(String string) {
            return Enum.valueOf(ContentTypes.class, string);
        }

        public static ContentTypes[] values() {
            return (ContentTypes[])f0.clone();
        }

        public String toString() {
            return this.mName;
        }
    }

    public static final class Methods
    extends Enum<Methods> {
        public static final /* enum */ Methods c0;
        public static final /* enum */ Methods d0;
        public static final /* enum */ Methods e0;
        public static final /* enum */ Methods f0;
        private static final Methods[] g0;
        public static final /* enum */ Methods q;

        static {
            q = new Methods();
            c0 = new Methods();
            d0 = new Methods();
            e0 = new Methods();
            f0 = new Methods();
            g0 = Methods.d();
        }

        private static /* synthetic */ Methods[] d() {
            return new Methods[]{q, c0, d0, e0, f0};
        }

        public static Methods valueOf(String string) {
            return Enum.valueOf(Methods.class, string);
        }

        public static Methods[] values() {
            return (Methods[])g0.clone();
        }
    }

    public static class a<R extends BoxRequest> {
        protected R a;
        protected int b = 0;
        private int c = 0;

        public a(R r8) {
            this.a = r8;
        }

        private boolean a(com.box.androidsdk.content.requests.b b8) {
            if (b8 == null) {
                return false;
            }
            return b8.f() == 401;
        }

        protected static int c(com.box.androidsdk.content.requests.b object, int n8) {
            object = ((com.box.androidsdk.content.requests.b)object).e().getHeaderField("Retry-After");
            int n9 = n8;
            if (!SdkUtils.k((String)object)) {
                try {
                    n8 = n9 = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
                n9 = n8 > 0 ? n8 : 1;
            }
            return n9 * 1000;
        }

        private boolean d(String stringArray) {
            String string;
            return (stringArray = stringArray.split("=")).length == 2 && (string = stringArray[0]) != null && stringArray[1] != null && "error".equalsIgnoreCase(string.trim()) && "invalid_token".equalsIgnoreCase(stringArray[1].replace("\"", "").trim());
        }

        private boolean f(com.box.androidsdk.content.requests.b object) {
            if (object == null) {
                return false;
            }
            if (401 != object.f()) {
                return false;
            }
            object = object.a.getHeaderField("WWW-Authenticate");
            if (!SdkUtils.l((String)object)) {
                object = object.split(",");
                int n8 = ((String[])object).length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (!this.d(object[i8])) continue;
                    return true;
                }
            }
            return false;
        }

        protected void b(com.box.androidsdk.content.requests.b b8) throws BoxException {
            try {
                b8.e().disconnect();
            }
            catch (Exception exception) {
                ax.H3.b.c("Interrupt disconnect", exception);
            }
            throw new BoxException("Thread interrupted request cancelled ", new InterruptedException());
        }

        public boolean e(com.box.androidsdk.content.requests.b b8) {
            int n8 = b8.f();
            return n8 >= 200 && n8 < 300 || n8 == 429;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean g(BoxRequest object, com.box.androidsdk.content.requests.b object2, BoxException boxException) throws BoxException.RefreshFailure {
            Serializable serializable = object.l();
            if (this.f((com.box.androidsdk.content.requests.b)object2)) {
                InterruptedException interruptedException2;
                block13: {
                    try {
                        object = (BoxResponse)((BoxSession)serializable).J().get();
                        if (((BoxResponse)object).c()) {
                            return true;
                        }
                        if (((BoxResponse)object).a() == null) return false;
                        if (((BoxResponse)object).a() instanceof BoxException.RefreshFailure) throw (BoxException.RefreshFailure)((BoxResponse)object).a();
                        return false;
                    }
                    catch (ExecutionException executionException) {
                    }
                    catch (InterruptedException interruptedException2) {
                        break block13;
                    }
                    ax.H3.b.b("oauthRefresh", "Interrupted Exception", executionException);
                    return false;
                }
                ax.H3.b.b("oauthRefresh", "Interrupted Exception", interruptedException2);
                return false;
            }
            if (this.a((com.box.androidsdk.content.requests.b)object2)) {
                BoxException.ErrorType errorType = boxException.c();
                if (((BoxSession)serializable).V()) return false;
                Context context = ((BoxSession)serializable).q();
                if (errorType != BoxException.ErrorType.r0 && errorType != BoxException.ErrorType.q0) {
                    InterruptedException interruptedException3;
                    block17: {
                        ExecutionException executionException2;
                        block16: {
                            block14: {
                                block15: {
                                    if (errorType == BoxException.ErrorType.i0) {
                                        SdkUtils.t(context, d.q, 1);
                                    }
                                    try {
                                        if (this.c <= 4) break block14;
                                        serializable = new StringBuilder();
                                        ((StringBuilder)serializable).append(" Exceeded max refresh retries for ");
                                        ((StringBuilder)serializable).append(object.getClass().getName());
                                        ((StringBuilder)serializable).append(" response code");
                                        ((StringBuilder)serializable).append(boxException.e());
                                        ((StringBuilder)serializable).append(" response ");
                                        ((StringBuilder)serializable).append(object2);
                                        object = object2 = ((StringBuilder)serializable).toString();
                                        if (boxException.b() == null) break block15;
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append((String)object2);
                                        ((StringBuilder)object).append(boxException.b().A());
                                        object = ((StringBuilder)object).toString();
                                    }
                                    catch (ExecutionException executionException2) {
                                        break block16;
                                    }
                                    catch (InterruptedException interruptedException3) {
                                        break block17;
                                    }
                                }
                                ax.H3.b.f("authFailed", (String)object, boxException);
                                return false;
                            }
                            object = (BoxResponse)((BoxSession)serializable).J().get();
                            if (((BoxResponse)object).c()) {
                                ++this.c;
                                return true;
                            }
                            if (((BoxResponse)object).a() == null) return false;
                            if (((BoxResponse)object).a() instanceof BoxException.RefreshFailure) throw (BoxException.RefreshFailure)((BoxResponse)object).a();
                            return false;
                        }
                        ax.H3.b.b("oauthRefresh", "Interrupted Exception", executionException2);
                        return false;
                    }
                    ax.H3.b.b("oauthRefresh", "Interrupted Exception", interruptedException3);
                    return false;
                }
                object = new Intent(((BoxSession)serializable).q(), BlockedIPErrorActivity.class);
                object.addFlags(0x10000000);
                context.startActivity((Intent)object);
                return false;
            }
            if (object2 == null) return false;
            if (((com.box.androidsdk.content.requests.b)object2).f() != 403) return false;
            object = boxException.c();
            if (object != BoxException.ErrorType.r0) {
                if (object != BoxException.ErrorType.q0) return false;
            }
            object = ((BoxSession)serializable).q();
            object2 = new Intent(((BoxSession)serializable).q(), BlockedIPErrorActivity.class);
            object2.addFlags(0x10000000);
            object.startActivity((Intent)object2);
            return false;
        }

        public <T extends BoxObject> T h(Class<T> serializable, com.box.androidsdk.content.requests.b object) throws IllegalAccessException, InstantiationException, BoxException {
            if (((com.box.androidsdk.content.requests.b)object).f() == 429) {
                return this.i((com.box.androidsdk.content.requests.b)object);
            }
            if (Thread.currentThread().isInterrupted()) {
                this.b((com.box.androidsdk.content.requests.b)object);
            }
            String string = ((com.box.androidsdk.content.requests.b)object).d();
            if ((serializable = (BoxObject)serializable.newInstance()) instanceof BoxJsonObject && string.contains(ContentTypes.q.toString())) {
                object = ((com.box.androidsdk.content.requests.b)object).g();
                ((BoxJsonObject)serializable).k((String)object);
            }
            return (T)serializable;
        }

        protected <T extends BoxObject> T i(com.box.androidsdk.content.requests.b b8) throws BoxException {
            int n8 = this.b;
            if (n8 < 1) {
                this.b = n8 + 1;
                long l8 = com.box.androidsdk.content.requests.BoxRequest$a.c(b8, (int)(Math.random() * 10.0) + 20);
                try {
                    Thread.sleep(l8);
                }
                catch (InterruptedException interruptedException) {
                    throw new BoxException(interruptedException.getMessage(), interruptedException);
                }
                return ((BoxRequest)this.a).x();
            }
            throw new BoxException.RateLimitAttemptsExceeded("Max attempts exceeded", this.b, b8);
        }
    }

    static class b
    extends SSLSocketFactory {
        public SSLSocketFactory a;
        private WeakReference<Socket> b;

        public b(SSLSocketFactory sSLSocketFactory) {
            this.a = sSLSocketFactory;
        }

        public Socket a() {
            WeakReference<Socket> weakReference = this.b;
            if (weakReference != null) {
                return (Socket)weakReference.get();
            }
            return null;
        }

        Socket b(Socket socket) {
            this.b = new WeakReference<Socket>(socket);
            return socket;
        }

        @Override
        public Socket createSocket(String string, int n8) throws IOException, UnknownHostException {
            return this.b(this.a.createSocket(string, n8));
        }

        @Override
        public Socket createSocket(String string, int n8, InetAddress inetAddress, int n9) throws IOException, UnknownHostException {
            return this.b(this.a.createSocket(string, n8, inetAddress, n9));
        }

        @Override
        public Socket createSocket(InetAddress inetAddress, int n8) throws IOException {
            return this.b(this.a.createSocket(inetAddress, n8));
        }

        @Override
        public Socket createSocket(InetAddress inetAddress, int n8, InetAddress inetAddress2, int n9) throws IOException {
            return this.b(this.a.createSocket(inetAddress, n8, inetAddress2, n9));
        }

        @Override
        public Socket createSocket(Socket socket, String string, int n8, boolean bl) throws IOException {
            return this.b(this.a.createSocket(socket, string, n8, bl));
        }

        @Override
        public String[] getDefaultCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override
        public String[] getSupportedCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }
    }

    public static class c
    extends b {
        private final String[] c = new String[]{"TLSv1.1", "TLSv1.2"};

        public c() {
            super(BoxRequest.o());
        }

        @Override
        Socket b(Socket socket) {
            if (socket instanceof SSLSocket) {
                ((SSLSocket)socket).setEnabledProtocols(this.c);
            }
            return super.b(socket);
        }
    }
}


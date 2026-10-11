/*
 * Decompiled with CFR 0.152.
 */
package ax.m4;

import ax.n4.c;
import ax.n4.d;
import ax.n4.e;
import ax.n4.f;
import ax.n4.h;
import ax.n4.i;
import ax.n4.k;
import ax.n4.l;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.platform.Platform;

public class b
implements Authenticator {
    private static final char[] k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private AtomicReference<Map<String, String>> a = new AtomicReference();
    private Charset b;
    private final Random c;
    private final ax.m4.a d;
    private String e;
    private long f;
    private String g;
    private String h;
    private String i;
    private boolean j;

    public b(ax.m4.a a8) {
        this.d = a8;
        this.b = StandardCharsets.US_ASCII;
        this.c = new SecureRandom();
    }

    private Request b(Route object, Request request, Map<String, String> map) throws IOException {
        if (map.get("realm") == null) {
            return null;
        }
        object = map.get("nonce");
        if (object != null) {
            if (this.n(request, (String)object, "true".equalsIgnoreCase(map.get("stale")))) {
                Platform.get().log("Previous digest authentication with same nonce failed, returning null", 5, null);
                return null;
            }
            if (map.get("proxy-authenticate") != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(request.url().host());
                ((StringBuilder)object).append(':');
                ((StringBuilder)object).append(request.url().port());
                object = ((StringBuilder)object).toString();
                map.put("methodname", "CONNECT");
                map.put("uri", (String)object);
            } else {
                String string = request.method();
                object = this.q(request.url());
                map.put("methodname", string);
                map.put("uri", (String)object);
            }
            if (map.get("charset") == null) {
                map.put("charset", this.k(request));
            }
            object = this.e(this.d, request, map);
            return request.newBuilder().header(object.getName(), object.getValue()).build();
        }
        throw new IOException("missing nonce in challenge");
    }

    private void c(Headers headers, Map<String, String> map) {
        for (int i8 = 0; i8 < headers.size(); ++i8) {
            map.put(headers.name(i8), headers.value(i8));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private k e(ax.m4.a object, Request object2, Map<String, String> object3) throws a {
        synchronized (this) {
            Throwable throwable2;
            block25: {
                Object object4;
                block26: {
                    StringBuilder stringBuilder;
                    Object object5;
                    int n8;
                    Object object6;
                    String string;
                    ArrayList<Object> arrayList;
                    String string2;
                    Object object7;
                    Object object8;
                    Object object9;
                    block28: {
                        block29: {
                            Serializable serializable;
                            block27: {
                                block24: {
                                    try {
                                        object9 = object3.get("uri");
                                        object8 = object3.get("realm");
                                        object7 = object3.get("nonce");
                                        string2 = object3.get("opaque");
                                        arrayList = object3.get("methodname");
                                        object4 = object3.get("algorithm");
                                        string = object4;
                                        if (object4 != null) break block24;
                                        string = "MD5";
                                    }
                                    catch (Throwable throwable2) {
                                        break block25;
                                    }
                                }
                                serializable = new HashSet(8);
                                object4 = object3.get("qop");
                                if (object4 != null) {
                                    object6 = new StringTokenizer((String)object4, ",");
                                    while (((StringTokenizer)object6).hasMoreTokens()) {
                                        serializable.add(((StringTokenizer)object6).nextToken().trim().toLowerCase(Locale.US));
                                    }
                                    n8 = ((Request)object2).body() != null && serializable.contains("auth-int") ? 1 : (serializable.contains("auth") ? 2 : -1);
                                } else {
                                    n8 = 0;
                                }
                                if (n8 == -1) break block26;
                                object3 = object4 = object3.get("charset");
                                if (object4 == null) {
                                    object3 = "ISO-8859-1";
                                }
                                object4 = "MD5-sess".equalsIgnoreCase(string) ? "MD5" : string;
                                object5 = this.f((String)object4);
                                object6 = ((ax.m4.a)object).b();
                                object = ((ax.m4.a)object).a();
                                if (((String)object7).equals(this.e)) {
                                    ++this.f;
                                } else {
                                    this.f = 1L;
                                    this.g = null;
                                    this.e = object7;
                                }
                                stringBuilder = new StringBuilder(256);
                                object4 = new Formatter(stringBuilder, Locale.US);
                                ((Formatter)object4).format("%08x", this.f);
                                ((Formatter)object4).close();
                                object4 = stringBuilder.toString();
                                if (this.g == null) {
                                    this.g = this.d();
                                }
                                this.h = null;
                                this.i = null;
                                if ("MD5-sess".equalsIgnoreCase(string)) {
                                    stringBuilder.setLength(0);
                                    stringBuilder.append((String)object6);
                                    stringBuilder.append(':');
                                    stringBuilder.append((String)object8);
                                    stringBuilder.append(':');
                                    stringBuilder.append((String)object);
                                    object = this.g(((MessageDigest)object5).digest(this.j(stringBuilder.toString(), (String)object3)));
                                    stringBuilder.setLength(0);
                                    stringBuilder.append((String)object);
                                    stringBuilder.append(':');
                                    stringBuilder.append((String)object7);
                                    stringBuilder.append(':');
                                    stringBuilder.append(this.g);
                                    this.h = stringBuilder.toString();
                                } else {
                                    stringBuilder.setLength(0);
                                    stringBuilder.append((String)object6);
                                    stringBuilder.append(':');
                                    stringBuilder.append((String)object8);
                                    stringBuilder.append(':');
                                    stringBuilder.append((String)object);
                                    this.h = stringBuilder.toString();
                                }
                                object = this.g(((MessageDigest)object5).digest(this.j(this.h, (String)object3)));
                                if (n8 != 2) break block27;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append((String)((Object)arrayList));
                                ((StringBuilder)object2).append(':');
                                ((StringBuilder)object2).append((String)object9);
                                this.i = ((StringBuilder)object2).toString();
                                break block28;
                            }
                            if (n8 != 1) break block29;
                            if (((Request)object2).body() != null) {
                                if (!serializable.contains("auth")) {
                                    object = new a(this, "Qop auth-int cannot be used with a non-repeatable entity");
                                    throw object;
                                }
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append((String)((Object)arrayList));
                                ((StringBuilder)object2).append(':');
                                ((StringBuilder)object2).append((String)object9);
                                this.i = ((StringBuilder)object2).toString();
                                n8 = 2;
                                break block28;
                            } else {
                                object2 = new i((MessageDigest)object5);
                                try {
                                    ((i)object2).close();
                                    serializable = new StringBuilder();
                                    ((StringBuilder)serializable).append((String)((Object)arrayList));
                                }
                                catch (IOException iOException) {
                                    object2 = new a(this, "I/O error reading entity content", iOException);
                                    throw object2;
                                }
                                ((StringBuilder)serializable).append(':');
                                ((StringBuilder)serializable).append((String)object9);
                                ((StringBuilder)serializable).append(':');
                                ((StringBuilder)serializable).append(this.g(((i)object2).a()));
                                this.i = ((StringBuilder)serializable).toString();
                            }
                            break block28;
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append((String)((Object)arrayList));
                        ((StringBuilder)object2).append(':');
                        ((StringBuilder)object2).append((String)object9);
                        this.i = ((StringBuilder)object2).toString();
                    }
                    object2 = this.g(((MessageDigest)object5).digest(this.j(this.i, (String)object3)));
                    if (n8 == 0) {
                        stringBuilder.setLength(0);
                        stringBuilder.append((String)object);
                        stringBuilder.append(':');
                        stringBuilder.append((String)object7);
                        stringBuilder.append(':');
                        stringBuilder.append((String)object2);
                        object = stringBuilder.toString();
                    } else {
                        stringBuilder.setLength(0);
                        stringBuilder.append((String)object);
                        stringBuilder.append(':');
                        stringBuilder.append((String)object7);
                        stringBuilder.append(':');
                        stringBuilder.append((String)object4);
                        stringBuilder.append(':');
                        stringBuilder.append(this.g);
                        stringBuilder.append(':');
                        object = n8 == 1 ? "auth-int" : "auth";
                        stringBuilder.append((String)object);
                        stringBuilder.append(':');
                        stringBuilder.append((String)object2);
                        object = stringBuilder.toString();
                    }
                    object2 = this.g(((MessageDigest)object5).digest(this.i((String)object)));
                    object3 = new StringBuilder(128);
                    object = this.o() ? "Proxy-Authorization" : "Authorization";
                    ((StringBuilder)object3).append("Digest ");
                    arrayList = new ArrayList<Object>(20);
                    object5 = new e("username", (String)object6);
                    arrayList.add(object5);
                    object6 = new e("realm", (String)object8);
                    arrayList.add(object6);
                    object8 = new e("nonce", (String)object7);
                    arrayList.add(object8);
                    object7 = new e("uri", (String)object9);
                    arrayList.add(object7);
                    object9 = new e("response", (String)object2);
                    arrayList.add(object9);
                    if (n8 != 0) {
                        object2 = n8 == 1 ? "auth-int" : "auth";
                        object9 = new e("qop", (String)object2);
                        arrayList.add(object9);
                        object2 = new e("nc", (String)object4);
                        arrayList.add(object2);
                        object2 = new e("cnonce", this.g);
                        arrayList.add(object2);
                    }
                    object2 = new e("algorithm", string);
                    arrayList.add(object2);
                    if (string2 != null) {
                        object2 = new e("opaque", string2);
                        arrayList.add(object2);
                    }
                    n8 = 0;
                    while (n8 < arrayList.size()) {
                        object2 = (k)arrayList.get(n8);
                        if (n8 > 0) {
                            ((StringBuilder)object3).append(", ");
                        }
                        boolean bl = "nc".equals(string = object2.getName()) || "qop".equals(string) || "algorithm".equals(string);
                        ax.n4.c.a.b((StringBuilder)object3, (k)object2, bl ^ true);
                        ++n8;
                    }
                    return new e((String)object, ((StringBuilder)object3).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("None of the qop methods is supported: ");
                ((StringBuilder)object).append((String)object4);
                object2 = new a(this, ((StringBuilder)object).toString());
                throw object2;
            }
            throw throwable2;
        }
    }

    private MessageDigest f(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            return messageDigest;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported algorithm in HTTP Digest authentication: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString(), exception);
        }
    }

    private String g(byte[] byArray) {
        int n8 = byArray.length;
        char[] cArray = new char[n8 * 2];
        for (int i8 = 0; i8 < n8; ++i8) {
            byte by = byArray[i8];
            int n9 = i8 * 2;
            char[] cArray2 = k;
            cArray[n9] = cArray2[(by & 0xF0) >> 4];
            cArray[n9 + 1] = cArray2[by & 0xF];
        }
        return new String(cArray);
    }

    private String h(Headers iterable, String object) throws IOException {
        iterable = ((Headers)iterable).values((String)object);
        for (String string : iterable) {
            if (!string.startsWith("Digest")) continue;
            return string;
        }
        if (iterable.contains("OkHttp-Preemptive")) {
            return null;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("unsupported auth scheme: ");
        ((StringBuilder)object).append(iterable);
        throw new IOException(((StringBuilder)object).toString());
    }

    private byte[] j(String string, String object) {
        try {
            object = string.getBytes((String)object);
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    private String m(int n8) {
        if (n8 == 401) {
            this.r(false);
            return "WWW-Authenticate";
        }
        if (n8 == 407) {
            this.r(true);
            return "Proxy-Authenticate";
        }
        return "";
    }

    private boolean n(Request object, String string, boolean bl) {
        string = this.o() ? "Proxy-Authorization" : "Authorization";
        if ((object = ((Request)object).header(string)) != null && ((String)object).startsWith("Digest")) {
            return bl ^ true;
        }
        return false;
    }

    private String q(HttpUrl object) {
        String string = ((HttpUrl)object).encodedPath();
        String string2 = ((HttpUrl)object).encodedQuery();
        if (string2 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("?");
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        return string;
    }

    public Request a(Route route, Request request) throws IOException {
        j.ConcurrentHashMap concurrentHashMap = this.a.get();
        concurrentHashMap = concurrentHashMap == null ? new j.ConcurrentHashMap() : new j.ConcurrentHashMap((Map)concurrentHashMap);
        return this.b(route, request, (Map<String, String>)concurrentHashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Request authenticate(Route object, Response object2) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                String string;
                block5: {
                    try {
                        string = this.h(((Response)object2).headers(), this.m(((Response)object2).code()));
                        if (string != null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return null;
                }
                j.ConcurrentHashMap concurrentHashMap = new j.ConcurrentHashMap();
                this.p(string, 7, string.length() - 7, (Map<String, String>)concurrentHashMap);
                this.c(((Response)object2).headers(), (Map<String, String>)concurrentHashMap);
                this.a.set(java.util.DesugarCollections.unmodifiableMap((Map)concurrentHashMap));
                if (concurrentHashMap.get("nonce") != null) {
                    return this.b((Route)object, ((Response)object2).request(), (Map<String, String>)concurrentHashMap);
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("missing nonce in challenge header: ");
                ((StringBuilder)object2).append(string);
                object = new IOException(((StringBuilder)object2).toString());
                throw object;
            }
            throw throwable2;
        }
    }

    public String d() {
        byte[] byArray = new byte[8];
        this.c.nextBytes(byArray);
        return this.g(byArray);
    }

    public byte[] i(String string) {
        if (string != null) {
            return string.getBytes(StandardCharsets.US_ASCII);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    String k(Request object) {
        String string = ((Request)object).header("http.auth.credential-charset");
        object = string;
        if (string == null) {
            object = this.l().name();
        }
        return object;
    }

    public Charset l() {
        return this.b;
    }

    public boolean o() {
        return this.j;
    }

    /*
     * WARNING - void declaration
     */
    protected void p(String object2, int n8, int n9, Map<String, String> map) {
        int n10;
        int n11;
        d d8 = ax.n4.d.b;
        l l8 = new l(n11, ((String)object2).length());
        h[] hArray = new f(n10);
        hArray.a((String)object2);
        hArray = d8.d((f)hArray, l8);
        if (hArray.length != 0) {
            for (h h8 : hArray) {
                Object var4_6;
                var4_6.put(h8.getName(), h8.getValue());
            }
            return;
        }
        throw new IllegalArgumentException("Authentication challenge is empty");
    }

    public void r(boolean bl) {
        this.j = bl;
    }

    private class a
    extends IOException {
        final b q;

        public a(b b8, String string) {
            this.q = b8;
            super(string);
        }

        public a(b b8, String string, Exception exception) {
            this.q = b8;
            super(string, exception);
        }
    }
}


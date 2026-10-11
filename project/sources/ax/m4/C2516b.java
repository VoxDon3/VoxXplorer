package ax.m4;

import ax.n4.c;
import ax.n4.d;
import ax.n4.e;
import ax.n4.f;
import ax.n4.h;
import ax.n4.i;
import ax.n4.k;
import ax.n4.l;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.List;
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

/* renamed from: ax.m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2516b implements Authenticator {
    private static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private AtomicReference<Map<String, String>> a = new AtomicReference<>();
    private Charset b = StandardCharsets.US_ASCII;
    private final Random c = new SecureRandom();
    private final C2515a d;
    private String e;
    private long f;
    private String g;
    private String h;
    private String i;
    private boolean j;

    public C2516b(C2515a c2515a) {
        this.d = c2515a;
    }

    private Request b(Route route, Request request, Map<String, String> map) throws IOException {
        if (map.get("realm") == null) {
            return null;
        }
        String str = map.get("nonce");
        if (str == null) {
            throw new IOException("missing nonce in challenge");
        }
        if (n(request, str, "true".equalsIgnoreCase(map.get("stale")))) {
            Platform.get().log("Previous digest authentication with same nonce failed, returning null", 5, null);
            return null;
        }
        if (map.get("proxy-authenticate") != null) {
            String str2 = request.url().host() + ':' + request.url().port();
            map.put("methodname", "CONNECT");
            map.put("uri", str2);
        } else {
            String method = request.method();
            String q = q(request.url());
            map.put("methodname", method);
            map.put("uri", q);
        }
        if (map.get("charset") == null) {
            map.put("charset", k(request));
        }
        k e = e(this.d, request, map);
        return request.newBuilder().header(e.getName(), e.getValue()).build();
    }

    private void c(Headers headers, Map<String, String> map) {
        for (int i = 0; i < headers.size(); i++) {
            map.put(headers.name(i), headers.value(i));
        }
    }

    private synchronized k e(C2515a c2515a, Request request, Map<String, String> map) throws a {
        char c;
        String sb;
        StringBuilder sb2;
        String str;
        boolean z;
        try {
            String str2 = map.get("uri");
            String str3 = map.get("realm");
            String str4 = map.get("nonce");
            String str5 = map.get("opaque");
            String str6 = map.get("methodname");
            String str7 = map.get("algorithm");
            if (str7 == null) {
                str7 = "MD5";
            }
            HashSet hashSet = new HashSet(8);
            String str8 = map.get("qop");
            if (str8 != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str8, ",");
                while (stringTokenizer.hasMoreTokens()) {
                    hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.US));
                }
                c = (request.body() == null || !hashSet.contains("auth-int")) ? hashSet.contains("auth") ? (char) 2 : (char) 65535 : (char) 1;
            } else {
                c = 0;
            }
            if (c == 65535) {
                throw new a("None of the qop methods is supported: " + str8);
            }
            String str9 = map.get("charset");
            if (str9 == null) {
                str9 = "ISO-8859-1";
            }
            MessageDigest f = f("MD5-sess".equalsIgnoreCase(str7) ? "MD5" : str7);
            String b = c2515a.b();
            String a2 = c2515a.a();
            if (str4.equals(this.e)) {
                this.f++;
            } else {
                this.f = 1L;
                this.g = null;
                this.e = str4;
            }
            StringBuilder sb3 = new StringBuilder(256);
            Formatter formatter = new Formatter(sb3, Locale.US);
            formatter.format("%08x", Long.valueOf(this.f));
            formatter.close();
            String sb4 = sb3.toString();
            if (this.g == null) {
                this.g = d();
            }
            this.h = null;
            this.i = null;
            if ("MD5-sess".equalsIgnoreCase(str7)) {
                sb3.setLength(0);
                sb3.append(b);
                sb3.append(':');
                sb3.append(str3);
                sb3.append(':');
                sb3.append(a2);
                String g = g(f.digest(j(sb3.toString(), str9)));
                sb3.setLength(0);
                sb3.append(g);
                sb3.append(':');
                sb3.append(str4);
                sb3.append(':');
                sb3.append(this.g);
                this.h = sb3.toString();
            } else {
                sb3.setLength(0);
                sb3.append(b);
                sb3.append(':');
                sb3.append(str3);
                sb3.append(':');
                sb3.append(a2);
                this.h = sb3.toString();
            }
            String g2 = g(f.digest(j(this.h, str9)));
            if (c == 2) {
                this.i = str6 + ':' + str2;
            } else if (c != 1) {
                this.i = str6 + ':' + str2;
            } else if (request.body() == null) {
                i iVar = new i(f);
                try {
                    iVar.close();
                    this.i = str6 + ':' + str2 + ':' + g(iVar.a());
                } catch (IOException e) {
                    throw new a("I/O error reading entity content", e);
                }
            } else {
                if (!hashSet.contains("auth")) {
                    throw new a("Qop auth-int cannot be used with a non-repeatable entity");
                }
                this.i = str6 + ':' + str2;
                c = 2;
            }
            String g3 = g(f.digest(j(this.i, str9)));
            if (c == 0) {
                sb3.setLength(0);
                sb3.append(g2);
                sb3.append(':');
                sb3.append(str4);
                sb3.append(':');
                sb3.append(g3);
                sb = sb3.toString();
            } else {
                sb3.setLength(0);
                sb3.append(g2);
                sb3.append(':');
                sb3.append(str4);
                sb3.append(':');
                sb3.append(sb4);
                sb3.append(':');
                sb3.append(this.g);
                sb3.append(':');
                sb3.append(c == 1 ? "auth-int" : "auth");
                sb3.append(':');
                sb3.append(g3);
                sb = sb3.toString();
            }
            String g4 = g(f.digest(i(sb)));
            sb2 = new StringBuilder(128);
            str = o() ? "Proxy-Authorization" : "Authorization";
            sb2.append("Digest ");
            ArrayList arrayList = new ArrayList(20);
            arrayList.add(new e("username", b));
            arrayList.add(new e("realm", str3));
            arrayList.add(new e("nonce", str4));
            arrayList.add(new e("uri", str2));
            arrayList.add(new e("response", g4));
            if (c != 0) {
                arrayList.add(new e("qop", c == 1 ? "auth-int" : "auth"));
                arrayList.add(new e("nc", sb4));
                arrayList.add(new e("cnonce", this.g));
            }
            arrayList.add(new e("algorithm", str7));
            if (str5 != null) {
                arrayList.add(new e("opaque", str5));
            }
            for (int i = 0; i < arrayList.size(); i++) {
                k kVar = (k) arrayList.get(i);
                if (i > 0) {
                    sb2.append(", ");
                }
                String name = kVar.getName();
                if (!"nc".equals(name) && !"qop".equals(name) && !"algorithm".equals(name)) {
                    z = false;
                    c.a.b(sb2, kVar, !z);
                }
                z = true;
                c.a.b(sb2, kVar, !z);
            }
        } finally {
        }
        return new e(str, sb2.toString());
    }

    private MessageDigest f(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unsupported algorithm in HTTP Digest authentication: " + str, e);
        }
    }

    private String g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = k;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private String h(Headers headers, String str) throws IOException {
        List<String> values = headers.values(str);
        for (String str2 : values) {
            if (str2.startsWith("Digest")) {
                return str2;
            }
        }
        if (values.contains("OkHttp-Preemptive")) {
            return null;
        }
        throw new IOException("unsupported auth scheme: " + values);
    }

    private byte[] j(String str, String str2) {
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    private String m(int i) {
        if (i == 401) {
            r(false);
            return "WWW-Authenticate";
        }
        if (i != 407) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        r(true);
        return "Proxy-Authenticate";
    }

    private boolean n(Request request, String str, boolean z) {
        String header = request.header(o() ? "Proxy-Authorization" : "Authorization");
        if (header == null || !header.startsWith("Digest")) {
            return false;
        }
        return !z;
    }

    private String q(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        return encodedPath + "?" + encodedQuery;
    }

    public Request a(Route route, Request request) throws IOException {
        Map<String, String> map = this.a.get();
        return b(route, request, map == null ? new ConcurrentHashMap() : new ConcurrentHashMap(map));
    }

    @Override // okhttp3.Authenticator
    public synchronized Request authenticate(Route route, Response response) throws IOException {
        String h = h(response.headers(), m(response.code()));
        if (h == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p(h, 7, h.length() - 7, concurrentHashMap);
        c(response.headers(), concurrentHashMap);
        this.a.set(DesugarCollections.unmodifiableMap(concurrentHashMap));
        if (concurrentHashMap.get("nonce") != null) {
            return b(route, response.request(), concurrentHashMap);
        }
        throw new IOException("missing nonce in challenge header: " + h);
    }

    public String d() {
        byte[] bArr = new byte[8];
        this.c.nextBytes(bArr);
        return g(bArr);
    }

    public byte[] i(String str) {
        if (str != null) {
            return str.getBytes(StandardCharsets.US_ASCII);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    String k(Request request) {
        String header = request.header("http.auth.credential-charset");
        return header == null ? l().name() : header;
    }

    public Charset l() {
        return this.b;
    }

    public boolean o() {
        return this.j;
    }

    protected void p(String str, int i, int i2, Map<String, String> map) {
        d dVar = d.b;
        l lVar = new l(i, str.length());
        f fVar = new f(i2);
        fVar.a(str);
        h[] d = dVar.d(fVar, lVar);
        if (d.length == 0) {
            throw new IllegalArgumentException("Authentication challenge is empty");
        }
        for (h hVar : d) {
            map.put(hVar.getName(), hVar.getValue());
        }
    }

    public void r(boolean z) {
        this.j = z;
    }

    /* renamed from: ax.m4.b$a */
    private class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Exception exc) {
            super(str, exc);
        }
    }
}

package okhttp3;

import ax.Db.a;
import ax.Gb.l;
import ax.Gb.y;
import ax.Ob.h;
import ax.i.s;
import ax.sb.t;
import ax.tb.C3121L;
import ax.tb.C3139o;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.InterfaceC3482A;
import ax.xc.InterfaceC3488f;
import ax.xc.g;
import ax.xc.h;
import ax.xc.j;
import ax.xc.k;
import ax.xc.p;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    private static final class CacheResponseBody extends ResponseBody {
        private final g bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            l.f(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = p.d(new k(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // ax.xc.k, ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public g source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(ax.Gb.g gVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (h.v("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(h.w(y.a));
                    }
                    Iterator it = h.q0(value, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(h.A0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C3121L.d() : treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            l.f(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            l.f(httpUrl, "url");
            return ax.xc.h.e0.d(httpUrl.toString()).x().t();
        }

        public final int readInt$okhttp(g gVar) throws IOException {
            l.f(gVar, "source");
            try {
                long S = gVar.S();
                String v0 = gVar.v0();
                if (S >= 0 && S <= 2147483647L && v0.length() <= 0) {
                    return (int) S;
                }
                throw new IOException("expected an int but was \"" + S + v0 + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            l.f(response, "<this>");
            Response networkResponse = response.networkResponse();
            l.c(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            l.f(response, "cachedResponse");
            l.f(headers, "cachedRequest");
            l.f(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if (s.a(varyFields) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!l.a(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }

    private final class RealCacheRequest implements CacheRequest {
        private final InterfaceC3482A body;
        private final InterfaceC3482A cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            l.f(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            InterfaceC3482A newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new j(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // ax.xc.j, ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
                public void close() throws IOException {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public InterfaceC3482A body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        l.f(file, "directory");
        l.f(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m27deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        l.f(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                ResponseBody body = response.body();
                if (body != null) {
                    Util.closeQuietly(body);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        l.f(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!l.a(method, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        l.f(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        try {
            l.f(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editor;
        l.f(response, "cached");
        l.f(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        l.d(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        l.f(file, "directory");
    }

    private static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        public static final class Companion {
            public /* synthetic */ Companion(ax.Gb.g gVar) {
                this();
            }

            private Companion() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(C c) throws IOException {
            l.f(c, "rawSource");
            try {
                g d = p.d(c);
                String v0 = d.v0();
                HttpUrl parse = HttpUrl.Companion.parse(v0);
                if (parse == null) {
                    IOException iOException = new IOException("Cache corruption for " + v0);
                    Platform.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = parse;
                this.requestMethod = d.v0();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(d);
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(d.v0());
                }
                this.varyHeaders = builder.build();
                StatusLine parse2 = StatusLine.Companion.parse(d.v0());
                this.protocol = parse2.protocol;
                this.code = parse2.code;
                this.message = parse2.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(d.v0());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String v02 = d.v0();
                    if (v02.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + v02 + '\"');
                    }
                    this.handshake = Handshake.Companion.get(!d.P() ? TlsVersion.Companion.forJavaName(d.v0()) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(d.v0()), readCertificateList(d), readCertificateList(d));
                } else {
                    this.handshake = null;
                }
                t tVar = t.a;
                a.a(c, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    a.a(c, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return l.a(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(g gVar) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(gVar);
            if (readInt$okhttp == -1) {
                return C3139o.j();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String v0 = gVar.v0();
                    C3487e c3487e = new C3487e();
                    ax.xc.h a = ax.xc.h.e0.a(v0);
                    if (a == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c3487e.I0(a);
                    arrayList.add(certificateFactory.generateCertificate(c3487e.V0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(InterfaceC3488f interfaceC3488f, List<? extends Certificate> list) throws IOException {
            try {
                interfaceC3488f.Q0(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    h.a aVar = ax.xc.h.e0;
                    l.e(encoded, "bytes");
                    interfaceC3488f.f0(h.a.f(aVar, encoded, 0, 0, 3, null).d()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            l.f(request, "request");
            l.f(response, "response");
            return l.a(this.url, request.url()) && l.a(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            l.f(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            l.f(editor, "editor");
            InterfaceC3488f c = p.c(editor.newSink(0));
            try {
                c.f0(this.url.toString()).writeByte(10);
                c.f0(this.requestMethod).writeByte(10);
                c.Q0(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    c.f0(this.varyHeaders.name(i)).f0(": ").f0(this.varyHeaders.value(i)).writeByte(10);
                }
                c.f0(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                c.Q0(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c.f0(this.responseHeaders.name(i2)).f0(": ").f0(this.responseHeaders.value(i2)).writeByte(10);
                }
                c.f0(SENT_MILLIS).f0(": ").Q0(this.sentRequestMillis).writeByte(10);
                c.f0(RECEIVED_MILLIS).f0(": ").Q0(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    c.writeByte(10);
                    Handshake handshake = this.handshake;
                    l.c(handshake);
                    c.f0(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(c, this.handshake.peerCertificates());
                    writeCertList(c, this.handshake.localCertificates());
                    c.f0(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                t tVar = t.a;
                a.a(c, null);
            } finally {
            }
        }

        public Entry(Response response) {
            l.f(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}

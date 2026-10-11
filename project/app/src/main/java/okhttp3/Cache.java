/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Db.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.y;
import ax.Ob.h;
import ax.i.s;
import ax.sb.t;
import ax.tb.L;
import ax.tb.o;
import ax.xc.A;
import ax.xc.C;
import ax.xc.e;
import ax.xc.f;
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
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Cache
implements Closeable,
Flushable,
AutoCloseable {
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

    public Cache(File file, long l8) {
        l.f(file, "directory");
        this(file, l8, FileSystem.SYSTEM);
    }

    public Cache(File file, long l8, FileSystem fileSystem) {
        l.f(file, "directory");
        l.f(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, 201105, 2, l8, TaskRunner.INSTANCE);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor == null) return;
        try {
            editor.abort();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    public final File -deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override
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

    @Override
    public void flush() throws IOException {
        this.cache.flush();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Response get$okhttp(Request object) {
        Object object2;
        block5: {
            l.f(object, "request");
            object2 = Companion.key(((Request)object).url());
            try {
                object2 = this.cache.get((String)object2);
                if (object2 != null) break block5;
                return null;
            }
            catch (IOException iOException) {
                return null;
            }
        }
        try {
            Entry entry = new Entry(((DiskLruCache.Snapshot)object2).getSource(0));
            object2 = entry.response((DiskLruCache.Snapshot)object2);
            if (entry.matches((Request)object, (Response)object2)) return object2;
            object = ((Response)object2).body();
            if (object == null) return null;
        }
        catch (IOException iOException) {
            Util.closeQuietly((Closeable)object2);
            return null;
        }
        Util.closeQuietly((Closeable)object);
        return null;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int hitCount() {
        synchronized (this) {
            return this.hitCount;
        }
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int networkCount() {
        synchronized (this) {
            return this.networkCount;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final CacheRequest put$okhttp(Response object) {
        Object object2;
        block9: {
            l.f(object, "response");
            object2 = ((Response)object).request().method();
            if (HttpMethod.INSTANCE.invalidatesCache(((Response)object).request().method())) {
                this.remove$okhttp(((Response)object).request());
                return null;
            }
            if (!l.a(object2, "GET")) {
                return null;
            }
            Companion companion = Companion;
            if (companion.hasVaryAll((Response)object)) {
                return null;
            }
            object2 = new Entry((Response)object);
            object = DiskLruCache.edit$default(this.cache, companion.key(((Response)object).request().url()), 0L, 2, null);
            if (object != null) break block9;
            return null;
        }
        ((Entry)object2).writeTo((DiskLruCache.Editor)object);
        return new RealCacheRequest(this, (DiskLruCache.Editor)object);
        {
            catch (IOException iOException) {}
        }
        catch (IOException iOException) {
            block10: {
                object = null;
                break block10;
                catch (IOException iOException2) {
                    return null;
                }
            }
            this.abortQuietly((DiskLruCache.Editor)object);
            return null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        l.f(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int requestCount() {
        synchronized (this) {
            return this.requestCount;
        }
    }

    public final void setWriteAbortCount$okhttp(int n8) {
        this.writeAbortCount = n8;
    }

    public final void setWriteSuccessCount$okhttp(int n8) {
        this.writeSuccessCount = n8;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackConditionalCacheHit$okhttp() {
        synchronized (this) {
            ++this.hitCount;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            l.f(cacheStrategy, "cacheStrategy");
                            ++this.requestCount;
                            if (cacheStrategy.getNetworkRequest() == null) break block4;
                            ++this.networkCount;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (cacheStrategy.getCacheResponse() != null) {
                        ++this.hitCount;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void update$okhttp(Response object, Response object2) {
        block4: {
            l.f(object, "cached");
            l.f(object2, "network");
            object2 = new Entry((Response)object2);
            object = ((Response)object).body();
            l.d(object, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
            object = ((CacheResponseBody)object).getSnapshot();
            object = ((DiskLruCache.Snapshot)object).edit();
            if (object != null) break block4;
            return;
        }
        ((Entry)object2).writeTo((DiskLruCache.Editor)object);
        ((DiskLruCache.Editor)object).commit();
        return;
        {
            catch (IOException iOException) {}
        }
        catch (IOException iOException) {
            object = null;
            this.abortQuietly((DiskLruCache.Editor)object);
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Iterator<String>(this){
            private boolean canRemove;
            private final Iterator<DiskLruCache.Snapshot> delegate;
            private String nextUrl;
            {
                this.delegate = cache.getCache$okhttp().snapshots();
            }

            /*
             * Exception decompiling
             */
            public boolean hasNext() {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 74->81)] java.io.IOException
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.dump(Method.java:598)
                 *     at org.benf.cfr.reader.entities.classfilehelpers.ClassFileDumperAnonymousInner.dumpWithArgs(ClassFileDumperAnonymousInner.java:87)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.ConstructorInvokationAnonymousInner.dumpInner(ConstructorInvokationAnonymousInner.java:82)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dumpWithOuterPrecedence(AbstractExpression.java:142)
                 *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractExpression.dump(AbstractExpression.java:98)
                 *     at org.benf.cfr.reader.state.TypeUsageCollectingDumper.dump(TypeUsageCollectingDumper.java:194)
                 *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredReturn.dump(StructuredReturn.java:60)
                 *     at org.benf.cfr.reader.state.TypeUsageCollectingDumper.dump(TypeUsageCollectingDumper.java:194)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.dump(Op04StructuredStatement.java:220)
                 *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.Block.dump(Block.java:564)
                 *     at org.benf.cfr.reader.state.TypeUsageCollectingDumper.dump(TypeUsageCollectingDumper.java:194)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.dump(Op04StructuredStatement.java:220)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.dump(AttributeCode.java:135)
                 *     at org.benf.cfr.reader.state.TypeUsageCollectingDumper.dump(TypeUsageCollectingDumper.java:194)
                 *     at org.benf.cfr.reader.entities.Method.dump(Method.java:627)
                 *     at org.benf.cfr.reader.entities.classfilehelpers.AbstractClassFileDumper.dumpMethods(AbstractClassFileDumper.java:211)
                 *     at org.benf.cfr.reader.entities.classfilehelpers.ClassFileDumperNormal.dump(ClassFileDumperNormal.java:70)
                 *     at org.benf.cfr.reader.entities.ClassFile.dump(ClassFile.java:1167)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:952)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public String next() {
                if (this.hasNext()) {
                    String string = this.nextUrl;
                    l.c(string);
                    this.nextUrl = null;
                    this.canRemove = true;
                    return string;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int writeAbortCount() {
        synchronized (this) {
            return this.writeAbortCount;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int writeSuccessCount() {
        synchronized (this) {
            return this.writeSuccessCount;
        }
    }

    private static final class CacheResponseBody
    extends ResponseBody {
        private final ax.xc.g bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String string, String string2) {
            l.f(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = string;
            this.contentLength = string2;
            this.bodySource = p.d(new k(snapshot.getSource(1), this){
                final CacheResponseBody this$0;
                {
                    this.this$0 = cacheResponseBody;
                    super(c8);
                }

                @Override
                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override
        public long contentLength() {
            String string = this.contentLength;
            if (string != null) {
                return Util.toLongOrDefault(string, -1L);
            }
            return -1L;
        }

        @Override
        public MediaType contentType() {
            String string = this.contentType;
            if (string != null) {
                return MediaType.Companion.parse(string);
            }
            return null;
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override
        public ax.xc.g source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int n8 = headers.size();
            TreeSet<String> treeSet = null;
            block0: for (int i8 = 0; i8 < n8; ++i8) {
                if (!h.v("Vary", headers.name(i8), true)) continue;
                Object object = headers.value(i8);
                TreeSet<String> treeSet2 = treeSet;
                if (treeSet == null) {
                    treeSet2 = new TreeSet<String>(h.w(y.a));
                }
                object = h.q0((CharSequence)object, new char[]{','}, false, 0, 6, null).iterator();
                while (true) {
                    treeSet = treeSet2;
                    if (!object.hasNext()) continue block0;
                    treeSet2.add(((Object)h.A0((String)object.next())).toString());
                }
            }
            if (treeSet == null) {
                return L.d();
            }
            return treeSet;
        }

        private final Headers varyHeaders(Headers headers, Headers iterable) {
            if ((iterable = this.varyFields((Headers)iterable)).isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int n8 = headers.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string = headers.name(i8);
                if (!iterable.contains(string)) continue;
                builder.add(string, headers.value(i8));
            }
            return builder.build();
        }

        public final boolean hasVaryAll(Response response) {
            l.f(response, "<this>");
            return this.varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            l.f(httpUrl, "url");
            return ax.xc.h.e0.d(httpUrl.toString()).x().t();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final int readInt$okhttp(ax.xc.g object) throws IOException {
            String string;
            long l8;
            l.f(object, "source");
            try {
                l8 = object.S();
                string = object.v0();
                if (l8 >= 0L && l8 <= Integer.MAX_VALUE && string.length() <= 0) {
                    return (int)l8;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw new IOException(numberFormatException.getMessage());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("expected an int but was \"");
            ((StringBuilder)object).append(l8);
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('\"');
            IOException iOException = new IOException(((StringBuilder)object).toString());
            throw iOException;
        }

        public final Headers varyHeaders(Response response) {
            l.f(response, "<this>");
            Response response2 = response.networkResponse();
            l.c(response2);
            return this.varyHeaders(response2.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response iterator, Headers headers, Request request) {
            l.f(iterator, "cachedResponse");
            l.f(headers, "cachedRequest");
            l.f(request, "newRequest");
            iterator = this.varyFields(((Response)((Object)iterator)).headers());
            if (s.a(iterator) && iterator.isEmpty()) {
                return true;
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (l.a(headers.values(string), request.headers(string))) continue;
                return false;
            }
            return true;
        }
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

        static {
            StringBuilder stringBuilder = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            stringBuilder.append(companion.get().getPrefix());
            stringBuilder.append("-Sent-Millis");
            SENT_MILLIS = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(companion.get().getPrefix());
            stringBuilder.append("-Received-Millis");
            RECEIVED_MILLIS = stringBuilder.toString();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Entry(C c8) throws IOException {
            Throwable throwable2;
            List<Certificate> list;
            Object object;
            Object object2;
            block13: {
                l.f(c8, "rawSource");
                try {
                    int n8;
                    object2 = p.d(c8);
                    object = object2.v0();
                    list = HttpUrl.Companion.parse((String)object);
                    if (list == null) break block13;
                    this.url = list;
                    this.requestMethod = object2.v0();
                    object = new Object();
                    int n9 = Companion.readInt$okhttp((ax.xc.g)object2);
                    int n10 = 0;
                    for (n8 = 0; n8 < n9; ++n8) {
                        ((Headers.Builder)object).addLenient$okhttp(object2.v0());
                    }
                    this.varyHeaders = ((Headers.Builder)object).build();
                    object = StatusLine.Companion.parse(object2.v0());
                    this.protocol = ((StatusLine)object).protocol;
                    this.code = ((StatusLine)object).code;
                    this.message = ((StatusLine)object).message;
                    object = new Object();
                    n9 = Companion.readInt$okhttp((ax.xc.g)object2);
                    for (n8 = n10; n8 < n9; ++n8) {
                        ((Headers.Builder)object).addLenient$okhttp(object2.v0());
                    }
                    Object object3 = SENT_MILLIS;
                    String string = ((Headers.Builder)object).get((String)object3);
                    list = RECEIVED_MILLIS;
                    String string2 = ((Headers.Builder)object).get((String)((Object)list));
                    ((Headers.Builder)object).removeAll((String)object3);
                    ((Headers.Builder)object).removeAll((String)((Object)list));
                    long l8 = 0L;
                    long l9 = string != null ? Long.parseLong(string) : 0L;
                    this.sentRequestMillis = l9;
                    l9 = l8;
                    if (string2 != null) {
                        l9 = Long.parseLong(string2);
                    }
                    this.receivedResponseMillis = l9;
                    this.responseHeaders = ((Headers.Builder)object).build();
                    if (this.isHttps()) {
                        object = object2.v0();
                        if (object.length() > 0) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("expected \"\" but was \"");
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append('\"');
                            super(((StringBuilder)object2).toString());
                            throw list;
                        }
                        object = object2.v0();
                        object3 = CipherSuite.Companion.forJavaName((String)object);
                        list = this.readCertificateList((ax.xc.g)object2);
                        object = this.readCertificateList((ax.xc.g)object2);
                        object2 = !object2.P() ? TlsVersion.Companion.forJavaName(object2.v0()) : TlsVersion.SSL_3_0;
                        this.handshake = Handshake.Companion.get((TlsVersion)((Object)object2), (CipherSuite)object3, (List<? extends Certificate>)list, (List<? extends Certificate>)object);
                    } else {
                        this.handshake = null;
                    }
                    object2 = t.a;
                }
                catch (Throwable throwable2) {}
                a.a(c8, null);
                return;
            }
            list = new List<Certificate>();
            ((StringBuilder)((Object)list)).append("Cache corruption for ");
            ((StringBuilder)((Object)list)).append((String)object);
            object2 = new IOException(((StringBuilder)((Object)list)).toString());
            Platform.Companion.get().log("cache corruption", 5, (Throwable)object2);
            throw object2;
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                a.a(c8, throwable2);
                throw throwable3;
            }
        }

        public Entry(Response response) {
            l.f(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private final boolean isHttps() {
            return l.a(this.url.scheme(), "https");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final List<Certificate> readCertificateList(ax.xc.g object) throws IOException {
            int n8 = Companion.readInt$okhttp((ax.xc.g)object);
            if (n8 == -1) {
                return o.j();
            }
            try {
                block6: {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                    ArrayList<Certificate> arrayList = new ArrayList<Certificate>(n8);
                    int n9 = 0;
                    while (n9 < n8) {
                        Object object2 = object.v0();
                        e e8 = new e();
                        if ((object2 = ax.xc.h.e0.a((String)object2)) != null) {
                            e8.f1((ax.xc.h)object2);
                            arrayList.add(certificateFactory.generateCertificate(e8.V0()));
                            ++n9;
                            continue;
                        }
                        break block6;
                    }
                    return arrayList;
                }
                object = new IOException("Corrupt certificate in cache entry");
                throw object;
            }
            catch (CertificateException certificateException) {
                throw new IOException(certificateException.getMessage());
            }
        }

        private final void writeCertList(f f8, List<? extends Certificate> object) throws IOException {
            CertificateEncodingException certificateEncodingException2;
            block3: {
                try {
                    f8.Q0(object.size()).writeByte(10);
                    Iterator<? extends Certificate> iterator = object.iterator();
                    while (iterator.hasNext()) {
                        byte[] byArray = iterator.next().getEncoded();
                        object = ax.xc.h.e0;
                        l.e(byArray, "bytes");
                        f8.f0(h.a.f((h.a)object, byArray, 0, 0, 3, null).d()).writeByte(10);
                    }
                }
                catch (CertificateEncodingException certificateEncodingException2) {
                    break block3;
                }
                return;
            }
            throw new IOException(certificateEncodingException2.getMessage());
        }

        public final boolean matches(Request request, Response response) {
            l.f(request, "request");
            l.f(response, "response");
            return l.a(this.url, request.url()) && l.a(this.requestMethod, request.method()) && Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            l.f(snapshot, "snapshot");
            String string = this.responseHeaders.get("Content-Type");
            String string2 = this.responseHeaders.get("Content-Length");
            Request request = new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build();
            return new Response.Builder().request(request).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, string, string2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void writeTo(DiskLruCache.Editor object) throws IOException {
            Throwable throwable2;
            block9: {
                Object object2;
                int n8;
                int n9;
                l.f(object, "editor");
                int n10 = 0;
                object = p.c(((DiskLruCache.Editor)object).newSink(0));
                try {
                    object.f0(this.url.toString()).writeByte(10);
                    object.f0(this.requestMethod).writeByte(10);
                    object.Q0(this.varyHeaders.size()).writeByte(10);
                    n9 = this.varyHeaders.size();
                    for (n8 = 0; n8 < n9; ++n8) {
                        object.f0(this.varyHeaders.name(n8)).f0(": ").f0(this.varyHeaders.value(n8)).writeByte(10);
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                {
                    object2 = new StatusLine(this.protocol, this.code, this.message);
                    object.f0(((StatusLine)object2).toString()).writeByte(10);
                    object.Q0(this.responseHeaders.size() + 2).writeByte(10);
                    n9 = this.responseHeaders.size();
                    for (n8 = n10; n8 < n9; ++n8) {
                        object.f0(this.responseHeaders.name(n8)).f0(": ").f0(this.responseHeaders.value(n8)).writeByte(10);
                    }
                }
                {
                    object.f0(SENT_MILLIS).f0(": ").Q0(this.sentRequestMillis).writeByte(10);
                    object.f0(RECEIVED_MILLIS).f0(": ").Q0(this.receivedResponseMillis).writeByte(10);
                    if (this.isHttps()) {
                        object.writeByte(10);
                        object2 = this.handshake;
                        l.c(object2);
                        object.f0(((Handshake)object2).cipherSuite().javaName()).writeByte(10);
                        this.writeCertList((f)object, this.handshake.peerCertificates());
                        this.writeCertList((f)object, this.handshake.localCertificates());
                        object.f0(this.handshake.tlsVersion().javaName()).writeByte(10);
                    }
                    object2 = t.a;
                }
                a.a((Closeable)object, null);
                return;
            }
            try {
                throw throwable2;
            }
            catch (Throwable throwable3) {
                a.a((Closeable)object, throwable2);
                throw throwable3;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g g8) {
                this();
            }
        }
    }

    private final class RealCacheRequest
    implements CacheRequest {
        private final A body;
        private final A cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final Cache this$0;

        public RealCacheRequest(Cache cache, DiskLruCache.Editor object) {
            l.f(object, "editor");
            this.this$0 = cache;
            this.editor = object;
            this.cacheOut = object = ((DiskLruCache.Editor)object).newSink(1);
            this.body = new j(cache, this, (A)object){
                final Cache this$0;
                final RealCacheRequest this$1;
                {
                    this.this$0 = cache;
                    this.this$1 = realCacheRequest;
                    super(a8);
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void close() throws IOException {
                    Cache cache = this.this$0;
                    RealCacheRequest realCacheRequest = this.this$1;
                    synchronized (cache) {
                        boolean bl = realCacheRequest.getDone();
                        if (bl) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                    }
                    super.close();
                    this.this$1.editor.commit();
                }
            };
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                boolean bl = this.done;
                if (bl) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
            }
            Util.closeQuietly(this.cacheOut);
            try {
                this.editor.abort();
                return;
            }
            catch (IOException throwable) {
                return;
            }
        }

        @Override
        public A body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean bl) {
            this.done = bl;
        }
    }
}


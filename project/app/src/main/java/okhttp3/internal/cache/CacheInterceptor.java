/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.f;
import ax.xc.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

public final class CacheInterceptor
implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(CacheRequest object, Response response) throws IOException {
        if (object == null) {
            return response;
        }
        A a8 = object.body();
        Object object2 = response.body();
        l.c(object2);
        object = new C(((ResponseBody)object2).source(), (CacheRequest)object, p.c(a8)){
            final f $cacheBody;
            final CacheRequest $cacheRequest;
            final ax.xc.g $source;
            private boolean cacheRequestClosed;
            {
                this.$source = g8;
                this.$cacheRequest = cacheRequest;
                this.$cacheBody = f8;
            }

            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    this.$cacheRequest.abort();
                }
                this.$source.close();
            }

            public long read(e e8, long l8) throws IOException {
                block3: {
                    block4: {
                        l.f(e8, "sink");
                        try {
                            l8 = this.$source.read(e8, l8);
                            if (l8 != -1L) break block3;
                            if (this.cacheRequestClosed) break block4;
                            this.cacheRequestClosed = true;
                        }
                        catch (IOException iOException) {
                            if (!this.cacheRequestClosed) {
                                this.cacheRequestClosed = true;
                                this.$cacheRequest.abort();
                            }
                            throw iOException;
                        }
                        this.$cacheBody.close();
                    }
                    return -1L;
                }
                e8.j(this.$cacheBody.k(), e8.size() - l8, l8);
                this.$cacheBody.R();
                return l8;
            }

            public D timeout() {
                return this.$source.timeout();
            }
        };
        object2 = Response.header$default(response, "Content-Type", null, 2, null);
        long l8 = response.body().contentLength();
        return response.newBuilder().body(new RealResponseBody((String)object2, l8, p.d((C)object))).build();
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Response intercept(Interceptor.Chain object) throws IOException {
        Response response;
        Request request;
        Object object2;
        Object object3;
        Object object4;
        Call call;
        block19: {
            block21: {
                block20: {
                    l.f(object, "chain");
                    call = object.call();
                    object4 = this.cache;
                    object3 = null;
                    object4 = object4 != null ? ((Cache)object4).get$okhttp(object.request()) : null;
                    object2 = new CacheStrategy.Factory(System.currentTimeMillis(), object.request(), (Response)object4).compute();
                    request = ((CacheStrategy)object2).getNetworkRequest();
                    response = ((CacheStrategy)object2).getCacheResponse();
                    Cache cache = this.cache;
                    if (cache != null) {
                        cache.trackResponse$okhttp((CacheStrategy)object2);
                    }
                    if (call instanceof RealCall) {
                        object3 = (RealCall)call;
                    }
                    if (object3 == null) break block20;
                    object3 = object2 = ((RealCall)object3).getEventListener$okhttp();
                    if (object2 != null) break block21;
                }
                object3 = EventListener.NONE;
            }
            if (object4 != null && response == null && (object2 = ((Response)object4).body()) != null) {
                Util.closeQuietly((Closeable)object2);
            }
            if (request == null && response == null) {
                object = new Response.Builder().request(object.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
                ((EventListener)object3).satisfactionFailure(call, (Response)object);
                return object;
            }
            if (request == null) {
                l.c(response);
                object = response.newBuilder().cacheResponse(CacheInterceptor.Companion.stripBody(response)).build();
                ((EventListener)object3).cacheHit(call, (Response)object);
                return object;
            }
            if (response != null) {
                ((EventListener)object3).cacheConditionalHit(call, response);
            } else if (this.cache != null) {
                ((EventListener)object3).cacheMiss(call);
            }
            try {
                object = object.proceed(request);
                if (object != null || object4 == null || (object4 = ((Response)object4).body()) == null) break block19;
            }
            catch (Throwable throwable) {
                if (object4 == null) throw throwable;
                object3 = ((Response)object4).body();
                if (object3 == null) throw throwable;
                Util.closeQuietly((Closeable)object3);
                throw throwable;
            }
            Util.closeQuietly((Closeable)object4);
        }
        if (response != null) {
            if (object != null && ((Response)object).code() == 304) {
                object2 = response.newBuilder();
                object4 = Companion;
                object4 = ((Response.Builder)object2).headers(((Companion)object4).combine(response.headers(), ((Response)object).headers())).sentRequestAtMillis(((Response)object).sentRequestAtMillis()).receivedResponseAtMillis(((Response)object).receivedResponseAtMillis()).cacheResponse(((Companion)object4).stripBody(response)).networkResponse(((Companion)object4).stripBody((Response)object)).build();
                object = ((Response)object).body();
                l.c(object);
                ((ResponseBody)object).close();
                object = this.cache;
                l.c(object);
                ((Cache)object).trackConditionalCacheHit$okhttp();
                this.cache.update$okhttp(response, (Response)object4);
                ((EventListener)object3).cacheHit(call, (Response)object4);
                return object4;
            }
            object4 = response.body();
            if (object4 != null) {
                Util.closeQuietly((Closeable)object4);
            }
        }
        l.c(object);
        object2 = ((Response)object).newBuilder();
        object4 = Companion;
        object = ((Response.Builder)object2).cacheResponse(((Companion)object4).stripBody(response)).networkResponse(((Companion)object4).stripBody((Response)object)).build();
        if (this.cache == null) return object;
        if (HttpHeaders.promisesBody((Response)object) && CacheStrategy.Companion.isCacheable((Response)object, request)) {
            object = this.cacheWritingResponse(this.cache.put$okhttp((Response)object), (Response)object);
            if (response == null) return object;
            ((EventListener)object3).cacheMiss(call);
            return object;
        }
        if (!HttpMethod.INSTANCE.invalidatesCache(request.method())) return object;
        try {}
        catch (IOException iOException) {
            return object;
        }
        this.cache.remove$okhttp(request);
        return object;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final Headers combine(Headers object, Headers headers) {
            int n8;
            Headers.Builder builder = new Headers.Builder();
            int n9 = ((Headers)object).size();
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                String string = ((Headers)object).name(n8);
                String string2 = ((Headers)object).value(n8);
                if (h.v("Warning", string, true) && h.H(string2, "1", false, 2, null) || !this.isContentSpecificHeader(string) && this.isEndToEnd(string) && headers.get(string) != null) continue;
                builder.addLenient$okhttp(string, string2);
            }
            n9 = headers.size();
            for (n8 = n10; n8 < n9; ++n8) {
                object = headers.name(n8);
                if (this.isContentSpecificHeader((String)object) || !this.isEndToEnd((String)object)) continue;
                builder.addLenient$okhttp((String)object, headers.value(n8));
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String string) {
            return h.v("Content-Length", string, true) || h.v("Content-Encoding", string, true) || h.v("Content-Type", string, true);
            {
            }
        }

        private final boolean isEndToEnd(String string) {
            return !h.v("Connection", string, true) && !h.v("Keep-Alive", string, true) && !h.v("Proxy-Authenticate", string, true) && !h.v("Proxy-Authorization", string, true) && !h.v("TE", string, true) && !h.v("Trailers", string, true) && !h.v("Transfer-Encoding", string, true) && !h.v("Upgrade", string, true);
        }

        private final Response stripBody(Response response) {
            ResponseBody responseBody = response != null ? response.body() : null;
            Response response2 = response;
            if (responseBody != null) {
                response2 = response.newBuilder().body(null).build();
            }
            return response2;
        }
    }
}


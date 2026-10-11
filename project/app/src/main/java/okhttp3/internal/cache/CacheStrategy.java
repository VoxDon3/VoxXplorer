/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

public final class CacheStrategy {
    public static final Companion Companion = new Companion(null);
    private final Response cacheResponse;
    private final Request networkRequest;

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Unable to fully structure code
         */
        public final boolean isCacheable(Response var1_1, Request var2_2) {
            block6: {
                l.f(var1_1, "response");
                l.f(var2_2, "request");
                var3_3 = var1_1.code();
                if (var3_3 == 200 || var3_3 == 410 || var3_3 == 414 || var3_3 == 501 || var3_3 == 203 || var3_3 == 204) break block6;
                if (var3_3 == 307) ** GOTO lbl-1000
                if (var3_3 == 308 || var3_3 == 404 || var3_3 == 405) break block6;
                switch (var3_3) {
                    default: {
                        return false;
                    }
                    case 302: lbl-1000:
                    // 2 sources

                    {
                        if (Response.header$default(var1_1, "Expires", null, 2, null) != null || var1_1.cacheControl().maxAgeSeconds() != -1 || var1_1.cacheControl().isPublic() || var1_1.cacheControl().isPrivate()) break;
                        return false;
                    }
                    case 300: 
                    case 301: 
                }
            }
            return var1_1.cacheControl().noStore() == false && var2_2.cacheControl().noStore() == false;
        }
    }

    public static final class Factory {
        private int ageSeconds;
        private final Response cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final Request request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public Factory(long l8, Request object, Response object2) {
            l.f(object, "request");
            this.nowMillis = l8;
            this.request = object;
            this.cacheResponse = object2;
            this.ageSeconds = -1;
            if (object2 != null) {
                this.sentRequestMillis = ((Response)object2).sentRequestAtMillis();
                this.receivedResponseMillis = ((Response)object2).receivedResponseAtMillis();
                object = ((Response)object2).headers();
                int n8 = ((Headers)object).size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    String string = ((Headers)object).name(i8);
                    object2 = ((Headers)object).value(i8);
                    if (h.v(string, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull((String)object2);
                        this.servedDateString = object2;
                        continue;
                    }
                    if (h.v(string, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull((String)object2);
                        continue;
                    }
                    if (h.v(string, "Last-Modified", true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull((String)object2);
                        this.lastModifiedString = object2;
                        continue;
                    }
                    if (h.v(string, "ETag", true)) {
                        this.etag = object2;
                        continue;
                    }
                    if (!h.v(string, "Age", true)) continue;
                    this.ageSeconds = Util.toNonNegativeInt((String)object2, -1);
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long l8 = 0L;
            if (date != null) {
                l8 = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            int n8 = this.ageSeconds;
            long l9 = l8;
            if (n8 != -1) {
                l9 = Math.max(l8, TimeUnit.SECONDS.toMillis(n8));
            }
            l8 = this.receivedResponseMillis;
            return l9 + (l8 - this.sentRequestMillis) + (this.nowMillis - l8);
        }

        /*
         * Enabled aggressive block sorting
         */
        private final CacheStrategy computeCandidate() {
            long l8;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            Object object = this.request.cacheControl();
            if (((CacheControl)object).noCache()) return new CacheStrategy(this.request, null);
            if (this.hasConditions(this.request)) {
                return new CacheStrategy(this.request, null);
            }
            Object object2 = this.cacheResponse.cacheControl();
            long l9 = this.cacheResponseAge();
            long l10 = l8 = this.computeFreshnessLifetime();
            if (((CacheControl)object).maxAgeSeconds() != -1) {
                l10 = Math.min(l8, TimeUnit.SECONDS.toMillis(((CacheControl)object).maxAgeSeconds()));
            }
            int n8 = ((CacheControl)object).minFreshSeconds();
            long l11 = 0L;
            long l12 = n8 != -1 ? TimeUnit.SECONDS.toMillis(((CacheControl)object).minFreshSeconds()) : 0L;
            l8 = l11;
            if (!((CacheControl)object2).mustRevalidate()) {
                l8 = l11;
                if (((CacheControl)object).maxStaleSeconds() != -1) {
                    l8 = TimeUnit.SECONDS.toMillis(((CacheControl)object).maxStaleSeconds());
                }
            }
            if (!((CacheControl)object2).noCache() && (l12 += l9) < l8 + l10) {
                object = this.cacheResponse.newBuilder();
                if (l12 >= l10) {
                    ((Response.Builder)object).addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                }
                if (l9 <= 86400000L) return new CacheStrategy(null, ((Response.Builder)object).build());
                if (!this.isFreshnessLifetimeHeuristic()) return new CacheStrategy(null, ((Response.Builder)object).build());
                ((Response.Builder)object).addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                return new CacheStrategy(null, ((Response.Builder)object).build());
            }
            object = this.etag;
            if (object != null) {
                object2 = "If-None-Match";
            } else {
                if (this.lastModified != null) {
                    object = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) return new CacheStrategy(this.request, null);
                    object = this.servedDateString;
                }
                object2 = "If-Modified-Since";
            }
            Headers.Builder builder = this.request.headers().newBuilder();
            l.c(object);
            builder.addLenient$okhttp((String)object2, (String)object);
            return new CacheStrategy(this.request.newBuilder().headers(builder.build()).build(), this.cacheResponse);
        }

        private final long computeFreshnessLifetime() {
            Object object = this.cacheResponse;
            l.c(object);
            object = ((Response)object).cacheControl();
            if (((CacheControl)object).maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(((CacheControl)object).maxAgeSeconds());
            }
            object = this.expires;
            if (object != null) {
                Date date = this.servedDate;
                long l8 = date != null ? date.getTime() : this.receivedResponseMillis;
                l8 = ((Date)object).getTime() - l8;
                if (l8 > 0L) {
                    return l8;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                object = this.servedDate;
                long l9 = object != null ? ((Date)object).getTime() : this.sentRequestMillis;
                object = this.lastModified;
                l.c(object);
                if ((l9 -= ((Date)object).getTime()) > 0L) {
                    return l9 / (long)10;
                }
            }
            return 0L;
        }

        private final boolean hasConditions(Request request) {
            return request.header("If-Modified-Since") != null || request.header("If-None-Match") != null;
            {
            }
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            l.c(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final CacheStrategy compute() {
            CacheStrategy cacheStrategy;
            CacheStrategy cacheStrategy2 = cacheStrategy = this.computeCandidate();
            if (cacheStrategy.getNetworkRequest() != null) {
                cacheStrategy2 = cacheStrategy;
                if (this.request.cacheControl().onlyIfCached()) {
                    cacheStrategy2 = new CacheStrategy(null, null);
                }
            }
            return cacheStrategy2;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }
    }
}


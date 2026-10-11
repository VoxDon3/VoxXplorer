/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.Ob.h;
import ax.sb.m;
import ax.tb.F;
import ax.tb.o;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public Request(HttpUrl httpUrl, String string, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        l.f(httpUrl, "url");
        l.f(string, "method");
        l.f(headers, "headers");
        l.f(map, "tags");
        this.url = httpUrl;
        this.method = string;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    public final RequestBody -deprecated_body() {
        return this.body;
    }

    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    public final Headers -deprecated_headers() {
        return this.headers;
    }

    public final String -deprecated_method() {
        return this.method;
    }

    public final HttpUrl -deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl;
        CacheControl cacheControl2 = cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            this.lazyCacheControl = cacheControl2 = CacheControl.Companion.parse(this.headers);
        }
        return cacheControl2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String string) {
        l.f(string, "name");
        return this.headers.get(string);
    }

    public final List<String> headers(String string) {
        l.f(string, "name");
        return this.headers.values(string);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return this.tag(Object.class);
    }

    public final <T> T tag(Class<? extends T> clazz) {
        l.f(clazz, "type");
        return clazz.cast(this.tags.get(clazz));
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Request{method=");
        ((StringBuilder)charSequence).append(this.method);
        ((StringBuilder)charSequence).append(", url=");
        ((StringBuilder)charSequence).append(this.url);
        if (this.headers.size() != 0) {
            ((StringBuilder)charSequence).append(", headers=[");
            Iterator iterator = this.headers.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (n8 < 0) {
                    o.r();
                }
                Object object2 = (m)object;
                object = (String)((m)object2).a();
                object2 = (String)((m)object2).b();
                if (n8 > 0) {
                    ((StringBuilder)charSequence).append(", ");
                }
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(':');
                ((StringBuilder)charSequence).append((String)object2);
                ++n8;
            }
            ((StringBuilder)charSequence).append(']');
        }
        if (!this.tags.isEmpty()) {
            ((StringBuilder)charSequence).append(", tags=");
            ((StringBuilder)charSequence).append(this.tags);
        }
        ((StringBuilder)charSequence).append('}');
        charSequence = ((StringBuilder)charSequence).toString();
        l.e(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public Builder(Request request) {
            l.f(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            Map<Object, Object> map = request.getTags$okhttp().isEmpty() ? new LinkedHashMap() : F.r(request.getTags$okhttp());
            this.tags = map;
            this.headers = request.headers().newBuilder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        public Builder addHeader(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.headers.add(string, string2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl object) {
            l.f(object, "cacheControl");
            object = ((CacheControl)object).toString();
            if (object.length() == 0) {
                return this.removeHeader("Cache-Control");
            }
            return this.header("Cache-Control", (String)object);
        }

        public final Builder delete() {
            return Builder.delete$default(this, null, 1, null);
        }

        public Builder delete(RequestBody requestBody) {
            return this.method("DELETE", requestBody);
        }

        public Builder get() {
            return this.method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return this.method("HEAD", null);
        }

        public Builder header(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.headers.set(string, string2);
            return this;
        }

        public Builder headers(Headers headers) {
            l.f(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String string, RequestBody object) {
            block5: {
                block8: {
                    block7: {
                        block6: {
                            l.f(string, "method");
                            if (string.length() <= 0) break block5;
                            if (object != null) break block6;
                            if (HttpMethod.requiresRequestBody(string)) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("method ");
                                ((StringBuilder)object).append(string);
                                ((StringBuilder)object).append(" must have a request body.");
                                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                            }
                            break block7;
                        }
                        if (!HttpMethod.permitsRequestBody(string)) break block8;
                    }
                    this.method = string;
                    this.body = object;
                    return this;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("method ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" must not have a request body.");
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        public Builder patch(RequestBody requestBody) {
            l.f(requestBody, "body");
            return this.method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            l.f(requestBody, "body");
            return this.method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            l.f(requestBody, "body");
            return this.method("PUT", requestBody);
        }

        public Builder removeHeader(String string) {
            l.f(string, "name");
            this.headers.removeAll(string);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            l.f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String string) {
            l.f(string, "<set-?>");
            this.method = string;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            l.f(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public <T> Builder tag(Class<? super T> clazz, T t8) {
            l.f(clazz, "type");
            if (t8 == null) {
                this.tags.remove(clazz);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            t8 = clazz.cast(t8);
            l.c(t8);
            map.put(clazz, t8);
            return this;
        }

        public Builder tag(Object object) {
            return this.tag(Object.class, object);
        }

        public Builder url(String string) {
            CharSequence charSequence;
            l.f(string, "url");
            if (h.F(string, "ws:", true)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("http:");
                string = string.substring(3);
                l.e(string, "this as java.lang.String).substring(startIndex)");
                ((StringBuilder)charSequence).append(string);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = string;
                if (h.F(string, "wss:", true)) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("https:");
                    string = string.substring(4);
                    l.e(string, "this as java.lang.String).substring(startIndex)");
                    ((StringBuilder)charSequence).append(string);
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            }
            return this.url(HttpUrl.Companion.get((String)charSequence));
        }

        public Builder url(URL object) {
            l.f(object, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            object = ((URL)object).toString();
            l.e(object, "url.toString()");
            return this.url(companion.get((String)object));
        }

        public Builder url(HttpUrl httpUrl) {
            l.f(httpUrl, "url");
            this.url = httpUrl;
            return this;
        }
    }
}


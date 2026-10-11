/*
 * Decompiled with CFR 0.152.
 */
package ax.Na;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;

public abstract class h {
    public static final MediaType b = MediaType.parse("text/xml; charset=utf-8");
    public static final MediaType c = MediaType.parse("application/octet-stream");
    protected Request.Builder a = new Request.Builder();

    h() {
        if (!HttpMethod.requiresRequestBody(this.c())) {
            this.a.method(this.c(), null);
        }
    }

    public void a(Headers headers) {
        this.a.headers(headers);
    }

    public Request b() {
        return this.a.build();
    }

    public abstract String c();

    public void d(String string) {
        this.a.removeHeader(string);
    }

    public void e(String string, String string2) {
        this.a.header(string, string2);
    }

    public void f(RequestBody requestBody) {
        this.a.method(this.c(), requestBody);
    }

    public void g(String string) {
        this.a.method(this.c(), RequestBody.create(b, string));
    }

    public void h(HttpUrl httpUrl) {
        this.a.url(httpUrl);
    }
}


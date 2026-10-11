package ax.Na;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;

/* loaded from: classes3.dex */
public abstract class h {
    public static final MediaType b = MediaType.parse("text/xml; charset=utf-8");
    public static final MediaType c = MediaType.parse("application/octet-stream");
    protected Request.Builder a = new Request.Builder();

    h() {
        if (HttpMethod.requiresRequestBody(c())) {
            return;
        }
        this.a.method(c(), null);
    }

    public void a(Headers headers) {
        this.a.headers(headers);
    }

    public Request b() {
        return this.a.build();
    }

    public abstract String c();

    public void d(String str) {
        this.a.removeHeader(str);
    }

    public void e(String str, String str2) {
        this.a.header(str, str2);
    }

    public void f(RequestBody requestBody) {
        this.a.method(c(), requestBody);
    }

    public void g(String str) {
        this.a.method(c(), RequestBody.create(b, str));
    }

    public void h(HttpUrl httpUrl) {
        this.a.url(httpUrl);
    }
}

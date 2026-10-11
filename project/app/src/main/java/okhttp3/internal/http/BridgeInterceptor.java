/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import ax.Ob.h;
import ax.tb.o;
import ax.xc.C;
import ax.xc.m;
import ax.xc.p;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;

public final class BridgeInterceptor
implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        l.f(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = ((Iterable)object).iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Object object2 = object.next();
            if (n8 < 0) {
                o.r();
            }
            object2 = (Cookie)object2;
            if (n8 > 0) {
                stringBuilder.append("; ");
            }
            stringBuilder.append(((Cookie)object2).name());
            stringBuilder.append('=');
            stringBuilder.append(((Cookie)object2).value());
            ++n8;
        }
        object = stringBuilder.toString();
        l.e(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }

    @Override
    public Response intercept(Interceptor.Chain object) throws IOException {
        l.f(object, "chain");
        Object object2 = object.request();
        Object object3 = ((Request)object2).newBuilder();
        List<Cookie> list = ((Request)object2).body();
        if (list != null) {
            long l8;
            MediaType mediaType = ((RequestBody)((Object)list)).contentType();
            if (mediaType != null) {
                ((Request.Builder)object3).header("Content-Type", mediaType.toString());
            }
            if ((l8 = ((RequestBody)((Object)list)).contentLength()) != -1L) {
                ((Request.Builder)object3).header("Content-Length", String.valueOf(l8));
                ((Request.Builder)object3).removeHeader("Transfer-Encoding");
            } else {
                ((Request.Builder)object3).header("Transfer-Encoding", "chunked");
                ((Request.Builder)object3).removeHeader("Content-Length");
            }
        }
        list = ((Request)object2).header("Host");
        boolean bl = false;
        if (list == null) {
            ((Request.Builder)object3).header("Host", Util.toHostHeader$default(((Request)object2).url(), false, 1, null));
        }
        if (((Request)object2).header("Connection") == null) {
            ((Request.Builder)object3).header("Connection", "Keep-Alive");
        }
        boolean bl2 = bl;
        if (((Request)object2).header("Accept-Encoding") == null) {
            bl2 = bl;
            if (((Request)object2).header("Range") == null) {
                ((Request.Builder)object3).header("Accept-Encoding", "gzip");
                bl2 = true;
            }
        }
        if (!((Collection)(list = this.cookieJar.loadForRequest(((Request)object2).url()))).isEmpty()) {
            ((Request.Builder)object3).header("Cookie", this.cookieHeader(list));
        }
        if (((Request)object2).header("User-Agent") == null) {
            ((Request.Builder)object3).header("User-Agent", "okhttp/4.12.0");
        }
        object = object.proceed(((Request.Builder)object3).build());
        HttpHeaders.receiveHeaders(this.cookieJar, ((Request)object2).url(), ((Response)object).headers());
        object2 = ((Response)object).newBuilder().request((Request)object2);
        if (bl2 && h.v("gzip", Response.header$default((Response)object, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody((Response)object) && (object3 = ((Response)object).body()) != null) {
            object3 = new m(((ResponseBody)object3).source());
            ((Response.Builder)object2).headers(((Response)object).headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            ((Response.Builder)object2).body(new RealResponseBody(Response.header$default((Response)object, "Content-Type", null, 2, null), -1L, p.d((C)object3)));
        }
        return ((Response.Builder)object2).build();
    }
}


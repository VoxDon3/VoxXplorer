/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String get(Request object, Proxy.Type type) {
        l.f(object, "request");
        l.f((Object)type, "proxyType");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Request)object).method());
        stringBuilder.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine((Request)object, type)) {
            stringBuilder.append(((Request)object).url());
        } else {
            stringBuilder.append(requestLine.requestPath(((Request)object).url()));
        }
        stringBuilder.append(" HTTP/1.1");
        object = stringBuilder.toString();
        l.e(object, "StringBuilder().apply(builderAction).toString()");
        return object;
    }

    public final String requestPath(HttpUrl object) {
        l.f(object, "url");
        String string = ((HttpUrl)object).encodedPath();
        String string2 = ((HttpUrl)object).encodedQuery();
        if (string2 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('?');
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        return string;
    }
}


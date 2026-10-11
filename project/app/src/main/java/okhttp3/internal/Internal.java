/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal;

import ax.Gb.l;
import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String string) {
        l.f(builder, "builder");
        l.f(string, "line");
        return builder.addLenient$okhttp(string);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String string, String string2) {
        l.f(builder, "builder");
        l.f(string, "name");
        l.f(string2, "value");
        return builder.addLenient$okhttp(string, string2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean bl) {
        l.f(connectionSpec, "connectionSpec");
        l.f(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, bl);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        l.f(cache, "cache");
        l.f(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean bl) {
        l.f(cookie, "cookie");
        return cookie.toString$okhttp(bl);
    }

    public static final Cookie parseCookie(long l8, HttpUrl httpUrl, String string) {
        l.f(httpUrl, "url");
        l.f(string, "setCookie");
        return Cookie.Companion.parse$okhttp(l8, httpUrl, string);
    }
}


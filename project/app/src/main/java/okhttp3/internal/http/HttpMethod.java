/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;

public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String string) {
        l.f(string, "method");
        return !l.a(string, "GET") && !l.a(string, "HEAD");
    }

    public static final boolean requiresRequestBody(String string) {
        l.f(string, "method");
        return l.a(string, "POST") || l.a(string, "PUT") || l.a(string, "PATCH") || l.a(string, "PROPPATCH") || l.a(string, "REPORT");
        {
        }
    }

    public final boolean invalidatesCache(String string) {
        l.f(string, "method");
        return l.a(string, "POST") || l.a(string, "PATCH") || l.a(string, "PUT") || l.a(string, "DELETE") || l.a(string, "MOVE");
        {
        }
    }

    public final boolean redirectsToGet(String string) {
        l.f(string, "method");
        return l.a(string, "PROPFIND") ^ true;
    }

    public final boolean redirectsWithBody(String string) {
        l.f(string, "method");
        return l.a(string, "PROPFIND");
    }
}


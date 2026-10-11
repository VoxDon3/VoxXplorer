/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import okhttp3.Response;
import okhttp3.ResponseBody;

public final class D<T> {
    private final Response a;
    private final T b;
    private final ResponseBody c;

    private D(Response response, T t8, ResponseBody responseBody) {
        this.a = response;
        this.b = t8;
        this.c = responseBody;
    }

    public static <T> D<T> c(ResponseBody responseBody, Response response) {
        j.Objects.requireNonNull((Object)responseBody, (String)"body == null");
        j.Objects.requireNonNull((Object)response, (String)"rawResponse == null");
        if (!response.isSuccessful()) {
            return new D<Object>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> D<T> g(T t8, Response response) {
        j.Objects.requireNonNull((Object)response, (String)"rawResponse == null");
        if (response.isSuccessful()) {
            return new D<T>(response, t8, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.code();
    }

    public ResponseBody d() {
        return this.c;
    }

    public boolean e() {
        return this.a.isSuccessful();
    }

    public String f() {
        return this.a.message();
    }

    public String toString() {
        return this.a.toString();
    }
}


package ax.ke;

import j$.util.Objects;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class D<T> {
    private final Response a;
    private final T b;
    private final ResponseBody c;

    private D(Response response, T t, ResponseBody responseBody) {
        this.a = response;
        this.b = t;
        this.c = responseBody;
    }

    public static <T> D<T> c(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new D<>(response, null, responseBody);
    }

    public static <T> D<T> g(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new D<>(response, t, null);
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

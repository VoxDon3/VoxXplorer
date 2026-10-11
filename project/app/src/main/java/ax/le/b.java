/*
 * Decompiled with CFR 0.152.
 */
package ax.le;

import ax.ke.i;
import ax.xc.e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;

final class b<T>
implements i<T, RequestBody> {
    private static final MediaType c = MediaType.get("application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    public RequestBody b(T t8) throws IOException {
        e e8 = new e();
        Closeable closeable = new OutputStreamWriter(e8.A0(), d);
        closeable = this.a.r((Writer)closeable);
        this.b.e((JsonWriter)closeable, t8);
        ((JsonWriter)closeable).close();
        return RequestBody.create(c, e8.m0());
    }
}


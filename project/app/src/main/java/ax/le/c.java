/*
 * Decompiled with CFR 0.152.
 */
package ax.le;

import ax.ke.i;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;

final class c<T>
implements i<ResponseBody, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    public T b(ResponseBody responseBody) throws IOException {
        Object object;
        block3: {
            Object object2 = this.a.q(responseBody.charStream());
            try {
                object = this.b.c((JsonReader)object2);
                JsonToken jsonToken = object2.peek();
                object2 = JsonToken.END_DOCUMENT;
                if (jsonToken != object2) break block3;
                responseBody.close();
            }
            catch (Throwable throwable) {
                responseBody.close();
                throw throwable;
            }
            return object;
        }
        object = new Object("JSON document was not fully consumed.");
        throw object;
    }
}


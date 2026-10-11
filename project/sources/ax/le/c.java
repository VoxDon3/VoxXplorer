package ax.le;

import ax.ke.InterfaceC2437i;
import ax.r8.C3001j;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
final class c<T> implements InterfaceC2437i<ResponseBody, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // ax.ke.InterfaceC2437i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(ResponseBody responseBody) throws IOException {
        JsonReader q = this.a.q(responseBody.charStream());
        try {
            T c = this.b.c(q);
            if (q.peek() == JsonToken.END_DOCUMENT) {
                return c;
            }
            throw new C3001j("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}

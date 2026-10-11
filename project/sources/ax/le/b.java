package ax.le;

import ax.ke.InterfaceC2437i;
import ax.xc.C3487e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
final class b<T> implements InterfaceC2437i<T, RequestBody> {
    private static final MediaType c = MediaType.get("application/json; charset=UTF-8");
    private static final Charset d = Charset.forName("UTF-8");
    private final Gson a;
    private final TypeAdapter<T> b;

    b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // ax.ke.InterfaceC2437i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(T t) throws IOException {
        C3487e c3487e = new C3487e();
        JsonWriter r = this.a.r(new OutputStreamWriter(c3487e.A0(), d));
        this.b.e(r, t);
        r.close();
        return RequestBody.create(c, c3487e.m0());
    }
}

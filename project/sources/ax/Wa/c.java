package ax.Wa;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class c implements Interceptor {
    private final List<ax.Sa.b> a;

    public c(List<ax.Sa.b> list) {
        this.a = list;
    }

    private static void a(Request.Builder builder, ax.Sa.b bVar) {
        builder.addHeader(bVar.a(), bVar.b());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder newBuilder = chain.request().newBuilder();
        Iterator<ax.Sa.b> it = this.a.iterator();
        while (it.hasNext()) {
            a(newBuilder, it.next());
        }
        return chain.proceed(newBuilder.build());
    }
}

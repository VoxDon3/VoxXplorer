/*
 * Decompiled with CFR 0.152.
 */
package ax.Wa;

import ax.Sa.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class c
implements Interceptor {
    private final List<b> a;

    public c(List<b> list) {
        this.a = list;
    }

    private static void a(Request.Builder builder, b b8) {
        builder.addHeader(b8.a(), b8.b());
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            c.a(builder, iterator.next());
        }
        return chain.proceed(builder.build());
    }
}


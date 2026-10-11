/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

public final class ConnectInterceptor
implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        l.f(chain, "chain");
        chain = (RealInterceptorChain)chain;
        return RealInterceptorChain.copy$okhttp$default((RealInterceptorChain)chain, 0, ((RealInterceptorChain)chain).getCall$okhttp().initExchange$okhttp((RealInterceptorChain)chain), null, 0, 0, 0, 61, null).proceed(((RealInterceptorChain)chain).getRequest$okhttp());
    }
}


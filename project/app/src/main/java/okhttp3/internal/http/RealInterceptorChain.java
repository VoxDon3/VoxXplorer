/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

public final class RealInterceptorChain
implements Interceptor.Chain {
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int n8, Exchange exchange, Request request, int n9, int n10, int n11) {
        l.f(realCall, "call");
        l.f(list, "interceptors");
        l.f(request, "request");
        this.call = realCall;
        this.interceptors = list;
        this.index = n8;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = n9;
        this.readTimeoutMillis = n10;
        this.writeTimeoutMillis = n11;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int n8, Exchange exchange, Request request, int n9, int n10, int n11, int n12, Object object) {
        if ((n12 & 1) != 0) {
            n8 = realInterceptorChain.index;
        }
        if ((n12 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        if ((n12 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        if ((n12 & 8) != 0) {
            n9 = realInterceptorChain.connectTimeoutMillis;
        }
        if ((n12 & 0x10) != 0) {
            n10 = realInterceptorChain.readTimeoutMillis;
        }
        if ((n12 & 0x20) != 0) {
            n11 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(n8, exchange, request, n9, n10, n11);
    }

    @Override
    public Call call() {
        return this.call;
    }

    @Override
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    public final RealInterceptorChain copy$okhttp(int n8, Exchange exchange, Request request, int n9, int n10, int n11) {
        l.f(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, n8, exchange, request, n9, n10, n11);
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    public final Request getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override
    public Response proceed(Request object) throws IOException {
        l.f(object, "request");
        if (this.index < this.interceptors.size()) {
            ++this.calls;
            Object object2 = this.exchange;
            if (object2 != null) {
                if (((Exchange)object2).getFinder$okhttp().sameHostAndPort(((Request)object).url())) {
                    if (this.calls != 1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("network interceptor ");
                        ((StringBuilder)object).append(this.interceptors.get(this.index - 1));
                        ((StringBuilder)object).append(" must call proceed() exactly once");
                        throw new IllegalStateException(((StringBuilder)object).toString().toString());
                    }
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("network interceptor ");
                    ((StringBuilder)object).append(this.interceptors.get(this.index - 1));
                    ((StringBuilder)object).append(" must retain the same host and port");
                    throw new IllegalStateException(((StringBuilder)object).toString().toString());
                }
            }
            RealInterceptorChain realInterceptorChain = RealInterceptorChain.copy$okhttp$default(this, this.index + 1, null, (Request)object, 0, 0, 0, 58, null);
            object = this.interceptors.get(this.index);
            object2 = object.intercept(realInterceptorChain);
            if (object2 != null) {
                if (this.exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChain.calls != 1) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("network interceptor ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(" must call proceed() exactly once");
                    throw new IllegalStateException(((StringBuilder)object2).toString().toString());
                }
                if (((Response)object2).body() != null) {
                    return object2;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("interceptor ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" returned a response with no body");
                throw new IllegalStateException(((StringBuilder)object2).toString().toString());
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("interceptor ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" returned null");
            throw new NullPointerException(((StringBuilder)object2).toString());
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override
    public Request request() {
        return this.request;
    }

    @Override
    public Interceptor.Chain withConnectTimeout(int n8, TimeUnit timeUnit) {
        l.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", n8, timeUnit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override
    public Interceptor.Chain withReadTimeout(int n8, TimeUnit timeUnit) {
        l.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", n8, timeUnit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override
    public Interceptor.Chain withWriteTimeout(int n8, TimeUnit timeUnit) {
        l.f((Object)timeUnit, "unit");
        if (this.exchange == null) {
            return RealInterceptorChain.copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", n8, timeUnit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}


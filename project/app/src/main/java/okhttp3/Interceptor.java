/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Request;
import okhttp3.Response;

public interface Interceptor {
    public static final Companion Companion = okhttp3.Interceptor$Companion.$$INSTANCE;

    public Response intercept(Chain var1) throws IOException;

    public static interface Chain {
        public Call call();

        public int connectTimeoutMillis();

        public Connection connection();

        public Response proceed(Request var1) throws IOException;

        public int readTimeoutMillis();

        public Request request();

        public Chain withConnectTimeout(int var1, TimeUnit var2);

        public Chain withReadTimeout(int var1, TimeUnit var2);

        public Chain withWriteTimeout(int var1, TimeUnit var2);

        public int writeTimeoutMillis();
    }

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(ax.Fb.l<? super Chain, Response> l8) {
            l.f(l8, "block");
            return new Interceptor(l8){
                final ax.Fb.l<Chain, Response> $block;
                {
                    this.$block = l8;
                }

                public final Response intercept(Chain chain) {
                    l.f(chain, "it");
                    return this.$block.invoke(chain);
                }
            };
        }
    }
}


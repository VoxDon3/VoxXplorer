/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.xc.A;
import ax.xc.C;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

public interface ExchangeCodec {
    public static final Companion Companion = okhttp3.internal.http.ExchangeCodec$Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    public void cancel();

    public A createRequestBody(Request var1, long var2) throws IOException;

    public void finishRequest() throws IOException;

    public void flushRequest() throws IOException;

    public RealConnection getConnection();

    public C openResponseBodySource(Response var1) throws IOException;

    public Response.Builder readResponseHeaders(boolean var1) throws IOException;

    public long reportedContentLength(Response var1) throws IOException;

    public Headers trailers() throws IOException;

    public void writeRequestHeaders(Request var1) throws IOException;

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }
}


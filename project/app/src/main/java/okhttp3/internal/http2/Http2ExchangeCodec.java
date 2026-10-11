/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;

public final class Http2ExchangeCodec
implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    public static final Companion Companion = new Companion(null);
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    public Http2ExchangeCodec(OkHttpClient object, RealConnection object2, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        l.f(object, "client");
        l.f(object2, CONNECTION);
        l.f(realInterceptorChain, "chain");
        l.f(http2Connection, "http2Connection");
        this.connection = object2;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        object2 = object.protocols();
        object = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!object2.contains(object)) {
            object = Protocol.HTTP_2;
        }
        this.protocol = object;
    }

    @Override
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override
    public A createRequestBody(Request object, long l8) {
        l.f(object, "request");
        object = this.stream;
        l.c(object);
        return ((Http2Stream)object).getSink();
    }

    @Override
    public void finishRequest() {
        Http2Stream http2Stream = this.stream;
        l.c(http2Stream);
        http2Stream.getSink().close();
    }

    @Override
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override
    public C openResponseBodySource(Response object) {
        l.f(object, "response");
        object = this.stream;
        l.c(object);
        return ((Http2Stream)object).getSource$okhttp();
    }

    @Override
    public Response.Builder readResponseHeaders(boolean bl) {
        Object object = this.stream;
        if (object != null) {
            object = ((Http2Stream)object).takeHeaders();
            object = Companion.readHttp2HeadersList((Headers)object, this.protocol);
            if (bl && ((Response.Builder)object).getCode$okhttp() == 100) {
                return null;
            }
            return object;
        }
        throw new IOException("stream wasn't created");
    }

    @Override
    public long reportedContentLength(Response response) {
        l.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        return Util.headersContentLength(response);
    }

    @Override
    public Headers trailers() {
        Http2Stream http2Stream = this.stream;
        l.c(http2Stream);
        return http2Stream.trailers();
    }

    @Override
    public void writeRequestHeaders(Request object) {
        l.f(object, "request");
        if (this.stream != null) {
            return;
        }
        boolean bl = ((Request)object).body() != null;
        object = Companion.http2HeadersList((Request)object);
        this.stream = this.http2Connection.newStream((List<Header>)object, bl);
        if (!this.canceled) {
            object = this.stream;
            l.c(object);
            Object object2 = ((Http2Stream)object).readTimeout();
            long l8 = this.chain.getReadTimeoutMillis$okhttp();
            object = TimeUnit.MILLISECONDS;
            ((D)object2).timeout(l8, (TimeUnit)((Object)object));
            object2 = this.stream;
            l.c(object2);
            ((Http2Stream)object2).writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), (TimeUnit)((Object)object));
            return;
        }
        object = this.stream;
        l.c(object);
        ((Http2Stream)object).closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final List<Header> http2HeadersList(Request object) {
            l.f(object, "request");
            Headers headers = ((Request)object).headers();
            ArrayList<Header> arrayList = new ArrayList<Header>(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, ((Request)object).method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(((Request)object).url())));
            Object object2 = ((Request)object).header("Host");
            if (object2 != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, (String)object2));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, ((Request)object).url().scheme()));
            int n8 = headers.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = headers.name(i8);
                object2 = Locale.US;
                l.e(object2, "US");
                object = ((String)object).toLowerCase((Locale)object2);
                l.e(object, "this as java.lang.String).toLowerCase(locale)");
                if (HTTP_2_SKIPPED_REQUEST_HEADERS.contains(object) && (!l.a(object, Http2ExchangeCodec.TE) || !l.a(headers.value(i8), "trailers"))) continue;
                arrayList.add(new Header((String)object, headers.value(i8)));
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
            l.f(headers, "headerBlock");
            l.f((Object)protocol, "protocol");
            Headers.Builder builder = new Headers.Builder();
            int n8 = headers.size();
            Object object = null;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object2;
                String string = headers.name(i8);
                String string2 = headers.value(i8);
                if (l.a(string, ":status")) {
                    object2 = StatusLine.Companion;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("HTTP/1.1 ");
                    ((StringBuilder)object).append(string2);
                    object2 = ((StatusLine.Companion)object2).parse(((StringBuilder)object).toString());
                } else {
                    object2 = object;
                    if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(string)) {
                        builder.addLenient$okhttp(string, string2);
                        object2 = object;
                    }
                }
                object = object2;
            }
            if (object != null) {
                return new Response.Builder().protocol(protocol).code(((StatusLine)object).code).message(((StatusLine)object).message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }
}


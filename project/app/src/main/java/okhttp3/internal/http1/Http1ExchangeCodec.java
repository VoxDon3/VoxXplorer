/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http1;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http1.HeadersReader;

public final class Http1ExchangeCodec
implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1L;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final f sink;
    private final ax.xc.g source;
    private int state;
    private Headers trailers;

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, ax.xc.g g8, f f8) {
        l.f(realConnection, "connection");
        l.f(g8, "source");
        l.f(f8, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = g8;
        this.sink = f8;
        this.headersReader = new HeadersReader(g8);
    }

    private final void detachTimeout(ax.xc.l l8) {
        D d8 = l8.a();
        l8.b(D.NONE);
        d8.clearDeadline();
        d8.clearTimeout();
    }

    private final boolean isChunked(Request request) {
        return h.v("chunked", request.header("Transfer-Encoding"), true);
    }

    private final boolean isChunked(Response response) {
        return h.v("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final A newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.state);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final C newChunkedSource(HttpUrl object) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, (HttpUrl)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(this.state);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    private final C newFixedLengthSource(long l8) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(this, l8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.state);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final A newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.state);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final C newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            this.getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource(this);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.state);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @Override
    public void cancel() {
        this.getConnection().cancel();
    }

    @Override
    public A createRequestBody(Request request, long l8) {
        l.f(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (this.isChunked(request)) {
            return this.newChunkedSink();
        }
        if (l8 != -1L) {
            return this.newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override
    public void finishRequest() {
        this.sink.flush();
    }

    @Override
    public void flushRequest() {
        this.sink.flush();
    }

    @Override
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override
    public C openResponseBodySource(Response response) {
        l.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return this.newFixedLengthSource(0L);
        }
        if (this.isChunked(response)) {
            return this.newChunkedSource(response.request().url());
        }
        long l8 = Util.headersContentLength(response);
        if (l8 != -1L) {
            return this.newFixedLengthSource(l8);
        }
        return this.newUnknownLengthSource();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Response.Builder readResponseHeaders(boolean bl) {
        EOFException eOFException2;
        block6: {
            Response.Builder builder;
            StatusLine statusLine;
            int n8 = this.state;
            if (n8 != 1 && n8 != 2 && n8 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("state: ");
                stringBuilder.append(this.state);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            try {
                statusLine = StatusLine.Companion.parse(this.headersReader.readLine());
                builder = new Response.Builder();
                builder = builder.protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.headersReader.readHeaders());
                if (bl && statusLine.code == 100) {
                    return null;
                }
            }
            catch (EOFException eOFException2) {
                break block6;
            }
            n8 = statusLine.code;
            if (n8 == 100) {
                this.state = 3;
                return builder;
            }
            if (102 <= n8 && n8 < 200) {
                this.state = 3;
                return builder;
            }
            this.state = 4;
            return builder;
        }
        String string = this.getConnection().route().address().url().redact();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected end of stream on ");
        stringBuilder.append(string);
        throw new IOException(stringBuilder.toString(), eOFException2);
    }

    @Override
    public long reportedContentLength(Response response) {
        l.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (this.isChunked(response)) {
            return -1L;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response closeable) {
        l.f(closeable, "response");
        long l8 = Util.headersContentLength((Response)closeable);
        if (l8 == -1L) {
            return;
        }
        closeable = this.newFixedLengthSource(l8);
        Util.skipAll((C)closeable, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        closeable.close();
    }

    @Override
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers;
            Headers headers2 = headers = this.trailers;
            if (headers == null) {
                headers2 = Util.EMPTY_HEADERS;
            }
            return headers2;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public final void writeRequest(Headers object, String string) {
        l.f(object, "headers");
        l.f(string, "requestLine");
        if (this.state == 0) {
            this.sink.f0(string).f0("\r\n");
            int n8 = ((Headers)object).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.sink.f0(((Headers)object).name(i8)).f0(": ").f0(((Headers)object).value(i8)).f0("\r\n");
            }
            this.sink.f0("\r\n");
            this.state = 1;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("state: ");
        ((StringBuilder)object).append(this.state);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    @Override
    public void writeRequestHeaders(Request request) {
        l.f(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Object object = this.getConnection().route().proxy().type();
        l.e(object, "connection.route().proxy.type()");
        object = requestLine.get(request, (Proxy.Type)((Object)object));
        this.writeRequest(request.headers(), (String)object);
    }

    private abstract class AbstractSource
    implements C,
    AutoCloseable {
        private boolean closed;
        final Http1ExchangeCodec this$0;
        private final ax.xc.l timeout;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec) {
            this.this$0 = http1ExchangeCodec;
            this.timeout = new ax.xc.l(http1ExchangeCodec.source.timeout());
        }

        @Override
        public abstract /* synthetic */ void close() throws IOException;

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final ax.xc.l getTimeout() {
            return this.timeout;
        }

        @Override
        public long read(e e8, long l8) {
            l.f(e8, "sink");
            try {
                l8 = this.this$0.source.read(e8, l8);
                return l8;
            }
            catch (IOException iOException) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
                throw iOException;
            }
        }

        public final void responseBodyComplete() {
            if (this.this$0.state == 6) {
                return;
            }
            if (this.this$0.state == 5) {
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 6;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.this$0.state);
            throw new IllegalStateException(stringBuilder.toString());
        }

        protected final void setClosed(boolean bl) {
            this.closed = bl;
        }

        @Override
        public D timeout() {
            return this.timeout;
        }
    }

    private final class ChunkedSink
    implements A,
    AutoCloseable {
        private boolean closed;
        final Http1ExchangeCodec this$0;
        private final ax.xc.l timeout;

        public ChunkedSink(Http1ExchangeCodec http1ExchangeCodec) {
            this.this$0 = http1ExchangeCodec;
            this.timeout = new ax.xc.l(http1ExchangeCodec.sink.timeout());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void close() {
            synchronized (this) {
                boolean bl = this.closed;
                if (bl) {
                    return;
                }
                this.closed = true;
                this.this$0.sink.f0("0\r\n\r\n");
                this.this$0.detachTimeout(this.timeout);
                this.this$0.state = 3;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void flush() {
            synchronized (this) {
                boolean bl = this.closed;
                if (bl) {
                    return;
                }
                this.this$0.sink.flush();
                return;
            }
        }

        @Override
        public D timeout() {
            return this.timeout;
        }

        @Override
        public void write(e e8, long l8) {
            l.f(e8, "source");
            if (!this.closed) {
                if (l8 == 0L) {
                    return;
                }
                this.this$0.sink.l0(l8);
                this.this$0.sink.f0("\r\n");
                this.this$0.sink.write(e8, l8);
                this.this$0.sink.f0("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    private final class ChunkedSource
    extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final Http1ExchangeCodec this$0;
        private final HttpUrl url;

        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            l.f(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            super(http1ExchangeCodec);
            this.url = httpUrl;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void readChunkSize() {
            Object object;
            block4: {
                Object object2;
                if (this.bytesRemainingInChunk != -1L) {
                    this.this$0.source.v0();
                }
                try {
                    boolean bl;
                    this.bytesRemainingInChunk = this.this$0.source.U0();
                    object = ((Object)h.A0(this.this$0.source.v0())).toString();
                    if (this.bytesRemainingInChunk < 0L || object.length() > 0 && !(bl = h.H((String)object, ";", false, 2, null))) break block4;
                    if (this.bytesRemainingInChunk != 0L) return;
                    this.hasMoreChunks = false;
                    object2 = this.this$0;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new ProtocolException(numberFormatException.getMessage());
                }
                ((Http1ExchangeCodec)object2).trailers = ((Http1ExchangeCodec)object2).headersReader.readHeaders();
                object2 = this.this$0.client;
                l.c(object2);
                CookieJar cookieJar = ((OkHttpClient)object2).cookieJar();
                object = this.url;
                object2 = this.this$0.trailers;
                l.c(object2);
                HttpHeaders.receiveHeaders(cookieJar, (HttpUrl)object, (Headers)object2);
                this.responseBodyComplete();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected chunk size and optional extensions but was \"");
            stringBuilder.append(this.bytesRemainingInChunk);
            stringBuilder.append((String)object);
            stringBuilder.append('\"');
            ProtocolException protocolException = new ProtocolException(stringBuilder.toString());
            throw protocolException;
        }

        @Override
        public void close() {
            if (this.getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override
        public long read(e object, long l8) {
            l.f(object, "sink");
            if (l8 >= 0L) {
                if (!this.getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long l9 = this.bytesRemainingInChunk;
                    if (l9 == 0L || l9 == -1L) {
                        this.readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    if ((l8 = super.read((e)object, Math.min(l8, this.bytesRemainingInChunk))) != -1L) {
                        this.bytesRemainingInChunk -= l8;
                        return l8;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    object = new ProtocolException("unexpected end of stream");
                    this.responseBodyComplete();
                    throw object;
                }
                throw new IllegalStateException("closed");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

    private final class FixedLengthSource
    extends AbstractSource {
        private long bytesRemaining;
        final Http1ExchangeCodec this$0;

        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, long l8) {
            this.this$0 = http1ExchangeCodec;
            super(http1ExchangeCodec);
            this.bytesRemaining = l8;
            if (l8 == 0L) {
                this.responseBodyComplete();
            }
        }

        @Override
        public void close() {
            if (this.getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0L && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override
        public long read(e object, long l8) {
            l.f(object, "sink");
            if (l8 >= 0L) {
                if (!this.getClosed()) {
                    long l9 = this.bytesRemaining;
                    if (l9 == 0L) {
                        return -1L;
                    }
                    if ((l9 = super.read((e)object, Math.min(l9, l8))) != -1L) {
                        this.bytesRemaining = l8 = this.bytesRemaining - l9;
                        if (l8 == 0L) {
                            this.responseBodyComplete();
                        }
                        return l9;
                    }
                    this.this$0.getConnection().noNewExchanges$okhttp();
                    object = new ProtocolException("unexpected end of stream");
                    this.responseBodyComplete();
                    throw object;
                }
                throw new IllegalStateException("closed");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }

    private final class KnownLengthSink
    implements A,
    AutoCloseable {
        private boolean closed;
        final Http1ExchangeCodec this$0;
        private final ax.xc.l timeout;

        public KnownLengthSink(Http1ExchangeCodec http1ExchangeCodec) {
            this.this$0 = http1ExchangeCodec;
            this.timeout = new ax.xc.l(http1ExchangeCodec.sink.timeout());
        }

        @Override
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.this$0.detachTimeout(this.timeout);
            this.this$0.state = 3;
        }

        @Override
        public void flush() {
            if (this.closed) {
                return;
            }
            this.this$0.sink.flush();
        }

        @Override
        public D timeout() {
            return this.timeout;
        }

        @Override
        public void write(e e8, long l8) {
            l.f(e8, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(e8.size(), 0L, l8);
                this.this$0.sink.write(e8, l8);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    private final class UnknownLengthSource
    extends AbstractSource {
        private boolean inputExhausted;
        final Http1ExchangeCodec this$0;

        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec) {
            this.this$0 = http1ExchangeCodec;
            super(http1ExchangeCodec);
        }

        @Override
        public void close() {
            if (this.getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                this.responseBodyComplete();
            }
            this.setClosed(true);
        }

        @Override
        public long read(e object, long l8) {
            l.f(object, "sink");
            if (l8 >= 0L) {
                if (!this.getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    if ((l8 = super.read((e)object, l8)) == -1L) {
                        this.inputExhausted = true;
                        this.responseBodyComplete();
                        return -1L;
                    }
                    return l8;
                }
                throw new IllegalStateException("closed");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("byteCount < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
    }
}


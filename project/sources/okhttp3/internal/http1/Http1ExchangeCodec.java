package okhttp3.internal.http1;

import ax.Ob.h;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.D;
import ax.xc.InterfaceC3482A;
import ax.xc.InterfaceC3488f;
import ax.xc.g;
import ax.xc.l;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
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

/* loaded from: classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
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
    private final InterfaceC3488f sink;
    private final g source;
    private int state;
    private Headers trailers;

    private abstract class AbstractSource implements C, AutoCloseable {
        private boolean closed;
        private final l timeout;

        public AbstractSource() {
            this.timeout = new l(Http1ExchangeCodec.this.source.timeout());
        }

        @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        protected final boolean getClosed() {
            return this.closed;
        }

        protected final l getTimeout() {
            return this.timeout;
        }

        @Override // ax.xc.C
        public long read(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(c3487e, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        protected final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // ax.xc.C
        public D timeout() {
            return this.timeout;
        }
    }

    private final class ChunkedSink implements InterfaceC3482A, AutoCloseable {
        private boolean closed;
        private final l timeout;

        public ChunkedSink() {
            this.timeout = new l(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.f0("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // ax.xc.InterfaceC3482A
        public D timeout() {
            return this.timeout;
        }

        @Override // ax.xc.InterfaceC3482A
        public void write(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec.this.sink.l0(j);
            Http1ExchangeCodec.this.sink.f0("\r\n");
            Http1ExchangeCodec.this.sink.write(c3487e, j);
            Http1ExchangeCodec.this.sink.f0("\r\n");
        }
    }

    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            ax.Gb.l.f(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.source.v0();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.U0();
                String obj = h.A0(this.this$0.source.v0()).toString();
                if (this.bytesRemainingInChunk < 0 || (obj.length() > 0 && !h.H(obj, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                    http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                    OkHttpClient okHttpClient = this.this$0.client;
                    ax.Gb.l.c(okHttpClient);
                    CookieJar cookieJar = okHttpClient.cookieJar();
                    HttpUrl httpUrl = this.url;
                    Headers headers = this.this$0.trailers;
                    ax.Gb.l.c(headers);
                    HttpHeaders.receiveHeaders(cookieJar, httpUrl, headers);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C
        public long read(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long j2 = this.bytesRemainingInChunk;
            if (j2 == 0 || j2 == Http1ExchangeCodec.NO_CHUNK_YET) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return Http1ExchangeCodec.NO_CHUNK_YET;
                }
            }
            long read = super.read(c3487e, Math.min(j, this.bytesRemainingInChunk));
            if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.bytesRemainingInChunk -= read;
                return read;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(ax.Gb.g gVar) {
            this();
        }

        private Companion() {
        }
    }

    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C
        public long read(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.bytesRemaining;
            if (j2 == 0) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long read = super.read(c3487e, Math.min(j2, j));
            if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j3 = this.bytesRemaining - read;
            this.bytesRemaining = j3;
            if (j3 == 0) {
                responseBodyComplete();
            }
            return read;
        }
    }

    private final class KnownLengthSink implements InterfaceC3482A, AutoCloseable {
        private boolean closed;
        private final l timeout;

        public KnownLengthSink() {
            this.timeout = new l(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // ax.xc.InterfaceC3482A
        public D timeout() {
            return this.timeout;
        }

        @Override // ax.xc.InterfaceC3482A
        public void write(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(c3487e.size(), 0L, j);
            Http1ExchangeCodec.this.sink.write(c3487e, j);
        }
    }

    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, ax.xc.C
        public long read(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return Http1ExchangeCodec.NO_CHUNK_YET;
            }
            long read = super.read(c3487e, j);
            if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                return read;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return Http1ExchangeCodec.NO_CHUNK_YET;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, g gVar, InterfaceC3488f interfaceC3488f) {
        ax.Gb.l.f(realConnection, "connection");
        ax.Gb.l.f(gVar, "source");
        ax.Gb.l.f(interfaceC3488f, "sink");
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = gVar;
        this.sink = interfaceC3488f;
        this.headersReader = new HeadersReader(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(l lVar) {
        D a = lVar.a();
        lVar.b(D.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return h.v("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
    }

    private final InterfaceC3482A newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC3482A newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public InterfaceC3482A createRequestBody(Request request, long j) {
        ax.Gb.l.f(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public C openResponseBodySource(Response response) {
        ax.Gb.l.f(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        return headersContentLength != NO_CHUNK_YET ? newFixedLengthSource(headersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            int i2 = parse.code;
            if (i2 == 100) {
                this.state = 3;
                return headers;
            }
            if (102 > i2 || i2 >= 200) {
                this.state = 4;
                return headers;
            }
            this.state = 3;
            return headers;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on " + getConnection().route().address().url().redact(), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        ax.Gb.l.f(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return isChunked(response) ? NO_CHUNK_YET : Util.headersContentLength(response);
        }
        return 0L;
    }

    public final void skipConnectBody(Response response) {
        ax.Gb.l.f(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == NO_CHUNK_YET) {
            return;
        }
        C newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, SubsamplingScaleImageView.TILE_SIZE_AUTO, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        Headers headers = this.trailers;
        return headers == null ? Util.EMPTY_HEADERS : headers;
    }

    public final void writeRequest(Headers headers, String str) {
        ax.Gb.l.f(headers, "headers");
        ax.Gb.l.f(str, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.f0(str).f0("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.f0(headers.name(i)).f0(": ").f0(headers.value(i)).f0("\r\n");
        }
        this.sink.f0("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        ax.Gb.l.f(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        ax.Gb.l.e(type, "connection.route().proxy.type()");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return h.v("chunked", request.header("Transfer-Encoding"), true);
    }
}

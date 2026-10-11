/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.C;
import ax.xc.e;
import ax.xc.j;
import ax.xc.k;
import ax.xc.p;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;

public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        l.f(realCall, "call");
        l.f(eventListener, "eventListener");
        l.f(exchangeFinder, "finder");
        l.f(exchangeCodec, "codec");
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
        this.connection = exchangeCodec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long l8, boolean bl, boolean bl2, E e8) {
        if (e8 != null) {
            this.trackFailure(e8);
        }
        if (bl2) {
            if (e8 != null) {
                this.eventListener.requestFailed(this.call, e8);
            } else {
                this.eventListener.requestBodyEnd(this.call, l8);
            }
        }
        if (bl) {
            if (e8 != null) {
                this.eventListener.responseFailed(this.call, e8);
            } else {
                this.eventListener.responseBodyEnd(this.call, l8);
            }
        }
        return this.call.messageDone$okhttp(this, bl2, bl, e8);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final A createRequestBody(Request request, boolean bl) throws IOException {
        l.f(request, "request");
        this.isDuplex = bl;
        RequestBody requestBody = request.body();
        l.c(requestBody);
        long l8 = requestBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, l8), l8);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
            return;
        }
        catch (IOException iOException) {
            this.eventListener.requestFailed(this.call, iOException);
            this.trackFailure(iOException);
            throw iOException;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
            return;
        }
        catch (IOException iOException) {
            this.eventListener.requestFailed(this.call, iOException);
            this.trackFailure(iOException);
            throw iOException;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return l.a(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host()) ^ true;
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response closeable) throws IOException {
        l.f(closeable, "response");
        try {
            String string = Response.header$default(closeable, "Content-Type", null, 2, null);
            long l8 = this.codec.reportedContentLength((Response)closeable);
            closeable = this.codec.openResponseBodySource((Response)closeable);
            ResponseBodySource responseBodySource = new ResponseBodySource(this, (C)closeable, l8);
            closeable = new RealResponseBody(string, l8, p.d(responseBodySource));
            return closeable;
        }
        catch (IOException iOException) {
            this.eventListener.responseFailed(this.call, iOException);
            this.trackFailure(iOException);
            throw iOException;
        }
    }

    public final Response.Builder readResponseHeaders(boolean bl) throws IOException {
        IOException iOException2;
        block4: {
            Response.Builder builder;
            block3: {
                try {
                    builder = this.codec.readResponseHeaders(bl);
                    if (builder == null) break block3;
                }
                catch (IOException iOException2) {}
                builder.initExchange$okhttp(this);
                return builder;
                break block4;
            }
            return builder;
        }
        this.eventListener.responseFailed(this.call, iOException2);
        this.trackFailure(iOException2);
        throw iOException2;
    }

    public final void responseHeadersEnd(Response response) {
        l.f(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        this.bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        l.f(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
            return;
        }
        catch (IOException iOException) {
            this.eventListener.requestFailed(this.call, iOException);
            this.trackFailure(iOException);
            throw iOException;
        }
    }

    private final class RequestBodySink
    extends j {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final Exchange this$0;

        public RequestBodySink(Exchange exchange, A a8, long l8) {
            l.f(a8, "delegate");
            this.this$0 = exchange;
            super(a8);
            this.contentLength = l8;
        }

        private final <E extends IOException> E complete(E e8) {
            if (this.completed) {
                return e8;
            }
            this.completed = true;
            return this.this$0.bodyComplete(this.bytesReceived, false, true, e8);
        }

        @Override
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long l8 = this.contentLength;
            if (l8 != -1L && this.bytesReceived != l8) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                this.complete(null);
                return;
            }
            catch (IOException iOException) {
                throw this.complete(iOException);
            }
        }

        @Override
        public void flush() throws IOException {
            try {
                super.flush();
                return;
            }
            catch (IOException iOException) {
                throw this.complete(iOException);
            }
        }

        @Override
        public void write(e object, long l8) throws IOException {
            l.f(object, "source");
            if (!this.closed) {
                long l9 = this.contentLength;
                if (l9 != -1L && this.bytesReceived + l8 > l9) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("expected ");
                    ((StringBuilder)object).append(this.contentLength);
                    ((StringBuilder)object).append(" bytes but received ");
                    ((StringBuilder)object).append(this.bytesReceived + l8);
                    throw new ProtocolException(((StringBuilder)object).toString());
                }
                try {
                    super.write((e)object, l8);
                    this.bytesReceived += l8;
                    return;
                }
                catch (IOException iOException) {
                    throw this.complete(iOException);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    public final class ResponseBodySource
    extends k {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final Exchange this$0;

        public ResponseBodySource(Exchange exchange, C c8, long l8) {
            l.f(c8, "delegate");
            this.this$0 = exchange;
            super(c8);
            this.contentLength = l8;
            this.invokeStartEvent = true;
            if (l8 == 0L) {
                this.complete(null);
            }
        }

        @Override
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                this.complete(null);
                return;
            }
            catch (IOException iOException) {
                throw this.complete(iOException);
            }
        }

        public final <E extends IOException> E complete(E e8) {
            if (this.completed) {
                return e8;
            }
            this.completed = true;
            if (e8 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return this.this$0.bodyComplete(this.bytesReceived, true, false, e8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public long read(e object, long l8) throws IOException {
            long l9;
            l.f(object, "sink");
            if (this.closed) throw new IllegalStateException("closed");
            try {
                l9 = this.delegate().read((e)object, l8);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
            }
            catch (IOException iOException) {
                throw this.complete(iOException);
            }
            if (l9 == -1L) {
                this.complete(null);
                return -1L;
            }
            long l10 = this.bytesReceived + l9;
            l8 = this.contentLength;
            if (l8 != -1L && l10 > l8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected ");
                stringBuilder.append(this.contentLength);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(l10);
                object = new ProtocolException(stringBuilder.toString());
                throw object;
            }
            this.bytesReceived = l10;
            if (l10 != l8) return l9;
            this.complete(null);
            return l9;
        }
    }
}


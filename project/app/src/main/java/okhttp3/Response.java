/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.tb.o;
import ax.xc.e;
import ax.xc.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okhttp3.CacheControl;
import okhttp3.Challenge;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Response
implements Closeable,
AutoCloseable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String string, int n8, Handshake handshake2, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long l8, long l9, Exchange exchange) {
        l.f(request, "request");
        l.f((Object)protocol, "protocol");
        l.f(string, "message");
        l.f(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = string;
        this.code = n8;
        this.handshake = handshake2;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = l8;
        this.receivedResponseAtMillis = l9;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String string, String string2, int n8, Object object) {
        if ((n8 & 2) != 0) {
            string2 = null;
        }
        return response.header(string, string2);
    }

    public final ResponseBody -deprecated_body() {
        return this.body;
    }

    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    public final Response -deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    public final int -deprecated_code() {
        return this.code;
    }

    public final Handshake -deprecated_handshake() {
        return this.handshake;
    }

    public final Headers -deprecated_headers() {
        return this.headers;
    }

    public final String -deprecated_message() {
        return this.message;
    }

    public final Response -deprecated_networkResponse() {
        return this.networkResponse;
    }

    public final Response -deprecated_priorResponse() {
        return this.priorResponse;
    }

    public final Protocol -deprecated_protocol() {
        return this.protocol;
    }

    public final long -deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request -deprecated_request() {
        return this.request;
    }

    public final long -deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl;
        CacheControl cacheControl2 = cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            this.lazyCacheControl = cacheControl2 = CacheControl.Companion.parse(this.headers);
        }
        return cacheControl2;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String string;
        Headers headers = this.headers;
        int n8 = this.code;
        if (n8 != 401) {
            if (n8 != 407) {
                return o.j();
            }
            string = "Proxy-Authenticate";
        } else {
            string = "WWW-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, string);
    }

    @Override
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String string) {
        l.f(string, "name");
        return Response.header$default(this, string, null, 2, null);
    }

    public final String header(String string, String string2) {
        l.f(string, "name");
        string = this.headers.get(string);
        if (string == null) {
            return string2;
        }
        return string;
    }

    public final List<String> headers(String string) {
        l.f(string, "name");
        return this.headers.values(string);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int n8 = this.code;
        if (n8 != 307 && n8 != 308) {
            switch (n8) {
                default: {
                    return false;
                }
                case 300: 
                case 301: 
                case 302: 
                case 303: 
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int n8 = this.code;
        return 200 <= n8 && n8 < 300;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long l8) throws IOException {
        Closeable closeable = this.body;
        l.c(closeable);
        g g8 = ((ResponseBody)closeable).source().peek();
        closeable = new e();
        g8.r0(l8);
        ((e)closeable).g1(g8, Math.min(l8, g8.k().size()));
        return ResponseBody.Companion.create((g)closeable, this.body.contentType(), ((e)closeable).size());
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response{protocol=");
        stringBuilder.append((Object)this.protocol);
        stringBuilder.append(", code=");
        stringBuilder.append(this.code);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", url=");
        stringBuilder.append(this.request.url());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(Response response) {
            l.f(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (response.body() == null) {
                    return;
                }
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String string, Response object) {
            if (object != null) {
                if (((Response)object).body() == null) {
                    if (((Response)object).networkResponse() == null) {
                        if (((Response)object).cacheResponse() == null) {
                            if (((Response)object).priorResponse() == null) {
                                return;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append(string);
                            ((StringBuilder)object).append(".priorResponse != null");
                            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(".cacheResponse != null");
                        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(".networkResponse != null");
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(".body != null");
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
        }

        public Builder addHeader(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.headers.add(string, string2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            int n8 = this.code;
            if (n8 >= 0) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String string = this.message;
                        if (string != null) {
                            return new Response(request, protocol, string, n8, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("code < 0: ");
            stringBuilder.append(this.code);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }

        public Builder cacheResponse(Response response) {
            this.checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int n8) {
            this.code = n8;
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake2) {
            this.handshake = handshake2;
            return this;
        }

        public Builder header(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.headers.set(string, string2);
            return this;
        }

        public Builder headers(Headers headers) {
            l.f(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            l.f(exchange, "deferredTrailers");
            this.exchange = exchange;
        }

        public Builder message(String string) {
            l.f(string, "message");
            this.message = string;
            return this;
        }

        public Builder networkResponse(Response response) {
            this.checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(Response response) {
            this.checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            l.f((Object)protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long l8) {
            this.receivedResponseAtMillis = l8;
            return this;
        }

        public Builder removeHeader(String string) {
            l.f(string, "name");
            this.headers.removeAll(string);
            return this;
        }

        public Builder request(Request request) {
            l.f(request, "request");
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long l8) {
            this.sentRequestAtMillis = l8;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int n8) {
            this.code = n8;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake2) {
            this.handshake = handshake2;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            l.f(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(String string) {
            this.message = string;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long l8) {
            this.receivedResponseAtMillis = l8;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long l8) {
            this.sentRequestAtMillis = l8;
        }
    }
}


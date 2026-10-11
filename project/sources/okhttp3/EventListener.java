package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        l.f(call, "call");
        l.f(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        l.f(call, "call");
        l.f(response, "response");
    }

    public void cacheMiss(Call call) {
        l.f(call, "call");
    }

    public void callEnd(Call call) {
        l.f(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        l.f(call, "call");
        l.f(iOException, "ioe");
    }

    public void callStart(Call call) {
        l.f(call, "call");
    }

    public void canceled(Call call) {
        l.f(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        l.f(call, "call");
        l.f(inetSocketAddress, "inetSocketAddress");
        l.f(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        l.f(call, "call");
        l.f(inetSocketAddress, "inetSocketAddress");
        l.f(proxy, "proxy");
        l.f(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        l.f(call, "call");
        l.f(inetSocketAddress, "inetSocketAddress");
        l.f(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        l.f(call, "call");
        l.f(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        l.f(call, "call");
        l.f(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        l.f(call, "call");
        l.f(str, "domainName");
        l.f(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        l.f(call, "call");
        l.f(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        l.f(call, "call");
        l.f(httpUrl, "url");
        l.f(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        l.f(call, "call");
        l.f(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        l.f(call, "call");
    }

    public void requestBodyStart(Call call) {
        l.f(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        l.f(call, "call");
        l.f(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        l.f(call, "call");
        l.f(request, "request");
    }

    public void requestHeadersStart(Call call) {
        l.f(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        l.f(call, "call");
    }

    public void responseBodyStart(Call call) {
        l.f(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        l.f(call, "call");
        l.f(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        l.f(call, "call");
        l.f(response, "response");
    }

    public void responseHeadersStart(Call call) {
        l.f(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        l.f(call, "call");
        l.f(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        l.f(call, "call");
    }

    public void secureConnectStart(Call call) {
        l.f(call, "call");
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener(){};

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

    public void dnsEnd(Call call, String string, List<InetAddress> list) {
        l.f(call, "call");
        l.f(string, "domainName");
        l.f(list, "inetAddressList");
    }

    public void dnsStart(Call call, String string) {
        l.f(call, "call");
        l.f(string, "domainName");
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

    public void requestBodyEnd(Call call, long l8) {
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

    public void responseBodyEnd(Call call, long l8) {
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

    public void secureConnectEnd(Call call, Handshake handshake2) {
        l.f(call, "call");
    }

    public void secureConnectStart(Call call) {
        l.f(call, "call");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }

    public static interface Factory {
        public EventListener create(Call var1);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.o;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OkHttpClient
implements Cloneable,
Call.Factory,
WebSocket.Factory {
    public static final Companion Companion = new Companion(null);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS;
    private static final List<Protocol> DEFAULT_PROTOCOLS;
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    static {
        DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
        DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(Builder object) {
        Object object2;
        Object object3;
        l.f(object, "builder");
        this.dispatcher = ((Builder)object).getDispatcher$okhttp();
        this.connectionPool = ((Builder)object).getConnectionPool$okhttp();
        this.interceptors = Util.toImmutableList(((Builder)object).getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(((Builder)object).getNetworkInterceptors$okhttp());
        this.eventListenerFactory = ((Builder)object).getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = ((Builder)object).getRetryOnConnectionFailure$okhttp();
        this.authenticator = ((Builder)object).getAuthenticator$okhttp();
        this.followRedirects = ((Builder)object).getFollowRedirects$okhttp();
        this.followSslRedirects = ((Builder)object).getFollowSslRedirects$okhttp();
        this.cookieJar = ((Builder)object).getCookieJar$okhttp();
        this.cache = ((Builder)object).getCache$okhttp();
        this.dns = ((Builder)object).getDns$okhttp();
        this.proxy = ((Builder)object).getProxy$okhttp();
        if (((Builder)object).getProxy$okhttp() != null) {
            object3 = NullProxySelector.INSTANCE;
        } else {
            object2 = object3 = ((Builder)object).getProxySelector$okhttp();
            if (object3 == null) {
                object2 = ProxySelector.getDefault();
            }
            object3 = object2;
            if (object2 == null) {
                object3 = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = object3;
        this.proxyAuthenticator = ((Builder)object).getProxyAuthenticator$okhttp();
        this.socketFactory = ((Builder)object).getSocketFactory$okhttp();
        List<ConnectionSpec> list = ((Builder)object).getConnectionSpecs$okhttp();
        this.connectionSpecs = list;
        this.protocols = ((Builder)object).getProtocols$okhttp();
        this.hostnameVerifier = ((Builder)object).getHostnameVerifier$okhttp();
        this.callTimeoutMillis = ((Builder)object).getCallTimeout$okhttp();
        this.connectTimeoutMillis = ((Builder)object).getConnectTimeout$okhttp();
        this.readTimeoutMillis = ((Builder)object).getReadTimeout$okhttp();
        this.writeTimeoutMillis = ((Builder)object).getWriteTimeout$okhttp();
        this.pingIntervalMillis = ((Builder)object).getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = ((Builder)object).getMinWebSocketMessageToCompress$okhttp();
        object2 = object3 = ((Builder)object).getRouteDatabase$okhttp();
        if (object3 == null) {
            object2 = new RouteDatabase();
        }
        this.routeDatabase = object2;
        object2 = list;
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!((ConnectionSpec)object2.next()).isTls()) continue;
                if (((Builder)object).getSslSocketFactoryOrNull$okhttp() != null) {
                    this.sslSocketFactoryOrNull = ((Builder)object).getSslSocketFactoryOrNull$okhttp();
                    object2 = ((Builder)object).getCertificateChainCleaner$okhttp();
                    l.c(object2);
                    this.certificateChainCleaner = object2;
                    object3 = ((Builder)object).getX509TrustManagerOrNull$okhttp();
                    l.c(object3);
                    this.x509TrustManager = object3;
                    object = ((Builder)object).getCertificatePinner$okhttp();
                    l.c(object2);
                    this.certificatePinner = ((CertificatePinner)object).withCertificateChainCleaner$okhttp((CertificateChainCleaner)object2);
                } else {
                    object3 = Platform.Companion;
                    this.x509TrustManager = object2 = ((Platform.Companion)object3).get().platformTrustManager();
                    object3 = ((Platform.Companion)object3).get();
                    l.c(object2);
                    this.sslSocketFactoryOrNull = ((Platform)object3).newSslSocketFactory((X509TrustManager)object2);
                    object3 = CertificateChainCleaner.Companion;
                    l.c(object2);
                    this.certificateChainCleaner = object2 = ((CertificateChainCleaner.Companion)object3).get((X509TrustManager)object2);
                    object = ((Builder)object).getCertificatePinner$okhttp();
                    l.c(object2);
                    this.certificatePinner = ((CertificatePinner)object).withCertificateChainCleaner$okhttp((CertificateChainCleaner)object2);
                }
                break;
            }
        } else {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        this.verifyClientState();
    }

    private final void verifyClientState() {
        Object object;
        block11: {
            block12: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                block10: {
                                    object = this.interceptors;
                                    l.d(object, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (object.contains(null)) break block11;
                                    object = this.networkInterceptors;
                                    l.d(object, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (object.contains(null)) break block12;
                                    object = this.connectionSpecs;
                                    if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                                        object = object.iterator();
                                        while (object.hasNext()) {
                                            if (!((ConnectionSpec)object.next()).isTls()) continue;
                                            if (this.sslSocketFactoryOrNull != null) {
                                                if (this.certificateChainCleaner != null) {
                                                    if (this.x509TrustManager == null) {
                                                        throw new IllegalStateException("x509TrustManager == null");
                                                    }
                                                    break block10;
                                                }
                                                throw new IllegalStateException("certificateChainCleaner == null");
                                            }
                                            throw new IllegalStateException("sslSocketFactory == null");
                                        }
                                    }
                                    if (this.sslSocketFactoryOrNull != null) break block13;
                                    if (this.certificateChainCleaner != null) break block14;
                                    if (this.x509TrustManager != null) break block15;
                                    if (!l.a(this.certificatePinner, CertificatePinner.DEFAULT)) break block16;
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.");
                        }
                        throw new IllegalStateException("Check failed.");
                    }
                    throw new IllegalStateException("Check failed.");
                }
                throw new IllegalStateException("Check failed.");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Null network interceptor: ");
            ((StringBuilder)object).append(this.networkInterceptors);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Null interceptor: ");
        ((StringBuilder)object).append(this.interceptors);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final Authenticator -deprecated_authenticator() {
        return this.authenticator;
    }

    public final Cache -deprecated_cache() {
        return this.cache;
    }

    public final int -deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificatePinner -deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    public final int -deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool -deprecated_connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> -deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar -deprecated_cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher -deprecated_dispatcher() {
        return this.dispatcher;
    }

    public final Dns -deprecated_dns() {
        return this.dns;
    }

    public final EventListener.Factory -deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean -deprecated_followRedirects() {
        return this.followRedirects;
    }

    public final boolean -deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> -deprecated_interceptors() {
        return this.interceptors;
    }

    public final List<Interceptor> -deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    public final int -deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> -deprecated_protocols() {
        return this.protocols;
    }

    public final Proxy -deprecated_proxy() {
        return this.proxy;
    }

    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector -deprecated_proxySelector() {
        return this.proxySelector;
    }

    public final int -deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean -deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory -deprecated_socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory();
    }

    public final int -deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override
    public Call newCall(Request request) {
        l.f(request, "request");
        return new RealCall(this, request, false);
    }

    @Override
    public WebSocket newWebSocket(Request object, WebSocketListener webSocketListener) {
        l.f(object, "request");
        l.f(webSocketListener, "listener");
        object = new RealWebSocket(TaskRunner.INSTANCE, (Request)object, webSocketListener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        ((RealWebSocket)object).connect(this);
        return object;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList<Interceptor>();
            this.networkInterceptors = new ArrayList<Interceptor>();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Object object = Authenticator.NONE;
            this.authenticator = object;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = object;
            object = SocketFactory.getDefault();
            l.e(object, "getDefault()");
            this.socketFactory = object;
            object = Companion;
            this.connectionSpecs = ((Companion)object).getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = ((Companion)object).getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        public Builder(OkHttpClient okHttpClient) {
            l.f(okHttpClient, "okHttpClient");
            this();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            o.v((Collection)this.interceptors, (Iterable)okHttpClient.interceptors());
            o.v((Collection)this.networkInterceptors, (Iterable)okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }

        public final Builder -addInterceptor(ax.Fb.l<? super Interceptor.Chain, Response> l8) {
            l.f(l8, "block");
            return this.addInterceptor(new Interceptor(l8){
                final ax.Fb.l<Interceptor.Chain, Response> $block;
                {
                    this.$block = l8;
                }

                public final Response intercept(Interceptor.Chain chain) {
                    l.f(chain, "chain");
                    return this.$block.invoke(chain);
                }
            });
        }

        public final Builder -addNetworkInterceptor(ax.Fb.l<? super Interceptor.Chain, Response> l8) {
            l.f(l8, "block");
            return this.addNetworkInterceptor(new Interceptor(l8){
                final ax.Fb.l<Interceptor.Chain, Response> $block;
                {
                    this.$block = l8;
                }

                public final Response intercept(Interceptor.Chain chain) {
                    l.f(chain, "chain");
                    return this.$block.invoke(chain);
                }
            });
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            l.f(interceptor, "interceptor");
            ((Collection)this.interceptors).add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            l.f(interceptor, "interceptor");
            ((Collection)this.networkInterceptors).add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator) {
            l.f(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public final Builder callTimeout(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            this.callTimeout = Util.checkDuration("timeout", l8, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(j.Duration duration) {
            l.f(duration, "duration");
            this.callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner) {
            l.f(certificatePinner, "certificatePinner");
            if (!l.a(certificatePinner, this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder connectTimeout(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", l8, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(j.Duration duration) {
            l.f(duration, "duration");
            this.connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool) {
            l.f(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            l.f(list, "connectionSpecs");
            if (!l.a(list, this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(list);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar) {
            l.f(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher) {
            l.f(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder dns(Dns dns) {
            l.f(dns, "dns");
            if (!l.a(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            l.f(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory2) {
            l.f(factory2, "eventListenerFactory");
            this.eventListenerFactory = factory2;
            return this;
        }

        public final Builder followRedirects(boolean bl) {
            this.followRedirects = bl;
            return this;
        }

        public final Builder followSslRedirects(boolean bl) {
            this.followSslRedirects = bl;
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            l.f(hostnameVerifier, "hostnameVerifier");
            if (!l.a(hostnameVerifier, this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final Builder minWebSocketMessageToCompress(long l8) {
            if (l8 >= 0L) {
                this.minWebSocketMessageToCompress = l8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("minWebSocketMessageToCompress must be positive: ");
            stringBuilder.append(l8);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            this.pingInterval = Util.checkDuration("interval", l8, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(j.Duration duration) {
            l.f(duration, "duration");
            this.pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            l.f(list, "protocols");
            list = o.X((Collection)list);
            Object object = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(object) && !list.contains((Object)Protocol.HTTP_1_1)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("protocols must contain h2_prior_knowledge or http/1.1: ");
                ((StringBuilder)object).append(list);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            if (list.contains(object) && list.size() > 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("protocols containing h2_prior_knowledge cannot use other protocols: ");
                ((StringBuilder)object).append(list);
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            if (!list.contains((Object)Protocol.HTTP_1_0)) {
                l.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                if (!list.contains(null)) {
                    list.remove((Object)Protocol.SPDY_3);
                    if (!l.a(list, this.protocols)) {
                        this.routeDatabase = null;
                    }
                    list = java.util.DesugarCollections.unmodifiableList(list);
                    l.e(list, "unmodifiableList(protocolsCopy)");
                    this.protocols = list;
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("protocols must not contain http/1.0: ");
            ((StringBuilder)object).append(list);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        public final Builder proxy(Proxy proxy) {
            if (!l.a(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator) {
            l.f(authenticator, "proxyAuthenticator");
            if (!l.a(authenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = authenticator;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector) {
            l.f(proxySelector, "proxySelector");
            if (!l.a(proxySelector, this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final Builder readTimeout(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            this.readTimeout = Util.checkDuration("timeout", l8, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(j.Duration duration) {
            l.f(duration, "duration");
            this.readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean bl) {
            this.retryOnConnectionFailure = bl;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator) {
            l.f(authenticator, "<set-?>");
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int n8) {
            this.callTimeout = n8;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner) {
            l.f(certificatePinner, "<set-?>");
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int n8) {
            this.connectTimeout = n8;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool) {
            l.f(connectionPool, "<set-?>");
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            l.f(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar) {
            l.f(cookieJar, "<set-?>");
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher) {
            l.f(dispatcher, "<set-?>");
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(Dns dns) {
            l.f(dns, "<set-?>");
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory2) {
            l.f(factory2, "<set-?>");
            this.eventListenerFactory = factory2;
        }

        public final void setFollowRedirects$okhttp(boolean bl) {
            this.followRedirects = bl;
        }

        public final void setFollowSslRedirects$okhttp(boolean bl) {
            this.followSslRedirects = bl;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            l.f(hostnameVerifier, "<set-?>");
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long l8) {
            this.minWebSocketMessageToCompress = l8;
        }

        public final void setPingInterval$okhttp(int n8) {
            this.pingInterval = n8;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            l.f(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator) {
            l.f(authenticator, "<set-?>");
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int n8) {
            this.readTimeout = n8;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean bl) {
            this.retryOnConnectionFailure = bl;
        }

        public final void setRouteDatabase$okhttp(RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            l.f(socketFactory, "<set-?>");
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int n8) {
            this.writeTimeout = n8;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory) {
            l.f(socketFactory, "socketFactory");
            if (!(socketFactory instanceof SSLSocketFactory)) {
                if (!l.a(socketFactory, this.socketFactory)) {
                    this.routeDatabase = null;
                }
                this.socketFactory = socketFactory;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
        }

        public final Builder sslSocketFactory(SSLSocketFactory object) {
            l.f(object, "sslSocketFactory");
            if (!l.a(object, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = object;
            Object object2 = Platform.Companion;
            Object object3 = ((Platform.Companion)object2).get().trustManager((SSLSocketFactory)object);
            if (object3 != null) {
                this.x509TrustManagerOrNull = object3;
                object2 = ((Platform.Companion)object2).get();
                object = this.x509TrustManagerOrNull;
                l.c(object);
                this.certificateChainCleaner = ((Platform)object2).buildCertificateChainCleaner((X509TrustManager)object);
                return this;
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("Unable to extract the trust manager on ");
            ((StringBuilder)object3).append(((Platform.Companion)object2).get());
            ((StringBuilder)object3).append(", sslSocketFactory is ");
            ((StringBuilder)object3).append(object.getClass());
            throw new IllegalStateException(((StringBuilder)object3).toString());
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            l.f(sSLSocketFactory, "sslSocketFactory");
            l.f(x509TrustManager, "trustManager");
            if (!l.a(sSLSocketFactory, this.sslSocketFactoryOrNull) || !l.a(x509TrustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        public final Builder writeTimeout(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", l8, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(j.Duration duration) {
            l.f(duration, "duration");
            this.writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return DEFAULT_PROTOCOLS;
        }
    }
}


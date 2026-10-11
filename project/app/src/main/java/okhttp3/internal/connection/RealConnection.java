/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.tb.o;
import ax.xc.D;
import ax.xc.f;
import ax.xc.p;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionSpecSelector;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

public final class RealConnection
extends Http2Connection.Listener
implements Connection {
    public static final Companion Companion = new Companion(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final RealConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private f sink;
    private Socket socket;
    private ax.xc.g source;
    private int successCount;

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        l.f(realConnectionPool, "connectionPool");
        l.f(route, "route");
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.allocationLimit = 1;
        this.calls = new ArrayList<Reference<RealCall>>();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public static final /* synthetic */ Handshake access$getHandshake$p(RealConnection realConnection) {
        return realConnection.handshake;
    }

    private final boolean certificateSupportHost(HttpUrl object, Handshake object2) {
        List<Certificate> list = ((Handshake)object2).peerCertificates();
        if (!((Collection)list).isEmpty()) {
            object2 = OkHostnameVerifier.INSTANCE;
            object = ((HttpUrl)object).host();
            list = list.get(0);
            l.d(list, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (((OkHostnameVerifier)object2).verify((String)object, (X509Certificate)((Object)list))) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int n8, int n9, Call call, EventListener object) throws IOException {
        Proxy proxy = this.route.proxy();
        Object object2 = this.route.address();
        Proxy.Type type = proxy.type();
        int n10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (n10 != 1 && n10 != 2) {
            object2 = new Socket(proxy);
        } else {
            object2 = ((Address)object2).socketFactory().createSocket();
            l.c(object2);
        }
        this.rawSocket = object2;
        ((EventListener)object).connectStart(call, this.route.socketAddress(), proxy);
        ((Socket)object2).setSoTimeout(n9);
        try {
            Platform.Companion.get().connectSocket((Socket)object2, this.route.socketAddress(), n8);
        }
        catch (ConnectException connectException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to connect to ");
            ((StringBuilder)object).append(this.route.socketAddress());
            object = new ConnectException(((StringBuilder)object).toString());
            ((Throwable)object).initCause(connectException);
            throw object;
        }
        try {
            this.source = p.d(p.l((Socket)object2));
            this.sink = p.c(p.h((Socket)object2));
            return;
        }
        catch (NullPointerException nullPointerException) {
            if (!l.a(((Throwable)nullPointerException).getMessage(), NPE_THROW_WITH_NULL)) {
                return;
            }
            throw new IOException(nullPointerException);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void connectTls(ConnectionSpecSelector object) throws IOException {
        RuntimeException var1_4;
        Object object2;
        block9: {
            Handshake handshake2;
            SSLPeerUnverifiedException sSLPeerUnverifiedException;
            Object object3;
            Object object4;
            block10: {
                object4 = this.route.address();
                object2 = ((Address)object4).sslSocketFactory();
                object3 = null;
                sSLPeerUnverifiedException = null;
                try {
                    l.c(object2);
                    object2 = ((SSLSocketFactory)object2).createSocket(this.rawSocket, ((Address)object4).url().host(), ((Address)object4).url().port(), true);
                    l.d(object2, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                    object2 = (SSLSocket)object2;
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block9;
                }
                try {
                    object3 = ((ConnectionSpecSelector)object).configureSecureSocket((SSLSocket)object2);
                    if (!((ConnectionSpec)object3).supportsTlsExtensions()) break block10;
                    Platform.Companion.get().configureTlsExtensions((SSLSocket)object2, ((Address)object4).url().host(), ((Address)object4).protocols());
                }
                catch (Throwable throwable) {
                    break block9;
                }
            }
            ((SSLSocket)object2).startHandshake();
            object = ((SSLSocket)object2).getSession();
            a<List<? extends X509Certificate>> a8 = Handshake.Companion;
            l.e(object, "sslSocketSession");
            a8 = ((Handshake.Companion)((Object)a8)).get((SSLSession)object);
            Object object5 = ((Address)object4).hostnameVerifier();
            l.c(object5);
            if (!object5.verify(((Address)object4).url().host(), (SSLSession)object)) {
                object = ((Handshake)((Object)a8)).peerCertificates();
                if (!((Collection)object).isEmpty()) {
                    object = object.get(0);
                    l.d(object, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    object = (X509Certificate)object;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("\n              |Hostname ");
                    ((StringBuilder)object3).append(((Address)object4).url().host());
                    ((StringBuilder)object3).append(" not verified:\n              |    certificate: ");
                    ((StringBuilder)object3).append(CertificatePinner.Companion.pin((Certificate)object));
                    ((StringBuilder)object3).append("\n              |    DN: ");
                    ((StringBuilder)object3).append(((X509Certificate)object).getSubjectDN().getName());
                    ((StringBuilder)object3).append("\n              |    subjectAltNames: ");
                    ((StringBuilder)object3).append(OkHostnameVerifier.INSTANCE.allSubjectAltNames((X509Certificate)object));
                    ((StringBuilder)object3).append("\n              ");
                    sSLPeerUnverifiedException = new SSLPeerUnverifiedException(h.l(((StringBuilder)object3).toString(), null, 1, null));
                    throw sSLPeerUnverifiedException;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Hostname ");
                ((StringBuilder)object).append(((Address)object4).url().host());
                ((StringBuilder)object).append(" not verified (no certificates)");
                sSLPeerUnverifiedException = new SSLPeerUnverifiedException(((StringBuilder)object).toString());
                throw sSLPeerUnverifiedException;
            }
            object = ((Address)object4).certificatePinner();
            l.c(object);
            TlsVersion tlsVersion = ((Handshake)((Object)a8)).tlsVersion();
            CipherSuite cipherSuite = ((Handshake)((Object)a8)).cipherSuite();
            object5 = ((Handshake)((Object)a8)).localCertificates();
            a<List<? extends Certificate>> a9 = new a<List<? extends Certificate>>((CertificatePinner)object, (Handshake)((Object)a8), (Address)object4){
                final Address $address;
                final CertificatePinner $certificatePinner;
                final Handshake $unverifiedHandshake;
                {
                    this.$certificatePinner = certificatePinner;
                    this.$unverifiedHandshake = handshake2;
                    this.$address = address;
                    super(0);
                }

                public final List<Certificate> invoke() {
                    CertificateChainCleaner certificateChainCleaner = this.$certificatePinner.getCertificateChainCleaner$okhttp();
                    l.c(certificateChainCleaner);
                    return certificateChainCleaner.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
                }
            };
            this.handshake = handshake2 = new Handshake(tlsVersion, cipherSuite, (List<? extends Certificate>)object5, (a<? extends List<? extends Certificate>>)a9);
            object4 = ((Address)object4).url().host();
            a8 = new a<List<? extends X509Certificate>>(this){
                final RealConnection this$0;
                {
                    this.this$0 = realConnection;
                    super(0);
                }

                public final List<X509Certificate> invoke() {
                    Object object = RealConnection.access$getHandshake$p(this.this$0);
                    l.c(object);
                    Object object2 = ((Handshake)object).peerCertificates();
                    object = new ArrayList<E>(o.s(object2, 10));
                    Iterator<T> iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        object2 = (Certificate)iterator.next();
                        l.d(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        object.add((X509Certificate)object2);
                    }
                    return object;
                }
            };
            ((CertificatePinner)object).check$okhttp((String)object4, (a<? extends List<? extends X509Certificate>>)a8);
            object = sSLPeerUnverifiedException;
            if (((ConnectionSpec)object3).supportsTlsExtensions()) {
                object = Platform.Companion.get().getSelectedProtocol((SSLSocket)object2);
            }
            this.socket = object2;
            this.source = p.d(p.l((Socket)object2));
            this.sink = p.c(p.h((Socket)object2));
            object = object != null ? Protocol.Companion.get((String)object) : Protocol.HTTP_1_1;
            this.protocol = object;
            Platform.Companion.get().afterHandshake((SSLSocket)object2);
            return;
        }
        if (object2 != null) {
            Platform.Companion.get().afterHandshake((SSLSocket)object2);
        }
        if (object2 != null) {
            Util.closeQuietly((Socket)object2);
        }
        throw var1_4;
    }

    private final void connectTunnel(int n8, int n9, int n10, Call call, EventListener eventListener) throws IOException {
        Request request = this.createTunnelRequest();
        HttpUrl httpUrl = request.url();
        for (int i8 = 0; i8 < 21; ++i8) {
            this.connectSocket(n8, n9, call, eventListener);
            request = this.createTunnel(n9, n10, request, httpUrl);
            if (request == null) break;
            Socket socket = this.rawSocket;
            if (socket != null) {
                Util.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final Request createTunnel(int n8, int n9, Request object, HttpUrl object2) throws IOException {
        ax.xc.g g8;
        Object object3;
        block2: {
            Object object4;
            block3: {
                block4: {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("CONNECT ");
                    ((StringBuilder)object3).append(Util.toHostHeader((HttpUrl)object2, true));
                    ((StringBuilder)object3).append(" HTTP/1.1");
                    object2 = ((StringBuilder)object3).toString();
                    do {
                        g8 = this.source;
                        l.c(g8);
                        object3 = this.sink;
                        l.c(object3);
                        Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, g8, (f)object3);
                        D d8 = g8.timeout();
                        long l8 = n8;
                        object4 = TimeUnit.MILLISECONDS;
                        d8.timeout(l8, (TimeUnit)((Object)object4));
                        object3.timeout().timeout(n9, (TimeUnit)((Object)object4));
                        http1ExchangeCodec.writeRequest(((Request)object).headers(), (String)object2);
                        http1ExchangeCodec.finishRequest();
                        object4 = http1ExchangeCodec.readResponseHeaders(false);
                        l.c(object4);
                        object4 = ((Response.Builder)object4).request((Request)object).build();
                        http1ExchangeCodec.skipConnectBody((Response)object4);
                        int n10 = ((Response)object4).code();
                        if (n10 == 200) break block2;
                        if (n10 != 407) break block3;
                        object = this.route.address().proxyAuthenticator().authenticate(this.route, (Response)object4);
                        if (object == null) break block4;
                    } while (!h.v("close", Response.header$default((Response)object4, "Connection", null, 2, null), true));
                    return object;
                }
                throw new IOException("Failed to authenticate with proxy");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected response code for CONNECT: ");
            ((StringBuilder)object).append(((Response)object4).code());
            throw new IOException(((StringBuilder)object).toString());
        }
        if (g8.k().P() && object3.k().P()) {
            return null;
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    private final Request createTunnelRequest() throws IOException {
        Request request = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", "okhttp/4.12.0").build();
        Object object = new Response.Builder().request(request).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build();
        object = this.route.address().proxyAuthenticator().authenticate(this.route, (Response)object);
        if (object == null) {
            return request;
        }
        return object;
    }

    private final void establishProtocol(ConnectionSpecSelector object, int n8, Call list, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() == null) {
            list = this.route.address().protocols();
            if (list.contains(object = Protocol.H2_PRIOR_KNOWLEDGE)) {
                this.socket = this.rawSocket;
                this.protocol = object;
                this.startHttp2(n8);
                return;
            }
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
            return;
        }
        eventListener.secureConnectStart((Call)((Object)list));
        this.connectTls((ConnectionSpecSelector)object);
        eventListener.secureConnectEnd((Call)((Object)list), this.handshake);
        if (this.protocol == Protocol.HTTP_2) {
            this.startHttp2(n8);
        }
    }

    private final boolean routeMatchesAny(List<Route> object) {
        if ((object = (Iterable)object) instanceof Collection && ((Collection)object).isEmpty()) {
            return false;
        }
        Iterator<Route> iterator = object.iterator();
        while (iterator.hasNext()) {
            Proxy.Type type;
            object = iterator.next();
            Proxy.Type type2 = ((Route)object).proxy().type();
            if (type2 != (type = Proxy.Type.DIRECT) || this.route.proxy().type() != type || !l.a(this.route.socketAddress(), ((Route)object).socketAddress())) continue;
            return true;
        }
        return false;
    }

    private final void startHttp2(int n8) throws IOException {
        Socket socket = this.socket;
        l.c(socket);
        Closeable closeable = this.source;
        l.c(closeable);
        f f8 = this.sink;
        l.c(f8);
        socket.setSoTimeout(0);
        closeable = new Http2Connection.Builder(true, TaskRunner.INSTANCE).socket(socket, this.route.address().url().host(), (ax.xc.g)closeable, f8).listener(this).pingIntervalMillis(n8).build();
        this.http2Connection = closeable;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default((Http2Connection)closeable, false, null, 3, null);
    }

    private final boolean supportsUrl(HttpUrl object) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        Object object2 = this.route.address().url();
        if (((HttpUrl)object).port() != ((HttpUrl)object2).port()) {
            return false;
        }
        if (l.a(((HttpUrl)object).host(), ((HttpUrl)object2).host())) {
            return true;
        }
        if (!this.noCoalescedConnections && (object2 = this.handshake) != null) {
            l.c(object2);
            if (this.certificateSupportHost((HttpUrl)object, (Handshake)object2)) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            Util.closeQuietly(socket);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void connect(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5, Call var6_6, EventListener var7_7) {
        l.f(var6_6, "call");
        l.f(var7_7, "eventListener");
        if (this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        var9_8 = this.route.address().connectionSpecs();
        var13_11 = new ConnectionSpecSelector((List<ConnectionSpec>)var9_8);
        if (this.route.address().sslSocketFactory() == null) {
            if (!var9_8.contains(ConnectionSpec.CLEARTEXT)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            var9_8 = this.route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted((String)var9_8)) {
                var6_6 = new StringBuilder();
                var6_6.append("CLEARTEXT communication to ");
                var6_6.append((String)var9_8);
                var6_6.append(" not permitted by network security policy");
                throw new RouteException(new UnknownServiceException(var6_6.toString()));
            }
        } else if (this.route.address().protocols().contains((Object)Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        var11_12 = null;
        do {
            block25: {
                block23: {
                    block24: {
                        block22: {
                            var10_14 = var6_6;
                            var9_8 = var7_7;
                            var8_13 = this.route.requiresTunnel();
                            if (!var8_13) break block22;
                            this.connectTunnel(var1_1, var2_2, var3_3, (Call)var10_14, (EventListener)var9_8);
                            try {
                                if (this.rawSocket == null) break block23;
lbl34:
                                // 2 sources

                                while (true) {
                                    var10_14 = var6_6;
                                    var9_8 = var7_7;
                                    break block24;
                                    break;
                                }
                            }
                            catch (IOException v0) {
                                var9_8 = var6_6;
                                var9_8 = var7_7;
                                var9_8 = v0;
lbl42:
                                // 3 sources

                                while (true) {
                                    var10_14 = var6_6;
                                    var10_14 = var7_7;
lbl45:
                                    // 2 sources

                                    while (true) {
                                        var10_14 = var6_6;
                                        var12_15 = var7_7;
                                        break block25;
                                        break;
                                    }
                                    break;
                                }
                            }
                            catch (IOException var9_10) {
                                ** GOTO lbl42
                            }
                            catch (IOException var12_16) {
                                var9_8 = var12_16;
                                ** continue;
                            }
                        }
                        this.connectSocket(var1_1, var2_2, (Call)var10_14, (EventListener)var9_8);
                        ** continue;
                    }
                    try {
                        this.establishProtocol(var13_11, var4_4, (Call)var10_14, (EventListener)var9_8);
                        var9_8.connectEnd((Call)var10_14, this.route.socketAddress(), this.route.proxy(), this.protocol);
                    }
                    catch (IOException var9_9) {
                        ** continue;
                    }
                }
                if (this.route.requiresTunnel() && this.rawSocket == null) {
                    throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                }
                this.idleAtNs = System.nanoTime();
                return;
            }
            var14_17 = this.socket;
            if (var14_17 != null) {
                Util.closeQuietly(var14_17);
            }
            if ((var14_17 = this.rawSocket) != null) {
                Util.closeQuietly(var14_17);
            }
            this.socket = null;
            this.rawSocket = null;
            this.source = null;
            this.sink = null;
            this.handshake = null;
            this.protocol = null;
            this.http2Connection = null;
            this.allocationLimit = 1;
            var12_15.connectFailed((Call)var10_14, this.route.socketAddress(), this.route.proxy(), null, (IOException)var9_8);
            if (var11_12 == null) {
                var11_12 = new RouteException((IOException)var9_8);
                continue;
            }
            var11_12.addConnectException((IOException)var9_8);
        } while (var5_5 && var13_11.connectionFailed((IOException)var9_8));
        throw var11_12;
    }

    public final void connectFailed$okhttp(OkHttpClient okHttpClient, Route route, IOException iOException) {
        l.f(okHttpClient, "client");
        l.f(route, "failedRoute");
        l.f(iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        okHttpClient.getRouteDatabase().failed(route);
    }

    public final List<Reference<RealCall>> getCalls() {
        return this.calls;
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override
    public Handshake handshake() {
        return this.handshake;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            ++this.successCount;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isEligible$okhttp(Address object, List<Route> object2) {
        l.f(object, "address");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        if (this.calls.size() >= this.allocationLimit) return false;
        if (this.noNewExchanges) {
            return false;
        }
        if (!this.route.address().equalsNonHost$okhttp((Address)object)) {
            return false;
        }
        if (l.a(((Address)object).url().host(), this.route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null) {
            return false;
        }
        if (object2 == null) return false;
        if (!this.routeMatchesAny((List<Route>)object2)) {
            return false;
        }
        if (((Address)object).hostnameVerifier() != OkHostnameVerifier.INSTANCE) {
            return false;
        }
        if (!this.supportsUrl(((Address)object).url())) {
            return false;
        }
        try {
            object2 = ((Address)object).certificatePinner();
            l.c(object2);
            object = ((Address)object).url().host();
            Handshake handshake2 = this.handshake();
            l.c(handshake2);
            ((CertificatePinner)object2).check((String)object, handshake2.peerCertificates());
            return true;
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isHealthy(boolean bl) {
        long l8;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        long l9 = System.nanoTime();
        Closeable closeable = this.rawSocket;
        l.c(closeable);
        Socket socket = this.socket;
        l.c(socket);
        ax.xc.g g8 = this.source;
        l.c(g8);
        if (((Socket)closeable).isClosed()) return false;
        if (socket.isClosed()) return false;
        if (socket.isInputShutdown()) return false;
        if (socket.isOutputShutdown()) {
            return false;
        }
        closeable = this.http2Connection;
        if (closeable != null) {
            return ((Http2Connection)closeable).isHealthy(l9);
        }
        synchronized (this) {
            l8 = this.idleAtNs;
        }
        if (l9 - l8 < 10000000000L) return true;
        if (!bl) return true;
        return Util.isHealthy(socket, g8);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        l.f(okHttpClient, "client");
        l.f(realInterceptorChain, "chain");
        Object object = this.socket;
        l.c(object);
        ax.xc.g g8 = this.source;
        l.c(g8);
        f f8 = this.sink;
        l.c(f8);
        Object object2 = this.http2Connection;
        if (object2 != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, (Http2Connection)object2);
        }
        object.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        object2 = g8.timeout();
        long l8 = realInterceptorChain.getReadTimeoutMillis$okhttp();
        object = TimeUnit.MILLISECONDS;
        ((D)object2).timeout(l8, (TimeUnit)((Object)object));
        f8.timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), (TimeUnit)((Object)object));
        return new Http1ExchangeCodec(okHttpClient, this, g8, f8);
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
        l.f(exchange, "exchange");
        Socket socket = this.socket;
        l.c(socket);
        ax.xc.g g8 = this.source;
        l.c(g8);
        f f8 = this.sink;
        l.c(f8);
        socket.setSoTimeout(0);
        this.noNewExchanges$okhttp();
        return new RealWebSocket.Streams(g8, f8, exchange){
            final Exchange $exchange;
            {
                this.$exchange = exchange;
                super(true, g8, f8);
            }

            public void close() {
                this.$exchange.bodyComplete(-1L, true, true, null);
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void noNewExchanges$okhttp() {
        synchronized (this) {
            this.noNewExchanges = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void onSettings(Http2Connection http2Connection, Settings settings) {
        synchronized (this) {
            l.f(http2Connection, "connection");
            l.f(settings, "settings");
            this.allocationLimit = settings.getMaxConcurrentStreams();
            return;
        }
    }

    @Override
    public void onStream(Http2Stream http2Stream) throws IOException {
        l.f(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }

    @Override
    public Protocol protocol() {
        Protocol protocol = this.protocol;
        l.c((Object)protocol);
        return protocol;
    }

    @Override
    public Route route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long l8) {
        this.idleAtNs = l8;
    }

    public final void setNoNewExchanges(boolean bl) {
        this.noNewExchanges = bl;
    }

    public final void setRouteFailureCount$okhttp(int n8) {
        this.routeFailureCount = n8;
    }

    @Override
    public Socket socket() {
        Socket socket = this.socket;
        l.c(socket);
        return socket;
    }

    public String toString() {
        Object object;
        StringBuilder stringBuilder;
        block3: {
            block2: {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Connection{");
                stringBuilder.append(this.route.address().url().host());
                stringBuilder.append(':');
                stringBuilder.append(this.route.address().url().port());
                stringBuilder.append(", proxy=");
                stringBuilder.append(this.route.proxy());
                stringBuilder.append(" hostAddress=");
                stringBuilder.append(this.route.socketAddress());
                stringBuilder.append(" cipherSuite=");
                object = this.handshake;
                if (object == null) break block2;
                CipherSuite cipherSuite = ((Handshake)object).cipherSuite();
                object = cipherSuite;
                if (cipherSuite != null) break block3;
            }
            object = "none";
        }
        stringBuilder.append(object);
        stringBuilder.append(" protocol=");
        stringBuilder.append((Object)this.protocol);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void trackFailure$okhttp(RealCall realCall, IOException iOException) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                block10: {
                    block8: {
                        block9: {
                            try {
                                int n8;
                                l.f(realCall, "call");
                                if (!(iOException instanceof StreamResetException)) break block8;
                                if (((StreamResetException)iOException).errorCode != ErrorCode.REFUSED_STREAM) break block9;
                                this.refusedStreamCount = n8 = this.refusedStreamCount + 1;
                                if (n8 > 1) {
                                    this.noNewExchanges = true;
                                    ++this.routeFailureCount;
                                }
                                break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        if (((StreamResetException)iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                            this.noNewExchanges = true;
                            ++this.routeFailureCount;
                        }
                        break block10;
                    }
                    if (!this.isMultiplexed$okhttp() || iOException instanceof ConnectionShutdownException) {
                        this.noNewExchanges = true;
                        if (this.successCount == 0) {
                            if (iOException != null) {
                                this.connectFailed$okhttp(realCall.getClient(), this.route, iOException);
                            }
                            ++this.routeFailureCount;
                        }
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final RealConnection newTestConnection(RealConnectionPool object, Route route, Socket socket, long l8) {
            l.f(object, "connectionPool");
            l.f(route, "route");
            l.f(socket, "socket");
            object = new RealConnection((RealConnectionPool)object, route);
            ((RealConnection)object).socket = socket;
            ((RealConnection)object).setIdleAtNs$okhttp(l8);
            return object;
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[Proxy.Type.values().length];
            try {
                nArray[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[Proxy.Type.HTTP.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            $EnumSwitchMapping$0 = nArray;
        }
    }
}


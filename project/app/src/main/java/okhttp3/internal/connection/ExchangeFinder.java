/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import ax.sb.t;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        l.f(realConnectionPool, "connectionPool");
        l.f(address, "address");
        l.f(realCall, "call");
        l.f(eventListener, "eventListener");
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = realCall;
        this.eventListener = eventListener;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final RealConnection findConnection(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) throws IOException {
        block22: {
            block24: {
                block23: {
                    if (this.call.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    var7_6 = this.call.getConnection();
                    if (var7_6 != null) {
                        synchronized (var7_6) {
                            block20: {
                                block19: {
                                    try {
                                        if (var7_6.getNoNewExchanges() || !this.sameHostAndPort(var7_6.route().address().url())) break block19;
                                        var6_7 = null;
                                        break block20;
                                    }
                                    catch (Throwable var6_8) {
                                        ** break block21
                                    }
                                }
                                var6_7 = this.call.releaseConnectionNoEvents$okhttp();
                            }
                            var8_10 = t.a;
                            ** if (this.call.getConnection() == null) goto lbl20
                        }
lbl-1000:
                        // 1 sources

                        {
                            if (var6_7 == null) {
                                return var7_6;
                            }
                            throw new IllegalStateException("Check failed.");
                        }
lbl20:
                        // 1 sources

                        if (var6_7 != null) {
                            Util.closeQuietly((Socket)var6_7);
                        }
                        this.eventListener.connectionReleased(this.call, (Connection)var7_6);
                        break block23;
lbl-1000:
                        // 1 sources

                        {
                            throw var6_8;
                        }
                    }
                }
                this.refusedStreamCount = 0;
                this.connectionShutdownCount = 0;
                this.otherFailureCount = 0;
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
                    var6_7 = this.call.getConnection();
                    l.c(var6_7);
                    this.eventListener.connectionAcquired(this.call, (Connection)var6_7);
                    return var6_7;
                }
                var6_7 = this.nextRouteToTry;
                if (var6_7 == null) break block24;
                l.c(var6_7);
                this.nextRouteToTry = null;
                ** GOTO lbl48
            }
            var6_7 = this.routeSelection;
            if (var6_7 == null) ** GOTO lbl-1000
            l.c(var6_7);
            if (var6_7.hasNext()) {
                var6_7 = this.routeSelection;
                l.c(var6_7);
                var6_7 = var6_7.next();
lbl48:
                // 2 sources

                var7_6 = null;
            } else lbl-1000:
            // 2 sources

            {
                var6_7 = var7_6 = this.routeSelector;
                if (var7_6 == null) {
                    this.routeSelector = var6_7 = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                }
                this.routeSelection = var6_7 = var6_7.next();
                var7_6 = var6_7.getRoutes();
                if (this.call.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, (List<Route>)var7_6, false)) {
                    var6_7 = this.call.getConnection();
                    l.c(var6_7);
                    this.eventListener.connectionAcquired(this.call, (Connection)var6_7);
                    return var6_7;
                }
                var6_7 = var6_7.next();
            }
            var8_10 = new RealConnection(this.connectionPool, (Route)var6_7);
            this.call.setConnectionToCancel((RealConnection)var8_10);
            var8_10.connect(var1_1, var2_2, var3_3, var4_4, var5_5, this.call, this.eventListener);
            this.call.getClient().getRouteDatabase().connected(var8_10.route());
            if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, (List<Route>)var7_6, true)) break block22;
            var7_6 = this.call.getConnection();
            l.c(var7_6);
            this.nextRouteToTry = var6_7;
            Util.closeQuietly(var8_10.socket());
            this.eventListener.connectionAcquired(this.call, (Connection)var7_6);
            return var7_6;
        }
        synchronized (var8_10) {
            this.connectionPool.put((RealConnection)var8_10);
            this.call.acquireConnectionNoEvents((RealConnection)var8_10);
            var6_7 = t.a;
        }
        this.eventListener.connectionAcquired(this.call, (Connection)var8_10);
        return var8_10;
        finally {
            this.call.setConnectionToCancel(null);
        }
    }

    private final RealConnection findHealthyConnection(int n8, int n9, int n10, int n11, boolean bl, boolean bl2) throws IOException {
        while (true) {
            Object object;
            if (((RealConnection)(object = this.findConnection(n8, n9, n10, n11, bl))).isHealthy(bl2)) {
                return object;
            }
            ((RealConnection)object).noNewExchanges$okhttp();
            if (this.nextRouteToTry != null) continue;
            object = this.routeSelection;
            boolean bl3 = true;
            boolean bl4 = object != null ? ((RouteSelector.Selection)object).hasNext() : true;
            if (bl4) continue;
            object = this.routeSelector;
            bl4 = bl3;
            if (object != null) {
                bl4 = ((RouteSelector)object).hasNext();
            }
            if (!bl4) break;
        }
        throw new IOException("exhausted all routes");
    }

    private final Route retryRoute() {
        if (this.refusedStreamCount <= 1 && this.connectionShutdownCount <= 1 && this.otherFailureCount <= 0) {
            RealConnection realConnection = this.call.getConnection();
            if (realConnection == null) {
                return null;
            }
            synchronized (realConnection) {
                block8: {
                    block7: {
                        int n8 = realConnection.getRouteFailureCount$okhttp();
                        if (n8 == 0) break block7;
                        return null;
                    }
                    boolean bl = Util.canReuseConnectionFor(realConnection.route().address().url(), this.address.url());
                    if (bl) break block8;
                    return null;
                }
                Route route = realConnection.route();
                return route;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExchangeCodec find(OkHttpClient object, RealInterceptorChain realInterceptorChain) {
        RuntimeException var1_5;
        block7: {
            IOException var1_3;
            block6: {
                boolean bl2;
                boolean bl;
                int n11;
                int n10;
                int n9;
                int n8;
                l.f(object, "client");
                l.f(realInterceptorChain, "chain");
                try {
                    n8 = realInterceptorChain.getConnectTimeoutMillis$okhttp();
                    n9 = realInterceptorChain.getReadTimeoutMillis$okhttp();
                    n10 = realInterceptorChain.getWriteTimeoutMillis$okhttp();
                    n11 = ((OkHttpClient)object).pingIntervalMillis();
                    bl = ((OkHttpClient)object).retryOnConnectionFailure();
                    bl2 = l.a(realInterceptorChain.getRequest$okhttp().method(), "GET");
                }
                catch (IOException iOException) {
                    break block6;
                }
                catch (RouteException routeException) {
                    break block7;
                }
                try {
                    return this.findHealthyConnection(n8, n9, n10, n11, bl, bl2 ^ true).newCodec$okhttp((OkHttpClient)object, realInterceptorChain);
                }
                catch (IOException iOException) {
                }
                catch (RouteException routeException) {
                    break block7;
                }
            }
            this.trackFailure((IOException)var1_3);
            throw new RouteException((IOException)var1_3);
        }
        this.trackFailure(var1_5.getLastConnectException());
        throw var1_5;
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Object object = this.retryRoute();
        if (object != null) {
            this.nextRouteToTry = object;
            return true;
        }
        object = this.routeSelection;
        if (object != null && ((RouteSelector.Selection)object).hasNext()) {
            return true;
        }
        object = this.routeSelector;
        if (object == null) {
            return true;
        }
        return ((RouteSelector)object).hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl httpUrl) {
        l.f(httpUrl, "url");
        HttpUrl httpUrl2 = this.address.url();
        return httpUrl.port() == httpUrl2.port() && l.a(httpUrl.host(), httpUrl2.host());
    }

    public final void trackFailure(IOException iOException) {
        l.f(iOException, "e");
        this.nextRouteToTry = null;
        if (iOException instanceof StreamResetException && ((StreamResetException)iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            ++this.refusedStreamCount;
            return;
        }
        if (iOException instanceof ConnectionShutdownException) {
            ++this.connectionShutdownCount;
            return;
        }
        ++this.otherFailureCount;
    }
}


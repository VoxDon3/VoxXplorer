/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import ax.sb.a;
import ax.sb.t;
import ax.tb.o;
import ax.xc.D;
import ax.xc.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

public final class RealCall
implements Call {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private volatile RealConnection connectionToCancel;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final timeout.1 timeout;
    private boolean timeoutEarlyExit;

    public RealCall(OkHttpClient okHttpClient, Request object, boolean bl) {
        l.f(okHttpClient, "client");
        l.f(object, "originalRequest");
        this.client = okHttpClient;
        this.originalRequest = object;
        this.forWebSocket = bl;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        object = new c(this){
            final RealCall this$0;
            {
                this.this$0 = realCall;
            }

            protected void timedOut() {
                this.this$0.cancel();
            }
        };
        ((D)object).timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = object;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final <E extends IOException> E callDone(E object) {
        boolean bl = Util.assertionsEnabled;
        if (bl && Thread.holdsLock(this)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Thread ");
            ((StringBuilder)object).append(Thread.currentThread().getName());
            ((StringBuilder)object).append(" MUST NOT hold lock on ");
            ((StringBuilder)object).append(this);
            throw new AssertionError((Object)((StringBuilder)object).toString());
        }
        Object object2 = this.connection;
        if (object2 != null) {
            if (bl && Thread.holdsLock(object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread ");
                ((StringBuilder)object).append(Thread.currentThread().getName());
                ((StringBuilder)object).append(" MUST NOT hold lock on ");
                ((StringBuilder)object).append(object2);
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            // MONITORENTER : object2
            Socket socket = this.releaseConnectionNoEvents$okhttp();
            // MONITOREXIT : object2
            if (this.connection == null) {
                if (socket != null) {
                    Util.closeQuietly(socket);
                }
                this.eventListener.connectionReleased(this, (Connection)object2);
            } else if (socket != null) throw new IllegalStateException("Check failed.");
        }
        object2 = this.timeoutExit(object);
        if (object != null) {
            object = this.eventListener;
            l.c(object2);
            ((EventListener)object).callFailed(this, (IOException)object2);
            return (E)object2;
        }
        this.eventListener.callEnd(this);
        return (E)object2;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final Address createAddress(HttpUrl httpUrl) {
        HostnameVerifier hostnameVerifier;
        Object object;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            object = this.client.hostnameVerifier();
            CertificatePinner certificatePinner = this.client.certificatePinner();
            hostnameVerifier = object;
            object = certificatePinner;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            object = hostnameVerifier;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, (CertificatePinner)object, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e8) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e8;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e8 != null) {
            interruptedIOException.initCause(e8);
        }
        return (E)interruptedIOException;
    }

    private final String toLoggableString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.isCanceled() ? "canceled " : "";
        stringBuilder.append(string);
        string = this.forWebSocket ? "web socket" : "call";
        stringBuilder.append(string);
        stringBuilder.append(" to ");
        stringBuilder.append(this.redactedUrl$okhttp());
        return stringBuilder.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        l.f(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(realConnection);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        if (this.connection == null) {
            this.connection = realConnection;
            realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Object object = this.exchange;
        if (object != null) {
            ((Exchange)object).cancel();
        }
        if ((object = this.connectionToCancel) != null) {
            ((RealConnection)object).cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override
    public void enqueue(Callback callback) {
        l.f(callback, "responseCallback");
        if (this.executed.compareAndSet(false, true)) {
            this.callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void enterNetworkInterceptorExchange(Request object, boolean bl) {
        l.f(object, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    if (!this.responseBodyOpen) {
                        if (!this.requestBodyOpen) {
                            t t8 = t.a;
                            // MONITOREXIT @DISABLED, blocks:[0, 2, 5, 7] lbl9 : MonitorExitStatement: MONITOREXIT : this
                            if (bl) {
                                this.exchangeFinder = new ExchangeFinder(this.connectionPool, this.createAddress(((Request)object).url()), this, this.eventListener);
                            }
                            return;
                        }
                        object = new IllegalStateException("Check failed.");
                        throw object;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                throw object;
            }
            throw throwable2;
        }
    }

    @Override
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            this.timeout.enter();
            this.callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                Response response = this.getResponseWithInterceptorChain$okhttp();
                return response;
            }
            finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void exitNetworkInterceptorExchange$okhttp(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.expectMoreExchanges) {
                        Object object = t.a;
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 5] lbl5 : MonitorExitStatement: MONITOREXIT : this
                        if (bl && (object = this.exchange) != null) {
                            ((Exchange)object).detachWithViolence();
                        }
                        this.interceptorScopedExchange = null;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    IllegalStateException illegalStateException = new IllegalStateException("released");
                    throw illegalStateException;
                }
            }
            throw throwable2;
        }
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        boolean bl;
        boolean bl2;
        Object object;
        block7: {
            object = new ArrayList<Interceptor>();
            o.v(object, (Iterable)this.client.interceptors());
            object.add(new RetryAndFollowUpInterceptor(this.client));
            object.add(new BridgeInterceptor(this.client.cookieJar()));
            object.add(new CacheInterceptor(this.client.cache()));
            object.add(ConnectInterceptor.INSTANCE);
            if (!this.forWebSocket) {
                o.v(object, (Iterable)this.client.networkInterceptors());
            }
            object.add(new CallServerInterceptor(this.forWebSocket));
            object = new RealInterceptorChain(this, (List<? extends Interceptor>)object, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
            bl = bl2 = false;
            try {
                object = ((RealInterceptorChain)object).proceed(this.originalRequest);
                bl = bl2;
                boolean bl3 = this.isCanceled();
                if (bl3) break block7;
                this.noMoreExchanges$okhttp(null);
                return object;
            }
            catch (IOException iOException) {
                bl = bl2 = true;
                IOException iOException2 = this.noMoreExchanges$okhttp(iOException);
                bl = bl2;
                l.d(iOException2, "null cannot be cast to non-null type kotlin.Throwable");
                bl = bl2;
                throw iOException2;
            }
        }
        bl = bl2;
        {
            Util.closeQuietly((Closeable)object);
            bl = bl2;
            bl = bl2;
            object = new IOException("Canceled");
            bl = bl2;
            throw object;
        }
        catch (Throwable throwable2222222) {}
        if (bl) throw throwable2222222;
        this.noMoreExchanges$okhttp(null);
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Exchange initExchange$okhttp(RealInterceptorChain object) {
        block6: {
            block7: {
                block8: {
                    l.f(object, "chain");
                    // MONITORENTER : this
                    if (!this.expectMoreExchanges) break block6;
                    if (this.responseBodyOpen) break block7;
                    if (this.requestBodyOpen) break block8;
                    Object object2 = t.a;
                    // MONITOREXIT : this
                    object2 = this.exchangeFinder;
                    l.c(object2);
                    object = ((ExchangeFinder)object2).find(this.client, (RealInterceptorChain)object);
                    this.interceptorScopedExchange = object = new Exchange(this, this.eventListener, (ExchangeFinder)object2, (ExchangeCodec)object);
                    this.exchange = object;
                    // MONITORENTER : this
                    this.requestBodyOpen = true;
                    this.responseBodyOpen = true;
                    // MONITOREXIT : this
                    if (this.canceled) throw new IOException("Canceled");
                    return object;
                }
                object = new IllegalStateException("Check failed.");
                throw object;
            }
            object = new IllegalStateException("Check failed.");
            throw object;
        }
        object = new IllegalStateException("released");
        throw object;
    }

    @Override
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override
    public boolean isExecuted() {
        return this.executed.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final <E extends IOException> E messageDone$okhttp(Exchange object, boolean bl, boolean bl2, E e8) {
        boolean bl3;
        boolean bl4;
        block13: {
            block12: {
                boolean bl5;
                block11: {
                    l.f(object, "exchange");
                    if (!l.a(object, this.exchange)) {
                        return e8;
                    }
                    // MONITORENTER : this
                    bl4 = false;
                    bl5 = false;
                    if (bl) {
                        if (this.requestBodyOpen) break block11;
                    }
                    if (!bl2 || !this.responseBodyOpen) break block12;
                }
                if (bl) {
                    this.requestBodyOpen = false;
                }
                if (bl2) {
                    this.responseBodyOpen = false;
                }
                bl4 = !(bl = this.requestBodyOpen) && !this.responseBodyOpen;
                bl3 = bl5;
                if (bl) break block13;
                bl3 = bl5;
                if (!this.responseBodyOpen) {
                    bl3 = bl5;
                    if (!this.expectMoreExchanges) {
                        bl3 = true;
                    }
                }
                break block13;
            }
            bl3 = false;
        }
        object = t.a;
        // MONITOREXIT : this
        if (bl4) {
            this.exchange = null;
            object = this.connection;
            if (object != null) {
                ((RealConnection)object).incrementSuccessCount$okhttp();
            }
        }
        if (!bl3) return e8;
        return this.callDone(e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        synchronized (this) {
            try {
                boolean bl;
                boolean bl2 = this.expectMoreExchanges;
                boolean bl3 = bl = false;
                if (bl2) {
                    this.expectMoreExchanges = false;
                    bl3 = bl;
                    if (!this.requestBodyOpen) {
                        bl3 = bl;
                        if (!this.responseBodyOpen) {
                            bl3 = true;
                        }
                    }
                }
                Object object = t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl13 : MonitorExitStatement: MONITOREXIT : this
                object = iOException;
                if (!bl3) return object;
                return this.callDone(iOException);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        int n8;
        List<Reference<RealCall>> list;
        RealConnection realConnection;
        block6: {
            realConnection = this.connection;
            l.c(realConnection);
            if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(Thread.currentThread().getName());
                stringBuilder.append(" MUST hold lock on ");
                stringBuilder.append(realConnection);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            list = realConnection.getCalls();
            Iterator<Reference<RealCall>> iterator = list.iterator();
            n8 = 0;
            while (iterator.hasNext()) {
                if (!l.a(iterator.next().get(), this)) {
                    ++n8;
                    continue;
                }
                break block6;
            }
            n8 = -1;
        }
        if (n8 != -1) {
            list.remove(n8);
            this.connection = null;
            if (list.isEmpty()) {
                realConnection.setIdleAtNs$okhttp(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.socket();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        l.c(exchangeFinder);
        return exchangeFinder.retryAfterFailure();
    }

    public final void setConnectionToCancel(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    @Override
    public c timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final class AsyncCall
    implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            l.f(callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void executeOn(ExecutorService object) {
            l.f(object, "executorService");
            Object object2 = this.this$0.getClient().dispatcher();
            if (Util.assertionsEnabled && Thread.holdsLock(object2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread ");
                ((StringBuilder)object).append(Thread.currentThread().getName());
                ((StringBuilder)object).append(" MUST NOT hold lock on ");
                ((StringBuilder)object).append(object2);
                throw new AssertionError((Object)((StringBuilder)object).toString());
            }
            try {
                try {
                    object.execute(this);
                    return;
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    object2 = new InterruptedIOException("executor rejected");
                    ((Throwable)object2).initCause(rejectedExecutionException);
                    this.this$0.noMoreExchanges$okhttp((IOException)object2);
                    this.responseCallback.onFailure(this.this$0, (IOException)object2);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    return;
                }
            }
            catch (Throwable throwable) {}
            this.this$0.getClient().dispatcher().finished$okhttp(this);
            throw throwable;
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            l.f(asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        /*
         * Loose catch block
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            Throwable throwable522;
            Throwable throwable2222;
            String string;
            Thread thread;
            RealCall realCall;
            block17: {
                Object object;
                block18: {
                    boolean bl;
                    block16: {
                        block15: {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("OkHttp ");
                            ((StringBuilder)object).append(this.this$0.redactedUrl$okhttp());
                            object = ((StringBuilder)object).toString();
                            realCall = this.this$0;
                            thread = Thread.currentThread();
                            string = thread.getName();
                            thread.setName((String)object);
                            try {
                                realCall.timeout.enter();
                            }
                            catch (Throwable throwable2222) {}
                            object = realCall.getResponseWithInterceptorChain$okhttp();
                            bl = true;
                            boolean bl2 = true;
                            this.responseCallback.onResponse(realCall, (Response)object);
                            object = realCall.getClient().dispatcher();
                            break block18;
                            catch (Throwable throwable3) {
                                bl = bl2;
                                break block15;
                            }
                            catch (IOException iOException) {
                                break block16;
                            }
                            catch (Throwable throwable4) {
                                bl = false;
                            }
                        }
                        try {
                            RuntimeException var3_6;
                            realCall.cancel();
                            if (bl) throw var3_6;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("canceled due to ");
                            stringBuilder.append(var3_6);
                            IOException iOException = new IOException(stringBuilder.toString());
                            a.a(iOException, (Throwable)var3_6);
                            this.responseCallback.onFailure(realCall, iOException);
                            throw var3_6;
                        }
                        catch (Throwable throwable522) {
                            break block17;
                        }
                        catch (IOException iOException) {
                            bl = false;
                        }
                    }
                    if (bl) {
                        Platform platform = Platform.Companion.get();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Callback failure for ");
                        stringBuilder.append(realCall.toLoggableString());
                        platform.log(stringBuilder.toString(), 4, (Throwable)object);
                    } else {
                        this.responseCallback.onFailure(realCall, (IOException)object);
                    }
                    object = realCall.getClient().dispatcher();
                }
                ((Dispatcher)object).finished$okhttp(this);
                thread.setName(string);
                return;
            }
            realCall.getClient().dispatcher().finished$okhttp(this);
            throw throwable522;
            thread.setName(string);
            throw throwable2222;
        }
    }

    public static final class CallReference
    extends WeakReference<RealCall> {
        private final Object callStackTrace;

        public CallReference(RealCall realCall, Object object) {
            l.f(realCall, "referent");
            super(realCall);
            this.callStackTrace = object;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }
}


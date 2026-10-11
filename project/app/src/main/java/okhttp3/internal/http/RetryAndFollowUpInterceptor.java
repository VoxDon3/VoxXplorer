/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.g;
import ax.Gb.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.HttpMethod;

public final class RetryAndFollowUpInterceptor
implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        l.f(okHttpClient, "client");
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response response, String string) {
        boolean bl = this.client.followRedirects();
        RequestBody requestBody = null;
        if (!bl) {
            return null;
        }
        Object object = Response.header$default(response, "Location", null, 2, null);
        if (object == null) {
            return null;
        }
        object = response.request().url().resolve((String)object);
        if (object == null) {
            return null;
        }
        if (!l.a(((HttpUrl)object).scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder builder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(string)) {
            int n8 = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean bl2 = httpMethod.redirectsWithBody(string) || n8 == 308 || n8 == 307;
            if (httpMethod.redirectsToGet(string) && n8 != 308 && n8 != 307) {
                builder.method("GET", null);
            } else {
                if (bl2) {
                    requestBody = response.request().body();
                }
                builder.method(string, requestBody);
            }
            if (!bl2) {
                builder.removeHeader("Transfer-Encoding");
                builder.removeHeader("Content-Length");
                builder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), (HttpUrl)object)) {
            builder.removeHeader("Authorization");
        }
        return builder.url((HttpUrl)object).build();
    }

    private final Request followUpRequest(Response response, Exchange object) throws IOException {
        Object object2;
        object2 = object != null && (object2 = ((Exchange)object).getConnection$okhttp()) != null ? ((RealConnection)object2).route() : null;
        int n8 = response.code();
        String string = response.request().method();
        if (n8 != 307 && n8 != 308) {
            if (n8 != 401) {
                if (n8 != 421) {
                    if (n8 != 503) {
                        if (n8 != 407) {
                            if (n8 != 408) {
                                switch (n8) {
                                    default: {
                                        return null;
                                    }
                                    case 300: 
                                    case 301: 
                                    case 302: 
                                    case 303: {
                                        return this.buildRedirectRequest(response, string);
                                    }
                                }
                            }
                            if (!this.client.retryOnConnectionFailure()) {
                                return null;
                            }
                            object = response.request().body();
                            if (object != null && ((RequestBody)object).isOneShot()) {
                                return null;
                            }
                            object = response.priorResponse();
                            if (object != null && ((Response)object).code() == 408) {
                                return null;
                            }
                            if (this.retryAfter(response, 0) > 0) {
                                return null;
                            }
                            return response.request();
                        }
                        l.c(object2);
                        if (((Route)object2).proxy().type() == Proxy.Type.HTTP) {
                            return this.client.proxyAuthenticator().authenticate((Route)object2, response);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    object = response.priorResponse();
                    if (object != null && ((Response)object).code() == 503) {
                        return null;
                    }
                    if (this.retryAfter(response, Integer.MAX_VALUE) == 0) {
                        return response.request();
                    }
                    return null;
                }
                object2 = response.request().body();
                if (object2 != null && ((RequestBody)object2).isOneShot()) {
                    return null;
                }
                if (object != null && ((Exchange)object).isCoalescedConnection$okhttp()) {
                    ((Exchange)object).getConnection$okhttp().noCoalescedConnections$okhttp();
                    return response.request();
                }
                return null;
            }
            return this.client.authenticator().authenticate((Route)object2, response);
        }
        return this.buildRedirectRequest(response, string);
    }

    private final boolean isRecoverable(IOException iOException, boolean bl) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return iOException instanceof SocketTimeoutException && !bl;
        }
        if (iOException instanceof SSLHandshakeException && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        return !(iOException instanceof SSLPeerUnverifiedException);
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request, boolean bl) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if (bl && this.requestIsOneShot(iOException, request)) {
            return false;
        }
        if (!this.isRecoverable(iOException, bl)) {
            return false;
        }
        return realCall.retryAfterFailure();
    }

    private final boolean requestIsOneShot(IOException iOException, Request object) {
        return (object = ((Request)object).body()) != null && ((RequestBody)object).isOneShot() || iOException instanceof FileNotFoundException;
    }

    private final int retryAfter(Response object, int n8) {
        if ((object = Response.header$default((Response)object, "Retry-After", null, 2, null)) == null) {
            return n8;
        }
        if (new ax.Ob.g("\\d+").a((CharSequence)object)) {
            object = Integer.valueOf((String)object);
            l.e(object, "valueOf(header)");
            return ((Number)object).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /*
     * Exception decompiling
     */
    @Override
    public Response intercept(Interceptor.Chain var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 105->121)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}


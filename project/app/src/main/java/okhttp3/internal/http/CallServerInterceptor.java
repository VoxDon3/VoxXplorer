/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import ax.Ob.h;
import ax.sb.a;
import ax.xc.f;
import ax.xc.p;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;

public final class CallServerInterceptor
implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean bl) {
        this.forWebSocket = bl;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int n8) {
        if (n8 == 100) {
            return true;
        }
        return 102 <= n8 && n8 < 200;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Response intercept(Interceptor.Chain var1_1) throws IOException {
        block28: {
            block27: {
                block30: {
                    block25: {
                        block26: {
                            block29: {
                                block24: {
                                    block21: {
                                        block23: {
                                            block22: {
                                                l.f(var1_1, "chain");
                                                var1_1 = (RealInterceptorChain)var1_1;
                                                var10_6 = var1_1.getExchange$okhttp();
                                                l.c(var10_6);
                                                var11_7 = var1_1.getRequest$okhttp();
                                                var12_8 = var11_7.body();
                                                var5_9 = System.currentTimeMillis();
                                                var9_10 = null;
                                                var10_6.writeRequestHeaders((Request)var11_7);
                                                if (!HttpMethod.permitsRequestBody(var11_7.method()) || var12_8 == null) break block21;
                                                if (!h.v("100-continue", var11_7.header("Expect"), true)) break block22;
                                                var10_6.flushRequest();
                                                var7_11 = var10_6.readResponseHeaders(true);
                                                try {
                                                    var10_6.responseHeadersStart();
                                                    var3_12 = 0;
                                                    break block23;
                                                }
                                                catch (IOException var1_2) {}
                                                ** GOTO lbl-1000
                                            }
                                            var7_11 = null;
                                            var3_12 = 1;
                                        }
                                        if (var7_11 != null) ** GOTO lbl51
                                        var8_14 = var7_11;
                                        var4_15 = var3_12;
                                        if (var12_8.isDuplex()) {
                                            var8_14 = var7_11;
                                            var4_15 = var3_12;
                                            var10_6.flushRequest();
                                            var8_14 = var7_11;
                                            var4_15 = var3_12;
                                            var12_8.writeTo(p.c(var10_6.createRequestBody((Request)var11_7, true)));
                                            var1_1 = var7_11;
                                            var2_13 = var3_12;
                                            break block24;
                                        } else {
                                            var8_14 = var7_11;
                                            var4_15 = var3_12;
                                            var1_1 = p.c(var10_6.createRequestBody((Request)var11_7, false));
                                            var8_14 = var7_11;
                                            var4_15 = var3_12;
                                            var12_8.writeTo((f)var1_1);
                                            var8_14 = var7_11;
                                            var4_15 = var3_12;
                                            var1_1.close();
                                            var1_1 = var7_11;
                                            var2_13 = var3_12;
                                        }
                                        break block24;
lbl51:
                                        // 1 sources

                                        var8_14 = var7_11;
                                        var4_15 = var3_12;
                                        var10_6.noRequestBody();
                                        var8_14 = var7_11;
                                        var4_15 = var3_12;
                                        var1_1 = var7_11;
                                        var2_13 = var3_12;
                                        if (var10_6.getConnection$okhttp().isMultiplexed$okhttp()) break block24;
                                        var8_14 = var7_11;
                                        var4_15 = var3_12;
                                        var10_6.noNewExchangesOnConnection();
                                        var1_1 = var7_11;
                                        var2_13 = var3_12;
                                        break block24;
                                    }
                                    try {
                                        var10_6.noRequestBody();
                                        var1_1 = null;
                                        var2_13 = 1;
                                        break block24;
                                    }
                                    catch (IOException var1_3) {
                                        var7_11 = null;
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        var2_13 = 1;
                                        break block25;
                                    }
                                }
                                if (var12_8 == null) break block29;
                                var8_14 = var1_1;
                                var4_15 = var2_13;
                                try {
                                    if (var12_8.isDuplex()) break block26;
                                }
                                catch (IOException var1_4) {
                                    var7_11 = var8_14;
                                    var2_13 = var4_15;
                                    break block25;
                                }
                            }
                            var8_14 = var1_1;
                            var4_15 = var2_13;
                            var10_6.finishRequest();
                        }
                        var8_14 = null;
                        var7_11 = var1_1;
                        break block30;
                    }
                    if (var1_1 instanceof ConnectionShutdownException) {
                        throw var1_1;
                    }
                    if (!var10_6.getHasFailure$okhttp()) {
                        throw var1_1;
                    }
                    var8_14 = var1_1;
                }
                var1_1 = var7_11;
                var3_12 = var2_13;
                if (var7_11 == null) {
                    try {
                        var7_11 = var10_6.readResponseHeaders(false);
                        l.c(var7_11);
                        var1_1 = var7_11;
                        var3_12 = var2_13;
                        if (var2_13 == 0) break block27;
                        var10_6.responseHeadersStart();
                        var3_12 = 0;
                        var1_1 = var7_11;
                    }
                    catch (IOException var1_5) {
                        break block28;
                    }
                }
            }
            var1_1 = var1_1.request((Request)var11_7).handshake(var10_6.getConnection$okhttp().handshake()).sentRequestAtMillis(var5_9).receivedResponseAtMillis(System.currentTimeMillis()).build();
            var2_13 = var4_15 = var1_1.code();
            if (this.shouldIgnoreAndWaitForRealResponse(var4_15)) {
                var1_1 = var10_6.readResponseHeaders(false);
                l.c(var1_1);
                if (var3_12 != 0) {
                    var10_6.responseHeadersStart();
                }
                var1_1 = var1_1.request((Request)var11_7).handshake(var10_6.getConnection$okhttp().handshake()).sentRequestAtMillis(var5_9).receivedResponseAtMillis(System.currentTimeMillis()).build();
                var2_13 = var1_1.code();
            }
            var10_6.responseHeadersEnd((Response)var1_1);
            var1_1 = this.forWebSocket != false && var2_13 == 101 ? var1_1.newBuilder().body(Util.EMPTY_RESPONSE).build() : var1_1.newBuilder().body(var10_6.openResponseBody((Response)var1_1)).build();
            if (h.v("close", var1_1.request().header("Connection"), true) || h.v("close", Response.header$default((Response)var1_1, "Connection", null, 2, null), true)) {
                var10_6.noNewExchangesOnConnection();
            }
            if ((var2_13 == 204 || var2_13 == 205) && (var5_9 = (var7_11 = var1_1.body()) != null ? var7_11.contentLength() : -1L) > 0L) {
                var10_6 = new StringBuilder();
                var10_6.append("HTTP ");
                var10_6.append(var2_13);
                var10_6.append(" had non-zero Content-Length: ");
                var11_7 = var1_1.body();
                var1_1 = var9_10;
                if (var11_7 != null) {
                    var1_1 = var11_7.contentLength();
                }
                var10_6.append(var1_1);
                var7_11 = new ProtocolException(var10_6.toString());
                throw var7_11;
            }
            return var1_1;
        }
        if (var8_14 != null) {
            a.a((Throwable)var8_14, var1_5);
            throw var8_14;
        }
        throw var1_5;
    }
}


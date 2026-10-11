/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.b6.v0;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.Y1;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.c2;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

final class d2
implements Runnable {
    private final byte[] c0;
    private final c2 d0;
    private final String e0;
    private final Map<String, String> f0;
    private final Y1 g0;
    private final URL q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public d2(Y1 y12, String string, URL uRL, byte[] byArray, Map map, c2 c22) {
        this.g0 = y12;
        p.f(string);
        p.l(uRL);
        p.l(c22);
        this.q = uRL;
        this.c0 = byArray;
        this.d0 = c22;
        this.e0 = string;
        this.f0 = map;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block32: {
            block31: {
                block28: {
                    block30: {
                        block29: {
                            this.g0.j();
                            var6_1 = null;
                            var4_2 = null;
                            var2_6 = this.q;
                            var2_6 = v0.a().b((URL)var2_6, "client-measurement");
                            if (!(var2_6 instanceof HttpURLConnection)) break block28;
                            var2_6 = (HttpURLConnection)var2_6;
                            var2_6.setDefaultUseCaches(false);
                            var2_6.setConnectTimeout(60000);
                            var2_6.setReadTimeout(61000);
                            var2_6.setInstanceFollowRedirects(false);
                            var2_6.setDoInput(true);
                            var3_7 = this.f0;
                            if (var3_7 != null) {
                                var3_7 = var3_7.entrySet().iterator();
                                while (var3_7.hasNext()) {
                                    var5_15 = (Map.Entry)var3_7.next();
                                    var2_6.addRequestProperty((String)var5_15.getKey(), (String)var5_15.getValue());
                                }
                            }
                            if (this.c0 == null) break block29;
                            var3_7 = this.g0.o().i0(this.c0);
                            this.g0.k().K().b("Uploading data. size", ((Map<String, List<String>>)var3_7).length);
                            var2_6.setDoOutput(true);
                            var2_6.addRequestProperty("Content-Encoding", "gzip");
                            var2_6.setFixedLengthStreamingMode(((Object)var3_7).length);
                            var2_6.connect();
                            var5_15 = var2_6.getOutputStream();
                            try {
                                var5_15.write((byte[])var3_7);
                                var5_15.close();
                            }
                            catch (Throwable var3_10) {
                                ** GOTO lbl78
                            }
                            catch (IOException var3_11) {
                                var4_2 = var5_15;
                                ** GOTO lbl-1000
                            }
                        }
                        try {
                            var1_18 = var2_6.getResponseCode();
                            break block30;
                        }
                        catch (Throwable var3_8) {}
                        ** GOTO lbl-1000
                        catch (IOException var3_9) {}
                        ** GOTO lbl-1000
                    }
                    var3_7 = var2_6.getHeaderFields();
                    try {
                        var4_2 = Y1.y(this.g0, (HttpURLConnection)var2_6);
                        var2_6.disconnect();
                    }
                    catch (Throwable var5_16) {
                        var6_1 = null;
                        var4_2 = var3_7;
                        var3_7 = var5_16;
                        var5_15 = var6_1;
                        break block31;
                    }
                    catch (IOException var4_3) {}
                    this.g0.l().D(new b2(this.e0, this.d0, var1_18, null, (byte[])var4_2, (Map)var3_7, null));
                    return;
                    ** GOTO lbl-1000
                    catch (Throwable var3_12) {
                        var5_15 = null;
                        var4_2 = null;
                        break block31;
                    }
                    catch (IOException var4_4) {
                        var3_7 = null;
                    }
lbl-1000:
                    // 2 sources

                    {
                        var5_15 = var4_2;
                        var4_2 = var6_1;
                        break block32;
                    }
                }
                try {
                    var2_6 = new IOException("Failed to obtain HTTP connection");
                    throw var2_6;
                }
                catch (Throwable var3_13) {}
lbl-1000:
                // 1 sources

                {
                    var5_15 = null;
lbl78:
                    // 2 sources

                    var4_2 = null;
                    var1_18 = 0;
                    break block31;
                }
                catch (IOException var3_14) {}
                finally {
                    var2_6 = null;
                }
lbl-1000:
                // 2 sources

                {
                    var6_1 = null;
                    var1_18 = 0;
                    var5_15 = var3_7;
                    var3_7 = var6_1;
                    break block32;
                }
            }
            if (var5_15 != null) {
                try {
                    var5_15.close();
                }
                catch (IOException var5_17) {
                    this.g0.k().G().c("Error closing HTTP compressed POST connection output stream. appId", V1.v(this.e0), var5_17);
                }
            }
            if (var2_6 != null) {
                var2_6.disconnect();
            }
            this.g0.l().D(new b2(this.e0, this.d0, var1_18, null, null, (Map)var4_2, null));
            throw var3_7;
        }
        if (var4_2 != null) {
            try {
                var4_2.close();
            }
            catch (IOException var4_5) {
                this.g0.k().G().c("Error closing HTTP compressed POST connection output stream. appId", V1.v(this.e0), var4_5);
            }
        }
        if (var2_6 != null) {
            var2_6.disconnect();
        }
        this.g0.l().D(new b2(this.e0, this.d0, var1_18, (Throwable)var5_15, null, (Map)var3_7, null));
    }
}


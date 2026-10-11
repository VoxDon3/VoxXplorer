/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.b6.v0;
import com.google.android.gms.measurement.internal.Y3;
import com.google.android.gms.measurement.internal.a4;
import com.google.android.gms.measurement.internal.c4;
import com.google.android.gms.measurement.internal.f3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

final class Z3
implements Runnable {
    private final a4 c0;
    private final String d0;
    private final Map<String, String> e0;
    private final Y3 f0;
    private final URL q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Z3(Y3 y32, String string, URL uRL, byte[] byArray, Map map, a4 a42) {
        this.f0 = y32;
        p.f(string);
        p.l(uRL);
        p.l(a42);
        this.q = uRL;
        this.c0 = a42;
        this.d0 = string;
        this.e0 = null;
    }

    private final void b(int n8, Exception exception, byte[] byArray, Map<String, List<String>> map) {
        ((f3)this.f0).l().D(new c4(this, n8, exception, byArray, map));
    }

    final /* synthetic */ void a(int n8, Exception exception, byte[] byArray, Map map) {
        this.c0.a(this.d0, n8, exception, byArray, map);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        Map<String, List<String>> map;
        int n8;
        block14: {
            Object object3;
            block13: {
                int n9;
                block12: {
                    ((f3)this.f0).j();
                    int n10 = 0;
                    n8 = 0;
                    n9 = 0;
                    int n11 = 0;
                    map = this.q;
                    map = v0.a().b((URL)((Object)map), "client-measurement");
                    if (!(map instanceof HttpURLConnection)) break block12;
                    map = (HttpURLConnection)((Object)map);
                    ((URLConnection)((Object)map)).setDefaultUseCaches(false);
                    ((URLConnection)((Object)map)).setConnectTimeout(60000);
                    ((URLConnection)((Object)map)).setReadTimeout(61000);
                    ((HttpURLConnection)((Object)map)).setInstanceFollowRedirects(false);
                    ((URLConnection)((Object)map)).setDoInput(true);
                    n11 = n8 = ((HttpURLConnection)((Object)map)).getResponseCode();
                    n10 = n8;
                    object2 = ((URLConnection)((Object)map)).getHeaderFields();
                    try {
                        byte[] byArray = Y3.u(this.f0, (HttpURLConnection)((Object)map));
                        ((HttpURLConnection)((Object)map)).disconnect();
                        this.b(n8, null, byArray, (Map<String, List<String>>)object2);
                        return;
                    }
                    catch (Throwable throwable) {
                        object3 = map;
                        map = object2;
                        object2 = throwable;
                        break block13;
                    }
                    catch (IOException iOException) {
                        object = map;
                        map = object2;
                        object2 = iOException;
                        break block14;
                    }
                    catch (Throwable throwable) {
                        Object var8_16 = null;
                        n8 = n11;
                        object3 = map;
                        map = var8_16;
                        break block13;
                    }
                    catch (IOException iOException) {
                        Object var8_17 = null;
                        n8 = n10;
                        object = map;
                        map = var8_17;
                        break block14;
                    }
                }
                try {
                    map = new Map<String, List<String>>("Failed to obtain HTTP connection");
                    throw map;
                }
                catch (Throwable throwable) {
                    object3 = null;
                    map = null;
                }
                catch (IOException iOException) {
                    object = null;
                    map = null;
                    n8 = n9;
                    break block14;
                }
            }
            if (object3 != null) {
                ((HttpURLConnection)object3).disconnect();
            }
            this.b(n8, null, null, map);
            throw object2;
        }
        if (object != null) {
            ((HttpURLConnection)object).disconnect();
        }
        this.b(n8, (Exception)object2, null, map);
    }
}


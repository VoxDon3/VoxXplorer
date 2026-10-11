package com.google.android.gms.measurement.internal;

import ax.M5.C0821p;
import ax.b6.AbstractC1683v0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class Z3 implements Runnable {
    private final InterfaceC3619a4 c0;
    private final String d0;
    private final Map<String, String> e0;
    private final /* synthetic */ Y3 f0;
    private final URL q;

    public Z3(Y3 y3, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC3619a4 interfaceC3619a4) {
        this.f0 = y3;
        C0821p.f(str);
        C0821p.l(url);
        C0821p.l(interfaceC3619a4);
        this.q = url;
        this.c0 = interfaceC3619a4;
        this.d0 = str;
        this.e0 = null;
    }

    private final void b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f0.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.c4
            @Override // java.lang.Runnable
            public final void run() {
                Z3.this.a(i, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.c0.a(this.d0, i, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] v;
        this.f0.j();
        int i = 0;
        try {
            URLConnection b = AbstractC1683v0.a().b(this.q, "client-measurement");
            if (!(b instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) b;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
                try {
                    Y3 y3 = this.f0;
                    v = Y3.v(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(i, null, v, map);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, e, null, map);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, null, null, map);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                map = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import android.text.TextUtils;
import android.util.Log;
import ax.M3.e;
import ax.N3.b;
import ax.U3.g;
import ax.k4.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class h
implements ax.N3.b<InputStream> {
    static final b h0 = new a();
    private final int c0;
    private final b d0;
    private HttpURLConnection e0;
    private InputStream f0;
    private volatile boolean g0;
    private final g q;

    public h(g g8, int n8) {
        this(g8, n8, h0);
    }

    h(g g8, int n8, b b8) {
        this.q = g8;
        this.c0 = n8;
        this.d0 = b8;
    }

    private InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty((CharSequence)httpURLConnection.getContentEncoding())) {
            int n8 = httpURLConnection.getContentLength();
            this.f0 = ax.k4.b.b(httpURLConnection.getInputStream(), n8);
        } else {
            if (Log.isLoggable((String)"HttpUrlFetcher", (int)3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got non empty content encoding: ");
                stringBuilder.append(httpURLConnection.getContentEncoding());
                Log.d((String)"HttpUrlFetcher", (String)stringBuilder.toString());
            }
            this.f0 = httpURLConnection.getInputStream();
        }
        return this.f0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream f(URL uRL, int n8, URL object, Map<String, String> map) throws IOException {
        Map<String, String> var4_10;
        if (n8 >= 5) {
            throw new e("Too many (> 5) redirects!");
        }
        if (object != null) {
            try {
                if (uRL.toURI().equals(((URL)object).toURI())) {
                    e e8 = new e("In re-direct loop");
                    throw e8;
                }
            }
            catch (URISyntaxException uRISyntaxException) {}
        }
        this.e0 = this.d0.a(uRL);
        for (Map.Entry entry : var4_10.entrySet()) {
            this.e0.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        this.e0.setConnectTimeout(this.c0);
        this.e0.setReadTimeout(this.c0);
        this.e0.setUseCaches(false);
        this.e0.setDoInput(true);
        this.e0.setInstanceFollowRedirects(false);
        this.e0.connect();
        if (this.g0) {
            return null;
        }
        int n9 = this.e0.getResponseCode();
        int n10 = n9 / 100;
        if (n10 == 2) {
            return this.c(this.e0);
        }
        if (n10 == 3) {
            String string = this.e0.getHeaderField("Location");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                return this.f(new URL(uRL, string), n8 + 1, uRL, (Map<String, String>)var4_10);
            }
            throw new e("Received empty or null redirect url");
        }
        if (n9 == -1) {
            throw new e(n9);
        }
        throw new e(this.e0.getResponseMessage(), n9);
    }

    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override
    public void b() {
        Object object = this.f0;
        if (object != null) {
            try {
                ((InputStream)object).close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if ((object = this.e0) != null) {
            ((HttpURLConnection)object).disconnect();
        }
    }

    @Override
    public void cancel() {
        this.g0 = true;
    }

    @Override
    public ax.M3.a d() {
        return ax.M3.a.c0;
    }

    @Override
    public void e(ax.J3.g object, b.a<? super InputStream> a8) {
        long l8 = d.b();
        try {
            object = this.f(this.q.h(), 0, null, this.q.e());
        }
        catch (IOException iOException) {
            if (Log.isLoggable((String)"HttpUrlFetcher", (int)3)) {
                Log.d((String)"HttpUrlFetcher", (String)"Failed to load data for url", (Throwable)iOException);
            }
            a8.c(iOException);
            return;
        }
        if (Log.isLoggable((String)"HttpUrlFetcher", (int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finished http url fetcher fetch in ");
            stringBuilder.append(d.a(l8));
            stringBuilder.append(" ms and loaded ");
            stringBuilder.append(object);
            Log.v((String)"HttpUrlFetcher", (String)stringBuilder.toString());
        }
        a8.f((InputStream)object);
    }

    private static class a
    implements b {
        a() {
        }

        @Override
        public HttpURLConnection a(URL uRL) throws IOException {
            return (HttpURLConnection)uRL.openConnection();
        }
    }

    static interface b {
        public HttpURLConnection a(URL var1) throws IOException;
    }
}


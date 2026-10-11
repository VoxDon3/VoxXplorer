package ax.N3;

import android.text.TextUtils;
import android.util.Log;
import ax.N3.b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class h implements ax.N3.b<InputStream> {
    static final b h0 = new a();
    private final int c0;
    private final b d0;
    private HttpURLConnection e0;
    private InputStream f0;
    private volatile boolean g0;
    private final ax.U3.g q;

    private static class a implements b {
        a() {
        }

        @Override // ax.N3.h.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public h(ax.U3.g gVar, int i) {
        this(gVar, i, h0);
    }

    private InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f0 = ax.k4.b.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f0 = httpURLConnection.getInputStream();
        }
        return this.f0;
    }

    private InputStream f(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i >= 5) {
            throw new ax.M3.e("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new ax.M3.e("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.e0 = this.d0.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.e0.addRequestProperty(entry.getKey(), entry.getValue());
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
        int responseCode = this.e0.getResponseCode();
        int i2 = responseCode / 100;
        if (i2 == 2) {
            return c(this.e0);
        }
        if (i2 != 3) {
            if (responseCode == -1) {
                throw new ax.M3.e(responseCode);
            }
            throw new ax.M3.e(this.e0.getResponseMessage(), responseCode);
        }
        String headerField = this.e0.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new ax.M3.e("Received empty or null redirect url");
        }
        return f(new URL(url, headerField), i + 1, url, map);
    }

    @Override // ax.N3.b
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // ax.N3.b
    public void b() {
        InputStream inputStream = this.f0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.e0;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // ax.N3.b
    public void cancel() {
        this.g0 = true;
    }

    @Override // ax.N3.b
    public ax.M3.a d() {
        return ax.M3.a.REMOTE;
    }

    @Override // ax.N3.b
    public void e(ax.J3.g gVar, b.a<? super InputStream> aVar) {
        long b2 = ax.k4.d.b();
        try {
            InputStream f = f(this.q.h(), 0, null, this.q.e());
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ax.k4.d.a(b2) + " ms and loaded " + f);
            }
            aVar.f(f);
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.c(e);
        }
    }

    h(ax.U3.g gVar, int i, b bVar) {
        this.q = gVar;
        this.c0 = i;
        this.d0 = bVar;
    }
}

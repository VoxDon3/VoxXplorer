/*
 * Decompiled with CFR 0.152.
 */
package ax.s4;

import ax.s4.a;
import ax.w4.c;
import ax.w4.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class b
extends a {
    private static final Logger d = Logger.getLogger(b.class.getCanonicalName());
    public static final b e = new b(ax.s4.b$b.e);
    private static volatile boolean f = false;
    private final b c;

    public b(b b8) {
        this.c = b8;
    }

    private static OutputStream g(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setDoOutput(true);
        return httpURLConnection.getOutputStream();
    }

    private static void i() {
        if (!f) {
            f = true;
            d.warning("Certificate pinning disabled for HTTPS connections. This is likely because your JRE does not return javax.net.ssl.HttpsURLConnection objects for https network connections. Be aware your app may be prone to man-in-the-middle attacks without proper SSL certificate validation. If you are using Google App Engine, please configure DbxRequestConfig to use GoogleAppEngineRequestor.");
        }
    }

    private a.b m(HttpURLConnection httpURLConnection) throws IOException {
        int n8 = httpURLConnection.getResponseCode();
        InputStream inputStream = n8 < 400 && n8 != -1 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        this.h(httpURLConnection);
        return new a.b(n8, inputStream, httpURLConnection.getHeaderFields());
    }

    protected void e(HttpURLConnection httpURLConnection) throws IOException {
    }

    @Deprecated
    protected void f(HttpsURLConnection httpsURLConnection) throws IOException {
    }

    protected void h(HttpURLConnection httpURLConnection) throws IOException {
    }

    protected HttpURLConnection j(String object, Iterable<a.a> object2, boolean bl) throws IOException {
        object = (HttpURLConnection)new URL((String)object).openConnection(this.c.c());
        ((URLConnection)object).setConnectTimeout((int)this.c.b());
        ((URLConnection)object).setReadTimeout((int)this.c.d());
        ((URLConnection)object).setUseCaches(false);
        ((URLConnection)object).setAllowUserInteraction(false);
        if (bl) {
            ((HttpURLConnection)object).setChunkedStreamingMode(16384);
        }
        if (object instanceof HttpsURLConnection) {
            if (this.c.e() != null) {
                ((HttpsURLConnection)object).setSSLSocketFactory(this.c.e());
            }
            this.f((HttpsURLConnection)object);
        } else if (this.c.e() != null) {
            ax.s4.b.i();
        }
        this.e((HttpURLConnection)object);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            a.a a8 = (a.a)object2.next();
            ((URLConnection)object).addRequestProperty(a8.a(), a8.b());
        }
        return object;
    }

    public c k(String object, Iterable<a.a> iterable) throws IOException {
        object = this.j((String)object, iterable, false);
        ((HttpURLConnection)object).setRequestMethod("POST");
        return new c(this, (HttpURLConnection)object);
    }

    public c l(String object, Iterable<a.a> iterable) throws IOException {
        object = this.j((String)object, iterable, true);
        ((HttpURLConnection)object).setRequestMethod("POST");
        return new c(this, (HttpURLConnection)object);
    }

    public static final class b {
        public static final b e = ax.s4.b$b.a().a();
        private final Proxy a;
        private final long b;
        private final long c;
        private final SSLSocketFactory d;

        private b(Proxy proxy, long l8, long l9, SSLSocketFactory sSLSocketFactory) {
            this.a = proxy;
            this.b = l8;
            this.c = l9;
            this.d = sSLSocketFactory;
        }

        public static a a() {
            return new a();
        }

        public long b() {
            return this.b;
        }

        public Proxy c() {
            return this.a;
        }

        public long d() {
            return this.c;
        }

        public SSLSocketFactory e() {
            return this.d;
        }

        public static final class a {
            private Proxy a;
            private long b;
            private long c;
            private SSLSocketFactory d;

            private a() {
                this(Proxy.NO_PROXY, ax.s4.a.a, ax.s4.a.b, null);
            }

            private a(Proxy proxy, long l8, long l9, SSLSocketFactory sSLSocketFactory) {
                this.a = proxy;
                this.b = l8;
                this.c = l9;
                this.d = sSLSocketFactory;
            }

            public b a() {
                return new b(this.a, this.b, this.c, this.d);
            }
        }
    }

    private class c
    extends a.c {
        private final e a;
        private HttpURLConnection b;
        final b c;

        public c(b b8, HttpURLConnection httpURLConnection) throws IOException {
            this.c = b8;
            this.b = httpURLConnection;
            this.a = new e(ax.s4.b.g(httpURLConnection));
            httpURLConnection.connect();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a() {
            HttpURLConnection httpURLConnection = this.b;
            if (httpURLConnection == null) {
                return;
            }
            if (httpURLConnection.getDoOutput()) {
                try {
                    ax.w4.c.b(this.b.getOutputStream());
                }
                catch (IOException iOException) {}
            }
            this.b = null;
        }

        @Override
        public a.b b() throws IOException {
            Object object = this.b;
            if (object != null) {
                try {
                    object = this.c.m((HttpURLConnection)object);
                    return object;
                }
                finally {
                    this.b = null;
                }
            }
            throw new IllegalStateException("Can't finish().  Uploader already closed.");
        }

        @Override
        public OutputStream c() {
            return this.a;
        }

        @Override
        public void d(c.d d8) {
            this.a.a(d8);
        }
    }
}


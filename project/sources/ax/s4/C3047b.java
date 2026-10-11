package ax.s4;

import ax.s4.AbstractC3046a;
import ax.w4.C3343c;
import ax.w4.C3345e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3047b extends AbstractC3046a {
    private static final Logger d = Logger.getLogger(C3047b.class.getCanonicalName());
    public static final C3047b e = new C3047b(C0449b.e);
    private static volatile boolean f = false;
    private final C0449b c;

    /* renamed from: ax.s4.b$b, reason: collision with other inner class name */
    public static final class C0449b {
        public static final C0449b e = a().a();
        private final Proxy a;
        private final long b;
        private final long c;
        private final SSLSocketFactory d;

        /* renamed from: ax.s4.b$b$a */
        public static final class a {
            private Proxy a;
            private long b;
            private long c;
            private SSLSocketFactory d;

            public C0449b a() {
                return new C0449b(this.a, this.b, this.c, this.d);
            }

            private a() {
                this(Proxy.NO_PROXY, AbstractC3046a.a, AbstractC3046a.b, null);
            }

            private a(Proxy proxy, long j, long j2, SSLSocketFactory sSLSocketFactory) {
                this.a = proxy;
                this.b = j;
                this.c = j2;
                this.d = sSLSocketFactory;
            }
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

        private C0449b(Proxy proxy, long j, long j2, SSLSocketFactory sSLSocketFactory) {
            this.a = proxy;
            this.b = j;
            this.c = j2;
            this.d = sSLSocketFactory;
        }
    }

    /* renamed from: ax.s4.b$c */
    private class c extends AbstractC3046a.c {
        private final C3345e a;
        private HttpURLConnection b;

        public c(HttpURLConnection httpURLConnection) throws IOException {
            this.b = httpURLConnection;
            this.a = new C3345e(C3047b.g(httpURLConnection));
            httpURLConnection.connect();
        }

        @Override // ax.s4.AbstractC3046a.c
        public void a() {
            HttpURLConnection httpURLConnection = this.b;
            if (httpURLConnection == null) {
                return;
            }
            if (httpURLConnection.getDoOutput()) {
                try {
                    C3343c.b(this.b.getOutputStream());
                } catch (IOException unused) {
                }
            }
            this.b = null;
        }

        @Override // ax.s4.AbstractC3046a.c
        public AbstractC3046a.b b() throws IOException {
            HttpURLConnection httpURLConnection = this.b;
            if (httpURLConnection == null) {
                throw new IllegalStateException("Can't finish().  Uploader already closed.");
            }
            try {
                return C3047b.this.m(httpURLConnection);
            } finally {
                this.b = null;
            }
        }

        @Override // ax.s4.AbstractC3046a.c
        public OutputStream c() {
            return this.a;
        }

        @Override // ax.s4.AbstractC3046a.c
        public void d(C3343c.d dVar) {
            this.a.a(dVar);
        }
    }

    public C3047b(C0449b c0449b) {
        this.c = c0449b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OutputStream g(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setDoOutput(true);
        return httpURLConnection.getOutputStream();
    }

    private static void i() {
        if (f) {
            return;
        }
        f = true;
        d.warning("Certificate pinning disabled for HTTPS connections. This is likely because your JRE does not return javax.net.ssl.HttpsURLConnection objects for https network connections. Be aware your app may be prone to man-in-the-middle attacks without proper SSL certificate validation. If you are using Google App Engine, please configure DbxRequestConfig to use GoogleAppEngineRequestor.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC3046a.b m(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = (responseCode >= 400 || responseCode == -1) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        h(httpURLConnection);
        return new AbstractC3046a.b(responseCode, errorStream, httpURLConnection.getHeaderFields());
    }

    protected HttpURLConnection j(String str, Iterable<AbstractC3046a.C0448a> iterable, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection(this.c.c());
        httpURLConnection.setConnectTimeout((int) this.c.b());
        httpURLConnection.setReadTimeout((int) this.c.d());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        if (z) {
            httpURLConnection.setChunkedStreamingMode(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            if (this.c.e() != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.c.e());
            }
            f((HttpsURLConnection) httpURLConnection);
        } else if (this.c.e() != null) {
            i();
        }
        e(httpURLConnection);
        for (AbstractC3046a.C0448a c0448a : iterable) {
            httpURLConnection.addRequestProperty(c0448a.a(), c0448a.b());
        }
        return httpURLConnection;
    }

    @Override // ax.s4.AbstractC3046a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c a(String str, Iterable<AbstractC3046a.C0448a> iterable) throws IOException {
        HttpURLConnection j = j(str, iterable, false);
        j.setRequestMethod("POST");
        return new c(j);
    }

    @Override // ax.s4.AbstractC3046a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b(String str, Iterable<AbstractC3046a.C0448a> iterable) throws IOException {
        HttpURLConnection j = j(str, iterable, true);
        j.setRequestMethod("POST");
        return new c(j);
    }

    protected void e(HttpURLConnection httpURLConnection) throws IOException {
    }

    @Deprecated
    protected void f(HttpsURLConnection httpsURLConnection) throws IOException {
    }

    protected void h(HttpURLConnection httpURLConnection) throws IOException {
    }
}

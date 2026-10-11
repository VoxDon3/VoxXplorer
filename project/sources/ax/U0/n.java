package ax.U0;

import android.net.Uri;
import ax.S0.C0987u;
import ax.U0.g;
import ax.U0.n;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2985t;
import ax.r7.d0;
import ax.s7.C3055b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class n extends ax.U0.b implements g {
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private final String i;
    private final v j;
    private final v k;
    private final ax.q7.o<String> l;
    private final boolean m;
    private k n;
    private HttpURLConnection o;
    private InputStream p;
    private boolean q;
    private int r;
    private long s;
    private long t;

    public static final class b implements g.a {
        private z b;
        private ax.q7.o<String> c;
        private String d;
        private boolean g;
        private boolean h;
        private boolean i;
        private final v a = new v();
        private int e = 8000;
        private int f = 8000;

        @Override // ax.U0.g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a() {
            n nVar = new n(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i);
            z zVar = this.b;
            if (zVar != null) {
                nVar.d(zVar);
            }
            return nVar;
        }

        public b c(String str) {
            this.d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends AbstractC2985t<String, List<String>> {
        private final Map<String, List<String>> q;

        public c(Map<String, List<String>> map) {
            this.q = map;
        }

        public static /* synthetic */ boolean n(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean p(String str) {
            return str != null;
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.i(obj);
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return d0.b(super.entrySet(), new ax.q7.o() { // from class: ax.U0.o
                @Override // ax.q7.o
                public final boolean apply(Object obj) {
                    return n.c.n((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.k(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.r7.AbstractC2986u
        public Map<String, List<String>> g() {
            return this.q;
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.l();
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        public Set<String> keySet() {
            return d0.b(super.keySet(), new ax.q7.o() { // from class: ax.U0.p
                @Override // ax.q7.o
                public final boolean apply(Object obj) {
                    return n.c.p((String) obj);
                }
            });
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // ax.r7.AbstractC2985t, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private int A(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s;
        if (j != -1) {
            long j2 = j - this.t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) ax.S0.d0.i(this.p)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.t += read;
        q(read);
        return read;
    }

    private void B(long j, k kVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) ax.S0.d0.i(this.p)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new s(new InterruptedIOException(), kVar, 2000, 1);
            }
            if (read == -1) {
                throw new s(kVar, 2008, 1);
            }
            j -= read;
            q(read);
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C0987u.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    private URL v(URL url, String str, k kVar) throws s {
        if (str == null) {
            throw new s("Null location redirect", kVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new s("Unsupported protocol redirect: " + protocol, kVar, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new s(e, kVar, 2001, 1);
                }
            }
            throw new s("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", kVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new s(e2, kVar, 2001, 1);
        }
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(k kVar) throws IOException {
        HttpURLConnection y;
        URL url = new URL(kVar.a.toString());
        int i = kVar.c;
        byte[] bArr = kVar.d;
        long j = kVar.g;
        long j2 = kVar.h;
        int i2 = 1;
        boolean d = kVar.d(1);
        if (!this.e && !this.f && !this.m) {
            return y(url, i, bArr, j, j2, d, true, kVar.e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new s(new NoRouteToHostException("Too many redirects: " + i4), kVar, 2001, 1);
            }
            y = y(url, i, bArr, j, j2, d, false, kVar.e);
            int responseCode = y.getResponseCode();
            String headerField = y.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                y.disconnect();
                url = v(url, headerField, kVar);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                y.disconnect();
                if (!this.m || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = v(url, headerField, kVar);
            }
            i3 = i4;
            i2 = 1;
        }
        return y;
    }

    private HttpURLConnection y(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection z3 = z(url);
        z3.setConnectTimeout(this.g);
        z3.setReadTimeout(this.h);
        HashMap hashMap = new HashMap();
        v vVar = this.j;
        if (vVar != null) {
            hashMap.putAll(vVar.a());
        }
        hashMap.putAll(this.k.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            z3.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = w.a(j, j2);
        if (a2 != null) {
            z3.setRequestProperty("Range", a2);
        }
        String str = this.i;
        if (str != null) {
            z3.setRequestProperty("User-Agent", str);
        }
        z3.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        z3.setInstanceFollowRedirects(z2);
        z3.setDoOutput(bArr != null);
        z3.setRequestMethod(k.c(i));
        if (bArr == null) {
            z3.connect();
            return z3;
        }
        z3.setFixedLengthStreamingMode(bArr.length);
        z3.connect();
        OutputStream outputStream = z3.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return z3;
    }

    @Override // ax.U0.g
    public Uri b() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.n;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws s {
        try {
            return A(bArr, i, i2);
        } catch (IOException e) {
            throw s.c(e, (k) ax.S0.d0.i(this.n), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.U0.g
    public void close() throws s {
        try {
            InputStream inputStream = this.p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new s(e, (k) ax.S0.d0.i(this.n), 2000, 3);
                }
            }
        } finally {
            this.p = null;
            u();
            if (this.q) {
                this.q = false;
                r();
            }
            this.o = null;
            this.n = null;
        }
    }

    @Override // ax.U0.g
    public long f(k kVar) throws s {
        byte[] bArr;
        this.n = kVar;
        long j = 0;
        this.t = 0L;
        this.s = 0L;
        s(kVar);
        try {
            HttpURLConnection x = x(kVar);
            this.o = x;
            this.r = x.getResponseCode();
            String responseMessage = x.getResponseMessage();
            int i = this.r;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = x.getHeaderFields();
                if (this.r == 416) {
                    if (kVar.g == w.c(x.getHeaderField("Content-Range"))) {
                        this.q = true;
                        t(kVar);
                        long j2 = kVar.h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = x.getErrorStream();
                try {
                    bArr = errorStream != null ? C3055b.g(errorStream) : ax.S0.d0.f;
                } catch (IOException unused) {
                    bArr = ax.S0.d0.f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new u(this.r, responseMessage, this.r == 416 ? new h(2008) : null, headerFields, kVar, bArr2);
            }
            String contentType = x.getContentType();
            ax.q7.o<String> oVar = this.l;
            if (oVar != null && !oVar.apply(contentType)) {
                u();
                throw new t(contentType, kVar);
            }
            if (this.r == 200) {
                long j3 = kVar.g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean w = w(x);
            if (w) {
                this.s = kVar.h;
            } else {
                long j4 = kVar.h;
                if (j4 != -1) {
                    this.s = j4;
                } else {
                    long b2 = w.b(x.getHeaderField("Content-Length"), x.getHeaderField("Content-Range"));
                    this.s = b2 != -1 ? b2 - j : -1L;
                }
            }
            try {
                this.p = x.getInputStream();
                if (w) {
                    this.p = new GZIPInputStream(this.p);
                }
                this.q = true;
                t(kVar);
                try {
                    B(j, kVar);
                    return this.s;
                } catch (IOException e) {
                    u();
                    if (e instanceof s) {
                        throw ((s) e);
                    }
                    throw new s(e, kVar, 2000, 1);
                }
            } catch (IOException e2) {
                u();
                throw new s(e2, kVar, 2000, 1);
            }
        } catch (IOException e3) {
            u();
            throw s.c(e3, kVar, 1);
        }
    }

    @Override // ax.U0.b, ax.U0.g
    public Map<String, List<String>> l() {
        HttpURLConnection httpURLConnection = this.o;
        return httpURLConnection == null ? AbstractC2962A.k() : new c(httpURLConnection.getHeaderFields());
    }

    HttpURLConnection z(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private n(String str, int i, int i2, boolean z, boolean z2, v vVar, ax.q7.o<String> oVar, boolean z3) {
        super(true);
        this.i = str;
        this.g = i;
        this.h = i2;
        this.e = z;
        this.f = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.j = vVar;
        this.l = oVar;
        this.k = new v();
        this.m = z3;
    }
}

/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.h;
import ax.U0.k;
import ax.U0.o;
import ax.U0.p;
import ax.U0.s;
import ax.U0.t;
import ax.U0.u;
import ax.U0.v;
import ax.U0.w;
import ax.U0.z;
import ax.r7.A;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class n
extends ax.U0.b
implements g {
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

    private n(String string, int n8, int n9, boolean bl, boolean bl2, v v8, ax.q7.o<String> o8, boolean bl3) {
        super(true);
        this.i = string;
        this.g = n8;
        this.h = n9;
        this.e = bl;
        this.f = bl2;
        if (bl && bl2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.j = v8;
        this.l = o8;
        this.k = new v();
        this.m = bl3;
    }

    private int A(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        long l8 = this.s;
        int n10 = n9;
        if (l8 != -1L) {
            if ((l8 -= this.t) == 0L) {
                return -1;
            }
            n10 = (int)Math.min((long)n9, l8);
        }
        if ((n8 = d0.i(this.p).read(byArray, n8, n10)) == -1) {
            return -1;
        }
        this.t += (long)n8;
        this.q(n8);
        return n8;
    }

    private void B(long l8, k k8) throws IOException {
        if (l8 != 0L) {
            byte[] byArray = new byte[4096];
            while (l8 > 0L) {
                int n8 = (int)Math.min(l8, (long)4096);
                n8 = d0.i(this.p).read(byArray, 0, n8);
                if (!Thread.currentThread().isInterrupted()) {
                    if (n8 != -1) {
                        l8 -= (long)n8;
                        this.q(n8);
                        continue;
                    }
                    throw new s(k8, 2008, 1);
                }
                throw new s(new InterruptedIOException(), k8, 2000, 1);
            }
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
                return;
            }
            catch (Exception exception) {
                ax.S0.u.d("DefaultHttpDataSource", "Unexpected error while disconnecting", exception);
            }
        }
    }

    private URL v(URL serializable, String string, k k8) throws s {
        if (string != null) {
            Serializable serializable2;
            block7: {
                try {
                    serializable2 = new URL((URL)serializable, string);
                    string = ((URL)serializable2).getProtocol();
                    if ("https".equals(string) || "http".equals(string)) break block7;
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("Unsupported protocol redirect: ");
                }
                catch (MalformedURLException malformedURLException) {
                    throw new s(malformedURLException, k8, 2001, 1);
                }
                ((StringBuilder)serializable).append(string);
                throw new s(((StringBuilder)serializable).toString(), k8, 2001, 1);
            }
            if (!this.e && !string.equals(((URL)serializable).getProtocol())) {
                if (this.f) {
                    try {
                        serializable = new URL(((URL)serializable2).toString().replaceFirst(string, ((URL)serializable).getProtocol()));
                        return serializable;
                    }
                    catch (MalformedURLException malformedURLException) {
                        throw new s(malformedURLException, k8, 2001, 1);
                    }
                }
                serializable2 = new StringBuilder();
                ((StringBuilder)serializable2).append("Disallowed cross-protocol redirect (");
                ((StringBuilder)serializable2).append(((URL)serializable).getProtocol());
                ((StringBuilder)serializable2).append(" to ");
                ((StringBuilder)serializable2).append(string);
                ((StringBuilder)serializable2).append(")");
                throw new s(((StringBuilder)serializable2).toString(), k8, 2001, 1);
            }
            return serializable2;
        }
        throw new s("Null location redirect", k8, 2001, 1);
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private HttpURLConnection x(k k8) throws IOException {
        int n8;
        URL uRL = new URL(k8.a.toString());
        int n9 = k8.c;
        Object object = k8.d;
        long l8 = k8.g;
        long l9 = k8.h;
        boolean bl = k8.d(1);
        if (!(this.e || this.f || this.m)) {
            return this.y(uRL, n9, (byte[])object, l8, l9, bl, true, k8.e);
        }
        int n10 = 0;
        while (true) {
            n8 = n10 + 1;
            if (n10 > 20) break;
            HttpURLConnection httpURLConnection = this.y(uRL, n9, (byte[])object, l8, l9, bl, false, k8.e);
            n10 = httpURLConnection.getResponseCode();
            String string = httpURLConnection.getHeaderField("Location");
            if (n9 != 1 && n9 != 3 || n10 != 300 && n10 != 301 && n10 != 302 && n10 != 303 && n10 != 307 && n10 != 308) {
                if (n9 != 2 || n10 != 300 && n10 != 301 && n10 != 302 && n10 != 303) return httpURLConnection;
                httpURLConnection.disconnect();
                if (!this.m || n10 != 302) {
                    object = null;
                    n9 = 1;
                }
                uRL = this.v(uRL, string, k8);
            } else {
                httpURLConnection.disconnect();
                uRL = this.v(uRL, string, k8);
            }
            n10 = n8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Too many redirects: ");
        ((StringBuilder)object).append(n8);
        throw new s(new NoRouteToHostException(((StringBuilder)object).toString()), k8, 2001, 1);
    }

    private HttpURLConnection y(URL object, int n8, byte[] byArray, long l8, long l9, boolean bl, boolean bl2, Map<String, String> object22) throws IOException {
        HttpURLConnection httpURLConnection = this.z((URL)object);
        httpURLConnection.setConnectTimeout(this.g);
        httpURLConnection.setReadTimeout(this.h);
        object = new HashMap<String, String>();
        v v8 = this.j;
        if (v8 != null) {
            object.putAll(v8.a());
        }
        object.putAll(this.k.a());
        object.putAll(object22);
        for (Map.Entry entry : object.entrySet()) {
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        object = w.a(l8, l9);
        if (object != null) {
            httpURLConnection.setRequestProperty("Range", (String)object);
        }
        if ((object = this.i) != null) {
            httpURLConnection.setRequestProperty("User-Agent", (String)object);
        }
        object = bl ? "gzip" : "identity";
        httpURLConnection.setRequestProperty("Accept-Encoding", (String)object);
        httpURLConnection.setInstanceFollowRedirects(bl2);
        bl = byArray != null;
        httpURLConnection.setDoOutput(bl);
        httpURLConnection.setRequestMethod(ax.U0.k.c(n8));
        if (byArray != null) {
            httpURLConnection.setFixedLengthStreamingMode(byArray.length);
            httpURLConnection.connect();
            object = httpURLConnection.getOutputStream();
            ((OutputStream)object).write(byArray);
            ((OutputStream)object).close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override
    public Uri b() {
        Object object = this.o;
        if (object != null) {
            return Uri.parse((String)((URLConnection)object).getURL().toString());
        }
        object = this.n;
        if (object != null) {
            return ((k)object).a;
        }
        return null;
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws s {
        try {
            n8 = this.A(byArray, n8, n9);
            return n8;
        }
        catch (IOException iOException) {
            throw ax.U0.s.c(iOException, d0.i(this.n), 2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws s {
        Throwable throwable2;
        block7: {
            block6: {
                try {
                    InputStream inputStream = this.p;
                    if (inputStream == null) break block6;
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {
                        s s8 = new s(iOException, d0.i(this.n), 2000, 3);
                        throw s8;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.p = null;
            this.u();
            if (this.q) {
                this.q = false;
                this.r();
            }
            this.o = null;
            this.n = null;
            return;
        }
        this.p = null;
        this.u();
        if (this.q) {
            this.q = false;
            this.r();
        }
        this.o = null;
        this.n = null;
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public long f(k var1_1) throws s {
        block19: {
            block22: {
                block21: {
                    block20: {
                        this.n = var1_1;
                        var7_2 = 0L;
                        this.t = 0L;
                        this.s = 0L;
                        this.s(var1_1);
                        var12_3 = this.x(var1_1);
                        this.o = var12_3;
                        this.r = var12_3.getResponseCode();
                        var15_8 = var12_3.getResponseMessage();
                        var2_9 = this.r;
                        var5_10 = -1L;
                        if (var2_9 < 200 || var2_9 > 299) break block19;
                        var13_11 = var12_3.getContentType();
                        var14_13 = this.l;
                        if (var14_13 == null || var14_13.apply(var13_11)) break block20;
                        this.u();
                        throw new t(var13_11, var1_1);
                    }
                    var3_15 = var7_2;
                    if (this.r == 200) {
                        var9_17 = var1_1.g;
                        var3_15 = var7_2;
                        if (var9_17 != 0L) {
                            var3_15 = var9_17;
                        }
                    }
                    if (!(var11_18 = ax.U0.n.w((HttpURLConnection)var12_3))) {
                        var7_2 = var1_1.h;
                        if (var7_2 != -1L) {
                            this.s = var7_2;
                        } else {
                            var7_2 = w.b(var12_3.getHeaderField("Content-Length"), var12_3.getHeaderField("Content-Range"));
                            if (var7_2 != -1L) {
                                var5_10 = var7_2 - var3_15;
                            }
                            this.s = var5_10;
                        }
                    } else {
                        this.s = var1_1.h;
                    }
                    try {
                        this.p = var12_3.getInputStream();
                        if (!var11_18) break block21;
                    }
                    catch (IOException var12_4) {
                        break block22;
                    }
                    this.p = var12_3 = new GZIPInputStream(this.p);
                }
                this.q = true;
                this.t(var1_1);
                try {
                    this.B(var3_15, var1_1);
                    return this.s;
                }
                catch (IOException var12_5) {
                    this.u();
                    if (var12_5 instanceof s) {
                        throw (s)var12_5;
                    }
                    throw new s(var12_5, var1_1, 2000, 1);
                }
            }
            this.u();
            throw new s(var12_4, var1_1, 2000, 1);
        }
        var14_14 = var12_3.getHeaderFields();
        if (this.r == 416 && var1_1.g == (var3_16 = w.c(var12_3.getHeaderField("Content-Range")))) {
            this.q = true;
            this.t(var1_1);
            var3_16 = var1_1.h;
            if (var3_16 != -1L) {
                return var3_16;
            }
            return 0L;
        }
        if ((var12_3 = var12_3.getErrorStream()) == null) ** GOTO lbl72
        try {
            var12_3 = ax.s7.b.g((InputStream)var12_3);
lbl72:
            // 1 sources

            var12_3 = d0.f;
        }
        catch (IOException var12_6) {
            var12_3 = d0.f;
        }
        this.u();
        var13_12 = this.r == 416 ? new h(2008) : null;
        throw new u(this.r, var15_8, var13_12, var14_14, var1_1, (byte[])var12_3);
        catch (IOException var12_7) {
            this.u();
            throw ax.U0.s.c(var12_7, var1_1, 1);
        }
    }

    @Override
    public Map<String, List<String>> l() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return A.k();
        }
        return new c(httpURLConnection.getHeaderFields());
    }

    HttpURLConnection z(URL uRL) throws IOException {
        return (HttpURLConnection)uRL.openConnection();
    }

    public static final class b
    implements g.a {
        private final v a = new v();
        private z b;
        private ax.q7.o<String> c;
        private String d;
        private int e = 8000;
        private int f = 8000;
        private boolean g;
        private boolean h;
        private boolean i;

        public n b() {
            n n8 = new n(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i);
            z z8 = this.b;
            if (z8 != null) {
                n8.d(z8);
            }
            return n8;
        }

        public b c(String string) {
            this.d = string;
            return this;
        }
    }

    private static class c
    extends ax.r7.t<String, List<String>> {
        private final Map<String, List<String>> q;

        public c(Map<String, List<String>> map) {
            this.q = map;
        }

        public static /* synthetic */ boolean n(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean p(String string) {
            return string != null;
        }

        @Override
        public boolean containsKey(Object object) {
            return object != null && super.containsKey(object);
        }

        @Override
        public boolean containsValue(Object object) {
            return super.i(object);
        }

        @Override
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return ax.r7.d0.b(super.entrySet(), new o());
        }

        @Override
        public boolean equals(Object object) {
            return object != null && super.k(object);
        }

        @Override
        protected Map<String, List<String>> g() {
            return this.q;
        }

        @Override
        public int hashCode() {
            return super.l();
        }

        @Override
        public boolean isEmpty() {
            return super.isEmpty() || super.size() == 1 && super.containsKey(null);
            {
            }
        }

        @Override
        public Set<String> keySet() {
            return ax.r7.d0.b(super.keySet(), new p());
        }

        public List<String> q(Object object) {
            if (object == null) {
                return null;
            }
            return (List)super.get(object);
        }

        @Override
        public int size() {
            return super.size() - super.containsKey(null);
        }
    }
}


package ax.U3;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements ax.M3.h {
    private final h b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public g(URL url) {
        this(url, h.b);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(ax.M3.h.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                str = this.c.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.e;
    }

    private URL g() throws MalformedURLException {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        return str != null ? str : this.c.toString();
    }

    public Map<String, String> e() {
        return this.b.a();
    }

    @Override // ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (c().equals(gVar.c()) && this.b.equals(gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public URL h() throws MalformedURLException {
        return g();
    }

    @Override // ax.M3.h
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.b);
    }

    public g(URL url, h hVar) {
        this.c = (URL) ax.k4.h.d(url);
        this.d = null;
        this.b = (h) ax.k4.h.d(hVar);
    }

    public g(String str, h hVar) {
        this.c = null;
        this.d = ax.k4.h.b(str);
        this.b = (h) ax.k4.h.d(hVar);
    }
}

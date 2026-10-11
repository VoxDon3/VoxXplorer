/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.net.Uri;
import android.text.TextUtils;
import ax.U3.h;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class g
implements ax.M3.h {
    private final h b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public g(String string) {
        this(string, ax.U3.h.b);
    }

    public g(String string, h h8) {
        this.c = null;
        this.d = ax.k4.h.b(string);
        this.b = ax.k4.h.d(h8);
    }

    public g(URL uRL) {
        this(uRL, ax.U3.h.b);
    }

    public g(URL uRL, h h8) {
        this.c = ax.k4.h.d(uRL);
        this.d = null;
        this.b = ax.k4.h.d(h8);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = this.c().getBytes(ax.M3.h.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty((CharSequence)this.e)) {
            String string;
            String string2 = string = this.d;
            if (TextUtils.isEmpty((CharSequence)string)) {
                string2 = this.c.toString();
            }
            this.e = Uri.encode((String)string2, (String)"@#&=*+-_.,:!?()/~'%");
        }
        return this.e;
    }

    private URL g() throws MalformedURLException {
        if (this.f == null) {
            this.f = new URL(this.f());
        }
        return this.f;
    }

    @Override
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.d());
    }

    public String c() {
        String string = this.d;
        if (string != null) {
            return string;
        }
        return this.c.toString();
    }

    public Map<String, String> e() {
        return this.b.a();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof g) {
            object = (g)object;
            if (this.c().equals(((g)object).c()) && this.b.equals(((g)object).b)) {
                return true;
            }
        }
        return false;
    }

    public URL h() throws MalformedURLException {
        return this.g();
    }

    @Override
    public int hashCode() {
        if (this.h == 0) {
            int n8;
            this.h = n8 = this.c().hashCode();
            this.h = n8 * 31 + this.b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return this.c();
    }
}


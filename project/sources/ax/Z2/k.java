package ax.Z2;

import android.net.Uri;
import ax.c3.C1809B;
import ax.c3.K;

/* loaded from: classes.dex */
public class k {
    K a;
    String b;

    public k(K k, String str) {
        this.a = k;
        this.b = str;
    }

    public static k a(Uri uri) {
        ax.Q2.f p = ax.Q2.f.p(uri.getScheme());
        if (p == null) {
            throw new IllegalArgumentException("Not valid uri : " + uri);
        }
        try {
            return new k(K.a(p, Integer.parseInt(uri.getHost())), uri.getPath());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Not valid uri : " + uri);
        }
    }

    public static boolean f(Uri uri) {
        if (ax.Q2.f.p(uri.getScheme()) == null) {
            return false;
        }
        try {
            Integer.parseInt(uri.getHost());
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean g(Uri uri, ax.Q2.f fVar) {
        return h(uri.getScheme(), fVar);
    }

    public static boolean h(String str, ax.Q2.f fVar) {
        return fVar.I().equals(str);
    }

    public ax.Q2.f b() {
        return this.a.d();
    }

    public int c() {
        return this.a.b();
    }

    public K d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String toString() {
        return C1809B.U(this.a, this.b);
    }
}

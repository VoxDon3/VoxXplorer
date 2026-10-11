package ax.Ha;

import java.util.HashSet;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class b {
    static Set<String> k = new HashSet();
    String a = "DEBUG";
    String b = "UNNAMED";
    Object c = HttpUrl.FRAGMENT_ENCODE_SET;
    Object d = null;
    Throwable e = null;
    int f = 0;
    boolean g = false;
    boolean h = true;
    boolean i = false;
    boolean j = true;

    public b(a aVar) {
        k();
    }

    public b a(String str) {
        this.c = str;
        return this;
    }

    public b b(String str) {
        try {
            return e(str).m("CRITICAL");
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    public b c(String str) {
        try {
            return e(str).m("DEBUG");
        } catch (Exception unused) {
            return this;
        }
    }

    public b d(String str) {
        try {
            return e(str).m("ERROR");
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    public b e(String str) {
        this.b = str;
        return this;
    }

    public b f() {
        this.g = true;
        return this;
    }

    public b g(Object obj) {
        this.d = obj;
        return this;
    }

    public void i(boolean z) {
        this.j = z;
    }

    public b j() {
        this.e = new Throwable("STACKTRACE");
        this.f = 1;
        return this;
    }

    public b l(Throwable th) {
        this.e = th;
        this.f = 0;
        return this;
    }

    public b m(String str) {
        this.a = str;
        return this;
    }

    public b n(String str) {
        try {
            return e(str).m("WARNING");
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }

    private b k() {
        return this;
    }

    public void h() {
    }
}

package ax.W5;

import android.net.Uri;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class K {
    final Uri a;
    final String b;
    final String c;
    final boolean d;
    final boolean e;

    private K(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, T t) {
        this.a = uri;
        this.b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.d = z;
        this.e = z3;
    }

    public final K a() {
        return new K(null, this.a, this.b, this.c, this.d, false, true, false, null);
    }

    public final K b() {
        if (this.b.isEmpty()) {
            return new K(null, this.a, this.b, this.c, true, false, this.e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final O c(String str, double d) {
        return new I(this, str, Double.valueOf(0.0d), true);
    }

    public final O d(String str, long j) {
        return new G(this, str, Long.valueOf(j), true);
    }

    public final O e(String str, boolean z) {
        return new H(this, str, Boolean.valueOf(z), true);
    }

    public final O f(String str, Object obj, m2 m2Var) {
        return new J(this, "getTokenRefactor__blocked_packages", obj, true, m2Var);
    }

    public K(Uri uri) {
        this(null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null);
    }
}

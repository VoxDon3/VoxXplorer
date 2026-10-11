package ax.J5;

import android.util.Log;

/* loaded from: classes3.dex */
class O {
    private static final O e = new O(true, 3, 1, null, null);
    final boolean a;
    final String b;
    final Throwable c;
    final int d;

    private O(boolean z, int i, int i2, String str, Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    @Deprecated
    static O b() {
        return e;
    }

    static O c(String str) {
        return new O(false, 1, 5, str, null);
    }

    static O d(String str, Throwable th) {
        return new O(false, 1, 5, str, th);
    }

    static O f(int i) {
        return new O(true, i, 1, null, null);
    }

    static O g(int i, int i2, String str, Throwable th) {
        return new O(false, i, i2, str, th);
    }

    String a() {
        return this.b;
    }

    final void e() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}

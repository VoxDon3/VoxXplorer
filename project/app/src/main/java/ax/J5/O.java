/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.util.Log;
import ax.J5.N;

class O {
    private static final O e = new O(true, 3, 1, null, null);
    final boolean a;
    final String b;
    final Throwable c;
    final int d;

    private O(boolean bl, int n8, int n9, String string, Throwable throwable) {
        this.a = bl;
        this.d = n8;
        this.b = string;
        this.c = throwable;
    }

    /* synthetic */ O(boolean bl, int n8, int n9, String string, Throwable throwable, N n10) {
        this(false, 1, 5, null, null);
    }

    @Deprecated
    static O b() {
        return e;
    }

    static O c(String string) {
        return new O(false, 1, 5, string, null);
    }

    static O d(String string, Throwable throwable) {
        return new O(false, 1, 5, string, throwable);
    }

    static O f(int n8) {
        return new O(true, n8, 1, null, null);
    }

    static O g(int n8, int n9, String string, Throwable throwable) {
        return new O(false, n8, n9, string, throwable);
    }

    String a() {
        return this.b;
    }

    final void e() {
        if (!this.a && Log.isLoggable((String)"GoogleCertificatesRslt", (int)3)) {
            if (this.c != null) {
                Log.d((String)"GoogleCertificatesRslt", (String)this.a(), (Throwable)this.c);
                return;
            }
            Log.d((String)"GoogleCertificatesRslt", (String)this.a());
        }
    }
}


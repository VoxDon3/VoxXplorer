/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import android.util.Log;

public class g {
    static final g c = new g("FirebaseCrashlytics");
    private final String a;
    private int b;

    public g(String string) {
        this.a = string;
        this.b = 4;
    }

    private boolean a(int n8) {
        return this.b <= n8 || Log.isLoggable((String)this.a, (int)n8);
        {
        }
    }

    public static g f() {
        return c;
    }

    public void b(String string) {
        this.c(string, null);
    }

    public void c(String string, Throwable throwable) {
        if (this.a(3)) {
            Log.d((String)this.a, (String)string, (Throwable)throwable);
        }
    }

    public void d(String string) {
        this.e(string, null);
    }

    public void e(String string, Throwable throwable) {
        if (this.a(6)) {
            Log.e((String)this.a, (String)string, (Throwable)throwable);
        }
    }

    public void g(String string) {
        this.h(string, null);
    }

    public void h(String string, Throwable throwable) {
        if (this.a(4)) {
            Log.i((String)this.a, (String)string, (Throwable)throwable);
        }
    }

    public void i(String string) {
        this.j(string, null);
    }

    public void j(String string, Throwable throwable) {
        if (this.a(2)) {
            Log.v((String)this.a, (String)string, (Throwable)throwable);
        }
    }

    public void k(String string) {
        this.l(string, null);
    }

    public void l(String string, Throwable throwable) {
        if (this.a(5)) {
            Log.w((String)this.a, (String)string, (Throwable)throwable);
        }
    }
}


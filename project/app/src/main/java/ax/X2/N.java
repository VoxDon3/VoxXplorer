/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;
import ax.X2.Q;

public abstract class N {
    private String a;
    private String b;
    private String c;
    private Boolean d;
    private Boolean e;
    private String f;
    private Integer g;
    private String h;

    public final String a(Context context) {
        return this.b(context);
    }

    protected abstract String b(Context var1);

    public final String c(StorageManager storageManager) {
        if (this.h == null) {
            this.h = this.d(storageManager);
        }
        return this.h;
    }

    protected abstract String d(StorageManager var1);

    public final int e(StorageManager storageManager) {
        if (this.g == null) {
            this.g = this.f(storageManager);
        }
        return this.g;
    }

    protected abstract int f(StorageManager var1);

    public final String g() {
        if (this.f == null) {
            this.f = this.h();
        }
        return this.f;
    }

    protected abstract String h();

    public final String i() {
        if (this.c == null) {
            this.c = this.j();
        }
        return this.c;
    }

    protected abstract String j();

    public String k() {
        String string = this.g();
        if (Q.T1()) {
            if (string != null && !string.startsWith("/storage") && !string.startsWith("/mnt/media_rw")) {
                Q.l(33);
                return null;
            }
        } else if (string != null && !string.startsWith("/storage")) {
            return null;
        }
        return string;
    }

    public final String l() {
        if (this.a == null) {
            this.a = this.m();
        }
        return this.a;
    }

    protected abstract String m();

    public final String n() {
        if (this.b == null) {
            this.b = this.o();
        }
        return this.b;
    }

    protected abstract String o();

    public final boolean p() {
        if (this.e == null) {
            this.e = this.q();
        }
        return this.e;
    }

    protected abstract boolean q();

    public final boolean r() {
        if (this.d == null) {
            this.d = this.s();
        }
        return this.d;
    }

    protected abstract boolean s();
}


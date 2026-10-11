package ax.X2;

import android.content.Context;
import android.os.storage.StorageManager;

/* loaded from: classes.dex */
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
        return b(context);
    }

    protected abstract String b(Context context);

    public final String c(StorageManager storageManager) {
        if (this.h == null) {
            this.h = d(storageManager);
        }
        return this.h;
    }

    protected abstract String d(StorageManager storageManager);

    public final int e(StorageManager storageManager) {
        if (this.g == null) {
            this.g = Integer.valueOf(f(storageManager));
        }
        return this.g.intValue();
    }

    protected abstract int f(StorageManager storageManager);

    public final String g() {
        if (this.f == null) {
            this.f = h();
        }
        return this.f;
    }

    protected abstract String h();

    public final String i() {
        if (this.c == null) {
            this.c = j();
        }
        return this.c;
    }

    protected abstract String j();

    public String k() {
        String g = g();
        if (Q.T1()) {
            if (g != null && !g.startsWith("/storage") && !g.startsWith("/mnt/media_rw")) {
                Q.l(33);
                return null;
            }
        } else if (g != null && !g.startsWith("/storage")) {
            return null;
        }
        return g;
    }

    public final String l() {
        if (this.a == null) {
            this.a = m();
        }
        return this.a;
    }

    protected abstract String m();

    public final String n() {
        if (this.b == null) {
            this.b = o();
        }
        return this.b;
    }

    protected abstract String o();

    public final boolean p() {
        if (this.e == null) {
            this.e = Boolean.valueOf(q());
        }
        return this.e.booleanValue();
    }

    protected abstract boolean q();

    public final boolean r() {
        if (this.d == null) {
            this.d = Boolean.valueOf(s());
        }
        return this.d.booleanValue();
    }

    protected abstract boolean s();
}

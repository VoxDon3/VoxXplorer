/*
 * Decompiled with CFR 0.152.
 */
package ax.E5;

import android.os.Bundle;
import ax.E5.f;
import ax.K5.a;
import ax.M5.n;

@Deprecated
public final class g
implements a.d {
    public static final g e0 = new g(new f());
    private final boolean c0;
    private final String d0;
    private final String q;

    public g(f f8) {
        this.q = null;
        this.c0 = f8.a;
        this.d0 = f8.b;
    }

    static /* bridge */ /* synthetic */ String b(g object) {
        object = ((g)object).q;
        return null;
    }

    static /* bridge */ /* synthetic */ String c(g g8) {
        return g8.d0;
    }

    static /* bridge */ /* synthetic */ boolean d(g g8) {
        return g8.c0;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.c0);
        bundle.putString("log_session_id", this.d0);
        return bundle;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        String string = ((g)object).q;
        return n.b(null, null) && this.c0 == ((g)object).c0 && n.b(this.d0, ((g)object).d0);
    }

    public final int hashCode() {
        return n.c(null, this.c0, this.d0);
    }
}


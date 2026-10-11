/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import ax.K5.a;
import ax.M5.n;
import ax.M5.y;
import ax.M5.z;

public class w
implements a.d {
    public static final w c0 = w.a().a();
    private final String q;

    /* synthetic */ w(String string, z z8) {
        this.q = string;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String string = this.q;
        if (string != null) {
            bundle.putString("api", string);
        }
        return bundle;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof w)) {
            return false;
        }
        object = (w)object;
        return n.b(this.q, ((w)object).q);
    }

    public final int hashCode() {
        return n.c(this.q);
    }

    public static class a {
        private String a;

        /* synthetic */ a(y y8) {
        }

        public w a() {
            return new w(this.a, null);
        }
    }
}


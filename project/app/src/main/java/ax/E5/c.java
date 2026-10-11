/*
 * Decompiled with CFR 0.152.
 */
package ax.E5;

import android.os.Bundle;
import ax.E5.i;
import ax.K5.a;
import ax.M5.n;

public final class c
implements a.d {
    public static final c c0 = new c(new Bundle(), null);
    private final Bundle q;

    /* synthetic */ c(Bundle bundle, i i8) {
        this.q = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.q);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return n.a(this.q, ((c)object).q);
    }

    public final int hashCode() {
        return n.c(this.q);
    }
}


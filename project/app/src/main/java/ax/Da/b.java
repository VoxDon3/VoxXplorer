/*
 * Decompiled with CFR 0.152.
 */
package ax.Da;

import ax.Da.c;
import java.io.Serializable;

public final class b
implements Serializable {
    public final String c0;
    public final c q;

    public b(c c8, String string) {
        this.q = c8;
        this.c0 = string;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!b.class.equals(object.getClass())) {
            return false;
        }
        object = (b)object;
        return ((Object)((Object)this.q)).equals((Object)((b)object).q) && this.c0.equals(((b)object).c0);
    }

    public int hashCode() {
        return (527 + ((Object)((Object)this.q)).hashCode()) * 31 + this.c0.hashCode();
    }

    public String toString() {
        return String.format("SkuId(type=%s id=%s)", new Object[]{this.q, this.c0});
    }
}


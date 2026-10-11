/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.view.Surface;
import ax.S0.a;

public final class M {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public M(Surface surface, int n8, int n9) {
        this(surface, n8, n9, 0);
    }

    public M(Surface surface, int n8, int n9, int n10) {
        this(surface, n8, n9, n10, false);
    }

    public M(Surface surface, int n8, int n9, int n10, boolean bl) {
        boolean bl2 = n10 == 0 || n10 == 90 || n10 == 180 || n10 == 270;
        ax.S0.a.b(bl2, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof M)) {
            return false;
        }
        object = (M)object;
        return this.b == ((M)object).b && this.c == ((M)object).c && this.d == ((M)object).d && this.e == ((M)object).e && this.a.equals(((M)object).a);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }
}


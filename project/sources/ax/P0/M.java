package ax.P0;

import android.view.Surface;
import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class M {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public M(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return this.b == m.b && this.c == m.c && this.d == m.d && this.e == m.e && this.a.equals(m.a);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }

    public M(Surface surface, int i, int i2, int i3) {
        this(surface, i, i2, i3, false);
    }

    public M(Surface surface, int i, int i2, int i3, boolean z) {
        C0968a.b(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }
}

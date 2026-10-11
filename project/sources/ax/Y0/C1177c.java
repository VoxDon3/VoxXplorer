package ax.Y0;

import ax.P0.C0912v;
import ax.S0.C0968a;

/* renamed from: ax.Y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177c {
    public final String a;
    public final C0912v b;
    public final C0912v c;
    public final int d;
    public final int e;

    public C1177c(String str, C0912v c0912v, C0912v c0912v2, int i, int i2) {
        C0968a.a(i == 0 || i2 == 0);
        this.a = C0968a.d(str);
        this.b = (C0912v) C0968a.e(c0912v);
        this.c = (C0912v) C0968a.e(c0912v2);
        this.d = i;
        this.e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1177c.class == obj.getClass()) {
            C1177c c1177c = (C1177c) obj;
            if (this.d == c1177c.d && this.e == c1177c.e && this.a.equals(c1177c.a) && this.b.equals(c1177c.b) && this.c.equals(c1177c.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.d) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}

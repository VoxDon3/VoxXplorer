/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import ax.P0.v;
import ax.S0.a;

public final class c {
    public final String a;
    public final v b;
    public final v c;
    public final int d;
    public final int e;

    public c(String string, v v8, v v9, int n8, int n9) {
        boolean bl = n8 == 0 || n9 == 0;
        ax.S0.a.a(bl);
        this.a = ax.S0.a.d(string);
        this.b = ax.S0.a.e(v8);
        this.c = ax.S0.a.e(v9);
        this.d = n8;
        this.e = n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.d == ((c)object).d && this.e == ((c)object).e && this.a.equals(((c)object).a) && this.b.equals(((c)object).b) && this.c.equals(((c)object).c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.d) * 31 + this.e) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.S0.d0;

public final class a0 {
    public static final a0 e = new a0(0, 0);
    private static final String f = d0.G0(0);
    private static final String g = d0.G0(1);
    private static final String h = d0.G0(3);
    public final int a;
    public final int b;
    @Deprecated
    public final int c;
    public final float d;

    public a0(int n8, int n9) {
        this(n8, n9, 1.0f);
    }

    public a0(int n8, int n9, float f8) {
        this.a = n8;
        this.b = n9;
        this.c = 0;
        this.d = f8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof a0) {
            object = (a0)object;
            if (this.a == ((a0)object).a && this.b == ((a0)object).b && this.d == ((a0)object).d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.a) * 31 + this.b) * 31 + Float.floatToRawIntBits(this.d);
    }
}


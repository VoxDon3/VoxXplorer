package ax.P0;

import ax.S0.d0;

/* loaded from: classes.dex */
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

    public a0(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.a == a0Var.a && this.b == a0Var.b && this.d == a0Var.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.a) * 31) + this.b) * 31) + Float.floatToRawIntBits(this.d);
    }

    public a0(int i, int i2, float f2) {
        this.a = i;
        this.b = i2;
        this.c = 0;
        this.d = f2;
    }
}

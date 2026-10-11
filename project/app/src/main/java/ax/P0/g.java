/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

public final class g {
    public final int a;
    public final float b;

    public g(int n8, float f8) {
        this.a = n8;
        this.b = f8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && g.class == object.getClass()) {
            object = (g)object;
            if (this.a == ((g)object).a && Float.compare(((g)object).b, this.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (527 + this.a) * 31 + Float.floatToIntBits(this.b);
    }
}


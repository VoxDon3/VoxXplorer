/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

public final class W {
    public static final W c = new W(0, false);
    public final int a;
    public final boolean b;

    public W(int n8, boolean bl) {
        this.a = n8;
        this.b = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && W.class == object.getClass()) {
            object = (W)object;
            if (this.a == ((W)object).a && this.b == ((W)object).b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a << 1) + this.b;
    }
}


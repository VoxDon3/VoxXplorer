package ax.P0;

/* renamed from: ax.P0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898g {
    public final int a;
    public final float b;

    public C0898g(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0898g.class == obj.getClass()) {
            C0898g c0898g = (C0898g) obj;
            if (this.a == c0898g.a && Float.compare(c0898g.b, this.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}

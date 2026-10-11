package ax.Y0;

/* loaded from: classes.dex */
public final class W {
    public static final W c = new W(0, false);
    public final int a;
    public final boolean b;

    public W(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W.class == obj.getClass()) {
            W w = (W) obj;
            if (this.a == w.a && this.b == w.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}

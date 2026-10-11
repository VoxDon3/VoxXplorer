package ax.S0;

/* loaded from: classes.dex */
public final class I {
    public static final I c = new I(-1, -1);
    public static final I d = new I(0, 0);
    private final int a;
    private final int b;

    public I(int i, int i2) {
        C0968a.a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            I i = (I) obj;
            if (this.a == i.a && this.b == i.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}

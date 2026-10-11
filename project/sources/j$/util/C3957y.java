package j$.util;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3957y {
    public static final C3957y c = new C3957y();
    public final boolean a;
    public final double b;

    public C3957y() {
        this.a = false;
        this.b = Double.NaN;
    }

    public C3957y(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3957y)) {
            return false;
        }
        C3957y c3957y = (C3957y) obj;
        boolean z = this.a;
        return (z && c3957y.a) ? Double.compare(this.b, c3957y.b) == 0 : z == c3957y.a;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalDouble[" + this.b + "]";
        }
        return "OptionalDouble.empty";
    }
}

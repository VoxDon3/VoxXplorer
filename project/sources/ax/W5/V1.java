package ax.W5;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class V1 extends W1 {
    V1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // ax.W5.W1
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // ax.W5.W1
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // ax.W5.W1
    public final void c(Object obj, long j, boolean z) {
        if (X1.g) {
            X1.i(obj, j, z);
        } else {
            X1.j(obj, j, z);
        }
    }

    @Override // ax.W5.W1
    public final void d(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // ax.W5.W1
    public final void e(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // ax.W5.W1
    public final boolean f(Object obj, long j) {
        return X1.g ? X1.q(obj, j) : X1.r(obj, j);
    }
}

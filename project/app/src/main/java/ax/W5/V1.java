/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.W1;
import ax.W5.X1;
import sun.misc.Unsafe;

final class V1
extends W1 {
    V1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override
    public final double a(Object object, long l8) {
        return Double.longBitsToDouble(this.a.getLong(object, l8));
    }

    @Override
    public final float b(Object object, long l8) {
        return Float.intBitsToFloat(this.a.getInt(object, l8));
    }

    @Override
    public final void c(Object object, long l8, boolean bl) {
        if (X1.g) {
            X1.i(object, l8, bl);
            return;
        }
        X1.j(object, l8, bl);
    }

    @Override
    public final void d(Object object, long l8, double d8) {
        long l9 = Double.doubleToLongBits(d8);
        this.a.putLong(object, l8, l9);
    }

    @Override
    public final void e(Object object, long l8, float f8) {
        int n8 = Float.floatToIntBits(f8);
        this.a.putInt(object, l8, n8);
    }

    @Override
    public final boolean f(Object object, long l8) {
        if (X1.g) {
            return X1.q(object, l8);
        }
        return X1.r(object, l8);
    }
}


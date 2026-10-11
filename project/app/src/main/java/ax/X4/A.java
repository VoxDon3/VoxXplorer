/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.e;
import ax.X4.j;

final class A
extends e {
    @Override
    long c() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override
    long d() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override
    long i() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override
    long k(CharSequence charSequence, int n8, int n9, boolean bl, long l8, int n10, boolean bl2, int n11) {
        float f8;
        float f9 = f8 = j.a(bl, l8, n10, bl2, n11);
        if (Float.isNaN(f8)) {
            f9 = Float.parseFloat(charSequence.subSequence(n8, n9).toString());
        }
        return Float.floatToRawIntBits(f9);
    }

    @Override
    long l(CharSequence charSequence, int n8, int n9, boolean bl, long l8, int n10, boolean bl2, int n11) {
        float f8;
        float f9 = f8 = j.b(bl, l8, n10, bl2, n11);
        if (Float.isNaN(f8)) {
            f9 = Float.parseFloat(charSequence.subSequence(n8, n9).toString());
        }
        return Float.floatToRawIntBits(f9);
    }
}


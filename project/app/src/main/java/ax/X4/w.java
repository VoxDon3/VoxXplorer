/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.e;
import ax.X4.h;

final class w
extends e {
    @Override
    long c() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override
    long d() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override
    long i() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override
    long k(CharSequence charSequence, int n8, int n9, boolean bl, long l8, int n10, boolean bl2, int n11) {
        double d8;
        double d9 = d8 = h.a(bl, l8, n10, bl2, n11);
        if (Double.isNaN(d8)) {
            d9 = Double.parseDouble(charSequence.subSequence(n8, n9).toString());
        }
        return Double.doubleToRawLongBits(d9);
    }

    @Override
    long l(CharSequence charSequence, int n8, int n9, boolean bl, long l8, int n10, boolean bl2, int n11) {
        double d8;
        double d9 = d8 = h.c(bl, l8, n10, bl2, n11);
        if (Double.isNaN(d8)) {
            d9 = Double.parseDouble(charSequence.subSequence(n8, n9).toString());
        }
        return Double.doubleToRawLongBits(d9);
    }
}


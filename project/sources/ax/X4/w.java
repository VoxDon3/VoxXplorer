package ax.X4;

/* loaded from: classes.dex */
final class w extends e {
    @Override // ax.X4.e
    long c() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // ax.X4.e
    long d() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // ax.X4.e
    long i() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // ax.X4.e
    long k(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double a = h.a(z, j, i3, z2, i4);
        if (Double.isNaN(a)) {
            a = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(a);
    }

    @Override // ax.X4.e
    long l(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        double c = h.c(z, j, i3, z2, i4);
        if (Double.isNaN(c)) {
            c = Double.parseDouble(charSequence.subSequence(i, i2).toString());
        }
        return Double.doubleToRawLongBits(c);
    }
}

package ax.X4;

/* loaded from: classes.dex */
final class A extends e {
    @Override // ax.X4.e
    long c() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // ax.X4.e
    long d() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // ax.X4.e
    long i() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // ax.X4.e
    long k(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float a = j.a(z, j, i3, z2, i4);
        if (Float.isNaN(a)) {
            a = Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return Float.floatToRawIntBits(a);
    }

    @Override // ax.X4.e
    long l(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4) {
        float b = j.b(z, j, i3, z2, i4);
        if (Float.isNaN(b)) {
            b = Float.parseFloat(charSequence.subSequence(i, i2).toString());
        }
        return Float.floatToRawIntBits(b);
    }
}

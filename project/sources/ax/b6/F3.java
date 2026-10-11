package ax.b6;

/* loaded from: classes3.dex */
final class F3 extends K3 {
    private final int f0;
    private final int g0;

    F3(byte[] bArr, int i, int i2) {
        super(bArr);
        B3.i(i, i + i2, bArr.length);
        this.f0 = i;
        this.g0 = i2;
    }

    @Override // ax.b6.K3, ax.b6.B3
    public final byte e(int i) {
        int s = s();
        if (((s - (i + 1)) | i) >= 0) {
            return this.e0[this.f0 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + s);
    }

    @Override // ax.b6.K3, ax.b6.B3
    final byte r(int i) {
        return this.e0[this.f0 + i];
    }

    @Override // ax.b6.K3, ax.b6.B3
    public final int s() {
        return this.g0;
    }

    @Override // ax.b6.K3
    protected final int x() {
        return this.f0;
    }
}

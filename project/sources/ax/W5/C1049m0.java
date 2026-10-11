package ax.W5;

/* renamed from: ax.W5.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1049m0 extends C1061q0 {
    private final int g0;

    C1049m0(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC1069t0.p(0, i2, bArr.length);
        this.g0 = i2;
    }

    @Override // ax.W5.C1061q0, ax.W5.AbstractC1069t0
    public final byte e(int i) {
        int i2 = this.g0;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f0[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // ax.W5.C1061q0, ax.W5.AbstractC1069t0
    final byte g(int i) {
        return this.f0[i];
    }

    @Override // ax.W5.C1061q0, ax.W5.AbstractC1069t0
    public final int h() {
        return this.g0;
    }

    @Override // ax.W5.C1061q0
    protected final int t() {
        return 0;
    }
}

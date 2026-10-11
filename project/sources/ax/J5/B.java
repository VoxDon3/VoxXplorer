package ax.J5;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class B extends A {
    private final byte[] f;

    B(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f = bArr;
    }

    @Override // ax.J5.A
    final byte[] a2() {
        return this.f;
    }
}

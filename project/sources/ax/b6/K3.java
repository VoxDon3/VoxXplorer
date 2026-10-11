package ax.b6;

import java.io.IOException;

/* loaded from: classes3.dex */
class K3 extends I3 {
    protected final byte[] e0;

    K3(byte[] bArr) {
        super();
        bArr.getClass();
        this.e0 = bArr;
    }

    @Override // ax.b6.B3
    public byte e(int i) {
        return this.e0[i];
    }

    @Override // ax.b6.B3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B3) || s() != ((B3) obj).s()) {
            return false;
        }
        if (s() == 0) {
            return true;
        }
        if (!(obj instanceof K3)) {
            return obj.equals(this);
        }
        K3 k3 = (K3) obj;
        int g = g();
        int g2 = k3.g();
        if (g == 0 || g2 == 0 || g == g2) {
            return w(k3, 0, s());
        }
        return false;
    }

    @Override // ax.b6.B3
    public final B3 k(int i, int i2) {
        int i3 = B3.i(0, i2, s());
        return i3 == 0 ? B3.c0 : new F3(this.e0, x(), i3);
    }

    @Override // ax.b6.B3
    final void q(AbstractC1702x3 abstractC1702x3) throws IOException {
        abstractC1702x3.a(this.e0, x(), s());
    }

    @Override // ax.b6.B3
    byte r(int i) {
        return this.e0[i];
    }

    @Override // ax.b6.B3
    public int s() {
        return this.e0.length;
    }

    @Override // ax.b6.B3
    protected final int t(int i, int i2, int i3) {
        return C1616m4.a(i, this.e0, x(), i3);
    }

    @Override // ax.b6.I3
    final boolean w(B3 b3, int i, int i2) {
        if (i2 > b3.s()) {
            throw new IllegalArgumentException("Length too large: " + i2 + s());
        }
        if (i2 > b3.s()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + b3.s());
        }
        if (!(b3 instanceof K3)) {
            return b3.k(0, i2).equals(k(0, i2));
        }
        K3 k3 = (K3) b3;
        byte[] bArr = this.e0;
        byte[] bArr2 = k3.e0;
        int x = x() + i2;
        int x2 = x();
        int x3 = k3.x();
        while (x2 < x) {
            if (bArr[x2] != bArr2[x3]) {
                return false;
            }
            x2++;
            x3++;
        }
        return true;
    }

    protected int x() {
        return 0;
    }
}

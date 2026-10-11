package ax.W5;

import java.nio.charset.Charset;

/* renamed from: ax.W5.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1061q0 extends AbstractC1058p0 {
    protected final byte[] f0;

    C1061q0(byte[] bArr) {
        bArr.getClass();
        this.f0 = bArr;
    }

    @Override // ax.W5.AbstractC1069t0
    public byte e(int i) {
        return this.f0[i];
    }

    @Override // ax.W5.AbstractC1069t0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1069t0) || h() != ((AbstractC1069t0) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof C1061q0)) {
            return obj.equals(this);
        }
        C1061q0 c1061q0 = (C1061q0) obj;
        int q = q();
        int q2 = c1061q0.q();
        if (q != 0 && q2 != 0 && q != q2) {
            return false;
        }
        int h = h();
        if (h > c1061q0.h()) {
            throw new IllegalArgumentException("Length too large: " + h + h());
        }
        if (h > c1061q0.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + h + ", " + c1061q0.h());
        }
        byte[] bArr = this.f0;
        byte[] bArr2 = c1061q0.f0;
        c1061q0.t();
        int i = 0;
        int i2 = 0;
        while (i < h) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // ax.W5.AbstractC1069t0
    byte g(int i) {
        return this.f0[i];
    }

    @Override // ax.W5.AbstractC1069t0
    public int h() {
        return this.f0.length;
    }

    @Override // ax.W5.AbstractC1069t0
    protected final int i(int i, int i2, int i3) {
        return O0.b(i, this.f0, 0, i3);
    }

    @Override // ax.W5.AbstractC1069t0
    public final AbstractC1069t0 k(int i, int i2) {
        int p = AbstractC1069t0.p(0, i2, h());
        return p == 0 ? AbstractC1069t0.c0 : new C1049m0(this.f0, 0, p);
    }

    @Override // ax.W5.AbstractC1069t0
    protected final String l(Charset charset) {
        return new String(this.f0, 0, h(), charset);
    }

    @Override // ax.W5.AbstractC1069t0
    public final boolean n() {
        return b2.c(this.f0, 0, h());
    }

    protected int t() {
        return 0;
    }
}

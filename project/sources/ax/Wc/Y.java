package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class Y extends AbstractC1132w {
    private final int e0;
    private final AbstractC1132w[] f0;

    public Y(byte[] bArr) {
        this(bArr, 1000);
    }

    static byte[] I(AbstractC1132w[] abstractC1132wArr) {
        int length = abstractC1132wArr.length;
        if (length == 0) {
            return AbstractC1132w.d0;
        }
        if (length == 1) {
            return abstractC1132wArr[0].q;
        }
        int i = 0;
        for (AbstractC1132w abstractC1132w : abstractC1132wArr) {
            i += abstractC1132w.q.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (AbstractC1132w abstractC1132w2 : abstractC1132wArr) {
            byte[] bArr2 = abstractC1132w2.q;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        if (!t()) {
            byte[] bArr = this.q;
            C1127t0.I(c1136y, z, bArr, 0, bArr.length);
            return;
        }
        c1136y.s(z, 36);
        c1136y.i(128);
        AbstractC1132w[] abstractC1132wArr = this.f0;
        if (abstractC1132wArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.q;
                if (i >= bArr2.length) {
                    break;
                }
                int min = Math.min(bArr2.length - i, this.e0);
                C1127t0.I(c1136y, true, this.q, i, min);
                i += min;
            }
        } else {
            c1136y.v(abstractC1132wArr);
        }
        c1136y.i(0);
        c1136y.i(0);
    }

    @Override // ax.Wc.A
    boolean t() {
        return this.f0 != null || this.q.length > this.e0;
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        if (!t()) {
            return C1127t0.J(z, this.q.length);
        }
        int i = z ? 4 : 3;
        if (this.f0 == null) {
            int length = this.q.length;
            int i2 = this.e0;
            int i3 = length / i2;
            int J = i + (C1127t0.J(true, i2) * i3);
            int length2 = this.q.length - (i3 * this.e0);
            return length2 > 0 ? J + C1127t0.J(true, length2) : J;
        }
        int i4 = 0;
        while (true) {
            AbstractC1132w[] abstractC1132wArr = this.f0;
            if (i4 >= abstractC1132wArr.length) {
                return i;
            }
            i += abstractC1132wArr[i4].w(true);
            i4++;
        }
    }

    public Y(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    private Y(byte[] bArr, AbstractC1132w[] abstractC1132wArr, int i) {
        super(bArr);
        this.f0 = abstractC1132wArr;
        this.e0 = i;
    }

    public Y(AbstractC1132w[] abstractC1132wArr) {
        this(abstractC1132wArr, 1000);
    }

    public Y(AbstractC1132w[] abstractC1132wArr, int i) {
        this(I(abstractC1132wArr), abstractC1132wArr, i);
    }
}

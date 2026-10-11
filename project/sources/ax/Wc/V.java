package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public class V extends AbstractC1093c {
    private final int e0;
    private final AbstractC1093c[] f0;

    public V(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    static byte[] K(AbstractC1093c[] abstractC1093cArr) {
        int length = abstractC1093cArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC1093cArr[0].q;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = abstractC1093cArr[i3].q;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC1093cArr[i].q;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (AbstractC1093c abstractC1093c : abstractC1093cArr) {
            byte[] bArr4 = abstractC1093c.q;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        C1136y c1136y2;
        if (!t()) {
            byte[] bArr = this.q;
            H0.M(c1136y, z, bArr, 0, bArr.length);
            return;
        }
        c1136y.s(z, 35);
        c1136y.i(128);
        AbstractC1093c[] abstractC1093cArr = this.f0;
        if (abstractC1093cArr != null) {
            c1136y.v(abstractC1093cArr);
        } else {
            byte[] bArr2 = this.q;
            if (bArr2.length >= 2) {
                byte b = bArr2[0];
                int length = bArr2.length;
                int i = length - 1;
                int i2 = this.e0 - 1;
                while (i > i2) {
                    C1136y c1136y3 = c1136y;
                    H0.K(c1136y3, true, (byte) 0, this.q, length - i, i2);
                    i -= i2;
                    c1136y = c1136y3;
                }
                c1136y2 = c1136y;
                H0.K(c1136y2, true, b, this.q, length - i, i);
                c1136y2.i(0);
                c1136y2.i(0);
            }
        }
        c1136y2 = c1136y;
        c1136y2.i(0);
        c1136y2.i(0);
    }

    @Override // ax.Wc.A
    boolean t() {
        return this.f0 != null || this.q.length > this.e0;
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        if (!t()) {
            return H0.N(z, this.q.length);
        }
        int i = z ? 4 : 3;
        if (this.f0 == null) {
            byte[] bArr = this.q;
            if (bArr.length < 2) {
                return i;
            }
            int length = bArr.length - 2;
            int i2 = this.e0;
            int i3 = length / (i2 - 1);
            return i + (H0.N(true, i2) * i3) + H0.N(true, this.q.length - (i3 * (this.e0 - 1)));
        }
        int i4 = 0;
        while (true) {
            AbstractC1093c[] abstractC1093cArr = this.f0;
            if (i4 >= abstractC1093cArr.length) {
                return i;
            }
            i += abstractC1093cArr[i4].w(true);
            i4++;
        }
    }

    public V(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.f0 = null;
        this.e0 = i2;
    }

    public V(AbstractC1093c[] abstractC1093cArr) {
        this(abstractC1093cArr, 1000);
    }

    public V(AbstractC1093c[] abstractC1093cArr, int i) {
        super(K(abstractC1093cArr), false);
        this.f0 = abstractC1093cArr;
        this.e0 = i;
    }
}

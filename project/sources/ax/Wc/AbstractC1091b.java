package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1091b extends A implements G {
    static final O c0 = new a(AbstractC1091b.class, 30);
    final char[] q;

    /* renamed from: ax.Wc.b$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return AbstractC1091b.C(c1127t0.G());
        }
    }

    AbstractC1091b(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.q = cArr;
    }

    static AbstractC1091b C(byte[] bArr) {
        return new C1108j0(bArr);
    }

    static AbstractC1091b D(char[] cArr) {
        return new C1108j0(cArr);
    }

    @Override // ax.Wc.G
    public final String h() {
        return new String(this.q);
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public final int hashCode() {
        return ax.Nd.a.n(this.q);
    }

    @Override // ax.Wc.A
    final boolean r(A a2) {
        if (a2 instanceof AbstractC1091b) {
            return ax.Nd.a.c(this.q, ((AbstractC1091b) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        int length = this.q.length;
        c1136y.s(z, 30);
        c1136y.k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.q;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c1136y.j(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.q[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c1136y.j(bArr, 0, i3);
        }
    }

    @Override // ax.Wc.A
    final boolean t() {
        return false;
    }

    public String toString() {
        return h();
    }

    @Override // ax.Wc.A
    final int w(boolean z) {
        return C1136y.g(z, this.q.length * 2);
    }

    AbstractC1091b(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.q = cArr;
    }
}

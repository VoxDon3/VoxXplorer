package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class N extends A implements G {
    static final O c0 = new a(N.class, 28);
    private static final char[] d0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] q;

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return N.C(c1127t0.G());
        }
    }

    N(byte[] bArr, boolean z) {
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
    }

    static N C(byte[] bArr) {
        return new D0(bArr, false);
    }

    private static void D(StringBuffer stringBuffer, int i) {
        char[] cArr = d0;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    private static void E(StringBuffer stringBuffer, int i) {
        int i2;
        if (i < 128) {
            D(stringBuffer, i);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 5;
        while (true) {
            i2 = i3 - 1;
            bArr[i2] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                break;
            } else {
                i3 = i2;
            }
        }
        int i4 = i3 - 2;
        bArr[i4] = (byte) ((5 - i2) | 128);
        while (true) {
            int i5 = i4 + 1;
            D(stringBuffer, bArr[i4]);
            if (i5 >= 5) {
                return;
            } else {
                i4 = i5;
            }
        }
    }

    @Override // ax.Wc.G
    public final String h() {
        int length = this.q.length;
        StringBuffer stringBuffer = new StringBuffer(((C1136y.f(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        E(stringBuffer, length);
        for (int i = 0; i < length; i++) {
            D(stringBuffer, this.q[i]);
        }
        return stringBuffer.toString();
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public final int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    final boolean r(A a2) {
        if (a2 instanceof N) {
            return ax.Nd.a.b(this.q, ((N) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    final void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 28, this.q);
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
        return C1136y.g(z, this.q.length);
    }
}

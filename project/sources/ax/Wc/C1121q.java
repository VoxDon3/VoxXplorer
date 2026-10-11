package ax.Wc;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: ax.Wc.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1121q extends A {
    static final O d0 = new a(C1121q.class, 2);
    private final int c0;
    private final byte[] q;

    /* renamed from: ax.Wc.q$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return C1121q.C(c1127t0.G());
        }
    }

    public C1121q(long j) {
        this.q = BigInteger.valueOf(j).toByteArray();
        this.c0 = 0;
    }

    static C1121q C(byte[] bArr) {
        return new C1121q(bArr, false);
    }

    public static C1121q D(J j, boolean z) {
        return (C1121q) d0.e(j, z);
    }

    public static C1121q E(Object obj) {
        if (obj == null || (obj instanceof C1121q)) {
            return (C1121q) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C1121q) d0.b((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    static int J(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
    }

    static boolean M(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || ax.Nd.i.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static int N(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public BigInteger G() {
        return new BigInteger(this.q);
    }

    public boolean I(int i) {
        byte[] bArr = this.q;
        int length = bArr.length;
        int i2 = this.c0;
        return length - i2 <= 4 && J(bArr, i2, -1) == i;
    }

    public int K() {
        byte[] bArr = this.q;
        int length = bArr.length;
        int i = this.c0;
        if (length - i <= 4) {
            return J(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof C1121q) {
            return ax.Nd.a.b(this.q, ((C1121q) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 2, this.q);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    public String toString() {
        return G().toString();
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    public C1121q(BigInteger bigInteger) {
        this.q = bigInteger.toByteArray();
        this.c0 = 0;
    }

    C1121q(byte[] bArr, boolean z) {
        if (M(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
        this.c0 = N(bArr);
    }
}

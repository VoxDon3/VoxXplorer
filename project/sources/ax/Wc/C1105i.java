package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1105i extends A {
    static final O d0 = new a(C1105i.class, 10);
    private static final C1105i[] e0 = new C1105i[12];
    private final int c0;
    private final byte[] q;

    /* renamed from: ax.Wc.i$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return C1105i.C(c1127t0.G(), false);
        }
    }

    C1105i(byte[] bArr, boolean z) {
        if (C1121q.M(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.q = z ? ax.Nd.a.d(bArr) : bArr;
        this.c0 = C1121q.N(bArr);
    }

    static C1105i C(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new C1105i(bArr, z);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        C1105i[] c1105iArr = e0;
        if (i >= c1105iArr.length) {
            return new C1105i(bArr, z);
        }
        C1105i c1105i = c1105iArr[i];
        if (c1105i != null) {
            return c1105i;
        }
        C1105i c1105i2 = new C1105i(bArr, z);
        c1105iArr[i] = c1105i2;
        return c1105i2;
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return ax.Nd.a.l(this.q);
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 instanceof C1105i) {
            return ax.Nd.a.b(this.q, ((C1105i) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 10, this.q);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }
}

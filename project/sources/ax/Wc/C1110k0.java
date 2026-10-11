package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1110k0 extends AbstractC1093c {
    public C1110k0(int i) {
        super(AbstractC1093c.E(i), AbstractC1093c.J(i));
    }

    public static C1110k0 K(AbstractC1093c abstractC1093c) {
        return (C1110k0) abstractC1093c.A();
    }

    static C1110k0 M(AbstractC1132w abstractC1132w) {
        return new C1110k0(abstractC1132w.G(), true);
    }

    public static C1110k0 N(J j, boolean z) {
        A J = j.J();
        return (z || (J instanceof C1110k0)) ? O(J) : M(AbstractC1132w.E(J));
    }

    public static C1110k0 O(Object obj) {
        if (obj == null || (obj instanceof C1110k0)) {
            return (C1110k0) obj;
        }
        if (obj instanceof AbstractC1093c) {
            return K((AbstractC1093c) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return K((AbstractC1093c) A.z((byte[]) obj));
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        byte[] bArr = this.q;
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b = bArr[length];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            c1136y.o(z, 3, bArr);
        } else {
            c1136y.q(z, 3, bArr, 0, length, b2);
        }
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, this.q.length);
    }

    public C1110k0(byte[] bArr) {
        this(bArr, 0);
    }

    public C1110k0(byte[] bArr, int i) {
        super(bArr, i);
    }

    C1110k0(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    @Override // ax.Wc.AbstractC1093c, ax.Wc.A
    A A() {
        return this;
    }

    @Override // ax.Wc.AbstractC1093c, ax.Wc.A
    A B() {
        return this;
    }
}

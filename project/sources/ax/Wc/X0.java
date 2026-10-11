package ax.Wc;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes3.dex */
class X0 extends D {
    private byte[] d0;

    X0(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.d0 = bArr;
    }

    private synchronized void Q() {
        if (this.d0 != null) {
            C1119p c1119p = new C1119p(this.d0, true);
            try {
                C1103h q = c1119p.q();
                c1119p.close();
                this.q = q.g();
                this.d0 = null;
            } catch (IOException e) {
                throw new C1138z("malformed ASN.1: " + e, e);
            }
        }
    }

    private synchronized byte[] R() {
        return this.d0;
    }

    @Override // ax.Wc.D, ax.Wc.A
    A A() {
        Q();
        return super.A();
    }

    @Override // ax.Wc.D, ax.Wc.A
    A B() {
        Q();
        return super.B();
    }

    @Override // ax.Wc.D
    public InterfaceC1101g I(int i) {
        Q();
        return super.I(i);
    }

    @Override // ax.Wc.D
    public Enumeration J() {
        byte[] R = R();
        return R != null ? new W0(R) : super.J();
    }

    @Override // ax.Wc.D
    AbstractC1093c K() {
        return ((D) B()).K();
    }

    @Override // ax.Wc.D
    AbstractC1109k M() {
        return ((D) B()).M();
    }

    @Override // ax.Wc.D
    AbstractC1132w N() {
        return ((D) B()).N();
    }

    @Override // ax.Wc.D
    E O() {
        return ((D) B()).O();
    }

    @Override // ax.Wc.D, ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        Q();
        return super.hashCode();
    }

    @Override // ax.Wc.D, java.lang.Iterable
    public Iterator<InterfaceC1101g> iterator() {
        Q();
        return super.iterator();
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        byte[] R = R();
        if (R != null) {
            c1136y.o(z, 48, R);
        } else {
            super.B().s(c1136y, z);
        }
    }

    @Override // ax.Wc.D
    public int size() {
        Q();
        return super.size();
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        byte[] R = R();
        return R != null ? C1136y.g(z, R.length) : super.B().w(z);
    }
}

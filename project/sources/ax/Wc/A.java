package ax.Wc;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class A extends AbstractC1126t {
    A() {
    }

    public static A z(byte[] bArr) throws IOException {
        C1119p c1119p = new C1119p(bArr);
        try {
            A m = c1119p.m();
            if (c1119p.available() == 0) {
                return m;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // ax.Wc.AbstractC1126t
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1101g) && r(((InterfaceC1101g) obj).g());
    }

    @Override // ax.Wc.AbstractC1126t
    public abstract int hashCode();

    @Override // ax.Wc.AbstractC1126t
    public void n(OutputStream outputStream, String str) throws IOException {
        C1136y b = C1136y.b(outputStream, str);
        b.u(this, true);
        b.c();
    }

    abstract boolean r(A a);

    abstract void s(C1136y c1136y, boolean z) throws IOException;

    abstract boolean t();

    public void u(OutputStream outputStream) throws IOException {
        C1136y a = C1136y.a(outputStream);
        a.u(this, true);
        a.c();
    }

    abstract int w(boolean z) throws IOException;

    public final boolean x(InterfaceC1101g interfaceC1101g) {
        if (this != interfaceC1101g) {
            return interfaceC1101g != null && r(interfaceC1101g.g());
        }
        return true;
    }

    public final boolean y(A a) {
        return this == a || r(a);
    }

    A A() {
        return this;
    }

    A B() {
        return this;
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public final A g() {
        return this;
    }
}

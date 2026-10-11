package ax.Wc;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class J extends A implements InterfaceC1101g, U0 {
    final int c0;
    final int d0;
    final InterfaceC1101g e0;
    final int q;

    J(int i, int i2, int i3, InterfaceC1101g interfaceC1101g) {
        if (interfaceC1101g == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException("invalid tag class: " + i2);
        }
        this.q = interfaceC1101g instanceof InterfaceC1099f ? 1 : i;
        this.c0 = i2;
        this.d0 = i3;
        this.e0 = interfaceC1101g;
    }

    static A C(int i, int i2, C1103h c1103h) {
        Q0 q0 = c1103h.f() == 1 ? new Q0(3, i, i2, c1103h.d(0)) : new Q0(4, i, i2, K0.a(c1103h));
        return i != 64 ? q0 : new G0(q0);
    }

    static A D(int i, int i2, C1103h c1103h) {
        C1098e0 c1098e0 = c1103h.f() == 1 ? new C1098e0(3, i, i2, c1103h.d(0)) : new C1098e0(4, i, i2, X.a(c1103h));
        return i != 64 ? c1098e0 : new T(c1098e0);
    }

    static A E(int i, int i2, byte[] bArr) {
        Q0 q0 = new Q0(4, i, i2, new C1127t0(bArr));
        return i != 64 ? q0 : new G0(q0);
    }

    @Override // ax.Wc.A
    A A() {
        return new A0(this.q, this.c0, this.d0, this.e0);
    }

    @Override // ax.Wc.A
    A B() {
        return new Q0(this.q, this.c0, this.d0, this.e0);
    }

    A G(boolean z, O o) {
        if (z) {
            if (N()) {
                return o.a(this.e0.g());
            }
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        if (1 == this.q) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        A g = this.e0.g();
        int i = this.q;
        return i != 3 ? i != 4 ? o.a(g) : g instanceof D ? o.c((D) g) : o.d((C1127t0) g) : o.c(O(g));
    }

    public AbstractC1126t I() {
        if (!N()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        InterfaceC1101g interfaceC1101g = this.e0;
        return interfaceC1101g instanceof AbstractC1126t ? (AbstractC1126t) interfaceC1101g : interfaceC1101g.g();
    }

    public A J() {
        if (128 == K()) {
            return this.e0.g();
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public int K() {
        return this.c0;
    }

    public int M() {
        return this.d0;
    }

    public boolean N() {
        int i = this.q;
        return i == 1 || i == 3;
    }

    abstract D O(A a);

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return (((this.c0 * 7919) ^ this.d0) ^ (N() ? 15 : 240)) ^ this.e0.g().hashCode();
    }

    @Override // ax.Wc.A
    boolean r(A a) {
        if (a instanceof AbstractC1089a) {
            return a.y(this);
        }
        if (!(a instanceof J)) {
            return false;
        }
        J j = (J) a;
        if (this.d0 != j.d0 || this.c0 != j.c0) {
            return false;
        }
        if (this.q != j.q && N() != j.N()) {
            return false;
        }
        A g = this.e0.g();
        A g2 = j.e0.g();
        if (g == g2) {
            return true;
        }
        if (N()) {
            return g.r(g2);
        }
        try {
            return ax.Nd.a.b(p(), j.p());
        } catch (IOException unused) {
            return false;
        }
    }

    public String toString() {
        return P.a(this.c0, this.d0) + this.e0;
    }

    protected J(boolean z, int i, int i2, InterfaceC1101g interfaceC1101g) {
        this(z ? 1 : 2, i, i2, interfaceC1101g);
    }

    protected J(boolean z, int i, InterfaceC1101g interfaceC1101g) {
        this(z, 128, i, interfaceC1101g);
    }

    @Override // ax.Wc.U0
    public final A l() {
        return this;
    }
}

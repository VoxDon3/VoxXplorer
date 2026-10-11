package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1109k extends A {
    static final O g0 = new a(AbstractC1109k.class, 8);
    C1121q c0;
    A d0;
    int e0;
    A f0;
    C1130v q;

    /* renamed from: ax.Wc.k$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A c(D d) {
            return d.M();
        }
    }

    AbstractC1109k(C1130v c1130v, C1121q c1121q, A a2, int i, A a3) {
        this.q = c1130v;
        this.c0 = c1121q;
        this.d0 = a2;
        this.e0 = D(i);
        this.f0 = E(i, a3);
    }

    private static int D(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }

    private static A E(int i, A a2) {
        O o;
        if (i == 1) {
            o = AbstractC1132w.c0;
        } else {
            if (i != 2) {
                return a2;
            }
            o = AbstractC1093c.c0;
        }
        return o.a(a2);
    }

    private static A G(J j) {
        int K = j.K();
        int M = j.M();
        if (128 != K) {
            throw new IllegalArgumentException("invalid tag: " + P.a(K, M));
        }
        if (M == 0) {
            return j.I().g();
        }
        if (M == 1) {
            return AbstractC1132w.D(j, false);
        }
        if (M == 2) {
            return AbstractC1093c.G(j, false);
        }
        throw new IllegalArgumentException("invalid tag: " + P.a(K, M));
    }

    private static A I(D d, int i) {
        if (d.size() > i) {
            return d.I(i).g();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // ax.Wc.A
    A A() {
        return new C1112l0(this.q, this.c0, this.d0, this.e0, this.f0);
    }

    @Override // ax.Wc.A
    A B() {
        return new J0(this.q, this.c0, this.d0, this.e0, this.f0);
    }

    abstract D C();

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return (((ax.Nd.g.b(this.q) ^ ax.Nd.g.b(this.c0)) ^ ax.Nd.g.b(this.d0)) ^ this.e0) ^ this.f0.hashCode();
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (this == a2) {
            return true;
        }
        if (!(a2 instanceof AbstractC1109k)) {
            return false;
        }
        AbstractC1109k abstractC1109k = (AbstractC1109k) a2;
        return ax.Nd.g.a(this.q, abstractC1109k.q) && ax.Nd.g.a(this.c0, abstractC1109k.c0) && ax.Nd.g.a(this.d0, abstractC1109k.d0) && this.e0 == abstractC1109k.e0 && this.f0.y(abstractC1109k.f0);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.s(z, 40);
        C().s(c1136y, false);
    }

    @Override // ax.Wc.A
    boolean t() {
        return true;
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return C().w(z);
    }

    AbstractC1109k(D d) {
        int i = 0;
        A I = I(d, 0);
        if (I instanceof C1130v) {
            this.q = (C1130v) I;
            I = I(d, 1);
            i = 1;
        }
        if (I instanceof C1121q) {
            this.c0 = (C1121q) I;
            i++;
            I = I(d, i);
        }
        if (!(I instanceof J)) {
            this.d0 = I;
            i++;
            I = I(d, i);
        }
        if (d.size() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(I instanceof J)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        J j = (J) I;
        this.e0 = D(j.M());
        this.f0 = G(j);
    }
}

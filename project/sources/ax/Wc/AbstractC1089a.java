package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1089a extends A implements InterfaceC1101g, U0 {
    final J q;

    AbstractC1089a(J j) {
        C(j.K());
        this.q = j;
    }

    private static int C(int i) {
        if (64 == i) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.Wc.A
    A A() {
        return new C1106i0((J) this.q.A());
    }

    @Override // ax.Wc.A
    A B() {
        return new G0((J) this.q.B());
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.Wc.A
    boolean r(A a) {
        J j;
        if (a instanceof AbstractC1089a) {
            j = ((AbstractC1089a) a).q;
        } else {
            if (!(a instanceof J)) {
                return false;
            }
            j = (J) a;
        }
        return this.q.y(j);
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        this.q.s(c1136y, z);
    }

    @Override // ax.Wc.A
    boolean t() {
        return this.q.t();
    }

    @Override // ax.Wc.A
    int w(boolean z) throws IOException {
        return this.q.w(z);
    }

    @Override // ax.Wc.U0
    public final A l() {
        return this;
    }
}

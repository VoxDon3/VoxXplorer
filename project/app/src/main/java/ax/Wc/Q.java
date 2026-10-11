/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.E0;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class Q
extends A
implements G {
    static final O c0 = new O(Q.class, 21){

        @Override
        A d(t0 t02) {
            return Q.C(t02.G());
        }
    };
    final byte[] q;

    Q(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static Q C(byte[] byArray) {
        return new E0(byArray, false);
    }

    @Override
    public final String h() {
        return j.b(this.q);
    }

    @Override
    public final int hashCode() {
        return a.l(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof Q)) {
            return false;
        }
        a8 = (Q)a8;
        return a.b(this.q, ((Q)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 21, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    @Override
    final int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}


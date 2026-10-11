/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.p0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class n
extends A
implements G {
    static final O c0 = new O(n.class, 25){

        @Override
        A d(t0 t02) {
            return n.C(t02.G());
        }
    };
    final byte[] q;

    n(byte[] byArray, boolean bl) {
        if (byArray != null) {
            byte[] byArray2 = byArray;
            if (bl) {
                byArray2 = a.d(byArray);
            }
            this.q = byArray2;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    static n C(byte[] byArray) {
        return new p0(byArray, false);
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
        if (!(a8 instanceof n)) {
            return false;
        }
        a8 = (n)a8;
        return a.b(this.q, ((n)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 25, this.q);
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


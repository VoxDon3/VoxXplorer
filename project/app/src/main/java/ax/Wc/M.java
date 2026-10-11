/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.C0;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class M
extends A
implements G {
    static final O c0 = new O(M.class, 12){

        @Override
        A d(t0 t02) {
            return M.C(t02.G());
        }
    };
    final byte[] q;

    M(String string) {
        this(j.h(string), false);
    }

    M(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static M C(byte[] byArray) {
        return new C0(byArray, false);
    }

    @Override
    public final String h() {
        return j.c(this.q);
    }

    @Override
    public final int hashCode() {
        return a.l(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof M)) {
            return false;
        }
        a8 = (M)a8;
        return a.b(this.q, ((M)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 12, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    public String toString() {
        return this.h();
    }

    @Override
    final int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}


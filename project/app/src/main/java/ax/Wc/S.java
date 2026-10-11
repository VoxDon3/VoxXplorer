/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.F0;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class S
extends A
implements G {
    static final O c0 = new O(S.class, 26){

        @Override
        A d(t0 t02) {
            return S.C(t02.G());
        }
    };
    final byte[] q;

    S(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static S C(byte[] byArray) {
        return new F0(byArray, false);
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
        if (!(a8 instanceof S)) {
            return false;
        }
        a8 = (S)a8;
        return a.b(this.q, ((S)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 26, this.q);
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


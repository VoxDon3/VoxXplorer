/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.n0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class l
extends A
implements G {
    static final O c0 = new O(l.class, 27){

        @Override
        A d(t0 t02) {
            return l.C(t02.G());
        }
    };
    final byte[] q;

    l(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static l C(byte[] byArray) {
        return new n0(byArray, false);
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
        if (!(a8 instanceof l)) {
            return false;
        }
        a8 = (l)a8;
        return a.b(this.q, ((l)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 27, this.q);
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


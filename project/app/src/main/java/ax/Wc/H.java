/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import ax.Wc.z0;
import java.io.IOException;

public abstract class H
extends A
implements G {
    static final O c0 = new O(H.class, 20){

        @Override
        A d(t0 t02) {
            return H.C(t02.G());
        }
    };
    final byte[] q;

    H(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static H C(byte[] byArray) {
        return new z0(byArray, false);
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
        if (!(a8 instanceof H)) {
            return false;
        }
        a8 = (H)a8;
        return a.b(this.q, ((H)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 20, this.q);
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


/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.G0;
import ax.Wc.J;
import ax.Wc.U0;
import ax.Wc.g;
import ax.Wc.i0;
import ax.Wc.y;
import java.io.IOException;

public abstract class a
extends A
implements g,
U0 {
    final J q;

    a(J j8) {
        a.C(j8.K());
        this.q = j8;
    }

    private static int C(int n8) {
        if (64 == n8) {
            return n8;
        }
        throw new IllegalArgumentException();
    }

    @Override
    A A() {
        return new i0((J)this.q.A());
    }

    @Override
    A B() {
        return new G0((J)this.q.B());
    }

    @Override
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public final A l() {
        return this;
    }

    @Override
    boolean r(A a8) {
        block4: {
            block3: {
                block2: {
                    if (!(a8 instanceof a)) break block2;
                    a8 = ((a)a8).q;
                    break block3;
                }
                if (!(a8 instanceof J)) break block4;
                a8 = (J)a8;
            }
            return this.q.y(a8);
        }
        return false;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        this.q.s(y8, bl);
    }

    @Override
    boolean t() {
        return this.q.t();
    }

    @Override
    int w(boolean bl) throws IOException {
        return this.q.w(bl);
    }
}


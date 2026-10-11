/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.O;
import ax.Wc.n;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public final class u
extends A {
    static final O c0 = new O(u.class, 7){

        @Override
        A c(D d8) {
            return new u((n)n.c0.c(d8));
        }

        @Override
        A d(t0 t02) {
            return new u((n)n.c0.d(t02));
        }
    };
    private final n q;

    public u(n n8) {
        if (n8 != null) {
            this.q = n8;
            return;
        }
        throw new NullPointerException("'baseGraphicString' cannot be null");
    }

    static u C(byte[] byArray) {
        return new u(n.C(byArray));
    }

    @Override
    A A() {
        n n8 = (n)this.q.A();
        if (n8 == this.q) {
            return this;
        }
        return new u(n8);
    }

    @Override
    A B() {
        n n8 = (n)this.q.B();
        if (n8 == this.q) {
            return this;
        }
        return new u(n8);
    }

    @Override
    public int hashCode() {
        return ~this.q.hashCode();
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof u)) {
            return false;
        }
        a8 = (u)a8;
        return this.q.r(((u)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.s(bl, 7);
        this.q.s(y8, false);
    }

    @Override
    boolean t() {
        return false;
    }

    @Override
    int w(boolean bl) {
        return this.q.w(bl);
    }
}


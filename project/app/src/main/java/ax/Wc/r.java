/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.r0;
import ax.Wc.t0;

public abstract class r
extends A {
    static final O q = new O(r.class, 5){

        @Override
        A d(t0 t02) {
            return r.C(t02.G());
        }
    };

    r() {
    }

    static r C(byte[] byArray) {
        if (byArray.length == 0) {
            return r0.c0;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override
    public int hashCode() {
        return -1;
    }

    @Override
    boolean r(A a8) {
        return a8 instanceof r;
    }

    public String toString() {
        return "NULL";
    }
}


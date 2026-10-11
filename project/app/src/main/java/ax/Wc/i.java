/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.q;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public class i
extends A {
    static final O d0 = new O(i.class, 10){

        @Override
        A d(t0 t02) {
            return i.C(t02.G(), false);
        }
    };
    private static final i[] e0 = new i[12];
    private final int c0;
    private final byte[] q;

    i(byte[] byArray, boolean bl) {
        if (!ax.Wc.q.M(byArray)) {
            if ((byArray[0] & 0x80) == 0) {
                byte[] byArray2 = bl ? a.d(byArray) : byArray;
                this.q = byArray2;
                this.c0 = ax.Wc.q.N(byArray);
                return;
            }
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    static i C(byte[] byArray, boolean bl) {
        if (byArray.length > 1) {
            return new i(byArray, bl);
        }
        if (byArray.length != 0) {
            i i8;
            int n8 = byArray[0] & 0xFF;
            i[] iArray = e0;
            if (n8 >= iArray.length) {
                return new i(byArray, bl);
            }
            i i9 = i8 = iArray[n8];
            if (i8 == null) {
                iArray[n8] = i9 = new i(byArray, bl);
            }
            return i9;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override
    public int hashCode() {
        return a.l(this.q);
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof i)) {
            return false;
        }
        a8 = (i)a8;
        return a.b(this.q, ((i)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 10, this.q);
    }

    @Override
    boolean t() {
        return false;
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}


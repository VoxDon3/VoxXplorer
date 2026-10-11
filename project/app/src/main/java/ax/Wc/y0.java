/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.E;
import ax.Wc.g;
import ax.Wc.v0;
import ax.Wc.y;
import java.io.IOException;

public class y0
extends E {
    private int e0 = -1;

    public y0() {
    }

    public y0(g g8) {
        super(g8);
    }

    y0(boolean bl, g[] gArray) {
        super(y0.M(bl), gArray);
    }

    public y0(g[] gArray) {
        super(gArray, true);
    }

    private static boolean M(boolean bl) {
        if (bl) {
            return bl;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    private int N() throws IOException {
        if (this.e0 < 0) {
            int n8 = this.q.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += this.q[i8].g().A().w(true);
            }
            this.e0 = n9;
        }
        return this.e0;
    }

    @Override
    A A() {
        if (this.c0) {
            return this;
        }
        return super.A();
    }

    @Override
    A B() {
        return this;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        int n8;
        y8.s(bl, 49);
        v0 v02 = y8.d();
        int n9 = this.q.length;
        int n10 = this.e0;
        int n11 = 0;
        if (n10 < 0 && n9 <= 16) {
            A[] aArray = new A[n9];
            n8 = 0;
            for (n10 = 0; n10 < n9; ++n10) {
                A a8;
                aArray[n10] = a8 = this.q[n10].g().A();
                n8 += a8.w(true);
            }
            this.e0 = n8;
            y8.k(n8);
            for (n8 = n11; n8 < n9; ++n8) {
                aArray[n8].s(v02, true);
            }
        } else {
            y8.k(this.N());
            for (n8 = 0; n8 < n9; ++n8) {
                this.q[n8].g().A().s(v02, true);
            }
        }
    }

    @Override
    int w(boolean bl) throws IOException {
        return y.g(bl, this.N());
    }
}


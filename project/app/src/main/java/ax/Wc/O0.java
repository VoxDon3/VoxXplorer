/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.E;
import ax.Wc.L0;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.y;
import java.io.IOException;

public class O0
extends E {
    private int e0 = -1;

    public O0() {
    }

    public O0(h h8) {
        super(h8, false);
    }

    O0(boolean bl, g[] gArray) {
        super(bl, gArray);
    }

    private int M() throws IOException {
        if (this.e0 < 0) {
            int n8 = this.q.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += this.q[i8].g().B().w(true);
            }
            this.e0 = n9;
        }
        return this.e0;
    }

    @Override
    A B() {
        return this;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        int n8;
        y8.s(bl, 49);
        L0 l02 = y8.e();
        int n9 = this.q.length;
        int n10 = this.e0;
        int n11 = 0;
        if (n10 < 0 && n9 <= 16) {
            A[] aArray = new A[n9];
            n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                A a8;
                aArray[n8] = a8 = this.q[n8].g().B();
                n10 += a8.w(true);
            }
            this.e0 = n10;
            y8.k(n10);
            for (n8 = n11; n8 < n9; ++n8) {
                ((y)l02).u(aArray[n8], true);
            }
        } else {
            y8.k(this.M());
            for (n8 = 0; n8 < n9; ++n8) {
                ((y)l02).u(this.q[n8].g(), true);
            }
        }
    }

    @Override
    int w(boolean bl) throws IOException {
        return y.g(bl, this.M());
    }
}


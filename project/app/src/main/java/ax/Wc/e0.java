/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.a0;
import ax.Wc.g;
import ax.Wc.y;
import java.io.IOException;

public class e0
extends J {
    e0(int n8, int n9, int n10, g g8) {
        super(n8, n9, n10, g8);
    }

    @Override
    D O(A a8) {
        return new a0(a8);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        boolean bl2;
        A a8;
        block4: {
            int n8;
            block6: {
                int n9;
                block5: {
                    a8 = this.e0.g();
                    bl2 = this.N();
                    if (!bl) break block4;
                    n9 = this.c0;
                    if (bl2) break block5;
                    n8 = n9;
                    if (!a8.t()) break block6;
                }
                n8 = n9 | 0x20;
            }
            y8.t(true, n8, this.d0);
        }
        if (bl2) {
            y8.i(128);
            a8.s(y8, true);
            y8.i(0);
            y8.i(0);
            return;
        }
        a8.s(y8, false);
    }

    @Override
    boolean t() {
        return this.N() || this.e0.g().t();
        {
        }
    }

    @Override
    int w(boolean bl) throws IOException {
        int n8;
        A a8 = this.e0.g();
        boolean bl2 = this.N();
        int n9 = n8 = a8.w(bl2);
        if (bl2) {
            n9 = n8 + 3;
        }
        n8 = bl ? y.h(this.d0) : 0;
        return n9 + n8;
    }
}


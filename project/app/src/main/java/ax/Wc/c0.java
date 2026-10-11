/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.E;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.y;
import java.io.IOException;

public class c0
extends E {
    public c0() {
    }

    public c0(h h8) {
        super(h8, false);
    }

    c0(boolean bl, g[] gArray) {
        super(bl, gArray);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.r(bl, 49, this.q);
    }

    @Override
    int w(boolean bl) throws IOException {
        int n8 = bl ? 4 : 3;
        int n9 = this.q.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            n8 += this.q[i8].g().w(true);
        }
        return n8;
    }
}


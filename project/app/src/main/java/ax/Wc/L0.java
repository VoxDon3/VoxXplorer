/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.g;
import ax.Wc.y;
import java.io.IOException;
import java.io.OutputStream;

class L0
extends y {
    L0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    L0 e() {
        return this;
    }

    @Override
    void l(g[] gArray) throws IOException {
        int n8 = gArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            gArray[i8].g().B().s(this, true);
        }
    }

    @Override
    void u(A a8, boolean bl) throws IOException {
        a8.B().s(this, bl);
    }

    @Override
    void v(A[] aArray) throws IOException {
        int n8 = aArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            aArray[i8].B().s(this, true);
        }
    }
}


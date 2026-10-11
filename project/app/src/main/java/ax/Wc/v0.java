/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.L0;
import ax.Wc.g;
import java.io.IOException;
import java.io.OutputStream;

class v0
extends L0 {
    v0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    v0 d() {
        return this;
    }

    @Override
    void l(g[] gArray) throws IOException {
        int n8 = gArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            gArray[i8].g().A().s(this, true);
        }
    }

    @Override
    void u(A a8, boolean bl) throws IOException {
        a8.A().s(this, bl);
    }

    @Override
    void v(A[] aArray) throws IOException {
        int n8 = aArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            aArray[i8].A().s(this, true);
        }
    }
}


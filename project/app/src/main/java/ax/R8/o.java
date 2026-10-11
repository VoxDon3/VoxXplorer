/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.q;
import ax.Z8.a;
import ax.h9.b;

public class o
extends q {
    private byte[] e;

    @Override
    protected void j(b b8) throws a.b {
        b8.U(2);
        int n8 = b8.J();
        int n9 = b8.P();
        if (n8 > 0) {
            b8.T(n8);
            this.e = b8.G(n9);
        }
    }

    public byte[] n() {
        return this.e;
    }
}


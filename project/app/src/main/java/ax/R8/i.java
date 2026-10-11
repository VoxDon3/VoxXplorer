/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.q;
import ax.Z8.a;
import ax.h9.b;

public class i
extends q {
    private int e;
    private ax.Q8.i f;
    byte[] g;
    byte[] h;

    @Override
    protected void j(b b8) throws a.b {
        b8.U(2);
        b8.U(2);
        this.e = b8.P();
        this.f = ax.Q8.i.a(b8);
        int n8 = b8.P();
        int n9 = b8.P();
        int n10 = b8.P();
        int n11 = b8.P();
        b8.U(4);
        b8.U(4);
        if (n9 > 0) {
            b8.T(n8);
            this.g = b8.G(n9);
        }
        if (n11 > 0) {
            b8.T(n10);
            this.h = b8.G(n11);
        }
    }

    public byte[] n() {
        return this.h;
    }
}


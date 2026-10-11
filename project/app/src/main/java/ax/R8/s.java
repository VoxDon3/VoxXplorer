/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.q;
import ax.Z8.a;
import ax.h9.b;

public class s
extends q {
    private int e;
    private byte[] f;

    @Override
    protected void j(b b8) throws a.b {
        b8.U(2);
        byte by = b8.z();
        b8.U(1);
        this.e = b8.P();
        b8.P();
        b8.U(4);
        b8.T(by);
        this.f = b8.G(this.e);
    }

    public byte[] n() {
        return this.f;
    }

    public int o() {
        return this.e;
    }
}


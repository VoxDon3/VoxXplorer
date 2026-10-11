/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.oa.a;
import ax.oa.d;
import ax.pa.c;
import java.io.IOException;

public final class f
extends a {
    private byte[] i;

    public f() {
        this.p(d.e0);
    }

    @Override
    public void r(c c8) throws IOException {
        super.r(c8);
        this.t(new byte[this.d() - this.b() - 24]);
        c8.b(8);
        c8.e(this.s());
        c8.b(this.b());
    }

    public byte[] s() {
        return this.i;
    }

    public void t(byte[] byArray) {
        this.i = byArray;
    }
}


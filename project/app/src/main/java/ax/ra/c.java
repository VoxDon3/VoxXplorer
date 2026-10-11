/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.oa.a;
import ax.oa.d;
import ax.oa.e;
import ax.pa.f;
import java.io.IOException;

public final class c
extends a {
    private short i;
    private byte[] j;

    public c() {
        this.p(d.c0);
    }

    @Override
    public void a(ax.pa.d object) throws IOException {
        if (this.t() != null) {
            int n8 = this.i().contains(e.i0) ? 40 : 24;
            this.l((short)(n8 + this.j.length));
            super.a((ax.pa.d)object);
            byte[] byArray = this.t();
            ((f)object).c(byArray.length);
            ((f)object).e(0);
            ((f)object).e(this.s());
            ((f)object).a(byArray);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid stub: ");
        ((StringBuilder)object).append(this.t());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public short s() {
        return this.i;
    }

    public byte[] t() {
        return this.j;
    }

    public void u(short s8) {
        this.i = s8;
    }

    public void v(byte[] byArray) {
        this.j = byArray;
    }
}


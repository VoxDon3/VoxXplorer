/*
 * Decompiled with CFR 0.152.
 */
package ax.ra;

import ax.oa.d;
import ax.pa.c;
import java.io.IOException;

public final class b
extends ax.oa.a {
    private int i;
    private int j;

    @Override
    public void r(c object) throws IOException {
        super.r((c)object);
        int n8 = a.a[this.h().ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                ((c)object).b(this.d() - 16);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid PDU type: ");
            ((StringBuilder)object).append(this.h());
            throw new IOException(((StringBuilder)object).toString());
        }
        this.i = ((c)object).i();
        this.j = ((c)object).i();
        ((c)object).b(this.d() - 20);
    }

    public int s() {
        return this.j;
    }

    public int t() {
        return this.i;
    }

    public boolean u() {
        return d.o0.equals(this.h());
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.h4;

import ax.h4.a;
import ax.h4.d;
import ax.k4.i;

public abstract class c<Z>
extends a<Z> {
    private final int c0;
    private final int d0;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public c(int n8, int n9) {
        this.c0 = n8;
        this.d0 = n9;
    }

    @Override
    public void d(d d8) {
    }

    @Override
    public final void g(d object) {
        if (i.r(this.c0, this.d0)) {
            object.e(this.c0, this.d0);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        ((StringBuilder)object).append(this.c0);
        ((StringBuilder)object).append(" and height: ");
        ((StringBuilder)object).append(this.d0);
        ((StringBuilder)object).append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}


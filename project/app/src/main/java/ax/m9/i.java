/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.r;
import ax.h9.e;
import ax.m9.a;

public abstract class i
extends a {
    @Override
    public boolean b(e<?> e8) {
        return e8 instanceof r;
    }

    @Override
    protected void c(e<?> e8) throws ax.c9.e {
        this.e((r)e8);
    }

    protected abstract void e(r var1) throws ax.c9.e;
}


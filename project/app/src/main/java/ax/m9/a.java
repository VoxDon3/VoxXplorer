/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.h9.e;
import ax.m9.c;

public abstract class a
implements c {
    protected c a;

    @Override
    public void a(e<?> e8) throws ax.c9.e {
        if (this.b(e8)) {
            this.c(e8);
            return;
        }
        this.a.a(e8);
    }

    protected abstract boolean b(e<?> var1);

    protected abstract void c(e<?> var1) throws ax.c9.e;

    public c d(c c8) {
        this.a = c8;
        return this;
    }
}


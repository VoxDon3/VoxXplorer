/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.f;

public final class c
implements Runnable {
    public final Object c0;
    public final f q;

    public /* synthetic */ c(f f8, Object object) {
        this.q = f8;
        this.c0 = object;
    }

    @Override
    public final void run() {
        f.b(this.q, this.c0);
    }
}


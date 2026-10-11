/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.S0.l;
import ax.i1.N;

public final class M
implements Runnable {
    public final N c0;
    public final l q;

    public /* synthetic */ M(l l8, N n8) {
        this.q = l8;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        N.a.a(this.q, this.c0);
    }
}


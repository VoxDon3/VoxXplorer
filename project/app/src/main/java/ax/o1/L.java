/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class L
implements Runnable {
    public final long c0;
    public final int d0;
    public final P.a q;

    public /* synthetic */ L(P.a a8, long l8, int n8) {
        this.q = a8;
        this.c0 = l8;
        this.d0 = n8;
    }

    @Override
    public final void run() {
        P.a.g(this.q, this.c0, this.d0);
    }
}


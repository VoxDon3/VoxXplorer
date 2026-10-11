/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class K
implements Runnable {
    public final int c0;
    public final long d0;
    public final P.a q;

    public /* synthetic */ K(P.a a8, int n8, long l8) {
        this.q = a8;
        this.c0 = n8;
        this.d0 = l8;
    }

    @Override
    public final void run() {
        P.a.c(this.q, this.c0, this.d0);
    }
}


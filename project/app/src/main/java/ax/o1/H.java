/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class H
implements Runnable {
    public final Object c0;
    public final long d0;
    public final P.a q;

    public /* synthetic */ H(P.a a8, Object object, long l8) {
        this.q = a8;
        this.c0 = object;
        this.d0 = l8;
    }

    @Override
    public final void run() {
        P.a.j(this.q, this.c0, this.d0);
    }
}


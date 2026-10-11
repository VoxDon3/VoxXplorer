/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.P0.v;
import ax.Y0.c;
import ax.o1.P;

public final class N
implements Runnable {
    public final v c0;
    public final c d0;
    public final P.a q;

    public /* synthetic */ N(P.a a8, v v8, c c8) {
        this.q = a8;
        this.c0 = v8;
        this.d0 = c8;
    }

    @Override
    public final void run() {
        P.a.h(this.q, this.c0, this.d0);
    }
}


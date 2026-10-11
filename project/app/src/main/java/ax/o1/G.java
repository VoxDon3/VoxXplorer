/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.P0.a0;
import ax.o1.P;

public final class G
implements Runnable {
    public final a0 c0;
    public final P.a q;

    public /* synthetic */ G(P.a a8, a0 a02) {
        this.q = a8;
        this.c0 = a02;
    }

    @Override
    public final void run() {
        P.a.f(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.Y0.b;
import ax.o1.P;

public final class O
implements Runnable {
    public final b c0;
    public final P.a q;

    public /* synthetic */ O(P.a a8, b b8) {
        this.q = a8;
        this.c0 = b8;
    }

    @Override
    public final void run() {
        P.a.d(this.q, this.c0);
    }
}


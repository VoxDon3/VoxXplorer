/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.i1.Y;
import ax.q1.N;

public final class X
implements Runnable {
    public final N c0;
    public final Y q;

    public /* synthetic */ X(Y y8, N n8) {
        this.q = y8;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        Y.w(this.q, this.c0);
    }
}


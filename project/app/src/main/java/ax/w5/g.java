/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import ax.p5.p;
import ax.w5.r;

public final class g
implements Runnable {
    public final p c0;
    public final int d0;
    public final Runnable e0;
    public final r q;

    public /* synthetic */ g(r r8, p p8, int n8, Runnable runnable2) {
        this.q = r8;
        this.c0 = p8;
        this.d0 = n8;
        this.e0 = runnable2;
    }

    @Override
    public final void run() {
        r.i(this.q, this.c0, this.d0, this.e0);
    }
}


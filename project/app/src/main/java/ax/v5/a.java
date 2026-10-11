/*
 * Decompiled with CFR 0.152.
 */
package ax.v5;

import ax.n5.j;
import ax.p5.i;
import ax.p5.p;
import ax.v5.c;

public final class a
implements Runnable {
    public final p c0;
    public final j d0;
    public final i e0;
    public final c q;

    public /* synthetic */ a(c c8, p p8, j j8, i i8) {
        this.q = c8;
        this.c0 = p8;
        this.d0 = j8;
        this.e0 = i8;
    }

    @Override
    public final void run() {
        c.c(this.q, this.c0, this.d0, this.e0);
    }
}


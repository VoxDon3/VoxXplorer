/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.d;
import ax.ke.j;

public final class l
implements Runnable {
    public final d c0;
    public final Throwable d0;
    public final j.b.a q;

    public /* synthetic */ l(j.b.a a8, d d8, Throwable throwable) {
        this.q = a8;
        this.c0 = d8;
        this.d0 = throwable;
    }

    @Override
    public final void run() {
        j.b.a.c(this.q, this.c0, this.d0);
    }
}


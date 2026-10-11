/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.D;
import ax.ke.d;
import ax.ke.j;

public final class k
implements Runnable {
    public final d c0;
    public final D d0;
    public final j.b.a q;

    public /* synthetic */ k(j.b.a a8, d d8, D d9) {
        this.q = a8;
        this.c0 = d8;
        this.d0 = d9;
    }

    @Override
    public final void run() {
        j.b.a.d(this.q, this.c0, this.d0);
    }
}


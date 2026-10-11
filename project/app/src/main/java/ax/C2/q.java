/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.C2.r;
import ax.K2.m;

public final class q
implements Runnable {
    public final m c0;
    public final boolean d0;
    public final r q;

    public /* synthetic */ q(r r8, m m8, boolean bl) {
        this.q = r8;
        this.c0 = m8;
        this.d0 = bl;
    }

    @Override
    public final void run() {
        r.d(this.q, this.c0, this.d0);
    }
}


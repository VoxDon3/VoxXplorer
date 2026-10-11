/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.k2.C;

public final class B
implements Runnable {
    public final C c0;
    public final Runnable q;

    public /* synthetic */ B(Runnable runnable2, C c8) {
        this.q = runnable2;
        this.c0 = c8;
    }

    @Override
    public final void run() {
        C.a(this.q, this.c0);
    }
}


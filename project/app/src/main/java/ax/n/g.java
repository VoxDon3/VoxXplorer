/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import ax.n.f;

public final class g
implements Runnable {
    public final Runnable c0;
    public final f.c q;

    public /* synthetic */ g(f.c c8, Runnable runnable2) {
        this.q = c8;
        this.c0 = runnable2;
    }

    @Override
    public final void run() {
        f.c.a(this.q, this.c0);
    }
}


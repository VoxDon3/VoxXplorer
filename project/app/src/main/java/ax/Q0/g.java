/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.Q0.f;

public final class g
implements Runnable {
    public final int c0;
    public final f.c q;

    public /* synthetic */ g(f.c c8, int n8) {
        this.q = c8;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        f.c.a(this.q, this.c0);
    }
}


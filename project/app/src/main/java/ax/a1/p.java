/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class p
implements Runnable {
    public final int c0;
    public final z.a q;

    public /* synthetic */ p(z.a a8, int n8) {
        this.q = a8;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        z.a.j(this.q, this.c0);
    }
}


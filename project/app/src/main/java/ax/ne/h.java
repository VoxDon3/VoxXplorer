/*
 * Decompiled with CFR 0.152.
 */
package ax.ne;

import ax.ne.i;

public final class h
implements Runnable {
    public final int c0;
    public final int d0;
    public final i.b q;

    public /* synthetic */ h(i.b b8, int n8, int n9) {
        this.q = b8;
        this.c0 = n8;
        this.d0 = n9;
    }

    @Override
    public final void run() {
        i.e(this.q, this.c0, this.d0);
    }
}


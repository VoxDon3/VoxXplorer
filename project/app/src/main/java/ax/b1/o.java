/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import ax.b1.u;

public final class o
implements Runnable {
    public final u c0;
    public final int d0;
    public final u.a q;

    public /* synthetic */ o(u.a a8, u u8, int n8) {
        this.q = a8;
        this.c0 = u8;
        this.d0 = n8;
    }

    @Override
    public final void run() {
        u.a.c(this.q, this.c0, this.d0);
    }
}


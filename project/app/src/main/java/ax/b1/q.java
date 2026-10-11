/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import ax.b1.u;

public final class q
implements Runnable {
    public final u c0;
    public final Exception d0;
    public final u.a q;

    public /* synthetic */ q(u.a a8, u u8, Exception exception) {
        this.q = a8;
        this.c0 = u8;
        this.d0 = exception;
    }

    @Override
    public final void run() {
        u.a.e(this.q, this.c0, this.d0);
    }
}


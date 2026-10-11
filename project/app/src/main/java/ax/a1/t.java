/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class t
implements Runnable {
    public final Exception c0;
    public final z.a q;

    public /* synthetic */ t(z.a a8, Exception exception) {
        this.q = a8;
        this.c0 = exception;
    }

    @Override
    public final void run() {
        z.a.k(this.q, this.c0);
    }
}


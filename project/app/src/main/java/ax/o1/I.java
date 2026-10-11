/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class I
implements Runnable {
    public final Exception c0;
    public final P.a q;

    public /* synthetic */ I(P.a a8, Exception exception) {
        this.q = a8;
        this.c0 = exception;
    }

    @Override
    public final void run() {
        P.a.b(this.q, this.c0);
    }
}


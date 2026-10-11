/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class J
implements Runnable {
    public final String c0;
    public final P.a q;

    public /* synthetic */ J(P.a a8, String string) {
        this.q = a8;
        this.c0 = string;
    }

    @Override
    public final void run() {
        P.a.i(this.q, this.c0);
    }
}


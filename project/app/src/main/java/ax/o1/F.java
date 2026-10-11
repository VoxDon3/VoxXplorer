/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.o1.P;

public final class F
implements Runnable {
    public final String c0;
    public final long d0;
    public final long e0;
    public final P.a q;

    public /* synthetic */ F(P.a a8, String string, long l8, long l9) {
        this.q = a8;
        this.c0 = string;
        this.d0 = l8;
        this.e0 = l9;
    }

    @Override
    public final void run() {
        P.a.a(this.q, this.c0, this.d0, this.e0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.P0.a0;
import ax.o1.e;

public final class h
implements Runnable {
    public final a0 c0;
    public final e.b q;

    public /* synthetic */ h(e.b b8, a0 a02) {
        this.q = b8;
        this.c0 = a02;
    }

    @Override
    public final void run() {
        e.b.f(this.q, this.c0);
    }
}


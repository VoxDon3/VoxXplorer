/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import ax.P0.a0;
import ax.o1.S;
import ax.o1.s;

public final class v
implements Runnable {
    public final a0 c0;
    public final S.a q;

    public /* synthetic */ v(S.a a8, a0 a02) {
        this.q = a8;
        this.c0 = a02;
    }

    @Override
    public final void run() {
        s.d.B(this.q, this.c0);
    }
}


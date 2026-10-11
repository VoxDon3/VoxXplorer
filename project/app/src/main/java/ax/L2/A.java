/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import ax.L2.B;
import ax.M2.c;

public final class A
implements Runnable {
    public final c c0;
    public final B q;

    public /* synthetic */ A(B b8, c c8) {
        this.q = b8;
        this.c0 = c8;
    }

    @Override
    public final void run() {
        B.a(this.q, this.c0);
    }
}


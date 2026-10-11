/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import ax.L5.C;
import ax.i6.l;

final class A
implements Runnable {
    final C c0;
    final l q;

    A(C c8, l l8) {
        this.c0 = c8;
        this.q = l8;
    }

    @Override
    public final void run() {
        C.c2(this.c0, this.q);
    }
}


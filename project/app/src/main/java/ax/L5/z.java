/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import ax.J5.c;
import ax.L5.C;

final class z
implements Runnable {
    final C q;

    z(C c8) {
        this.q = c8;
    }

    @Override
    public final void run() {
        C.b2(this.q).a(new c(4));
    }
}


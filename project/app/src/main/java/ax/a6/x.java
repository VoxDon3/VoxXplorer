/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.C;
import ax.a6.F0;

public final class x
implements Runnable {
    public final C q;

    public /* synthetic */ x(C c8) {
        this.q = c8;
    }

    @Override
    public final void run() {
        F0 f02 = new F0(4, "Web view timed out.");
        this.q.k(f02);
    }
}


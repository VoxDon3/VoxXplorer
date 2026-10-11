/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.C2.G;
import ax.v7.e;

public final class F
implements Runnable {
    public final e c0;
    public final G q;

    public /* synthetic */ F(G g8, e e8) {
        this.q = g8;
        this.c0 = e8;
    }

    @Override
    public final void run() {
        G.a(this.q, this.c0);
    }
}


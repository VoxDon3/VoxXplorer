/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.B;
import ax.a1.z;

public final class y
implements Runnable {
    public final B.a c0;
    public final z.a q;

    public /* synthetic */ y(z.a a8, B.a a9) {
        this.q = a8;
        this.c0 = a9;
    }

    @Override
    public final void run() {
        z.a.f(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.N;
import ax.a6.d0;

public final class J
implements Runnable {
    public final String c0;
    public final N q;

    public /* synthetic */ J(N n8, String string) {
        this.q = n8;
        this.c0 = string;
    }

    @Override
    public final void run() {
        d0.a(this.q, this.c0);
    }
}


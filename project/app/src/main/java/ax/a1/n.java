/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class n
implements Runnable {
    public final boolean c0;
    public final z.a q;

    public /* synthetic */ n(z.a a8, boolean bl) {
        this.q = a8;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        z.a.a(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class w
implements Runnable {
    public final long c0;
    public final z.a q;

    public /* synthetic */ w(z.a a8, long l8) {
        this.q = a8;
        this.c0 = l8;
    }

    @Override
    public final void run() {
        z.a.e(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class x
implements Runnable {
    public final int c0;
    public final long d0;
    public final long e0;
    public final z.a q;

    public /* synthetic */ x(z.a a8, int n8, long l8, long l9) {
        this.q = a8;
        this.c0 = n8;
        this.d0 = l8;
        this.e0 = l9;
    }

    @Override
    public final void run() {
        z.a.b(this.q, this.c0, this.d0, this.e0);
    }
}


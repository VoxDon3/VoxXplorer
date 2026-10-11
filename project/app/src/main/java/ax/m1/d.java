/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import ax.m1.e;

public final class d
implements Runnable {
    public final int c0;
    public final long d0;
    public final long e0;
    public final e.a.a.a q;

    public /* synthetic */ d(e.a.a.a a8, int n8, long l8, long l9) {
        this.q = a8;
        this.c0 = n8;
        this.d0 = l8;
        this.e0 = l9;
    }

    @Override
    public final void run() {
        e.a.a.a(this.q, this.c0, this.d0, this.e0);
    }
}


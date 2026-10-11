/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.a1.z;

public final class r
implements Runnable {
    public final String c0;
    public final z.a q;

    public /* synthetic */ r(z.a a8, String string) {
        this.q = a8;
        this.c0 = string;
    }

    @Override
    public final void run() {
        z.a.m(this.q, this.c0);
    }
}


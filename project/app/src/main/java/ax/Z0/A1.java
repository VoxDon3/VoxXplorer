/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.NetworkEvent;
import ax.Z0.E1;

public final class A1
implements Runnable {
    public final NetworkEvent c0;
    public final E1 q;

    public /* synthetic */ A1(E1 e12, NetworkEvent networkEvent) {
        this.q = e12;
        this.c0 = networkEvent;
    }

    @Override
    public final void run() {
        E1.B0(this.q, this.c0);
    }
}


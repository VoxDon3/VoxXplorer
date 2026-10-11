/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.TrackChangeEvent;
import ax.Z0.E1;

public final class z1
implements Runnable {
    public final TrackChangeEvent c0;
    public final E1 q;

    public /* synthetic */ z1(E1 e12, TrackChangeEvent trackChangeEvent) {
        this.q = e12;
        this.c0 = trackChangeEvent;
    }

    @Override
    public final void run() {
        E1.C0(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.PlaybackErrorEvent;
import ax.Z0.E1;

public final class B1
implements Runnable {
    public final PlaybackErrorEvent c0;
    public final E1 q;

    public /* synthetic */ B1(E1 e12, PlaybackErrorEvent playbackErrorEvent) {
        this.q = e12;
        this.c0 = playbackErrorEvent;
    }

    @Override
    public final void run() {
        E1.z0(this.q, this.c0);
    }
}


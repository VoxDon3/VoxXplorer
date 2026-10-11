/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.PlaybackStateEvent;
import ax.Z0.E1;

public final class D1
implements Runnable {
    public final PlaybackStateEvent c0;
    public final E1 q;

    public /* synthetic */ D1(E1 e12, PlaybackStateEvent playbackStateEvent) {
        this.q = e12;
        this.c0 = playbackStateEvent;
    }

    @Override
    public final void run() {
        E1.D0(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.media.metrics.PlaybackMetrics;
import ax.Z0.E1;

public final class C1
implements Runnable {
    public final PlaybackMetrics c0;
    public final E1 q;

    public /* synthetic */ C1(E1 e12, PlaybackMetrics playbackMetrics) {
        this.q = e12;
        this.c0 = playbackMetrics;
    }

    @Override
    public final void run() {
        E1.A0(this.q, this.c0);
    }
}


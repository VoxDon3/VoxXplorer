/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import androidx.media3.ui.PlayerView;

public final class n
implements Runnable {
    public final PlayerView q;

    public /* synthetic */ n(PlayerView playerView) {
        this.q = playerView;
    }

    @Override
    public final void run() {
        this.q.invalidate();
    }
}


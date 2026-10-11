/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.graphics.Bitmap;
import androidx.media3.ui.PlayerView;

public final class l
implements Runnable {
    public final Bitmap c0;
    public final PlayerView q;

    public /* synthetic */ l(PlayerView playerView, Bitmap bitmap) {
        this.q = playerView;
        this.c0 = bitmap;
    }

    @Override
    public final void run() {
        PlayerView.a(this.q, this.c0);
    }
}


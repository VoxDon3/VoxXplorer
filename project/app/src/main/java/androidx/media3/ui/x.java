/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.view.SurfaceView;
import androidx.media3.ui.PlayerView;

public final class x
implements Runnable {
    public final SurfaceView c0;
    public final Runnable d0;
    public final PlayerView.f q;

    public /* synthetic */ x(PlayerView.f f8, SurfaceView surfaceView, Runnable runnable2) {
        this.q = f8;
        this.c0 = surfaceView;
        this.d0 = runnable2;
    }

    @Override
    public final void run() {
        PlayerView.f.a(this.q, this.c0, this.d0);
    }
}


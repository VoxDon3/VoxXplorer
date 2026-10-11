/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.graphics.SurfaceTexture;
import ax.p1.l;

public final class k
implements Runnable {
    public final SurfaceTexture c0;
    public final l q;

    public /* synthetic */ k(l l8, SurfaceTexture surfaceTexture) {
        this.q = l8;
        this.c0 = surfaceTexture;
    }

    @Override
    public final void run() {
        l.b(this.q, this.c0);
    }
}


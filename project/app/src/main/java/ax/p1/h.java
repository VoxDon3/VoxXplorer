/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.graphics.SurfaceTexture;
import ax.p1.i;

public final class h
implements SurfaceTexture.OnFrameAvailableListener {
    public final i q;

    public /* synthetic */ h(i i8) {
        this.q = i8;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        i.a(this.q, surfaceTexture);
    }
}


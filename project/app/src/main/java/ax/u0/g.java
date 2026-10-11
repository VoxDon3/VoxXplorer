/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import android.view.Choreographer;
import ax.u0.c;

public final class g
implements Choreographer.FrameCallback {
    public final Runnable q;

    public /* synthetic */ g(Runnable runnable2) {
        this.q = runnable2;
    }

    public final void doFrame(long l8) {
        c.f.c(this.q, l8);
    }
}


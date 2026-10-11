/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.e;
import androidx.media3.exoplayer.hls.l;

public final class i
implements Runnable {
    public final e c0;
    public final l q;

    public /* synthetic */ i(l l8, e e8) {
        this.q = l8;
        this.c0 = e8;
    }

    @Override
    public final void run() {
        l.y(this.q, this.c0);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.X;
import androidx.media3.exoplayer.n0;

public final class J
implements Runnable {
    public final n0.e c0;
    public final X q;

    public /* synthetic */ J(X x8, n0.e e8) {
        this.q = x8;
        this.c0 = e8;
    }

    @Override
    public final void run() {
        X.c1(this.q, this.c0);
    }
}


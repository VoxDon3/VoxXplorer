/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.n0;

public final class k0
implements Runnable {
    public final K0 c0;
    public final n0 q;

    public /* synthetic */ k0(n0 n02, K0 k02) {
        this.q = n02;
        this.c0 = k02;
    }

    @Override
    public final void run() {
        n0.p(this.q, this.c0);
    }
}


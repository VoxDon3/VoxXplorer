/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.n0;

public final class j0
implements Runnable {
    public final int c0;
    public final boolean d0;
    public final n0 q;

    public /* synthetic */ j0(n0 n02, int n8, boolean bl) {
        this.q = n02;
        this.c0 = n8;
        this.d0 = bl;
    }

    @Override
    public final void run() {
        n0.n(this.q, this.c0, this.d0);
    }
}


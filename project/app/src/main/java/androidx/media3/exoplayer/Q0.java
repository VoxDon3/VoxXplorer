/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.V0;

public final class Q0
implements Runnable {
    public final int c0;
    public final V0 q;

    public /* synthetic */ Q0(V0 v02, int n8) {
        this.q = v02;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        V0.f(this.q, this.c0);
    }
}


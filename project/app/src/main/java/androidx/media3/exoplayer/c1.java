/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.d1;

public final class c1
implements Runnable {
    public final boolean c0;
    public final d1 q;

    public /* synthetic */ c1(d1 d12, boolean bl) {
        this.q = d12;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        d1.b(this.q, this.c0);
    }
}


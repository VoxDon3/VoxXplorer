/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.d1;

public final class b1
implements Runnable {
    public final boolean c0;
    public final boolean d0;
    public final d1 q;

    public /* synthetic */ b1(d1 d12, boolean bl, boolean bl2) {
        this.q = d12;
        this.c0 = bl;
        this.d0 = bl2;
    }

    @Override
    public final void run() {
        d1.a(this.q, this.c0, this.d0);
    }
}


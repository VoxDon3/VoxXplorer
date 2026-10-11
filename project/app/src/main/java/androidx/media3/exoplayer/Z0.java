/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.a1;

public final class Z0
implements Runnable {
    public final boolean c0;
    public final boolean d0;
    public final a1 q;

    public /* synthetic */ Z0(a1 a12, boolean bl, boolean bl2) {
        this.q = a12;
        this.c0 = bl;
        this.d0 = bl2;
    }

    @Override
    public final void run() {
        a1.a(this.q, this.c0, this.d0);
    }
}


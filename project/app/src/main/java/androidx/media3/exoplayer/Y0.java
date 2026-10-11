/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.a1;

public final class Y0
implements Runnable {
    public final boolean c0;
    public final a1 q;

    public /* synthetic */ Y0(a1 a12, boolean bl) {
        this.q = a12;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        a1.b(this.q, this.c0);
    }
}


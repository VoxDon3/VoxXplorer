/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.t0;
import ax.i1.F;
import ax.r7.z;

public final class s0
implements Runnable {
    public final z.a c0;
    public final F.b d0;
    public final t0 q;

    public /* synthetic */ s0(t0 t02, z.a a8, F.b b8) {
        this.q = t02;
        this.c0 = a8;
        this.d0 = b8;
    }

    @Override
    public final void run() {
        t0.a(this.q, this.c0, this.d0);
    }
}


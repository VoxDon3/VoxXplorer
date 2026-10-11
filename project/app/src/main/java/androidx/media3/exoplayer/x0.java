/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.I0;
import ax.i1.B;
import ax.i1.y;

public final class x0
implements Runnable {
    public final Pair c0;
    public final y d0;
    public final B e0;
    public final int f0;
    public final I0.a q;

    public /* synthetic */ x0(I0.a a8, Pair pair, y y8, B b8, int n8) {
        this.q = a8;
        this.c0 = pair;
        this.d0 = y8;
        this.e0 = b8;
        this.f0 = n8;
    }

    @Override
    public final void run() {
        I0.a.H(this.q, this.c0, this.d0, this.e0, this.f0);
    }
}


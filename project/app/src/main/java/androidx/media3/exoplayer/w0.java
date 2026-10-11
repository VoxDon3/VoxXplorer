/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.I0;
import ax.i1.B;

public final class w0
implements Runnable {
    public final Pair c0;
    public final B d0;
    public final I0.a q;

    public /* synthetic */ w0(I0.a a8, Pair pair, B b8) {
        this.q = a8;
        this.c0 = pair;
        this.d0 = b8;
    }

    @Override
    public final void run() {
        I0.a.r(this.q, this.c0, this.d0);
    }
}


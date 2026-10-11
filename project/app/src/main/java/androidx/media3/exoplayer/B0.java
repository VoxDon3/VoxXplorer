/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.I0;

public final class B0
implements Runnable {
    public final Pair c0;
    public final Exception d0;
    public final I0.a q;

    public /* synthetic */ B0(I0.a a8, Pair pair, Exception exception) {
        this.q = a8;
        this.c0 = pair;
        this.d0 = exception;
    }

    @Override
    public final void run() {
        I0.a.E(this.q, this.c0, this.d0);
    }
}


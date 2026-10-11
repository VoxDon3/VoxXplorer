/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.I0;

public final class E0
implements Runnable {
    public final Pair c0;
    public final I0.a q;

    public /* synthetic */ E0(I0.a a8, Pair pair) {
        this.q = a8;
        this.c0 = pair;
    }

    @Override
    public final void run() {
        I0.a.j(this.q, this.c0);
    }
}


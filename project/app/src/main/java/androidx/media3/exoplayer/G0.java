/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.I0;

public final class G0
implements Runnable {
    public final Pair c0;
    public final int d0;
    public final I0.a q;

    public /* synthetic */ G0(I0.a a8, Pair pair, int n8) {
        this.q = a8;
        this.c0 = pair;
        this.d0 = n8;
    }

    @Override
    public final void run() {
        I0.a.a(this.q, this.c0, this.d0);
    }
}


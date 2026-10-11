/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.X;
import ax.Z0.I1;

public final class Y
implements Runnable {
    public final boolean c0;
    public final X d0;
    public final I1 e0;
    public final Context q;

    public /* synthetic */ Y(Context context, boolean bl, X x8, I1 i12) {
        this.q = context;
        this.c0 = bl;
        this.d0 = x8;
        this.e0 = i12;
    }

    @Override
    public final void run() {
        X.b.a(this.q, this.c0, this.d0, this.e0);
    }
}


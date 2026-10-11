/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.l;

public final class o
implements Runnable {
    public final Context c0;
    public final l.b q;

    public /* synthetic */ o(l.b b8, Context context) {
        this.q = b8;
        this.c0 = context;
    }

    @Override
    public final void run() {
        l.b.d(this.q, this.c0);
    }
}


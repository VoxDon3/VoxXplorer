/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.l;

public final class r
implements Runnable {
    public final Context c0;
    public final l.c q;

    public /* synthetic */ r(l.c c8, Context context) {
        this.q = c8;
        this.c0 = context;
    }

    @Override
    public final void run() {
        l.c.e(this.q, this.c0);
    }
}


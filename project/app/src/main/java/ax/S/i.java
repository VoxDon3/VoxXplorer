/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.graphics.Typeface;
import ax.S.h;

public final class i
implements Runnable {
    public final Typeface c0;
    public final h.e q;

    public /* synthetic */ i(h.e e8, Typeface typeface) {
        this.q = e8;
        this.c0 = typeface;
    }

    @Override
    public final void run() {
        h.e.a(this.q, this.c0);
    }
}


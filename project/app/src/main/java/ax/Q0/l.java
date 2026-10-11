/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import android.content.Context;
import ax.Q0.m;
import ax.S0.k;

public final class l
implements Runnable {
    public final k c0;
    public final Context q;

    public /* synthetic */ l(Context context, k k8) {
        this.q = context;
        this.c0 = k8;
    }

    @Override
    public final void run() {
        m.a(this.q, this.c0);
    }
}


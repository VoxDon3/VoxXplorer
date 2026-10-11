/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.content.Context;
import ax.S0.z;

public final class y
implements Runnable {
    public final Context c0;
    public final z q;

    public /* synthetic */ y(z z8, Context context) {
        this.q = z8;
        this.c0 = context;
    }

    @Override
    public final void run() {
        z.a(this.q, this.c0);
    }
}

